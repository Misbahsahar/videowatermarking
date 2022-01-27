/**
 */
package videowatermarking;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see videowatermarking.VideowatermarkingFactory
 * @model kind="package"
 * @generated
 */
public interface VideowatermarkingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "videowatermarking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/videowatermarking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "videowatermarking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideowatermarkingPackage eINSTANCE = videowatermarking.impl.VideowatermarkingPackageImpl.init();

	/**
	 * The meta object id for the '{@link videowatermarking.impl.VideoWatermarkImpl <em>Video Watermark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videowatermarking.impl.VideoWatermarkImpl
	 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getVideoWatermark()
	 * @generated
	 */
	int VIDEO_WATERMARK = 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_WATERMARK__DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_WATERMARK__FILTER = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_WATERMARK__USER = 2;

	/**
	 * The feature id for the '<em><b>Video</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_WATERMARK__VIDEO = 3;

	/**
	 * The number of structural features of the '<em>Video Watermark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_WATERMARK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Video Watermark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_WATERMARK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link videowatermarking.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videowatermarking.impl.DatabaseImpl
	 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Frame No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__FRAME_NO = 1;

	/**
	 * The feature id for the '<em><b>Watermark Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__WATERMARK_IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Watermarked Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__WATERMARKED_IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__VIDEO = 4;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Save Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE___SAVE_DATA = 0;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link videowatermarking.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videowatermarking.impl.FilterImpl
	 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 2;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___EXECUTE__FILTER = 0;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link videowatermarking.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videowatermarking.impl.UserImpl
	 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 1;

	/**
	 * The feature id for the '<em><b>Frame No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FRAME_NO = 2;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__VIDEO = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Load Video</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___LOAD_VIDEO = 0;

	/**
	 * The operation id for the '<em>Play Video</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___PLAY_VIDEO = 1;

	/**
	 * The operation id for the '<em>Pause Video</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___PAUSE_VIDEO = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link videowatermarking.impl.GeneticAlgorithmImpl <em>Genetic Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videowatermarking.impl.GeneticAlgorithmImpl
	 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getGeneticAlgorithm()
	 * @generated
	 */
	int GENETIC_ALGORITHM = 4;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM__DATABASE = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Genetic Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM___EXECUTE__FILTER = FILTER___EXECUTE__FILTER;

	/**
	 * The operation id for the '<em>Video To Frames</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM___VIDEO_TO_FRAMES = FILTER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Select Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM___SELECT_FRAME = FILTER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Genetic Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENETIC_ALGORITHM_OPERATION_COUNT = FILTER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link videowatermarking.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videowatermarking.impl.VideoImpl
	 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 5;

	/**
	 * The feature id for the '<em><b>Video Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__VIDEO_NAME = 0;

	/**
	 * The feature id for the '<em><b>Video Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__VIDEO_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Geneticalgorithm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__GENETICALGORITHM = 2;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DATABASE = 3;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link videowatermarking.impl.MPGImpl <em>MPG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videowatermarking.impl.MPGImpl
	 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getMPG()
	 * @generated
	 */
	int MPG = 6;

	/**
	 * The feature id for the '<em><b>Video Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPG__VIDEO_NAME = VIDEO__VIDEO_NAME;

	/**
	 * The feature id for the '<em><b>Video Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPG__VIDEO_TYPE = VIDEO__VIDEO_TYPE;

	/**
	 * The feature id for the '<em><b>Geneticalgorithm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPG__GENETICALGORITHM = VIDEO__GENETICALGORITHM;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPG__DATABASE = VIDEO__DATABASE;

	/**
	 * The number of structural features of the '<em>MPG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPG_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MPG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPG_OPERATION_COUNT = VIDEO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videowatermarking.impl.MOVImpl <em>MOV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videowatermarking.impl.MOVImpl
	 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getMOV()
	 * @generated
	 */
	int MOV = 7;

	/**
	 * The feature id for the '<em><b>Video Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOV__VIDEO_NAME = VIDEO__VIDEO_NAME;

	/**
	 * The feature id for the '<em><b>Video Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOV__VIDEO_TYPE = VIDEO__VIDEO_TYPE;

	/**
	 * The feature id for the '<em><b>Geneticalgorithm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOV__GENETICALGORITHM = VIDEO__GENETICALGORITHM;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOV__DATABASE = VIDEO__DATABASE;

	/**
	 * The number of structural features of the '<em>MOV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOV_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MOV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOV_OPERATION_COUNT = VIDEO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videowatermarking.impl.WebCmImpl <em>Web Cm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videowatermarking.impl.WebCmImpl
	 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getWebCm()
	 * @generated
	 */
	int WEB_CM = 8;

	/**
	 * The feature id for the '<em><b>Video Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CM__VIDEO_NAME = VIDEO__VIDEO_NAME;

	/**
	 * The feature id for the '<em><b>Video Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CM__VIDEO_TYPE = VIDEO__VIDEO_TYPE;

	/**
	 * The feature id for the '<em><b>Geneticalgorithm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CM__GENETICALGORITHM = VIDEO__GENETICALGORITHM;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CM__DATABASE = VIDEO__DATABASE;

	/**
	 * The number of structural features of the '<em>Web Cm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CM_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Web Cm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CM_OPERATION_COUNT = VIDEO_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link videowatermarking.VideoWatermark <em>Video Watermark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Watermark</em>'.
	 * @see videowatermarking.VideoWatermark
	 * @generated
	 */
	EClass getVideoWatermark();

	/**
	 * Returns the meta object for the containment reference list '{@link videowatermarking.VideoWatermark#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database</em>'.
	 * @see videowatermarking.VideoWatermark#getDatabase()
	 * @see #getVideoWatermark()
	 * @generated
	 */
	EReference getVideoWatermark_Database();

	/**
	 * Returns the meta object for the containment reference list '{@link videowatermarking.VideoWatermark#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see videowatermarking.VideoWatermark#getFilter()
	 * @see #getVideoWatermark()
	 * @generated
	 */
	EReference getVideoWatermark_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link videowatermarking.VideoWatermark#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see videowatermarking.VideoWatermark#getUser()
	 * @see #getVideoWatermark()
	 * @generated
	 */
	EReference getVideoWatermark_User();

	/**
	 * Returns the meta object for the containment reference list '{@link videowatermarking.VideoWatermark#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video</em>'.
	 * @see videowatermarking.VideoWatermark#getVideo()
	 * @see #getVideoWatermark()
	 * @generated
	 */
	EReference getVideoWatermark_Video();

	/**
	 * Returns the meta object for class '{@link videowatermarking.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see videowatermarking.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link videowatermarking.Database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see videowatermarking.Database#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Name();

	/**
	 * Returns the meta object for the attribute '{@link videowatermarking.Database#getFrameNo <em>Frame No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame No</em>'.
	 * @see videowatermarking.Database#getFrameNo()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_FrameNo();

	/**
	 * Returns the meta object for the attribute '{@link videowatermarking.Database#getWatermarkImage <em>Watermark Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watermark Image</em>'.
	 * @see videowatermarking.Database#getWatermarkImage()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_WatermarkImage();

	/**
	 * Returns the meta object for the attribute '{@link videowatermarking.Database#getWatermarkedImage <em>Watermarked Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watermarked Image</em>'.
	 * @see videowatermarking.Database#getWatermarkedImage()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_WatermarkedImage();

	/**
	 * Returns the meta object for the reference list '{@link videowatermarking.Database#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video</em>'.
	 * @see videowatermarking.Database#getVideo()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Video();

	/**
	 * Returns the meta object for the '{@link videowatermarking.Database#SaveData() <em>Save Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Data</em>' operation.
	 * @see videowatermarking.Database#SaveData()
	 * @generated
	 */
	EOperation getDatabase__SaveData();

	/**
	 * Returns the meta object for class '{@link videowatermarking.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see videowatermarking.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the '{@link videowatermarking.Filter#Execute(videowatermarking.Filter) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see videowatermarking.Filter#Execute(videowatermarking.Filter)
	 * @generated
	 */
	EOperation getFilter__Execute__Filter();

	/**
	 * Returns the meta object for class '{@link videowatermarking.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see videowatermarking.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link videowatermarking.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see videowatermarking.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link videowatermarking.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see videowatermarking.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link videowatermarking.User#getFrameNo <em>Frame No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame No</em>'.
	 * @see videowatermarking.User#getFrameNo()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FrameNo();

	/**
	 * Returns the meta object for the reference list '{@link videowatermarking.User#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video</em>'.
	 * @see videowatermarking.User#getVideo()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Video();

	/**
	 * Returns the meta object for the '{@link videowatermarking.User#LoadVideo() <em>Load Video</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Video</em>' operation.
	 * @see videowatermarking.User#LoadVideo()
	 * @generated
	 */
	EOperation getUser__LoadVideo();

	/**
	 * Returns the meta object for the '{@link videowatermarking.User#PlayVideo() <em>Play Video</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Play Video</em>' operation.
	 * @see videowatermarking.User#PlayVideo()
	 * @generated
	 */
	EOperation getUser__PlayVideo();

	/**
	 * Returns the meta object for the '{@link videowatermarking.User#PauseVideo() <em>Pause Video</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause Video</em>' operation.
	 * @see videowatermarking.User#PauseVideo()
	 * @generated
	 */
	EOperation getUser__PauseVideo();

	/**
	 * Returns the meta object for class '{@link videowatermarking.GeneticAlgorithm <em>Genetic Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genetic Algorithm</em>'.
	 * @see videowatermarking.GeneticAlgorithm
	 * @generated
	 */
	EClass getGeneticAlgorithm();

	/**
	 * Returns the meta object for the reference list '{@link videowatermarking.GeneticAlgorithm#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Database</em>'.
	 * @see videowatermarking.GeneticAlgorithm#getDatabase()
	 * @see #getGeneticAlgorithm()
	 * @generated
	 */
	EReference getGeneticAlgorithm_Database();

	/**
	 * Returns the meta object for the '{@link videowatermarking.GeneticAlgorithm#VideoToFrames() <em>Video To Frames</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Video To Frames</em>' operation.
	 * @see videowatermarking.GeneticAlgorithm#VideoToFrames()
	 * @generated
	 */
	EOperation getGeneticAlgorithm__VideoToFrames();

	/**
	 * Returns the meta object for the '{@link videowatermarking.GeneticAlgorithm#SelectFrame() <em>Select Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select Frame</em>' operation.
	 * @see videowatermarking.GeneticAlgorithm#SelectFrame()
	 * @generated
	 */
	EOperation getGeneticAlgorithm__SelectFrame();

	/**
	 * Returns the meta object for class '{@link videowatermarking.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see videowatermarking.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link videowatermarking.Video#getVideoName <em>Video Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video Name</em>'.
	 * @see videowatermarking.Video#getVideoName()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_VideoName();

	/**
	 * Returns the meta object for the attribute '{@link videowatermarking.Video#getVideoType <em>Video Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video Type</em>'.
	 * @see videowatermarking.Video#getVideoType()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_VideoType();

	/**
	 * Returns the meta object for the reference list '{@link videowatermarking.Video#getGeneticalgorithm <em>Geneticalgorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Geneticalgorithm</em>'.
	 * @see videowatermarking.Video#getGeneticalgorithm()
	 * @see #getVideo()
	 * @generated
	 */
	EReference getVideo_Geneticalgorithm();

	/**
	 * Returns the meta object for the reference list '{@link videowatermarking.Video#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Database</em>'.
	 * @see videowatermarking.Video#getDatabase()
	 * @see #getVideo()
	 * @generated
	 */
	EReference getVideo_Database();

	/**
	 * Returns the meta object for class '{@link videowatermarking.MPG <em>MPG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPG</em>'.
	 * @see videowatermarking.MPG
	 * @generated
	 */
	EClass getMPG();

	/**
	 * Returns the meta object for class '{@link videowatermarking.MOV <em>MOV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MOV</em>'.
	 * @see videowatermarking.MOV
	 * @generated
	 */
	EClass getMOV();

	/**
	 * Returns the meta object for class '{@link videowatermarking.WebCm <em>Web Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Cm</em>'.
	 * @see videowatermarking.WebCm
	 * @generated
	 */
	EClass getWebCm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VideowatermarkingFactory getVideowatermarkingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link videowatermarking.impl.VideoWatermarkImpl <em>Video Watermark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videowatermarking.impl.VideoWatermarkImpl
		 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getVideoWatermark()
		 * @generated
		 */
		EClass VIDEO_WATERMARK = eINSTANCE.getVideoWatermark();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_WATERMARK__DATABASE = eINSTANCE.getVideoWatermark_Database();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_WATERMARK__FILTER = eINSTANCE.getVideoWatermark_Filter();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_WATERMARK__USER = eINSTANCE.getVideoWatermark_User();

		/**
		 * The meta object literal for the '<em><b>Video</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_WATERMARK__VIDEO = eINSTANCE.getVideoWatermark_Video();

		/**
		 * The meta object literal for the '{@link videowatermarking.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videowatermarking.impl.DatabaseImpl
		 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '<em><b>Frame No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__FRAME_NO = eINSTANCE.getDatabase_FrameNo();

		/**
		 * The meta object literal for the '<em><b>Watermark Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__WATERMARK_IMAGE = eINSTANCE.getDatabase_WatermarkImage();

		/**
		 * The meta object literal for the '<em><b>Watermarked Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__WATERMARKED_IMAGE = eINSTANCE.getDatabase_WatermarkedImage();

		/**
		 * The meta object literal for the '<em><b>Video</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__VIDEO = eINSTANCE.getDatabase_Video();

		/**
		 * The meta object literal for the '<em><b>Save Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE___SAVE_DATA = eINSTANCE.getDatabase__SaveData();

		/**
		 * The meta object literal for the '{@link videowatermarking.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videowatermarking.impl.FilterImpl
		 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILTER___EXECUTE__FILTER = eINSTANCE.getFilter__Execute__Filter();

		/**
		 * The meta object literal for the '{@link videowatermarking.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videowatermarking.impl.UserImpl
		 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Frame No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FRAME_NO = eINSTANCE.getUser_FrameNo();

		/**
		 * The meta object literal for the '<em><b>Video</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__VIDEO = eINSTANCE.getUser_Video();

		/**
		 * The meta object literal for the '<em><b>Load Video</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___LOAD_VIDEO = eINSTANCE.getUser__LoadVideo();

		/**
		 * The meta object literal for the '<em><b>Play Video</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___PLAY_VIDEO = eINSTANCE.getUser__PlayVideo();

		/**
		 * The meta object literal for the '<em><b>Pause Video</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___PAUSE_VIDEO = eINSTANCE.getUser__PauseVideo();

		/**
		 * The meta object literal for the '{@link videowatermarking.impl.GeneticAlgorithmImpl <em>Genetic Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videowatermarking.impl.GeneticAlgorithmImpl
		 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getGeneticAlgorithm()
		 * @generated
		 */
		EClass GENETIC_ALGORITHM = eINSTANCE.getGeneticAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENETIC_ALGORITHM__DATABASE = eINSTANCE.getGeneticAlgorithm_Database();

		/**
		 * The meta object literal for the '<em><b>Video To Frames</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENETIC_ALGORITHM___VIDEO_TO_FRAMES = eINSTANCE.getGeneticAlgorithm__VideoToFrames();

		/**
		 * The meta object literal for the '<em><b>Select Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENETIC_ALGORITHM___SELECT_FRAME = eINSTANCE.getGeneticAlgorithm__SelectFrame();

		/**
		 * The meta object literal for the '{@link videowatermarking.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videowatermarking.impl.VideoImpl
		 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Video Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__VIDEO_NAME = eINSTANCE.getVideo_VideoName();

		/**
		 * The meta object literal for the '<em><b>Video Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__VIDEO_TYPE = eINSTANCE.getVideo_VideoType();

		/**
		 * The meta object literal for the '<em><b>Geneticalgorithm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO__GENETICALGORITHM = eINSTANCE.getVideo_Geneticalgorithm();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO__DATABASE = eINSTANCE.getVideo_Database();

		/**
		 * The meta object literal for the '{@link videowatermarking.impl.MPGImpl <em>MPG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videowatermarking.impl.MPGImpl
		 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getMPG()
		 * @generated
		 */
		EClass MPG = eINSTANCE.getMPG();

		/**
		 * The meta object literal for the '{@link videowatermarking.impl.MOVImpl <em>MOV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videowatermarking.impl.MOVImpl
		 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getMOV()
		 * @generated
		 */
		EClass MOV = eINSTANCE.getMOV();

		/**
		 * The meta object literal for the '{@link videowatermarking.impl.WebCmImpl <em>Web Cm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videowatermarking.impl.WebCmImpl
		 * @see videowatermarking.impl.VideowatermarkingPackageImpl#getWebCm()
		 * @generated
		 */
		EClass WEB_CM = eINSTANCE.getWebCm();

	}

} //VideowatermarkingPackage
