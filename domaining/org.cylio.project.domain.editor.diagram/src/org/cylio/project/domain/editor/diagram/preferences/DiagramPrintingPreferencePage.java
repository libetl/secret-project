package org.cylio.project.domain.editor.diagram.preferences;

import org.cylio.project.domain.editor.diagram.part.TestDiagramEditorPlugin;
import org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage;

/**
 * @generated
 */
public class DiagramPrintingPreferencePage extends PrintingPreferencePage {

  /**
   * @generated
   */
  public DiagramPrintingPreferencePage () {
    setPreferenceStore (TestDiagramEditorPlugin.getInstance ()
        .getPreferenceStore ());
  }
}
