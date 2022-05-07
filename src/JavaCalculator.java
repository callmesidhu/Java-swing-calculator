import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;




public class JavaCalculator implements ActionListener {
		
	JFrame Frame;	
	JLabel DisplayLabel;	
	JButton ButtonAddition, ButtonSubtraction, ButtonMultiplication, ButtonDivision, ButtonEquals, ButtonPoint, ButtonClear;
	JButton ButtonZero, ButtonOne, ButtonTwo, ButtonThree, ButtonFour, ButtonFive, ButtonSix, ButtonSeven, ButtonEight, ButtonNine;
	boolean IsOperatorClicked=false;
	String OldValue;
	int OperationNumber=0;
	float Result=00;
	
	
	public JavaCalculator() {
		Frame=new JFrame("JavaCalcualator by Sidharth");
		Frame.setLayout(null);
		Frame.setSize(610,680);
		Frame.setLocation(750,10);
		Frame.setVisible(true);	
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.getContentPane().setBackground(Color.black);
		
		
		DisplayLabel=new JLabel();
		DisplayLabel.setBounds(31, 12, 520, 60);
		DisplayLabel.setBackground(Color.black);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.white);
		DisplayLabel.setFont(new Font("Serif", Font.PLAIN, 70));
		Frame.add(DisplayLabel);
		
		
		ButtonSeven=new JButton("7");
		ButtonSeven.setBounds(31,82, 112, 112);
		ButtonSeven.addActionListener(this);
		ButtonSeven.setFont(new Font("Serif", Font.BOLD, 50));
		ButtonSeven.setBackground(Color.black);
		ButtonSeven.setForeground(Color.orange);
		Frame.add(ButtonSeven);
		
		ButtonEight=new JButton("8");
		ButtonEight.setBounds(173,82, 112, 112);
		ButtonEight.addActionListener(this);
		ButtonEight.setFont(new Font("Serif", Font.BOLD, 50));
		ButtonEight.setBackground(Color.black);
		ButtonEight.setForeground(Color.orange);
		Frame.add(ButtonEight);
		
		ButtonNine=new JButton("9");
		ButtonNine.setBounds(315,82, 112, 112);
		ButtonNine.addActionListener(this);
		ButtonNine.setFont(new Font("Serif", Font.BOLD, 50));
		ButtonNine.setBackground(Color.black);
		ButtonNine.setForeground(Color.orange);
		Frame.add(ButtonNine);
		
		ButtonAddition=new JButton("+");
		ButtonAddition.setBounds(457,203, 112, 90);
		ButtonAddition.addActionListener(this);
		ButtonAddition.setFont(new Font("Serif", Font.BOLD, 60));
		ButtonAddition.setBackground(Color.black);
		ButtonAddition.setForeground(Color.green);
		Frame.add(ButtonAddition);
		
		ButtonClear=new JButton("DEL");
		ButtonClear.setBounds(457,84, 112, 90);
		ButtonClear.addActionListener(this);
		ButtonClear.setFont(new Font("Serif", Font.BOLD,35));
		ButtonClear.setBackground(Color.black);
		ButtonClear.setForeground(Color.green);
		Frame.add(ButtonClear);
		
		ButtonFour=new JButton("4");
		ButtonFour.setBounds(31,224, 112, 112);
		ButtonFour.addActionListener(this);
		ButtonFour.setFont(new Font("Serif", Font.BOLD, 50));
		ButtonFour.setBackground(Color.black);
		ButtonFour.setForeground(Color.orange);
		Frame.add(ButtonFour);
		
		ButtonFive=new JButton("5");
		ButtonFive.setBounds(173,224, 112, 112);
		ButtonFive.addActionListener(this);
		ButtonFive.setFont(new Font("Serif", Font.BOLD, 50));
		ButtonFive.setBackground(Color.black);
		ButtonFive.setForeground(Color.orange);
		Frame.add(ButtonFive);
		
		ButtonSix=new JButton("6");
		ButtonSix.setBounds(315,224, 112, 112);
		ButtonSix.addActionListener(this);
		ButtonSix.setFont(new Font("Serif", Font.BOLD, 50));
		ButtonSix.setBackground(Color.black);
		ButtonSix.setForeground(Color.orange);
		Frame.add(ButtonSix);
		
		ButtonSubtraction=new JButton("-");
		ButtonSubtraction.setBounds(457,320, 112, 90);
		ButtonSubtraction.addActionListener(this);
		ButtonSubtraction.setFont(new Font("Serif", Font.BOLD, 60));
		ButtonSubtraction.setBackground(Color.black);
		ButtonSubtraction.setForeground(Color.green);
		Frame.add(ButtonSubtraction);
		
		ButtonOne=new JButton("1");
		ButtonOne.setBounds(31,366, 112, 112);
		ButtonOne.addActionListener(this);
		ButtonOne.setFont(new Font("Serif", Font.BOLD, 50));
		ButtonOne.setBackground(Color.black);
		ButtonOne.setForeground(Color.orange);
		Frame.add(ButtonOne);
		
		ButtonTwo=new JButton("2");
		ButtonTwo.setBounds(173,366, 112, 112);
		ButtonTwo.addActionListener(this);
		ButtonTwo.setFont(new Font("Serif", Font.BOLD, 50));
		ButtonTwo.setBackground(Color.black);
		ButtonTwo.setForeground(Color.orange);
		Frame.add(ButtonTwo);
		
		ButtonThree=new JButton("3");
		ButtonThree.setBounds(315,366, 112, 112);
		ButtonThree.addActionListener(this);
		ButtonThree.setFont(new Font("Serif", Font.BOLD, 50));
		ButtonThree.setBackground(Color.black);
		ButtonThree.setForeground(Color.orange);
		Frame.add(ButtonThree);
		
		ButtonEquals=new JButton("=");
		ButtonEquals.setBounds(457,550, 112, 70);
		ButtonEquals.addActionListener(this);
		ButtonEquals.setFont(new Font("Serif", Font.BOLD, 60));
		ButtonEquals.setBackground(Color.black);
		ButtonEquals.setForeground(Color.green);
		Frame.add(ButtonEquals);
		
		ButtonZero=new JButton("0");
		ButtonZero.setBounds(31,508, 112, 112);
		ButtonZero.addActionListener(this);
		ButtonZero.setFont(new Font("Serif", Font.BOLD, 50));
		ButtonZero.setBackground(Color.black);
		ButtonZero.setForeground(Color.orange);
		Frame.add(ButtonZero);
		
		ButtonMultiplication=new JButton("X");
		ButtonMultiplication.setBounds(173,508, 112, 112);
		ButtonMultiplication.addActionListener(this);
		ButtonMultiplication.setFont(new Font("Arial", Font.BOLD, 50));
		ButtonMultiplication.setBackground(Color.black);
		ButtonMultiplication.setForeground(Color.green);
		Frame.add(ButtonMultiplication);
		
		ButtonDivision=new JButton("÷");
		ButtonDivision.setBounds(315,508, 112, 112);
		ButtonDivision.addActionListener(this);
		ButtonDivision.setFont(new Font("Serif", Font.BOLD, 70));
		ButtonDivision.setBackground(Color.black);
		ButtonDivision.setForeground(Color.green);
		Frame.add(ButtonDivision);
		
		
		ButtonPoint=new JButton(" .\n ");
		ButtonPoint.setBounds(457,435, 112, 90);
		ButtonPoint.addActionListener(this);
		ButtonPoint.setFont(new Font("Serif", Font.BOLD, 70));
		ButtonPoint.setBackground(Color.black);
		ButtonPoint.setForeground(Color.green);
		Frame.add(ButtonPoint);
		
		
		
	}
	
	public static void main(String args[]) {
		
		new JavaCalculator();
	}

	public void actionPerformed(ActionEvent ScreenAction) {
		
	if(ScreenAction.getSource()==ButtonSeven) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("7");
			IsOperatorClicked=false;
		}
		else {
			DisplayLabel.setText(DisplayLabel.getText()+"7");
		}
	}
	else if(ScreenAction.getSource()==ButtonEight) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("8");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"8");
		}
	}
	else if(ScreenAction.getSource()==ButtonNine) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("9");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"9");
		}
	}	
	else if(ScreenAction.getSource()==ButtonFour) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("4");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"4");
		}
	}
	else if(ScreenAction.getSource()==ButtonFive) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("5");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"5");
		}
	}
	else if(ScreenAction.getSource()==ButtonSix) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("6");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"6");
		}
	}
	else if(ScreenAction.getSource()==ButtonOne) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("1");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"1");
		}
	}
	else if(ScreenAction.getSource()==ButtonTwo) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("2");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"2");
		}
	}
	else if(ScreenAction.getSource()==ButtonThree) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("3");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"3");
		}
	}
	else if(ScreenAction.getSource()==ButtonZero) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("0");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"0");
		}
	}
	else if(ScreenAction.getSource()==ButtonPoint) {
		DisplayLabel.setText(DisplayLabel.getText()+".");
	}
	else if(ScreenAction.getSource()==ButtonAddition) {
		IsOperatorClicked=true;
		OldValue=DisplayLabel.getText();
		OperationNumber=1;
	}
	else if(ScreenAction.getSource()==ButtonSubtraction) {
		IsOperatorClicked=true;
		OldValue=DisplayLabel.getText();
		OperationNumber=2;
		
	}
	else if(ScreenAction.getSource()==ButtonMultiplication) {
		IsOperatorClicked=true;
		OldValue=DisplayLabel.getText();
		OperationNumber=3;
	}
	else if(ScreenAction.getSource()==ButtonDivision) {
		IsOperatorClicked=true;
		OldValue=DisplayLabel.getText();
		OperationNumber=4;
	}
	else if(ScreenAction.getSource()==ButtonEquals) {
		String NewValue=DisplayLabel.getText();
		float OldValueFloat=Float.parseFloat(OldValue);
		float NewValueFloat=Float.parseFloat(NewValue);
		 if(OperationNumber==1) {
			 Result=OldValueFloat+NewValueFloat;
			 DisplayLabel.setText(Result+"");
		 }
		 else if(OperationNumber==2) {
			 Result=OldValueFloat-NewValueFloat;
			 DisplayLabel.setText(Result+"");
		 }
		 else if(OperationNumber==3) {
			 Result=OldValueFloat*NewValueFloat;
			 DisplayLabel.setText(Result+"");
		 }
		 else if(OperationNumber==4) {
			 Result=OldValueFloat/NewValueFloat;
			 DisplayLabel.setText(Result+"");
		 }
	}
	else {
		DisplayLabel.setText("");
	}
	
	}

}
