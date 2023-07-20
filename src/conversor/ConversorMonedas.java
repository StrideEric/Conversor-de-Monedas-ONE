package conversor;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import utilities.*;

public class ConversorMonedas {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "¡Bienvenido al Conversor de Monedas!");

        //String[] opciones = {"Dólares a Euros", "Euros a Dólares",
        //		"Dólares a Pesos", "Pesos a Dólares", "Dólares a Libras", 
        //		"Libras a Dólares", "Dólares a Yenes", "Yenes a Dólares", "Salir"};
        
        List listaDeConversiones = new ArrayList();
        listaDeConversiones.add(new TiposDeConversion("Dolares a Euros","Dolares","Euros",0.85));
        listaDeConversiones.add(new TiposDeConversion("Euros a Dolares","Euros","Dolares",1.17));
        
        
        String[] opciones = new String[listaDeConversiones.size()];
        
        for (int i=0; i<listaDeConversiones.size(); i++) {
        	TiposDeConversion elemento = (TiposDeConversion) listaDeConversiones.get(i);
        	opciones[i] =  elemento.getNombre();
			System.out.println("Primera celda: " + opciones[i]);
        }
        

        String seleccion = (String) JOptionPane.showInputDialog(
                null, //padre
                "Elige una opción:",
                "Conversor de Monedas",
                JOptionPane.PLAIN_MESSAGE,
                null, //icono personalizado
                opciones, //las opciones
                null //opciones preseleccionada
        );

        if (seleccion != null) {
        	Conversor.conversor(seleccion, listaDeConversiones, opciones);
        	int decision = JOptionPane.showConfirmDialog(null, "Desea continuar?", null,
        			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (decision == JOptionPane.YES_OPTION) {
                System.out.println("El usuario seleccionó Sí.");
                ConversorMonedas.main(args);
            } else if (decision == JOptionPane.NO_OPTION) {
                System.out.println("El usuario seleccionó No.");
                JOptionPane.showMessageDialog(null, "Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
            } else if (decision == JOptionPane.CANCEL_OPTION) {
                System.out.println("El usuario seleccionó Cancelar.");
                JOptionPane.showMessageDialog(null, "Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
            }

        } else {
        	JOptionPane.showMessageDialog(null, "Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
        }
        	
        	
        
    }


}
