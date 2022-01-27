/**
 */
package videowatermarking.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import videowatermarking.User;
import videowatermarking.Video;
import videowatermarking.VideowatermarkingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videowatermarking.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link videowatermarking.impl.UserImpl#getId <em>Id</em>}</li>
 *   <li>{@link videowatermarking.impl.UserImpl#getFrameNo <em>Frame No</em>}</li>
 *   <li>{@link videowatermarking.impl.UserImpl#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;
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
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideowatermarkingPackage.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideowatermarkingPackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideowatermarkingPackage.USER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideowatermarkingPackage.USER__FRAME_NO, oldFrameNo,
					frameNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Video> getVideo() {
		if (video == null) {
			video = new EObjectResolvingEList<Video>(Video.class, this, VideowatermarkingPackage.USER__VIDEO);
		}
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void LoadVideo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void PlayVideo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void PauseVideo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VideowatermarkingPackage.USER__NAME:
			return getName();
		case VideowatermarkingPackage.USER__ID:
			return getId();
		case VideowatermarkingPackage.USER__FRAME_NO:
			return getFrameNo();
		case VideowatermarkingPackage.USER__VIDEO:
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
		case VideowatermarkingPackage.USER__NAME:
			setName((String) newValue);
			return;
		case VideowatermarkingPackage.USER__ID:
			setId((Integer) newValue);
			return;
		case VideowatermarkingPackage.USER__FRAME_NO:
			setFrameNo((Integer) newValue);
			return;
		case VideowatermarkingPackage.USER__VIDEO:
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
		case VideowatermarkingPackage.USER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case VideowatermarkingPackage.USER__ID:
			setId(ID_EDEFAULT);
			return;
		case VideowatermarkingPackage.USER__FRAME_NO:
			setFrameNo(FRAME_NO_EDEFAULT);
			return;
		case VideowatermarkingPackage.USER__VIDEO:
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
		case VideowatermarkingPackage.USER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case VideowatermarkingPackage.USER__ID:
			return id != ID_EDEFAULT;
		case VideowatermarkingPackage.USER__FRAME_NO:
			return frameNo != FRAME_NO_EDEFAULT;
		case VideowatermarkingPackage.USER__VIDEO:
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
		case VideowatermarkingPackage.USER___LOAD_VIDEO:
			LoadVideo();
			return null;
		case VideowatermarkingPackage.USER___PLAY_VIDEO:
			PlayVideo();
			return null;
		case VideowatermarkingPackage.USER___PAUSE_VIDEO:
			PauseVideo();
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
		result.append(", Id: ");
		result.append(id);
		result.append(", FrameNo: ");
		result.append(frameNo);
		result.append(')');
		return result.toString();
	}

} //UserImpl
