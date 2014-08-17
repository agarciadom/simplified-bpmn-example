/*
 * 
 */
package SimpleBPMN.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class SimpleBPMNPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				SimpleBPMN.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createANDGateway1CreationTool());
		paletteContainer.add(createActivity2CreationTool());
		paletteContainer.add(createDataObject3CreationTool());
		paletteContainer.add(createEndEvent4CreationTool());
		paletteContainer.add(createGroup5CreationTool());
		paletteContainer.add(createIntermediateEvent6CreationTool());
		paletteContainer.add(createLane7CreationTool());
		paletteContainer.add(createORGateway8CreationTool());
		paletteContainer.add(createPool9CreationTool());
		paletteContainer.add(createStartEvent10CreationTool());
		paletteContainer.add(createXORGateway11CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				SimpleBPMN.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAssociation1CreationTool());
		paletteContainer.add(createMessageFlow2CreationTool());
		paletteContainer.add(createSequenceFlow3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createANDGateway1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_3003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.ANDGateway1CreationTool_title,
				SimpleBPMN.diagram.part.Messages.ANDGateway1CreationTool_desc,
				types);
		entry.setId("createANDGateway1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_3009);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Activity2CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Activity2CreationTool_desc,
				types);
		entry.setId("createActivity2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataObject3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.DataObject_2008);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.DataObject_3010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.DataObject3CreationTool_title,
				SimpleBPMN.diagram.part.Messages.DataObject3CreationTool_desc,
				types);
		entry.setId("createDataObject3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.DataObject_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndEvent4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_3008);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.EndEvent4CreationTool_title,
				SimpleBPMN.diagram.part.Messages.EndEvent4CreationTool_desc,
				types);
		entry.setId("createEndEvent4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_2009);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_3011);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Group5CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Group5CreationTool_desc, types);
		entry.setId("createGroup5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIntermediateEvent6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_3007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.IntermediateEvent6CreationTool_title,
				SimpleBPMN.diagram.part.Messages.IntermediateEvent6CreationTool_desc,
				types);
		entry.setId("createIntermediateEvent6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLane7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_2004);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Lane7CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Lane7CreationTool_desc, types);
		entry.setId("createLane7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createORGateway8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.ORGateway8CreationTool_title,
				SimpleBPMN.diagram.part.Messages.ORGateway8CreationTool_desc,
				types);
		entry.setId("createORGateway8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPool9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_2005);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_3005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Pool9CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Pool9CreationTool_desc, types);
		entry.setId("createPool9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStartEvent10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_3006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.StartEvent10CreationTool_title,
				SimpleBPMN.diagram.part.Messages.StartEvent10CreationTool_desc,
				types);
		entry.setId("createStartEvent10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXORGateway11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.XORGateway11CreationTool_title,
				SimpleBPMN.diagram.part.Messages.XORGateway11CreationTool_desc,
				types);
		entry.setId("createXORGateway11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				SimpleBPMN.diagram.part.Messages.Association1CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Association1CreationTool_desc,
				types);
		entry.setId("createAssociation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageFlow2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				SimpleBPMN.diagram.part.Messages.MessageFlow2CreationTool_title,
				SimpleBPMN.diagram.part.Messages.MessageFlow2CreationTool_desc,
				types);
		entry.setId("createMessageFlow2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequenceFlow3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				SimpleBPMN.diagram.part.Messages.SequenceFlow3CreationTool_title,
				SimpleBPMN.diagram.part.Messages.SequenceFlow3CreationTool_desc,
				types);
		entry.setId("createSequenceFlow3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
