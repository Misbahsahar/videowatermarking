/**
 */
package videowatermarking.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import videowatermarking.Database;
import videowatermarking.Filter;
import videowatermarking.GeneticAlgorithm;
import videowatermarking.User;
import videowatermarking.Video;
import videowatermarking.VideoWatermark;
import videowatermarking.VideowatermarkingFactory;
import videowatermarking.VideowatermarkingPackage;
import videowatermarking.WebCm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideowatermarkingPackageImpl extends EPackageImpl implements VideowatermarkingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoWatermarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geneticAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mpgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webCmEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see videowatermarking.VideowatermarkingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VideowatermarkingPackageImpl() {
		super(eNS_URI, VideowatermarkingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VideowatermarkingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VideowatermarkingPackage init() {
		if (isInited)
			return (VideowatermarkingPackage) EPackage.Registry.INSTANCE.getEPackage(VideowatermarkingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVideowatermarkingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VideowatermarkingPackageImpl theVideowatermarkingPackage = registeredVideowatermarkingPackage instanceof VideowatermarkingPackageImpl
				? (VideowatermarkingPackageImpl) registeredVideowatermarkingPackage
				: new VideowatermarkingPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVideowatermarkingPackage.createPackageContents();

		// Initialize created meta-data
		theVideowatermarkingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVideowatermarkingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VideowatermarkingPackage.eNS_URI, theVideowatermarkingPackage);
		return theVideowatermarkingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoWatermark() {
		return videoWatermarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoWatermark_Database() {
		return (EReference) videoWatermarkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoWatermark_Filter() {
		return (EReference) videoWatermarkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoWatermark_User() {
		return (EReference) videoWatermarkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoWatermark_Video() {
		return (EReference) videoWatermarkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Name() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_FrameNo() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_WatermarkImage() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_WatermarkedImage() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Video() {
		return (EReference) databaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDatabase__SaveData() {
		return databaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilter__Execute__Filter() {
		return filterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Id() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_FrameNo() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Video() {
		return (EReference) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__LoadVideo() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__PlayVideo() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__PauseVideo() {
		return userEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneticAlgorithm() {
		return geneticAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneticAlgorithm_Database() {
		return (EReference) geneticAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneticAlgorithm__VideoToFrames() {
		return geneticAlgorithmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneticAlgorithm__SelectFrame() {
		return geneticAlgorithmEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_VideoName() {
		return (EAttribute) videoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_VideoType() {
		return (EAttribute) videoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideo_Geneticalgorithm() {
		return (EReference) videoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideo_Database() {
		return (EReference) videoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMPG() {
		return mpgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMOV() {
		return movEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebCm() {
		return webCmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideowatermarkingFactory getVideowatermarkingFactory() {
		return (VideowatermarkingFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		videoWatermarkEClass = createEClass(VIDEO_WATERMARK);
		createEReference(videoWatermarkEClass, VIDEO_WATERMARK__DATABASE);
		createEReference(videoWatermarkEClass, VIDEO_WATERMARK__FILTER);
		createEReference(videoWatermarkEClass, VIDEO_WATERMARK__USER);
		createEReference(videoWatermarkEClass, VIDEO_WATERMARK__VIDEO);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__NAME);
		createEAttribute(databaseEClass, DATABASE__FRAME_NO);
		createEAttribute(databaseEClass, DATABASE__WATERMARK_IMAGE);
		createEAttribute(databaseEClass, DATABASE__WATERMARKED_IMAGE);
		createEReference(databaseEClass, DATABASE__VIDEO);
		createEOperation(databaseEClass, DATABASE___SAVE_DATA);

		filterEClass = createEClass(FILTER);
		createEOperation(filterEClass, FILTER___EXECUTE__FILTER);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__ID);
		createEAttribute(userEClass, USER__FRAME_NO);
		createEReference(userEClass, USER__VIDEO);
		createEOperation(userEClass, USER___LOAD_VIDEO);
		createEOperation(userEClass, USER___PLAY_VIDEO);
		createEOperation(userEClass, USER___PAUSE_VIDEO);

		geneticAlgorithmEClass = createEClass(GENETIC_ALGORITHM);
		createEReference(geneticAlgorithmEClass, GENETIC_ALGORITHM__DATABASE);
		createEOperation(geneticAlgorithmEClass, GENETIC_ALGORITHM___VIDEO_TO_FRAMES);
		createEOperation(geneticAlgorithmEClass, GENETIC_ALGORITHM___SELECT_FRAME);

		videoEClass = createEClass(VIDEO);
		createEAttribute(videoEClass, VIDEO__VIDEO_NAME);
		createEAttribute(videoEClass, VIDEO__VIDEO_TYPE);
		createEReference(videoEClass, VIDEO__GENETICALGORITHM);
		createEReference(videoEClass, VIDEO__DATABASE);

		mpgEClass = createEClass(MPG);

		movEClass = createEClass(MOV);

		webCmEClass = createEClass(WEB_CM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		geneticAlgorithmEClass.getESuperTypes().add(this.getFilter());
		mpgEClass.getESuperTypes().add(this.getVideo());
		movEClass.getESuperTypes().add(this.getVideo());
		webCmEClass.getESuperTypes().add(this.getVideo());

		// Initialize classes, features, and operations; add parameters
		initEClass(videoWatermarkEClass, VideoWatermark.class, "VideoWatermark", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVideoWatermark_Database(), this.getDatabase(), null, "database", null, 1, -1,
				VideoWatermark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideoWatermark_Filter(), this.getFilter(), null, "filter", null, 1, -1, VideoWatermark.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideoWatermark_User(), this.getUser(), null, "user", null, 1, -1, VideoWatermark.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideoWatermark_Video(), this.getVideo(), null, "video", null, 0, -1, VideoWatermark.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Database.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_FrameNo(), ecorePackage.getEInt(), "FrameNo", null, 0, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_WatermarkImage(), ecorePackage.getEString(), "WatermarkImage", null, 0, 1,
				Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_WatermarkedImage(), ecorePackage.getEString(), "WatermarkedImage", null, 0, 1,
				Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Video(), this.getVideo(), this.getVideo_Database(), "video", null, 1, -1,
				Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDatabase__SaveData(), null, "SaveData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getFilter__Execute__Filter(), null, "Execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFilter(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "Name", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Id(), ecorePackage.getEInt(), "Id", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_FrameNo(), ecorePackage.getEInt(), "FrameNo", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Video(), this.getVideo(), null, "video", null, 1, -1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getUser__LoadVideo(), null, "LoadVideo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUser__PlayVideo(), null, "PlayVideo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUser__PauseVideo(), null, "PauseVideo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(geneticAlgorithmEClass, GeneticAlgorithm.class, "GeneticAlgorithm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneticAlgorithm_Database(), this.getDatabase(), null, "database", null, 1, -1,
				GeneticAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGeneticAlgorithm__VideoToFrames(), null, "VideoToFrames", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGeneticAlgorithm__SelectFrame(), null, "SelectFrame", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoEClass, Video.class, "Video", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideo_VideoName(), ecorePackage.getEString(), "videoName", null, 0, 1, Video.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_VideoType(), ecorePackage.getEString(), "videoType", null, 0, 1, Video.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideo_Geneticalgorithm(), this.getGeneticAlgorithm(), null, "geneticalgorithm", null, 1, -1,
				Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideo_Database(), this.getDatabase(), this.getDatabase_Video(), "database", null, 1, -1,
				Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mpgEClass, videowatermarking.MPG.class, "MPG", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(movEClass, videowatermarking.MOV.class, "MOV", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(webCmEClass, WebCm.class, "WebCm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //VideowatermarkingPackageImpl
