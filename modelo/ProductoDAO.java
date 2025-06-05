package modelo;

public class ProductoDAO{
	
    private Map<String, ProductoDTO> productos = new HashMap<>();;
	private int total = 0;
	
	public String generarId(){
		
		total++;
		
		return "P" + total;
	}
	
    public boolean agregar(ProductoDTO producto){
		
		boolean estado = false;
		
		if(producto != null){
			
			String id = generarId();
			producto.setId(id);
			productos.put(id, producto);
			estado = true;
		}
		
		return estado;
    }
	
	/** Metodo actualizado */
	public ProductoDTO buscarProducto(String id){
		
        return productos.get(id);
	}


    //Para hacer modificaciones aqui si considero que se deberia hacer atributo por atributo

    public boolean modificar(String id, ProductoDTO producto){

		if(producto != null && buscarProducto(id) ){

            ProductoDTO productoOld = productos.get(id); 
            return productos.replace(id, productoOld, producto);
        }

        return false;
    }


    public boolean eliminar(String id){

        boolean eliminado = false;

        if(productos.containsKey(id)){
            productos.remove(id);
            estado = true;
        }

        return estado;
    }

}