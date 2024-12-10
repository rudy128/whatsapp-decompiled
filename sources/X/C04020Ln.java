package X;

/* renamed from: X.0Ln  reason: invalid class name and case insensitive filesystem */
public abstract class C04020Ln {
    public static final AnonymousClass0Tx A00 = new AnonymousClass0Tx(C02980Gd.A02, 15, 0);

    public static final AnonymousClass07P A00(C17130tn r4, float f, int i) {
        boolean z = false;
        long j = 0;
        r4.COB(1635163520);
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = C05100Qk.A05;
        }
        C17330uU A002 = AnonymousClass0Ou.A00(r4, j);
        boolean A1Y = AnonymousClass001.A1Y(r4, Boolean.valueOf(z), DSH.A00(f));
        Object CER = r4.CER();
        if (A1Y || CER == AnonymousClass0MH.A00) {
            CER = new AnonymousClass0UE(A002, f, z);
            r4.CRH(CER);
        }
        AnonymousClass0VR r42 = (AnonymousClass0VR) r4;
        AnonymousClass0VR.A0R(r42, false);
        AnonymousClass07P r1 = (AnonymousClass07P) CER;
        AnonymousClass0VR.A0R(r42, false);
        return r1;
    }
}
