package X;

/* renamed from: X.DDo  reason: case insensitive filesystem */
public class C26782DDo implements E98, E8l, C28496E4b {
    public int A00;
    public int A01;
    public final DE1 A02 = new Object();
    public final C28593E9i A03;
    public final C26246Cvk A04;
    public final float[] A05 = new float[16];
    public final boolean A06;

    public void Bd8(C26045Cr9 cr9) {
    }

    public void release() {
    }

    public void BCi(EAJ eaj) {
        C28593E9i e9i;
        int i;
        C22835BRn bRn;
        int i2;
        DE1 de1 = this.A02;
        if (de1.A04 == null) {
            if (this.A06) {
                C22835BRn bRn2 = new C22835BRn();
                de1.A04 = bRn2;
                e9i = this.A03;
                i = bRn2.A00.A00;
                bRn = bRn2;
            } else {
                e9i = this.A03;
                C25008CTi cTi = new C25008CTi("SurfaceInput");
                cTi.A02 = 36197;
                CZB czb = new CZB(cTi);
                de1.A04 = czb;
                i = czb.A00;
                bRn = czb;
            }
            e9i.C8X(i);
            int i3 = this.A01;
            if (i3 > 0 && (i2 = this.A00) > 0) {
                bRn.A00(i3, i2);
            }
        }
    }

    public void BIY() {
        DE1 de1 = this.A02;
        CZB czb = de1.A04;
        if (czb != null) {
            czb.A01();
            de1.A04 = null;
        }
        this.A03.C8Y();
    }

    public EA3 BRy() {
        try {
            C28593E9i e9i = this.A03;
            e9i.CRQ();
            float[] fArr = this.A05;
            e9i.Bak(fArr);
            C26246Cvk cvk = this.A04;
            cvk.A09(fArr);
            DE1 de1 = this.A02;
            de1.A00(fArr);
            de1.A05 = cvk.A06();
            de1.A03 = e9i.BaR();
        } catch (RuntimeException unused) {
        }
        return this.A02;
    }

    public /* synthetic */ int BT4() {
        return 0;
    }

    public void CJe(C28497E4c e4c) {
        this.A03.CJe(e4c);
    }

    public CWX CQm(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        DE1 de1 = this.A02;
        CZB czb = de1.A04;
        if (czb != null) {
            czb.A00(i, i2);
        }
        C26246Cvk cvk = this.A04;
        cvk.A07(this.A01, this.A00, i3, i4, 0, false, false);
        de1.A02 = i5;
        de1.A01 = i6;
        de1.A00 = i7;
        de1.A06 = z;
        return cvk.A06();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DE1, java.lang.Object] */
    public C26782DDo(C28593E9i e9i, C26246Cvk cvk) {
        this.A04 = cvk;
        this.A03 = e9i;
        this.A06 = C25921Cof.A00();
    }
}
