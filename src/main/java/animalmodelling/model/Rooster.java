package animalmodelling.model;

import animalmodelling.constant.Messages;
import animalmodelling.util.SingUtil;

public class Rooster extends Chicken {

	@Override
	public void sing() {
		System.out.println(Messages.ROOSTER_SINGING.getMessage());
	}

	public String singInLanguage(String language) {
		return SingUtil.getSongFromLanguage(language);
	}

}
