package NUM8.Command;

/* Класс удаленного управления со своими кнопками */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        System.out.println("Pressing the button");
        command.execute();
    }
}
