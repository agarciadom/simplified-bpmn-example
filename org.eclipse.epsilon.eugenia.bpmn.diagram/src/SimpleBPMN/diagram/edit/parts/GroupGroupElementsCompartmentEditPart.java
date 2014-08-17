/*
 * 
 */
package SimpleBPMN.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class GroupGroupElementsCompartmentEditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7001;

	/**
	 * @generated
	 */
	public GroupGroupElementsCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return SimpleBPMN.diagram.part.Messages.GroupGroupElementsCompartmentEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SimpleBPMN.diagram.edit.policies.GroupGroupElementsCompartmentItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new SimpleBPMN.diagram.edit.policies.GroupGroupElementsCompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001) {
				return this;
			}
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002) {
				return this;
			}
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003) {
				return this;
			}
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_3004) {
				return this;
			}
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_3005) {
				return this;
			}
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006) {
				return this;
			}
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007) {
				return this;
			}
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008) {
				return this;
			}
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009) {
				return this;
			}
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.DataObject_3010) {
				return this;
			}
			if (type == SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_3011) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request)
						.getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType
								.equals(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001)
								|| elementType
										.equals(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002)
								|| elementType
										.equals(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003)
								|| elementType
										.equals(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004)
								|| elementType
										.equals(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005)
								|| elementType
										.equals(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
