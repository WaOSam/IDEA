import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Sam_T
 * @Description
 * @date 2020-03-22 16:31
 */
public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

//        long time = 1000 * 60 * 60 * 24 * 10;
        long time = 1;

        System.out.println(new Date(time));
        System.out.println(new SimpleDateFormat("dd hh:mm:ss").format(new Date(time)));

    }
}
