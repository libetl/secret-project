/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cylio.project.bi.manager;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cylio.project.domain.editor.BusinessInformation#getName <em>Name</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.BusinessInformation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cylio.project.domain.editor.BusinessInformation#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cylio.project.bi.manager.BiListViewPart
 * @model
 * @generated
 */
public class BusinessInformation{
  
  private String name;
  private String description;
  private List<String> tags;
  public String getName () {
    return name;
  }
  public void setName (String name) {
    this.name = name;
  }
  public String getDescription () {
    return description;
  }
  public void setDescription (String description) {
    this.description = description;
  }
  public List<String> getTags () {
    return tags;
  }
  public void setTags (List<String> tags) {
    this.tags = tags;
  }
  public BusinessInformation (String name, String description, List<String> tags) {
    super ();
    this.name = name;
    this.description = description;
    this.tags = tags;
  }

} // BusinessInformation
