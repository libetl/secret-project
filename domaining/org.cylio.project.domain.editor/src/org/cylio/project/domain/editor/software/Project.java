/**
 */
package org.cylio.project.domain.editor.software;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.software.Project#getAcceptanceDate <em>Acceptance Date</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.software.Project#getProductionDate <em>Production Date</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.software.Project#isOutsourced <em>Outsourced</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Acceptance Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Date</em>' attribute.
	 * @see #setAcceptanceDate(Date)
	 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getProject_AcceptanceDate()
	 * @model
	 * @generated
	 */
	Date getAcceptanceDate();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.software.Project#getAcceptanceDate <em>Acceptance Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Date</em>' attribute.
	 * @see #getAcceptanceDate()
	 * @generated
	 */
	void setAcceptanceDate(Date value);

	/**
	 * Returns the value of the '<em><b>Production Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Date</em>' attribute.
	 * @see #setProductionDate(Date)
	 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getProject_ProductionDate()
	 * @model
	 * @generated
	 */
	Date getProductionDate();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.software.Project#getProductionDate <em>Production Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Date</em>' attribute.
	 * @see #getProductionDate()
	 * @generated
	 */
	void setProductionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Outsourced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outsourced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outsourced</em>' attribute.
	 * @see #setOutsourced(boolean)
	 * @see org.cylio.project.domain.editor.software.SoftwarePackage#getProject_Outsourced()
	 * @model
	 * @generated
	 */
	boolean isOutsourced();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.software.Project#isOutsourced <em>Outsourced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outsourced</em>' attribute.
	 * @see #isOutsourced()
	 * @generated
	 */
	void setOutsourced(boolean value);

} // Project
