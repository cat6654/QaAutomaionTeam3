package group_hometasks.task1.part3_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by adombrovskiy on 8/8/2016.
 */
public abstract class InputOperations {
    public static String inputData(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rawInput = null;
        try {
            System.out.print("Please input your string: ");
                rawInput = reader.readLine();
        } catch (IOException e) {
            System.out.println("Something went wrong. Exception: ");
            e.printStackTrace();
        }
        System.out.println("You've entered: " + rawInput);
        if(rawInput==null || rawInput.isEmpty()) {
            System.out.println("String is empty. Can't process input");
            System.exit(1);
        }
        return rawInput;
    }

    abstract public void ProcessInput(String input);
}
