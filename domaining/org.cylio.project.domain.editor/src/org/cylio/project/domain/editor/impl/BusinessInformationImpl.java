/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor.impl;

import java.util.Collection;

import org.cylio.project.domain.editor.BusinessInformation;
import org.cylio.project.domain.editor.EditorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.impl.BusinessInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.impl.BusinessInformationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.impl.BusinessInformationImpl#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessInformationImpl extends EObjectImpl implements BusinessInformation {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EList<String> tags;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessInformationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return EditorPackage.Literals.BUSINESS_INFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BUSINESS_INFORMATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BUSINESS_INFORMATION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTags() {
    if (tags == null) {
      tags = new EDataTypeUniqueEList<String>(String.class, this, EditorPackage.BUSINESS_INFORMATION__TAGS);
    }
    return tags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case EditorPackage.BUSINESS_INFORMATION__NAME:
        return getName();
      case EditorPackage.BUSINESS_INFORMATION__DESCRIPTION:
        return getDescription();
      case EditorPackage.BUSINESS_INFORMATION__TAGS:
        return getTags();
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
      case EditorPackage.BUSINESS_INFORMATION__NAME:
        setName((String)newValue);
        return;
      case EditorPackage.BUSINESS_INFORMATION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case EditorPackage.BUSINESS_INFORMATION__TAGS:
        getTags().clear();
        getTags().addAll((Collection<? extends String>)newValue);
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
      case EditorPackage.BUSINESS_INFORMATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EditorPackage.BUSINESS_INFORMATION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case EditorPackage.BUSINESS_INFORMATION__TAGS:
        getTags().clear();
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
      case EditorPackage.BUSINESS_INFORMATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EditorPackage.BUSINESS_INFORMATION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case EditorPackage.BUSINESS_INFORMATION__TAGS:
        return tags != null && !tags.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", tags: ");
    result.append(tags);
    result.append(')');
    return result.toString();
  }

} //BusinessInformationImpl
