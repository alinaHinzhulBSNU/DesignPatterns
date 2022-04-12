package Proxy;

public class Demo {
    public static void main(String[] args) {
        Video video = new ProxyVideo("test.avi");

        video.play(); // завантажує і показує відео

        System.out.println();

        video.play(); // лише показує відео
    }
}
