package X;

/* renamed from: X.ATe  reason: case insensitive filesystem */
public class C20646ATe implements C22508BAp {
    public final C20079A6f A00;
    public final /* synthetic */ C20653ATl A01;

    public C20646ATe(C20079A6f a6f, C20653ATl aTl) {
        this.A01 = aTl;
        this.A00 = a6f;
    }

    public void BtA(C190599lD r2, int i) {
        BAY bay = this.A01.A08;
        if (bay != null) {
            bay.Bmz(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C195699tl r6 = (C195699tl) obj;
        C20653ATl aTl = this.A01;
        if (aTl.A08 != null) {
            C20079A6f a6f = this.A00;
            if (a6f != null) {
                AnonymousClass1XN r1 = aTl.A0N;
                if (r1.A02()) {
                    if (C18020vd.A05(C18040vf.A02, r1.A03, 3400)) {
                        C196579vI.A01(a6f, r6.A09);
                    }
                }
            }
            aTl.A08.Bn0(r6);
        }
    }
}
