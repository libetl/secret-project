/**
 */
package org.cylio.project.domain.editor.domaintype.impl;

import org.cylio.project.domain.editor.domaintype.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomaintypeFactoryImpl extends EFactoryImpl implements DomaintypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomaintypeFactory init() {
		try {
			DomaintypeFactory theDomaintypeFactory = (DomaintypeFactory)EPackage.Registry.INSTANCE.getEFactory("http://callisto.blizzart.net/redmine/projects/ccu-lbe#domaintype"); 
			if (theDomaintypeFactory != null) {
				return theDomaintypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomaintypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomaintypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DomaintypePackage.FUNCTIONAL_DOMAIN: return createFunctionalDomain();
			case DomaintypePackage.BUSINESS_DOMAIN: return createBusinessDomain();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDomain createFunctionalDomain() {
		FunctionalDomainImpl functionalDomain = new FunctionalDomainImpl();
		return functionalDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessDomain createBusinessDomain() {
		BusinessDomainImpl businessDomain = new BusinessDomainImpl();
		return businessDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomaintypePackage getDomaintypePackage() {
		return (DomaintypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomaintypePackage getPackage() {
		return DomaintypePackage.eINSTANCE;
	}

} //DomaintypeFactoryImpl
