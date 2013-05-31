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
 * A representation of the model object '<em><b>Sub Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.SubDomain#getSubDomains <em>Sub Domains</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.EditorPackage#getSubDomain()
 * @model
 * @generated
 */
public interface SubDomain extends Domain {
  /**
   * Returns the value of the '<em><b>Sub Domains</b></em>' containment reference list.
   * The list contents are of type {@link org.cylio.project.domain.editor.Domain}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Domains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Domains</em>' containment reference list.
   * @see org.cylio.project.domain.editor.EditorPackage#getSubDomain_SubDomains()
   * @model containment="true"
   * @generated
   */
  EList<Domain> getSubDomains();

} // SubDomain
