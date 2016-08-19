package group_hometasks.task1.part1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by adombrovskiy on 8/5/2016.
 */
public abstract class pyramid {

    public static int inputHeight(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String heightRaw = null;
        boolean wrongData;
        int height = 0;
        do {
            wrongData = false;
            try {
                System.out.print("Please input pyramid height : ");
                heightRaw = reader.readLine();
            } catch (IOException e) {
                System.out.println("Something went wrong. Exception: ");
                e.printStackTrace();
                wrongData = true;
                continue;
            }
            System.out.println("You've entered : " + heightRaw);
            if(heightRaw==null){
                System.out.println("Please enter correct data");
                wrongData = true;
                continue;
            }

            try {
                height = Integer.parseInt(heightRaw);
                if(height<=0) {
                    wrongData = true;
                    System.out.println("Wrong data. Please input positive integer");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong data. Please input positive integer");
                wrongData = true;
            }
        }
        while (wrongData);

        return height;
    }

    abstract  public void drawPyramid(int height);
}
