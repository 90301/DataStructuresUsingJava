import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateData cd = new CreateData();
		ArrayList<Item> theData = cd.createArrayList(1000);
		BubbleSorter bubble = new BubbleSorter();
		theData = bubble.alSort(theData);
		System.out.print(cd.ALToString(theData));
		BinarySearcher bs = new BinarySearcher();
		bs.bsTest(theData);
		LinkedList<Item> ll = cd.createLinkedList(1000);
		
		
	}

}
