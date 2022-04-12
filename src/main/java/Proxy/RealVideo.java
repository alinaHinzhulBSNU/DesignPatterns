package Proxy;

public class RealVideo implements Video {
    private String path;

    public RealVideo(String path){
        this.path = path;
        this.load();
    }

    private void load(){
        System.out.println("Load video from disk...");
    }

    @Override
    public void play() {
        System.out.println("Display real video...");
    }
}
