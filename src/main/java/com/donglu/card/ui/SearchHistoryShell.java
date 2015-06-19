package com.donglu.card.ui;

import java.awt.Toolkit;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;

public class SearchHistoryShell extends Shell {
	private Table table;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Table table_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			SearchHistoryShell shell = new SearchHistoryShell(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the shell.
	 * @param display
	 */
	public SearchHistoryShell(Display display) {
		super(display, SWT.SHELL_TRIM);
		setCenter();
		setImage(SWTResourceManager.getImage(SearchHistoryShell.class, "/image/search_32.png"));
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		TabFolder tabFolder = new TabFolder(this, SWT.NONE);
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("临时车辆");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite);
		GridLayout gl_composite = new GridLayout(1, false);
		gl_composite.marginHeight = 0;
		gl_composite.verticalSpacing = 0;
		composite.setLayout(gl_composite);
		
		Group group = new Group(composite, SWT.NONE);
		group.setFont(SWTResourceManager.getFont("微软雅黑", 5, SWT.NORMAL));
		group.setLayout(new GridLayout(7, false));
		group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel = new Label(group, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("车牌号码");
		
		text = new Text(group, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		
		Label lblNewLabel_1 = new Label(group, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("操作员");
		
		text_1 = new Text(group, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		
		Button btnNewButton = new Button(group, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
		btnNewButton.setImage(SWTResourceManager.getImage(SearchHistoryShell.class, "/image/search_32.png"));
		btnNewButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 3));
		btnNewButton.setText("查询");
		
		Label lblNewLabel_2 = new Label(group, SWT.NONE);
		lblNewLabel_2.setText("起始入场");
		
		DateTime dateTime = new DateTime(group, SWT.BORDER);
		
		DateTime dateTime_1 = new DateTime(group, SWT.BORDER | SWT.TIME);
		
		Label label = new Label(group, SWT.NONE);
		label.setText("起始出场");
		
		DateTime dateTime_2 = new DateTime(group, SWT.BORDER);
		
		DateTime dateTime_3 = new DateTime(group, SWT.BORDER | SWT.TIME);
		
		Label label_1 = new Label(group, SWT.NONE);
		label_1.setText("截止入场");
		
		DateTime dateTime_4 = new DateTime(group, SWT.BORDER);
		
		DateTime dateTime_5 = new DateTime(group, SWT.BORDER | SWT.TIME);
		
		Label label_2 = new Label(group, SWT.NONE);
		label_2.setText("截止出场");
		
		DateTime dateTime_6 = new DateTime(group, SWT.BORDER);
		
		DateTime dateTime_7 = new DateTime(group, SWT.BORDER | SWT.TIME);
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TableViewer tableViewer = new TableViewer(composite_2, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableColumn = tableViewerColumn.getColumn();
		tableColumn.setWidth(100);
		tableColumn.setText("流水号");
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableColumn_1 = tableViewerColumn_1.getColumn();
		tableColumn_1.setWidth(100);
		tableColumn_1.setText("车牌号码");
		
		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableColumn_2 = tableViewerColumn_2.getColumn();
		tableColumn_2.setWidth(100);
		tableColumn_2.setText("入场时间");
		
		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableColumn_3 = tableViewerColumn_3.getColumn();
		tableColumn_3.setWidth(100);
		tableColumn_3.setText("出场时间");
		
		TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableColumn_4 = tableViewerColumn_4.getColumn();
		tableColumn_4.setWidth(100);
		tableColumn_4.setText("停车时间");
		
		TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableColumn_5 = tableViewerColumn_5.getColumn();
		tableColumn_5.setWidth(100);
		tableColumn_5.setText("收费金额");
		
		TableViewerColumn tableViewerColumn_6 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableColumn_6 = tableViewerColumn_6.getColumn();
		tableColumn_6.setWidth(100);
		tableColumn_6.setText("操作员");
		
		Composite composite_5 = new Composite(composite, SWT.NONE);
		GridLayout gl_composite_5 = new GridLayout(5, false);
		gl_composite_5.verticalSpacing = 0;
		gl_composite_5.marginWidth = 0;
		gl_composite_5.marginHeight = 0;
		gl_composite_5.horizontalSpacing = 0;
		composite_5.setLayout(gl_composite_5);
		composite_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_9 = new Label(composite_5, SWT.NONE);
		lblNewLabel_9.setText("当前");
		
		Label lblNewLabel_10 = new Label(composite_5, SWT.NONE);
		GridData gd_lblNewLabel_10 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_lblNewLabel_10.horizontalIndent = 20;
		lblNewLabel_10.setLayoutData(gd_lblNewLabel_10);
		lblNewLabel_10.setText("0/0");
		
		Label lblNewLabel_11 = new Label(composite_5, SWT.NONE);
		lblNewLabel_11.setText("总计：");
		
		Label lblNewLabel_12 = new Label(composite_5, SWT.NONE);
		GridData gd_lblNewLabel_12 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_12.widthHint = 150;
		lblNewLabel_12.setLayoutData(gd_lblNewLabel_12);
		lblNewLabel_12.setText("0.0");
		
		Button btnNewButton_2 = new Button(composite_5, SWT.NONE);
		btnNewButton_2.setText("更多");
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("固定车辆");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite_1);
		GridLayout gl_composite_1 = new GridLayout(1, false);
		gl_composite_1.verticalSpacing = 0;
		gl_composite_1.marginHeight = 0;
		composite_1.setLayout(gl_composite_1);
		
		Composite composite_3 = new Composite(composite_1, SWT.NONE);
		GridLayout gl_composite_3 = new GridLayout(1, false);
		gl_composite_3.marginHeight = 0;
		gl_composite_3.verticalSpacing = 0;
		composite_3.setLayout(gl_composite_3);
		composite_3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Group group_1 = new Group(composite_3, SWT.NONE);
		group_1.setFont(SWTResourceManager.getFont("微软雅黑", 5, SWT.NORMAL));
		group_1.setLayout(new GridLayout(7, false));
		group_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_3 = new Label(group_1, SWT.NONE);
		label_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_3.setText("车牌号码");
		
		text_2 = new Text(group_1, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		
		Label label_4 = new Label(group_1, SWT.NONE);
		label_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_4.setText("操作员");
		
		text_3 = new Text(group_1, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		
		Button btnNewButton_1 = new Button(group_1, SWT.NONE);
		btnNewButton_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
		btnNewButton_1.setImage(SWTResourceManager.getImage(SearchHistoryShell.class, "/image/search_32.png"));
		btnNewButton_1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 4));
		btnNewButton_1.setText("查询");
		
		Label lblNewLabel_3 = new Label(group_1, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_3.setText("用户编号");
		
		text_4 = new Text(group_1, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		
		Label lblNewLabel_4 = new Label(group_1, SWT.NONE);
		lblNewLabel_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_4.setText("用户名称");
		
		text_5 = new Text(group_1, SWT.BORDER);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		
		Label lblNewLabel_5 = new Label(group_1, SWT.NONE);
		lblNewLabel_5.setText("起始入场");
		
		DateTime dateTime_8 = new DateTime(group_1, SWT.BORDER);
		
		DateTime dateTime_9 = new DateTime(group_1, SWT.BORDER | SWT.TIME);
		
		Label lblNewLabel_6 = new Label(group_1, SWT.NONE);
		lblNewLabel_6.setText("起始出场");
		
		DateTime dateTime_10 = new DateTime(group_1, SWT.BORDER);
		
		DateTime dateTime_11 = new DateTime(group_1, SWT.BORDER | SWT.TIME);
		
		Label lblNewLabel_7 = new Label(group_1, SWT.NONE);
		lblNewLabel_7.setText("截止入场");
		
		DateTime dateTime_12 = new DateTime(group_1, SWT.BORDER);
		
		DateTime dateTime_13 = new DateTime(group_1, SWT.BORDER | SWT.TIME);
		
		Label lblNewLabel_8 = new Label(group_1, SWT.NONE);
		lblNewLabel_8.setText("截止出场");
		
		DateTime dateTime_14 = new DateTime(group_1, SWT.BORDER);
		
		DateTime dateTime_15 = new DateTime(group_1, SWT.BORDER | SWT.TIME);
		
		Composite composite_4 = new Composite(composite_3, SWT.NONE);
		composite_4.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite_4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TableViewer tableViewer_1 = new TableViewer(composite_4, SWT.BORDER | SWT.FULL_SELECTION);
		table_1 = tableViewer_1.getTable();
		table_1.setLinesVisible(true);
		table_1.setHeaderVisible(true);
		
		TableViewerColumn tableViewerColumn_7 = new TableViewerColumn(tableViewer_1, SWT.NONE);
		TableColumn tableColumn_7 = tableViewerColumn_7.getColumn();
		tableColumn_7.setWidth(100);
		tableColumn_7.setText("流水号");
		
		TableViewerColumn tableViewerColumn_8 = new TableViewerColumn(tableViewer_1, SWT.NONE);
		TableColumn tableColumn_8 = tableViewerColumn_8.getColumn();
		tableColumn_8.setWidth(100);
		tableColumn_8.setText("车牌号码");
		
		TableViewerColumn tableViewerColumn_9 = new TableViewerColumn(tableViewer_1, SWT.NONE);
		TableColumn tableColumn_9 = tableViewerColumn_9.getColumn();
		tableColumn_9.setWidth(100);
		tableColumn_9.setText("入场时间");
		
		TableViewerColumn tableViewerColumn_10 = new TableViewerColumn(tableViewer_1, SWT.NONE);
		TableColumn tableColumn_10 = tableViewerColumn_10.getColumn();
		tableColumn_10.setWidth(100);
		tableColumn_10.setText("出场时间");
		
		TableViewerColumn tableViewerColumn_11 = new TableViewerColumn(tableViewer_1, SWT.NONE);
		TableColumn tableColumn_11 = tableViewerColumn_11.getColumn();
		tableColumn_11.setWidth(100);
		tableColumn_11.setText("用户名称");
		
		TableViewerColumn tableViewerColumn_12 = new TableViewerColumn(tableViewer_1, SWT.NONE);
		TableColumn tableColumn_12 = tableViewerColumn_12.getColumn();
		tableColumn_12.setWidth(100);
		tableColumn_12.setText("用户编号");
		
		TableViewerColumn tableViewerColumn_13 = new TableViewerColumn(tableViewer_1, SWT.NONE);
		TableColumn tableColumn_13 = tableViewerColumn_12.getColumn();
		tableColumn_13.setWidth(100);
		tableColumn_13.setText("用户编号");
		
		TableViewerColumn tableViewerColumn_14 = new TableViewerColumn(tableViewer_1, SWT.NONE);
		TableColumn tableColumn_14 = tableViewerColumn_13.getColumn();
		tableColumn_14.setWidth(100);
		tableColumn_14.setText("操作员");
		
		Composite composite_6 = new Composite(composite_3, SWT.NONE);
		composite_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		GridLayout gl_composite_6 = new GridLayout(3, false);
		gl_composite_6.verticalSpacing = 0;
		gl_composite_6.marginWidth = 0;
		gl_composite_6.marginHeight = 0;
		gl_composite_6.horizontalSpacing = 0;
		composite_6.setLayout(gl_composite_6);
		
		Label label_5 = new Label(composite_6, SWT.NONE);
		label_5.setText("当前");
		
		Label label_6 = new Label(composite_6, SWT.NONE);
		GridData gd_label_6 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_label_6.horizontalIndent = 20;
		label_6.setLayoutData(gd_label_6);
		label_6.setText("0/0");
		
		Button button = new Button(composite_6, SWT.NONE);
		button.setText("更多");
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("进出记录查询");
		setSize(793, 544);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	private void setCenter() {
		int screenH = Toolkit.getDefaultToolkit().getScreenSize().height;
		int screenW = Toolkit.getDefaultToolkit().getScreenSize().width;
		 //获取对象窗口高度和宽度
		int shellH = getShell().getBounds().height;
		int shellW = getShell().getBounds().width;
		getShell().setLocation(((screenW - shellW) / 2), ((screenH - shellH) / 2));
	}
}
