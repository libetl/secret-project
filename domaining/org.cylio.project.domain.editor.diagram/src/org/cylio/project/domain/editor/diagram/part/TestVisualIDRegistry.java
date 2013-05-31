package org.cylio.project.domain.editor.diagram.part;

import org.cylio.project.domain.editor.EditorPackage;
import org.cylio.project.domain.editor.InformationSystem;
import org.cylio.project.domain.editor.diagram.edit.parts.Area2EditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.AreaEditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.AreaName2EditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.AreaNameEditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.InformationSystemEditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.SubDomain2EditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.SubDomainEditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.SubDomainName2EditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.SubDomainNameEditPart;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TestVisualIDRegistry {

  /**
   * @generated
   */
  private static final String DEBUG_KEY = "org.cylio.project.domain.editor.diagram/debug/visualID"; //$NON-NLS-1$

  /**
   * @generated
   */
  public static int getVisualID (View view) {
    if (view instanceof Diagram) {
      if (InformationSystemEditPart.MODEL_ID.equals (view.getType ())) {
        return InformationSystemEditPart.VISUAL_ID;
      } else {
        return -1;
      }
    }
    return org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry
        .getVisualID (view.getType ());
  }

  /**
   * @generated
   */
  public static String getModelID (View view) {
    View diagram = view.getDiagram ();
    while (view != diagram) {
      EAnnotation annotation = view.getEAnnotation ("Shortcut"); //$NON-NLS-1$
      if (annotation != null) { return (String) annotation.getDetails ().get (
          "modelID"); //$NON-NLS-1$
      }
      view = (View) view.eContainer ();
    }
    return diagram != null ? diagram.getType () : null;
  }

  /**
   * @generated
   */
  public static int getVisualID (String type) {
    try {
      return Integer.parseInt (type);
    } catch (NumberFormatException e) {
      if (Boolean.TRUE.toString ().equalsIgnoreCase (
          Platform.getDebugOption (DEBUG_KEY))) {
        TestDiagramEditorPlugin.getInstance ().logError (
            "Unable to parse view type as a visualID number: " + type);
      }
    }
    return -1;
  }

  /**
   * @generated
   */
  public static String getType (int visualID) {
    return Integer.toString (visualID);
  }

  /**
   * @generated
   */
  public static int getDiagramVisualID (EObject domainElement) {
    if (domainElement == null) { return -1; }
    if (EditorPackage.eINSTANCE.getInformationSystem ().isSuperTypeOf (
        domainElement.eClass ())
        && isDiagram ((InformationSystem) domainElement)) { return InformationSystemEditPart.VISUAL_ID; }
    return -1;
  }

  /**
   * @generated
   */
  public static int getNodeVisualID (View containerView, EObject domainElement) {
    if (domainElement == null) { return -1; }
    String containerModelID = org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry
        .getModelID (containerView);
    if (!InformationSystemEditPart.MODEL_ID.equals (containerModelID)) { return -1; }
    int containerVisualID;
    if (InformationSystemEditPart.MODEL_ID.equals (containerModelID)) {
      containerVisualID = org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry
          .getVisualID (containerView);
    } else {
      if (containerView instanceof Diagram) {
        containerVisualID = InformationSystemEditPart.VISUAL_ID;
      } else {
        return -1;
      }
    }
    switch (containerVisualID) {
      case InformationSystemEditPart.VISUAL_ID :
        if (EditorPackage.eINSTANCE.getSubDomain ().isSuperTypeOf (
            domainElement.eClass ())) { return SubDomainEditPart.VISUAL_ID; }
        if (EditorPackage.eINSTANCE.getArea ().isSuperTypeOf (
            domainElement.eClass ())) { return AreaEditPart.VISUAL_ID; }
        break;
    }
    return -1;
  }

  /**
   * @generated
   */
  public static boolean canCreateNode (View containerView, int nodeVisualID) {
    String containerModelID = org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry
        .getModelID (containerView);
    if (!InformationSystemEditPart.MODEL_ID.equals (containerModelID)) { return false; }
    int containerVisualID;
    if (InformationSystemEditPart.MODEL_ID.equals (containerModelID)) {
      containerVisualID = org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry
          .getVisualID (containerView);
    } else {
      if (containerView instanceof Diagram) {
        containerVisualID = InformationSystemEditPart.VISUAL_ID;
      } else {
        return false;
      }
    }
    switch (containerVisualID) {
      case InformationSystemEditPart.VISUAL_ID :
        if (SubDomainEditPart.VISUAL_ID == nodeVisualID) { return true; }
        if (AreaEditPart.VISUAL_ID == nodeVisualID) { return true; }
        break;
      case SubDomainEditPart.VISUAL_ID :
        if (SubDomainNameEditPart.VISUAL_ID == nodeVisualID) { return true; }
        break;
      case AreaEditPart.VISUAL_ID :
        if (AreaNameEditPart.VISUAL_ID == nodeVisualID) { return true; }
        break;
      case Area2EditPart.VISUAL_ID :
        if (AreaName2EditPart.VISUAL_ID == nodeVisualID) { return true; }
        break;
      case SubDomain2EditPart.VISUAL_ID :
        if (SubDomainName2EditPart.VISUAL_ID == nodeVisualID) { return true; }
        break;
    }
    return false;
  }

  /**
   * @generated
   */
  public static int getLinkWithClassVisualID (EObject domainElement) {
    if (domainElement == null) { return -1; }
    if (EditorPackage.eINSTANCE.getArea ().isSuperTypeOf (
        domainElement.eClass ())) { return Area2EditPart.VISUAL_ID; }
    if (EditorPackage.eINSTANCE.getSubDomain ().isSuperTypeOf (
        domainElement.eClass ())) { return SubDomain2EditPart.VISUAL_ID; }
    return -1;
  }

  /**
   * User can change implementation of this method to handle some specific
   * situations not covered by default logic.
   * 
   * @generated
   */
  private static boolean isDiagram (InformationSystem element) {
    return true;
  }

}
