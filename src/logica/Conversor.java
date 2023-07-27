package logica;

import javax.swing.*;
import java.text.DecimalFormat;

public class Conversor {

	public static void main(String[] args) {
		
		Moneda moneda = new Moneda();
		
		Object[] opcionesDeCambio = {
				"De Peso a Dólar",
				"De Peso a Euro",
				"De Peso a Libra",
				"De Peso a Yen",
				"De Peso a Won",
				"De Dólar a Peso",
				"De Euro a Peso",
				"De Libra a Peso",
				"De Yen a Peso",
				"De Won a Peso"};
		
		String[] tipoDeMoneda = {
				" dolares",
				" euros",
				" libras",
				" yenes",
				" wones",
				" pesos",
				" pesos",
				" pesos",
				" pesos",
				" pesos",};
		
		Object tipoDeCambio = JOptionPane.showInputDialog(
				null,
				"Elige el tipo de cambio que deseas realizar",
				"Tipo de Cambio",
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opcionesDeCambio,
				opcionesDeCambio[0]);
		
		if (tipoDeCambio == null) {
			System.exit(0);
		}
		
		String userResponse = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
		
		if( userResponse != null) {
			
			try {
				
				double cantidadAConvertir = Double.parseDouble(userResponse);
				
				for (int i = 0; i < opcionesDeCambio.length; i++) {
					
					if (tipoDeCambio == opcionesDeCambio[i]) {
						
						DecimalFormat redondeo = new DecimalFormat("#.00");

						double cambio = moneda.CambioDeMoneda(cantidadAConvertir, i);
						
						String respuesta = redondeo.format(cambio);
						
						JOptionPane.showMessageDialog(null, "Tienes " + respuesta + tipoDeMoneda[i], "Mensaje", JOptionPane.INFORMATION_MESSAGE);
						
						break;
					}
				}
			}
			
			catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "Valor no válido", "Mensaje", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		else {
			
			System.exit(0);
		}

		int botonPulsado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Selecciona una opción", JOptionPane.YES_NO_CANCEL_OPTION);
		
		if (botonPulsado == 0) {
			
			Conversor.main(null);
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Programa terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);
		}
	}
}