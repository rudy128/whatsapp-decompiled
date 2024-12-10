package X;

/* renamed from: X.17h  reason: invalid class name and case insensitive filesystem */
public class C217617h implements C201911e {
    public final int A00;
    public volatile Object A01;

    public Object get() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = C221618v.A01(this.A00);
                }
            }
        }
        return this.A01;
    }

    public C217617h(int i) {
        this.A00 = i;
    }
}
