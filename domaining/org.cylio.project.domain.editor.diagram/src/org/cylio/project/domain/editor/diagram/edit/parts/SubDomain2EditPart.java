package org.cylio.project.domain.editor.diagram.edit.parts;

import org.cylio.project.domain.editor.diagram.edit.policies.SubDomain2ItemSemanticEditPolicy;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SubDomain2EditPart extends ConnectionNodeEditPart implements
    ITreeBranchEditPart {

  /**
   * @generated
   */
  public static final int VISUAL_ID = 4002;

  /**
   * @generated
   */
  public SubDomain2EditPart (View view) {
    super (view);
  }

  /**
   * @generated
   */
  protected void createDefaultEditPolicies () {
    super.createDefaultEditPolicies ();
    installEditPolicy (EditPolicyRoles.SEMANTIC_ROLE,
        new SubDomain2ItemSemanticEditPolicy ());
  }

  /**
   * @generated
   */
  protected boolean addFixedChild (EditPart childEditPart) {
    if (childEditPart instanceof SubDomainName2EditPart) {
      ((SubDomainName2EditPart) childEditPart).setLabel (getPrimaryShape ()
          .getFigureSubDomainNameFigure ());
      return true;
    }
    return false;
  }

  /**
   * @generated
   */
  protected void addChildVisual (EditPart childEditPart, int index) {
    if (addFixedChild (childEditPart)) { return; }
    super.addChildVisual (childEditPart, index);
  }

  /**
   * @generated
   */
  protected boolean removeFixedChild (EditPart childEditPart) {
    if (childEditPart instanceof SubDomainName2EditPart) { return true; }
    return false;
  }

  /**
   * @generated
   */
  protected void removeChildVisual (EditPart childEditPart) {
    if (removeFixedChild (childEditPart)) { return; }
    super.removeChildVisual (childEditPart);
  }

  /**
   * Creates figure for this edit part.
   * 
   * Body of this method does not depend on settings in generation model
   * so you may safely remove <i>generated</i> tag and modify it.
   * 
   * @generated
   */

  protected Connection createConnectionFigure () {
    return new SubDomainSubDomainsFigure ();
  }

  /**
   * @generated
   */
  public SubDomainSubDomainsFigure getPrimaryShape () {
    return (SubDomainSubDomainsFigure) getFigure ();
  }

  /**
   * @generated
   */
  public class SubDomainSubDomainsFigure extends PolylineConnectionEx {

    /**
     * @generated
     */
    public SubDomainSubDomainsFigure () {

      setTargetDecoration (createTargetDecoration ());
    }

    public WrappingLabel getFigureSubDomainNameFigure () {
      return new WrappingLabel ();
    }

    /**
     * @generated
     */
    private RotatableDecoration createTargetDecoration () {
      PolylineDecoration df = new PolylineDecoration ();
      return df;
    }

  }

}
