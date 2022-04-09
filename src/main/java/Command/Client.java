package Command;

public class Client { // Клієнт
    public static void main(String[] args) {
        // Ініціатор
        RemoteControl remoteControl = new RemoteControl();

        // Отримувачі
        Light light = new Light();
        TV tv = new TV();
        SecurityControl securityControl = new SecurityControl();

        // Команди
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);

        SecurityControlOnCommand securityControlOn = new SecurityControlOnCommand(securityControl);
        SecurityControlOffCommand securityControlOff = new SecurityControlOffCommand(securityControl);

        // Наповнення пульту дистанційного управління кнопками
        remoteControl.setCommand(lightOn);
        remoteControl.setCommand(lightOff);

        remoteControl.setCommand(tvOn);
        remoteControl.setCommand(tvOff);

        remoteControl.setCommand(securityControlOn);
        remoteControl.setCommand(securityControlOff);

        // Тестування
        remoteControl.pressButton(2); // вимкнути світло
        remoteControl.pressButton(5); // увімкнути сигналізацію
    }
}