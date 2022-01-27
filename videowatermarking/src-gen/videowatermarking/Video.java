/**
 */
package videowatermarking;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videowatermarking.Video#getVideoName <em>Video Name</em>}</li>
 *   <li>{@link videowatermarking.Video#getVideoType <em>Video Type</em>}</li>
 *   <li>{@link videowatermarking.Video#getGeneticalgorithm <em>Geneticalgorithm</em>}</li>
 *   <li>{@link videowatermarking.Video#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see videowatermarking.VideowatermarkingPackage#getVideo()
 * @model abstract="true"
 * @generated
 */
public interface Video extends EObject {
	/**
	 * Returns the value of the '<em><b>Video Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Name</em>' attribute.
	 * @see #setVideoName(String)
	 * @see videowatermarking.VideowatermarkingPackage#getVideo_VideoName()
	 * @model
	 * @generated
	 */
	String getVideoName();

	/**
	 * Sets the value of the '{@link videowatermarking.Video#getVideoName <em>Video Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Name</em>' attribute.
	 * @see #getVideoName()
	 * @generated
	 */
	void setVideoName(String value);

	/**
	 * Returns the value of the '<em><b>Video Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Type</em>' attribute.
	 * @see #setVideoType(String)
	 * @see videowatermarking.VideowatermarkingPackage#getVideo_VideoType()
	 * @model
	 * @generated
	 */
	String getVideoType();

	/**
	 * Sets the value of the '{@link videowatermarking.Video#getVideoType <em>Video Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Type</em>' attribute.
	 * @see #getVideoType()
	 * @generated
	 */
	void setVideoType(String value);

	/**
	 * Returns the value of the '<em><b>Geneticalgorithm</b></em>' reference list.
	 * The list contents are of type {@link videowatermarking.GeneticAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geneticalgorithm</em>' reference list.
	 * @see videowatermarking.VideowatermarkingPackage#getVideo_Geneticalgorithm()
	 * @model required="true"
	 * @generated
	 */
	EList<GeneticAlgorithm> getGeneticalgorithm();

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference list.
	 * The list contents are of type {@link videowatermarking.Database}.
	 * It is bidirectional and its opposite is '{@link videowatermarking.Database#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference list.
	 * @see videowatermarking.VideowatermarkingPackage#getVideo_Database()
	 * @see videowatermarking.Database#getVideo
	 * @model opposite="video" required="true"
	 * @generated
	 */
	EList<Database> getDatabase();

} // Video
