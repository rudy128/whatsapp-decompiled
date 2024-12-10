package X;

@Deprecated
public abstract class CLH {
    public final Object A00;

    public CLH(Object obj) {
        C25504Ch2 ch2;
        this.A00 = obj;
        synchronized (C25504Ch2.class) {
            ch2 = C25504Ch2.A01;
        }
        ch2.A00.A00.add(this);
    }
}
