package X;

/* renamed from: X.Cd4  reason: case insensitive filesystem */
public abstract class C25300Cd4 {
    public static final float A00(C0B c0b) {
        C24516C7k c7k = C24516C7k.$redex_init_class;
        switch (c0b.ordinal()) {
            case 0:
            case 4:
            case 7:
                return 1.0f;
            case 1:
            case 2:
            case 5:
            case 6:
                return 0.75f;
            default:
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Encountered unsupported CDS bottom sheet style: ");
                A10.append(c0b);
                throw BE6.A0v(C17890vO.A0c(A10, '.'));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 11002) == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.BEZ r5, X.D3P r6, X.D8F r7) {
        /*
            android.content.Context r3 = r5.getContext()
            X.C18070vi.A0X(r3)
            if (r6 == 0) goto L_0x0017
            int r4 = r6.A01
            int r3 = r6.A03
            int r2 = r6.A02
            int r1 = r6.A00
            android.widget.FrameLayout r0 = r5.A04
            r0.setPadding(r4, r3, r2, r1)
            return
        L_0x0017:
            X.C05 r1 = r7.A0A
            X.C05 r0 = X.C05.TOP_ROUNDED
            if (r1 != r0) goto L_0x0042
            boolean r0 = X.CCK.A00()
            if (r0 == 0) goto L_0x0042
            X.CMC r0 = X.C24454C4u.A00
            if (r0 == 0) goto L_0x0035
            X.0ve r2 = r0.A00
            r1 = 11002(0x2afa, float:1.5417E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1082130432(0x40800000, float:4.0)
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            float r0 = X.C24515C7j.A00(r3, r0)
            int r2 = (int) r0
            r1 = 0
            android.widget.FrameLayout r0 = r5.A04
            r0.setPadding(r1, r2, r1, r1)
            return
        L_0x0042:
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = X.C24515C7j.A00(r3, r0)
            int r1 = (int) r0
            android.widget.FrameLayout r0 = r5.A04
            r0.setPadding(r1, r1, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25300Cd4.A01(X.BEZ, X.D3P, X.D8F):void");
    }
}
