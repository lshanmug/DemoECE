package button;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

public class ButtonExample {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));
		shell.setText("Buttons");
		
		Group group = new Group(shell, SWT.NONE);
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		group.setLayout(new GridLayout(1, false));
		group.setText("Button group");
		
		Button button = new Button(group, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText("Push Button");
		
		Button button2 = new Button(group, SWT.CHECK);
		button2.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button2.setText("Check Button");
		
		Button button3 = new Button(group, SWT.RADIO);
		button3.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button3.setText("Radio button1");
		
		Button button33 = new Button(group, SWT.RADIO);
		button33.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button33.setText("Radio button2");
		
		Button button4 = new Button(group, SWT.TOGGLE);
		button4.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button4.setText("Toggle button");
		
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}
