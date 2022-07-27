import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Sum of nums
        int sum_of_nums = sum(74, 36);
        System.out.println("Sum: " + sum_of_nums);

//        Different operations (Sum, Subtraction, Division, Multiplication, Mod)
        System.out.println("=========================================================================================");
        different_ops(125, 24);

//        Testing array
        int[] test_arr = new int[]{3, 1, 1, 2, 2};

//        Sum of array
        System.out.println("=========================================================================================");
        System.out.println(sumOfElemsInArray(test_arr));


//        Operations
        System.out.println("=========================================================================================");
        randomOperations();

    }


    public static void different_ops(int first_num, int second_num) {
        int sum_of_numbers = sum(first_num, second_num);
        System.out.println(sum_of_numbers);

        int diff_of_numbers = subtraction(first_num, second_num);
        System.out.println(diff_of_numbers);

        int multiplication_of_numbers = multiplication(first_num, second_num);
        System.out.println(multiplication_of_numbers);

        int division_of_numbers = division(first_num, second_num);
        System.out.println(division_of_numbers);

        int mod_of_numbers = mod(first_num, second_num);
        System.out.println(mod_of_numbers);
    }

    public static int sum(int first_num, int second_num) {
        return first_num + second_num;
    }

    public static int subtraction(int first_num, int second_num) {
        return first_num - second_num;
    }

    public static int multiplication(int first_num, int second_num) {
        return first_num * second_num;
    }

    public static int division(int first_num, int second_num) {
        return first_num / second_num;
    }

    public static int mod(int first_num, int second_num) {
        return first_num % second_num;
    }

    public static int sumOfElemsInArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        return sum;
    }

//    a. -5 + 8 * 6
//            b. (55+9) % 9
//    c. 20 + -3*5 / 8
//    d. 5 + 15 / 3 * 2 - 8 % 3

    public static void randomOperations() {
//        {3, 1, 1, 2, 2}
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }


} 
