package nonlinear;

public class BinaryTree {
	public static int print(int data) {
		if(data==1) {
			return 1;
		}
		else {
		return data*print(data-1);
	}
}	
	public static void main(String[] args) {
		System.out.println(print(5));
	}
}

