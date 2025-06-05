package vista;

import javax.swing.*;
import java.awt.*;

public class VistaProductos{
    
    private JFrame frame;

    public VistaProductos(){
        super();
        frame = new JFrame("Hello Name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1240,800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        

        frame.add(agregarPanel(Color.MAGENTA),BorderLayout.NORTH);
        frame.add(agregarPanel(Color.BLACK),BorderLayout.CENTER);
        frame.add(agregarPanel(Color.BLUE),BorderLayout.SOUTH);
    }

    public JPanel agregarPanel(Color c){

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        panelPrincipal.setPreferredSize(new Dimension(0, 50)); // alto fijo
        panelPrincipal.setBackground(c);

        return panelPrincipal;
    }

    public static void main(String... args){

        VistaProductos vista = new VistaProductos();
    }

}
