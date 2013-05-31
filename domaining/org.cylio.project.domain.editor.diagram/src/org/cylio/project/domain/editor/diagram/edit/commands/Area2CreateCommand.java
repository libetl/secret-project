package org.cylio.project.domain.editor.diagram.edit.commands;

import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class Area2CreateCommand extends org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {
	
	/**
 * @generated
 */
	private final EObject source;

	/**
 * @generated
 */
	private final EObject target;


	/**
 * @generated
 */
	private final org.cylio.project.domain.editor.SubDomain container;

	/**
 * @generated
 */
	public Area2CreateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
			this.source = source;
	this.target = target;
	container = deduceContainer(source, target);
	}
	
	/**
 * @generated
 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null) {
			return false;
		}
		if (target != null) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
			if (getContainer() == null) {
		return false;
	}
	return org.cylio.project.domain.editor.diagram.edit.policies.TestBaseItemSemanticEditPolicy.getLinkConstraints().canCreateArea_4001(getContainer(), getSource(), getTarget());
	}

	
  /**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
		if (!canExecute()) {
			throw new org.eclipse.core.commands.ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}
		
		org.cylio.project.domain.editor.Area newElement = org.cylio.project.domain.editor.EditorFactory.eINSTANCE.createArea();
		getContainer().getSubDomains().add(newElement);					newElement.setName(getSource().toString ());				newElement.setName(getTarget().toString ());						doConfigure(newElement, monitor, info);
		((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).setNewElement(newElement);
		return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(newElement);

	}

 /**
 * @generated
 */
	protected void doConfigure(org.cylio.project.domain.editor.Area newElement, org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = ((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).getElementType();
		org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest configureRequest = new org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest.TARGET, getTarget());
		org.eclipse.gmf.runtime.common.core.command.ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
 * @generated
 */
	protected void setElementToEdit(org.eclipse.emf.ecore.EObject element) {
		throw new UnsupportedOperationException();
	}
	
	/**
 * @generated
 */
	protected EObject getSource() {
		return this.source;
	}

	/**
 * @generated
 */
	protected EObject getTarget() {
		return this.target;
	}
	
	/**
 * @generated
 */
	public org.cylio.project.domain.editor.SubDomain getContainer() {
		return container;
	}

	/**
 * Default approach is to traverse ancestors of the source to find instance of container.
 * Modify with appropriate logic.
 * @generated
 */
	private static org.cylio.project.domain.editor.SubDomain deduceContainer(EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof org.cylio.project.domain.editor.SubDomain) {
				return (org.cylio.project.domain.editor.SubDomain) element;
			}
		}
		return null;
	}

}
