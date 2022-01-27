/**
 */
package videowatermarking;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videowatermarking.Database#getName <em>Name</em>}</li>
 *   <li>{@link videowatermarking.Database#getFrameNo <em>Frame No</em>}</li>
 *   <li>{@link videowatermarking.Database#getWatermarkImage <em>Watermark Image</em>}</li>
 *   <li>{@link videowatermarking.Database#getWatermarkedImage <em>Watermarked Image</em>}</li>
 *   <li>{@link videowatermarking.Database#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see videowatermarking.VideowatermarkingPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see videowatermarking.VideowatermarkingPackage#getDatabase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link videowatermarking.Database#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Frame No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame No</em>' attribute.
	 * @see #setFrameNo(int)
	 * @see videowatermarking.VideowatermarkingPackage#getDatabase_FrameNo()
	 * @model
	 * @generated
	 */
	int getFrameNo();

	/**
	 * Sets the value of the '{@link videowatermarking.Database#getFrameNo <em>Frame No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame No</em>' attribute.
	 * @see #getFrameNo()
	 * @generated
	 */
	void setFrameNo(int value);

	/**
	 * Returns the value of the '<em><b>Watermark Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watermark Image</em>' attribute.
	 * @see #setWatermarkImage(String)
	 * @see videowatermarking.VideowatermarkingPackage#getDatabase_WatermarkImage()
	 * @model
	 * @generated
	 */
	String getWatermarkImage();

	/**
	 * Sets the value of the '{@link videowatermarking.Database#getWatermarkImage <em>Watermark Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watermark Image</em>' attribute.
	 * @see #getWatermarkImage()
	 * @generated
	 */
	void setWatermarkImage(String value);

	/**
	 * Returns the value of the '<em><b>Watermarked Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watermarked Image</em>' attribute.
	 * @see #setWatermarkedImage(String)
	 * @see videowatermarking.VideowatermarkingPackage#getDatabase_WatermarkedImage()
	 * @model
	 * @generated
	 */
	String getWatermarkedImage();

	/**
	 * Sets the value of the '{@link videowatermarking.Database#getWatermarkedImage <em>Watermarked Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watermarked Image</em>' attribute.
	 * @see #getWatermarkedImage()
	 * @generated
	 */
	void setWatermarkedImage(String value);

	/**
	 * Returns the value of the '<em><b>Video</b></em>' reference list.
	 * The list contents are of type {@link videowatermarking.Video}.
	 * It is bidirectional and its opposite is '{@link videowatermarking.Video#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' reference list.
	 * @see videowatermarking.VideowatermarkingPackage#getDatabase_Video()
	 * @see videowatermarking.Video#getDatabase
	 * @model opposite="database" required="true"
	 * @generated
	 */
	EList<Video> getVideo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SaveData();

} // Database
