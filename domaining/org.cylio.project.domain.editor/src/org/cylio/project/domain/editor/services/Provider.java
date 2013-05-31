/**
 */
package org.cylio.project.domain.editor.services;

import org.cylio.project.domain.editor.data.BusinessInformation;

import org.cylio.project.domain.editor.software.BusinessSoftwareService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.services.Provider#getProviderType <em>Provider Type</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.Provider#getBusinessSoftwareService <em>Business Software Service</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.services.Provider#getBusinessInformations <em>Business Informations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.services.ServicesPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends BusinessService {
	/**
	 * Returns the value of the '<em><b>Provider Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cylio.project.domain.editor.services.ProviderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Type</em>' attribute.
	 * @see org.cylio.project.domain.editor.services.ProviderType
	 * @see #setProviderType(ProviderType)
	 * @see org.cylio.project.domain.editor.services.ServicesPackage#getProvider_ProviderType()
	 * @model dataType="org.cylio.project.domain.editor.services.ProviderType"
	 * @generated
	 */
	ProviderType getProviderType();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.services.Provider#getProviderType <em>Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Type</em>' attribute.
	 * @see org.cylio.project.domain.editor.services.ProviderType
	 * @see #getProviderType()
	 * @generated
	 */
	void setProviderType(ProviderType value);

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
	 * @see org.cylio.project.domain.editor.services.ServicesPackage#getProvider_BusinessSoftwareService()
	 * @model
	 * @generated
	 */
	BusinessSoftwareService getBusinessSoftwareService();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.services.Provider#getBusinessSoftwareService <em>Business Software Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Software Service</em>' reference.
	 * @see #getBusinessSoftwareService()
	 * @generated
	 */
	void setBusinessSoftwareService(BusinessSoftwareService value);

	/**
	 * Returns the value of the '<em><b>Business Informations</b></em>' containment reference list.
	 * The list contents are of type {@link org.cylio.project.domain.editor.data.BusinessInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Informations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Informations</em>' containment reference list.
	 * @see org.cylio.project.domain.editor.services.ServicesPackage#getProvider_BusinessInformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessInformation> getBusinessInformations();

} // Provider
