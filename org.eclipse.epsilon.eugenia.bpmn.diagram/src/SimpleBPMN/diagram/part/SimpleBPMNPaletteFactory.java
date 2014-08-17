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
		paletteContainer.add(createEvent4CreationTool());
		paletteContainer.add(createGroup5CreationTool());
		paletteContainer.add(createLane6CreationTool());
		paletteContainer.add(createORGateway7CreationTool());
		paletteContainer.add(createPool8CreationTool());
		paletteContainer.add(createXORGateway9CreationTool());
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
	private ToolEntry createEvent4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Event4CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Event4CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Event_2006));
		entry.setId("createEvent4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Event_2006));
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
	private ToolEntry createLane6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Lane6CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Lane6CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_2004));
		entry.setId("createLane6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createORGateway7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.ORGateway7CreationTool_title,
				SimpleBPMN.diagram.part.Messages.ORGateway7CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002));
		entry.setId("createORGateway7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPool8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.Pool8CreationTool_title,
				SimpleBPMN.diagram.part.Messages.Pool8CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_2005));
		entry.setId("createPool8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
				.getImageDescriptor(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXORGateway9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				SimpleBPMN.diagram.part.Messages.XORGateway9CreationTool_title,
				SimpleBPMN.diagram.part.Messages.XORGateway9CreationTool_desc,
				Collections
						.singletonList(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001));
		entry.setId("createXORGateway9CreationTool"); //$NON-NLS-1$
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
