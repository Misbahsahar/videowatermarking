/**
 */
package videowatermarking.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import videowatermarking.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideowatermarkingFactoryImpl extends EFactoryImpl implements VideowatermarkingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VideowatermarkingFactory init() {
		try {
			VideowatermarkingFactory theVideowatermarkingFactory = (VideowatermarkingFactory) EPackage.Registry.INSTANCE
					.getEFactory(VideowatermarkingPackage.eNS_URI);
			if (theVideowatermarkingFactory != null) {
				return theVideowatermarkingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VideowatermarkingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideowatermarkingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case VideowatermarkingPackage.VIDEO_WATERMARK:
			return createVideoWatermark();
		case VideowatermarkingPackage.DATABASE:
			return createDatabase();
		case VideowatermarkingPackage.USER:
			return createUser();
		case VideowatermarkingPackage.GENETIC_ALGORITHM:
			return createGeneticAlgorithm();
		case VideowatermarkingPackage.MPG:
			return createMPG();
		case VideowatermarkingPackage.MOV:
			return createMOV();
		case VideowatermarkingPackage.WEB_CM:
			return createWebCm();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoWatermark createVideoWatermark() {
		VideoWatermarkImpl videoWatermark = new VideoWatermarkImpl();
		return videoWatermark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneticAlgorithm createGeneticAlgorithm() {
		GeneticAlgorithmImpl geneticAlgorithm = new GeneticAlgorithmImpl();
		return geneticAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPG createMPG() {
		MPGImpl mpg = new MPGImpl();
		return mpg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOV createMOV() {
		MOVImpl mov = new MOVImpl();
		return mov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebCm createWebCm() {
		WebCmImpl webCm = new WebCmImpl();
		return webCm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideowatermarkingPackage getVideowatermarkingPackage() {
		return (VideowatermarkingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VideowatermarkingPackage getPackage() {
		return VideowatermarkingPackage.eINSTANCE;
	}

} //VideowatermarkingFactoryImpl
