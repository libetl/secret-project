/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.cylio.project.domain.editor.EditorPackage
 * @generated
 */
public interface EditorFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EditorFactory eINSTANCE = org.cylio.project.domain.editor.impl.EditorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Information System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Information System</em>'.
   * @generated
   */
  InformationSystem createInformationSystem();

  /**
   * Returns a new object of class '<em>Sub Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Domain</em>'.
   * @generated
   */
  SubDomain createSubDomain();

  /**
   * Returns a new object of class '<em>Area</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Area</em>'.
   * @generated
   */
  Area createArea();

  /**
   * Returns a new object of class '<em>Business Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Business Information</em>'.
   * @generated
   */
  BusinessInformation createBusinessInformation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EditorPackage getEditorPackage();

} //EditorFactory
