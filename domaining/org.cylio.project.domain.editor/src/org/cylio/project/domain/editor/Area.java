/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.Area#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.Area#getBusinessInformationsNotUsed <em>Business Informations Not Used</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.EditorPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends Domain {
  /**
   * Returns the value of the '<em><b>Purpose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Purpose</em>' attribute.
   * @see #setPurpose(String)
   * @see org.cylio.project.domain.editor.EditorPackage#getArea_Purpose()
   * @model
   * @generated
   */
  String getPurpose();

  /**
   * Sets the value of the '{@link org.cylio.project.domain.editor.Area#getPurpose <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Purpose</em>' attribute.
   * @see #getPurpose()
   * @generated
   */
  void setPurpose(String value);

  /**
   * Returns the value of the '<em><b>Business Informations Not Used</b></em>' containment reference list.
   * The list contents are of type {@link org.cylio.project.domain.editor.BusinessInformation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business Informations Not Used</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Informations Not Used</em>' containment reference list.
   * @see org.cylio.project.domain.editor.EditorPackage#getArea_BusinessInformationsNotUsed()
   * @model containment="true"
   * @generated
   */
  EList<BusinessInformation> getBusinessInformationsNotUsed();

} // Area
