package Package;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    private JPanel panel;
    private JTextField clientNameLabel;
    private JLabel label;
    private JLabel tittleLabel;
    private JButton buttonSaveClientName;
    private JPanel SecondaryPanel;
    private JButton pinkDonutWithSprinklesButton;
    private JButton ticketButton;
    private JButton duffBeerButton;
    private JButton addANewProductButton;
    private JLabel labelWelcomeText;
    private JPanel ThirdPanel;
    private JTextArea textAreaProductPrice;
    private JLabel labelTittleTotal;
    private JLabel totalLabel;
    private JTextArea textAreaProductName;
    private JLabel labelTittlePrice;
    private JLabel LabelNameTittle;
    public String ClientName;
    private double pinkDonutPrice = 3.50;
    private double duffBeerPrice = 10.00;
    private double clientTotal;

    //Constructor method
    public Window(){
        this.setTitle("Store Management System");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);

        ClientName = clientNameLabel.getText();



        //Button Pink Donut action
        pinkDonutWithSprinklesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaProductName.append("Pink donut with sprinkles \n");
                textAreaProductPrice.append("$"+ Double.toString(pinkDonutPrice) + "\n");
                clientTotal = clientTotal + pinkDonutPrice;
                totalLabel.setText("$"+Double.toString(clientTotal));


            }
        });
        //Duff beer button action
        duffBeerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaProductName.append("Duff beer \n");
                textAreaProductPrice.append("$"+ Double.toString(duffBeerPrice) + "\n");
                clientTotal = clientTotal + duffBeerPrice;
                totalLabel.setText("$"+Double.toString(clientTotal));

            }
        });

        //Ad new product button
        addANewProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String productName = JOptionPane.showInputDialog("Type the product name: ");
                textAreaProductName.append(productName + "\n");
                Double productPrice = Double.valueOf(JOptionPane.showInputDialog("Type the product price: "));
                textAreaProductPrice.append("$"+ Double.toString(productPrice)+ "\n");
                clientTotal = clientTotal + productPrice;
                totalLabel.setText("$"+Double.toString(clientTotal));

            }
        });

        //Receipt button action
        ticketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClientName = clientNameLabel.getText();
                JOptionPane.showMessageDialog(null,"Receipt"+
                        "\nClient: "+ ClientName+
                        "\nTotal: $"+ clientTotal);


            }
        });
    }
}
