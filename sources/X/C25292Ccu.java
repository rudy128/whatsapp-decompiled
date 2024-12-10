package X;

/* renamed from: X.Ccu  reason: case insensitive filesystem */
public abstract /* synthetic */ class C25292Ccu {
    public static long A01(E8P e8p, float f) {
        float BRu;
        E79 A00;
        C25631CjH cjH = C25631CjH.A00;
        if (e8p.BRu() < 1.03f || AnonymousClass001.A1b(CE9.A00) || (A00 = cjH.A00(e8p.BRu())) == null) {
            BRu = f / e8p.BRu();
        } else {
            BRu = A00.BFt(f);
        }
        return C26054CrP.A01(BRu, 4294967296L);
    }

    public static float A00(E8P e8p, long j) {
        float f;
        if (C26130Cst.A00(j) == 4294967296L) {
            C25631CjH cjH = C25631CjH.A00;
            if (e8p.BRu() < 1.03f || AnonymousClass001.A1b(CE9.A00)) {
                f = AnonymousClass001.A01(j);
            } else {
                E79 A00 = cjH.A00(e8p.BRu());
                f = AnonymousClass001.A01(j);
                if (A00 != null) {
                    return A00.BFu(f);
                }
            }
            return f * e8p.BRu();
        }
        throw AnonymousClass000.A0n("Only Sp can convert to Px");
    }
}
