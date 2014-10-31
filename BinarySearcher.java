import java.util.ArrayList;


public class BinarySearcher {

	public BinarySearcher() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean searchAl(ArrayList<Item> al,int val) {
		boolean rtrn = false;
		int checkValue = -1;
		int lowersub = 0;
		int uppersub = al.size()-1;
		int midsub = (lowersub + uppersub)/2;
		
		while (lowersub < uppersub && rtrn !=true)	{
			
			if (al.get(midsub).data2>val) {
				uppersub=midsub-1;
			} else if (al.get(midsub).data2<val) {
				lowersub=midsub+1;
			} else {
				checkValue = midsub;
				rtrn = true;
			}
			midsub = (lowersub+uppersub)/2;
			
			
		}
		if (rtrn == true) {
			System.out.println(checkValue + " at " + al.get(checkValue).output());
		}
		return rtrn;
		
	}
	
	public void bsTest(ArrayList<Item> al) {
		System.out.println("Begin BS testing---------------------------");
		searchAl(al,al.get(528).data2);
		
	}

}
