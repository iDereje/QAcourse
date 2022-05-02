import java.util.Scanner;

public class WhileLoopExample {
	
    public static void main(String[] args) {

    int[] numbers = {2, 4, 6, 8, 10};
    int index = 0;
    while (index < numbers.length) {
        System.out.println(numbers[index]);
        index++;
    }
}

}
