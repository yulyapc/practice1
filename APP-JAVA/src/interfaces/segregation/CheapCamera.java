package interfaces.segregation;

public class CheapCamera implements IPhotoCamera, IVideoCamera {
    @Override
    public void takePhoto() {
        System.out.println("Take a photo");
    }

    @Override
    public void recorVideo() {
        System.out.println("Record video");
    }
}