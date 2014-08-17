/*
 * 
 */
package SimpleBPMN.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
