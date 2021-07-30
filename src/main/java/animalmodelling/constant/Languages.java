package animalmodelling.constant;

public enum Languages {

	Danish("DN"), Dutch("DU"), Finnish("FI"), French("FR"), German("GE"), Greek("GR"), Hebrew("HE"), Hungarian("HU"),
	Italian("IT"), Japanese("JA"), Portuguese("PO"), Russian("RU"), Swedish("SW"), Turkish("TU"), Urdu("UR");

	private String language;

	Languages(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

}