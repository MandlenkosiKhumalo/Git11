import java.util.ArrayList;
import java.util.Collections;

public class ascending_order {

	public static void main(String[] args) {
		ascending_order n=new ascending_order();
		// TODO Auto-generated method stub
		int nu=20000;
		for (int j = 0; j <nu; j=j+1000) {
			
		
		double s= System.currentTimeMillis();
		n.increasing_order(j);//for ascending order comment out
		double e=System.currentTimeMillis();
		double t=e-s;
		System.out.println(j+","+t);
		}
	}
	public void increasing_order(int n) {
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
				if(random[j]>random[j+1]) {
					int temp=random[j];
					random[j]=random[j+1];
					random[j+1]=temp;
				
				}
			}
		}
//		for (int i : ran) {
//			System.out.print(i);
//		};
	}

}