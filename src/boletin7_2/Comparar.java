
package boletin7_2;

import javax.swing.JOptionPane;

public class Comparar {
    public short pedirNumero(){
    short num;
    String res = JOptionPane.showInputDialog("teclea numero");
   num = Short.parseShort(res);
   return num;
    }
    public void Comparar(short num1,short num2){
    if(num1>= num2)
    JOptionPane.showMessageDialog(null,num1 - num2 );
    else if(num1<=num2)
    JOptionPane.showMessageDialog(null, num1 + num2);
    }
}
