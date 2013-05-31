package org.cylio.project.domain.editor.diagram.edit.policies;

import org.cylio.project.domain.editor.diagram.providers.TestElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class SubDomain2ItemSemanticEditPolicy extends
    TestBaseItemSemanticEditPolicy {

  /**
   * @generated
   */
  public SubDomain2ItemSemanticEditPolicy () {
    super (TestElementTypes.SubDomain_4002);
  }

  /**
   * @generated
   */
  protected Command getDestroyElementCommand (DestroyElementRequest req) {
    return getGEFWrapper (new DestroyElementCommand (req));
  }

}
