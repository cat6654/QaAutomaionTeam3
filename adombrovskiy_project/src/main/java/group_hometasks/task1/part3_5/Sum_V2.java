package group_hometasks.task1.part3_5;

/**
 * Created by adombrovskiy on 8/10/2016.
 */
public class Sum_V2 extends InputOperations {
    public static void main(String[] args){
        String rawInput = inputData();
        CalculateSum(rawInput);
    }

    public static void CalculateSum(String input){
        Sum_V2 sum = new Sum_V2();
        sum.ProcessInput(input);
    }

    public void ProcessInput(String input){
        char[] sumElements = input.toCharArray();
        int Sum = 0;
        int elementsCount =0;
        for (char element : sumElements)
        {
            if(Character.isDigit(element)){
                Sum = Sum + Character.getNumericValue(element);
                elementsCount++;
            }
        }
        if(elementsCount==0)
            System.out.println("You haven't entered single integer. Impossible to calculate a sum.");
        else
            System.out.println("Sum is: " + Sum);
    }
}
