package generic;

public class TestGeneric<T> {

    T obj;

    public TestGeneric(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }


}
