package utilities;

import java.util.List;

import javax.swing.JOptionPane;

public class Seleccion {
	public static int numeroDeMetodo;
	
	public static int seleccionDeMetodo(String textoDeSeleccion, String[] opciones) {

		for (int i = 0; i < opciones.length; i++) {
			if (textoDeSeleccion == opciones[i])
			{
				numeroDeMetodo = i;
			}
		}
		
		return numeroDeMetodo;
		
		
//        switch (numeroDeMetodo) {
//        case 0:
//            
 //           break;
  //      case 1:
    //        // Lógica para convertir de euros a dólares
      //      break;
  //      default:
   ///         JOptionPane.showMessageDialog(null, "Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
  //          break;
  //  }
//}
	}
	
	
}
