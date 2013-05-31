package org.cylio.project.domain.editor.diagram.part;

import java.io.IOException;
import java.util.LinkedList;

import org.cylio.project.domain.editor.diagram.application.WizardNewFileCreationPage;
import org.cylio.project.domain.editor.diagram.edit.parts.InformationSystemEditPart;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class TestNewDiagramFileWizard extends Wizard {

  /**
   * @generated
   */
  private WizardNewFileCreationPage  myFileCreationPage;

  /**
   * @generated
   */
  private ModelElementSelectionPage  diagramRootElementSelectionPage;

  /**
   * @generated
   */
  private TransactionalEditingDomain myEditingDomain;

  /**
   * @generated
   */
  public TestNewDiagramFileWizard (URI domainModelURI, EObject diagramRoot,
      TransactionalEditingDomain editingDomain) {
    assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
    assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
    assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

    myFileCreationPage = new WizardNewFileCreationPage (
        Messages.TestNewDiagramFileWizard_CreationPageName,
        StructuredSelection.EMPTY);
    myFileCreationPage
        .setTitle (Messages.TestNewDiagramFileWizard_CreationPageTitle);
    myFileCreationPage.setDescription (NLS.bind (
        Messages.TestNewDiagramFileWizard_CreationPageDescription,
        InformationSystemEditPart.MODEL_ID));
    IPath filePath;
    String fileName = URI.decode (domainModelURI.trimFileExtension ()
        .lastSegment ());
    if (domainModelURI.isPlatformResource ()) {
      filePath = new Path (domainModelURI.trimSegments (1).toPlatformString (
          true));
    } else if (domainModelURI.isFile ()) {
      filePath = new Path (domainModelURI.trimSegments (1).toFileString ());
    } else {
      // TODO : use some default path
      throw new IllegalArgumentException ("Unsupported URI: " + domainModelURI); //$NON-NLS-1$
    }
    myFileCreationPage.setContainerFullPath (filePath);
    myFileCreationPage.setFileName (TestDiagramEditorUtil.getUniqueFileName (
        filePath, fileName, "editor_diagram")); //$NON-NLS-1$

    diagramRootElementSelectionPage = new DiagramRootElementSelectionPage (
        Messages.TestNewDiagramFileWizard_RootSelectionPageName);
    diagramRootElementSelectionPage
        .setTitle (Messages.TestNewDiagramFileWizard_RootSelectionPageTitle);
    diagramRootElementSelectionPage
        .setDescription (Messages.TestNewDiagramFileWizard_RootSelectionPageDescription);
    diagramRootElementSelectionPage.setModelElement (diagramRoot);

    myEditingDomain = editingDomain;
  }

  /**
   * @generated
   */
  public void addPages () {
    addPage (myFileCreationPage);
    addPage (diagramRootElementSelectionPage);
  }

  /**
   * @generated
   */
  public boolean performFinish () {
    LinkedList<IFile> affectedFiles = new LinkedList<IFile> ();
    IPath diagramModelPath = myFileCreationPage.getContainerFullPath ().append (
        myFileCreationPage.getFileName ());
    URI diagramModelURI = URI.createFileURI (diagramModelPath.toString ());
    ResourceSet resourceSet = myEditingDomain.getResourceSet ();
    final Resource diagramResource = resourceSet
        .createResource (diagramModelURI);
    AbstractTransactionalCommand command = new AbstractTransactionalCommand (
        myEditingDomain, Messages.TestNewDiagramFileWizard_InitDiagramCommand,
        affectedFiles) {

      protected CommandResult doExecuteWithResult (IProgressMonitor monitor,
          IAdaptable info) throws ExecutionException {
        int diagramVID = TestVisualIDRegistry
            .getDiagramVisualID (diagramRootElementSelectionPage
                .getModelElement ());
        if (diagramVID != InformationSystemEditPart.VISUAL_ID) { return CommandResult
            .newErrorCommandResult (Messages.TestNewDiagramFileWizard_IncorrectRootError); }
        Diagram diagram = ViewService.createDiagram (
            diagramRootElementSelectionPage.getModelElement (),
            InformationSystemEditPart.MODEL_ID,
            TestDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
        diagramResource.getContents ().add (diagram);
        return CommandResult.newOKCommandResult ();
      }
    };
    try {
      OperationHistoryFactory.getOperationHistory ().execute (command,
          new NullProgressMonitor (), null);
      diagramResource.save (TestDiagramEditorUtil.getSaveOptions ());
      TestDiagramEditorUtil.openDiagram (diagramResource);
    } catch (ExecutionException e) {
      TestDiagramEditorPlugin.getInstance ().logError (
          "Unable to create model and diagram", e); //$NON-NLS-1$
    } catch (IOException ex) {
      TestDiagramEditorPlugin.getInstance ().logError (
          "Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
    } catch (PartInitException ex) {
      TestDiagramEditorPlugin.getInstance ().logError (
          "Unable to open editor", ex); //$NON-NLS-1$
    }
    return true;
  }

  /**
   * @generated
   */
  private static class DiagramRootElementSelectionPage extends
      ModelElementSelectionPage {

    /**
     * @generated
     */
    protected DiagramRootElementSelectionPage (String pageName) {
      super (pageName);
    }

    /**
     * @generated
     */
    protected String getSelectionTitle () {
      return Messages.TestNewDiagramFileWizard_RootSelectionPageSelectionTitle;
    }

    /**
     * @generated
     */
    protected boolean validatePage () {
      if (selectedModelElement == null) {
        setErrorMessage (Messages.TestNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
        return false;
      }
      boolean result = ViewService.getInstance ().provides (
          new CreateDiagramViewOperation (new EObjectAdapter (
              selectedModelElement), InformationSystemEditPart.MODEL_ID,
              TestDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
      setErrorMessage (result ? null
          : Messages.TestNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
      return result;
    }
  }
}
