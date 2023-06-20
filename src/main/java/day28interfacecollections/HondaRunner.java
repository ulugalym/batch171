package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic=new Civic();
        myCivic.cool();
        myCivic.run();
        myCivic.eco();
        Engine.stop();
        Accord myAccord=new Accord();
        myAccord.cool();
        myAccord.run();
        myAccord.eco();

        System.out.println("AC Price: "+Ac.price);
        System.out.println("Engine price: "+Engine.price);
        System.out.println("Security.price: " + Security.price);
    }


}
