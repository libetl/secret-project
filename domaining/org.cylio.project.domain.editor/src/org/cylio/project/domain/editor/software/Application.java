/**
 */
package org.cylio.project.domain.editor.software;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.software.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.software.Application#getBusinessSoftwareServices <em>Business Software Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
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
	 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.software.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Business Software Services</b></em>' reference list.
	 * The list contents are of type {@link org.cylio.project.domain.editor.software.BusinessSoftwareService}.
	 * It is bidirectional and its opposite is '{@link org.cylio.project.domain.editor.software.BusinessSoftwareService#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Software Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Software Services</em>' reference list.
	 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getApplication_BusinessSoftwareServices()
	 * @see org.cylio.project.domain.editor.software.BusinessSoftwareService#getApplications
	 * @model opposite="applications"
	 * @generated
	 */
	EList<BusinessSoftwareService> getBusinessSoftwareServices();

} // Application
