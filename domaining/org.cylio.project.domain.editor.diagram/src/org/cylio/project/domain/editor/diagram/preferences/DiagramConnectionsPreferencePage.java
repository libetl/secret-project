package org.cylio.project.domain.editor.diagram.preferences;

import org.cylio.project.domain.editor.diagram.part.TestDiagramEditorPlugin;
import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

  /**
   * @generated
   */
  public DiagramConnectionsPreferencePage () {
    setPreferenceStore (TestDiagramEditorPlugin.getInstance ()
        .getPreferenceStore ());
  }
}
