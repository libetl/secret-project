/**
 */
package org.cylio.project.domain.editor.software.impl;

import org.cylio.project.domain.editor.EditorPackage;

import org.cylio.project.domain.editor.area.AreaPackage;

import org.cylio.project.domain.editor.area.impl.AreaPackageImpl;

import org.cylio.project.domain.editor.data.DataPackage;

import org.cylio.project.domain.editor.data.impl.DataPackageImpl;

import org.cylio.project.domain.editor.domaintype.DomaintypePackage;

import org.cylio.project.domain.editor.domaintype.impl.DomaintypePackageImpl;

import org.cylio.project.domain.editor.impl.EditorPackageImpl;

import org.cylio.project.domain.editor.services.ServicesPackage;

import org.cylio.project.domain.editor.services.impl.ServicesPackageImpl;

import org.cylio.project.domain.editor.software.Application;
import org.cylio.project.domain.editor.software.BusinessSoftwareService;
import org.cylio.project.domain.editor.software.Project;
import org.cylio.project.domain.editor.software.SoftwareFactory;
import org.cylio.project.domain.editor.software.SoftwarePackage;

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
public class SoftwarePackageImpl extends EPackageImpl implements SoftwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessSoftwareServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

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
	 * @see org.cylio.project.domain.editor.software.SoftwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoftwarePackageImpl() {
		super(eNS_URI, SoftwareFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SoftwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoftwarePackage init() {
		if (isInited) return (SoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI);

		// Obtain or create and register package
		SoftwarePackageImpl theSoftwarePackage = (SoftwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoftwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoftwarePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EditorPackageImpl theEditorPackage = (EditorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI) instanceof EditorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI) : EditorPackage.eINSTANCE);
		DomaintypePackageImpl theDomaintypePackage = (DomaintypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomaintypePackage.eNS_URI) instanceof DomaintypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomaintypePackage.eNS_URI) : DomaintypePackage.eINSTANCE);
		AreaPackageImpl theAreaPackage = (AreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AreaPackage.eNS_URI) instanceof AreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AreaPackage.eNS_URI) : AreaPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theSoftwarePackage.createPackageContents();
		theEditorPackage.createPackageContents();
		theDomaintypePackage.createPackageContents();
		theAreaPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theSoftwarePackage.initializePackageContents();
		theEditorPackage.initializePackageContents();
		theDomaintypePackage.initializePackageContents();
		theAreaPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSoftwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoftwarePackage.eNS_URI, theSoftwarePackage);
		return theSoftwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessSoftwareService() {
		return businessSoftwareServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessSoftwareService_Active() {
		return (EAttribute)businessSoftwareServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessSoftwareService_Project() {
		return (EReference)businessSoftwareServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessSoftwareService_Applications() {
		return (EReference)businessSoftwareServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_BusinessSoftwareServices() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_AcceptanceDate() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ProductionDate() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Outsourced() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFactory getSoftwareFactory() {
		return (SoftwareFactory)getEFactoryInstance();
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
		businessSoftwareServiceEClass = createEClass(BUSINESS_SOFTWARE_SERVICE);
		createEAttribute(businessSoftwareServiceEClass, BUSINESS_SOFTWARE_SERVICE__ACTIVE);
		createEReference(businessSoftwareServiceEClass, BUSINESS_SOFTWARE_SERVICE__PROJECT);
		createEReference(businessSoftwareServiceEClass, BUSINESS_SOFTWARE_SERVICE__APPLICATIONS);

		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEReference(applicationEClass, APPLICATION__BUSINESS_SOFTWARE_SERVICES);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__ACCEPTANCE_DATE);
		createEAttribute(projectEClass, PROJECT__PRODUCTION_DATE);
		createEAttribute(projectEClass, PROJECT__OUTSOURCED);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(businessSoftwareServiceEClass, BusinessSoftwareService.class, "BusinessSoftwareService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessSoftwareService_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, BusinessSoftwareService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessSoftwareService_Project(), this.getProject(), null, "project", null, 0, 1, BusinessSoftwareService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessSoftwareService_Applications(), this.getApplication(), this.getApplication_BusinessSoftwareServices(), "applications", null, 0, -1, BusinessSoftwareService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_BusinessSoftwareServices(), this.getBusinessSoftwareService(), this.getBusinessSoftwareService_Applications(), "businessSoftwareServices", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_AcceptanceDate(), ecorePackage.getEDate(), "acceptanceDate", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ProductionDate(), ecorePackage.getEDate(), "productionDate", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Outsourced(), ecorePackage.getEBoolean(), "outsourced", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SoftwarePackageImpl
