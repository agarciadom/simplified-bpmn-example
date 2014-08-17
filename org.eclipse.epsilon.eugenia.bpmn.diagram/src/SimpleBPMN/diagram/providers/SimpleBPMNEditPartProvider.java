/*
 * 
 */
package SimpleBPMN.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class SimpleBPMNEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public SimpleBPMNEditPartProvider() {
		super(
				new SimpleBPMN.diagram.edit.parts.SimpleBPMNEditPartFactory(),
				SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry.TYPED_INSTANCE,
				SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.MODEL_ID);
	}

}
