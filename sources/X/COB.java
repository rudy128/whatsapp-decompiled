package X;

public final class COB {
    public final Object A00;
    public final Runnable A01;

    public COB(Runnable runnable, Object obj) {
        this.A00 = obj;
        this.A01 = runnable;
    }
}
