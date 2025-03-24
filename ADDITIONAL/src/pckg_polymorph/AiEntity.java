package pckg_polymorph;

public class AiEntity {

    private String modelName;

    public AiEntity(String modelName){
        this.modelName = modelName;
    }

    public void doSomethingIntelligent(int n1, int n2){
        System.out.println("Performing intelligent stuff...");
        System.out.println(n1+n2);
    }

    public void doSomethingIntelligent(int n1, int n2, String msg){
        System.out.println("In another way intelligent behaviour...");
        System.out.println(n1*n2);
        System.out.println("I can talk also..." + msg);
    }
}
