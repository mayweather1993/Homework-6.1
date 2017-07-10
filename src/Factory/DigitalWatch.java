package Factory;

import java.util.Date;

/**
 * Created by Zver on 10.07.2017.
 */
public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
