/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor;

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
 * @see org.cylio.project.domain.editor.EditorFactory
 * @model kind="package"
 * @generated
 */
public interface EditorPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "editor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://callisto.blizzart.net/redmine/projects/ccu-lbe#editor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "editor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EditorPackage eINSTANCE = org.cylio.project.domain.editor.impl.EditorPackageImpl.init();

  /**
   * The meta object id for the '{@link org.cylio.project.domain.editor.impl.InformationSystemImpl <em>Information System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cylio.project.domain.editor.impl.InformationSystemImpl
   * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getInformationSystem()
   * @generated
   */
  int INFORMATION_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Business Domains</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_SYSTEM__BUSINESS_DOMAINS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_SYSTEM__NAME = 1;

  /**
   * The number of structural features of the '<em>Information System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_SYSTEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cylio.project.domain.editor.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cylio.project.domain.editor.impl.DomainImpl
   * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = 0;

  /**
   * The feature id for the '<em><b>Creation Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__CREATION_DATE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__COLOR = 3;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.cylio.project.domain.editor.impl.SubDomainImpl <em>Sub Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cylio.project.domain.editor.impl.SubDomainImpl
   * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getSubDomain()
   * @generated
   */
  int SUB_DOMAIN = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DOMAIN__NAME = DOMAIN__NAME;

  /**
   * The feature id for the '<em><b>Creation Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DOMAIN__CREATION_DATE = DOMAIN__CREATION_DATE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DOMAIN__DESCRIPTION = DOMAIN__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DOMAIN__COLOR = DOMAIN__COLOR;

  /**
   * The feature id for the '<em><b>Sub Domains</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DOMAIN__SUB_DOMAINS = DOMAIN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sub Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DOMAIN_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cylio.project.domain.editor.impl.AreaImpl <em>Area</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cylio.project.domain.editor.impl.AreaImpl
   * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getArea()
   * @generated
   */
  int AREA = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA__NAME = DOMAIN__NAME;

  /**
   * The feature id for the '<em><b>Creation Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA__CREATION_DATE = DOMAIN__CREATION_DATE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA__DESCRIPTION = DOMAIN__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA__COLOR = DOMAIN__COLOR;

  /**
   * The feature id for the '<em><b>Purpose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA__PURPOSE = DOMAIN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Business Informations Not Used</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA__BUSINESS_INFORMATIONS_NOT_USED = DOMAIN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Area</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cylio.project.domain.editor.impl.BusinessInformationImpl <em>Business Information</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cylio.project.domain.editor.impl.BusinessInformationImpl
   * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getBusinessInformation()
   * @generated
   */
  int BUSINESS_INFORMATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_INFORMATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_INFORMATION__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_INFORMATION__TAGS = 2;

  /**
   * The number of structural features of the '<em>Business Information</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_INFORMATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.cylio.project.domain.editor.Status <em>Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cylio.project.domain.editor.Status
   * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getStatus()
   * @generated
   */
  int STATUS = 5;

  /**
   * The meta object id for the '{@link org.cylio.project.domain.editor.Color <em>Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cylio.project.domain.editor.Color
   * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getColor()
   * @generated
   */
  int COLOR = 6;


  /**
   * Returns the meta object for class '{@link org.cylio.project.domain.editor.InformationSystem <em>Information System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Information System</em>'.
   * @see org.cylio.project.domain.editor.InformationSystem
   * @generated
   */
  EClass getInformationSystem();

  /**
   * Returns the meta object for the containment reference list '{@link org.cylio.project.domain.editor.InformationSystem#getBusinessDomains <em>Business Domains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Business Domains</em>'.
   * @see org.cylio.project.domain.editor.InformationSystem#getBusinessDomains()
   * @see #getInformationSystem()
   * @generated
   */
  EReference getInformationSystem_BusinessDomains();

  /**
   * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.InformationSystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cylio.project.domain.editor.InformationSystem#getName()
   * @see #getInformationSystem()
   * @generated
   */
  EAttribute getInformationSystem_Name();

  /**
   * Returns the meta object for class '{@link org.cylio.project.domain.editor.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see org.cylio.project.domain.editor.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.Domain#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cylio.project.domain.editor.Domain#getName()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Name();

  /**
   * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.Domain#getCreationDate <em>Creation Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Creation Date</em>'.
   * @see org.cylio.project.domain.editor.Domain#getCreationDate()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_CreationDate();

  /**
   * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.Domain#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.cylio.project.domain.editor.Domain#getDescription()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Description();

  /**
   * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.Domain#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.cylio.project.domain.editor.Domain#getColor()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Color();

  /**
   * Returns the meta object for class '{@link org.cylio.project.domain.editor.SubDomain <em>Sub Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Domain</em>'.
   * @see org.cylio.project.domain.editor.SubDomain
   * @generated
   */
  EClass getSubDomain();

  /**
   * Returns the meta object for the containment reference list '{@link org.cylio.project.domain.editor.SubDomain#getSubDomains <em>Sub Domains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Domains</em>'.
   * @see org.cylio.project.domain.editor.SubDomain#getSubDomains()
   * @see #getSubDomain()
   * @generated
   */
  EReference getSubDomain_SubDomains();

  /**
   * Returns the meta object for class '{@link org.cylio.project.domain.editor.Area <em>Area</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Area</em>'.
   * @see org.cylio.project.domain.editor.Area
   * @generated
   */
  EClass getArea();

  /**
   * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.Area#getPurpose <em>Purpose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Purpose</em>'.
   * @see org.cylio.project.domain.editor.Area#getPurpose()
   * @see #getArea()
   * @generated
   */
  EAttribute getArea_Purpose();

  /**
   * Returns the meta object for the containment reference list '{@link org.cylio.project.domain.editor.Area#getBusinessInformationsNotUsed <em>Business Informations Not Used</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Business Informations Not Used</em>'.
   * @see org.cylio.project.domain.editor.Area#getBusinessInformationsNotUsed()
   * @see #getArea()
   * @generated
   */
  EReference getArea_BusinessInformationsNotUsed();

  /**
   * Returns the meta object for class '{@link org.cylio.project.domain.editor.BusinessInformation <em>Business Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Information</em>'.
   * @see org.cylio.project.domain.editor.BusinessInformation
   * @generated
   */
  EClass getBusinessInformation();

  /**
   * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.BusinessInformation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cylio.project.domain.editor.BusinessInformation#getName()
   * @see #getBusinessInformation()
   * @generated
   */
  EAttribute getBusinessInformation_Name();

  /**
   * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.BusinessInformation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.cylio.project.domain.editor.BusinessInformation#getDescription()
   * @see #getBusinessInformation()
   * @generated
   */
  EAttribute getBusinessInformation_Description();

  /**
   * Returns the meta object for the attribute list '{@link org.cylio.project.domain.editor.BusinessInformation#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tags</em>'.
   * @see org.cylio.project.domain.editor.BusinessInformation#getTags()
   * @see #getBusinessInformation()
   * @generated
   */
  EAttribute getBusinessInformation_Tags();

  /**
   * Returns the meta object for enum '{@link org.cylio.project.domain.editor.Status <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Status</em>'.
   * @see org.cylio.project.domain.editor.Status
   * @generated
   */
  EEnum getStatus();

  /**
   * Returns the meta object for enum '{@link org.cylio.project.domain.editor.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color</em>'.
   * @see org.cylio.project.domain.editor.Color
   * @generated
   */
  EEnum getColor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EditorFactory getEditorFactory();

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
     * The meta object literal for the '{@link org.cylio.project.domain.editor.impl.InformationSystemImpl <em>Information System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cylio.project.domain.editor.impl.InformationSystemImpl
     * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getInformationSystem()
     * @generated
     */
    EClass INFORMATION_SYSTEM = eINSTANCE.getInformationSystem();

    /**
     * The meta object literal for the '<em><b>Business Domains</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATION_SYSTEM__BUSINESS_DOMAINS = eINSTANCE.getInformationSystem_BusinessDomains();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMATION_SYSTEM__NAME = eINSTANCE.getInformationSystem_Name();

    /**
     * The meta object literal for the '{@link org.cylio.project.domain.editor.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cylio.project.domain.editor.impl.DomainImpl
     * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

    /**
     * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__CREATION_DATE = eINSTANCE.getDomain_CreationDate();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__DESCRIPTION = eINSTANCE.getDomain_Description();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__COLOR = eINSTANCE.getDomain_Color();

    /**
     * The meta object literal for the '{@link org.cylio.project.domain.editor.impl.SubDomainImpl <em>Sub Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cylio.project.domain.editor.impl.SubDomainImpl
     * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getSubDomain()
     * @generated
     */
    EClass SUB_DOMAIN = eINSTANCE.getSubDomain();

    /**
     * The meta object literal for the '<em><b>Sub Domains</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_DOMAIN__SUB_DOMAINS = eINSTANCE.getSubDomain_SubDomains();

    /**
     * The meta object literal for the '{@link org.cylio.project.domain.editor.impl.AreaImpl <em>Area</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cylio.project.domain.editor.impl.AreaImpl
     * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getArea()
     * @generated
     */
    EClass AREA = eINSTANCE.getArea();

    /**
     * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AREA__PURPOSE = eINSTANCE.getArea_Purpose();

    /**
     * The meta object literal for the '<em><b>Business Informations Not Used</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AREA__BUSINESS_INFORMATIONS_NOT_USED = eINSTANCE.getArea_BusinessInformationsNotUsed();

    /**
     * The meta object literal for the '{@link org.cylio.project.domain.editor.impl.BusinessInformationImpl <em>Business Information</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cylio.project.domain.editor.impl.BusinessInformationImpl
     * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getBusinessInformation()
     * @generated
     */
    EClass BUSINESS_INFORMATION = eINSTANCE.getBusinessInformation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_INFORMATION__NAME = eINSTANCE.getBusinessInformation_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_INFORMATION__DESCRIPTION = eINSTANCE.getBusinessInformation_Description();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_INFORMATION__TAGS = eINSTANCE.getBusinessInformation_Tags();

    /**
     * The meta object literal for the '{@link org.cylio.project.domain.editor.Status <em>Status</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cylio.project.domain.editor.Status
     * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getStatus()
     * @generated
     */
    EEnum STATUS = eINSTANCE.getStatus();

    /**
     * The meta object literal for the '{@link org.cylio.project.domain.editor.Color <em>Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cylio.project.domain.editor.Color
     * @see org.cylio.project.domain.editor.impl.EditorPackageImpl#getColor()
     * @generated
     */
    EEnum COLOR = eINSTANCE.getColor();

  }

} //EditorPackage
