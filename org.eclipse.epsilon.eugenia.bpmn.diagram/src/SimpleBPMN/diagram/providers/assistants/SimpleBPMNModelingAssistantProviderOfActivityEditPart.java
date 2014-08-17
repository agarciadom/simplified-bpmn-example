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
public class SimpleBPMNModelingAssistantProviderOfActivityEditPart extends
		SimpleBPMN.diagram.providers.SimpleBPMNModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SimpleBPMN.diagram.edit.parts.ActivityEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			SimpleBPMN.diagram.edit.parts.ActivityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
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
				(SimpleBPMN.diagram.edit.parts.ActivityEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			SimpleBPMN.diagram.edit.parts.ActivityEditPart source,
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
				(SimpleBPMN.diagram.edit.parts.ActivityEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			SimpleBPMN.diagram.edit.parts.ActivityEditPart source,
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
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
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
		return doGetRelTypesOnTarget((SimpleBPMN.diagram.edit.parts.ActivityEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			SimpleBPMN.diagram.edit.parts.ActivityEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
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
				(SimpleBPMN.diagram.edit.parts.ActivityEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			SimpleBPMN.diagram.edit.parts.ActivityEditPart target,
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
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
		} else if (relationshipType == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003) {
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
			types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
		}
		return types;
	}

}
