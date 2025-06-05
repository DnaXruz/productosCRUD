package control;

import modelo.*;
import vista.VistaProductos;

public class ControlProductos {
	
	
	VistaProductos vista;
	ProductoDAO listaProductos;
	
	public ControlProductos(){
			
		vista = new VistaProductos();
		listaProductos = new ProductoDAO();
	}

	
	public void agregarProducto(){
	 
		ProductoDTO producto = vista.agregarProducto();
		 
		if(listaProductos.agregar(producto)){
			
			vista.mensaje("Producto agregado correctamente");
		} else {
			 
			vista.mensaje("Producto no agregado");
		 }
	}
	
	public void eliminarProducto(){
		
		int idProducto = vista.eliminarProducto();
		
		if(listaProductos.eliminar(producto)){
			
			vista.mensaje("Producto eliminado correctamente");
		} else {
			
			vista.mensaje("El producto no pudo ser removido");
		}
	}
	
	public void actualizarProducto(){
		
		int idProducto = vista.buscarProducto();
		
		if(idProducto != -1 ){
			
			ProductoDTO producto = vista.agregarProducto();
		
			if(listaProductos.actualizarProducto(idProducto, producto)){
				
				vista.mensaje("Producto Actualizado");
				
			} else {
				 
				vista.mensaje("Error al actualizar el producto");
			 }
		} else {
			
			vista.mensaje("Producto no Encontrado");
		}
	}
	
	
	/** Metodo actualizado */
	public ProductoDTO buscarProducto(){
		
		String productoABuscar = vista.buscarProducto();
		ProductoDTO producto = listaProductos.buscarProducto(productoABuscar);
		
		if(producto != null){
			
			vista.mensaje(producto);
		} else {
			
			vista.mensaje("Producto no encontrado");
		}
		
		return producto;
	}
    
    public static void main(String... args){

		ControlProductos control = new ControlProductos();
    }
}
