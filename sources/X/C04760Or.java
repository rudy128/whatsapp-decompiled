package X;

/* renamed from: X.0Or  reason: invalid class name and case insensitive filesystem */
public abstract class C04760Or {
    public static final AnonymousClass0VO A00(C26227CvJ cvJ, int i, int i2, int i3, long j, boolean z, boolean z2) {
        AnonymousClass0Jq r3;
        if (z) {
            r3 = null;
        } else {
            int A0G = AnonymousClass000.A0G(j);
            AnonymousClass0OV r5 = new AnonymousClass0OV(A01(cvJ, A0G), A0G, 1);
            int A0H = AnonymousClass000.A0H(j);
            r3 = new AnonymousClass0Jq(r5, new AnonymousClass0OV(A01(cvJ, A0H), A0H, 1), C26260Cw5.A05(j));
        }
        return new AnonymousClass0VO(new C04620Oc(cvJ, i, i2, i3), r3, z2);
    }

    public static final C24245By3 A01(C26227CvJ cvJ, int i) {
        if (A03(cvJ, i)) {
            return cvJ.A0Q(i);
        }
        return cvJ.A0P(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r5 != r3) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.C26227CvJ r4, int r5) {
        /*
            X.Ccg r0 = r4.A0N()
            X.DRu r0 = r0.A03()
            int r3 = r0.length()
            r2 = 1
            if (r3 == 0) goto L_0x0027
            int r1 = r4.A0E(r5)
            if (r5 == 0) goto L_0x001f
            int r0 = r5 + -1
            int r0 = r4.A0E(r0)
            if (r1 == r0) goto L_0x0028
            if (r5 == r3) goto L_0x0027
        L_0x001f:
            int r0 = r5 + 1
            int r0 = r4.A0E(r0)
            if (r1 == r0) goto L_0x0028
        L_0x0027:
            return r2
        L_0x0028:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04760Or.A03(X.CvJ, int):boolean");
    }
}
