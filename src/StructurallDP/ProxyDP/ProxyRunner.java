package StructurallDP.ProxyDP;

public class ProxyRunner {
    public static void main(String[] args) {
        ProxyClass proxyClass1=new ProxyClass("c://resim1.png");
        ProxyClass proxyClass2=new ProxyClass("c://resim2.png");
        proxyClass2.showImage();
        proxyClass1.showImage();


    }
}
