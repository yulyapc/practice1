package interfaces.segregation;

public class SmartCamera implements IAdvancedCamera {
    @Override
    public void detectMovement() {
        System.out.println("Movement detected");
    }

    @Override
    public void termalDetection() {
        System.out.println("Thermal detection");
    }

    @Override
    public void faceRecognition() {
        System.out.println("Face recognized");
    }

    @Override
    public void zoomIn() {
        System.out.println("Zoom in");
    }

    @Override
    public void takePhoto() {
        System.out.println("Take a photo");
    }

    @Override
    public void recorVideo() {
        System.out.println("Record video");
    }
}
