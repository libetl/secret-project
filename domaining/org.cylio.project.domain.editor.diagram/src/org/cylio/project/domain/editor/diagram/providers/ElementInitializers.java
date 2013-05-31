package org.cylio.project.domain.editor.diagram.providers;

import org.cylio.project.domain.editor.diagram.part.TestDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

  protected ElementInitializers () {
    // use #getInstance to access cached instance
  }

  /**
   * @generated
   */
  public static ElementInitializers getInstance () {
    ElementInitializers cached = TestDiagramEditorPlugin.getInstance ()
        .getElementInitializers ();
    if (cached == null) {
      TestDiagramEditorPlugin.getInstance ().setElementInitializers (
          cached = new ElementInitializers ());
    }
    return cached;
  }
}
