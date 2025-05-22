package vista;

import javax.swing.JFrame;

public class VistaProductos{
    
    private JFrame frame;

    public VistaProductos(){
        super();
        frame = new JFrame("Hello Name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }


}
