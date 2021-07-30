package animalmodelling.util;

import java.util.function.Function;

public class StringUtil {

	public static Function<String, String> removeLineEndChars = s -> s.replaceAll("\\r\\n", "");
	
}
