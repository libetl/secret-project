/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor.impl;

import org.cylio.project.domain.editor.Area;
import org.cylio.project.domain.editor.BusinessInformation;
import org.cylio.project.domain.editor.Color;
import org.cylio.project.domain.editor.Domain;
import org.cylio.project.domain.editor.EditorFactory;
import org.cylio.project.domain.editor.EditorPackage;
import org.cylio.project.domain.editor.InformationSystem;
import org.cylio.project.domain.editor.Status;
import org.cylio.project.domain.editor.SubDomain;

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
public class EditorPackageImpl extends EPackageImpl implements EditorPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass informationSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subDomainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass areaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessInformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum statusEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorEEnum = null;

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
   * @see org.cylio.project.domain.editor.EditorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EditorPackageImpl() {
    super(eNS_URI, EditorFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EditorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EditorPackage init() {
    if (isInited) return (EditorPackage)EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI);

    // Obtain or create and register package
    EditorPackageImpl theEditorPackage = (EditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EditorPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEditorPackage.createPackageContents();

    // Initialize created meta-data
    theEditorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEditorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EditorPackage.eNS_URI, theEditorPackage);
    return theEditorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInformationSystem() {
    return informationSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInformationSystem_BusinessDomains() {
    return (EReference)informationSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInformationSystem_Name() {
    return (EAttribute)informationSystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomain() {
    return domainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomain_Name() {
    return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomain_CreationDate() {
    return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomain_Description() {
    return (EAttribute)domainEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomain_Color() {
    return (EAttribute)domainEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubDomain() {
    return subDomainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubDomain_SubDomains() {
    return (EReference)subDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArea() {
    return areaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArea_Purpose() {
    return (EAttribute)areaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArea_BusinessInformationsNotUsed() {
    return (EReference)areaEClass.getEStructuralFeatures().get(1);
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
  public EEnum getStatus() {
    return statusEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColor() {
    return colorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorFactory getEditorFactory() {
    return (EditorFactory)getEFactoryInstance();
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
    informationSystemEClass = createEClass(INFORMATION_SYSTEM);
    createEReference(informationSystemEClass, INFORMATION_SYSTEM__BUSINESS_DOMAINS);
    createEAttribute(informationSystemEClass, INFORMATION_SYSTEM__NAME);

    domainEClass = createEClass(DOMAIN);
    createEAttribute(domainEClass, DOMAIN__NAME);
    createEAttribute(domainEClass, DOMAIN__CREATION_DATE);
    createEAttribute(domainEClass, DOMAIN__DESCRIPTION);
    createEAttribute(domainEClass, DOMAIN__COLOR);

    subDomainEClass = createEClass(SUB_DOMAIN);
    createEReference(subDomainEClass, SUB_DOMAIN__SUB_DOMAINS);

    areaEClass = createEClass(AREA);
    createEAttribute(areaEClass, AREA__PURPOSE);
    createEReference(areaEClass, AREA__BUSINESS_INFORMATIONS_NOT_USED);

    businessInformationEClass = createEClass(BUSINESS_INFORMATION);
    createEAttribute(businessInformationEClass, BUSINESS_INFORMATION__NAME);
    createEAttribute(businessInformationEClass, BUSINESS_INFORMATION__DESCRIPTION);
    createEAttribute(businessInformationEClass, BUSINESS_INFORMATION__TAGS);

    // Create enums
    statusEEnum = createEEnum(STATUS);
    colorEEnum = createEEnum(COLOR);
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
    subDomainEClass.getESuperTypes().add(this.getDomain());
    areaEClass.getESuperTypes().add(this.getDomain());

    // Initialize classes and features; add operations and parameters
    initEClass(informationSystemEClass, InformationSystem.class, "InformationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInformationSystem_BusinessDomains(), this.getDomain(), null, "businessDomains", null, 0, -1, InformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInformationSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, InformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainEClass, Domain.class, "Domain", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomain_Name(), ecorePackage.getEString(), "name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomain_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomain_Description(), ecorePackage.getEString(), "description", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomain_Color(), this.getColor(), "color", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subDomainEClass, SubDomain.class, "SubDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubDomain_SubDomains(), this.getDomain(), null, "subDomains", null, 0, -1, SubDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArea_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArea_BusinessInformationsNotUsed(), this.getBusinessInformation(), null, "businessInformationsNotUsed", null, 0, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessInformationEClass, BusinessInformation.class, "BusinessInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessInformation_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBusinessInformation_Description(), ecorePackage.getEString(), "description", null, 0, 1, BusinessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBusinessInformation_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, BusinessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(statusEEnum, Status.class, "Status");
    addEEnumLiteral(statusEEnum, Status.PRODUCTION);
    addEEnumLiteral(statusEEnum, Status.PROJECT);
    addEEnumLiteral(statusEEnum, Status.INITIATIVE);

    initEEnum(colorEEnum, Color.class, "Color");
    addEEnumLiteral(colorEEnum, Color.RED);
    addEEnumLiteral(colorEEnum, Color.GREEN);
    addEEnumLiteral(colorEEnum, Color.BLUE);
    addEEnumLiteral(colorEEnum, Color.YELLOW);
    addEEnumLiteral(colorEEnum, Color.BROWN);
    addEEnumLiteral(colorEEnum, Color.PINK);
    addEEnumLiteral(colorEEnum, Color.PURPLE);
    addEEnumLiteral(colorEEnum, Color.GREY);
    addEEnumLiteral(colorEEnum, Color.BLACK);

    // Create resource
    createResource(eNS_URI);
  }

} //EditorPackageImpl
