/**
 */
package org.cylio.project.domain.editor.area;

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
 * @see org.cylio.project.domain.editor.area.AreaFactory
 * @model kind="package"
 * @generated
 */
public interface AreaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "area";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://callisto.blizzart.net/redmine/projects/ccu-lbe#area";

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
	AreaPackage eINSTANCE = org.cylio.project.domain.editor.area.impl.AreaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.area.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.area.impl.AreaImpl
	 * @see org.cylio.project.domain.editor.area.impl.AreaPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Macro Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__MACRO_PROCESSES = 1;

	/**
	 * The feature id for the '<em><b>Business Informations Not Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__BUSINESS_INFORMATIONS_NOT_USED = 2;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__PURPOSE = 3;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.cylio.project.domain.editor.area.impl.MacroProcessImpl <em>Macro Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cylio.project.domain.editor.area.impl.MacroProcessImpl
	 * @see org.cylio.project.domain.editor.area.impl.AreaPackageImpl#getMacroProcess()
	 * @generated
	 */
	int MACRO_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Business Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_PROCESS__BUSINESS_SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Subscriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_PROCESS__SUBSCRIPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_PROCESS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Owner Area</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_PROCESS__OWNER_AREA = 3;

	/**
	 * The number of structural features of the '<em>Macro Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_PROCESS_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.area.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see org.cylio.project.domain.editor.area.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.area.Area#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cylio.project.domain.editor.area.Area#getName()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cylio.project.domain.editor.area.Area#getMacroProcesses <em>Macro Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Macro Processes</em>'.
	 * @see org.cylio.project.domain.editor.area.Area#getMacroProcesses()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_MacroProcesses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cylio.project.domain.editor.area.Area#getBusinessInformationsNotUsed <em>Business Informations Not Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Informations Not Used</em>'.
	 * @see org.cylio.project.domain.editor.area.Area#getBusinessInformationsNotUsed()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_BusinessInformationsNotUsed();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.area.Area#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.cylio.project.domain.editor.area.Area#getPurpose()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Purpose();

	/**
	 * Returns the meta object for class '{@link org.cylio.project.domain.editor.area.MacroProcess <em>Macro Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Process</em>'.
	 * @see org.cylio.project.domain.editor.area.MacroProcess
	 * @generated
	 */
	EClass getMacroProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cylio.project.domain.editor.area.MacroProcess#getBusinessServices <em>Business Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Services</em>'.
	 * @see org.cylio.project.domain.editor.area.MacroProcess#getBusinessServices()
	 * @see #getMacroProcess()
	 * @generated
	 */
	EReference getMacroProcess_BusinessServices();

	/**
	 * Returns the meta object for the reference list '{@link org.cylio.project.domain.editor.area.MacroProcess#getSubscriptions <em>Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscriptions</em>'.
	 * @see org.cylio.project.domain.editor.area.MacroProcess#getSubscriptions()
	 * @see #getMacroProcess()
	 * @generated
	 */
	EReference getMacroProcess_Subscriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.cylio.project.domain.editor.area.MacroProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cylio.project.domain.editor.area.MacroProcess#getName()
	 * @see #getMacroProcess()
	 * @generated
	 */
	EAttribute getMacroProcess_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.cylio.project.domain.editor.area.MacroProcess#getOwnerArea <em>Owner Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Area</em>'.
	 * @see org.cylio.project.domain.editor.area.MacroProcess#getOwnerArea()
	 * @see #getMacroProcess()
	 * @generated
	 */
	EReference getMacroProcess_OwnerArea();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AreaFactory getAreaFactory();

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
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.area.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.area.impl.AreaImpl
		 * @see org.cylio.project.domain.editor.area.impl.AreaPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__NAME = eINSTANCE.getArea_Name();

		/**
		 * The meta object literal for the '<em><b>Macro Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__MACRO_PROCESSES = eINSTANCE.getArea_MacroProcesses();

		/**
		 * The meta object literal for the '<em><b>Business Informations Not Used</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__BUSINESS_INFORMATIONS_NOT_USED = eINSTANCE.getArea_BusinessInformationsNotUsed();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__PURPOSE = eINSTANCE.getArea_Purpose();

		/**
		 * The meta object literal for the '{@link org.cylio.project.domain.editor.area.impl.MacroProcessImpl <em>Macro Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cylio.project.domain.editor.area.impl.MacroProcessImpl
		 * @see org.cylio.project.domain.editor.area.impl.AreaPackageImpl#getMacroProcess()
		 * @generated
		 */
		EClass MACRO_PROCESS = eINSTANCE.getMacroProcess();

		/**
		 * The meta object literal for the '<em><b>Business Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_PROCESS__BUSINESS_SERVICES = eINSTANCE.getMacroProcess_BusinessServices();

		/**
		 * The meta object literal for the '<em><b>Subscriptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_PROCESS__SUBSCRIPTIONS = eINSTANCE.getMacroProcess_Subscriptions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO_PROCESS__NAME = eINSTANCE.getMacroProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Owner Area</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_PROCESS__OWNER_AREA = eINSTANCE.getMacroProcess_OwnerArea();

	}

} //AreaPackage
