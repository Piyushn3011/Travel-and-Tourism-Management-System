package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonDetails, viewPersonDetails, updatePersonDetails, checkpackages, bookpackages, viewpackages, viewhotels, destinations, bookhotel;
    JButton viewbookedhotel, payments, calculator, notepad, about, deletePersonDetails;
    Dashboard(String username) {
        this.username = username;
        //setBounds(0, 0, 1600, 1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
       JLabel heading = new JLabel("Dashboard");
       heading.setBounds(80, 10, 300, 40);
       heading.setForeground(Color.WHITE);
       heading.setFont( new Font("Tahoma", Font.BOLD, 30));
       p1.add(heading);
       
       JPanel p2 = new JPanel();
       p2.setLayout(null);
       p2.setBackground(new Color(0, 0, 102));
       p2.setBounds(0, 65, 300, 900);
       add(p2);
       
       addPersonDetails = new JButton("Add Person Details");
       addPersonDetails.addActionListener(this);         
       addPersonDetails.setForeground(Color.WHITE);
       addPersonDetails.setBackground(new Color(0, 0, 102));
       addPersonDetails.setBounds(0, 0, 300, 50);
       addPersonDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
       addPersonDetails.setMargin(new Insets(0, 0, 0, 60));
       p2.add(addPersonDetails);
        
       updatePersonDetails = new JButton("Update Person Details");
       updatePersonDetails.addActionListener(this);         
       updatePersonDetails.setForeground(Color.WHITE);
       updatePersonDetails.setBackground(new Color(0, 0, 102));
       updatePersonDetails.setBounds(0, 40, 300, 50);
       updatePersonDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
       updatePersonDetails.setMargin(new Insets(0, 0, 0, 60));
       p2.add(updatePersonDetails);
       
       viewPersonDetails = new JButton("View Details");
       viewPersonDetails.addActionListener(this);         
       viewPersonDetails.setForeground(Color.WHITE);
       viewPersonDetails.setBackground(new Color(0, 0, 102));
       viewPersonDetails.setBounds(0, 80, 300, 50);
       viewPersonDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
       viewPersonDetails.setMargin(new Insets(0, 0, 0, 60));
       p2.add(viewPersonDetails);
       
       deletePersonDetails = new JButton("Delete Person Details");
       deletePersonDetails.addActionListener(this);         
       deletePersonDetails.setForeground(Color.WHITE);
       deletePersonDetails.setBackground(new Color(0, 0, 102));
       deletePersonDetails.setBounds(0, 120, 300, 50);
       deletePersonDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
       deletePersonDetails.setMargin(new Insets(0, 0, 0, 60));
       p2.add(deletePersonDetails);
       
       checkpackages = new JButton("Check Package");
       checkpackages.addActionListener(this);         
       checkpackages.setForeground(Color.WHITE);
       checkpackages.setBackground(new Color(0, 0, 102));
       checkpackages.setBounds(0, 160, 300, 50);
       checkpackages.setFont(new Font("Tahoma",Font.PLAIN, 20));
       checkpackages.setMargin(new Insets(0, 0, 0, 60));
       p2.add(checkpackages);
       
       bookpackages = new JButton("Book Package");
       bookpackages.addActionListener(this);         
       bookpackages.setForeground(Color.WHITE);
       bookpackages.setBackground(new Color(0, 0, 102));
       bookpackages.setBounds(0, 200, 300, 50);
       bookpackages.setFont(new Font("Tahoma",Font.PLAIN, 20));
       bookpackages.setMargin(new Insets(0, 0, 0, 60));
       p2.add(bookpackages);
       
       viewpackages = new JButton("View Package");
       viewpackages.addActionListener(this);         
       viewpackages.setForeground(Color.WHITE);
       viewpackages.setBackground(new Color(0, 0, 102));
       viewpackages.setBounds(0, 240, 300, 50);
       viewpackages.setFont(new Font("Tahoma",Font.PLAIN, 20));
       viewpackages.setMargin(new Insets(0, 0, 0, 60));
       p2.add(viewpackages);
       
       viewhotels = new JButton("View Hotels");
       viewhotels.addActionListener(this);         
       viewhotels.setForeground(Color.WHITE);
       viewhotels.setBackground(new Color(0, 0, 102));
       viewhotels.setBounds(0, 280, 300, 50);
       viewhotels.setFont(new Font("Tahoma",Font.PLAIN, 20));
       viewhotels.setMargin(new Insets(0, 0, 0, 60));
       p2.add(viewhotels);
       
       bookhotel = new JButton("Book Hotels");
       bookhotel.addActionListener(this);         
       bookhotel.setForeground(Color.WHITE);
       bookhotel.setBackground(new Color(0, 0, 102));
       bookhotel.setBounds(0, 320, 300, 50);
       bookhotel.setFont(new Font("Tahoma",Font.PLAIN, 20));
       bookhotel.setMargin(new Insets(0, 0, 0, 60));
       p2.add(bookhotel);
       
       viewbookedhotel = new JButton("View Booked Hotels");
       viewbookedhotel.addActionListener(this);         
       viewbookedhotel.setForeground(Color.WHITE);
       viewbookedhotel.setBackground(new Color(0, 0, 102));
       viewbookedhotel.setBounds(0, 360, 300, 50);
       viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN, 20));
       viewbookedhotel.setMargin(new Insets(0, 0, 0, 60));
       p2.add(viewbookedhotel);
       
       destinations = new JButton("Destinations");
       destinations.addActionListener(this);         
       destinations.setForeground(Color.WHITE);
       destinations.setBackground(new Color(0, 0, 102));
       destinations.setBounds(0, 400, 300, 50);
       destinations.setFont(new Font("Tahoma",Font.PLAIN, 20));
       destinations.setMargin(new Insets(0, 0, 0, 60));
       p2.add(destinations);
       
       payments = new JButton("Payments");
       payments.addActionListener(this);         
       payments.setForeground(Color.WHITE);
       payments.setBackground(new Color(0, 0, 102));
       payments.setBounds(0, 440, 300, 50);
       payments.setFont(new Font("Tahoma",Font.PLAIN, 20));
       payments.setMargin(new Insets(0, 0, 0, 60));
       p2.add(payments);
       
       calculator = new JButton("Calculator");
       calculator.addActionListener(this);         
       calculator.setForeground(Color.WHITE);
       calculator.setBackground(new Color(0, 0, 102));
       calculator.setBounds(0, 480, 300, 50);
       calculator.setFont(new Font("Tahoma",Font.PLAIN, 20));
       calculator.setMargin(new Insets(0, 0, 0, 60));
       p2.add(calculator);
       
       notepad = new JButton("Notepad");
       notepad.addActionListener(this);         
       notepad.setForeground(Color.WHITE);
       notepad.setBackground(new Color(0, 0, 102));
       notepad.setBounds(0, 520, 300, 50);
       notepad.setFont(new Font("Tahoma",Font.PLAIN, 20));
       notepad.setMargin(new Insets(0, 0, 0, 60));
       p2.add(notepad);
       
       about = new JButton("About");
       about.addActionListener(this);         
       about.setForeground(Color.WHITE);
       about.setBackground(new Color(0, 0, 102));
       about.setBounds(0, 560, 300, 50);
       about.setFont(new Font("Tahoma",Font.PLAIN, 20));
       about.setMargin(new Insets(0, 0, 0, 60));
       p2.add(about);
       
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i5 = i4.getImage().getScaledInstance(1600, 1000, Image.SCALE_DEFAULT);
       ImageIcon i6 = new ImageIcon(i5);
       JLabel image = new JLabel(i6);
       image.setBounds(0, 0, 1600, 1000);
       add(image);
       
       JLabel text = new JLabel("Travel and Tourism Management System");
       text.setBounds(400, 70, 1200, 70);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("Raleway", Font.PLAIN, 55));
       image.add(text);
       
       setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPersonDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonDetails) {
            new UpdateCustomer(username);
        } else if (ae.getSource() == checkpackages) {
            new CheckPackage();
        } else if (ae.getSource() == bookpackages) {
            new BookPackage(username);
        } else if (ae.getSource() == viewpackages) {
            new ViewPackage(username);
        } else if (ae.getSource() == viewhotels) {
            new CheckHotels();
        } else if (ae.getSource() == destinations) {
            new Destinations();
        } else if (ae.getSource() == bookhotel) {
            new BookHotel(username);
        } else if (ae.getSource() == viewbookedhotel) {
            new ViewBookedHotel(username);
        } else if (ae.getSource() == payments) {
            new Payment();
        } else if (ae.getSource() == calculator) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == notepad) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == about) {
            new About();
        } else if (ae.getSource() == deletePersonDetails) {
            new DeleteDetails(username);
        }
        
    }
    public static void main(String[] args) {
        new Dashboard("");
    } 
    
}
