/**
 */
package org.cylio.project.domain.editor.area;

import org.cylio.project.domain.editor.data.BusinessInformation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.area.Area#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.Area#getMacroProcesses <em>Macro Processes</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.Area#getBusinessInformationsNotUsed <em>Business Informations Not Used</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.area.Area#getPurpose <em>Purpose</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.domain.editor.area.AreaPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cylio.project.domain.editor.area.AreaPackage#getArea_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.area.Area#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Macro Processes</b></em>' containment reference list.
	 * The list contents are of type {@link org.cylio.project.domain.editor.area.MacroProcess}.
	 * It is bidirectional and its opposite is '{@link org.cylio.project.domain.editor.area.MacroProcess#getOwnerArea <em>Owner Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macro Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro Processes</em>' containment reference list.
	 * @see org.cylio.project.domain.editor.area.AreaPackage#getArea_MacroProcesses()
	 * @see org.cylio.project.domain.editor.area.MacroProcess#getOwnerArea
	 * @model opposite="ownerArea" containment="true"
	 * @generated
	 */
	EList<MacroProcess> getMacroProcesses();

	/**
	 * Returns the value of the '<em><b>Business Informations Not Used</b></em>' containment reference list.
	 * The list contents are of type {@link org.cylio.project.domain.editor.data.BusinessInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Informations Not Used</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Informations Not Used</em>' containment reference list.
	 * @see org.cylio.project.domain.editor.area.AreaPackage#getArea_BusinessInformationsNotUsed()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessInformation> getBusinessInformationsNotUsed();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.cylio.project.domain.editor.area.AreaPackage#getArea_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.cylio.project.domain.editor.area.Area#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // Area
