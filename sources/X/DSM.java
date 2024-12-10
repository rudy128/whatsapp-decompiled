package X;

public abstract class DSM implements Iterable {
    public final C19880zA iterableDelegate = C19890zB.A00;

    private Iterable getDelegate() {
        return (Iterable) this.iterableDelegate.A06(this);
    }

    public String toString() {
        return C26063Crd.toString(getDelegate());
    }
}
