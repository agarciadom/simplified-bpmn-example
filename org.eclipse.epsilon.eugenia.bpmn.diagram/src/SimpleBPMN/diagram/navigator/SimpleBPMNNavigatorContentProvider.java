/*
 * 
 */
package SimpleBPMN.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class SimpleBPMNNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public SimpleBPMNNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem> result = new ArrayList<SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup) {
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup group = (SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem) {
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem navigatorItem = (SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
				.getVisualID(view)) {

		case SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup links = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_BusinessProcessDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_XOR_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_XOR_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_OR_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_OR_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_AND_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_AND_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_Activity_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_Activity_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Lane2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Pool2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.DataObject2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_StartEvent_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_StartEvent_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_IntermediateEvent_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_IntermediateEvent_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_EndEvent_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_EndEvent_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_XOR_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_XOR_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_OR_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_OR_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_AND_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_AND_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_StartEvent_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_StartEvent_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_IntermediateEvent_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_IntermediateEvent_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_EndEvent_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_EndEvent_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup incominglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_Activity_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup outgoinglinks = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_Activity_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Lane2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Pool2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.DataObject2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup target = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_MessageFlow_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup source = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_MessageFlow_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup target = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_SequenceFlow_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup source = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_SequenceFlow_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup target = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_Association_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup source = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_Association_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup target = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_MessageFlow_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup source = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_MessageFlow_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup target = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_SequenceFlow_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup source = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_SequenceFlow_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID: {
			LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem> result = new LinkedList<SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup target = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_Association_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup source = new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorGroup(
					SimpleBPMN.diagram.part.Messages.NavigatorGroupName_Association_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
							.getType(SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.MODEL_ID
				.equals(SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem> result = new ArrayList<SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<SimpleBPMN.diagram.navigator.SimpleBPMNNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem) {
			SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem abstractNavigatorItem = (SimpleBPMN.diagram.navigator.SimpleBPMNAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
