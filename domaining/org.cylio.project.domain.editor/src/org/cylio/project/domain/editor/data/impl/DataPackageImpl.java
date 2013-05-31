/**
 */
package org.cylio.project.domain.editor.data.impl;

import org.cylio.project.domain.editor.EditorPackage;

import org.cylio.project.domain.editor.area.AreaPackage;

import org.cylio.project.domain.editor.area.impl.AreaPackageImpl;

import org.cylio.project.domain.editor.data.BusinessInformation;
import org.cylio.project.domain.editor.data.DataFactory;
import org.cylio.project.domain.editor.data.DataPackage;

import org.cylio.project.domain.editor.domaintype.DomaintypePackage;

import org.cylio.project.domain.editor.domaintype.impl.DomaintypePackageImpl;

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

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessInformationEClass = null;

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
	 * @see org.cylio.project.domain.editor.data.DataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataPackageImpl() {
		super(eNS_URI, DataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataPackage init() {
		if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EditorPackageImpl theEditorPackage = (EditorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI) instanceof EditorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI) : EditorPackage.eINSTANCE);
		DomaintypePackageImpl theDomaintypePackage = (DomaintypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomaintypePackage.eNS_URI) instanceof DomaintypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomaintypePackage.eNS_URI) : DomaintypePackage.eINSTANCE);
		AreaPackageImpl theAreaPackage = (AreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AreaPackage.eNS_URI) instanceof AreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AreaPackage.eNS_URI) : AreaPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		SoftwarePackageImpl theSoftwarePackage = (SoftwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI) instanceof SoftwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI) : SoftwarePackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theDataPackage.createPackageContents();
		theEditorPackage.createPackageContents();
		theDomaintypePackage.createPackageContents();
		theAreaPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theSoftwarePackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
		theEditorPackage.initializePackageContents();
		theDomaintypePackage.initializePackageContents();
		theAreaPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theSoftwarePackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
		return theDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessInformation() {
		return businessInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessInformation_Name() {
		return (EAttribute)businessInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessInformation_Description() {
		return (EAttribute)businessInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessInformation_Tags() {
		return (EAttribute)businessInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactory getDataFactory() {
		return (DataFactory)getEFactoryInstance();
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
		businessInformationEClass = createEClass(BUSINESS_INFORMATION);
		createEAttribute(businessInformationEClass, BUSINESS_INFORMATION__NAME);
		createEAttribute(businessInformationEClass, BUSINESS_INFORMATION__DESCRIPTION);
		createEAttribute(businessInformationEClass, BUSINESS_INFORMATION__TAGS);
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
		initEClass(businessInformationEClass, BusinessInformation.class, "BusinessInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessInformation_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessInformation_Description(), ecorePackage.getEString(), "description", null, 0, 1, BusinessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessInformation_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, BusinessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DataPackageImpl
