/**
 */
package videowatermarking;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genetic Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videowatermarking.GeneticAlgorithm#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see videowatermarking.VideowatermarkingPackage#getGeneticAlgorithm()
 * @model
 * @generated
 */
public interface GeneticAlgorithm extends Filter {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference list.
	 * The list contents are of type {@link videowatermarking.Database}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference list.
	 * @see videowatermarking.VideowatermarkingPackage#getGeneticAlgorithm_Database()
	 * @model required="true"
	 * @generated
	 */
	EList<Database> getDatabase();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void VideoToFrames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SelectFrame();

} // GeneticAlgorithm
