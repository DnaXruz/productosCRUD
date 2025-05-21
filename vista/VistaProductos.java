package vista;

import javax.swing.JFrame;

public class VistaProductos{
    
    private JFrame frame;

    public VistaProductos(){
        frame = new JFrame("Hello Name");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
