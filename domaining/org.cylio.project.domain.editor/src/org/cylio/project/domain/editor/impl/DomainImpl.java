/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor.impl;

import java.util.Date;

import org.cylio.project.domain.editor.Color;
import org.cylio.project.domain.editor.Domain;
import org.cylio.project.domain.editor.EditorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.impl.DomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.impl.DomainImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.impl.DomainImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.impl.DomainImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DomainImpl extends EObjectImpl implements Domain {
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
   * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreationDate()
   * @generated
   * @ordered
   */
  protected static final Date CREATION_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreationDate()
   * @generated
   * @ordered
   */
  protected Date creationDate = CREATION_DATE_EDEFAULT;

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
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final Color COLOR_EDEFAULT = Color.RED;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color = COLOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return EditorPackage.Literals.DOMAIN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getCreationDate() {
    return creationDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreationDate(Date newCreationDate) {
    Date oldCreationDate = creationDate;
    creationDate = newCreationDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN__CREATION_DATE, oldCreationDate, creationDate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor() {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor) {
    Color oldColor = color;
    color = newColor == null ? COLOR_EDEFAULT : newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN__COLOR, oldColor, color));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case EditorPackage.DOMAIN__NAME:
        return getName();
      case EditorPackage.DOMAIN__CREATION_DATE:
        return getCreationDate();
      case EditorPackage.DOMAIN__DESCRIPTION:
        return getDescription();
      case EditorPackage.DOMAIN__COLOR:
        return getColor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case EditorPackage.DOMAIN__NAME:
        setName((String)newValue);
        return;
      case EditorPackage.DOMAIN__CREATION_DATE:
        setCreationDate((Date)newValue);
        return;
      case EditorPackage.DOMAIN__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case EditorPackage.DOMAIN__COLOR:
        setColor((Color)newValue);
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
      case EditorPackage.DOMAIN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EditorPackage.DOMAIN__CREATION_DATE:
        setCreationDate(CREATION_DATE_EDEFAULT);
        return;
      case EditorPackage.DOMAIN__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case EditorPackage.DOMAIN__COLOR:
        setColor(COLOR_EDEFAULT);
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
      case EditorPackage.DOMAIN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EditorPackage.DOMAIN__CREATION_DATE:
        return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
      case EditorPackage.DOMAIN__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case EditorPackage.DOMAIN__COLOR:
        return color != COLOR_EDEFAULT;
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
    result.append(", creationDate: ");
    result.append(creationDate);
    result.append(", description: ");
    result.append(description);
    result.append(", color: ");
    result.append(color);
    result.append(')');
    return result.toString();
  }

} //DomainImpl
