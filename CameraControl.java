public class CameraControl {

    public Command command;

    public void selectDirection (Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
