import javax.swing.*;

class calculator {

//Initalize or declare 

 JFrame frame;

JTextField txt;

JButton btn0 , btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear, btnMinus,btnPlus, btnDivide, btnMult, btnPoint, btnEqual;


calculator(){
// contructor 

frame = new JFrame("Calculator");

frame.setBounds(1,1,280,450);

frame.setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

txt =new JTextField();


btn0= new JButton("0");
btn1= new JButton("1");
btn2= new JButton("2");
btn3= new JButton("3");
btn4= new JButton("4");
btn5= new JButton("5");
btn6= new JButton("6");
btn7= new JButton("7");
btn8= new JButton("8");
btn9= new JButton("9");
btnPlus= new JButton("+");
btnMinus= new JButton("-");
btnDivide= new JButton("/");
btnMult= new JButton("*");
btnPoint= new JButton(".");
btnClear= new JButton("C");
btnEqual= new JButton("=");



//row1 	 txt
txt.setBounds(10,30,240,50);


//row2 	 clear
btnClear.setBounds(10,100,50,50);


//row3  	7 8 9 /
btn7.setBounds(10,160,50,50);
btn8.setBounds(70,160,50,50);
btn9.setBounds(130,160,50,50);
btnDivide.setBounds(200,160,50,50);

//row4  	 4 5 6 *
btn4.setBounds(10,220,50,50);
btn5.setBounds(70,220,50,50);
btn6.setBounds(130,220,50,50);
btnMult.setBounds(200,220,50,50);

//row5  	1 2 3 .
btn1.setBounds(10,280,50,50);
btn2.setBounds(70,280,50,50);
btn3.setBounds(130,280,50,50);
btnPoint.setBounds(200,280,50,50);

//row6   	0 - + =
btn0.setBounds(10,340,50,50);
btnMinus.setBounds(70,340,50,50);
btnPlus.setBounds(130,340,50,50);
btnEqual.setBounds(200,340,50,50);






frame.add(btnClear);
frame.add(btnEqual);
frame.add(btnPlus);
frame.add(btnMinus);
frame.add(btn0);
frame.add(btnPoint);
frame.add(btn3);
frame.add(btn2);
frame.add(btn1);
frame.add(btn6);
frame.add(btn5);
frame.add(btn4);
frame.add(btn7);
frame.add(btn8);
frame.add(btn9);
frame.add(txt);
frame.add(btnDivide);

frame.add(btnMult);


}


public static void main(String[] args) {

calculator obj=new calculator();


}
}