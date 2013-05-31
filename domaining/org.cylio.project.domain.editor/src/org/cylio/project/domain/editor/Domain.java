/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.Domain#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.Domain#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.Domain#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.Domain#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.EditorPackage#getDomain()
 * @model abstract="true"
 * @generated
 */
public interface Domain extends EObject {
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
   * @see org.cylio.project.domain.editor.EditorPackage#getDomain_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cylio.project.domain.editor.Domain#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creation Date</em>' attribute.
   * @see #setCreationDate(Date)
   * @see org.cylio.project.domain.editor.EditorPackage#getDomain_CreationDate()
   * @model
   * @generated
   */
  Date getCreationDate();

  /**
   * Sets the value of the '{@link org.cylio.project.domain.editor.Domain#getCreationDate <em>Creation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creation Date</em>' attribute.
   * @see #getCreationDate()
   * @generated
   */
  void setCreationDate(Date value);

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
   * @see org.cylio.project.domain.editor.EditorPackage#getDomain_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.cylio.project.domain.editor.Domain#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link org.cylio.project.domain.editor.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see org.cylio.project.domain.editor.Color
   * @see #setColor(Color)
   * @see org.cylio.project.domain.editor.EditorPackage#getDomain_Color()
   * @model
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link org.cylio.project.domain.editor.Domain#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see org.cylio.project.domain.editor.Color
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

} // Domain
