import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] tempArr = perm(3);	
		for(int j = 0; j < 6; j++) {
			System.out.print("[");
			for (int i = 0; i < 3; i ++) {
				System.out.print(" " + tempArr[j][i] + " ");
			}
			System.out.println("]");
		}
	}
	
	
	
	static Object[][] perm(int n) {
		int numPerms = factorial(n);
		Object[][] perms = new Object[numPerms][n];
		Queue<Integer> temp = new LinkedList<Integer>();
		//first permutation
		for (int i = 0; i < n; i++) 
			temp.add(i + 1);
		perms[0] = temp.toArray();
		temp.add(temp.remove());
		perms[1] = temp.toArray();
		temp.add(temp.remove());
		perms[2] = temp.toArray();
		temp.add(temp.remove());
		Object[] tempArr = temp.toArray();
		Object[] newArr = new Object[n];
		for (int i = n - 1, j = 0; i >= 0; i--, j++) {
			newArr[j] = tempArr[i];
		}
		temp = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) 
			temp.add((Integer) newArr[i]);
		perms[3] = temp.toArray();
		temp.add(temp.remove());
		perms[4] = temp.toArray();
		temp.add(temp.remove());
		perms[5] = temp.toArray();
		temp.add(temp.remove());
		
		
//		for (int i = 0; i < numPerms; i++) {
//			perms[i] = temp.toArray();
//		}
		
		
		return perms;
	}
	
	static int factorial(int n) {
		int sum = 1;
		for (int i = n; i > 0; i--) {
			sum *= i;
		}
		return sum;
	}

}
