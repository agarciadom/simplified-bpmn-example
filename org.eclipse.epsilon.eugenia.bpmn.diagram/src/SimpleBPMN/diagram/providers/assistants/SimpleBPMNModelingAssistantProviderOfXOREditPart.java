/*
 * 
 */
package SimpleBPMN.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class SimpleBPMNModelingAssistantProviderOfXOREditPart extends
		SimpleBPMN.diagram.providers.SimpleBPMNModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SimpleBPMN.diagram.edit.parts.XOREditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			SimpleBPMN.diagram.edit.parts.XOREditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(SimpleBPMN.diagram.edit.parts.XOREditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			SimpleBPMN.diagram.edit.parts.XOREditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ANDEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ActivityEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.AND2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.Activity2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ANDEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ActivityEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.AND2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.Activity2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ANDEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ActivityEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.AND2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.Activity2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ANDEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ActivityEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.AND2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.Activity2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ANDEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ActivityEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.AND2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.Activity2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OREditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ANDEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEventEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.ActivityEditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.XOR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.OR2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.AND2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.StartEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.EndEvent2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		if (targetEditPart instanceof SimpleBPMN.diagram.edit.parts.Activity2EditPart) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(SimpleBPMN.diagram.edit.parts.XOREditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			SimpleBPMN.diagram.edit.parts.XOREditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((SimpleBPMN.diagram.edit.parts.XOREditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			SimpleBPMN.diagram.edit.parts.XOREditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(SimpleBPMN.diagram.edit.parts.XOREditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			SimpleBPMN.diagram.edit.parts.XOREditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		}
		return types;
	}

}
