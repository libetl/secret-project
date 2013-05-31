/**
 */
package org.cylio.project.domain.editor.software;

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
 * @see org.cylio.project.domain.editor.software.SoftwareFactory
 * @model kind="package"
 * @generated
 */
public interface SoftwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "software";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://callisto.blizzart.net/redmine/projects/ccu-lbe#software";

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
	SoftwarePackage eINSTANCE = org.cylio.project.domain.editor.software.impl.SoftwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.software.impl.BusinessSoftwareServiceImpl <em>Business Software Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.software.impl.BusinessSoftwareServiceImpl
	 * @see org.cylio.project.domain.editor.software.impl.SoftwarePackageImpl#getBusinessSoftwareService()
	 * @generated
	 */
	int BUSINESS_SOFTWARE_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SOFTWARE_SERVICE__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SOFTWARE_SERVICE__PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SOFTWARE_SERVICE__APPLICATIONS = 2;

	/**
	 * The number of structural features of the '<em>Business Software Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SOFTWARE_SERVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.software.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.software.impl.ApplicationImpl
	 * @see org.cylio.project.domain.editor.software.impl.SoftwarePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Business Software Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__BUSINESS_SOFTWARE_SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.software.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.software.impl.ProjectImpl
	 * @see org.cylio.project.domain.editor.software.impl.SoftwarePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Acceptance Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ACCEPTANCE_DATE = 0;

	/**
	 * The feature id for the '<em><b>Production Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PRODUCTION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Outsourced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OUTSOURCED = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.software.BusinessSoftwareService <em>Business Software Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Software Service</em>'.
	 * @see org.cylio.project.domain.editor.software.BusinessSoftwareService
	 * @generated
	 */
	EClass getBusinessSoftwareService();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.software.BusinessSoftwareService#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.cylio.project.domain.editor.software.BusinessSoftwareService#isActive()
	 * @see #getBusinessSoftwareService()
	 * @generated
	 */
	EAttribute getBusinessSoftwareService_Active();

	/**
	 * Returns the meta object for the reference '{@link org.cylio.project.domain.editor.software.BusinessSoftwareService#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see org.cylio.project.domain.editor.software.BusinessSoftwareService#getProject()
	 * @see #getBusinessSoftwareService()
	 * @generated
	 */
	EReference getBusinessSoftwareService_Project();

	/**
	 * Returns the meta object for the reference list '{@link org.cylio.project.domain.editor.software.BusinessSoftwareService#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see org.cylio.project.domain.editor.software.BusinessSoftwareService#getApplications()
	 * @see #getBusinessSoftwareService()
	 * @generated
	 */
	EReference getBusinessSoftwareService_Applications();

	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.software.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.cylio.project.domain.editor.software.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.software.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cylio.project.domain.editor.software.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.cylio.project.domain.editor.software.Application#getBusinessSoftwareServices <em>Business Software Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Software Services</em>'.
	 * @see org.cylio.project.domain.editor.software.Application#getBusinessSoftwareServices()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_BusinessSoftwareServices();

	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.software.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.cylio.project.domain.editor.software.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.software.Project#getAcceptanceDate <em>Acceptance Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance Date</em>'.
	 * @see org.cylio.project.domain.editor.software.Project#getAcceptanceDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AcceptanceDate();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.software.Project#getProductionDate <em>Production Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Production Date</em>'.
	 * @see org.cylio.project.domain.editor.software.Project#getProductionDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProductionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.software.Project#isOutsourced <em>Outsourced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outsourced</em>'.
	 * @see org.cylio.project.domain.editor.software.Project#isOutsourced()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Outsourced();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoftwareFactory getSoftwareFactory();

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
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.software.impl.BusinessSoftwareServiceImpl <em>Business Software Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.software.impl.BusinessSoftwareServiceImpl
		 * @see org.cylio.project.domain.editor.software.impl.SoftwarePackageImpl#getBusinessSoftwareService()
		 * @generated
		 */
		EClass BUSINESS_SOFTWARE_SERVICE = eINSTANCE.getBusinessSoftwareService();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_SOFTWARE_SERVICE__ACTIVE = eINSTANCE.getBusinessSoftwareService_Active();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_SOFTWARE_SERVICE__PROJECT = eINSTANCE.getBusinessSoftwareService_Project();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_SOFTWARE_SERVICE__APPLICATIONS = eINSTANCE.getBusinessSoftwareService_Applications();

		/**
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.software.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.software.impl.ApplicationImpl
		 * @see org.cylio.project.domain.editor.software.impl.SoftwarePackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Business Software Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__BUSINESS_SOFTWARE_SERVICES = eINSTANCE.getApplication_BusinessSoftwareServices();

		/**
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.software.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.software.impl.ProjectImpl
		 * @see org.cylio.project.domain.editor.software.impl.SoftwarePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Acceptance Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ACCEPTANCE_DATE = eINSTANCE.getProject_AcceptanceDate();

		/**
		 * The meta object literal for the '<em><b>Production Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PRODUCTION_DATE = eINSTANCE.getProject_ProductionDate();

		/**
		 * The meta object literal for the '<em><b>Outsourced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__OUTSOURCED = eINSTANCE.getProject_Outsourced();

	}

} //SoftwarePackage
