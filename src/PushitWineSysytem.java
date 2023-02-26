import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PushitWineSysytem {
    private JTextArea textAreaDisplay;
    private JTextField textOrderDate;
    private JTextField textLocalWineSubTotal;
    private JTextField textCustomerName;
    private JTextField textLocalWIne;
    private JTextField textRedWineSubTotal;
    private JTextField textWhiteWIneSubTotal;
    private JTextField textOrderTime;
    private JTextField textLocalWineUnitPrice;
    private JTextField textRedWineUnitPrice;
    private JTextField textWhiteUnitPrice;
    private JTextField textRedWine;
    private JTextField textWhiteWine;
    private JTextField textTelePhoneNumber;
    private JTextField textOrderRefNumber;
    private JTextField textField15;
    private JTextField textTaxPaid;
    private JTextField textNetPrice;
    private JButton totalButton;
    private JButton displayButton;
    private JButton clearButton;
    private JButton exitButton;
    private JLabel OrderTotal;
    private JPanel main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PushitWineSysytem");
        frame.setContentPane(new PushitWineSysytem().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public PushitWineSysytem() {
    totalButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
