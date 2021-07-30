package animalmodelling.util;

import java.util.HashMap;
import java.util.Map;

import animalmodelling.constant.Languages;

public class SingUtil {

	static final Map<String,String> languageVsSong = new HashMap<String,String>() {
	{
		put(Languages.Danish.getLanguage(),"kykyliky");
		put(Languages.Dutch.getLanguage(),"kukeleku");
		put(Languages.Finnish.getLanguage(),"kukko kiekuu");
		put(Languages.French.getLanguage(),"cocorico");
		put(Languages.German.getLanguage(),"kikeriki");
		put(Languages.Greek.getLanguage(),"kikiriki");
		put(Languages.Hebrew.getLanguage(),"coo- koo - ri-koo");
		put(Languages.Hungarian.getLanguage(),"kukuriku");
		put(Languages.Italian.getLanguage(),"chicchirichi");
		put(Languages.Japanese.getLanguage(),"ko - ke - kok - ko -o");
		put(Languages.Portuguese.getLanguage(),"cucurucu");
		put(Languages.Russian.getLanguage(),"kukareku");
		put(Languages.Swedish.getLanguage(),"kuckeliku");
		put(Languages.Turkish.getLanguage(),"kuk-kurri-kuuu");
		put(Languages.Urdu.getLanguage(),"kuklooku");
	}};
	
	public static String getSongFromLanguage(String language) {
		return languageVsSong.get(language);
	}
	
}
