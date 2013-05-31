/**
 */
package org.cylio.project.domain.editor.domaintype;

import org.cylio.project.domain.editor.area.Area;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.domaintype.FunctionalDomain#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.domaintype.FunctionalDomain#getAreas <em>Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.domaintype.DomaintypePackage#getFunctionalDomain()
 * @model
 * @generated
 */
public interface FunctionalDomain extends EObject {
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
	 * @see org.cylio.project.domain.editor.domaintype.DomaintypePackage#getFunctionalDomain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.domaintype.FunctionalDomain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Areas</b></em>' containment reference list.
	 * The list contents are of type {@link org.cylio.project.domain.editor.area.Area}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Areas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Areas</em>' containment reference list.
	 * @see org.cylio.project.domain.editor.domaintype.DomaintypePackage#getFunctionalDomain_Areas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getAreas();

} // FunctionalDomain
