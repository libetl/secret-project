/**
 */
package org.cylio.project.domain.editor.domaintype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.cylio.project.domain.editor.domaintype.DomaintypePackage
 * @generated
 */
public interface DomaintypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomaintypeFactory eINSTANCE = org.cylio.project.domain.editor.domaintype.impl.DomaintypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Functional Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Domain</em>'.
	 * @generated
	 */
	FunctionalDomain createFunctionalDomain();

	/**
	 * Returns a new object of class '<em>Business Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Domain</em>'.
	 * @generated
	 */
	BusinessDomain createBusinessDomain();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomaintypePackage getDomaintypePackage();

} //DomaintypeFactory
