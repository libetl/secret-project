/**
 */
package org.cylio.project.domain.editor.services.impl;

import java.util.Collection;

import org.cylio.project.domain.editor.area.AreaPackage;
import org.cylio.project.domain.editor.area.MacroProcess;

import org.cylio.project.domain.editor.data.BusinessInformation;

import org.cylio.project.domain.editor.services.Provider;
import org.cylio.project.domain.editor.services.ProviderType;
import org.cylio.project.domain.editor.services.ServicesPackage;

import org.cylio.project.domain.editor.software.BusinessSoftwareService;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.services.impl.ProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.impl.ProviderImpl#getOwnerMacroProcess <em>Owner Macro Process</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.impl.ProviderImpl#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.impl.ProviderImpl#getProviderType <em>Provider Type</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.impl.ProviderImpl#getBusinessSoftwareService <em>Business Software Service</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.impl.ProviderImpl#getBusinessInformations <em>Business Informations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderImpl extends EObjectImpl implements Provider {
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
	 * The cached value of the '{@link #getProviderType() <em>Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderType()
	 * @generated
	 * @ordered
	 */
	protected ProviderType providerType;

	/**
	 * The cached value of the '{@link #getBusinessSoftwareService() <em>Business Software Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessSoftwareService()
	 * @generated
	 * @ordered
	 */
	protected BusinessSoftwareService businessSoftwareService;

	/**
	 * The cached value of the '{@link #getBusinessInformations() <em>Business Informations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessInformation> businessInformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicesPackage.Literals.PROVIDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.PROVIDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroProcess getOwnerMacroProcess() {
		if (eContainerFeatureID() != ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS) return null;
		return (MacroProcess)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerMacroProcess(MacroProcess newOwnerMacroProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerMacroProcess, ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerMacroProcess(MacroProcess newOwnerMacroProcess) {
		if (newOwnerMacroProcess != eInternalContainer() || (eContainerFeatureID() != ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS && newOwnerMacroProcess != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS, newOwnerMacroProcess, newOwnerMacroProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MacroProcess> getSubscribers() {
		if (subscribers == null) {
			subscribers = new EObjectWithInverseResolvingEList.ManyInverse<MacroProcess>(MacroProcess.class, this, ServicesPackage.PROVIDER__SUBSCRIBERS, AreaPackage.MACRO_PROCESS__SUBSCRIPTIONS);
		}
		return subscribers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderType getProviderType() {
		return providerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderType(ProviderType newProviderType) {
		ProviderType oldProviderType = providerType;
		providerType = newProviderType == null ? null : newProviderType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.PROVIDER__PROVIDER_TYPE, oldProviderType, providerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessSoftwareService getBusinessSoftwareService() {
		if (businessSoftwareService != null && businessSoftwareService.eIsProxy()) {
			InternalEObject oldBusinessSoftwareService = (InternalEObject)businessSoftwareService;
			businessSoftwareService = (BusinessSoftwareService)eResolveProxy(oldBusinessSoftwareService);
			if (businessSoftwareService != oldBusinessSoftwareService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicesPackage.PROVIDER__BUSINESS_SOFTWARE_SERVICE, oldBusinessSoftwareService, businessSoftwareService));
			}
		}
		return businessSoftwareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessSoftwareService basicGetBusinessSoftwareService() {
		return businessSoftwareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessSoftwareService(BusinessSoftwareService newBusinessSoftwareService) {
		BusinessSoftwareService oldBusinessSoftwareService = businessSoftwareService;
		businessSoftwareService = newBusinessSoftwareService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.PROVIDER__BUSINESS_SOFTWARE_SERVICE, oldBusinessSoftwareService, businessSoftwareService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessInformation> getBusinessInformations() {
		if (businessInformations == null) {
			businessInformations = new EObjectContainmentEList<BusinessInformation>(BusinessInformation.class, this, ServicesPackage.PROVIDER__BUSINESS_INFORMATIONS);
		}
		return businessInformations;
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
			case ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerMacroProcess((MacroProcess)otherEnd, msgs);
			case ServicesPackage.PROVIDER__SUBSCRIBERS:
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
			case ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS:
				return basicSetOwnerMacroProcess(null, msgs);
			case ServicesPackage.PROVIDER__SUBSCRIBERS:
				return ((InternalEList<?>)getSubscribers()).basicRemove(otherEnd, msgs);
			case ServicesPackage.PROVIDER__BUSINESS_INFORMATIONS:
				return ((InternalEList<?>)getBusinessInformations()).basicRemove(otherEnd, msgs);
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
			case ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS:
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
			case ServicesPackage.PROVIDER__NAME:
				return getName();
			case ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS:
				return getOwnerMacroProcess();
			case ServicesPackage.PROVIDER__SUBSCRIBERS:
				return getSubscribers();
			case ServicesPackage.PROVIDER__PROVIDER_TYPE:
				return getProviderType();
			case ServicesPackage.PROVIDER__BUSINESS_SOFTWARE_SERVICE:
				if (resolve) return getBusinessSoftwareService();
				return basicGetBusinessSoftwareService();
			case ServicesPackage.PROVIDER__BUSINESS_INFORMATIONS:
				return getBusinessInformations();
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
			case ServicesPackage.PROVIDER__NAME:
				setName((String)newValue);
				return;
			case ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS:
				setOwnerMacroProcess((MacroProcess)newValue);
				return;
			case ServicesPackage.PROVIDER__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends MacroProcess>)newValue);
				return;
			case ServicesPackage.PROVIDER__PROVIDER_TYPE:
				setProviderType((ProviderType) newValue);
				return;
			case ServicesPackage.PROVIDER__BUSINESS_SOFTWARE_SERVICE:
				setBusinessSoftwareService((BusinessSoftwareService)newValue);
				return;
			case ServicesPackage.PROVIDER__BUSINESS_INFORMATIONS:
				getBusinessInformations().clear();
				getBusinessInformations().addAll((Collection<? extends BusinessInformation>)newValue);
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
			case ServicesPackage.PROVIDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS:
				setOwnerMacroProcess((MacroProcess)null);
				return;
			case ServicesPackage.PROVIDER__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case ServicesPackage.PROVIDER__PROVIDER_TYPE:
				setProviderType((ProviderType)null);
				return;
			case ServicesPackage.PROVIDER__BUSINESS_SOFTWARE_SERVICE:
				setBusinessSoftwareService((BusinessSoftwareService)null);
				return;
			case ServicesPackage.PROVIDER__BUSINESS_INFORMATIONS:
				getBusinessInformations().clear();
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
			case ServicesPackage.PROVIDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicesPackage.PROVIDER__OWNER_MACRO_PROCESS:
				return getOwnerMacroProcess() != null;
			case ServicesPackage.PROVIDER__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
			case ServicesPackage.PROVIDER__PROVIDER_TYPE:
				return providerType != null;
			case ServicesPackage.PROVIDER__BUSINESS_SOFTWARE_SERVICE:
				return businessSoftwareService != null;
			case ServicesPackage.PROVIDER__BUSINESS_INFORMATIONS:
				return businessInformations != null && !businessInformations.isEmpty();
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
		result.append(", providerType: ");
		result.append(providerType);
		result.append(')');
		return result.toString();
	}

} //ProviderImpl
