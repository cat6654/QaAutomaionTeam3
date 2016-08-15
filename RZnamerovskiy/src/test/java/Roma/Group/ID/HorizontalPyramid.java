package Roma.Group.ID;

/**
 * Created by rznamerovskiy on 8/15/2016.
 */
public class HorizontalPyramid {
    public static void main(String args[]){
        int givenNumber = Integer.parseInt(args[0]);
        int numberOfSpaces = givenNumber;
        int numberOfAsteriskInRow = 1;
        for(int i = 0; i < givenNumber; i++){
            for(int a = numberOfSpaces; a > 0; a--) {
                System.out.print(" ");
                }
            for(int b = numberOfAsteriskInRow; b > 0; b--){
                System.out.print("*");
            }
            numberOfSpaces--;
            numberOfAsteriskInRow+=2;
            System.out.println();
        }
    }
}
