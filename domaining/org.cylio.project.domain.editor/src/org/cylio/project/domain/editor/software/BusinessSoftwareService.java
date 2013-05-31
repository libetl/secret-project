/**
 */
package org.cylio.project.domain.editor.software;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Software Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.software.BusinessSoftwareService#isActive <em>Active</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.software.BusinessSoftwareService#getProject <em>Project</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.software.BusinessSoftwareService#getApplications <em>Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getBusinessSoftwareService()
 * @model
 * @generated
 */
public interface BusinessSoftwareService extends EObject {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getBusinessSoftwareService_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.software.BusinessSoftwareService#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getBusinessSoftwareService_Project()
	 * @model
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.software.BusinessSoftwareService#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link org.cylio.project.domain.editor.software.Application}.
	 * It is bidirectional and its opposite is '{@link org.cylio.project.domain.editor.software.Application#getBusinessSoftwareServices <em>Business Software Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getBusinessSoftwareService_Applications()
	 * @see org.cylio.project.domain.editor.software.Application#getBusinessSoftwareServices
	 * @model opposite="businessSoftwareServices"
	 * @generated
	 */
	EList<Application> getApplications();

} // BusinessSoftwareService
