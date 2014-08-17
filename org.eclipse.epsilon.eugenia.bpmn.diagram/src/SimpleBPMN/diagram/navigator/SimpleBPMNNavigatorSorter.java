/*
 * 
 */
package SimpleBPMN.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class SimpleBPMNNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem) {
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem item = (SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
