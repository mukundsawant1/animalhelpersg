package animalmodelling.service;

import org.springframework.stereotype.Component;

import animalmodelling.model.Rooster;
import animalmodelling.response.Response;

@Component
public class AnimalHelperService {

	
	public Response getSound(String animal , String language) {
		if(!animal.equals("rooster")) return null;
		Rooster rooster = new Rooster();
		String song = rooster.singInLanguage(language.toUpperCase());
		return getResponseData(song);
	}
	
	private Response getResponseData(String val) {
		Response response = new Response();
		response.setVal(val);
		return response;
	}
	
}