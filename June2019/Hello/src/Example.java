public class Example {
    public static void main(String[] args) {
        int arr[] = new int [5];
        arr[0] = 1;
        arr[1] = arr[0] + 4;
        arr[2] = (arr[1] / arr[0]) % 5;
        System.out.println(arr[3]);
        arr[3] = arr[3] - 2;
        int l = arr.length;
        System.out.println();
    }

    public int add(int a, int b) {
        return a + b;
    }
}