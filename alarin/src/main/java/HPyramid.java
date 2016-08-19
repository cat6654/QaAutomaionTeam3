/**
 * Created by alarin on 03.08.2016.
 */

public class HPyramid {

    public void ShowHPyramid(int height){


        for (int i = 0; i <=height; i++){

            // Adding spaces before start to draw
            for(int y = height; y>i; y--){
                System.out.print(" ");
            }

            // Draw the pyramid itself
            for (int n = 0; n <= i*2; n++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
