/*
 * 
 */
package SimpleBPMN.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SimpleBPMNParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser xORName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getXORName_5001Parser() {
		if (xORName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			xORName_5001Parser = parser;
		}
		return xORName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser oRName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getORName_5002Parser() {
		if (oRName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			oRName_5002Parser = parser;
		}
		return oRName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser aNDName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getANDName_5003Parser() {
		if (aNDName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			aNDName_5003Parser = parser;
		}
		return aNDName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser laneName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getLaneName_5004Parser() {
		if (laneName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			laneName_5004Parser = parser;
		}
		return laneName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser poolName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getPoolName_5005Parser() {
		if (poolName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			poolName_5005Parser = parser;
		}
		return poolName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser startEventName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getStartEventName_5011Parser() {
		if (startEventName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			startEventName_5011Parser = parser;
		}
		return startEventName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser intermediateEventName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getIntermediateEventName_5012Parser() {
		if (intermediateEventName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			intermediateEventName_5012Parser = parser;
		}
		return intermediateEventName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser endEventName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getEndEventName_5013Parser() {
		if (endEventName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			endEventName_5013Parser = parser;
		}
		return endEventName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getActivityName_5007Parser() {
		if (activityName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			activityName_5007Parser = parser;
		}
		return activityName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataObjectName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getDataObjectName_5008Parser() {
		if (dataObjectName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			dataObjectName_5008Parser = parser;
		}
		return dataObjectName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getGroupName_5009Parser() {
		if (groupName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			groupName_5009Parser = parser;
		}
		return groupName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser xORName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getXORName_5014Parser() {
		if (xORName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			xORName_5014Parser = parser;
		}
		return xORName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser oRName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getORName_5015Parser() {
		if (oRName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			oRName_5015Parser = parser;
		}
		return oRName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser aNDName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getANDName_5016Parser() {
		if (aNDName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			aNDName_5016Parser = parser;
		}
		return aNDName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser laneName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getLaneName_5017Parser() {
		if (laneName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			laneName_5017Parser = parser;
		}
		return laneName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser poolName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getPoolName_5018Parser() {
		if (poolName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			poolName_5018Parser = parser;
		}
		return poolName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser startEventName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getStartEventName_5019Parser() {
		if (startEventName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			startEventName_5019Parser = parser;
		}
		return startEventName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser intermediateEventName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getIntermediateEventName_5020Parser() {
		if (intermediateEventName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			intermediateEventName_5020Parser = parser;
		}
		return intermediateEventName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser endEventName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getEndEventName_5021Parser() {
		if (endEventName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			endEventName_5021Parser = parser;
		}
		return endEventName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getActivityName_5022Parser() {
		if (activityName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			activityName_5022Parser = parser;
		}
		return activityName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataObjectName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getDataObjectName_5023Parser() {
		if (dataObjectName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			dataObjectName_5023Parser = parser;
		}
		return dataObjectName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getGroupName_5024Parser() {
		if (groupName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			groupName_5024Parser = parser;
		}
		return groupName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageFlowName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getMessageFlowName_6004Parser() {
		if (messageFlowName_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			messageFlowName_6004Parser = parser;
		}
		return messageFlowName_6004Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceFlowName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceFlowName_6005Parser() {
		if (sequenceFlowName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			sequenceFlowName_6005Parser = parser;
		}
		return sequenceFlowName_6005Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_6006Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_6006Parser() {
		if (associationName_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getBPMNElement_Name() };
			SimpleBPMN.diagram.parsers.MessageFormatParser parser = new SimpleBPMN.diagram.parsers.MessageFormatParser(
					features);
			associationName_6006Parser = parser;
		}
		return associationName_6006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SimpleBPMN.diagram.edit.parts.XORNameEditPart.VISUAL_ID:
			return getXORName_5001Parser();
		case SimpleBPMN.diagram.edit.parts.ORNameEditPart.VISUAL_ID:
			return getORName_5002Parser();
		case SimpleBPMN.diagram.edit.parts.ANDNameEditPart.VISUAL_ID:
			return getANDName_5003Parser();
		case SimpleBPMN.diagram.edit.parts.LaneNameEditPart.VISUAL_ID:
			return getLaneName_5004Parser();
		case SimpleBPMN.diagram.edit.parts.PoolNameEditPart.VISUAL_ID:
			return getPoolName_5005Parser();
		case SimpleBPMN.diagram.edit.parts.StartEventNameEditPart.VISUAL_ID:
			return getStartEventName_5011Parser();
		case SimpleBPMN.diagram.edit.parts.IntermediateEventNameEditPart.VISUAL_ID:
			return getIntermediateEventName_5012Parser();
		case SimpleBPMN.diagram.edit.parts.EndEventNameEditPart.VISUAL_ID:
			return getEndEventName_5013Parser();
		case SimpleBPMN.diagram.edit.parts.ActivityNameEditPart.VISUAL_ID:
			return getActivityName_5007Parser();
		case SimpleBPMN.diagram.edit.parts.DataObjectNameEditPart.VISUAL_ID:
			return getDataObjectName_5008Parser();
		case SimpleBPMN.diagram.edit.parts.GroupNameEditPart.VISUAL_ID:
			return getGroupName_5009Parser();
		case SimpleBPMN.diagram.edit.parts.XORName2EditPart.VISUAL_ID:
			return getXORName_5014Parser();
		case SimpleBPMN.diagram.edit.parts.ORName2EditPart.VISUAL_ID:
			return getORName_5015Parser();
		case SimpleBPMN.diagram.edit.parts.ANDName2EditPart.VISUAL_ID:
			return getANDName_5016Parser();
		case SimpleBPMN.diagram.edit.parts.LaneName2EditPart.VISUAL_ID:
			return getLaneName_5017Parser();
		case SimpleBPMN.diagram.edit.parts.PoolName2EditPart.VISUAL_ID:
			return getPoolName_5018Parser();
		case SimpleBPMN.diagram.edit.parts.StartEventName2EditPart.VISUAL_ID:
			return getStartEventName_5019Parser();
		case SimpleBPMN.diagram.edit.parts.IntermediateEventName2EditPart.VISUAL_ID:
			return getIntermediateEventName_5020Parser();
		case SimpleBPMN.diagram.edit.parts.EndEventName2EditPart.VISUAL_ID:
			return getEndEventName_5021Parser();
		case SimpleBPMN.diagram.edit.parts.ActivityName2EditPart.VISUAL_ID:
			return getActivityName_5022Parser();
		case SimpleBPMN.diagram.edit.parts.DataObjectName2EditPart.VISUAL_ID:
			return getDataObjectName_5023Parser();
		case SimpleBPMN.diagram.edit.parts.GroupName2EditPart.VISUAL_ID:
			return getGroupName_5024Parser();
		case SimpleBPMN.diagram.edit.parts.MessageFlowNameEditPart.VISUAL_ID:
			return getMessageFlowName_6004Parser();
		case SimpleBPMN.diagram.edit.parts.SequenceFlowNameEditPart.VISUAL_ID:
			return getSequenceFlowName_6005Parser();
		case SimpleBPMN.diagram.edit.parts.AssociationNameEditPart.VISUAL_ID:
			return getAssociationName_6006Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
