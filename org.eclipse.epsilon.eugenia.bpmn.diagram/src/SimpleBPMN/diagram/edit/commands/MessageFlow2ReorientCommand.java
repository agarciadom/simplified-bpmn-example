/*
 * 
 */
package SimpleBPMN.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class MessageFlow2ReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public MessageFlow2ReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof SimpleBPMN.MessageFlow) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof SimpleBPMN.FlowObject && newEnd instanceof SimpleBPMN.FlowObject)) {
			return false;
		}
		SimpleBPMN.FlowObject target = getLink().getTo();
		if (!(getLink().eContainer() instanceof SimpleBPMN.Group)) {
			return false;
		}
		SimpleBPMN.Group container = (SimpleBPMN.Group) getLink().eContainer();
		return SimpleBPMN.diagram.edit.policies.SimpleBPMNBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistMessageFlow_4004(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof SimpleBPMN.FlowObject && newEnd instanceof SimpleBPMN.FlowObject)) {
			return false;
		}
		SimpleBPMN.FlowObject source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof SimpleBPMN.Group)) {
			return false;
		}
		SimpleBPMN.Group container = (SimpleBPMN.Group) getLink().eContainer();
		return SimpleBPMN.diagram.edit.policies.SimpleBPMNBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistMessageFlow_4004(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setFrom(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected SimpleBPMN.MessageFlow getLink() {
		return (SimpleBPMN.MessageFlow) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected SimpleBPMN.FlowObject getOldSource() {
		return (SimpleBPMN.FlowObject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SimpleBPMN.FlowObject getNewSource() {
		return (SimpleBPMN.FlowObject) newEnd;
	}

	/**
	 * @generated
	 */
	protected SimpleBPMN.FlowObject getOldTarget() {
		return (SimpleBPMN.FlowObject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SimpleBPMN.FlowObject getNewTarget() {
		return (SimpleBPMN.FlowObject) newEnd;
	}
}
