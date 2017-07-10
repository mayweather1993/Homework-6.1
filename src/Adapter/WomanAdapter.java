package Adapter;

/**
 * Created by Zver on 10.07.2017.
 */
public class WomanAdapter implements Drivable {
    Woman woman;

    public WomanAdapter(Woman woman) {
        this.woman = woman;
    }

    @Override
    public void drive() {
        woman.womanAlmostDriving();
    }

    @Override
    public String toString() {
        return "Lets teach woman to drive";
    }
}
