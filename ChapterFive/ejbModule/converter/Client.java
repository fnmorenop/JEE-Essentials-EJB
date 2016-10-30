package converter;

import javax.ejb.EJB;
//import /ChapterThreeChallenge/ejbModule/converter/Converter.java

public class Client {

	@EJB
	public static void main(String[] args) {

		Converter converter = new Converter();
		double celcius = -100;
		converter.setMessage(celcius);
	}

}
