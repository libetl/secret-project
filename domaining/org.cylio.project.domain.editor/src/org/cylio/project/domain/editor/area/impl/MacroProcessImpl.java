/**
 */
package org.cylio.project.domain.editor.area.impl;

import java.util.Collection;

import org.cylio.project.domain.editor.area.Area;
import org.cylio.project.domain.editor.area.AreaPackage;
import org.cylio.project.domain.editor.area.MacroProcess;

import org.cylio.project.domain.editor.services.BusinessService;
import org.cylio.project.domain.editor.services.ServicesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macro Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.area.impl.MacroProcessImpl#getBusinessServices <em>Business Services</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.impl.MacroProcessImpl#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.impl.MacroProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.impl.MacroProcessImpl#getOwnerArea <em>Owner Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MacroProcessImpl extends EObjectImpl implements MacroProcess {
	/**
	 * The cached value of the '{@link #getBusinessServices() <em>Business Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessServices()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessService> businessServices;

	/**
	 * The cached value of the '{@link #getSubscriptions() <em>Subscriptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessService> subscriptions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacroProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AreaPackage.Literals.MACRO_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessService> getBusinessServices() {
		if (businessServices == null) {
			businessServices = new EObjectContainmentWithInverseEList<BusinessService>(BusinessService.class, this, AreaPackage.MACRO_PROCESS__BUSINESS_SERVICES, ServicesPackage.BUSINESS_SERVICE__OWNER_MACRO_PROCESS);
		}
		return businessServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessService> getSubscriptions() {
		if (subscriptions == null) {
			subscriptions = new EObjectWithInverseResolvingEList.ManyInverse<BusinessService>(BusinessService.class, this, AreaPackage.MACRO_PROCESS__SUBSCRIPTIONS, ServicesPackage.BUSINESS_SERVICE__SUBSCRIBERS);
		}
		return subscriptions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AreaPackage.MACRO_PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area getOwnerArea() {
		if (eContainerFeatureID() != AreaPackage.MACRO_PROCESS__OWNER_AREA) return null;
		return (Area)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerArea(Area newOwnerArea, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerArea, AreaPackage.MACRO_PROCESS__OWNER_AREA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerArea(Area newOwnerArea) {
		if (newOwnerArea != eInternalContainer() || (eContainerFeatureID() != AreaPackage.MACRO_PROCESS__OWNER_AREA && newOwnerArea != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerArea))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerArea != null)
				msgs = ((InternalEObject)newOwnerArea).eInverseAdd(this, AreaPackage.AREA__MACRO_PROCESSES, Area.class, msgs);
			msgs = basicSetOwnerArea(newOwnerArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AreaPackage.MACRO_PROCESS__OWNER_AREA, newOwnerArea, newOwnerArea));
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
			case AreaPackage.MACRO_PROCESS__BUSINESS_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessServices()).basicAdd(otherEnd, msgs);
			case AreaPackage.MACRO_PROCESS__SUBSCRIPTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubscriptions()).basicAdd(otherEnd, msgs);
			case AreaPackage.MACRO_PROCESS__OWNER_AREA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerArea((Area)otherEnd, msgs);
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
			case AreaPackage.MACRO_PROCESS__BUSINESS_SERVICES:
				return ((InternalEList<?>)getBusinessServices()).basicRemove(otherEnd, msgs);
			case AreaPackage.MACRO_PROCESS__SUBSCRIPTIONS:
				return ((InternalEList<?>)getSubscriptions()).basicRemove(otherEnd, msgs);
			case AreaPackage.MACRO_PROCESS__OWNER_AREA:
				return basicSetOwnerArea(null, msgs);
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
			case AreaPackage.MACRO_PROCESS__OWNER_AREA:
				return eInternalContainer().eInverseRemove(this, AreaPackage.AREA__MACRO_PROCESSES, Area.class, msgs);
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
			case AreaPackage.MACRO_PROCESS__BUSINESS_SERVICES:
				return getBusinessServices();
			case AreaPackage.MACRO_PROCESS__SUBSCRIPTIONS:
				return getSubscriptions();
			case AreaPackage.MACRO_PROCESS__NAME:
				return getName();
			case AreaPackage.MACRO_PROCESS__OWNER_AREA:
				return getOwnerArea();
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
			case AreaPackage.MACRO_PROCESS__BUSINESS_SERVICES:
				getBusinessServices().clear();
				getBusinessServices().addAll((Collection<? extends BusinessService>)newValue);
				return;
			case AreaPackage.MACRO_PROCESS__SUBSCRIPTIONS:
				getSubscriptions().clear();
				getSubscriptions().addAll((Collection<? extends BusinessService>)newValue);
				return;
			case AreaPackage.MACRO_PROCESS__NAME:
				setName((String)newValue);
				return;
			case AreaPackage.MACRO_PROCESS__OWNER_AREA:
				setOwnerArea((Area)newValue);
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
			case AreaPackage.MACRO_PROCESS__BUSINESS_SERVICES:
				getBusinessServices().clear();
				return;
			case AreaPackage.MACRO_PROCESS__SUBSCRIPTIONS:
				getSubscriptions().clear();
				return;
			case AreaPackage.MACRO_PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AreaPackage.MACRO_PROCESS__OWNER_AREA:
				setOwnerArea((Area)null);
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
			case AreaPackage.MACRO_PROCESS__BUSINESS_SERVICES:
				return businessServices != null && !businessServices.isEmpty();
			case AreaPackage.MACRO_PROCESS__SUBSCRIPTIONS:
				return subscriptions != null && !subscriptions.isEmpty();
			case AreaPackage.MACRO_PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AreaPackage.MACRO_PROCESS__OWNER_AREA:
				return getOwnerArea() != null;
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

} //MacroProcessImpl
