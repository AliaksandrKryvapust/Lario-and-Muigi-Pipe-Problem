import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int [] arr = new int[] {-1,4};
        System.out.println(Arrays.equals(pipeFix(arr), new int[]{-1, 0, 1, 2, 3, 4}));
    }
    public static int[] pipeFix(int[] numbers) {
        int [] result = new int[numbers[numbers.length-1]+1-numbers[0]];
        int temp = numbers[0];
        for (int i = 0; i < result.length; i++) {
            result[i]=temp++;
        }
        return result;
    }
}
