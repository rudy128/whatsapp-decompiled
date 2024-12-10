package X;

/* renamed from: X.3Cy  reason: invalid class name and case insensitive filesystem */
public abstract class C70903Cy implements Runnable, Comparable, AnonymousClass1OI, AnonymousClass3KX {
    public int A00;
    public long A01;
    public volatile Object _heap;

    public final void dispose() {
        AnonymousClass3JX r3;
        synchronized (this) {
            Object obj = this._heap;
            AnonymousClass1I8 r2 = AnonymousClass2WX.A01;
            if (obj != r2) {
                if ((obj instanceof AnonymousClass3JX) && (r3 = (AnonymousClass3JX) obj) != null) {
                    synchronized (r3) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C63532tG) && ((C63532tG) obj2) != null) {
                            r3.A02(this.A00);
                        }
                    }
                }
                this._heap = r2;
            }
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.A01 - ((C70903Cy) obj).A01;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Delayed[nanos=");
        A10.append(this.A01);
        return C17890vO.A0c(A10, ']');
    }
}
