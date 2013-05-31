package org.cylio.project.bi.manager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

public class BiListViewPart extends ViewPart {

  public static final String ID = "org.cylio.project.bi.manager.BiListViewPart"; //$NON-NLS-1$
  
  private TableViewer viewer;
  
  public BiListViewPart () {
  }

  public void createPartControl(Composite parent) {
    GridLayout layout = new GridLayout(2, false);
    parent.setLayout(layout);
    Label searchLabel = new Label(parent, SWT.NONE);
    searchLabel.setText("Search: ");
    final Text searchText = new Text(parent, SWT.BORDER | SWT.SEARCH);
    searchText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
        | GridData.HORIZONTAL_ALIGN_FILL));
    createViewer(parent);
  }

  private void createViewer(Composite parent) {
    viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
        | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
    createColumns(parent, viewer);
    final Table table = viewer.getTable();
    table.setHeaderVisible(true);
    table.setLinesVisible(true);

    viewer.setContentProvider(new ArrayContentProvider());
    // Get the content for the viewer, setInput will call getElements in the
    // contentProvider
    viewer.setInput(ModelProvider.INSTANCE.getbusinessInformations ());
    // Make the selection available to other views
    getSite().setSelectionProvider(viewer);
    // Set the sorter for the table

    // Layout the viewer
    GridData gridData = new GridData();
    gridData.verticalAlignment = GridData.FILL;
    gridData.horizontalSpan = 2;
    gridData.grabExcessHorizontalSpace = true;
    gridData.grabExcessVerticalSpace = true;
    gridData.horizontalAlignment = GridData.FILL;
    viewer.getControl().setLayoutData(gridData);
  }

  public TableViewer getViewer() {
    return viewer;
  }

  // This will create the columns for the table
  private void createColumns(final Composite parent, final TableViewer viewer) {
    String[] titles = { "Name", "Description", "Tags"};
    int[] bounds = { 100, 100, 100};

    // First column is for the first name
    TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
    col.setLabelProvider(new ColumnLabelProvider() {
      @Override
      public String getText(Object element) {
        BusinessInformation p = (BusinessInformation) element;
        return p.getName ();
      }
    });

    // Second column is for the last name
    col = createTableViewerColumn(titles[1], bounds[1], 1);
    col.setLabelProvider(new ColumnLabelProvider() {
      @Override
      public String getText(Object element) {
        BusinessInformation p = (BusinessInformation) element;
        return p.getDescription ();
      }
    });

    // Now the gender
    col = createTableViewerColumn(titles[2], bounds[2], 2);
    col.setLabelProvider(new ColumnLabelProvider() {
      @Override
      public String getText(Object element) {
        BusinessInformation p = (BusinessInformation) element;
        StringBuffer sb = new StringBuffer ();
        for (String tag : p.getTags ()){
          sb.append (tag + " ");
        }
        return sb.toString ();
      }
    });


  }

  private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
    final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
        SWT.NONE);
    final TableColumn column = viewerColumn.getColumn();
    column.setText(title);
    column.setWidth(bound);
    column.setResizable(true);
    column.setMoveable(true);
    return viewerColumn;
  }

  
/** * Passing the focus request to the viewer's control. */

  public void setFocus() {
    viewer.getControl().setFocus();
  }

}
