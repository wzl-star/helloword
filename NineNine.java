public class NineNine{
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j<=i)
				System.out.print(+j+"*"+i+"="+i*+j+'\t');
			
			}
			System.out.println("");
		}
	}
}