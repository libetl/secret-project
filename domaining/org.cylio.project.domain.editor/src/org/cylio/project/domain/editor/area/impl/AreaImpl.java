/**
 */
package org.cylio.project.domain.editor.area.impl;

import java.util.Collection;

import org.cylio.project.domain.editor.area.Area;
import org.cylio.project.domain.editor.area.AreaPackage;
import org.cylio.project.domain.editor.area.MacroProcess;

import org.cylio.project.domain.editor.data.BusinessInformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.area.impl.AreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.impl.AreaImpl#getMacroProcesses <em>Macro Processes</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.impl.AreaImpl#getBusinessInformationsNotUsed <em>Business Informations Not Used</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.impl.AreaImpl#getPurpose <em>Purpose</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AreaImpl extends EObjectImpl implements Area {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMacroProcesses() <em>Macro Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacroProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<MacroProcess> macroProcesses;

	/**
	 * The cached value of the '{@link #getBusinessInformationsNotUsed() <em>Business Informations Not Used</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessInformationsNotUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessInformation> businessInformationsNotUsed;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AreaPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AreaPackage.AREA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MacroProcess> getMacroProcesses() {
		if (macroProcesses == null) {
			macroProcesses = new EObjectContainmentWithInverseEList<MacroProcess>(MacroProcess.class, this, AreaPackage.AREA__MACRO_PROCESSES, AreaPackage.MACRO_PROCESS__OWNER_AREA);
		}
		return macroProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessInformation> getBusinessInformationsNotUsed() {
		if (businessInformationsNotUsed == null) {
			businessInformationsNotUsed = new EObjectContainmentEList<BusinessInformation>(BusinessInformation.class, this, AreaPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED);
		}
		return businessInformationsNotUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AreaPackage.AREA__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AreaPackage.AREA__MACRO_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMacroProcesses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AreaPackage.AREA__MACRO_PROCESSES:
				return ((InternalEList<?>)getMacroProcesses()).basicRemove(otherEnd, msgs);
			case AreaPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED:
				return ((InternalEList<?>)getBusinessInformationsNotUsed()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AreaPackage.AREA__NAME:
				return getName();
			case AreaPackage.AREA__MACRO_PROCESSES:
				return getMacroProcesses();
			case AreaPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED:
				return getBusinessInformationsNotUsed();
			case AreaPackage.AREA__PURPOSE:
				return getPurpose();
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
			case AreaPackage.AREA__NAME:
				setName((String)newValue);
				return;
			case AreaPackage.AREA__MACRO_PROCESSES:
				getMacroProcesses().clear();
				getMacroProcesses().addAll((Collection<? extends MacroProcess>)newValue);
				return;
			case AreaPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED:
				getBusinessInformationsNotUsed().clear();
				getBusinessInformationsNotUsed().addAll((Collection<? extends BusinessInformation>)newValue);
				return;
			case AreaPackage.AREA__PURPOSE:
				setPurpose((String)newValue);
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
			case AreaPackage.AREA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AreaPackage.AREA__MACRO_PROCESSES:
				getMacroProcesses().clear();
				return;
			case AreaPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED:
				getBusinessInformationsNotUsed().clear();
				return;
			case AreaPackage.AREA__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
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
			case AreaPackage.AREA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AreaPackage.AREA__MACRO_PROCESSES:
				return macroProcesses != null && !macroProcesses.isEmpty();
			case AreaPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED:
				return businessInformationsNotUsed != null && !businessInformationsNotUsed.isEmpty();
			case AreaPackage.AREA__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //AreaImpl
