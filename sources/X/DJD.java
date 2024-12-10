package X;

public final class DJD implements E5L {
    public static final E5L A02 = DJE.A00;
    public Object A00;
    public volatile E5L A01;

    public final Object CT0() {
        E5L e5l = this.A01;
        E5L e5l2 = A02;
        if (e5l != e5l2) {
            synchronized (this) {
                if (this.A01 != e5l2) {
                    Object CT0 = this.A01.CT0();
                    this.A00 = CT0;
                    this.A01 = e5l2;
                    return CT0;
                }
            }
        }
        return this.A00;
    }

    public final String toString() {
        Object obj = this.A01;
        if (obj == A02) {
            String valueOf = String.valueOf(this.A00);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("<supplier that returned ");
            A10.append(valueOf);
            obj = AnonymousClass000.A0y(">", A10);
        }
        return BEA.A0l("Suppliers.memoize(", String.valueOf(obj), AnonymousClass000.A10());
    }
}
