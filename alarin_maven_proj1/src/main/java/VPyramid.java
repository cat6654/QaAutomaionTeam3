import com.sun.istack.internal.Nullable;
import sun.awt.SunHints;

/**
 * Created by alarin on 03.08.2016.
 */
public class VPyramid{

    public void ShowPyramidOne(int height){
        int counter = 0;
        int pick = (height + height);

        for(int i=0; i<=pick; i++)
        {
            if(counter <= height) {
                for (int n = 0; n < i; n++)
                    System.out.print("*");
                System.out.println();
                }
            else {
                for (int m = pick; m > i; m--)
                    System.out.print("*");
                System.out.println();
            }
            counter++;
        }
    }

    public void ShowPyramidTwo(int height){

    }
}
