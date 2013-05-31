package org.cylio.project.domain.editor.diagram.preferences;

import org.cylio.project.domain.editor.diagram.part.TestDiagramEditorPlugin;
import org.eclipse.gmf.runtime.diagram.ui.preferences.RulerGridPreferencePage;

/**
 * @generated
 */
public class DiagramRulersAndGridPreferencePage extends RulerGridPreferencePage {

  /**
   * @generated
   */
  public DiagramRulersAndGridPreferencePage () {
    setPreferenceStore (TestDiagramEditorPlugin.getInstance ()
        .getPreferenceStore ());
  }
}
