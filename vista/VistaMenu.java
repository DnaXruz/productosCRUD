package vista;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VistaMenu {

    public JMenuBar crearMenu() {

        JMenuBar mb = new JMenuBar();
        JMenu menu3 = new JMenu("Ayuda");
        mb.add(btnInicio());
        mb.add(btnProductos());
        mb.add(btnConfiguracion());
        mb.add(menu3);

        return mb;
    }

    public JMenu btnInicio() {

        JMenu mInicio = new JMenu("Inicio");
        JMenuItem sesion = new JMenuItem("Cerrar sesion");
        JMenuItem cerrar = new JMenuItem("Salir del sistema");

        mInicio.add(cerrar);
        mInicio.add(sesion);

        return mInicio;
    }

    public JMenu btnProductos() {

        JMenu mProductos = new JMenu("Productos");
        JMenuItem verProductos = new JMenuItem("Ver Productos");
        JMenuItem agregarProducto = new JMenuItem("Agregar");
        JMenuItem editarProducto = new JMenuItem("Editar");
        JMenuItem eliminarProducto = new JMenuItem("Eliminar");

        mProductos.add(verProductos);
        mProductos.add(agregarProducto);
        mProductos.add(editarProducto);
        mProductos.add(eliminarProducto);

        return mProductos;
    }

    public JMenu btnConfiguracion() {

        JMenu mConfiguracion = new JMenu("Configuracion");
        JMenuItem cambiarContra = new JMenuItem("Cambiar contrasenia");
        JMenuItem preferencias = new JMenuItem("Preferencias");
        JMenuItem datosGenerales = new JMenuItem("Datos del usuario");

        mConfiguracion.add(cambiarContra);
        mConfiguracion.add(preferencias);
        mConfiguracion.add(datosGenerales);

        return mConfiguracion;
    }
}
