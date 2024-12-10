package X;

/* renamed from: X.CVv  reason: case insensitive filesystem */
public final class C25063CVv {
    public final E6C A00;
    public volatile Object A01;

    public Object A00() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = this.A00.get();
                }
            }
        }
        return this.A01;
    }

    public C25063CVv(E6C e6c) {
        this.A00 = e6c;
    }
}
