package day18;

public class Task1 {
    public static void main(String[] args) {
        int [] array = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        arraySum(array, 0);
    }

        public static int arraySum(int[] numbers, int i ) {
        if (i == numbers.length)
            return 0;

        return numbers[i] + arraySum(numbers, i + 1);

    }

//    public static void arraySum(int[] numbers) {
//        int sum = 0;
//        for (int foreachvar: numbers
//             ) { sum += foreachvar;
//
//        }
//        System.out.println(sum);
//    }


}
