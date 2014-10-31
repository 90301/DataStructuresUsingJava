import java.util.ArrayList;


public class BubbleSorter {

	public BubbleSorter() {
		// TODO Auto-generated constructor stub
	}
	//This sorts based on data2
	public ArrayList<Item> alSort(ArrayList<Item> al) {
		
		for (int i=0;i<al.size();i++) {
			for (int e=0;e<al.size()-i-1;e++) {
				if (al.get(e).data2>al.get(e+1).data2) {
					swap(al,e,e+1);
				}
			}
		}
		
		
		
		
		
		return al;
		
	}
	
	void swap(ArrayList<Item> al,int item1, int item2) {
		Item temp = al.get(item1);
		al.set(item1, al.get(item2));
		al.set(item2, temp);		
		
	}

}
