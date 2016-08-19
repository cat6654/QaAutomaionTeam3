package group_hometasks.task1.part3_5;

/**
 * Created by adombrovskiy on 8/8/2016.
 */
public class Sum_V1 extends InputOperations {
    public static void main(String[] args){
        String rawInput = inputData();
        CalculateSum(rawInput);
    }

    public static void CalculateSum(String input){
        Sum_V1 sum = new Sum_V1();
        sum.ProcessInput(input);
    }

    public void ProcessInput(String input){
        String[] sumElementsString = input.split(";");
        int Sum = 0;
        for (int element = 0; element < sumElementsString.length; element++)
        {
            try {
                Sum = Sum + Integer.parseInt(sumElementsString[element]);
            } catch (NumberFormatException e) {
                System.out.println("Wrong data. Check your string format: Integers divided by single ';'");
                System.exit(1);
            }
        }
        System.out.println("Sum is: " + Sum);
        }

}
