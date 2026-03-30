package travel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;

public class Login extends JFrame implements ActionListener{

	JTextField textField;
	JPasswordField passwordField;
        JButton login,signup,password;


	public Login() {
            
	setSize(900, 437);
        setLocation(350, 200);	
        setBounds(550, 250, 700, 400);
        setLayout(null);
		
        JPanel p1 = new JPanel();
	p1.setBackground(Color.WHITE);
	setContentPane(p1);
	p1.setLayout(null);

	JLabel tfusername = new JLabel("Username : ");
	tfusername.setBounds(124, 89, 95, 24);
	p1.add(tfusername);

	JLabel tfpassword = new JLabel("Password : ");
	tfpassword.setBounds(124, 124, 95, 24);
	p1.add(tfpassword);

	textField = new JTextField();
	textField.setBounds(210, 93, 157, 20);
        textField.setBorder(BorderFactory.createEmptyBorder());
	p1.add(textField);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(210, 128, 157, 20);
        passwordField.setBorder(BorderFactory.createEmptyBorder());
	p1.add(passwordField);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480, 70, 200, 200);
        p1.add(image);
    
        
	login = new JButton("Login");
	login.addActionListener(this);         
	login.setForeground(Color.WHITE);
	login.setBackground(Color.GRAY);
	login.setBounds(149, 181, 113, 25);
	p1.add(login);
		
        signup = new JButton("SignUp");
	signup.addActionListener(this);
	signup.setForeground(new Color(139, 69, 19));
	signup.setBackground(new Color(255, 235, 205));
	signup.setBounds(289, 181, 113, 25);
	p1.add(signup);

	password = new JButton("Forget Password");
	password.addActionListener(this);
        password.setForeground(new Color(205, 92, 92));
	password.setBackground(new Color(253, 245, 230));
	password.setBounds(199, 231, 179, 25);
	p1.add(password);

	JLabel text = new JLabel("Trouble in Login?");
	text.setFont(new Font("Tahoma", Font.PLAIN, 15));
	text.setForeground(Color.RED);
	text.setBounds(70, 234, 100, 20);
	p1.add(text);

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(255, 255, 204));
        p2.setBounds(24, 40, 434, 263);
        p1.add(p2);
        
        setVisible(true);
	}
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == login){
                Boolean status = false;
		try {
                    Conn con = new Conn();
                    String sql = "select * from account where username=? and password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, textField.getText());
                    st.setString(2, passwordField.getText());

                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        this.setVisible(false);
                        new Loading(textField.getText()).setVisible(true);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
            }
            if(ae.getSource() == signup){
                setVisible(false);
		new Signup();
            }   
            if(ae.getSource() == password){
                setVisible(false);
		new ForgetPassword();
            }
        }
        
  	public static void main(String[] args) {
                new Login();
	}

}