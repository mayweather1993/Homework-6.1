package Bridge;

/**
 * Created by Zver on 10.07.2017.
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void muteVolume(){
        System.out.println("Remote : mute");
        device.setVolume(0);
    }
}
