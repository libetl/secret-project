package org.cylio.project.domain.editor.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.cylio.project.domain.editor.EditorPackage;
import org.cylio.project.domain.editor.diagram.edit.parts.Area2EditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.AreaEditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.InformationSystemEditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.SubDomain2EditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.SubDomainEditPart;
import org.cylio.project.domain.editor.diagram.part.TestDiagramEditorPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class TestElementTypes {

  /**
   * @generated
   */
  private TestElementTypes () {
  }

  /**
   * @generated
   */
  private static Map<IElementType, ENamedElement> elements;

  /**
   * @generated
   */
  private static ImageRegistry                    imageRegistry;

  /**
   * @generated
   */
  private static Set<IElementType>                KNOWN_ELEMENT_TYPES;

  /**
   * @generated
   */
  public static final IElementType                InformationSystem_1000 = getElementType ("org.cylio.project.domain.editor.diagram.InformationSystem_1000"); //$NON-NLS-1$
  /**
   * @generated
   */
  public static final IElementType                SubDomain_2001         = getElementType ("org.cylio.project.domain.editor.diagram.SubDomain_2001");        //$NON-NLS-1$
  /**
   * @generated
   */
  public static final IElementType                Area_2002              = getElementType ("org.cylio.project.domain.editor.diagram.Area_2002");             //$NON-NLS-1$
  /**
   * @generated
   */
  public static final IElementType                Area_4001              = getElementType ("org.cylio.project.domain.editor.diagram.Area_4001");             //$NON-NLS-1$
  /**
   * @generated
   */
  public static final IElementType                SubDomain_4002         = getElementType ("org.cylio.project.domain.editor.diagram.SubDomain_4002");        //$NON-NLS-1$

  /**
   * @generated
   */
  private static ImageRegistry getImageRegistry () {
    if (imageRegistry == null) {
      imageRegistry = new ImageRegistry ();
    }
    return imageRegistry;
  }

  /**
   * @generated
   */
  private static String getImageRegistryKey (ENamedElement element) {
    return element.getName ();
  }

  /**
   * @generated
   */
  private static ImageDescriptor getProvidedImageDescriptor (
      ENamedElement element) {
    if (element instanceof EStructuralFeature) {
      EStructuralFeature feature = ((EStructuralFeature) element);
      EClass eContainingClass = feature.getEContainingClass ();
      EClassifier eType = feature.getEType ();
      if (eContainingClass != null && !eContainingClass.isAbstract ()) {
        element = eContainingClass;
      } else if (eType instanceof EClass && !((EClass) eType).isAbstract ()) {
        element = eType;
      }
    }
    if (element instanceof EClass) {
      EClass eClass = (EClass) element;
      if (!eClass.isAbstract ()) { return TestDiagramEditorPlugin
          .getInstance ().getItemImageDescriptor (
              eClass.getEPackage ().getEFactoryInstance ().create (eClass)); }
    }
    // TODO : support structural features
    return null;
  }

  /**
   * @generated
   */
  public static ImageDescriptor getImageDescriptor (ENamedElement element) {
    String key = getImageRegistryKey (element);
    ImageDescriptor imageDescriptor = getImageRegistry ().getDescriptor (key);
    if (imageDescriptor == null) {
      imageDescriptor = getProvidedImageDescriptor (element);
      if (imageDescriptor == null) {
        imageDescriptor = ImageDescriptor.getMissingImageDescriptor ();
      }
      getImageRegistry ().put (key, imageDescriptor);
    }
    return imageDescriptor;
  }

  /**
   * @generated
   */
  public static Image getImage (ENamedElement element) {
    String key = getImageRegistryKey (element);
    Image image = getImageRegistry ().get (key);
    if (image == null) {
      ImageDescriptor imageDescriptor = getProvidedImageDescriptor (element);
      if (imageDescriptor == null) {
        imageDescriptor = ImageDescriptor.getMissingImageDescriptor ();
      }
      getImageRegistry ().put (key, imageDescriptor);
      image = getImageRegistry ().get (key);
    }
    return image;
  }

  /**
   * @generated
   */
  public static ImageDescriptor getImageDescriptor (IAdaptable hint) {
    ENamedElement element = getElement (hint);
    if (element == null) { return null; }
    return getImageDescriptor (element);
  }

  /**
   * @generated
   */
  public static Image getImage (IAdaptable hint) {
    ENamedElement element = getElement (hint);
    if (element == null) { return null; }
    return getImage (element);
  }

  /**
   * Returns 'type' of the ecore object associated with the hint.
   * 
   * @generated
   */
  public static ENamedElement getElement (IAdaptable hint) {
    Object type = hint.getAdapter (IElementType.class);
    if (elements == null) {
      elements = new IdentityHashMap<IElementType, ENamedElement> ();

      elements.put (InformationSystem_1000,
          EditorPackage.eINSTANCE.getInformationSystem ());

      elements.put (SubDomain_2001, EditorPackage.eINSTANCE.getSubDomain ());

      elements.put (Area_2002, EditorPackage.eINSTANCE.getArea ());

      elements.put (Area_4001, EditorPackage.eINSTANCE.getArea ());

      elements.put (SubDomain_4002, EditorPackage.eINSTANCE.getSubDomain ());
    }
    return (ENamedElement) elements.get (type);
  }

  /**
   * @generated
   */
  private static IElementType getElementType (String id) {
    return ElementTypeRegistry.getInstance ().getType (id);
  }

  /**
   * @generated
   */
  public static boolean isKnownElementType (IElementType elementType) {
    if (KNOWN_ELEMENT_TYPES == null) {
      KNOWN_ELEMENT_TYPES = new HashSet<IElementType> ();
      KNOWN_ELEMENT_TYPES.add (InformationSystem_1000);
      KNOWN_ELEMENT_TYPES.add (SubDomain_2001);
      KNOWN_ELEMENT_TYPES.add (Area_2002);
      KNOWN_ELEMENT_TYPES.add (Area_4001);
      KNOWN_ELEMENT_TYPES.add (SubDomain_4002);
    }
    return KNOWN_ELEMENT_TYPES.contains (elementType);
  }

  /**
   * @generated
   */
  public static IElementType getElementType (int visualID) {
    switch (visualID) {
      case InformationSystemEditPart.VISUAL_ID :
        return InformationSystem_1000;
      case SubDomainEditPart.VISUAL_ID :
        return SubDomain_2001;
      case AreaEditPart.VISUAL_ID :
        return Area_2002;
      case Area2EditPart.VISUAL_ID :
        return Area_4001;
      case SubDomain2EditPart.VISUAL_ID :
        return SubDomain_4002;
    }
    return null;
  }

}
