package org.example.designpatterns;

interface Os{
    void spec();
}

class Android implements Os{
    @Override
    public void spec() {
        System.out.println("Android");
    }
}
class IOs implements Os{

    @Override
    public void spec() {
        System.out.println("iOS");
    }
}
class Windows implements Os{

    @Override
    public void spec() {
        System.out.println("Windows");
    }
}

class OSFactory{
    public static Os getInstance(String osName){
        if(osName.equals("Android")){
            return new Android();
        }else if(osName.equals("iOS")){
            return new IOs();
        }else{
            return new Windows();
        }
    }
}







public class FactoryPattern {
    public static void main(String[] args) {
        Os os = OSFactory.getInstance("Android");
    }
}
