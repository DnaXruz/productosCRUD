package modelo;

public class ProductoDAO{
	
    private ProductoDTO[] productos;
    private int total = 0;

    public ProductoDAO(int tamanio){
        productos = new ProductoDTO[tamanio];
    }
	
    public boolean agregar(ProductoDTO producto){
        
        boolean estado;

        if (producto != null) {
            productos[total] = producto;
            total++;
            estado = true;
        } else{
            estado = false;
        }

        return estado;
    }

    public int buscarXNombre(String nombre){

        int posicion = -1;

        for(int lugar = 0; lugar < productos.length; lugar++){
            if (productos[lugar] != null && productos[lugar].getNombre().equals(nombre)) {
                posicion = lugar;
                break;
            }
        }

        return posicion;
    }

    public int buscarXId(int id){

        int posicion = -1;

        for(int lugar = 0; lugar < productos.length; lugar++){
            if (productos[lugar] != null && productos[lugar].getId() == id) {
                posicion = lugar;
                break;
            }
        }

        return posicion;
    }


    //Para hacer modificaciones aqui si considero que se deberia hacer atributo por atributo

    public boolean modificar(int id, ProductoDTO producto){

        boolean cambio;
        int posicion = buscarXId(id);

        if(posicion != -1 && producto != null){
            productos[posicion] = producto; 
            cambio = true;
        } else {
            cambio = false;
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