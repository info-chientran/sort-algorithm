import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner scanner = new Scanner(System.in);

        SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        SortAlgorithm quickSortAlgorithm = new QuicksortAlgorithm();

        VeryComplexService business = new VeryComplexService(bubbleSortAlgorithm);

        System.out.println("Nhập phần tử trong mảng: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        business.complexBusiness(arr);
        System.out.println(business);
    }
}
