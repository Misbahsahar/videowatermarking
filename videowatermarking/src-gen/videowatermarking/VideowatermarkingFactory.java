/**
 */
package videowatermarking;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see videowatermarking.VideowatermarkingPackage
 * @generated
 */
public interface VideowatermarkingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideowatermarkingFactory eINSTANCE = videowatermarking.impl.VideowatermarkingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Video Watermark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Watermark</em>'.
	 * @generated
	 */
	VideoWatermark createVideoWatermark();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Genetic Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Genetic Algorithm</em>'.
	 * @generated
	 */
	GeneticAlgorithm createGeneticAlgorithm();

	/**
	 * Returns a new object of class '<em>MPG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MPG</em>'.
	 * @generated
	 */
	MPG createMPG();

	/**
	 * Returns a new object of class '<em>MOV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MOV</em>'.
	 * @generated
	 */
	MOV createMOV();

	/**
	 * Returns a new object of class '<em>Web Cm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Cm</em>'.
	 * @generated
	 */
	WebCm createWebCm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VideowatermarkingPackage getVideowatermarkingPackage();

} //VideowatermarkingFactory
