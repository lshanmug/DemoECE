package text;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TextExample {
public static void main(String[] args) {
	Display display = new Display();
	Shell shell = new Shell(display);
	shell.setLayout(new GridLayout(1, false));

	Group group = new Group(shell, SWT.NONE);
	group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
	group.setLayout(new GridLayout(1, false));
	group.setText("Text group");
	
	Text text = new Text(group, SWT.SINGLE | SWT.LEAD | SWT.BORDER);
	text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	text.setText("Single Text field");
	
	Text text2 = new Text(group, SWT.MULTI | SWT.LEAD | SWT.BORDER);
	text2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	text2.setText("multi text field");
	
	
	shell.pack();
	shell.open();
	while (!shell.isDisposed()) {
		if (!display.readAndDispatch())
			display.sleep();
	}
	display.dispose();
}
}
