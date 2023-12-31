import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();

    HashMap<String,String> logininfo = new HashMap<String,String>();
    LoginPage(HashMap<String, String> loginInfoOriginal) {
        logininfo = loginInfoOriginal;
        // Setting for Bounds

        userIDLabel.setBounds(50,100,75,25);
        passwordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        userIDField.setBounds(125,100,200,25);
        passwordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);

        // Add actionl listener
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        // Adding frames
        frame.add(userIDLabel);
        frame.add(passwordLabel);
       // frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton) {
            userIDField.setText("");
            passwordField.setText("");
        }

        if(e.getSource()==loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if(logininfo.containsKey(userID)) {
                if(logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Success");
                   /* frame.dispose();
                     WelcomePage welcomePage = new WelcomePage(); */
                }
            }

            else {
                frame.add(messageLabel);
                messageLabel.setForeground(Color.red);
                messageLabel.setText("STI BULOK KAHIT KELAN");
                userIDField.setText("");
                passwordField.setText("");
            }
        }
        else {
            frame.add(messageLabel);
            messageLabel.setForeground(Color.RED);
            messageLabel.setText("User not found");
        }

    }
}
