package X;

/* renamed from: X.CsS  reason: case insensitive filesystem */
public class C26108CsS {
    public int A00;
    public final int A01;
    public final C26299CxC A02;

    public static Object A00(C26108CsS csS, int i) {
        int i2 = csS.A00;
        boolean z = true;
        if (AnonymousClass000.A1S(i2, -1)) {
            if (i >= i2) {
                z = false;
            }
            C25344Ce3.A01(z, "invalid instr stack argument");
            return csS.A02.A05[csS.A01 + i];
        }
        throw AnonymousClass000.A0n("InstrStackArgs is not initialized");
    }

    public static void A01(C26108CsS csS, Object obj) {
        int i = csS.A00;
        if (AnonymousClass000.A1S(i, -1)) {
            C26299CxC cxC = csS.A02;
            cxC.A0T(i);
            C26299CxC.A0H(cxC, obj);
            csS.A00 = -1;
            return;
        }
        throw AnonymousClass000.A0n("InstrStackArgs is not initialized");
    }

    public static boolean A02(double d) {
        double floor;
        if (d < 0.0d) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        return AnonymousClass000.A1P((floor > d ? 1 : (floor == d ? 0 : -1)));
    }

    public C26108CsS(C26299CxC cxC, int i) {
        int i2;
        this.A02 = cxC;
        this.A00 = i;
        if (i > 0) {
            i2 = (cxC.A01 - 1) - (i - 1);
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }
}
