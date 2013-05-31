package org.cylio.project.domain.editor.diagram.preferences;

import org.cylio.project.domain.editor.diagram.part.TestDiagramEditorPlugin;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

  /**
   * @generated
   */
  public void initializeDefaultPreferences () {
    IPreferenceStore store = getPreferenceStore ();
    DiagramGeneralPreferencePage.initDefaults (store);
    DiagramAppearancePreferencePage.initDefaults (store);
    DiagramConnectionsPreferencePage.initDefaults (store);
    DiagramPrintingPreferencePage.initDefaults (store);
    DiagramRulersAndGridPreferencePage.initDefaults (store);

  }

  /**
   * @generated
   */
  protected IPreferenceStore getPreferenceStore () {
    return TestDiagramEditorPlugin.getInstance ().getPreferenceStore ();
  }
}
