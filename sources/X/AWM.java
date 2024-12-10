package X;

public class AWM implements C1600887b {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public AWM(AnonymousClass8F9 r1, int i, boolean z) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = z;
    }

    public final void BwF(Object obj) {
        A17 a17;
        int i;
        int i2 = this.A00;
        AnonymousClass8F9 r2 = (AnonymousClass8F9) this.A01;
        boolean z = this.A02;
        AF0 af0 = (AF0) obj;
        if (i2 == 0) {
            if (z) {
                a17 = r2.A0E;
                i = 8;
            }
            r2.A02 = af0;
            AnonymousClass3MX.A1K(r2.A0G, 6);
        } else if (z) {
            a17 = r2.A0E;
            i = 10;
        } else {
            return;
        }
        a17.A01(i);
        r2.A02 = af0;
        AnonymousClass3MX.A1K(r2.A0G, 6);
    }
}
