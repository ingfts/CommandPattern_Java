public class CameraLeft implements Command{
    public Camera camera;


    public CameraLeft(Camera camera){
        this.camera = camera;

    }

    public void execute(){
        camera.turnLeft();
    }
}
