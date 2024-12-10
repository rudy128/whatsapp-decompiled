package X;

/* renamed from: X.Cpb  reason: case insensitive filesystem */
public final class C25969Cpb {
    public static final /* synthetic */ C25969Cpb A00 = new Object();

    public static final EBX A00(long j) {
        EBX ebx;
        if (j != C05100Qk.A05) {
            ebx = new D69(j);
        } else {
            ebx = D6B.A00;
        }
        return ebx;
    }

    public final EBX A01(C03380Hv r4, float f) {
        EBX d6a;
        if (r4 == null) {
            d6a = D6B.A00;
        } else if (r4 instanceof AnonymousClass09Y) {
            long j = ((AnonymousClass09Y) r4).A00;
            if (!Float.isNaN(f) && f < 1.0f) {
                j = AnonymousClass0Oy.A03(AnonymousClass001.A11(j), C05100Qk.A04(j), C05100Qk.A03(j), C05100Qk.A02(j), C05100Qk.A01(j) * f);
            }
            return A00(j);
        } else if (r4 instanceof C016009d) {
            d6a = new D6A((C016009d) r4, f);
        } else {
            throw AnonymousClass3MW.A14();
        }
        return d6a;
    }
}
