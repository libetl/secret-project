/**
 */
package org.cylio.project.domain.editor.services;

import org.cylio.project.domain.editor.software.BusinessSoftwareService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.services.Feature#getBusinessSoftwareService <em>Business Software Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.services.ServicesPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends BusinessService {
	/**
	 * Returns the value of the '<em><b>Business Software Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Software Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Software Service</em>' reference.
	 * @see #setBusinessSoftwareService(BusinessSoftwareService)
	 * @see org.cylio.project.domain.editor.services.ServicesPackage#getFeature_BusinessSoftwareService()
	 * @model
	 * @generated
	 */
	BusinessSoftwareService getBusinessSoftwareService();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.services.Feature#getBusinessSoftwareService <em>Business Software Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Software Service</em>' reference.
	 * @see #getBusinessSoftwareService()
	 * @generated
	 */
	void setBusinessSoftwareService(BusinessSoftwareService value);

} // Feature
