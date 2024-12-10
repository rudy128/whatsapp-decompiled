package X;

/* renamed from: X.11f  reason: invalid class name and case insensitive filesystem */
public class C202011f implements C201911e {
    public final int A00;
    public volatile Object A01;

    public Object get() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = AnonymousClass12Q.A02(AnonymousClass114.A00(), this.A00);
                }
            }
        }
        return this.A01;
    }

    public C202011f(int i) {
        this.A00 = i;
    }
}
