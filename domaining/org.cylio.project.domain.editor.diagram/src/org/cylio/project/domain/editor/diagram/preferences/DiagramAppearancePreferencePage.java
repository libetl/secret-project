package org.cylio.project.domain.editor.diagram.preferences;

import org.cylio.project.domain.editor.diagram.part.TestDiagramEditorPlugin;
import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;

/**
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

  /**
   * @generated
   */
  public DiagramAppearancePreferencePage () {
    setPreferenceStore (TestDiagramEditorPlugin.getInstance ()
        .getPreferenceStore ());
  }
}
