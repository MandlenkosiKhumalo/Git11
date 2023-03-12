import java.util.*;

public class Implementations {

public static void main(String[] args) {
	Implementations h=new Implementations();
	int n=20000;
	for (int i = 0; i <n; i=i+1000) {
		
	
	double stime=System.currentTimeMillis();
	h.arraycreator(i);
	double etime=System.currentTimeMillis();
	double total_time=etime-stime;
	System.out.println(i+","+total_time);
	
	
	
}
}

public void arraycreator(int n) {
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


}


}
