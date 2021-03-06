import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class CreateData {
	Random rand = new Random(555);
	//The whole point of this class is to generate data used by other classes to sort and otherwise play with the data
	//This class also contains the tostring function just purely out of convience
	public CreateData() {
		
		// TODO Auto-generated constructor stub
	}
	//no checking, don't do something stupid like input -1
	public ArrayList<Item> createArrayList(int items) {
		ArrayList<Item> array = new ArrayList<Item>();
		for (int i=0;i<items;i++) {
			
			Item item = genItem(i,items);
			array.add(item);
		}
		
		
		return array;
		
	}
	
	public LinkedList<Item> createLinkedList(int items) {
		
		LinkedList<Item> list = new LinkedList<Item>();
		
		for (int i=0;i<items;i++) {
			
			Item item = genItem(i,items);
			list.add(item);
		}
		
		
		
		return null;
		
	}
	
	public Item genItem(int i,int items) {
		int val2=rand.nextInt(100000000);
		String val3 = items + " / " + i;
		Item item = new Item(i,val2,val3);
		return item;
	}
	public String ALToString(ArrayList<Item> al) {
		String str = "Start of toString()";
		for (int i=0;i<al.size();i++) {
			str += al.get(i).output();
			str += "\n";
		}
		
		return str;
	}
	

}
