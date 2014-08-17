/*
 * 
 */
package SimpleBPMN.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		SimpleBPMN.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		SimpleBPMN.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		SimpleBPMN.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		SimpleBPMN.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		SimpleBPMN.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
