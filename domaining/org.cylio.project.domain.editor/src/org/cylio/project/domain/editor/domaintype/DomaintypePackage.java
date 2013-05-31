/**
 */
package org.cylio.project.domain.editor.domaintype;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.cylio.project.domain.editor.domaintype.DomaintypeFactory
 * @model kind="package"
 * @generated
 */
public interface DomaintypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domaintype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://callisto.blizzart.net/redmine/projects/ccu-lbe#domaintype";

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
	DomaintypePackage eINSTANCE = org.cylio.project.domain.editor.domaintype.impl.DomaintypePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.domaintype.impl.FunctionalDomainImpl <em>Functional Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.domaintype.impl.FunctionalDomainImpl
	 * @see org.cylio.project.domain.editor.domaintype.impl.DomaintypePackageImpl#getFunctionalDomain()
	 * @generated
	 */
	int FUNCTIONAL_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN__AREAS = 1;

	/**
	 * The number of structural features of the '<em>Functional Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.domaintype.impl.BusinessDomainImpl <em>Business Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.domaintype.impl.BusinessDomainImpl
	 * @see org.cylio.project.domain.editor.domaintype.impl.DomaintypePackageImpl#getBusinessDomain()
	 * @generated
	 */
	int BUSINESS_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Functional Domains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__FUNCTIONAL_DOMAINS = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__COLOR = 2;

	/**
	 * The number of structural features of the '<em>Business Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.domaintype.FunctionalDomain <em>Functional Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Domain</em>'.
	 * @see org.cylio.project.domain.editor.domaintype.FunctionalDomain
	 * @generated
	 */
	EClass getFunctionalDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.domaintype.FunctionalDomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cylio.project.domain.editor.domaintype.FunctionalDomain#getName()
	 * @see #getFunctionalDomain()
	 * @generated
	 */
	EAttribute getFunctionalDomain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cylio.project.domain.editor.domaintype.FunctionalDomain#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see org.cylio.project.domain.editor.domaintype.FunctionalDomain#getAreas()
	 * @see #getFunctionalDomain()
	 * @generated
	 */
	EReference getFunctionalDomain_Areas();

	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.domaintype.BusinessDomain <em>Business Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Domain</em>'.
	 * @see org.cylio.project.domain.editor.domaintype.BusinessDomain
	 * @generated
	 */
	EClass getBusinessDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.domaintype.BusinessDomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cylio.project.domain.editor.domaintype.BusinessDomain#getName()
	 * @see #getBusinessDomain()
	 * @generated
	 */
	EAttribute getBusinessDomain_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.cylio.project.domain.editor.domaintype.BusinessDomain#getFunctionalDomains <em>Functional Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functional Domains</em>'.
	 * @see org.cylio.project.domain.editor.domaintype.BusinessDomain#getFunctionalDomains()
	 * @see #getBusinessDomain()
	 * @generated
	 */
	EReference getBusinessDomain_FunctionalDomains();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.domaintype.BusinessDomain#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.cylio.project.domain.editor.domaintype.BusinessDomain#getColor()
	 * @see #getBusinessDomain()
	 * @generated
	 */
	EAttribute getBusinessDomain_Color();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomaintypeFactory getDomaintypeFactory();

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
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.domaintype.impl.FunctionalDomainImpl <em>Functional Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.domaintype.impl.FunctionalDomainImpl
		 * @see org.cylio.project.domain.editor.domaintype.impl.DomaintypePackageImpl#getFunctionalDomain()
		 * @generated
		 */
		EClass FUNCTIONAL_DOMAIN = eINSTANCE.getFunctionalDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_DOMAIN__NAME = eINSTANCE.getFunctionalDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DOMAIN__AREAS = eINSTANCE.getFunctionalDomain_Areas();

		/**
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.domaintype.impl.BusinessDomainImpl <em>Business Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.domaintype.impl.BusinessDomainImpl
		 * @see org.cylio.project.domain.editor.domaintype.impl.DomaintypePackageImpl#getBusinessDomain()
		 * @generated
		 */
		EClass BUSINESS_DOMAIN = eINSTANCE.getBusinessDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOMAIN__NAME = eINSTANCE.getBusinessDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Functional Domains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_DOMAIN__FUNCTIONAL_DOMAINS = eINSTANCE.getBusinessDomain_FunctionalDomains();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOMAIN__COLOR = eINSTANCE.getBusinessDomain_Color();

	}

} //DomaintypePackage
