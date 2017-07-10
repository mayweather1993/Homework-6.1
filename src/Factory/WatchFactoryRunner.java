package Factory;

/**
 * Created by Zver on 10.07.2017.
 */
public class WatchFactoryRunner {
    public static void main(String[] args) {
        WatchCreator creatorRome = getCreatorByName("Rome");
        Watch romeWatch = creatorRome.createWatch();
        romeWatch.showTime();
        WatchCreator creatorDigital = getCreatorByName("Digital");
        Watch digitalWatch = creatorDigital.createWatch();
        digitalWatch.showTime();
        WatchCreator unknownWatch = getCreatorByName("Toshiba");
        Watch toshibaWatch = unknownWatch.createWatch();
        toshibaWatch.showTime();
    }

    public static WatchCreator getCreatorByName(String creator) {
        if (creator.equals("Digital"))
            return new DigitalWatchMaker();
        else if (creator.equals("Rome"))
            return new RomeWatchMaker();
        else {
            throw new RuntimeException("Cant find your watch " + creator);
        }
    }
}
