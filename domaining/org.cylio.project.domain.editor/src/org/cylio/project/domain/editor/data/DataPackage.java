/**
 */
package org.cylio.project.domain.editor.data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.cylio.project.domain.editor.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://callisto.blizzart.net/redmine/projects/ccu-lbe#data";

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
	DataPackage eINSTANCE = org.cylio.project.domain.editor.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.data.impl.BusinessInformationImpl <em>Business Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.data.impl.BusinessInformationImpl
	 * @see org.cylio.project.domain.editor.data.impl.DataPackageImpl#getBusinessInformation()
	 * @generated
	 */
	int BUSINESS_INFORMATION = 0;

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
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.data.BusinessInformation <em>Business Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Information</em>'.
	 * @see org.cylio.project.domain.editor.data.BusinessInformation
	 * @generated
	 */
	EClass getBusinessInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.data.BusinessInformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cylio.project.domain.editor.data.BusinessInformation#getName()
	 * @see #getBusinessInformation()
	 * @generated
	 */
	EAttribute getBusinessInformation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.data.BusinessInformation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cylio.project.domain.editor.data.BusinessInformation#getDescription()
	 * @see #getBusinessInformation()
	 * @generated
	 */
	EAttribute getBusinessInformation_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.cylio.project.domain.editor.data.BusinessInformation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see org.cylio.project.domain.editor.data.BusinessInformation#getTags()
	 * @see #getBusinessInformation()
	 * @generated
	 */
	EAttribute getBusinessInformation_Tags();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.data.impl.BusinessInformationImpl <em>Business Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.data.impl.BusinessInformationImpl
		 * @see org.cylio.project.domain.editor.data.impl.DataPackageImpl#getBusinessInformation()
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

	}

} //DataPackage
