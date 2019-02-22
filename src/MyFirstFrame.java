import javax.swing.*;
public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,700,500);
        frame.setTitle("Hello Swing");
        ImageIcon icon =new ImageIcon("ecom.jpg");
        frame.setIconImage(icon.getImage());
    }
}
