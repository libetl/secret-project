/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor.util;

import org.cylio.project.domain.editor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.cylio.project.domain.editor.EditorPackage
 * @generated
 */
public class EditorAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EditorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = EditorPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditorSwitch<Adapter> modelSwitch =
    new EditorSwitch<Adapter>() {
      @Override
      public Adapter caseInformationSystem(InformationSystem object) {
        return createInformationSystemAdapter();
      }
      @Override
      public Adapter caseDomain(Domain object) {
        return createDomainAdapter();
      }
      @Override
      public Adapter caseSubDomain(SubDomain object) {
        return createSubDomainAdapter();
      }
      @Override
      public Adapter caseArea(Area object) {
        return createAreaAdapter();
      }
      @Override
      public Adapter caseBusinessInformation(BusinessInformation object) {
        return createBusinessInformationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.cylio.project.domain.editor.InformationSystem <em>Information System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cylio.project.domain.editor.InformationSystem
   * @generated
   */
  public Adapter createInformationSystemAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cylio.project.domain.editor.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cylio.project.domain.editor.Domain
   * @generated
   */
  public Adapter createDomainAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cylio.project.domain.editor.SubDomain <em>Sub Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cylio.project.domain.editor.SubDomain
   * @generated
   */
  public Adapter createSubDomainAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cylio.project.domain.editor.Area <em>Area</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cylio.project.domain.editor.Area
   * @generated
   */
  public Adapter createAreaAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cylio.project.domain.editor.BusinessInformation <em>Business Information</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cylio.project.domain.editor.BusinessInformation
   * @generated
   */
  public Adapter createBusinessInformationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //EditorAdapterFactory
