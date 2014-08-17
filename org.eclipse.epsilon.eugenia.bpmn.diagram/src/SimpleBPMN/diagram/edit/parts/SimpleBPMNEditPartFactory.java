/*
 * 
 */
package SimpleBPMN.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class SimpleBPMNEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(view)) {

			case SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.XOREditPart(view);

			case SimpleBPMN.diagram.edit.parts.XORNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.XORNameEditPart(view);

			case SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.OREditPart(view);

			case SimpleBPMN.diagram.edit.parts.ORNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.ORNameEditPart(view);

			case SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.ANDEditPart(view);

			case SimpleBPMN.diagram.edit.parts.ANDNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.ANDNameEditPart(view);

			case SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.LaneEditPart(view);

			case SimpleBPMN.diagram.edit.parts.LaneNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.LaneNameEditPart(view);

			case SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.PoolEditPart(view);

			case SimpleBPMN.diagram.edit.parts.PoolNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.PoolNameEditPart(view);

			case SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.StartEventEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.StartEventNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.StartEventNameEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.IntermediateEventNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.IntermediateEventNameEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.EndEventEditPart(view);

			case SimpleBPMN.diagram.edit.parts.EndEventNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.EndEventNameEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.ActivityEditPart(view);

			case SimpleBPMN.diagram.edit.parts.ActivityNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.ActivityNameEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.DataObjectEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.DataObjectNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.DataObjectNameEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.GroupEditPart(view);

			case SimpleBPMN.diagram.edit.parts.GroupNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.GroupNameEditPart(view);

			case SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.XOR2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.XORName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.XORName2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.OR2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.ORName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.ORName2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.AND2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.ANDName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.ANDName2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.Lane2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.Lane2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.LaneName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.LaneName2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.Pool2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.Pool2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.PoolName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.PoolName2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.StartEvent2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.StartEventName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.StartEventName2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.IntermediateEventName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.IntermediateEventName2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.EndEvent2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.EndEventName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.EndEventName2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.Activity2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.ActivityName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.ActivityName2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.DataObject2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.DataObject2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.DataObjectName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.DataObjectName2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.Group2EditPart(view);

			case SimpleBPMN.diagram.edit.parts.GroupName2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.GroupName2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.MessageFlowEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.MessageFlowNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.MessageFlowNameEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.SequenceFlowNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.SequenceFlowNameEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.AssociationEditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.Association2EditPart(
						view);

			case SimpleBPMN.diagram.edit.parts.AssociationNameEditPart.VISUAL_ID:
				return new SimpleBPMN.diagram.edit.parts.AssociationNameEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
