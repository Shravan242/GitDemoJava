package demo;


public enum Season {
	WINTER("cold"), SUMMER("hot"), SPRING("warm");
	
	Season(String description){
		this.description = description;
	}
	
	private final String description;
	
	public String getDescription() {
        return description;
    }

}
