/**
 */
package org.cylio.project.domain.editor.domaintype.impl;

import java.util.Collection;

import org.cylio.project.domain.editor.domaintype.BusinessDomain;
import org.cylio.project.domain.editor.domaintype.DomaintypePackage;
import org.cylio.project.domain.editor.domaintype.FunctionalDomain;

import org.cylio.project.domain.editor.util.Color;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.domaintype.impl.BusinessDomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.domaintype.impl.BusinessDomainImpl#getFunctionalDomains <em>Functional Domains</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.domaintype.impl.BusinessDomainImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessDomainImpl extends EObjectImpl implements BusinessDomain {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The cached value of the '{@link #getFunctionalDomains() <em>Functional Domains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalDomain> functionalDomains;

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
	protected BusinessDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomaintypePackage.Literals.BUSINESS_DOMAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomaintypePackage.BUSINESS_DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalDomain> getFunctionalDomains() {
		if (functionalDomains == null) {
			functionalDomains = new EObjectResolvingEList<FunctionalDomain>(FunctionalDomain.class, this, DomaintypePackage.BUSINESS_DOMAIN__FUNCTIONAL_DOMAINS);
		}
		return functionalDomains;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomaintypePackage.BUSINESS_DOMAIN__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomaintypePackage.BUSINESS_DOMAIN__NAME:
				return getName();
			case DomaintypePackage.BUSINESS_DOMAIN__FUNCTIONAL_DOMAINS:
				return getFunctionalDomains();
			case DomaintypePackage.BUSINESS_DOMAIN__COLOR:
				return getColor();
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
			case DomaintypePackage.BUSINESS_DOMAIN__NAME:
				setName((String)newValue);
				return;
			case DomaintypePackage.BUSINESS_DOMAIN__FUNCTIONAL_DOMAINS:
				getFunctionalDomains().clear();
				getFunctionalDomains().addAll((Collection<? extends FunctionalDomain>)newValue);
				return;
			case DomaintypePackage.BUSINESS_DOMAIN__COLOR:
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
			case DomaintypePackage.BUSINESS_DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomaintypePackage.BUSINESS_DOMAIN__FUNCTIONAL_DOMAINS:
				getFunctionalDomains().clear();
				return;
			case DomaintypePackage.BUSINESS_DOMAIN__COLOR:
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
			case DomaintypePackage.BUSINESS_DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomaintypePackage.BUSINESS_DOMAIN__FUNCTIONAL_DOMAINS:
				return functionalDomains != null && !functionalDomains.isEmpty();
			case DomaintypePackage.BUSINESS_DOMAIN__COLOR:
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
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //BusinessDomainImpl
