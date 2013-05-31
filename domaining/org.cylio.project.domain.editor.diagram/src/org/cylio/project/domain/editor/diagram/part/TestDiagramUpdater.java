	package org.cylio.project.domain.editor.diagram.part;

	/**
 * @generated
 */
public class TestDiagramUpdater {
		
		/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestNodeDescriptor> getSemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		switch (org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry.getVisualID(view)) {
		case org.cylio.project.domain.editor.diagram.edit.parts.InformationSystemEditPart.VISUAL_ID:
	return getInformationSystem_1000SemanticChildren(view);
	}
		return java.util.Collections.emptyList();
}
	
	/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestNodeDescriptor> getInformationSystem_1000SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (!view.isSetElement()) {
	return java.util.Collections.emptyList();
}
org.cylio.project.domain.editor.InformationSystem modelElement = (org.cylio.project.domain.editor.InformationSystem) view.getElement();
	java.util.LinkedList<org.cylio.project.domain.editor.diagram.part.TestNodeDescriptor> result = new java.util.LinkedList<org.cylio.project.domain.editor.diagram.part.TestNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getBusinessDomains().iterator(); it.hasNext();) {
		org.cylio.project.domain.editor.Domain childElement = (org.cylio.project.domain.editor.Domain) it.next();
					int visualID = org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == org.cylio.project.domain.editor.diagram.edit.parts.SubDomainEditPart.VISUAL_ID) {
	result.add(new org.cylio.project.domain.editor.diagram.part.TestNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == org.cylio.project.domain.editor.diagram.edit.parts.AreaEditPart.VISUAL_ID) {
	result.add(new org.cylio.project.domain.editor.diagram.part.TestNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}
	
		/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry.getVisualID(view)) {
		case org.cylio.project.domain.editor.diagram.edit.parts.InformationSystemEditPart.VISUAL_ID:
	return getInformationSystem_1000ContainedLinks(view);
case org.cylio.project.domain.editor.diagram.edit.parts.SubDomainEditPart.VISUAL_ID:
	return getSubDomain_2001ContainedLinks(view);
case org.cylio.project.domain.editor.diagram.edit.parts.AreaEditPart.VISUAL_ID:
	return getArea_2002ContainedLinks(view);
case org.cylio.project.domain.editor.diagram.edit.parts.Area2EditPart.VISUAL_ID:
	return getArea_4001ContainedLinks(view);
case org.cylio.project.domain.editor.diagram.edit.parts.SubDomain2EditPart.VISUAL_ID:
	return getSubDomain_4002ContainedLinks(view);
	}
		return java.util.Collections.emptyList();
}
	
		/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getIncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry.getVisualID(view)) {
		case org.cylio.project.domain.editor.diagram.edit.parts.SubDomainEditPart.VISUAL_ID:
	return getSubDomain_2001IncomingLinks(view);
case org.cylio.project.domain.editor.diagram.edit.parts.AreaEditPart.VISUAL_ID:
	return getArea_2002IncomingLinks(view);
case org.cylio.project.domain.editor.diagram.edit.parts.Area2EditPart.VISUAL_ID:
	return getArea_4001IncomingLinks(view);
case org.cylio.project.domain.editor.diagram.edit.parts.SubDomain2EditPart.VISUAL_ID:
	return getSubDomain_4002IncomingLinks(view);
	}
		return java.util.Collections.emptyList();
}
	
		/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getOutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry.getVisualID(view)) {
		case org.cylio.project.domain.editor.diagram.edit.parts.SubDomainEditPart.VISUAL_ID:
	return getSubDomain_2001OutgoingLinks(view);
case org.cylio.project.domain.editor.diagram.edit.parts.AreaEditPart.VISUAL_ID:
	return getArea_2002OutgoingLinks(view);
case org.cylio.project.domain.editor.diagram.edit.parts.Area2EditPart.VISUAL_ID:
	return getArea_4001OutgoingLinks(view);
case org.cylio.project.domain.editor.diagram.edit.parts.SubDomain2EditPart.VISUAL_ID:
	return getSubDomain_4002OutgoingLinks(view);
	}
		return java.util.Collections.emptyList();
}
		
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getInformationSystem_1000ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getSubDomain_2001ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	org.cylio.project.domain.editor.SubDomain modelElement = (org.cylio.project.domain.editor.SubDomain) view.getElement();
		java.util.LinkedList<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> result = new java.util.LinkedList<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Area_4001(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_SubDomain_4002(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getArea_2002ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getArea_4001ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getSubDomain_4002ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	org.cylio.project.domain.editor.SubDomain modelElement = (org.cylio.project.domain.editor.SubDomain) view.getElement();
		java.util.LinkedList<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> result = new java.util.LinkedList<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Area_4001(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_SubDomain_4002(modelElement));	
	return result;
}
		
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getSubDomain_2001IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getArea_2002IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getArea_4001IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getSubDomain_4002IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
		
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getSubDomain_2001OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getArea_2002OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getArea_4001OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getSubDomain_4002OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
	/**
 * @generated
 */
private static java.util.Collection<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getContainedTypeModelFacetLinks_Area_4001(org.cylio.project.domain.editor.SubDomain container) {
	java.util.LinkedList<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> result = new java.util.LinkedList<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getSubDomains().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof org.cylio.project.domain.editor.Area) {
		continue;
	}
	org.cylio.project.domain.editor.Area link = (org.cylio.project.domain.editor.Area) linkObject;
		if (org.cylio.project.domain.editor.diagram.edit.parts.Area2EditPart.VISUAL_ID != org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			
							
							result.add(new org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor(null, null, link, org.cylio.project.domain.editor.diagram.providers.TestElementTypes.Area_4001, org.cylio.project.domain.editor.diagram.edit.parts.Area2EditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> getContainedTypeModelFacetLinks_SubDomain_4002(org.cylio.project.domain.editor.SubDomain container) {
	java.util.LinkedList<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor> result = new java.util.LinkedList<org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getSubDomains().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof org.cylio.project.domain.editor.SubDomain) {
		continue;
	}
	org.cylio.project.domain.editor.SubDomain link = (org.cylio.project.domain.editor.SubDomain) linkObject;
		if (org.cylio.project.domain.editor.diagram.edit.parts.SubDomain2EditPart.VISUAL_ID != org.cylio.project.domain.editor.diagram.part.TestVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			
							
							result.add(new org.cylio.project.domain.editor.diagram.part.TestLinkDescriptor(null, null, link, org.cylio.project.domain.editor.diagram.providers.TestElementTypes.SubDomain_4002, org.cylio.project.domain.editor.diagram.edit.parts.SubDomain2EditPart.VISUAL_ID));
		}
	return result;	
}
		
	}
