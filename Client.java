public class Client {

    public static void main(String[] args) {
        Camera c1 = new Camera();

        Command left = new CameraLeft(c1);
        Command right = new CameraRight(c1);


        CameraControl control = new CameraControl();

        control.selectDirection(right);
        control.pressButton();

        control.selectDirection(left);
        control.pressButton();


    }
}
