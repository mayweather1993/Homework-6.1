package Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zver on 10.07.2017.
 */
public class UsingPrototype {
    public static void main(String[] args) {
        List<String> componentParts = new ArrayList<>();
        componentParts.add("Engine");
        componentParts.add("Tires");
        componentParts.add("Electronic");
        BmwCarProject M5 = new BmwCarProject("BMW m5 2018 year edition", 777, "SportCar", componentParts);
        BmwCarProject cloneM5 = (BmwCarProject) M5.copy();
        System.out.println(M5);
        System.out.println(cloneM5);

    }
}
