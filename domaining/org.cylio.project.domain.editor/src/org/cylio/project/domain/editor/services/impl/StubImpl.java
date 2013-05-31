/**
 */
package org.cylio.project.domain.editor.services.impl;

import java.util.Collection;

import org.cylio.project.domain.editor.area.AreaPackage;
import org.cylio.project.domain.editor.area.MacroProcess;

import org.cylio.project.domain.editor.services.ServicesPackage;
import org.cylio.project.domain.editor.services.Stub;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.services.impl.StubImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.impl.StubImpl#getOwnerMacroProcess <em>Owner Macro Process</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.impl.StubImpl#getSubscribers <em>Subscribers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StubImpl extends EObjectImpl implements Stub {
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
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<MacroProcess> subscribers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicesPackage.Literals.STUB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.STUB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroProcess getOwnerMacroProcess() {
		if (eContainerFeatureID() != ServicesPackage.STUB__OWNER_MACRO_PROCESS) return null;
		return (MacroProcess)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerMacroProcess(MacroProcess newOwnerMacroProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerMacroProcess, ServicesPackage.STUB__OWNER_MACRO_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerMacroProcess(MacroProcess newOwnerMacroProcess) {
		if (newOwnerMacroProcess != eInternalContainer() || (eContainerFeatureID() != ServicesPackage.STUB__OWNER_MACRO_PROCESS && newOwnerMacroProcess != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerMacroProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerMacroProcess != null)
				msgs = ((InternalEObject)newOwnerMacroProcess).eInverseAdd(this, AreaPackage.MACRO_PROCESS__BUSINESS_SERVICES, MacroProcess.class, msgs);
			msgs = basicSetOwnerMacroProcess(newOwnerMacroProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.STUB__OWNER_MACRO_PROCESS, newOwnerMacroProcess, newOwnerMacroProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MacroProcess> getSubscribers() {
		if (subscribers == null) {
			subscribers = new EObjectWithInverseResolvingEList.ManyInverse<MacroProcess>(MacroProcess.class, this, ServicesPackage.STUB__SUBSCRIBERS, AreaPackage.MACRO_PROCESS__SUBSCRIPTIONS);
		}
		return subscribers;
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
			case ServicesPackage.STUB__OWNER_MACRO_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerMacroProcess((MacroProcess)otherEnd, msgs);
			case ServicesPackage.STUB__SUBSCRIBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubscribers()).basicAdd(otherEnd, msgs);
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
			case ServicesPackage.STUB__OWNER_MACRO_PROCESS:
				return basicSetOwnerMacroProcess(null, msgs);
			case ServicesPackage.STUB__SUBSCRIBERS:
				return ((InternalEList<?>)getSubscribers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ServicesPackage.STUB__OWNER_MACRO_PROCESS:
				return eInternalContainer().eInverseRemove(this, AreaPackage.MACRO_PROCESS__BUSINESS_SERVICES, MacroProcess.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicesPackage.STUB__NAME:
				return getName();
			case ServicesPackage.STUB__OWNER_MACRO_PROCESS:
				return getOwnerMacroProcess();
			case ServicesPackage.STUB__SUBSCRIBERS:
				return getSubscribers();
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
			case ServicesPackage.STUB__NAME:
				setName((String)newValue);
				return;
			case ServicesPackage.STUB__OWNER_MACRO_PROCESS:
				setOwnerMacroProcess((MacroProcess)newValue);
				return;
			case ServicesPackage.STUB__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends MacroProcess>)newValue);
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
			case ServicesPackage.STUB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicesPackage.STUB__OWNER_MACRO_PROCESS:
				setOwnerMacroProcess((MacroProcess)null);
				return;
			case ServicesPackage.STUB__SUBSCRIBERS:
				getSubscribers().clear();
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
			case ServicesPackage.STUB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicesPackage.STUB__OWNER_MACRO_PROCESS:
				return getOwnerMacroProcess() != null;
			case ServicesPackage.STUB__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //StubImpl
