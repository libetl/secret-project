/**
 */
package org.cylio.project.domain.editor.domaintype;

import org.cylio.project.domain.editor.util.Color;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.domaintype.BusinessDomain#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.domaintype.BusinessDomain#getFunctionalDomains <em>Functional Domains</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.domaintype.BusinessDomain#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.domaintype.DomaintypePackage#getBusinessDomain()
 * @model
 * @generated
 */
public interface BusinessDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cylio.project.domain.editor.domaintype.DomaintypePackage#getBusinessDomain_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.domaintype.BusinessDomain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Functional Domains</b></em>' reference list.
	 * The list contents are of type {@link org.cylio.project.domain.editor.domaintype.FunctionalDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Domains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Domains</em>' reference list.
	 * @see org.cylio.project.domain.editor.domaintype.DomaintypePackage#getBusinessDomain_FunctionalDomains()
	 * @model
	 * @generated
	 */
	EList<FunctionalDomain> getFunctionalDomains();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.cylio.project.domain.editor.util.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.cylio.project.domain.editor.util.Color
	 * @see #setColor(Color)
	 * @see org.cylio.project.domain.editor.domaintype.DomaintypePackage#getBusinessDomain_Color()
	 * @model default=""
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.domaintype.BusinessDomain#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.cylio.project.domain.editor.util.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // BusinessDomain
