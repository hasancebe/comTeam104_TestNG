package utilities;

public class ReusableMethods {
public static void wait(int a)  {
    try {
        Thread.sleep(a*1000);
    } catch (InterruptedException e) {

    }

}
}
