package Proxy;

public class ProxyVideo implements Video {
    private RealVideo realVideo;
    private String path;

    public ProxyVideo(String path){
        this.path = path;
    }

    @Override
    public void play() {
        if(realVideo == null){
            realVideo = new RealVideo(path);
        }
        realVideo.play();
    }
}
