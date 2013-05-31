/**
 */
package org.cylio.project.domain.editor.domaintype.impl;

import org.cylio.project.domain.editor.EditorPackage;

import org.cylio.project.domain.editor.area.AreaPackage;

import org.cylio.project.domain.editor.area.impl.AreaPackageImpl;

import org.cylio.project.domain.editor.data.DataPackage;

import org.cylio.project.domain.editor.data.impl.DataPackageImpl;

import org.cylio.project.domain.editor.domaintype.BusinessDomain;
import org.cylio.project.domain.editor.domaintype.DomaintypeFactory;
import org.cylio.project.domain.editor.domaintype.DomaintypePackage;
import org.cylio.project.domain.editor.domaintype.FunctionalDomain;

import org.cylio.project.domain.editor.impl.EditorPackageImpl;

import org.cylio.project.domain.editor.services.ServicesPackage;

import org.cylio.project.domain.editor.services.impl.ServicesPackageImpl;

import org.cylio.project.domain.editor.software.SoftwarePackage;

import org.cylio.project.domain.editor.software.impl.SoftwarePackageImpl;

import org.cylio.project.domain.editor.util.UtilPackage;

import org.cylio.project.domain.editor.util.impl.UtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomaintypePackageImpl extends EPackageImpl implements DomaintypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessDomainEClass = null;

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
	 * @see org.cylio.project.domain.editor.domaintype.DomaintypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomaintypePackageImpl() {
		super(eNS_URI, DomaintypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DomaintypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomaintypePackage init() {
		if (isInited) return (DomaintypePackage)EPackage.Registry.INSTANCE.getEPackage(DomaintypePackage.eNS_URI);

		// Obtain or create and register package
		DomaintypePackageImpl theDomaintypePackage = (DomaintypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomaintypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomaintypePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EditorPackageImpl theEditorPackage = (EditorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI) instanceof EditorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI) : EditorPackage.eINSTANCE);
		AreaPackageImpl theAreaPackage = (AreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AreaPackage.eNS_URI) instanceof AreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AreaPackage.eNS_URI) : AreaPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		SoftwarePackageImpl theSoftwarePackage = (SoftwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI) instanceof SoftwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI) : SoftwarePackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theDomaintypePackage.createPackageContents();
		theEditorPackage.createPackageContents();
		theAreaPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theSoftwarePackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theDomaintypePackage.initializePackageContents();
		theEditorPackage.initializePackageContents();
		theAreaPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theSoftwarePackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomaintypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomaintypePackage.eNS_URI, theDomaintypePackage);
		return theDomaintypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalDomain() {
		return functionalDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalDomain_Name() {
		return (EAttribute)functionalDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDomain_Areas() {
		return (EReference)functionalDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessDomain() {
		return businessDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessDomain_Name() {
		return (EAttribute)businessDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessDomain_FunctionalDomains() {
		return (EReference)businessDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessDomain_Color() {
		return (EAttribute)businessDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomaintypeFactory getDomaintypeFactory() {
		return (DomaintypeFactory)getEFactoryInstance();
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
		functionalDomainEClass = createEClass(FUNCTIONAL_DOMAIN);
		createEAttribute(functionalDomainEClass, FUNCTIONAL_DOMAIN__NAME);
		createEReference(functionalDomainEClass, FUNCTIONAL_DOMAIN__AREAS);

		businessDomainEClass = createEClass(BUSINESS_DOMAIN);
		createEAttribute(businessDomainEClass, BUSINESS_DOMAIN__NAME);
		createEReference(businessDomainEClass, BUSINESS_DOMAIN__FUNCTIONAL_DOMAINS);
		createEAttribute(businessDomainEClass, BUSINESS_DOMAIN__COLOR);
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
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(functionalDomainEClass, FunctionalDomain.class, "FunctionalDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalDomain_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionalDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDomain_Areas(), theAreaPackage.getArea(), null, "areas", null, 0, -1, FunctionalDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessDomainEClass, BusinessDomain.class, "BusinessDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessDomain_Name(), ecorePackage.getEString(), "name", "", 0, 1, BusinessDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessDomain_FunctionalDomains(), this.getFunctionalDomain(), null, "functionalDomains", null, 0, -1, BusinessDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessDomain_Color(), theUtilPackage.getColor(), "color", "", 0, 1, BusinessDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DomaintypePackageImpl
