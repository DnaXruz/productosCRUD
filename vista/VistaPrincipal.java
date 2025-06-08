package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class VistaPrincipal implements ActionListener{
    
    
    private JFrame frame;
    private VistaMenu menu;
    private VistaProductos productos;


    public VistaPrincipal(){
        
        menu = new VistaMenu();
        productos = new VistaProductos(); 

        frame = new JFrame("Punto de venta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(1240,800);
        frame.setLocationRelativeTo(null);
        

        frame.setJMenuBar(menu.crearMenu());
        frame.add(productos.panelMenu(Color.MAGENTA),BorderLayout.NORTH);
        
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    	Container f = this.frame.getContentPane();
        if (e.getSource() != "") {
            f.setBackground(new Color(255,0,0));
        }      
    }




    public static void main(String... args){

         new VistaPrincipal();
    }

}
