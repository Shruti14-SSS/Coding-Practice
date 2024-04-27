package extra;
import java.util.*;
public class infy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases:");
		int T = sc.nextInt();
		while(T-- > 0){
			System.out.println("Enter the number of dishes:");
			int N = sc.nextInt();
			int[] dishes = new int[N];
			for(int i=0; i<N; i++) {
				dishes[i] = sc.nextInt();
			}
			int[] count = new int[1001];
			for(int dish:dishes) {
				count[dish]++;
			}
			int maxCount = 0;
			int chosenDish = -1;
			for(int i=0; i<1001; i++) {
				if(count[i]>maxCount) {
					maxCount = count[i];
					chosenDish = i;
				}
			}
			System.out.println("Output:"+chosenDish);
		}
	}
}
		
		/*Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of dishes
            int[] dishes = new int[N];
            for (int i = 0; i < N; i++) {
                dishes[i] = scanner.nextInt();
            }
            int[] count = new int[1001];
            for (int dish : dishes) {
                count[dish]++;
            }
            int maxCount = 0;
            int chosenDish = -1;
            for (int i = 0; i < 1001; i++) {
                if (count[i] > maxCount) {
                    maxCount = count[i];
                    chosenDish = i;
                }
            }
            System.out.println(chosenDish);
        }
	}

}*/
