package interfaces.segregation;

import java.nio.file.NotLinkException;

public class CheapCamera implements ICamera {
    @Override
    public void detectMovement() throws Exception {
        throw new Exception("Function not implemented");
    }

    @Override
    public void termalDetection() throws Exception {
        throw new Exception("Function not implemented");
    }

    @Override
    public void faceRecognition() throws Exception {
        throw new Exception("Function not implemented");
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
