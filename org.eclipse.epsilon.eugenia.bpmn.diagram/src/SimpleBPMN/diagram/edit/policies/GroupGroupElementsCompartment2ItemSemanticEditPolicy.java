/*
 * 
 */
package SimpleBPMN.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class GroupGroupElementsCompartment2ItemSemanticEditPolicy extends
		SimpleBPMN.diagram.edit.policies.SimpleBPMNBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GroupGroupElementsCompartment2ItemSemanticEditPolicy() {
		super(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.XOR2CreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.OR2CreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.AND2CreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_3004 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.Lane2CreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_3005 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.Pool2CreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.StartEvent2CreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.IntermediateEvent2CreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.EndEvent2CreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.Activity2CreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.DataObject_3010 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.DataObject2CreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_3011 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.Group2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
