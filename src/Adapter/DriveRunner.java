package Adapter;

/**
 * Created by Zver on 10.07.2017.
 */
public class DriveRunner {
    public static void main(String[] args) {
        Man Edward = new Man();
        Boy Chris = new Boy();
        Woman Melania = new Woman();

        WomanAdapter MelaniaAdapter = new WomanAdapter(Melania);
        Edward.drive();
        Chris.drive();
        MelaniaAdapter.drive();
    }
}
