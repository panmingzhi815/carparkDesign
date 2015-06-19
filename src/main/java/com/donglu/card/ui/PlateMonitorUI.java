package com.donglu.card.ui;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.videosurface.CanvasVideoSurface;
import uk.co.caprica.vlcj.player.embedded.videosurface.windows.WindowsVideoSurfaceAdapter;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import uk.co.caprica.vlcj.runtime.x.LibXUtil;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import com.sun.jna.NativeLibrary;
import org.eclipse.swt.layout.RowData;

public class PlateMonitorUI {

	protected Shell shell;
	private Text txta;
	private Text text_1;
	private Text txta_1;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text txtPanmingzhi;
	private Text text_7;
	private Text txta_2;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_13;
	private Text text_14;
	private Composite composite_8;
	private Composite composite_10;
	private Composite composite_11;
	private Composite composite_12;
	
	private Font defaultFont = SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL);
	private Text text;
	private Text text_2;
	private Text text_6;
	private Text text_8;
	
	static{
		NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(),System.getProperty("user.dir") + "/native/vlc/lib");
		LibXUtil.initialise();
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PlateMonitorUI window = new PlateMonitorUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		play();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setImage(SWTResourceManager.getImage(PlateMonitorUI.class, "/image/carpark_72.png"));
		shell.setText("东陆停车场");
		shell.setMinimumSize(new Point(1024, 768));
		GridLayout gl_shell = new GridLayout(2, false);
		gl_shell.horizontalSpacing = 0;
		gl_shell.verticalSpacing = 0;
		gl_shell.marginHeight = 0;
		shell.setLayout(gl_shell);
		
		Composite composite = new Composite(shell, SWT.NONE);
		GridLayout gl_composite = new GridLayout(2, true);
		gl_composite.marginWidth = 0;
		composite.setLayout(gl_composite);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TabFolder tabFolder = new TabFolder(composite_2, SWT.NONE);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("北岗亭入口视频");
		
		composite_8 = new Composite(tabFolder, SWT.EMBEDDED);
		tbtmNewItem.setControl(composite_8);
		
		TabItem tbtmNewItem_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_1.setText("北地下车库入口视频");
		
		composite_10 = new Composite(tabFolder, SWT.EMBEDDED);
		tbtmNewItem_1.setControl(composite_10);
		
		Composite composite_3 = new Composite(composite, SWT.NONE);
		composite_3.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite_3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TabFolder tabFolder_1 = new TabFolder(composite_3, SWT.NONE);
		
		TabItem tbtmNewItem_2 = new TabItem(tabFolder_1, SWT.NONE);
		tbtmNewItem_2.setText("北岗亭出口视频");
		
		composite_11 = new Composite(tabFolder_1, SWT.EMBEDDED);
		tbtmNewItem_2.setControl(composite_11);
		
		TabItem tbtmNewItem_3 = new TabItem(tabFolder_1, SWT.NONE);
		tbtmNewItem_3.setText("北地下出口视频");
		
		composite_12 = new Composite(tabFolder_1, SWT.EMBEDDED);
		tbtmNewItem_3.setControl(composite_12);
		
		Composite composite_6 = new Composite(composite, SWT.NONE);
		composite_6.setLayout(new GridLayout(3, false));
		composite_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_2 = new Label(composite_6, SWT.NONE);
		label_2.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		label_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_2.setText("入场车牌");
		
		txta = new Text(composite_6, SWT.BORDER);
		txta.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txta.setText("鄂A78458");
		txta.setForeground(SWTResourceManager.getColor(0, 0, 255));
		txta.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		txta.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		
		CLabel lblNewLabel = new CLabel(composite_6, SWT.BORDER);
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setFont(SWTResourceManager.getFont("微软雅黑", 15, SWT.BOLD));
		GridData gd_lblNewLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2);
		gd_lblNewLabel.heightHint = 60;
		gd_lblNewLabel.widthHint = 150;
		lblNewLabel.setLayoutData(gd_lblNewLabel);
		lblNewLabel.setText("入场车牌");
		
		Label label_3 = new Label(composite_6, SWT.NONE);
		label_3.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		label_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_3.setText("入场时间");
		
		text_1 = new Text(composite_6, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text_1.setForeground(SWTResourceManager.getColor(0, 0, 255));
		text_1.setText("2015-08-20 11:12:13");
		text_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		text_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		
		Composite composite_7 = new Composite(composite, SWT.NONE);
		composite_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite_7.setLayout(new GridLayout(3, false));
		
		Label label_4 = new Label(composite_7, SWT.NONE);
		label_4.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		label_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_4.setText("入场车牌");
		
		txta_1 = new Text(composite_7, SWT.BORDER);
		txta_1.setForeground(SWTResourceManager.getColor(0, 0, 255));
		txta_1.setText("京A85214");
		txta_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		txta_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		txta_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		CLabel label_5 = new CLabel(composite_7, SWT.BORDER);
		label_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		GridData gd_label_5 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2);
		gd_label_5.widthHint = 150;
		gd_label_5.heightHint = 60;
		label_5.setLayoutData(gd_label_5);
		label_5.setText("入场车牌");
		label_5.setFont(SWTResourceManager.getFont("微软雅黑", 15, SWT.BOLD));
		label_5.setAlignment(SWT.CENTER);
		
		Label label_6 = new Label(composite_7, SWT.NONE);
		label_6.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		label_6.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_6.setText("入场时间");
		
		text_3 = new Text(composite_7, SWT.BORDER);
		text_3.setForeground(SWTResourceManager.getColor(0, 0, 255));
		text_3.setText("2015-08-20 13:11:13");
		text_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		text_3.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_4 = new Composite(composite, SWT.BORDER);
		composite_4.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_composite_4 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_composite_4.heightHint = 300;
		composite_4.setLayoutData(gd_composite_4);
		
		CLabel label = new CLabel(composite_4, SWT.NONE);
		label.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label.setFont(SWTResourceManager.getFont("微软雅黑", 21, SWT.BOLD));
		label.setAlignment(SWT.CENTER);
		label.setText("入场图片");
		
		Composite composite_5 = new Composite(composite, SWT.BORDER);
		composite_5.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_composite_5 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_composite_5.heightHint = 300;
		composite_5.setLayoutData(gd_composite_5);
		
		CLabel label_1 = new CLabel(composite_5, SWT.NONE);
		label_1.setText("出场图片");
		label_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_1.setFont(SWTResourceManager.getFont("微软雅黑", 21, SWT.BOLD));
		label_1.setAlignment(SWT.CENTER);
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		GridLayout gl_composite_1 = new GridLayout(1, false);
		gl_composite_1.marginWidth = 0;
		composite_1.setLayout(gl_composite_1);
		GridData gd_composite_1 = new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 1);
		gd_composite_1.widthHint = 300;
		composite_1.setLayoutData(gd_composite_1);
		
		Group group = new Group(composite_1, SWT.NONE);
		group.setFont(SWTResourceManager.getFont("微软雅黑", 5, SWT.NORMAL));
		GridLayout gl_group = new GridLayout(2, false);
		gl_group.horizontalSpacing = 15;
		gl_group.verticalSpacing = 10;
		group.setLayout(gl_group);
		group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_1 = new Label(group, SWT.RIGHT);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_lblNewLabel_1 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_1.widthHint = 90;
		lblNewLabel_1.setLayoutData(gd_lblNewLabel_1);
		lblNewLabel_1.setText("剩余车位数");
		
		text_4 = new Text(group, SWT.BORDER);
		text_4.setText("1000");
		text_4.setForeground(SWTResourceManager.getColor(255, 255, 255));
		text_4.setBackground(SWTResourceManager.getColor(0, 0, 0));
		text_4.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_2 = new Label(group, SWT.RIGHT);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_lblNewLabel_2 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_2.widthHint = 90;
		lblNewLabel_2.setLayoutData(gd_lblNewLabel_2);
		lblNewLabel_2.setText("时租车数量");
		
		text_5 = new Text(group, SWT.BORDER);
		text_5.setText("804");
		text_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		text_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		text_5.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		{
			Label label_8 = new Label(group, SWT.RIGHT);
			GridData gd_label_8 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
			gd_label_8.widthHint = 90;
			label_8.setLayoutData(gd_label_8);
			label_8.setText("月租车数量");
			label_8.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		}
		{
			text_6 = new Text(group, SWT.BORDER);
			text_6.setText("804");
			text_6.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
			text_6.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
			text_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
			text_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		}
		
		Label lblNewLabel_3 = new Label(group, SWT.RIGHT);
		lblNewLabel_3.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_lblNewLabel_3 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_3.widthHint = 90;
		lblNewLabel_3.setLayoutData(gd_lblNewLabel_3);
		lblNewLabel_3.setText("当前值班");
		
		txtPanmingzhi = new Text(group, SWT.BORDER);
		txtPanmingzhi.setText("panmingzhi");
		txtPanmingzhi.setForeground(SWTResourceManager.getColor(0, 0, 255));
		txtPanmingzhi.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		txtPanmingzhi.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		txtPanmingzhi.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		{
			Label label_8 = new Label(group, SWT.RIGHT);
			GridData gd_label_8 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
			gd_label_8.widthHint = 90;
			label_8.setLayoutData(gd_label_8);
			label_8.setText("上班时间");
			label_8.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		}
		{
			text_8 = new Text(group, SWT.BORDER);
			text_8.setText("2015-06-28 14:28:22");
			text_8.setForeground(SWTResourceManager.getColor(0, 0, 255));
			text_8.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
			text_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
			text_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		}
		{
			Label label_8 = new Label(group, SWT.RIGHT);
			GridData gd_label_8 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
			gd_label_8.widthHint = 90;
			label_8.setLayoutData(gd_label_8);
			label_8.setText("收费金额");
			label_8.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		}
		{
			text_2 = new Text(group, SWT.BORDER);
			text_2.setText("1546.0");
			text_2.setForeground(SWTResourceManager.getColor(255, 255, 255));
			text_2.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
			text_2.setBackground(SWTResourceManager.getColor(0, 0, 0));
			text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		}
		
		Label label_7 = new Label(group, SWT.RIGHT);
		label_7.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_label_7 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_label_7.widthHint = 90;
		label_7.setLayoutData(gd_label_7);
		label_7.setText("免费金额");
		
		text_7 = new Text(group, SWT.BORDER);
		text_7.setText("46.0");
		text_7.setForeground(SWTResourceManager.getColor(255, 255, 255));
		text_7.setBackground(SWTResourceManager.getColor(0, 0, 0));
		text_7.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Group group_1 = new Group(composite_1, SWT.NONE);
		group_1.setFont(SWTResourceManager.getFont("微软雅黑", 5, SWT.NORMAL));
		GridLayout gl_group_1 = new GridLayout(2, false);
		gl_group_1.horizontalSpacing = 15;
		gl_group_1.verticalSpacing = 10;
		group_1.setLayout(gl_group_1);
		group_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Label label_8 = new Label(group_1, SWT.RIGHT);
		label_8.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_label_8 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_label_8.widthHint = 90;
		label_8.setLayoutData(gd_label_8);
		label_8.setText("车牌号码");
		
		txta_2 = new Text(group_1, SWT.BORDER);
		txta_2.setForeground(SWTResourceManager.getColor(0, 0, 255));
		txta_2.setText("京A85214");
		txta_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		txta_2.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		txta_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_9 = new Label(group_1, SWT.RIGHT);
		label_9.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_label_9 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_label_9.widthHint = 90;
		label_9.setLayoutData(gd_label_9);
		label_9.setText("用户名称");
		
		text_9 = new Text(group_1, SWT.BORDER);
		text_9.setForeground(SWTResourceManager.getColor(0, 0, 255));
		text_9.setText("刘志光");
		text_9.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		text_9.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_9.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_14 = new Label(group_1, SWT.RIGHT);
		label_14.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_label_14 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_label_14.widthHint = 90;
		label_14.setLayoutData(gd_label_14);
		label_14.setText("用户类型");
		
		text_14 = new Text(group_1, SWT.BORDER);
		text_14.setForeground(SWTResourceManager.getColor(0, 0, 255));
		text_14.setText("月卡");
		text_14.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		text_14.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_14.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_10 = new Label(group_1, SWT.RIGHT);
		label_10.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_label_10 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_label_10.widthHint = 90;
		label_10.setLayoutData(gd_label_10);
		label_10.setText("入场时间");
		
		text_10 = new Text(group_1, SWT.BORDER);
		text_10.setForeground(SWTResourceManager.getColor(0, 0, 255));
		text_10.setText("2015-08-20 13:11:13");
		text_10.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		text_10.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_10.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_11 = new Label(group_1, SWT.RIGHT);
		label_11.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_label_11 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_label_11.widthHint = 90;
		label_11.setLayoutData(gd_label_11);
		label_11.setText("出场时间");
		
		text_11 = new Text(group_1, SWT.BORDER);
		text_11.setForeground(SWTResourceManager.getColor(0, 0, 255));
		text_11.setText("2015-08-20 15:15:13");
		text_11.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		text_11.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_11.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_12 = new Label(group_1, SWT.RIGHT);
		label_12.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_label_12 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_label_12.widthHint = 90;
		label_12.setLayoutData(gd_label_12);
		label_12.setText("停车时间");
		
		text_12 = new Text(group_1, SWT.BORDER);
		text_12.setForeground(SWTResourceManager.getColor(0, 0, 255));
		text_12.setText("02:04:00");
		text_12.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		text_12.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_12.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		{
			Label label_15 = new Label(group_1, SWT.RIGHT);
			label_15.setText("应收金额");
			label_15.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
			GridData gd_label_15 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
			gd_label_15.widthHint = 90;
			label_15.setLayoutData(gd_label_15);
		}
		{
			text = new Text(group_1, SWT.BORDER);
			text.setText("14.0");
			text.setForeground(SWTResourceManager.getColor(0, 0, 255));
			text.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
			text.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
			text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		}
		
		Label label_13 = new Label(group_1, SWT.RIGHT);
		label_13.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_label_13 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_label_13.widthHint = 90;
		label_13.setLayoutData(gd_label_13);
		label_13.setText("实收金额");
		
		text_13 = new Text(group_1, SWT.BORDER);
		text_13.setForeground(SWTResourceManager.getColor(0, 0, 255));
		text_13.setText("14.0");
		text_13.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		text_13.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_13.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		{
			Composite composite_9 = new Composite(group_1, SWT.NONE);
			composite_9.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
			composite_9.setLayout(new RowLayout(SWT.HORIZONTAL));
			
			Button button = new Button(composite_9, SWT.NONE);
			button.setLayoutData(new RowData(150, SWT.DEFAULT));
			button.setFont(defaultFont);
			button.setText("收费放行(F11)");
		}
		{
			Composite composite_13 = new Composite(group_1, SWT.NONE);
			composite_13.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 2, 1));
			composite_13.setLayout(new RowLayout(SWT.HORIZONTAL));
			{
				Button button_1 = new Button(composite_13, SWT.NONE);
				button_1.setLayoutData(new RowData(150, SWT.DEFAULT));
				button_1.setText("免费放行(F12)");
				button_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
			}
		}
		{
			Composite composite_13 = new Composite(group_1, SWT.NONE);
			composite_13.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
			composite_13.setLayout(new RowLayout(SWT.HORIZONTAL));
			{
				Button btnf_1 = new Button(composite_13, SWT.NONE);
				btnf_1.setLayoutData(new RowData(150, SWT.DEFAULT));
				btnf_1.setText("换班(F7)");
				btnf_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
			}
		}
		{
			Composite composite_13 = new Composite(group_1, SWT.NONE);
			composite_13.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
			composite_13.setLayout(new RowLayout(SWT.HORIZONTAL));
			{
				Button btnf_2 = new Button(composite_13, SWT.NONE);
				btnf_2.setLayoutData(new RowData(150, SWT.DEFAULT));
				btnf_2.setText("归账(F8)");
				btnf_2.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
			}
		}
		{
			Composite composite_13 = new Composite(group_1, SWT.NONE);
			composite_13.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
			composite_13.setLayout(new RowLayout(SWT.HORIZONTAL));
			{
				Button btnf = new Button(composite_13, SWT.NONE);
				btnf.setLayoutData(new RowData(150, SWT.DEFAULT));
				btnf.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						SearchHistoryShell searchHistoryShell = new SearchHistoryShell(shell.getDisplay());
						searchHistoryShell.open();
					}
				});
				btnf.setText("浏览记录(F9)");
				btnf.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
			}
		}
	}
	
	public void play(){
		try {
			final EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
			Frame videoFrame = SWT_AWT.new_Frame(composite_10);
			Canvas videoSurface = new Canvas();
			videoSurface.setBackground(java.awt.Color.WHITE);
			videoFrame.add(videoSurface);
			composite_10.setVisible(true);
			mediaPlayerComponent.getMediaPlayer().setFullScreen(true);
			mediaPlayerComponent.getMediaPlayer().setVideoSurface(new CanvasVideoSurface(videoSurface,new WindowsVideoSurfaceAdapter()));
			mediaPlayerComponent.getMediaPlayer().playMedia("rtsp://218.204.223.237:554/live/1/66251FC11353191F/e7ooqwcfbqjoo80j.sdp");
			
			composite_10.addDisposeListener(new DisposeListener() {
				
				@Override
				public void widgetDisposed(DisposeEvent arg0) {
					mediaPlayerComponent.getMediaPlayer().release();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			final EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
			Frame videoFrame = SWT_AWT.new_Frame(composite_8);
			Canvas videoSurface = new Canvas();
			videoSurface.setBackground(java.awt.Color.WHITE);
			videoFrame.add(videoSurface);
			composite_8.setVisible(true);
			mediaPlayerComponent.getMediaPlayer().setAspectRatio("4:3");
			mediaPlayerComponent.getMediaPlayer().setVideoSurface(new CanvasVideoSurface(videoSurface,new WindowsVideoSurfaceAdapter()));
			mediaPlayerComponent.getMediaPlayer().playMedia("rtsp://192.168.1.232:554/h264ESVideoTest");
			composite_8.addDisposeListener(new DisposeListener() {
				
				@Override
				public void widgetDisposed(DisposeEvent arg0) {
					mediaPlayerComponent.getMediaPlayer().release();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			final EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
			Frame videoFrame = SWT_AWT.new_Frame(composite_11);
			Canvas videoSurface = new Canvas();
			videoSurface.setBackground(java.awt.Color.WHITE);
			videoFrame.add(videoSurface);
			composite_11.setVisible(true);
			mediaPlayerComponent.getMediaPlayer().setVideoSurface(new CanvasVideoSurface(videoSurface,new WindowsVideoSurfaceAdapter()));
			mediaPlayerComponent.getMediaPlayer().setAspectRatio("4:3");
			mediaPlayerComponent.getMediaPlayer().playMedia("rtsp://192.168.1.232:554/h264ESVideoTest");
			composite_11.addDisposeListener(new DisposeListener() {
				
				@Override
				public void widgetDisposed(DisposeEvent arg0) {
					mediaPlayerComponent.getMediaPlayer().release();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			final EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
			Frame videoFrame = SWT_AWT.new_Frame(composite_12);
			Canvas videoSurface = new Canvas();
			videoSurface.setBackground(java.awt.Color.WHITE);
			videoFrame.add(videoSurface);
			composite_12.setVisible(true);
			mediaPlayerComponent.getMediaPlayer().setVideoSurface(new CanvasVideoSurface(videoSurface,new WindowsVideoSurfaceAdapter()));

			mediaPlayerComponent.getMediaPlayer().playMedia("rtsp://218.204.223.237:554/live/1/66251FC11353191F/e7ooqwcfbqjoo80j.sdp");
			composite_12.addDisposeListener(new DisposeListener() {
				
				@Override
				public void widgetDisposed(DisposeEvent arg0) {
					mediaPlayerComponent.getMediaPlayer().release();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
