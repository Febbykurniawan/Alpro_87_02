package R6;
import java.util.Scanner;
import java.util.Arrays;
public class BagianK{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};

	public void cetak(){	
		Arrays.sort(array);
		for (int i = 0; i < array.length ; i++ ) {	
			System.out.print(array[i]+" , ");
			
			}
	}

}