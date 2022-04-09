package Command;

public class SecurityControl {
    private boolean isActivated;

    public void arm(){
        this.isActivated = true;
        System.out.println("Security control is on");
    }

    public void disarm(){
        this.isActivated = false;
        System.out.println("Security control is off");
    }
}
