package X;

/* renamed from: X.0EY  reason: invalid class name */
public abstract class AnonymousClass0EY {
    public static final boolean A00(C17460uh r7, long j) {
        if (!((AnonymousClass0XW) r7).A03.A07) {
            return false;
        }
        AnonymousClass0BQ A0G = AnonymousClass0QV.A03(r7).A0G();
        if (!A0G.Be8()) {
            return false;
        }
        long j2 = A0G.A03;
        int A0G2 = AnonymousClass000.A0G(j2);
        int A0H = AnonymousClass000.A0H(j2);
        long Bhu = A0G.Bhu(AnonymousClass0QY.A03);
        float A01 = AnonymousClass0QY.A01(Bhu);
        float A02 = AnonymousClass0QY.A02(Bhu);
        float f = ((float) A0G2) + A01;
        float f2 = ((float) A0H) + A02;
        float A012 = AnonymousClass0QY.A01(j);
        if (A01 > A012 || A012 > f) {
            return false;
        }
        float A022 = AnonymousClass0QY.A02(j);
        if (A02 > A022 || A022 > f2) {
            return false;
        }
        return true;
    }
}
