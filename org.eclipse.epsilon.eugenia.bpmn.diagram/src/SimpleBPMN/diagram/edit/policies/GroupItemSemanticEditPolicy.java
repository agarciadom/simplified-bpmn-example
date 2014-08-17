/*
 * 
 */
package SimpleBPMN.diagram.edit.policies;

import java.util.Iterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GroupItemSemanticEditPolicy extends
		SimpleBPMN.diagram.edit.policies.SimpleBPMNBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GroupItemSemanticEditPolicy() {
		super(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_2009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(node)) {
			case SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getVisualID(cnode)) {
					case SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SimpleBPMN.diagram.edit.parts.Lane2EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SimpleBPMN.diagram.edit.parts.Pool2EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(incomingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
									.getVisualID(outgoingLink) == SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SimpleBPMN.diagram.edit.parts.DataObject2EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

}
