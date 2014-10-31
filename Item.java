
public class Item {
	int data,data2;
	String text;
	public Item() {
		//no argument constructor
	}
	public Item(int dataL, int data2L, String textL) {
		data = dataL;
		data2 = data2L;
		text = textL;
	}
	
	public String output() {
		String str = "";
		if (data<10) {
			str+="0";
		}
		if (data<100) {
			str+= "0";
		}
		str+= "" + data + " data2: " + data2 + " text: " + text;
		
		
		return str;
		
	}

}
