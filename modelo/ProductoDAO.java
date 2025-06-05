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
	public boolean buscarProducto(String id){
		
		return productos.containsKey(id);
	}

	/** Metodo actualizado */
    public ProductoDTO buscarXId(int idProducto){

        ProductoDTO encontrado = null;
		
		for(ProductoDTO producto : productos){
			
			if(producto.getId() == idProducto){
				encontrado = producto;
				break;
			}
		}
		
		return encontrado;
    }


    //Para hacer modificaciones aqui si considero que se deberia hacer atributo por atributo

    public boolean modificar(int id, ProductoDTO producto){

        boolean cambio = false;
		ProductoDTO prodAModificar = buscarXId(id);

        if(prodAModificar != null && prodAModificar.getId() == id && producto != null){
			productos.set(id, producto); 
            cambio = true;
        }

        return cambio;
    }


    public boolean eliminar(int id){

        int posicion = buscarXId(id); 
        boolean eliminado = false;

        if (posicion != -1) {
            
            for(int lugar = posicion; lugar < total - 1 ; lugar++){
                productos[lugar] = productos[lugar + 1];
            }

            productos[total -1] = null;
            total--;
            eliminado = true;
        }

        return eliminado;
    }
    



}