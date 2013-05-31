/**
 */
package org.cylio.project.domain.editor.services;

import org.cylio.project.domain.editor.area.MacroProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.services.BusinessService#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.BusinessService#getOwnerMacroProcess <em>Owner Macro Process</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.BusinessService#getSubscribers <em>Subscribers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.services.ServicesPackage#getBusinessService()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BusinessService extends EObject {
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
	 * @see org.cylio.project.domain.editor.services.ServicesPackage#getBusinessService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.services.BusinessService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owner Macro Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.cylio.project.domain.editor.area.MacroProcess#getBusinessServices <em>Business Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Macro Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Macro Process</em>' container reference.
	 * @see #setOwnerMacroProcess(MacroProcess)
	 * @see org.cylio.project.domain.editor.services.ServicesPackage#getBusinessService_OwnerMacroProcess()
	 * @see org.cylio.project.domain.editor.area.MacroProcess#getBusinessServices
	 * @model opposite="businessServices" transient="false"
	 * @generated
	 */
	MacroProcess getOwnerMacroProcess();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.services.BusinessService#getOwnerMacroProcess <em>Owner Macro Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Macro Process</em>' container reference.
	 * @see #getOwnerMacroProcess()
	 * @generated
	 */
	void setOwnerMacroProcess(MacroProcess value);

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' reference list.
	 * The list contents are of type {@link org.cylio.project.domain.editor.area.MacroProcess}.
	 * It is bidirectional and its opposite is '{@link org.cylio.project.domain.editor.area.MacroProcess#getSubscriptions <em>Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' reference list.
	 * @see org.cylio.project.domain.editor.services.ServicesPackage#getBusinessService_Subscribers()
	 * @see org.cylio.project.domain.editor.area.MacroProcess#getSubscriptions
	 * @model opposite="subscriptions"
	 * @generated
	 */
	EList<MacroProcess> getSubscribers();

} // BusinessService
