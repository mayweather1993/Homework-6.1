package Factory;

/**
 * Created by Zver on 10.07.2017.
 */
public class RomeWatchMaker implements WatchCreator {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
