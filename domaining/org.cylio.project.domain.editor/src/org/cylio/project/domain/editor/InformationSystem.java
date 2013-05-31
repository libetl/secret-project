/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.InformationSystem#getBusinessDomains <em>Business Domains</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.InformationSystem#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.EditorPackage#getInformationSystem()
 * @model
 * @generated
 */
public interface InformationSystem extends EObject {
  /**
   * Returns the value of the '<em><b>Business Domains</b></em>' containment reference list.
   * The list contents are of type {@link org.cylio.project.domain.editor.Domain}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business Domains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Domains</em>' containment reference list.
   * @see org.cylio.project.domain.editor.EditorPackage#getInformationSystem_BusinessDomains()
   * @model containment="true"
   * @generated
   */
  EList<Domain> getBusinessDomains();

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
   * @see org.cylio.project.domain.editor.EditorPackage#getInformationSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cylio.project.domain.editor.InformationSystem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // InformationSystem
