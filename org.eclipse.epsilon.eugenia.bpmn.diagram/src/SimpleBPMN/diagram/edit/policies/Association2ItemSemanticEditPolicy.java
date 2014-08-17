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
public class Association2ItemSemanticEditPolicy extends
		SimpleBPMN.diagram.edit.policies.SimpleBPMNBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Association2ItemSemanticEditPolicy() {
		super(
				SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
