package org.cylio.project.domain.editor.diagram.part;

import java.util.Collections;
import java.util.List;

import org.cylio.project.domain.editor.diagram.providers.TestElementTypes;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class TestPaletteFactory {

  /**
   * @generated
   */
  public void fillPalette (PaletteRoot paletteRoot) {
    paletteRoot.add (createEditor1Group ());
  }

  /**
   * Creates "editor" palette tool group
   * @generated
   */
  private PaletteContainer createEditor1Group () {
    PaletteGroup paletteContainer = new PaletteGroup (
        Messages.Editor1Group_title);
    paletteContainer.setId ("createEditor1Group"); //$NON-NLS-1$
    paletteContainer
        .add (createInformationSystemBusinessDomains1CreationTool ());
    paletteContainer.add (createSubDomain2CreationTool ());
    paletteContainer.add (createSubDomainSubDomains3CreationTool ());
    paletteContainer.add (createArea4CreationTool ());
    return paletteContainer;
  }

  /**
   * @generated
   */
  private ToolEntry createInformationSystemBusinessDomains1CreationTool () {
    NodeToolEntry entry = new NodeToolEntry (
        Messages.InformationSystemBusinessDomains1CreationTool_title,
        Messages.InformationSystemBusinessDomains1CreationTool_desc,
        Collections.singletonList (TestElementTypes.SubDomain_2001));
    entry.setId ("createInformationSystemBusinessDomains1CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon (TestElementTypes
        .getImageDescriptor (TestElementTypes.SubDomain_2001));
    entry.setLargeIcon (entry.getSmallIcon ());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createSubDomain2CreationTool () {
    NodeToolEntry entry = new NodeToolEntry (
        Messages.SubDomain2CreationTool_title,
        Messages.SubDomain2CreationTool_desc,
        Collections.singletonList (TestElementTypes.Area_2002));
    entry.setId ("createSubDomain2CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon (TestElementTypes
        .getImageDescriptor (TestElementTypes.Area_2002));
    entry.setLargeIcon (entry.getSmallIcon ());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createSubDomainSubDomains3CreationTool () {
    LinkToolEntry entry = new LinkToolEntry (
        Messages.SubDomainSubDomains3CreationTool_title,
        Messages.SubDomainSubDomains3CreationTool_desc,
        Collections.singletonList (TestElementTypes.Area_4001));
    entry.setId ("createSubDomainSubDomains3CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon (TestElementTypes
        .getImageDescriptor (TestElementTypes.Area_4001));
    entry.setLargeIcon (entry.getSmallIcon ());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createArea4CreationTool () {
    LinkToolEntry entry = new LinkToolEntry (Messages.Area4CreationTool_title,
        Messages.Area4CreationTool_desc,
        Collections.singletonList (TestElementTypes.SubDomain_4002));
    entry.setId ("createArea4CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon (TestElementTypes
        .getImageDescriptor (TestElementTypes.SubDomain_4002));
    entry.setLargeIcon (entry.getSmallIcon ());
    return entry;
  }

  /**
   * @generated
   */
  private static class NodeToolEntry extends ToolEntry {

    /**
     * @generated
     */
    private final List<IElementType> elementTypes;

    /**
     * @generated
     */
    private NodeToolEntry (String title, String description,
        List<IElementType> elementTypes) {
      super (title, description, null, null);
      this.elementTypes = elementTypes;
    }

    /**
     * @generated
     */
    public Tool createTool () {
      Tool tool = new UnspecifiedTypeCreationTool (elementTypes);
      tool.setProperties (getToolProperties ());
      return tool;
    }
  }

  /**
   * @generated
   */
  private static class LinkToolEntry extends ToolEntry {

    /**
     * @generated
     */
    private final List<IElementType> relationshipTypes;

    /**
     * @generated
     */
    private LinkToolEntry (String title, String description,
        List<IElementType> relationshipTypes) {
      super (title, description, null, null);
      this.relationshipTypes = relationshipTypes;
    }

    /**
     * @generated
     */
    public Tool createTool () {
      Tool tool = new UnspecifiedTypeConnectionTool (relationshipTypes);
      tool.setProperties (getToolProperties ());
      return tool;
    }
  }
}
