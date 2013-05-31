/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor.impl;

import java.util.Collection;
import org.cylio.project.domain.editor.Area;
import org.cylio.project.domain.editor.BusinessInformation;
import org.cylio.project.domain.editor.EditorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.impl.AreaImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.impl.AreaImpl#getBusinessInformationsNotUsed <em>Business Informations Not Used</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AreaImpl extends DomainImpl implements Area {
  /**
   * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected static final String PURPOSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected String purpose = PURPOSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBusinessInformationsNotUsed() <em>Business Informations Not Used</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessInformationsNotUsed()
   * @generated
   * @ordered
   */
  protected EList<BusinessInformation> businessInformationsNotUsed;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AreaImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return EditorPackage.Literals.AREA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPurpose() {
    return purpose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPurpose(String newPurpose) {
    String oldPurpose = purpose;
    purpose = newPurpose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.AREA__PURPOSE, oldPurpose, purpose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BusinessInformation> getBusinessInformationsNotUsed() {
    if (businessInformationsNotUsed == null) {
      businessInformationsNotUsed = new EObjectContainmentEList<BusinessInformation>(BusinessInformation.class, this, EditorPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED);
    }
    return businessInformationsNotUsed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case EditorPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED:
        return ((InternalEList<?>)getBusinessInformationsNotUsed()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.AREA__PURPOSE:
        return getPurpose();
      case EditorPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED:
        return getBusinessInformationsNotUsed();
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
      case EditorPackage.AREA__PURPOSE:
        setPurpose((String)newValue);
        return;
      case EditorPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED:
        getBusinessInformationsNotUsed().clear();
        getBusinessInformationsNotUsed().addAll((Collection<? extends BusinessInformation>)newValue);
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
      case EditorPackage.AREA__PURPOSE:
        setPurpose(PURPOSE_EDEFAULT);
        return;
      case EditorPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED:
        getBusinessInformationsNotUsed().clear();
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
      case EditorPackage.AREA__PURPOSE:
        return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
      case EditorPackage.AREA__BUSINESS_INFORMATIONS_NOT_USED:
        return businessInformationsNotUsed != null && !businessInformationsNotUsed.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (purpose: ");
    result.append(purpose);
    result.append(')');
    return result.toString();
  }

} //AreaImpl
