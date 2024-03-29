/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.domain.editor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cylio.project.domain.editor.EditorPackage#getStatus()
 * @model
 * @generated
 */
public enum Status implements Enumerator {
  /**
   * The '<em><b>PRODUCTION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRODUCTION_VALUE
   * @generated
   * @ordered
   */
  PRODUCTION(2, "PRODUCTION", "PRODUCTION"),

  /**
   * The '<em><b>PROJECT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROJECT_VALUE
   * @generated
   * @ordered
   */
  PROJECT(1, "PROJECT", "PROJECT"),

  /**
   * The '<em><b>INITIATIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INITIATIVE_VALUE
   * @generated
   * @ordered
   */
  INITIATIVE(0, "INITIATIVE", "INITIATIVE");

  /**
   * The '<em><b>PRODUCTION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRODUCTION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRODUCTION
   * @model
   * @generated
   * @ordered
   */
  public static final int PRODUCTION_VALUE = 2;

  /**
   * The '<em><b>PROJECT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROJECT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROJECT
   * @model
   * @generated
   * @ordered
   */
  public static final int PROJECT_VALUE = 1;

  /**
   * The '<em><b>INITIATIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INITIATIVE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INITIATIVE
   * @model
   * @generated
   * @ordered
   */
  public static final int INITIATIVE_VALUE = 0;

  /**
   * An array of all the '<em><b>Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Status[] VALUES_ARRAY =
    new Status[] {
      PRODUCTION,
      PROJECT,
      INITIATIVE,
    };

  /**
   * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Status> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Status get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Status result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Status</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Status getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Status result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Status get(int value) {
    switch (value) {
      case PRODUCTION_VALUE: return PRODUCTION;
      case PROJECT_VALUE: return PROJECT;
      case INITIATIVE_VALUE: return INITIATIVE;
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
  private Status(int value, String name, String literal) {
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
  
} //Status
