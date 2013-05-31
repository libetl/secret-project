package org.cylio.project.domain.editor.diagram.part;

import org.cylio.project.domain.editor.diagram.application.WizardNewFileCreationPage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;

/**
 * @generated
 */
public class TestCreationWizardPage extends WizardNewFileCreationPage {

  /**
   * @generated
   */
  private final String fileExtension;

  /**
   * @generated
   */
  public TestCreationWizardPage (String pageName,
      IStructuredSelection selection, String fileExtension) {
    super (pageName, selection);
    this.fileExtension = fileExtension;
  }

  /**
   * Override to create files with this extension.
   * 
   * @generated
   */
  protected String getExtension () {
    return fileExtension;
  }

  /**
   * @generated
   */
  public URI getURI () {
    return URI.createFileURI (getFilePath ().toString ());
  }

  /**
   * @generated
   */
  public void createControl (Composite parent) {
    super.createControl (parent);
    setFileName (TestDiagramEditorUtil.getUniqueFileName (
        getContainerFullPath (), getFileName (), getExtension ()));
    setPageComplete (validatePage ());
  }

  /**
   * @generated
   */
  protected boolean validatePage () {
    if (!super.validatePage ()) { return false; }
    String extension = getExtension ();
    if (extension != null
        && !getFilePath ().toString ().endsWith ("." + extension)) {
      setErrorMessage (NLS.bind (Messages.TestCreationWizardPageExtensionError,
          extension));
      return false;
    }
    return true;
  }
}
