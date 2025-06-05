import java.util.Scanner;

public class one {
    static int search(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;
        int ans = right;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (arr[mid] >= k) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(search(arr, k));
        sc.close();
    }
}
