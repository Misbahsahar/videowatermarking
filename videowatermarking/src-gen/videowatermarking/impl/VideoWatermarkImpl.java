/**
 */
package videowatermarking.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import videowatermarking.Database;
import videowatermarking.Filter;
import videowatermarking.User;
import videowatermarking.Video;
import videowatermarking.VideoWatermark;
import videowatermarking.VideowatermarkingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Watermark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videowatermarking.impl.VideoWatermarkImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link videowatermarking.impl.VideoWatermarkImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link videowatermarking.impl.VideoWatermarkImpl#getUser <em>User</em>}</li>
 *   <li>{@link videowatermarking.impl.VideoWatermarkImpl#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoWatermarkImpl extends MinimalEObjectImpl.Container implements VideoWatermark {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<Database> database;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filter;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The cached value of the '{@link #getVideo() <em>Video</em>}' containment reference list.
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
	protected VideoWatermarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideowatermarkingPackage.Literals.VIDEO_WATERMARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Database> getDatabase() {
		if (database == null) {
			database = new EObjectContainmentEList<Database>(Database.class, this,
					VideowatermarkingPackage.VIDEO_WATERMARK__DATABASE);
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<Filter>(Filter.class, this,
					VideowatermarkingPackage.VIDEO_WATERMARK__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<User>(User.class, this, VideowatermarkingPackage.VIDEO_WATERMARK__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Video> getVideo() {
		if (video == null) {
			video = new EObjectContainmentEList<Video>(Video.class, this,
					VideowatermarkingPackage.VIDEO_WATERMARK__VIDEO);
		}
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VideowatermarkingPackage.VIDEO_WATERMARK__DATABASE:
			return ((InternalEList<?>) getDatabase()).basicRemove(otherEnd, msgs);
		case VideowatermarkingPackage.VIDEO_WATERMARK__FILTER:
			return ((InternalEList<?>) getFilter()).basicRemove(otherEnd, msgs);
		case VideowatermarkingPackage.VIDEO_WATERMARK__USER:
			return ((InternalEList<?>) getUser()).basicRemove(otherEnd, msgs);
		case VideowatermarkingPackage.VIDEO_WATERMARK__VIDEO:
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
		case VideowatermarkingPackage.VIDEO_WATERMARK__DATABASE:
			return getDatabase();
		case VideowatermarkingPackage.VIDEO_WATERMARK__FILTER:
			return getFilter();
		case VideowatermarkingPackage.VIDEO_WATERMARK__USER:
			return getUser();
		case VideowatermarkingPackage.VIDEO_WATERMARK__VIDEO:
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
		case VideowatermarkingPackage.VIDEO_WATERMARK__DATABASE:
			getDatabase().clear();
			getDatabase().addAll((Collection<? extends Database>) newValue);
			return;
		case VideowatermarkingPackage.VIDEO_WATERMARK__FILTER:
			getFilter().clear();
			getFilter().addAll((Collection<? extends Filter>) newValue);
			return;
		case VideowatermarkingPackage.VIDEO_WATERMARK__USER:
			getUser().clear();
			getUser().addAll((Collection<? extends User>) newValue);
			return;
		case VideowatermarkingPackage.VIDEO_WATERMARK__VIDEO:
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
		case VideowatermarkingPackage.VIDEO_WATERMARK__DATABASE:
			getDatabase().clear();
			return;
		case VideowatermarkingPackage.VIDEO_WATERMARK__FILTER:
			getFilter().clear();
			return;
		case VideowatermarkingPackage.VIDEO_WATERMARK__USER:
			getUser().clear();
			return;
		case VideowatermarkingPackage.VIDEO_WATERMARK__VIDEO:
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
		case VideowatermarkingPackage.VIDEO_WATERMARK__DATABASE:
			return database != null && !database.isEmpty();
		case VideowatermarkingPackage.VIDEO_WATERMARK__FILTER:
			return filter != null && !filter.isEmpty();
		case VideowatermarkingPackage.VIDEO_WATERMARK__USER:
			return user != null && !user.isEmpty();
		case VideowatermarkingPackage.VIDEO_WATERMARK__VIDEO:
			return video != null && !video.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VideoWatermarkImpl
