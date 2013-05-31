package org.cylio.project.domain.editor.diagram.part;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.ui.IEditorInput;

/**
 * @generated
 */
public class TestDiagramEditor extends DiagramDocumentEditor {

  /**
   * @generated
   */
  public static final String ID         = "org.cylio.project.domain.editor.diagram.part.TestDiagramEditorID"; //$NON-NLS-1$

  /**
   * @generated
   */
  public static final String CONTEXT_ID = "org.cylio.project.domain.editor.diagram.ui.diagramContext";       //$NON-NLS-1$

  /**
   * @generated
   */
  public TestDiagramEditor () {
    super (true);
  }

  /**
   * @generated
   */
  protected String getContextID () {
    return CONTEXT_ID;
  }

  /**
   * @generated
   */
  protected PaletteRoot createPaletteRoot (PaletteRoot existingPaletteRoot) {
    PaletteRoot root = super.createPaletteRoot (existingPaletteRoot);
    new TestPaletteFactory ().fillPalette (root);
    return root;
  }

  /**
   * @generated
   */
  protected PreferencesHint getPreferencesHint () {
    return TestDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
  }

  /**
   * @generated
   */
  public String getContributorId () {
    return TestDiagramEditorPlugin.ID;
  }

  /**
   * @generated
   */
  protected IDocumentProvider getDocumentProvider (IEditorInput input) {
    if (input instanceof URIEditorInput) { return TestDiagramEditorPlugin
        .getInstance ().getDocumentProvider (); }
    return super.getDocumentProvider (input);
  }

  /**
   * @generated
   */
  public TransactionalEditingDomain getEditingDomain () {
    IDocument document = getEditorInput () != null ? getDocumentProvider ()
        .getDocument (getEditorInput ()) : null;
    if (document instanceof IDiagramDocument) { return ((IDiagramDocument) document)
        .getEditingDomain (); }
    return super.getEditingDomain ();
  }

  /**
   * @generated
   */
  protected void setDocumentProvider (IEditorInput input) {
    if (input instanceof URIEditorInput) {
      setDocumentProvider (TestDiagramEditorPlugin.getInstance ()
          .getDocumentProvider ());
    } else {
      super.setDocumentProvider (input);
    }
  }

  /**
   * @generated
   */
  protected void configureGraphicalViewer () {
    super.configureGraphicalViewer ();
    DiagramEditorContextMenuProvider provider = new DiagramEditorContextMenuProvider (
        this, getDiagramGraphicalViewer ());
    getDiagramGraphicalViewer ().setContextMenu (provider);
    getSite ().registerContextMenu (ActionIds.DIAGRAM_EDITOR_CONTEXT_MENU,
        provider, getDiagramGraphicalViewer ());
  }

}
