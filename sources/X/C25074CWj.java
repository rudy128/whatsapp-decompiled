package X;

/* renamed from: X.CWj  reason: case insensitive filesystem */
public final class C25074CWj {
    public int A00;
    public int A01;
    public int A02;
    public final Object[] A03 = new Object[32];

    public final synchronized Object A00() {
        Object obj;
        int i = this.A01;
        if (i > 0) {
            Object[] objArr = this.A03;
            int i2 = this.A02;
            obj = objArr[i2];
            objArr[i2] = null;
            this.A02 = (i2 + 1) % 32;
            this.A01 = i - 1;
        } else {
            throw AnonymousClass000.A0n("Check failed.");
        }
        return obj;
    }
}
