package Roma.Group.ID;


/**
 * Created by rznamerovskiy on 8/15/2016.
 */
class Vpyramid {
    public static void main(String args[]) {
        int firstArg;
        int numberOfAsterisksOnRow = 1;

        for(firstArg = Integer.parseInt(args[0]); firstArg>0; firstArg --){
            for(int i = numberOfAsterisksOnRow; i > 0; i --) {
                System.out.print("*");
            }
           System.out.println();
            numberOfAsterisksOnRow ++;
        }

        for(firstArg = (Integer.parseInt(args[0]) - 1); firstArg>0; firstArg --){
            for(int i = firstArg; i > 0; i --) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
