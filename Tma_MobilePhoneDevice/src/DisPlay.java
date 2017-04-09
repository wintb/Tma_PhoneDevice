
public class DisPlay {
	
	private String Size;
	private String NumberColor;
	
	public DisPlay(String Size, String NumberColor){
		this.Size = Size;
		this.NumberColor = NumberColor;
	}
	
	@Override
	public String toString() {
		return "\nDisplay:\n\tSize: " + Size
				+ "\n\tNumberColor: " + NumberColor;
	}

	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getNumberColor() {
		return NumberColor;
	}
	public void setNumberColor(String numberColor) {
		NumberColor = numberColor;
	}
	
	
	
	

}
