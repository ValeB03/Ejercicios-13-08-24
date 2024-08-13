package ejercicio5;

public class ejercicio5 {

	public static void main(String[] args) {
		
		double wons = 127000.0; 
        
        final double TASA_CONVERSION = 1400.0;

        
        double euros = wons / TASA_CONVERSION;
        System.out.println(wons + " wons son equivalentes a " + euros + " euros.");

	}

}
