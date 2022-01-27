/**
 */
package videowatermarking.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import videowatermarking.Database;
import videowatermarking.GeneticAlgorithm;
import videowatermarking.Video;
import videowatermarking.VideowatermarkingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videowatermarking.impl.VideoImpl#getVideoName <em>Video Name</em>}</li>
 *   <li>{@link videowatermarking.impl.VideoImpl#getVideoType <em>Video Type</em>}</li>
 *   <li>{@link videowatermarking.impl.VideoImpl#getGeneticalgorithm <em>Geneticalgorithm</em>}</li>
 *   <li>{@link videowatermarking.impl.VideoImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VideoImpl extends MinimalEObjectImpl.Container implements Video {
	/**
	 * The default value of the '{@link #getVideoName() <em>Video Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoName()
	 * @generated
	 * @ordered
	 */
	protected static final String VIDEO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoName() <em>Video Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoName()
	 * @generated
	 * @ordered
	 */
	protected String videoName = VIDEO_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVideoType() <em>Video Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoType()
	 * @generated
	 * @ordered
	 */
	protected static final String VIDEO_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoType() <em>Video Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoType()
	 * @generated
	 * @ordered
	 */
	protected String videoType = VIDEO_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneticalgorithm() <em>Geneticalgorithm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneticalgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneticAlgorithm> geneticalgorithm;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<Database> database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideowatermarkingPackage.Literals.VIDEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVideoName() {
		return videoName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoName(String newVideoName) {
		String oldVideoName = videoName;
		videoName = newVideoName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideowatermarkingPackage.VIDEO__VIDEO_NAME,
					oldVideoName, videoName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVideoType() {
		return videoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoType(String newVideoType) {
		String oldVideoType = videoType;
		videoType = newVideoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideowatermarkingPackage.VIDEO__VIDEO_TYPE,
					oldVideoType, videoType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneticAlgorithm> getGeneticalgorithm() {
		if (geneticalgorithm == null) {
			geneticalgorithm = new EObjectResolvingEList<GeneticAlgorithm>(GeneticAlgorithm.class, this,
					VideowatermarkingPackage.VIDEO__GENETICALGORITHM);
		}
		return geneticalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Database> getDatabase() {
		if (database == null) {
			database = new EObjectWithInverseResolvingEList.ManyInverse<Database>(Database.class, this,
					VideowatermarkingPackage.VIDEO__DATABASE, VideowatermarkingPackage.DATABASE__VIDEO);
		}
		return database;
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
		case VideowatermarkingPackage.VIDEO__DATABASE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDatabase()).basicAdd(otherEnd, msgs);
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
		case VideowatermarkingPackage.VIDEO__DATABASE:
			return ((InternalEList<?>) getDatabase()).basicRemove(otherEnd, msgs);
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
		case VideowatermarkingPackage.VIDEO__VIDEO_NAME:
			return getVideoName();
		case VideowatermarkingPackage.VIDEO__VIDEO_TYPE:
			return getVideoType();
		case VideowatermarkingPackage.VIDEO__GENETICALGORITHM:
			return getGeneticalgorithm();
		case VideowatermarkingPackage.VIDEO__DATABASE:
			return getDatabase();
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
		case VideowatermarkingPackage.VIDEO__VIDEO_NAME:
			setVideoName((String) newValue);
			return;
		case VideowatermarkingPackage.VIDEO__VIDEO_TYPE:
			setVideoType((String) newValue);
			return;
		case VideowatermarkingPackage.VIDEO__GENETICALGORITHM:
			getGeneticalgorithm().clear();
			getGeneticalgorithm().addAll((Collection<? extends GeneticAlgorithm>) newValue);
			return;
		case VideowatermarkingPackage.VIDEO__DATABASE:
			getDatabase().clear();
			getDatabase().addAll((Collection<? extends Database>) newValue);
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
		case VideowatermarkingPackage.VIDEO__VIDEO_NAME:
			setVideoName(VIDEO_NAME_EDEFAULT);
			return;
		case VideowatermarkingPackage.VIDEO__VIDEO_TYPE:
			setVideoType(VIDEO_TYPE_EDEFAULT);
			return;
		case VideowatermarkingPackage.VIDEO__GENETICALGORITHM:
			getGeneticalgorithm().clear();
			return;
		case VideowatermarkingPackage.VIDEO__DATABASE:
			getDatabase().clear();
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
		case VideowatermarkingPackage.VIDEO__VIDEO_NAME:
			return VIDEO_NAME_EDEFAULT == null ? videoName != null : !VIDEO_NAME_EDEFAULT.equals(videoName);
		case VideowatermarkingPackage.VIDEO__VIDEO_TYPE:
			return VIDEO_TYPE_EDEFAULT == null ? videoType != null : !VIDEO_TYPE_EDEFAULT.equals(videoType);
		case VideowatermarkingPackage.VIDEO__GENETICALGORITHM:
			return geneticalgorithm != null && !geneticalgorithm.isEmpty();
		case VideowatermarkingPackage.VIDEO__DATABASE:
			return database != null && !database.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (videoName: ");
		result.append(videoName);
		result.append(", videoType: ");
		result.append(videoType);
		result.append(')');
		return result.toString();
	}

} //VideoImpl
