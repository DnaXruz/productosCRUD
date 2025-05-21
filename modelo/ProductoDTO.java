package modelo;

public class ProductoDTO{
	int id;
	String nombre;
	float precio;
	float costo;
	int existencia; //numero de productos totales en existencia
	
	public ProductoDTO(){
		
	}
	
	public int getId(){
		return id;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public float getPrecio(){
		return precio;
	}
	
	public float getCosto(){
		return costo;
	}
	
	public int getExitencia(){
		return existencia;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setPrecio(float precio){
		this.precio = precio;
	}
	
	public void setCosto(float costo){
		this.costo = costo;
	}
	
	public void setExistencia(int existencia){
		this.existencia =existencia;
	}
	
	public String toString(){
		
		return "id: " + id + "producto: " + nombre + "precio: " +  precio + "costo: " + costo + "no en existencia: " + existencia; 
	}
}