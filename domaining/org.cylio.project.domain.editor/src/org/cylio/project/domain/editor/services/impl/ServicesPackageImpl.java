/**
 */
package org.cylio.project.domain.editor.services.impl;

import org.cylio.project.domain.editor.EditorPackage;

import org.cylio.project.domain.editor.area.AreaPackage;

import org.cylio.project.domain.editor.area.impl.AreaPackageImpl;

import org.cylio.project.domain.editor.data.DataPackage;

import org.cylio.project.domain.editor.data.impl.DataPackageImpl;

import org.cylio.project.domain.editor.domaintype.DomaintypePackage;

import org.cylio.project.domain.editor.domaintype.impl.DomaintypePackageImpl;

import org.cylio.project.domain.editor.impl.EditorPackageImpl;

import org.cylio.project.domain.editor.services.BusinessService;
import org.cylio.project.domain.editor.services.Feature;
import org.cylio.project.domain.editor.services.Provider;
import org.cylio.project.domain.editor.services.ProviderType;
import org.cylio.project.domain.editor.services.ServicesFactory;
import org.cylio.project.domain.editor.services.ServicesPackage;
import org.cylio.project.domain.editor.services.Stub;

import org.cylio.project.domain.editor.software.SoftwarePackage;

import org.cylio.project.domain.editor.software.impl.SoftwarePackageImpl;

import org.cylio.project.domain.editor.util.UtilPackage;

import org.cylio.project.domain.editor.util.impl.UtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicesPackageImpl extends EPackageImpl implements ServicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerTypeEEnum = null;

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
	 * @see org.cylio.project.domain.editor.services.ServicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicesPackageImpl() {
		super(eNS_URI, ServicesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicesPackage init() {
		if (isInited) return (ServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI);

		// Obtain or create and register package
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EditorPackageImpl theEditorPackage = (EditorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI) instanceof EditorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI) : EditorPackage.eINSTANCE);
		DomaintypePackageImpl theDomaintypePackage = (DomaintypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomaintypePackage.eNS_URI) instanceof DomaintypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomaintypePackage.eNS_URI) : DomaintypePackage.eINSTANCE);
		AreaPackageImpl theAreaPackage = (AreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AreaPackage.eNS_URI) instanceof AreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AreaPackage.eNS_URI) : AreaPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		SoftwarePackageImpl theSoftwarePackage = (SoftwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI) instanceof SoftwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI) : SoftwarePackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theServicesPackage.createPackageContents();
		theEditorPackage.createPackageContents();
		theDomaintypePackage.createPackageContents();
		theAreaPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theSoftwarePackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theServicesPackage.initializePackageContents();
		theEditorPackage.initializePackageContents();
		theDomaintypePackage.initializePackageContents();
		theAreaPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theSoftwarePackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicesPackage.eNS_URI, theServicesPackage);
		return theServicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessService() {
		return businessServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessService_Name() {
		return (EAttribute)businessServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessService_OwnerMacroProcess() {
		return (EReference)businessServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessService_Subscribers() {
		return (EReference)businessServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_ProviderType() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_BusinessSoftwareService() {
		return (EReference)providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_BusinessInformations() {
		return (EReference)providerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_BusinessSoftwareService() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStub() {
		return stubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProviderType() {
		return providerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesFactory getServicesFactory() {
		return (ServicesFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		businessServiceEClass = createEClass(BUSINESS_SERVICE);
		createEAttribute(businessServiceEClass, BUSINESS_SERVICE__NAME);
		createEReference(businessServiceEClass, BUSINESS_SERVICE__OWNER_MACRO_PROCESS);
		createEReference(businessServiceEClass, BUSINESS_SERVICE__SUBSCRIBERS);

		providerEClass = createEClass(PROVIDER);
		createEAttribute(providerEClass, PROVIDER__PROVIDER_TYPE);
		createEReference(providerEClass, PROVIDER__BUSINESS_SOFTWARE_SERVICE);
		createEReference(providerEClass, PROVIDER__BUSINESS_INFORMATIONS);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__BUSINESS_SOFTWARE_SERVICE);

		stubEClass = createEClass(STUB);

		// Create enums
		providerTypeEEnum = createEEnum(PROVIDER_TYPE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AreaPackage theAreaPackage = (AreaPackage)EPackage.Registry.INSTANCE.getEPackage(AreaPackage.eNS_URI);
		SoftwarePackage theSoftwarePackage = (SoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		providerEClass.getESuperTypes().add(this.getBusinessService());
		featureEClass.getESuperTypes().add(this.getBusinessService());
		stubEClass.getESuperTypes().add(this.getBusinessService());

		// Initialize classes and features; add operations and parameters
		initEClass(businessServiceEClass, BusinessService.class, "BusinessService", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessService_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessService_OwnerMacroProcess(), theAreaPackage.getMacroProcess(), theAreaPackage.getMacroProcess_BusinessServices(), "ownerMacroProcess", null, 0, 1, BusinessService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessService_Subscribers(), theAreaPackage.getMacroProcess(), theAreaPackage.getMacroProcess_Subscriptions(), "subscribers", null, 0, -1, BusinessService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvider_ProviderType(), this.getProviderType(), "providerType", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvider_BusinessSoftwareService(), theSoftwarePackage.getBusinessSoftwareService(), null, "businessSoftwareService", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvider_BusinessInformations(), theDataPackage.getBusinessInformation(), null, "businessInformations", null, 0, -1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_BusinessSoftwareService(), theSoftwarePackage.getBusinessSoftwareService(), null, "businessSoftwareService", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stubEClass, Stub.class, "Stub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(providerTypeEEnum, ProviderType.class, "ProviderType");
		addEEnumLiteral(providerTypeEEnum, ProviderType.WEB_SERVICE);
		addEEnumLiteral(providerTypeEEnum, ProviderType.STREAM);
		addEEnumLiteral(providerTypeEEnum, ProviderType.MQ_MESSAGE);
		addEEnumLiteral(providerTypeEEnum, ProviderType.MANUAL_SCRIPT);
	}

} //ServicesPackageImpl
