package com.donglu.card.ui;

import java.awt.Toolkit;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class LoginDialog extends Dialog{

	private Text text;
	private Text text_1;

    /**
     * Create the dialog.
     *
     * @param parentShell
     * @param checker
     */
    public LoginDialog(Shell parentShell) {
        super(parentShell);
    }
	@Override
	protected Control createContents(Composite container) {
		getShell().setSize(390, 290);
		getShell().setImage(SWTResourceManager.getImage(LoginDialog.class, "/image/systemLogin_48.png"));
		setCenter();
        
        container.setLayout(new FillLayout());

        Composite composite = new Composite(container, SWT.NONE);
        composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        GridLayout gl_composite = new GridLayout(1, false);
        gl_composite.verticalSpacing = 15;
        gl_composite.marginWidth = 0;
        gl_composite.marginHeight = 0;
        gl_composite.horizontalSpacing = 0;
        composite.setLayout(gl_composite);
        
        Composite composite_1 = new Composite(composite, SWT.NONE);
        composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
        composite_1.setLayout(new GridLayout(2, false));
        GridData gd_composite_1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        gd_composite_1.heightHint = 80;
        composite_1.setLayoutData(gd_composite_1);
        
        Label lblNewLabel = new Label(composite_1, SWT.NONE);
        lblNewLabel.setImage(SWTResourceManager.getImage(LoginDialog.class, "/image/systemLogin_48.png"));
        lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
        GridData gd_lblNewLabel = new GridData(SWT.CENTER, SWT.CENTER, false, true, 1, 1);
        gd_lblNewLabel.widthHint = 60;
        gd_lblNewLabel.heightHint = 48;
        lblNewLabel.setLayoutData(gd_lblNewLabel);
        
        Label label = new Label(composite_1, SWT.NONE);
        label.setFont(SWTResourceManager.getFont("宋体", 17, SWT.NORMAL));
        label.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
        label.setText("东陆一卡通停车场实时监控");
        
        Composite composite_2 = new Composite(composite, SWT.NONE);
        composite_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        RowLayout rl_composite_2 = new RowLayout(SWT.HORIZONTAL);
        rl_composite_2.spacing = 10;
        composite_2.setLayout(rl_composite_2);
        composite_2.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
        
        Label lblNewLabel_1 = new Label(composite_2, SWT.NONE);
        lblNewLabel_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
        lblNewLabel_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        lblNewLabel_1.setText("用户名");
        
        text = new Text(composite_2, SWT.BORDER);
        text.setLayoutData(new RowData(150, SWT.DEFAULT));
        text.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
        
        Composite composite_3 = new Composite(composite, SWT.NONE);
        composite_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        RowLayout rl_composite_3 = new RowLayout(SWT.HORIZONTAL);
        rl_composite_3.spacing = 10;
        composite_3.setLayout(rl_composite_3);
        composite_3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
        
        Label label_1 = new Label(composite_3, SWT.NONE);
        label_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
        label_1.setText("密　码");
        label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        
        text_1 = new Text(composite_3, SWT.BORDER);
        text_1.setLayoutData(new RowData(150, SWT.DEFAULT));
        text_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
        
        Composite composite_4 = new Composite(composite, SWT.NONE);
        composite_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        RowLayout rl_composite_4 = new RowLayout(SWT.HORIZONTAL);
        rl_composite_4.spacing = 30;
        composite_4.setLayout(rl_composite_4);
        composite_4.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
        
        Button btnNewButton = new Button(composite_4, SWT.NONE);
        btnNewButton.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
        btnNewButton.setText("登录");
        
        Button btnNewButton_1 = new Button(composite_4, SWT.NONE);
        btnNewButton_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.NORMAL));
        btnNewButton_1.setText("取消");
        return container;
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
