/**
 */
package videowatermarking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Watermark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videowatermarking.VideoWatermark#getDatabase <em>Database</em>}</li>
 *   <li>{@link videowatermarking.VideoWatermark#getFilter <em>Filter</em>}</li>
 *   <li>{@link videowatermarking.VideoWatermark#getUser <em>User</em>}</li>
 *   <li>{@link videowatermarking.VideoWatermark#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see videowatermarking.VideowatermarkingPackage#getVideoWatermark()
 * @model
 * @generated
 */
public interface VideoWatermark extends EObject {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link videowatermarking.Database}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see videowatermarking.VideowatermarkingPackage#getVideoWatermark_Database()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Database> getDatabase();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link videowatermarking.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see videowatermarking.VideowatermarkingPackage#getVideoWatermark_Filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Filter> getFilter();

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link videowatermarking.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see videowatermarking.VideowatermarkingPackage#getVideoWatermark_User()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Video</b></em>' containment reference list.
	 * The list contents are of type {@link videowatermarking.Video}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' containment reference list.
	 * @see videowatermarking.VideowatermarkingPackage#getVideoWatermark_Video()
	 * @model containment="true"
	 * @generated
	 */
	EList<Video> getVideo();

} // VideoWatermark
