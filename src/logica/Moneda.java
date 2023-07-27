package logica;

public class Moneda {
	
	double pesoADolar = 0.0037;
	double pesoAEuro = 0.0033;
	double PesoALibra = 0.0029;
	double PesoAYen = 0.52;
	double PesoAWon = 4.74;
	double DolarAPeso = 268.71;
	double EuroAPeso = 300.48;
	double LibraAPeso = 345.94;
	double YenAPeso = 1.92;
	double WonAPeso = 0.21;
	
	Double[] tipoDeCambio = {
			pesoADolar,
			pesoADolar,
			PesoALibra,
			PesoAYen,
			PesoAWon,
			DolarAPeso,
			EuroAPeso,
			LibraAPeso,
			YenAPeso,
			WonAPeso};
	
	public double CambioDeMoneda( double cantidad, int i) {
		
		double resultado = cantidad * tipoDeCambio[i];
		
		return resultado;
	}
}

