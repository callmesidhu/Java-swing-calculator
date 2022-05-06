import java.awt.Color;
import javax.swing.*;

public class JavaCalculator {
	public JavaCalculator() {
		JFrame Frame = new JFrame("JavaCalcualator by Sidharth");
		Frame.setLayout(null);
		Frame.setSize(610,680);
		Frame.setLocation(750,10);
		Frame.setVisible(true);	
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel DisplayLabel = new JLabel("12345");
		DisplayLabel.setBounds(31, 22, 538, 30);
		DisplayLabel.setBackground(Color.gray);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.white);
		Frame.add(DisplayLabel);
		
		
		JButton ButtonSeven = new JButton("7");
		ButtonSeven.setBounds(31,82, 112, 112);
		Frame.add(ButtonSeven);
		
		JButton ButtonEight = new JButton("8");
		ButtonEight.setBounds(173,82, 112, 112);
		Frame.add(ButtonEight);
		
		JButton ButtonNine = new JButton("9");
		ButtonNine.setBounds(315,82, 112, 112);
		Frame.add(ButtonNine);
		
		JButton ButtonAddition = new JButton("+");
		ButtonAddition.setBounds(457,82, 112, 112);
		Frame.add(ButtonAddition);
		
		JButton ButtonFour = new JButton("4");
		ButtonFour.setBounds(31,224, 112, 112);
		Frame.add(ButtonFour);
		
		JButton ButtonFive = new JButton("5");
		ButtonFive.setBounds(173,224, 112, 112);
		Frame.add(ButtonFive);
		
		JButton ButtonSix = new JButton("6");
		ButtonSix.setBounds(315,224, 112, 112);
		Frame.add(ButtonSix);
		
		JButton ButtonSubtraction = new JButton("-");
		ButtonSubtraction.setBounds(457,224, 112, 112);
		Frame.add(ButtonSubtraction);
		
		JButton ButtonOne = new JButton("1");
		ButtonOne.setBounds(31,366, 112, 112);
		Frame.add(ButtonOne);
		
		JButton ButtonTwo = new JButton("2");
		ButtonTwo.setBounds(173,366, 112, 112);
		Frame.add(ButtonTwo);
		
		JButton ButtonThree = new JButton("3");
		ButtonThree.setBounds(315,366, 112, 112);
		Frame.add(ButtonThree);
		
		JButton ButtonEquals= new JButton("=");
		ButtonEquals.setBounds(457,508, 112, 112);
		Frame.add(ButtonEquals);
		
		JButton ButtonZero = new JButton("0");
		ButtonZero.setBounds(31,508, 112, 112);
		Frame.add(ButtonZero);
		
		JButton ButtonMultiplication = new JButton("X");
		ButtonMultiplication.setBounds(173,508, 112, 112);
		Frame.add(ButtonMultiplication);
		
		JButton ButtonDivision = new JButton("÷");
		ButtonDivision.setBounds(315,508, 112, 112);
		Frame.add(ButtonDivision);
		
		
		JButton ButtonPoint = new JButton(".");
		ButtonPoint.setBounds(457,366, 112, 112);
		Frame.add(ButtonPoint);
		
		
		
	}
	
	public static void main(String args[]) {
		
		new JavaCalculator();
		
	}
}
