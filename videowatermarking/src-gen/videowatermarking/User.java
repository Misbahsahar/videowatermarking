/**
 */
package videowatermarking;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videowatermarking.User#getName <em>Name</em>}</li>
 *   <li>{@link videowatermarking.User#getId <em>Id</em>}</li>
 *   <li>{@link videowatermarking.User#getFrameNo <em>Frame No</em>}</li>
 *   <li>{@link videowatermarking.User#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see videowatermarking.VideowatermarkingPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see videowatermarking.VideowatermarkingPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link videowatermarking.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see videowatermarking.VideowatermarkingPackage#getUser_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link videowatermarking.User#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Frame No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame No</em>' attribute.
	 * @see #setFrameNo(int)
	 * @see videowatermarking.VideowatermarkingPackage#getUser_FrameNo()
	 * @model
	 * @generated
	 */
	int getFrameNo();

	/**
	 * Sets the value of the '{@link videowatermarking.User#getFrameNo <em>Frame No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame No</em>' attribute.
	 * @see #getFrameNo()
	 * @generated
	 */
	void setFrameNo(int value);

	/**
	 * Returns the value of the '<em><b>Video</b></em>' reference list.
	 * The list contents are of type {@link videowatermarking.Video}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' reference list.
	 * @see videowatermarking.VideowatermarkingPackage#getUser_Video()
	 * @model required="true"
	 * @generated
	 */
	EList<Video> getVideo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void LoadVideo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void PlayVideo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void PauseVideo();

} // User
