/*
 * 
 */
package SimpleBPMN.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class BusinessProcessDiagramItemSemanticEditPolicy extends
		SimpleBPMN.diagram.edit.policies.SimpleBPMNBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessProcessDiagramItemSemanticEditPolicy() {
		super(
				SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.BusinessProcessDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.XORCreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.ORCreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.ANDCreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_2004 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.LaneCreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_2005 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.PoolCreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.StartEventCreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.IntermediateEventCreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.EndEventCreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.ActivityCreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.DataObject_2008 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.DataObjectCreateCommand(
					req));
		}
		if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_2009 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleBPMN.diagram.edit.commands.GroupCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
