/**
 */
package videowatermarking.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import videowatermarking.Database;
import videowatermarking.GeneticAlgorithm;
import videowatermarking.VideowatermarkingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genetic Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videowatermarking.impl.GeneticAlgorithmImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneticAlgorithmImpl extends FilterImpl implements GeneticAlgorithm {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<Database> database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneticAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideowatermarkingPackage.Literals.GENETIC_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Database> getDatabase() {
		if (database == null) {
			database = new EObjectResolvingEList<Database>(Database.class, this,
					VideowatermarkingPackage.GENETIC_ALGORITHM__DATABASE);
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void VideoToFrames() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SelectFrame() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VideowatermarkingPackage.GENETIC_ALGORITHM__DATABASE:
			return getDatabase();
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
		case VideowatermarkingPackage.GENETIC_ALGORITHM__DATABASE:
			getDatabase().clear();
			getDatabase().addAll((Collection<? extends Database>) newValue);
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
		case VideowatermarkingPackage.GENETIC_ALGORITHM__DATABASE:
			getDatabase().clear();
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
		case VideowatermarkingPackage.GENETIC_ALGORITHM__DATABASE:
			return database != null && !database.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case VideowatermarkingPackage.GENETIC_ALGORITHM___VIDEO_TO_FRAMES:
			VideoToFrames();
			return null;
		case VideowatermarkingPackage.GENETIC_ALGORITHM___SELECT_FRAME:
			SelectFrame();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GeneticAlgorithmImpl
