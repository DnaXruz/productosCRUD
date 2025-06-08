package vista;

import javax.swing.JPanel;
import java.awt.*;

public class VistaProductos {
    
        public JPanel panelMenu(Color c){

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelPrincipal.setPreferredSize(new Dimension(0, 50)); // alto fijo
        panelPrincipal.setBackground(c);

        return panelPrincipal;
        }
}
