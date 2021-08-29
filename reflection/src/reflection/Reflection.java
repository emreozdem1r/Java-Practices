package reflection;

public class Reflection {

    private String field;

    public Reflection() {
        this.field = "Reflection demo constructor";
    }

    public void methodWithNoArgument() {
        System.out.println("methodWithNoArgument() is invoked");
    }

    public void methodWithAnArgument(int var) {
        System.out.println("methodWithAnArgument() is invoked with " + var + " parameter");
    }

    private void privateMethod() {
        System.out.println("privateMethod() is invoked");
    }

}
