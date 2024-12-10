package X;

/* renamed from: X.CVj  reason: case insensitive filesystem */
public class C25055CVj {
    public final long A00;
    public final long A01;

    public C25055CVj(long j, long j2) {
        if (j2 == 0) {
            this.A00 = 1;
            return;
        }
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append("/");
        return C17880vN.A0u(A10, this.A00);
    }
}
