package X;

/* renamed from: X.CiE  reason: case insensitive filesystem */
public class C25574CiE {
    public DFL A00;
    public E8A A01;
    public E8A A02;
    public String A03;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.CiE, java.lang.Object] */
    public static DFL A00(E9W e9w) {
        String valueOf;
        C25574CiE ciE;
        ? obj = new Object();
        if (e9w.CBO() != AnonymousClass00R.A0C) {
            e9w.CNS();
            ciE = null;
        } else {
            while (e9w.BkN() != AnonymousClass00R.A0N) {
                int A002 = CCB.A00(e9w.CBN());
                e9w.BkN();
                if (35 == A002) {
                    obj.A00 = C25338Cdx.A01((C24948CQy) null, e9w);
                } else if (33 == A002) {
                    C28595E9m CBP = e9w.CBP();
                    Integer CBO = e9w.CBO();
                    int intValue = CBO.intValue();
                    if (intValue == 7) {
                        valueOf = String.valueOf(CBP.Bid());
                    } else if (intValue == 5) {
                        valueOf = CBP.COi();
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Bloks id only supports long and String types but got: ");
                        throw new AnonymousClass9HX(AnonymousClass000.A0y(CCA.A00(CBO), A10));
                    }
                    obj.A03 = valueOf;
                } else if (38 == A002) {
                    obj.A02 = CCI.A00((E9O) null, e9w.CBP());
                } else if (43 == A002) {
                    obj.A01 = CCI.A00((E9O) null, e9w.CBP());
                }
                e9w.CNS();
            }
            ciE = obj;
        }
        DFL dfl = ciE.A00;
        if (dfl != null) {
            DFL dfl2 = new DFL(dfl, ciE);
            ciE.A00 = null;
            return dfl2;
        }
        throw new AnonymousClass9HX("Shadow component should never be a leaf node");
    }
}
