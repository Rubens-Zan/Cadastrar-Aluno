import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InterfaceInserirAluno extends JFrame {

    private JButton B1, B2;
    private JLabel L1, L2, L3;
    private JTextField T1, T2, T3;

    public InterfaceInserirAluno(){
        L1 = new JLabel("Nome");
        L2 = new JLabel("Email");
        L3 = new JLabel("GRR");

        T1 = new JTextField("");
        T2 = new JTextField("");
        T3 = new JTextField("");

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(T1);
        this.getContentPane().add(T2);
        this.getContentPane().add(T3);

        this.setLocation(200,200);
        this.setSize(200,150);
    }

    public static void main(String args[]) {
        JFrame janela = new InterfaceInserirAluno();
        janela.show();
        WindowListener x = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        janela.addWindowListener(x);
    }

}