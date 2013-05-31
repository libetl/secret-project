package org.cylio.project.domain.editor.diagram.edit.policies;

import org.cylio.project.domain.editor.diagram.providers.TestElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class Area2ItemSemanticEditPolicy extends TestBaseItemSemanticEditPolicy {

  /**
   * @generated
   */
  public Area2ItemSemanticEditPolicy () {
    super (TestElementTypes.Area_4001);
  }

  /**
   * @generated
   */
  protected Command getDestroyElementCommand (DestroyElementRequest req) {
    return getGEFWrapper (new DestroyElementCommand (req));
  }

}
