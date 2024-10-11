import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class Janja {
    public static void main(String[] args) {
        final JFrame GTG=new JFrame("MARANGI");
         GTG.setSize(500,500);
        GTG.setVisible(true);
        GTG.setLayout(null);
        JButton x=new JButton ("GREEN");
        x.setBounds(50,100,150,50);
        x.setBackground(Color.GREEN);
        GTG.add(x);
        JButton z=new JButton ("RED");
        z.setBounds(50,200,150,50);
        z.setBackground(Color.RED);
        GTG.add(z);
        JButton y=new JButton("YELLOW");
        y.setBounds(50,300,150,50);
        y.setBackground(Color.YELLOW);
        GTG.add(y);
        JButton d=new JButton("EXIT");
        d.setBounds(50,400,150,50);
        d.setBackground(Color.ORANGE);
        GTG.add(d);
        
        d.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent jx){
                GTG.dispose();
            }
        });
        y.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent jx){
                GTG.getContentPane().setBackground(Color.YELLOW);
            }
        });
        z.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent jx){
                GTG.getContentPane().setBackground(Color.RED);
            }
        });
        x.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent jx){
                GTG.getContentPane().setBackground(Color.GREEN);
            }
        });
    }
}
