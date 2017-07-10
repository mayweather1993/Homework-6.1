package Factory;

/**
 * Created by Zver on 10.07.2017.
 */
public class DigitalWatchMaker implements WatchCreator {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
