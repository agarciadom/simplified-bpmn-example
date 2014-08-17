/*
 * 
 */
package SimpleBPMN.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ANDItemSemanticEditPolicy extends
		SimpleBPMN.diagram.edit.policies.SimpleBPMNBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ANDItemSemanticEditPolicy() {
		super(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.MessageFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.MessageFlow2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.SequenceFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.SequenceFlow2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.AssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.Association2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.MessageFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.MessageFlow2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.SequenceFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.SequenceFlow2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.AssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.Association2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.MessageFlowReorientCommand(
					req));
		case SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID:
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.MessageFlow2ReorientCommand(
					req));
		case SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.SequenceFlowReorientCommand(
					req));
		case SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID:
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.SequenceFlow2ReorientCommand(
					req));
		case SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.AssociationReorientCommand(
					req));
		case SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID:
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.Association2ReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
