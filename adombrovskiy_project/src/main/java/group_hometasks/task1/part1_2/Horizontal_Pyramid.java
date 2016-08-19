package group_hometasks.task1.part1_2;

/**
 * Created by adombrovskiy on 8/5/2016.
 */
public class Horizontal_Pyramid extends pyramid {
    public static void main (String[] args)
    {
        Horizontal_Pyramid horizontal_pyramid = new Horizontal_Pyramid();

        int pyramidHeight = inputHeight();

        horizontal_pyramid.drawPyramid(pyramidHeight);
    }

    public void drawPyramid(int height) {

        int maxPyramidWidth = height*2-1;
        System.out.println("max width "+ maxPyramidWidth);
        for (int currentHeight = 1; currentHeight <= height; currentHeight++) {
            //calculating current level data
            int currentWidth = currentHeight*2-1;
            int currentIndent;
            if(maxPyramidWidth!=currentHeight)
                currentIndent = (maxPyramidWidth-currentWidth)/2;
            else
                currentIndent =0;

            //drawing left indent
            for (int spacesCount = 0; spacesCount < currentIndent; spacesCount++)
                    System.out.print(" ");

            //drawing pyramid at current height
            for (int starsCount = 1; starsCount <= currentWidth; starsCount++)
                System.out.print("*");

            //drawing right indent
            for (int spacesCount = 0; spacesCount < currentIndent; spacesCount++)
                System.out.print(" ");

            System.out.println();
        }
    }

}

