import java.awt.Color;

import javax.swing.*;

public class JavaCalculator {
	public JavaCalculator() {
		JFrame JF = new JFrame("JavaCalcualator by Sidharth");
		JF.setLayout(null);
		JF.setSize(600,600);
		JF.setLocation(750,10);
		JF.setVisible(true);	
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String args[]) {
		
		new JavaCalculator();
		
	}
}
