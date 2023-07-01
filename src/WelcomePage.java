import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome to Bank of N");
    SpinnerModel value = new SpinnerNumberModel(0, 0, 100, 2);
    JSpinner spinner = new JSpinner(value);
    JButton enterButton = new JButton("Enter");

    WelcomePage() {
        welcomeLabel.setBounds(0, 0, 200, 35);
        spinner.setBounds(125, 125, 50, 20);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        enterButton.setBounds(200, 200, 75, 20);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.add(spinner);
        frame.add(enterButton);
        frame.setLayout(null);
        frame.setVisible(true);

        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int spinnerValue = (int) spinner.getValue();
                if (spinnerValue > 50) {
                    welcomeLabel.setText("Yeah I have no idea haha");
                } else {
                    welcomeLabel.setText("No idea haha");
                }
            }
        });

        enterButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterButton) {
            int spinnerValue = (int) spinner.getValue();
            if (spinnerValue <= 50) {
                System.out.println("Yeah bro");
                welcomeLabel.setText("Yeah I have no idea haha");
            } else {
                welcomeLabel.setText("No idea haha");
            }
        }
    }
}