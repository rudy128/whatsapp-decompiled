package X;

/* renamed from: X.Cvs  reason: case insensitive filesystem */
public abstract /* synthetic */ class C26252Cvs {
    public static float A02(C28644ECa eCa, int i) {
        return ((float) i) / eCa.BQU();
    }

    public static long A06(C28644ECa eCa, long j) {
        if (j == AnonymousClass0QG.A01) {
            return C26200CuV.A01;
        }
        long A0p = AnonymousClass001.A0p(eCa.CPF(AnonymousClass0QG.A02(j)), eCa.CPF(AnonymousClass0QG.A00(j)));
        long j2 = C26200CuV.A02;
        return A0p;
    }

    public static long A07(C28644ECa eCa, long j) {
        if (j == C26200CuV.A01) {
            return AnonymousClass0QG.A01;
        }
        long A0p = AnonymousClass001.A0p(eCa.CPQ(C26200CuV.A01(j)), eCa.CPQ(C26200CuV.A00(j)));
        long j2 = AnonymousClass0QG.A01;
        return A0p;
    }

    public static float A00(C28644ECa eCa, float f) {
        return f / eCa.BQU();
    }

    public static float A01(C28644ECa eCa, float f) {
        return f * eCa.BQU();
    }

    public static float A03(C28644ECa eCa, long j) {
        if (C26130Cst.A00(j) == 4294967296L) {
            return eCa.CPQ(eCa.CPE(j));
        }
        throw AnonymousClass000.A0n("Only Sp can convert to Px");
    }

    public static int A04(C28644ECa eCa, float f) {
        float CPQ = eCa.CPQ(f);
        if (Float.isInfinite(CPQ)) {
            return Integer.MAX_VALUE;
        }
        return C22339B3q.A01(CPQ);
    }

    public static long A05(C28644ECa eCa, float f) {
        return eCa.CPU(eCa.CPF(f));
    }
}
