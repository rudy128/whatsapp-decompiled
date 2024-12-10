package X;

public final class CW4 {
    public final Object A00;
    public final C16300s2 A01;
    public final CW4 A02;

    public final boolean A00() {
        if (this.A01.getValue() != this.A00) {
            return true;
        }
        CW4 cw4 = this.A02;
        if (cw4 == null || !cw4.A00()) {
            return false;
        }
        return true;
    }

    public CW4(C16300s2 r2, CW4 cw4) {
        this.A01 = r2;
        this.A02 = cw4;
        this.A00 = r2.getValue();
    }
}
