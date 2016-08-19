package group_hometasks.task1.part1_2;

/**
 * Created by adombrovskiy on 8/5/2016.
 */
public class Vertical_Pyramid extends pyramid {
    public static void main (String[] args)
    {
        Vertical_Pyramid vertical_pyramid = new Vertical_Pyramid();
        int pyramidHeight = inputHeight();
        vertical_pyramid.drawPyramid(pyramidHeight);
    }

    public void drawPyramid(int height) {
        //draw left side and center
        for (int currentPyramidHeight=1;currentPyramidHeight<=height;currentPyramidHeight++){
            for (int starsCount=1;starsCount<=currentPyramidHeight;starsCount++)
                System.out.print("*");
            System.out.println();
        }
        //draw right side
        for (int currentPyramidHeight=height-1;currentPyramidHeight>=1;currentPyramidHeight--) {
            for (int starsCount = 1; starsCount <= currentPyramidHeight; starsCount++)
                System.out.print("*");
            System.out.println();
        }
    }

}
