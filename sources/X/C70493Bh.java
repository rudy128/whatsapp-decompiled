package X;

/* renamed from: X.3Bh  reason: invalid class name and case insensitive filesystem */
public class C70493Bh implements Comparable {
    public int A00;
    public long A01;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C70493Bh r8 = (C70493Bh) obj;
        if (r8 == this) {
            return 0;
        }
        long j = (long) (this.A00 - r8.A00);
        if (j == 0) {
            j = this.A01 - r8.A01;
        }
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        A10.append(" ");
        return C17880vN.A0u(A10, this.A01);
    }
}
