/*
 * 
 */
package SimpleBPMN.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SimpleBPMNVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.epsilon.eugenia.bpmn.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getBusinessProcessDiagram()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((SimpleBPMN.BusinessProcessDiagram) domainElement)) {
			return SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
				.getModelID(containerView);
		if (!SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"SimpleBPMN".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID:
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getXOR().isSuperTypeOf(
					domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID;
			}
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getOR().isSuperTypeOf(
					domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID;
			}
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getAND().isSuperTypeOf(
					domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID;
			}
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getLane().isSuperTypeOf(
					domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID;
			}
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getPool().isSuperTypeOf(
					domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID;
			}
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getStartEvent()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID;
			}
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getIntermediateEvent()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID;
			}
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getEndEvent()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID;
			}
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getActivity()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID;
			}
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getDataObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID;
			}
			if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getGroup()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
				.getModelID(containerView);
		if (!SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"SimpleBPMN".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.XORNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.ORNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.ANDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.LaneNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.PoolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.StartEventNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.IntermediateEventNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.EndEventNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.DataObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.MessageFlowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.SequenceFlowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			if (SimpleBPMN.diagram.edit.parts.AssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getMessageFlow()
				.isSuperTypeOf(domainElement.eClass())) {
			return SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID;
		}
		if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow()
				.isSuperTypeOf(domainElement.eClass())) {
			return SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID;
		}
		if (SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getAssociation()
				.isSuperTypeOf(domainElement.eClass())) {
			return SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(SimpleBPMN.BusinessProcessDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID:
			return false;
		case SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID:
		case SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID:
		case SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID:
		case SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID:
		case SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID:
		case SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
		case SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID:
		case SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID:
		case SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID:
		case SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID:
		case SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
