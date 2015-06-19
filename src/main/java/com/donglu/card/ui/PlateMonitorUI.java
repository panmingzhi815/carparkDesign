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

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class PlateMonitorUI {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
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
		label_2.setFont(defaultFont);
		label_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_2.setText("入场车牌");
		
		text = new Text(composite_6, SWT.BORDER);
		text.setFont(defaultFont);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
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
		label_3.setFont(defaultFont);
		label_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_3.setText("入场时间");
		
		text_1 = new Text(composite_6, SWT.BORDER);
		text_1.setFont(defaultFont);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_7 = new Composite(composite, SWT.NONE);
		composite_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		composite_7.setLayout(new GridLayout(3, false));
		
		Label label_4 = new Label(composite_7, SWT.NONE);
		label_4.setFont(defaultFont);
		label_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_4.setText("入场车牌");
		
		text_2 = new Text(composite_7, SWT.BORDER);
		text_2.setFont(defaultFont);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
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
		label_6.setFont(defaultFont);
		label_6.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_6.setText("入场时间");
		
		text_3 = new Text(composite_7, SWT.BORDER);
		text_3.setFont(defaultFont);
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
		GridLayout gl_group = new GridLayout(3, false);
		gl_group.verticalSpacing = 10;
		group.setLayout(gl_group);
		group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_1 = new Label(group, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("总车位数");
		
		text_4 = new Text(group, SWT.BORDER);
		text_4.setFont(defaultFont);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnNewButton = new Button(group, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				LoginDialog ld = new LoginDialog(new Shell());
				ld.open();
			}
		});
		btnNewButton.setToolTipText("未登陆,单击登陆");
		btnNewButton.setImage(SWTResourceManager.getImage(PlateMonitorUI.class, "/image/userLogout_72.png"));
		GridData gd_btnNewButton = new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 4);
		gd_btnNewButton.widthHint = 80;
		btnNewButton.setLayoutData(gd_btnNewButton);
		
		Label lblNewLabel_2 = new Label(group, SWT.NONE);
		lblNewLabel_2.setFont(defaultFont);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_2.setText("剩余车位");
		
		text_5 = new Text(group, SWT.BORDER);
		text_5.setFont(defaultFont);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_3 = new Label(group, SWT.NONE);
		lblNewLabel_3.setFont(defaultFont);
		lblNewLabel_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_3.setText("当前值班");
		
		text_6 = new Text(group, SWT.BORDER);
		text_6.setFont(defaultFont);
		text_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_7 = new Label(group, SWT.NONE);
		label_7.setFont(defaultFont);
		label_7.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_7.setText("累计收费");
		
		text_7 = new Text(group, SWT.BORDER);
		text_7.setFont(defaultFont);
		text_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Group group_1 = new Group(composite_1, SWT.NONE);
		group_1.setFont(SWTResourceManager.getFont("微软雅黑", 5, SWT.NORMAL));
		GridLayout gl_group_1 = new GridLayout(2, false);
		gl_group_1.verticalSpacing = 10;
		group_1.setLayout(gl_group_1);
		group_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Label label_8 = new Label(group_1, SWT.NONE);
		label_8.setFont(defaultFont);
		label_8.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_8.setText("车牌号码");
		
		text_8 = new Text(group_1, SWT.BORDER);
		text_8.setFont(defaultFont);
		text_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_9 = new Label(group_1, SWT.NONE);
		label_9.setFont(defaultFont);
		label_9.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_9.setText("用户名称");
		
		text_9 = new Text(group_1, SWT.BORDER);
		text_9.setFont(defaultFont);
		text_9.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_14 = new Label(group_1, SWT.NONE);
		label_14.setFont(defaultFont);
		label_14.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_14.setText("用户类型");
		
		text_14 = new Text(group_1, SWT.BORDER);
		text_14.setFont(defaultFont);
		text_14.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_10 = new Label(group_1, SWT.NONE);
		label_10.setFont(defaultFont);
		label_10.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_10.setText("入场时间");
		
		text_10 = new Text(group_1, SWT.BORDER);
		text_10.setFont(defaultFont);
		text_10.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_11 = new Label(group_1, SWT.NONE);
		label_11.setFont(defaultFont);
		label_11.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_11.setText("出场时间");
		
		text_11 = new Text(group_1, SWT.BORDER);
		text_11.setFont(defaultFont);
		text_11.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_12 = new Label(group_1, SWT.NONE);
		label_12.setFont(defaultFont);
		label_12.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_12.setText("停车时间");
		
		text_12 = new Text(group_1, SWT.BORDER);
		text_12.setFont(defaultFont);
		text_12.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_13 = new Label(group_1, SWT.NONE);
		label_13.setFont(defaultFont);
		label_13.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_13.setText("收费金额");
		
		text_13 = new Text(group_1, SWT.BORDER);
		text_13.setFont(defaultFont);
		text_13.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_9 = new Composite(group_1, SWT.NONE);
		composite_9.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		composite_9.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Button button = new Button(composite_9, SWT.NONE);
		button.setImage(SWTResourceManager.getImage(PlateMonitorUI.class, "/image/moneyPass_32.png"));
		button.setFont(defaultFont);
		button.setText("收费放行(F11)");
		{
			Composite composite_13 = new Composite(group_1, SWT.NONE);
			composite_13.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 2, 1));
			composite_13.setLayout(new RowLayout(SWT.HORIZONTAL));
			{
				Button button_1 = new Button(composite_13, SWT.NONE);
				button_1.setText("免费放行(F12)");
				button_1.setImage(SWTResourceManager.getImage(PlateMonitorUI.class, "/image/freePass_32.png"));
				button_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
			}
		}
		new Label(group_1, SWT.NONE);
		new Label(group_1, SWT.NONE);
		{
			Composite composite_13 = new Composite(group_1, SWT.NONE);
			composite_13.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
			composite_13.setLayout(new RowLayout(SWT.HORIZONTAL));
			{
				Button btnf = new Button(composite_13, SWT.NONE);
				btnf.setImage(SWTResourceManager.getImage(PlateMonitorUI.class, "/image/search_32.png"));
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
			mediaPlayerComponent.getMediaPlayer().setVideoSurface(new CanvasVideoSurface(videoSurface,new WindowsVideoSurfaceAdapter()));

			mediaPlayerComponent.getMediaPlayer().playMedia("rtsp://192.168.1.231:554/h264ESVideoTest");
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
