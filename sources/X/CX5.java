package X;

public class CX5 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final boolean A05;

    public CX5(int i, int i2, int i3, long j, long j2, boolean z) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A00 = i3;
    }

    public String toString() {
        Object[] A1b = AnonymousClass3MW.A1b();
        C17890vO.A1L(A1b, this.A04);
        C17890vO.A1M(A1b, this.A03);
        String format = String.format("<S t=\"%d\" d=\"%d\"/>", A1b);
        if (this.A05) {
            return AnonymousClass000.A0y(" (p) ", AnonymousClass000.A11(format));
        }
        return format;
    }
}
