/**
 */
package org.cylio.project.domain.editor.area;

import org.cylio.project.domain.editor.services.BusinessService;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.area.MacroProcess#getBusinessServices <em>Business Services</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.MacroProcess#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.MacroProcess#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.MacroProcess#getOwnerArea <em>Owner Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.area.AreaPackage#getMacroProcess()
 * @model
 * @generated
 */
public interface MacroProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Business Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.cylio.project.domain.editor.services.BusinessService}.
	 * It is bidirectional and its opposite is '{@link org.cylio.project.domain.editor.services.BusinessService#getOwnerMacroProcess <em>Owner Macro Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Services</em>' containment reference list.
	 * @see org.cylio.project.domain.editor.area.AreaPackage#getMacroProcess_BusinessServices()
	 * @see org.cylio.project.domain.editor.services.BusinessService#getOwnerMacroProcess
	 * @model opposite="ownerMacroProcess" containment="true"
	 * @generated
	 */
	EList<BusinessService> getBusinessServices();

	/**
	 * Returns the value of the '<em><b>Subscriptions</b></em>' reference list.
	 * The list contents are of type {@link org.cylio.project.domain.editor.services.BusinessService}.
	 * It is bidirectional and its opposite is '{@link org.cylio.project.domain.editor.services.BusinessService#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptions</em>' reference list.
	 * @see org.cylio.project.domain.editor.area.AreaPackage#getMacroProcess_Subscriptions()
	 * @see org.cylio.project.domain.editor.services.BusinessService#getSubscribers
	 * @model opposite="subscribers"
	 * @generated
	 */
	EList<BusinessService> getSubscriptions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cylio.project.domain.editor.area.AreaPackage#getMacroProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.area.MacroProcess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owner Area</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.cylio.project.domain.editor.area.Area#getMacroProcesses <em>Macro Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Area</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Area</em>' container reference.
	 * @see #setOwnerArea(Area)
	 * @see org.cylio.project.domain.editor.area.AreaPackage#getMacroProcess_OwnerArea()
	 * @see org.cylio.project.domain.editor.area.Area#getMacroProcesses
	 * @model opposite="macroProcesses" transient="false"
	 * @generated
	 */
	Area getOwnerArea();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.area.MacroProcess#getOwnerArea <em>Owner Area</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Area</em>' container reference.
	 * @see #getOwnerArea()
	 * @generated
	 */
	void setOwnerArea(Area value);

} // MacroProcess
