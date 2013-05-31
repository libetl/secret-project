/**
 */
package org.cylio.project.domain.editor.services;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.cylio.project.domain.editor.services.ServicesFactory
 * @model kind="package"
 * @generated
 */
public interface ServicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "services";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://callisto.blizzart.net/redmine/projects/ccu-lbe#services";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.cylio.project.domain.editor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicesPackage eINSTANCE = org.cylio.project.domain.editor.services.impl.ServicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.services.BusinessService <em>Business Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.services.BusinessService
	 * @see org.cylio.project.domain.editor.services.impl.ServicesPackageImpl#getBusinessService()
	 * @generated
	 */
	int BUSINESS_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owner Macro Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__OWNER_MACRO_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__SUBSCRIBERS = 2;

	/**
	 * The number of structural features of the '<em>Business Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.services.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.services.impl.ProviderImpl
	 * @see org.cylio.project.domain.editor.services.impl.ServicesPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = BUSINESS_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Owner Macro Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__OWNER_MACRO_PROCESS = BUSINESS_SERVICE__OWNER_MACRO_PROCESS;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__SUBSCRIBERS = BUSINESS_SERVICE__SUBSCRIBERS;

	/**
	 * The feature id for the '<em><b>Provider Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__PROVIDER_TYPE = BUSINESS_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Software Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__BUSINESS_SOFTWARE_SERVICE = BUSINESS_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__BUSINESS_INFORMATIONS = BUSINESS_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = BUSINESS_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.services.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.services.impl.FeatureImpl
	 * @see org.cylio.project.domain.editor.services.impl.ServicesPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = BUSINESS_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Owner Macro Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNER_MACRO_PROCESS = BUSINESS_SERVICE__OWNER_MACRO_PROCESS;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUBSCRIBERS = BUSINESS_SERVICE__SUBSCRIBERS;

	/**
	 * The feature id for the '<em><b>Business Software Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BUSINESS_SOFTWARE_SERVICE = BUSINESS_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = BUSINESS_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.services.impl.StubImpl <em>Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.services.impl.StubImpl
	 * @see org.cylio.project.domain.editor.services.impl.ServicesPackageImpl#getStub()
	 * @generated
	 */
	int STUB = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__NAME = BUSINESS_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Owner Macro Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__OWNER_MACRO_PROCESS = BUSINESS_SERVICE__OWNER_MACRO_PROCESS;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__SUBSCRIBERS = BUSINESS_SERVICE__SUBSCRIBERS;

	/**
	 * The number of structural features of the '<em>Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_FEATURE_COUNT = BUSINESS_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.services.ProviderType <em>Provider Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.services.ProviderType
	 * @see org.cylio.project.domain.editor.services.impl.ServicesPackageImpl#getProviderType()
	 * @generated
	 */
	int PROVIDER_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.services.BusinessService <em>Business Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Service</em>'.
	 * @see org.cylio.project.domain.editor.services.BusinessService
	 * @generated
	 */
	EClass getBusinessService();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.services.BusinessService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cylio.project.domain.editor.services.BusinessService#getName()
	 * @see #getBusinessService()
	 * @generated
	 */
	EAttribute getBusinessService_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.cylio.project.domain.editor.services.BusinessService#getOwnerMacroProcess <em>Owner Macro Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Macro Process</em>'.
	 * @see org.cylio.project.domain.editor.services.BusinessService#getOwnerMacroProcess()
	 * @see #getBusinessService()
	 * @generated
	 */
	EReference getBusinessService_OwnerMacroProcess();

	/**
	 * Returns the meta object for the reference list '{@link org.cylio.project.domain.editor.services.BusinessService#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribers</em>'.
	 * @see org.cylio.project.domain.editor.services.BusinessService#getSubscribers()
	 * @see #getBusinessService()
	 * @generated
	 */
	EReference getBusinessService_Subscribers();

	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.services.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.cylio.project.domain.editor.services.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.services.Provider#getProviderType <em>Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Type</em>'.
	 * @see org.cylio.project.domain.editor.services.Provider#getProviderType()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_ProviderType();

	/**
	 * Returns the meta object for the reference '{@link org.cylio.project.domain.editor.services.Provider#getBusinessSoftwareService <em>Business Software Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Software Service</em>'.
	 * @see org.cylio.project.domain.editor.services.Provider#getBusinessSoftwareService()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_BusinessSoftwareService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cylio.project.domain.editor.services.Provider#getBusinessInformations <em>Business Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Informations</em>'.
	 * @see org.cylio.project.domain.editor.services.Provider#getBusinessInformations()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_BusinessInformations();

	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.services.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.cylio.project.domain.editor.services.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference '{@link org.cylio.project.domain.editor.services.Feature#getBusinessSoftwareService <em>Business Software Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Software Service</em>'.
	 * @see org.cylio.project.domain.editor.services.Feature#getBusinessSoftwareService()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_BusinessSoftwareService();

	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.services.Stub <em>Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stub</em>'.
	 * @see org.cylio.project.domain.editor.services.Stub
	 * @generated
	 */
	EClass getStub();

	/**
	 * Returns the meta object for enum '{@link org.cylio.project.domain.editor.services.ProviderType <em>Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provider Type</em>'.
	 * @see org.cylio.project.domain.editor.services.ProviderType
	 * @generated
	 */
	EEnum getProviderType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServicesFactory getServicesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.services.BusinessService <em>Business Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.services.BusinessService
		 * @see org.cylio.project.domain.editor.services.impl.ServicesPackageImpl#getBusinessService()
		 * @generated
		 */
		EClass BUSINESS_SERVICE = eINSTANCE.getBusinessService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_SERVICE__NAME = eINSTANCE.getBusinessService_Name();

		/**
		 * The meta object literal for the '<em><b>Owner Macro Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_SERVICE__OWNER_MACRO_PROCESS = eINSTANCE.getBusinessService_OwnerMacroProcess();

		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_SERVICE__SUBSCRIBERS = eINSTANCE.getBusinessService_Subscribers();

		/**
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.services.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.services.impl.ProviderImpl
		 * @see org.cylio.project.domain.editor.services.impl.ServicesPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Provider Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__PROVIDER_TYPE = eINSTANCE.getProvider_ProviderType();

		/**
		 * The meta object literal for the '<em><b>Business Software Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__BUSINESS_SOFTWARE_SERVICE = eINSTANCE.getProvider_BusinessSoftwareService();

		/**
		 * The meta object literal for the '<em><b>Business Informations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__BUSINESS_INFORMATIONS = eINSTANCE.getProvider_BusinessInformations();

		/**
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.services.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.services.impl.FeatureImpl
		 * @see org.cylio.project.domain.editor.services.impl.ServicesPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Business Software Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__BUSINESS_SOFTWARE_SERVICE = eINSTANCE.getFeature_BusinessSoftwareService();

		/**
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.services.impl.StubImpl <em>Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.services.impl.StubImpl
		 * @see org.cylio.project.domain.editor.services.impl.ServicesPackageImpl#getStub()
		 * @generated
		 */
		EClass STUB = eINSTANCE.getStub();

		/**
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.services.ProviderType <em>Provider Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.services.ProviderType
		 * @see org.cylio.project.domain.editor.services.impl.ServicesPackageImpl#getProviderType()
		 * @generated
		 */
		EEnum PROVIDER_TYPE = eINSTANCE.getProviderType();

	}

} //ServicesPackage
