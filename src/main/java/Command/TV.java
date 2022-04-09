package Command;

public class TV {
    private int volume;
    private int channelNumber;

    public void on(){
        System.out.println("TV is on");
    }

    public void off(){
        System.out.println("TV is off");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void changeChannel(int channelNumber) {
        this.channelNumber = channelNumber;
    }
}