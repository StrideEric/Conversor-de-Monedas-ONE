package utilities;

import java.util.List;

import javax.swing.JOptionPane;


public class Conversor {
	public static void conversor(String seleccion, List listaConversiones, String[] opciones ) {
	    int posicionDeConversion = Seleccion.seleccionDeMetodo(seleccion, opciones);
	    //tomo el elemento de la conversion a realizar
    	TiposDeConversion elemento = (TiposDeConversion) listaConversiones.get(posicionDeConversion);
	    try {
	    	//pido la cantidad para convertir
	    	String miDinero = JOptionPane.showInputDialog("Ingresa la cantidad de " + elemento.getDeNombre() + " a cambiar:");
	    	if (miDinero != null) {
	    	double dineroSinConvertir = Double.parseDouble(miDinero);
	    	//convierto el dinero
	    	double dineroConvertido = dineroSinConvertir * elemento.getTasa();
	        JOptionPane.showMessageDialog(null, dineroSinConvertir + " " + elemento.getDeNombre() + 
	        		" equivalen a " + dineroConvertido + " " + elemento.getANombre() + ".");
	    	} else {
	    		JOptionPane.showMessageDialog(null, "Programa Terminado");
	    		System.exit(0);
	    	}
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Error: Ingresa una cantidad válida de " + elemento.getDeNombre() + ".");
	        //vuelvo a llamar a conversor para que vuelva a ingresar otro valor
	        conversor(seleccion, listaConversiones, opciones);
	    	} catch (NullPointerException e) {
	    		JOptionPane.showMessageDialog(null, "Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
	    	}
}
}
