package org.cylio.project.domain.editor.diagram.edit.commands;

import org.cylio.project.domain.editor.Domain;

/**
 * @generated
 */
public class AreaReorientCommand extends org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {

	/**
 * @generated
 */
	private final int reorientDirection;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject oldEnd;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject newEnd;

	/**
 * @generated
 */
	public AreaReorientCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}
	
	/**
 * @generated
 */
	public boolean canExecute() {
			if (false == getElementToEdit() instanceof org.cylio.project.domain.editor.Area) {
		return false;
	}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
 * @generated
 */
	protected boolean canReorientSource() {
				
			if (!(getLink().eContainer() instanceof org.cylio.project.domain.editor.SubDomain)) {
		return false;
	}
	org.cylio.project.domain.editor.SubDomain container = (org.cylio.project.domain.editor.SubDomain) getLink().eContainer();
	return org.cylio.project.domain.editor.diagram.edit.policies.TestBaseItemSemanticEditPolicy.getLinkConstraints().canExistArea_4001(container, getLink(), null, null);
	}

	/**
 * @generated
 */
	protected boolean canReorientTarget() {
				if (!(getLink().eContainer() instanceof org.cylio.project.domain.editor.SubDomain)) {
		return false;
	}
	org.cylio.project.domain.editor.SubDomain container = (org.cylio.project.domain.editor.SubDomain) getLink().eContainer();
	return org.cylio.project.domain.editor.diagram.edit.policies.TestBaseItemSemanticEditPolicy.getLinkConstraints().canExistArea_4001(container, getLink(), null, null);
	}
	
	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(
			org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info)
			throws org.eclipse.core.commands.ExecutionException {
		if (!canExecute()) {
			throw new org.eclipse.core.commands.ExecutionException("Invalid arguments in reorient link command");  //$NON-NLS-1$
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientSource() throws org.eclipse.core.commands.ExecutionException {
				getLink().setName(getNewSource());
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(getLink());
	}

	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientTarget() throws org.eclipse.core.commands.ExecutionException {
				getLink().setName(getNewTarget());
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(getLink());
	}
		
	/**
 * @generated
 */
	protected org.cylio.project.domain.editor.Area getLink() {
		return (org.cylio.project.domain.editor.Area) getElementToEdit();
	}
	
	/**
 * @generated
 */
	protected String getOldSource() {
		return "";
	}
	
	/**
 * @generated
 */
	protected String getNewSource() {
		return "";
	}
	
	/**
 * @generated
 */
	protected String getOldTarget() {
		return "";
	}
	
	/**
 * @generated
 */
	protected String getNewTarget() {
		return "";
	}
}
