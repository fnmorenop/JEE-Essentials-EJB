package converter;

import javax.ejb.EJB;

public class Client {

	@EJB
	public static void main(String[] args) {

		Converter converter = new Converter();
		double celcius = 100;
		converter.setMessage(celcius);
	}

}
