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
 * A representation of the model object '<em><b>Business Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.BusinessInformation#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.BusinessInformation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.BusinessInformation#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.EditorPackage#getBusinessInformation()
 * @model
 * @generated
 */
public interface BusinessInformation extends EObject {
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
   * @see org.cylio.project.domain.editor.EditorPackage#getBusinessInformation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cylio.project.domain.editor.BusinessInformation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.cylio.project.domain.editor.EditorPackage#getBusinessInformation_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.cylio.project.domain.editor.BusinessInformation#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Tags</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' attribute list.
   * @see org.cylio.project.domain.editor.EditorPackage#getBusinessInformation_Tags()
   * @model
   * @generated
   */
  EList<String> getTags();

} // BusinessInformation
