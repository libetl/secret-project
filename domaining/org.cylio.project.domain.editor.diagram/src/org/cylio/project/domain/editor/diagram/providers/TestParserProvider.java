package org.cylio.project.domain.editor.diagram.providers;

import org.cylio.project.domain.editor.EditorPackage;
import org.cylio.project.domain.editor.diagram.edit.parts.AreaName2EditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.AreaNameEditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.SubDomainName2EditPart;
import org.cylio.project.domain.editor.diagram.edit.parts.SubDomainNameEditPart;
import org.cylio.project.domain.editor.diagram.parsers.MessageFormatParser;
import org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TestParserProvider extends AbstractProvider implements
    IParserProvider {

  /**
   * @generated
   */
  private IParser subDomainName_5001Parser;

  /**
   * @generated
   */
  private IParser getSubDomainName_5001Parser () {
    if (subDomainName_5001Parser == null) {
      EAttribute[] features = new EAttribute[] { EditorPackage.eINSTANCE
          .getDomain_Name () };
      MessageFormatParser parser = new MessageFormatParser (features);
      subDomainName_5001Parser = parser;
    }
    return subDomainName_5001Parser;
  }

  /**
   * @generated
   */
  private IParser areaName_5002Parser;

  /**
   * @generated
   */
  private IParser getAreaName_5002Parser () {
    if (areaName_5002Parser == null) {
      EAttribute[] features = new EAttribute[] { EditorPackage.eINSTANCE
          .getDomain_Name () };
      MessageFormatParser parser = new MessageFormatParser (features);
      areaName_5002Parser = parser;
    }
    return areaName_5002Parser;
  }

  /**
   * @generated
   */
  private IParser areaName_6001Parser;

  /**
   * @generated
   */
  private IParser getAreaName_6001Parser () {
    if (areaName_6001Parser == null) {
      EAttribute[] features = new EAttribute[] { EditorPackage.eINSTANCE
          .getDomain_Name () };
      MessageFormatParser parser = new MessageFormatParser (features);
      areaName_6001Parser = parser;
    }
    return areaName_6001Parser;
  }

  /**
   * @generated
   */
  private IParser subDomainName_6002Parser;

  /**
   * @generated
   */
  private IParser getSubDomainName_6002Parser () {
    if (subDomainName_6002Parser == null) {
      EAttribute[] features = new EAttribute[] { EditorPackage.eINSTANCE
          .getDomain_Name () };
      MessageFormatParser parser = new MessageFormatParser (features);
      subDomainName_6002Parser = parser;
    }
    return subDomainName_6002Parser;
  }

  /**
   * @generated
   */
  protected IParser getParser (int visualID) {
    switch (visualID) {
      case SubDomainNameEditPart.VISUAL_ID :
        return getSubDomainName_5001Parser ();
      case AreaNameEditPart.VISUAL_ID :
        return getAreaName_5002Parser ();
      case AreaName2EditPart.VISUAL_ID :
        return getAreaName_6001Parser ();
      case SubDomainName2EditPart.VISUAL_ID :
        return getSubDomainName_6002Parser ();
    }
    return null;
  }

  /**
   * Utility method that consults ParserService
   * @generated
   */
  public static IParser getParser (IElementType type, EObject object,
      String parserHint) {
    return ParserService.getInstance ().getParser (
        new HintAdapter (type, object, parserHint));
  }

  /**
   * @generated
   */
  public IParser getParser (IAdaptable hint) {
    String vid = (String) hint.getAdapter (String.class);
    if (vid != null) { return getParser (TestVisualIDRegistry.getVisualID (vid)); }
    View view = (View) hint.getAdapter (View.class);
    if (view != null) { return getParser (TestVisualIDRegistry
        .getVisualID (view)); }
    return null;
  }

  /**
   * @generated
   */
  public boolean provides (IOperation operation) {
    if (operation instanceof GetParserOperation) {
      IAdaptable hint = ((GetParserOperation) operation).getHint ();
      if (TestElementTypes.getElement (hint) == null) { return false; }
      return getParser (hint) != null;
    }
    return false;
  }

  /**
   * @generated
   */
  private static class HintAdapter extends ParserHintAdapter {

    /**
     * @generated
     */
    private final IElementType elementType;

    /**
     * @generated
     */
    public HintAdapter (IElementType type, EObject object, String parserHint) {
      super (object, parserHint);
      assert type != null;
      elementType = type;
    }

    /**
     * @generated
     */
    public Object getAdapter (Class adapter) {
      if (IElementType.class.equals (adapter)) { return elementType; }
      return super.getAdapter (adapter);
    }
  }

}
