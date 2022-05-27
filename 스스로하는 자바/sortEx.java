// Á¤·Ä
public class sortEx {
	public static void main(String[] args) {
		int[] a = {4,8,7,3,1,2,8};
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i=0; i<a.length; i++) {
			for(int j=i; j<a.length-1; j++) {
				if(a[i]>a[j]) {
					int t;
					t =a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
