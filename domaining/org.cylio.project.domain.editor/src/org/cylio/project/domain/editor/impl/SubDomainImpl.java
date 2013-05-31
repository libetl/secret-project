/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor.impl;

import java.util.Collection;

import org.cylio.project.domain.editor.Domain;
import org.cylio.project.domain.editor.EditorPackage;
import org.cylio.project.domain.editor.SubDomain;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.impl.SubDomainImpl#getSubDomains <em>Sub Domains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubDomainImpl extends DomainImpl implements SubDomain {
  /**
   * The cached value of the '{@link #getSubDomains() <em>Sub Domains</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubDomains()
   * @generated
   * @ordered
   */
  protected EList<Domain> subDomains;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubDomainImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return EditorPackage.Literals.SUB_DOMAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Domain> getSubDomains() {
    if (subDomains == null) {
      subDomains = new EObjectContainmentEList<Domain>(Domain.class, this, EditorPackage.SUB_DOMAIN__SUB_DOMAINS);
    }
    return subDomains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case EditorPackage.SUB_DOMAIN__SUB_DOMAINS:
        return ((InternalEList<?>)getSubDomains()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case EditorPackage.SUB_DOMAIN__SUB_DOMAINS:
        return getSubDomains();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case EditorPackage.SUB_DOMAIN__SUB_DOMAINS:
        getSubDomains().clear();
        getSubDomains().addAll((Collection<? extends Domain>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case EditorPackage.SUB_DOMAIN__SUB_DOMAINS:
        getSubDomains().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case EditorPackage.SUB_DOMAIN__SUB_DOMAINS:
        return subDomains != null && !subDomains.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SubDomainImpl
