package org.cylio.project.domain.editor.diagram.edit.policies;

import org.cylio.project.domain.editor.diagram.edit.commands.AreaCreateCommand;
import org.cylio.project.domain.editor.diagram.edit.commands.SubDomainCreateCommand;
import org.cylio.project.domain.editor.diagram.providers.TestElementTypes;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class InformationSystemItemSemanticEditPolicy extends
    TestBaseItemSemanticEditPolicy {

  /**
   * @generated
   */
  public InformationSystemItemSemanticEditPolicy () {
    super (TestElementTypes.InformationSystem_1000);
  }

  /**
   * @generated
   */
  protected Command getCreateCommand (CreateElementRequest req) {
    if (TestElementTypes.SubDomain_2001 == req.getElementType ()) { return getGEFWrapper (new SubDomainCreateCommand (
        req)); }
    if (TestElementTypes.Area_2002 == req.getElementType ()) { return getGEFWrapper (new AreaCreateCommand (
        req)); }
    return super.getCreateCommand (req);
  }

  /**
   * @generated
   */
  protected Command getDuplicateCommand (DuplicateElementsRequest req) {
    TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost ())
        .getEditingDomain ();
    return getGEFWrapper (new DuplicateAnythingCommand (editingDomain, req));
  }

  /**
   * @generated
   */
  private static class DuplicateAnythingCommand extends
      DuplicateEObjectsCommand {

    /**
     * @generated
     */
    public DuplicateAnythingCommand (TransactionalEditingDomain editingDomain,
        DuplicateElementsRequest req) {
      super (editingDomain, req.getLabel (), req.getElementsToBeDuplicated (),
          req.getAllDuplicatedElementsMap ());
    }

  }

}
