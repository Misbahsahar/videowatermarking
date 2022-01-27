/**
 */
package videowatermarking.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import videowatermarking.VideoWatermark;
import videowatermarking.VideowatermarkingFactory;
import videowatermarking.VideowatermarkingPackage;

/**
 * This is the item provider adapter for a {@link videowatermarking.VideoWatermark} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoWatermarkItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoWatermarkItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(VideowatermarkingPackage.Literals.VIDEO_WATERMARK__DATABASE);
			childrenFeatures.add(VideowatermarkingPackage.Literals.VIDEO_WATERMARK__FILTER);
			childrenFeatures.add(VideowatermarkingPackage.Literals.VIDEO_WATERMARK__USER);
			childrenFeatures.add(VideowatermarkingPackage.Literals.VIDEO_WATERMARK__VIDEO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns VideoWatermark.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VideoWatermark"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_VideoWatermark_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(VideoWatermark.class)) {
		case VideowatermarkingPackage.VIDEO_WATERMARK__DATABASE:
		case VideowatermarkingPackage.VIDEO_WATERMARK__FILTER:
		case VideowatermarkingPackage.VIDEO_WATERMARK__USER:
		case VideowatermarkingPackage.VIDEO_WATERMARK__VIDEO:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(VideowatermarkingPackage.Literals.VIDEO_WATERMARK__DATABASE,
				VideowatermarkingFactory.eINSTANCE.createDatabase()));

		newChildDescriptors.add(createChildParameter(VideowatermarkingPackage.Literals.VIDEO_WATERMARK__FILTER,
				VideowatermarkingFactory.eINSTANCE.createGeneticAlgorithm()));

		newChildDescriptors.add(createChildParameter(VideowatermarkingPackage.Literals.VIDEO_WATERMARK__USER,
				VideowatermarkingFactory.eINSTANCE.createUser()));

		newChildDescriptors.add(createChildParameter(VideowatermarkingPackage.Literals.VIDEO_WATERMARK__VIDEO,
				VideowatermarkingFactory.eINSTANCE.createMPG()));

		newChildDescriptors.add(createChildParameter(VideowatermarkingPackage.Literals.VIDEO_WATERMARK__VIDEO,
				VideowatermarkingFactory.eINSTANCE.createMOV()));

		newChildDescriptors.add(createChildParameter(VideowatermarkingPackage.Literals.VIDEO_WATERMARK__VIDEO,
				VideowatermarkingFactory.eINSTANCE.createWebCm()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VideowatermarkingEditPlugin.INSTANCE;
	}

}
