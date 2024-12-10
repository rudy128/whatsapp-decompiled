package X;

/* renamed from: X.CnO  reason: case insensitive filesystem */
public abstract class C25860CnO {
    public static final C27069DRu A00(C26224CvE cvE) {
        C27069DRu dRu = cvE.A01;
        long j = cvE.A00;
        return dRu.subSequence(C26260Cw5.A02(j), C26260Cw5.A01(j));
    }

    public static final C27069DRu A01(C26224CvE cvE, int i) {
        C27069DRu dRu = cvE.A01;
        int A01 = C26260Cw5.A01(cvE.A00);
        return dRu.subSequence(A01, Math.min(A01 + i, dRu.A00.length()));
    }

    public static final C27069DRu A02(C26224CvE cvE, int i) {
        C27069DRu dRu = cvE.A01;
        int A02 = C26260Cw5.A02(cvE.A00);
        return dRu.subSequence(BE8.A04(A02, i), A02);
    }
}
