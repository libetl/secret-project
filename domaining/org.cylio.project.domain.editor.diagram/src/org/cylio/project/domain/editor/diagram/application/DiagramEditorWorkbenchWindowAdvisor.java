package org.cylio.project.domain.editor.diagram.application;

import org.cylio.project.domain.editor.diagram.part.Messages;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * @generated
 */
public class DiagramEditorWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

  /**
   * @generated
   */
  public DiagramEditorWorkbenchWindowAdvisor (
      IWorkbenchWindowConfigurer configurer) {
    super (configurer);
  }

  /**
   * @generated
   */
  public ActionBarAdvisor createActionBarAdvisor (
      IActionBarConfigurer configurer) {
    return new DiagramEditorActionBarAdvisor (configurer);
  }

  /**
   * @generated
   */
  public void preWindowOpen () {
    IWorkbenchWindowConfigurer configurer = getWindowConfigurer ();
    configurer.setInitialSize (new Point (1000, 700));
    configurer.setTitle (Messages.DiagramEditorWorkbenchWindowAdvisor_Title);
  }

}
