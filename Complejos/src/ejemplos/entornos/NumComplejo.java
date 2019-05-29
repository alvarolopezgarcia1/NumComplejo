package ejemplos.entornos;

/**
 * Ejemplo: NumComplejo.
 *
 * @author Alvaro Lopez
 * @version 29.05.2019
 */

public class NumComplejo {
	private double pReal;
	private double pImaginaria;

	/**
	 * Constructor.
	 * 
	 */

	public NumComplejo() {

	}

	/**
	 * Constructor.
	 * 
	 * @param pReal       parte: parte real.
	 * @param pImaginaria parte: parte imaginaria.
	 */

	public NumComplejo(double pReal, double pImaginaria) {
		this.pReal = pReal;
		this.pImaginaria = pImaginaria;
	}

	/**
	 * Getter.
	 * 
	 * @return parte: parte real.
	 */
	public double getpReal() {
		return pReal;
	}
	
    /**
     * Setter.
     * @param pRreal: parte real.
     */

	public void setpReal(double pReal) {
		this.pReal = pReal;
	}
	
	/**
	 * Getter.
	 * 
	 * @return parte: parte imaginaria.
	 */

	public double getpImaginaria() {
		return pImaginaria;
	}
	
	/**
     * Setter.
     * @param pRreal: parte imaginaria.
     */

	public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}
	

    /**
     * Calcula suma numeros complejos.
     * @return suma.
     */

	public static NumComplejo sumarComplejos(NumComplejo c1, NumComplejo c2) {
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal() + c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria() + c2.getpImaginaria());

		return result;
	}
	

    /**
     * Calcula resta numeros complejos.
     * @return resta.
     */

	public static NumComplejo restarComplejos(NumComplejo c1, NumComplejo c2) {
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal() - c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria() - c2.getpImaginaria());

		return result;
	}
	

    /**
     * Calcula multiplicar numeros complejos.
     * @return multiplicacion.
     */

	public static NumComplejo multiplicarComplejos(NumComplejo c1, NumComplejo c2) {
		NumComplejo result = new NumComplejo();

		double a = c1.getpReal();
		double b = c1.getpImaginaria();
		double c = c2.getpReal();
		double d = c2.getpImaginaria();

		result.setpReal((a * c) - (b * d));
		result.setpImaginaria((a * d) + (b * c));

		return result;
	}
	

    /**
     * Calcula division de numeros complejos.
     * @return division.
     */

	public static NumComplejo dividirComplejos(NumComplejo c1, NumComplejo c2) {
		NumComplejo result = new NumComplejo();

		double a = c1.getpReal();
		double b = c1.getpImaginaria();
		double c = c2.getpReal();
		double d = c2.getpImaginaria();

		double dividendoReal = (a * c) + (b * d);
		double dividendoImaginario = (b * c) - (a * d);
		double divisor = (Math.pow(c, 2) + Math.pow(d, 2));

		result.setpReal(dividendoReal / divisor);
		result.setpImaginaria(dividendoImaginario / divisor);

		return result;
	}
	

    /**
     * Calcula modulo de numeros complejo.
     * @return modulo.
     */

	public static double modulo(NumComplejo numComplejo) {
		double real = numComplejo.getpReal();
		double imaginaria = numComplejo.getpImaginaria();

		return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginaria, 2));
	}
	
	

    /**
     * toString.
     * @return Muestra resultados de numeros complejos.
     */

	@Override
	public String toString() {

		String mostrar = "";
		if (pReal != 0) {
			mostrar += pReal;
		}
		if (pImaginaria >= 0) {
			mostrar = mostrar + "+" + pImaginaria + "i";
		} else {
			mostrar = mostrar + "-" + (pImaginaria * (-1)) + "i";
		}
		return mostrar;
	}
}
