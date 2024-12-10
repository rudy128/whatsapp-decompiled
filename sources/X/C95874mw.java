package X;

/* renamed from: X.4mw  reason: invalid class name and case insensitive filesystem */
public class C95874mw implements C72243Le {
    public static final int A06 = Math.max(64, Math.min((int) ((C19620yd.A00 / 16) / 16384), 512));
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C95874mw(int i, int i2) {
        this(i, i2, 0);
    }

    public int BU0() {
        return this.A02;
    }

    public boolean C8B(int i, boolean z) {
        int i2 = this.A04;
        if (i2 != 0) {
            int i3 = this.A00 + 1;
            this.A00 = i3;
            int i4 = this.A01 + (z ? 1 : 0);
            this.A01 = i4;
            if (i3 > i2 || i4 > this.A05) {
                this.A02 = i;
                return false;
            }
        }
        return true;
    }

    public C95874mw(int i, int i2, int i3) {
        this.A04 = i != 1 ? i * 3072 : i2;
        this.A05 = A06 * i;
        this.A03 = i != 1 ? 0 : i3;
    }
}
