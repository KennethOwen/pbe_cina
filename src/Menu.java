import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

    public Menu() {

        JPanel p1 = new JPanel(new BorderLayout());
        JPanel p2 = new JPanel(new BorderLayout());
        JPanel p3 = new JPanel(new BorderLayout());
        JPanel p4 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel p5 = new JPanel(new BorderLayout());
        JPanel p6 = new JPanel(new BorderLayout());
        JPanel p7 = new JPanel(new BorderLayout());
        JPanel p8 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel p9 = new JPanel(new BorderLayout());
        JPanel p10 = new JPanel(new BorderLayout());
        JPanel p11 = new JPanel(new BorderLayout());
        JPanel p12 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel p13 = new JPanel();

        JComboBox<String> cb1 = new JComboBox<>(new String[]{"Coconut Shrimp w - RM16", "Mini BBQ Pulled Pork Sliders - RM22.00", "Chicken & Roasted Red Pepper Tartlets - RM18.00"});
        JComboBox<String> cb2 = new JComboBox<>(new String[]{"Baked Fish With Sambal - RM45", "Salted Egg Crystal Prawn - RM37"});
        JComboBox<String> cb3 = new JComboBox<>(new String[]{"Soy Garlic Booneless Chicken Bites - RM22", "Shinhwa Wingette - RM18"});
        JComboBox<String> cb4 = new JComboBox<>(new String[]{"Classic Summer Salads - RM7", "Caesar Salad - RM9"});
        JComboBox<String> cb5 = new JComboBox<>(new String[]{"Cuban Sandwich - RM12", "Turkey Sandwich - RM10", "Grilled Chicken Sandwich - RM14"});
        JComboBox<String> cb6 = new JComboBox<>(new String[]{"Supernova Spaghetti - RM16", "Cosmic Cavatelli - RM19"});
        JComboBox<String> cb7 = new JComboBox<>(new String[]{"Celestial Brew - RM7", "Elixir of Euphoria - RM9", "Stardust Sip - RM11"});
        JComboBox<String> cb8 = new JComboBox<>(new String[]{"Divine Delight Danish - RM12", "Enchanted Eclair - RM15"});
        JComboBox<String> cb9 = new JComboBox<>(new String[]{"Galactic Gâteau - RM10", "Nebula Nectar Tart - RM13", "Starlight Soufflé - RM17"});

        JPanel image1 = new JPanel();
        JPanel image2 = new JPanel();
        JPanel image3 = new JPanel();

        JLabel lbl10 = new JLabel();
        lbl10.setSize(150, 150);
        JLabel lbl11 = new JLabel();
        lbl11.setSize(150, 150);
        JLabel lbl12 = new JLabel();
        lbl12.setSize(150,150);
        JLabel lbl13 = new JLabel();
        lbl13.setSize(150,150);
        JLabel lbl14 = new JLabel();
        lbl14.setSize(150,150);
        JLabel lbl15 = new JLabel();
        lbl15.setSize(150,150);
        JLabel lbl16 = new JLabel();
        lbl16.setSize(150,150);
        JLabel lbl17 = new JLabel();
        lbl17.setSize(150,150);
        JLabel lbl18 = new JLabel();
        lbl18.setSize(150,150);

        Image img1 = new ImageIcon("image1.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lbl10.setIcon(new ImageIcon(img1));

        Image img2 = new ImageIcon("image2.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lbl11.setIcon(new ImageIcon(img2));

        Image img3 = new ImageIcon("image3.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lbl12.setIcon(new ImageIcon(img3));

        image1.add(lbl10);
        image1.add(lbl11);
        image1.add(lbl12);
        image1.setLayout(new GridLayout(1,3));

        Image img4 = new ImageIcon("image4.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lbl13.setIcon(new ImageIcon(img4));

        Image img5 = new ImageIcon("image5.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lbl14.setIcon(new ImageIcon(img5));

        Image img6 = new ImageIcon("image6.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lbl15.setIcon(new ImageIcon(img6));

        image2.add(lbl13);
        image2.add(lbl14);
        image2.add(lbl15);
        image2.setLayout(new GridLayout(1,3));

        Image img7 = new ImageIcon("image7.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lbl16.setIcon(new ImageIcon(img7));

        Image img8 = new ImageIcon("image8.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lbl17.setIcon(new ImageIcon(img8));

        Image img9 = new ImageIcon("image9.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lbl18.setIcon(new ImageIcon(img9));

        image3.add(lbl16);
        image3.add(lbl17);
        image3.add(lbl18);
        image3.setLayout(new GridLayout(1,3));

        JLabel lbl1 = new JLabel("Appetizer", JLabel.CENTER);
        JLabel lbl2 = new JLabel("Seafood", JLabel.CENTER);
        JLabel lbl3 = new JLabel("Chicken", JLabel.CENTER);
        JLabel lbl4 = new JLabel("Fresh Salad", JLabel.CENTER);
        JLabel lbl5 = new JLabel("Sandwiches", JLabel.CENTER);
        JLabel lbl6 = new JLabel("Pasta", JLabel.CENTER);
        JLabel lbl7 = new JLabel("Beverage", JLabel.CENTER);
        JLabel lbl8 = new JLabel("Pastries", JLabel.CENTER);
        JLabel lbl9 = new JLabel("Desserts", JLabel.CENTER);

        JButton placeOrderButton = new JButton("Place Order");

        setLayout(new GridLayout(12, 3));
        setTitle("Yong Menu");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        p1.add(lbl1, BorderLayout.NORTH);
        p1.add(cb1);
        p2.add(lbl2, BorderLayout.NORTH);
        p2.add(cb2);
        p3.add(lbl3, BorderLayout.NORTH);
        p3.add(cb3);
        p4.add(p1);
        p4.add(p2);
        p4.add(p3);

        p5.add(lbl4, BorderLayout.NORTH);
        p5.add(cb4);
        p6.add(lbl5, BorderLayout.NORTH);
        p6.add(cb5);
        p7.add(lbl6, BorderLayout.NORTH);
        p7.add(cb6);
        p8.add(p5);
        p8.add(p6);
        p8.add(p7);

        p9.add(lbl7, BorderLayout.NORTH);
        p9.add(cb7);
        p10.add(lbl8, BorderLayout.NORTH);
        p10.add(cb8);
        p11.add(lbl9, BorderLayout.NORTH);
        p11.add(cb9);
        p12.add(p9);
        p12.add(p10);
        p12.add(p11);

        p13.add(placeOrderButton);

        add(p4);
        add(p8);
        add(p12);
        add(p13);
    }

    public static void main(String[] args) {
        new Menu();
    }
}
