package org.cylio.project.domain.editor.diagram.preferences;

import org.cylio.project.domain.editor.diagram.part.TestDiagramEditorPlugin;
import org.eclipse.gmf.runtime.diagram.ui.preferences.DiagramsPreferencePage;

/**
 * @generated
 */
public class DiagramGeneralPreferencePage extends DiagramsPreferencePage {

  /**
   * @generated
   */
  public DiagramGeneralPreferencePage () {
    setPreferenceStore (TestDiagramEditorPlugin.getInstance ()
        .getPreferenceStore ());
  }
}
