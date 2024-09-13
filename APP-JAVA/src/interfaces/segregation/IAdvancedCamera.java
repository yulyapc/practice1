package interfaces.segregation;

public interface IAdvancedCamera extends IPhotoCamera, IVideoCamera {
    void detectMovement() throws Exception;
    void termalDetection() throws Exception;
    void faceRecognition() throws Exception;
    void zoomIn();
}
