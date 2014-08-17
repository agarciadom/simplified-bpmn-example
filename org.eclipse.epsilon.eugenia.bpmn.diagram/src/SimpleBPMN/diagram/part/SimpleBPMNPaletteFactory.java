/*
 * 
 */
package SimpleBPMN.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.ANDGateway1CreationTool_title,
				SimpleBPMN.diagram.part.Messages.ANDGateway1CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Activity2CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Activity2CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.DataObject3CreationTool_title,
				SimpleBPMN.diagram.part.Messages.DataObject3CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.DataObject_2008));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.EndEvent4CreationTool_title,
				SimpleBPMN.diagram.part.Messages.EndEvent4CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.EndEvent_2012));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Group5CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Group5CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_2009));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.IntermediateEvent6CreationTool_title,
				SimpleBPMN.diagram.part.Messages.IntermediateEvent6CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.IntermediateEvent_2011));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Lane7CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Lane7CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_2004));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.ORGateway8CreationTool_title,
				SimpleBPMN.diagram.part.Messages.ORGateway8CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Pool9CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Pool9CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_2005));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.StartEvent10CreationTool_title,
				SimpleBPMN.diagram.part.Messages.StartEvent10CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.StartEvent_2010));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.XORGateway11CreationTool_title,
				SimpleBPMN.diagram.part.Messages.XORGateway11CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001));
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
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				SimpleBPMN.diagram.part.Messages.Association1CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Association1CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003));
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
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				SimpleBPMN.diagram.part.Messages.MessageFlow2CreationTool_title,
				SimpleBPMN.diagram.part.Messages.MessageFlow2CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001));
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
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				SimpleBPMN.diagram.part.Messages.SequenceFlow3CreationTool_title,
				SimpleBPMN.diagram.part.Messages.SequenceFlow3CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002));
		entry.setId("createSequenceFlow3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
