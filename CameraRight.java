public class CameraRight implements Command{

    public Camera camera;


    public CameraRight(Camera camera){
        this.camera = camera;
    }

    public void execute(){
        camera.turnRight();
    }
}
