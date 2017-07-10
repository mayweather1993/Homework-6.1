package Adapter;

/**
 * Created by Zver on 10.07.2017.
 */
public class Boy implements Drivable {
    @Override
    public void drive() {
        System.out.println("Boy can drive,but not well");
    }
}
