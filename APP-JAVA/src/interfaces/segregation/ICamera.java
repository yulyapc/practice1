package interfaces.segregation;

public interface ICamera {
    void detectMovement() throws Exception;
    void termalDetection() throws Exception;
    void faceRecognition() throws Exception;
    void zoomIn();
    void takePhoto();
    void recorVideo();
}
