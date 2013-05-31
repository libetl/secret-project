/**
 */
package org.cylio.project.domain.editor.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Provider Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cylio.project.domain.editor.services.ServicesPackage#getProviderType()
 * @model instanceClass="org.cylio.project.domain.editor.services.ProviderType"
 * @generated
 */
public enum ProviderType implements Enumerator {
	/**
	 * The '<em><b>Web Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_SERVICE(0, "WebService", "WebService"),

	/**
	 * The '<em><b>Stream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	STREAM(1, "Stream", "Stream"),

	/**
	 * The '<em><b>MQ Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQ_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MQ_MESSAGE(2, "MQMessage", "MQMessage"),

	/**
	 * The '<em><b>Manual Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_SCRIPT(3, "ManualScript", "ManualScript");

	/**
	 * The '<em><b>Web Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Web Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB_SERVICE
	 * @model name="WebService"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_SERVICE_VALUE = 0;

	/**
	 * The '<em><b>Stream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stream</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STREAM
	 * @model name="Stream"
	 * @generated
	 * @ordered
	 */
	public static final int STREAM_VALUE = 1;

	/**
	 * The '<em><b>MQ Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MQ Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MQ_MESSAGE
	 * @model name="MQMessage"
	 * @generated
	 * @ordered
	 */
	public static final int MQ_MESSAGE_VALUE = 2;

	/**
	 * The '<em><b>Manual Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manual Script</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_SCRIPT
	 * @model name="ManualScript"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_SCRIPT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Provider Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProviderType[] VALUES_ARRAY =
		new ProviderType[] {
			WEB_SERVICE,
			STREAM,
			MQ_MESSAGE,
			MANUAL_SCRIPT,
		};

	/**
	 * A public read-only list of all the '<em><b>Provider Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProviderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provider Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProviderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProviderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provider Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProviderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProviderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provider Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProviderType get(int value) {
		switch (value) {
			case WEB_SERVICE_VALUE: return WEB_SERVICE;
			case STREAM_VALUE: return STREAM;
			case MQ_MESSAGE_VALUE: return MQ_MESSAGE;
			case MANUAL_SCRIPT_VALUE: return MANUAL_SCRIPT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProviderType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ProviderType
