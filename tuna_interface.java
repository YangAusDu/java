import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class tuna_interface extends JFrame{
    private JLabel item1;

    public tuna_interface(){
        super("The title bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("this is a sentence");
        item1.setToolTipText("This is gonna show up on hover");

        add(item1);
    }
}

class apple_interface{
    public static void main(String[] args){
        tuna_interface bucky = new tuna_interface();
        bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bucky.setSize(275,180);
        bucky.setVisible(true);

    }
}