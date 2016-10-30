package converter;

import javax.ejb.EJB;

public class Client {

	@EJB
	public static void main(String[] args) {

		Converter converter = new Converter();
		double celcius = 100;
		double farenheit = converter.conversion(celcius);
		System.out.printf("%nEl equivalente de %f grados celcius son %f farenheit%n", celcius, farenheit);
	}

}
