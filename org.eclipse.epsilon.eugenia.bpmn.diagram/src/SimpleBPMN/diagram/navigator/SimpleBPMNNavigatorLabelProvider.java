/*
 * 
 */
package SimpleBPMN.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class SimpleBPMNNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem
				&& !isOwnView(((SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup) {
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup group = (SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup) element;
			return SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem) {
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem navigatorItem = (SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
				.getVisualID(view)) {
		case SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://eclipse.org/eugenia/simplebpmn?BusinessProcessDiagram", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.BusinessProcessDiagram_1000); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?XOR", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?OR", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?AND", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?Lane", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_2004); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?Pool", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_2005); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?Activity", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?DataObject", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.DataObject_2008); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?Group", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_2009); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?StartEvent", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?IntermediateEvent", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://eclipse.org/eugenia/simplebpmn?EndEvent", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://eclipse.org/eugenia/simplebpmn?MessageFlow", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://eclipse.org/eugenia/simplebpmn?SequenceFlow", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002); //$NON-NLS-1$
		case SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://eclipse.org/eugenia/simplebpmn?Association", SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
						.isKnownElementType(elementType)) {
			image = SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup) {
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup group = (SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem) {
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem navigatorItem = (SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
				.getVisualID(view)) {
		case SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID:
			return getBusinessProcessDiagram_1000Text(view);
		case SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID:
			return getXOR_2001Text(view);
		case SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID:
			return getOR_2002Text(view);
		case SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID:
			return getAND_2003Text(view);
		case SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID:
			return getLane_2004Text(view);
		case SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID:
			return getPool_2005Text(view);
		case SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2007Text(view);
		case SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID:
			return getDataObject_2008Text(view);
		case SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2009Text(view);
		case SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID:
			return getStartEvent_2010Text(view);
		case SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID:
			return getIntermediateEvent_2011Text(view);
		case SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID:
			return getEndEvent_2012Text(view);
		case SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID:
			return getMessageFlow_4001Text(view);
		case SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID:
			return getSequenceFlow_4002Text(view);
		case SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getAssociation_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getBusinessProcessDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXOR_2001Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.XORNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOR_2002Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.ORNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAND_2003Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.ANDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLane_2004Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_2004,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.LaneNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPool_2005Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_2005,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.PoolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivity_2007Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.ActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataObject_2008Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.DataObject_2008,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.DataObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_2009Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_2009,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStartEvent_2010Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.StartEventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIntermediateEvent_2011Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndEvent_2012Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.EndEventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMessageFlow_4001Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.MessageFlowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequenceFlow_4002Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociation_4003Text(View view) {
		IParser parser = SimpleBPMN.diagram.providers.SimpleBPMNParserProvider
				.getParser(
						SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003,
						view.getElement() != null ? view.getElement() : view,
						SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
								.getType(SimpleBPMN.diagram.edit.parts.AssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.MODEL_ID
				.equals(SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
						.getModelID(view));
	}

}
