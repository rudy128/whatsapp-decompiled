package X;

/* renamed from: X.6nZ  reason: invalid class name and case insensitive filesystem */
public final class C132776nZ {
    public long A00;
    public AnonymousClass8B2 A01;
    public int A02 = -1;
    public final int A03;
    public final C160878Ah A04;

    public C132776nZ(C160878Ah r2, int i) {
        C18070vi.A0d(r2, 1);
        this.A04 = r2;
        this.A03 = i;
    }

    public final boolean A00() {
        int i = this.A02;
        C160878Ah r1 = this.A04;
        if (i >= r1.getCount() - 1) {
            return false;
        }
        int i2 = this.A02 + 1;
        this.A02 = i2;
        AnonymousClass8B2 BUY = r1.BUY(i2);
        this.A01 = BUY;
        if (BUY != null) {
            this.A00 = BUY.BQH();
        }
        return true;
    }
}
