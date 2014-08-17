/*
 * 
 */
package SimpleBPMN.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class SimpleBPMNCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected SimpleBPMN.diagram.part.SimpleBPMNCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected SimpleBPMN.diagram.part.SimpleBPMNCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(SimpleBPMN.diagram.part.Messages.SimpleBPMNCreationWizardTitle);
		setDefaultPageImageDescriptor(SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewSimpleBPMNWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new SimpleBPMN.diagram.part.SimpleBPMNCreationWizardPage(
				"DiagramModelFile", getSelection(), "simplebpmn_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(SimpleBPMN.diagram.part.Messages.SimpleBPMNCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(SimpleBPMN.diagram.part.Messages.SimpleBPMNCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new SimpleBPMN.diagram.part.SimpleBPMNCreationWizardPage(
				"DomainModelFile", getSelection(), "simplebpmn") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".simplebpmn_diagram".length()); //$NON-NLS-1$
					setFileName(SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "simplebpmn")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(SimpleBPMN.diagram.part.Messages.SimpleBPMNCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(SimpleBPMN.diagram.part.Messages.SimpleBPMNCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										SimpleBPMN.diagram.part.Messages.SimpleBPMNCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								SimpleBPMN.diagram.part.Messages.SimpleBPMNCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
