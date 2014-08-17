/*
 * 
 */
package SimpleBPMN.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class MessageFlow2ItemSemanticEditPolicy extends
		SimpleBPMN.diagram.edit.policies.SimpleBPMNBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageFlow2ItemSemanticEditPolicy() {
		super(
				SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
