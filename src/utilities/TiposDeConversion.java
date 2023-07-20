package utilities;

import java.util.List;

public class TiposDeConversion {
	private String nombre;
	private String convertirDeNombre;
	private String convertirANombre;
	private double tasaDeCambio;
	
	// Constructor
    public TiposDeConversion(String nombre, String convertirDeNombre, String convertirANombre, double tasaDeCambio) {
        this.nombre = nombre;
        this.convertirDeNombre = convertirDeNombre;
        this.convertirANombre = convertirANombre;
        this.tasaDeCambio = tasaDeCambio;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDeNombre() {
        return convertirDeNombre;
    }

    public void setDeNombre(String convertirDeNombre) {
        this.convertirDeNombre = convertirDeNombre;
    }

	
    public String getANombre() {
        return convertirANombre;
    }

    public void setAnombre(String convertirANombre) {
        this.convertirANombre = convertirANombre;
    }

	

    public double getTasa() {
        return tasaDeCambio;
    }

    public void setTasa(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }
    
    
   
	
}
