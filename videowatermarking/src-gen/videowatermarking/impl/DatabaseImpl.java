/**
 */
package videowatermarking.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import videowatermarking.Database;
import videowatermarking.Video;
import videowatermarking.VideowatermarkingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videowatermarking.impl.DatabaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link videowatermarking.impl.DatabaseImpl#getFrameNo <em>Frame No</em>}</li>
 *   <li>{@link videowatermarking.impl.DatabaseImpl#getWatermarkImage <em>Watermark Image</em>}</li>
 *   <li>{@link videowatermarking.impl.DatabaseImpl#getWatermarkedImage <em>Watermarked Image</em>}</li>
 *   <li>{@link videowatermarking.impl.DatabaseImpl#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends MinimalEObjectImpl.Container implements Database {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameNo() <em>Frame No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameNo()
	 * @generated
	 * @ordered
	 */
	protected static final int FRAME_NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrameNo() <em>Frame No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameNo()
	 * @generated
	 * @ordered
	 */
	protected int frameNo = FRAME_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getWatermarkImage() <em>Watermark Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatermarkImage()
	 * @generated
	 * @ordered
	 */
	protected static final String WATERMARK_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWatermarkImage() <em>Watermark Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatermarkImage()
	 * @generated
	 * @ordered
	 */
	protected String watermarkImage = WATERMARK_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWatermarkedImage() <em>Watermarked Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatermarkedImage()
	 * @generated
	 * @ordered
	 */
	protected static final String WATERMARKED_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWatermarkedImage() <em>Watermarked Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatermarkedImage()
	 * @generated
	 * @ordered
	 */
	protected String watermarkedImage = WATERMARKED_IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVideo() <em>Video</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideo()
	 * @generated
	 * @ordered
	 */
	protected EList<Video> video;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideowatermarkingPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideowatermarkingPackage.DATABASE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrameNo() {
		return frameNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameNo(int newFrameNo) {
		int oldFrameNo = frameNo;
		frameNo = newFrameNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideowatermarkingPackage.DATABASE__FRAME_NO,
					oldFrameNo, frameNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWatermarkImage() {
		return watermarkImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatermarkImage(String newWatermarkImage) {
		String oldWatermarkImage = watermarkImage;
		watermarkImage = newWatermarkImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideowatermarkingPackage.DATABASE__WATERMARK_IMAGE,
					oldWatermarkImage, watermarkImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWatermarkedImage() {
		return watermarkedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatermarkedImage(String newWatermarkedImage) {
		String oldWatermarkedImage = watermarkedImage;
		watermarkedImage = newWatermarkedImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideowatermarkingPackage.DATABASE__WATERMARKED_IMAGE,
					oldWatermarkedImage, watermarkedImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Video> getVideo() {
		if (video == null) {
			video = new EObjectWithInverseResolvingEList.ManyInverse<Video>(Video.class, this,
					VideowatermarkingPackage.DATABASE__VIDEO, VideowatermarkingPackage.VIDEO__DATABASE);
		}
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SaveData() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VideowatermarkingPackage.DATABASE__VIDEO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVideo()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VideowatermarkingPackage.DATABASE__VIDEO:
			return ((InternalEList<?>) getVideo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VideowatermarkingPackage.DATABASE__NAME:
			return getName();
		case VideowatermarkingPackage.DATABASE__FRAME_NO:
			return getFrameNo();
		case VideowatermarkingPackage.DATABASE__WATERMARK_IMAGE:
			return getWatermarkImage();
		case VideowatermarkingPackage.DATABASE__WATERMARKED_IMAGE:
			return getWatermarkedImage();
		case VideowatermarkingPackage.DATABASE__VIDEO:
			return getVideo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case VideowatermarkingPackage.DATABASE__NAME:
			setName((String) newValue);
			return;
		case VideowatermarkingPackage.DATABASE__FRAME_NO:
			setFrameNo((Integer) newValue);
			return;
		case VideowatermarkingPackage.DATABASE__WATERMARK_IMAGE:
			setWatermarkImage((String) newValue);
			return;
		case VideowatermarkingPackage.DATABASE__WATERMARKED_IMAGE:
			setWatermarkedImage((String) newValue);
			return;
		case VideowatermarkingPackage.DATABASE__VIDEO:
			getVideo().clear();
			getVideo().addAll((Collection<? extends Video>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case VideowatermarkingPackage.DATABASE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case VideowatermarkingPackage.DATABASE__FRAME_NO:
			setFrameNo(FRAME_NO_EDEFAULT);
			return;
		case VideowatermarkingPackage.DATABASE__WATERMARK_IMAGE:
			setWatermarkImage(WATERMARK_IMAGE_EDEFAULT);
			return;
		case VideowatermarkingPackage.DATABASE__WATERMARKED_IMAGE:
			setWatermarkedImage(WATERMARKED_IMAGE_EDEFAULT);
			return;
		case VideowatermarkingPackage.DATABASE__VIDEO:
			getVideo().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case VideowatermarkingPackage.DATABASE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case VideowatermarkingPackage.DATABASE__FRAME_NO:
			return frameNo != FRAME_NO_EDEFAULT;
		case VideowatermarkingPackage.DATABASE__WATERMARK_IMAGE:
			return WATERMARK_IMAGE_EDEFAULT == null ? watermarkImage != null
					: !WATERMARK_IMAGE_EDEFAULT.equals(watermarkImage);
		case VideowatermarkingPackage.DATABASE__WATERMARKED_IMAGE:
			return WATERMARKED_IMAGE_EDEFAULT == null ? watermarkedImage != null
					: !WATERMARKED_IMAGE_EDEFAULT.equals(watermarkedImage);
		case VideowatermarkingPackage.DATABASE__VIDEO:
			return video != null && !video.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case VideowatermarkingPackage.DATABASE___SAVE_DATA:
			SaveData();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", FrameNo: ");
		result.append(frameNo);
		result.append(", WatermarkImage: ");
		result.append(watermarkImage);
		result.append(", WatermarkedImage: ");
		result.append(watermarkedImage);
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
