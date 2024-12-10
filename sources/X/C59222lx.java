package X;

/* renamed from: X.2lx  reason: invalid class name and case insensitive filesystem */
public class C59222lx {
    public final int A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C59222lx)) {
            return false;
        }
        C59222lx r7 = (C59222lx) obj;
        if (this.A02.equals(r7.A02) && this.A00 == r7.A00 && this.A01 == r7.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int A03 = C17880vN.A03(this.A02);
        int i = this.A00;
        return AnonymousClass001.A0J(this.A01, (A03 + (i ^ (i >>> 32))) * 31);
    }

    public C59222lx(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A02);
        A10.append(":");
        A10.append(this.A00);
        A10.append(":");
        A10.append(this.A01);
        return AnonymousClass000.A0y(";", A10);
    }
}
