/*
 * 
 */
package SimpleBPMN.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class SimpleBPMNModelingAssistantProviderOfBusinessProcessDiagramEditPart
		extends
		SimpleBPMN.diagram.providers.SimpleBPMNModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(9);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.XOR_2001);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.OR_2002);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.AND_2003);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Lane_2004);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Pool_2005);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Event_2006);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Activity_2007);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.DataObject_2008);
		types.add(SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Group_2009);
		return types;
	}

}
