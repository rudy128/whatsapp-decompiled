package X;

/* renamed from: X.4sO  reason: invalid class name and case insensitive filesystem */
public class C99174sO implements C18080vj, C22821Di {
    public final int A00;
    public final long A01;

    public C99174sO(long j, int i) {
        this.A00 = i;
        this.A01 = j;
    }

    public final Object invoke(Object obj) {
        if (this.A00 != 0) {
            long j = this.A01;
            if (AnonymousClass000.A1Y(obj)) {
                j = 0;
            }
            return Long.valueOf(j);
        }
        long j2 = this.A01;
        if (obj == null) {
            j2 = 0;
        }
        return Long.valueOf(j2);
    }
}
