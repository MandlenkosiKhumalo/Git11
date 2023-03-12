import java.util.ArrayList;
import java.util.Collections;

public class descending_order {

	public static void main(String[] args) {
		descending_order h=new descending_order();
		// TODO Auto-generated method stub
		int nu=20000;
		for (int i = 0; i <nu; i=i+1000) {
			
		
		double sd= System.currentTimeMillis();
		h.decreasing_order(i);
		double ed=System.currentTimeMillis();
		double td=ed-sd;
		System.out.println(i+","+td);
		}
	}
	public void decreasing_order(int n) {
		ArrayList<Integer> numbers = new ArrayList<>();
		int[] random=new int[n];
		for(int i = 0; i < n; i++)
		{
		numbers.add(i+1);
		}
		Collections.shuffle(numbers);
		for (int i = 0; i < random.length; i++) {
			random[i]=numbers.get(i);
		}
		for (int i=0;i<random.length-1;i++) {
			for(int j=0;j<random.length-i-1;j++) {
				if(random[j]<random[j+1]) {
					int temp=random[j+1];
					random[j+1]=random[j];
					random[j]=temp;
				
				}
			}
		}
//		for (int i : ran) {
//			System.out.print(i);
//		};
	}
}