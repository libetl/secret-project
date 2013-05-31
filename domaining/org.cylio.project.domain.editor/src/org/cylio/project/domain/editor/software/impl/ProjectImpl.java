/**
 */
package org.cylio.project.domain.editor.software.impl;

import java.util.Date;

import org.cylio.project.domain.editor.software.Project;
import org.cylio.project.domain.editor.software.SoftwarePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.software.impl.ProjectImpl#getAcceptanceDate <em>Acceptance Date</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.software.impl.ProjectImpl#getProductionDate <em>Production Date</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.software.impl.ProjectImpl#isOutsourced <em>Outsourced</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project {
	/**
	 * The default value of the '{@link #getAcceptanceDate() <em>Acceptance Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACCEPTANCE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcceptanceDate() <em>Acceptance Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceDate()
	 * @generated
	 * @ordered
	 */
	protected Date acceptanceDate = ACCEPTANCE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductionDate() <em>Production Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PRODUCTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductionDate() <em>Production Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionDate()
	 * @generated
	 * @ordered
	 */
	protected Date productionDate = PRODUCTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutsourced() <em>Outsourced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutsourced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTSOURCED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutsourced() <em>Outsourced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutsourced()
	 * @generated
	 * @ordered
	 */
	protected boolean outsourced = OUTSOURCED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAcceptanceDate() {
		return acceptanceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceDate(Date newAcceptanceDate) {
		Date oldAcceptanceDate = acceptanceDate;
		acceptanceDate = newAcceptanceDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.PROJECT__ACCEPTANCE_DATE, oldAcceptanceDate, acceptanceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getProductionDate() {
		return productionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductionDate(Date newProductionDate) {
		Date oldProductionDate = productionDate;
		productionDate = newProductionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.PROJECT__PRODUCTION_DATE, oldProductionDate, productionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutsourced() {
		return outsourced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutsourced(boolean newOutsourced) {
		boolean oldOutsourced = outsourced;
		outsourced = newOutsourced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.PROJECT__OUTSOURCED, oldOutsourced, outsourced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.PROJECT__ACCEPTANCE_DATE:
				return getAcceptanceDate();
			case SoftwarePackage.PROJECT__PRODUCTION_DATE:
				return getProductionDate();
			case SoftwarePackage.PROJECT__OUTSOURCED:
				return isOutsourced();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoftwarePackage.PROJECT__ACCEPTANCE_DATE:
				setAcceptanceDate((Date)newValue);
				return;
			case SoftwarePackage.PROJECT__PRODUCTION_DATE:
				setProductionDate((Date)newValue);
				return;
			case SoftwarePackage.PROJECT__OUTSOURCED:
				setOutsourced((Boolean)newValue);
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
			case SoftwarePackage.PROJECT__ACCEPTANCE_DATE:
				setAcceptanceDate(ACCEPTANCE_DATE_EDEFAULT);
				return;
			case SoftwarePackage.PROJECT__PRODUCTION_DATE:
				setProductionDate(PRODUCTION_DATE_EDEFAULT);
				return;
			case SoftwarePackage.PROJECT__OUTSOURCED:
				setOutsourced(OUTSOURCED_EDEFAULT);
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
			case SoftwarePackage.PROJECT__ACCEPTANCE_DATE:
				return ACCEPTANCE_DATE_EDEFAULT == null ? acceptanceDate != null : !ACCEPTANCE_DATE_EDEFAULT.equals(acceptanceDate);
			case SoftwarePackage.PROJECT__PRODUCTION_DATE:
				return PRODUCTION_DATE_EDEFAULT == null ? productionDate != null : !PRODUCTION_DATE_EDEFAULT.equals(productionDate);
			case SoftwarePackage.PROJECT__OUTSOURCED:
				return outsourced != OUTSOURCED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (acceptanceDate: ");
		result.append(acceptanceDate);
		result.append(", productionDate: ");
		result.append(productionDate);
		result.append(", outsourced: ");
		result.append(outsourced);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
