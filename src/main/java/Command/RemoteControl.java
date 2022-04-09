package Command;

import java.util.ArrayList;

public class RemoteControl {
    private ArrayList<Command> slots;

    public RemoteControl(){
        this.slots = new ArrayList<Command>();
    }

    public void setCommand(Command command){
        this.slots.add(command);
    }

    public void pressButton(int buttonNumber){
        if(0 < buttonNumber && buttonNumber <= this.slots.size()) {
            slots.get(buttonNumber - 1).execute();
        }
    }
}