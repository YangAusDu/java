import javax.swing.JOptionPane;
import javax.swing.JFrame;

class gui_apple{
    public static void main(String[] arg){

        String fn = JOptionPane.showInputDialog("Enter the first number");
        String sn = JOptionPane.showInputDialog("Enter the second number");


        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "the answer is "+sum,"the title",JOptionPane.PLAIN_MESSAGE);




    } 
}