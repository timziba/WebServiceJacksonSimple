package metier;

import java.io.File;
import java.io.IOException;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Lanceur {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Employe e1 = new Employe("Fatimata", "BA", "timziba@timi.sn");
		
		File resultFile = new File("employe.json");
		
		objectMapper.writeValue(resultFile, e1);

	}

}
