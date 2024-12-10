package X;

public class DE4 implements EAK, E98, E8l {
    public int A00;
    public int A01;
    public int A02;
    public C26246Cvk A03;
    public E9R A04;
    public EAJ A05;
    public C24863CNg A06;
    public final C25639CjS A07;
    public final DE1 A08 = new Object();
    public final C26246Cvk A09;
    public final boolean A0A;
    public volatile int A0B;
    public volatile C28497E4c A0C;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DE1, java.lang.Object] */
    public DE4(C25639CjS cjS, C26246Cvk cvk, C26246Cvk cvk2, boolean z) {
        this.A07 = cjS;
        this.A09 = cvk;
        this.A03 = cvk2;
        this.A0A = z;
        this.A0B = 5;
    }

    public Object BU8() {
        return this;
    }

    public synchronized int BVx() {
        return this.A0B;
    }

    public void Bd8(C26045Cr9 cr9) {
    }

    public boolean Beb(EA3 ea3) {
        return true;
    }

    public void release() {
    }

    public static DE4 A00(C25639CjS cjS, boolean z) {
        return new DE4(cjS, new BUV(), new BUR(), z);
    }

    private void A01() {
        if (this.A04 == null) {
            EAJ eaj = this.A05;
            if (eaj == null) {
                this.A07.A00(C0H.A0F);
                return;
            }
            int i = this.A02;
            boolean z = true;
            boolean A1R = AnonymousClass000.A1R(i);
            int i2 = this.A01;
            if (i2 <= 0) {
                z = false;
            }
            if (!A1R) {
                this.A07.A00(C0H.A0H);
                if (z) {
                    return;
                }
            } else if (z) {
                E9R BHP = eaj.BaJ().BHP(eaj, i, i2, this.A0A);
                this.A04 = BHP;
                DE1 de1 = this.A08;
                de1.A04 = BHP.getTexture();
                int i3 = 3;
                if (BHP.is10Bit()) {
                    i3 = 7;
                }
                de1.A00 = i3;
                return;
            }
            this.A07.A00(C0H.A0G);
        }
    }

    private void A02() {
        E9R e9r = this.A04;
        if (e9r != null) {
            try {
                e9r.release();
            } finally {
                this.A04 = null;
                this.A08.A04 = null;
            }
        }
    }

    public void A03(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i;
        int i6 = i2;
        int i7 = i2;
        if (i3 % 180 != 0) {
            i5 = i2;
            i7 = i;
        }
        if (this.A02 != i5 || this.A01 != i7 || this.A00 != i3 || this.A04 == null) {
            this.A00 = i3;
            this.A02 = i5;
            this.A01 = i7;
            if (this.A05 != null) {
                A02();
                A01();
            }
            C26246Cvk cvk = this.A09;
            cvk.A07(this.A02, this.A01, i4, i6, this.A00, false, false);
            this.A08.A05 = cvk.A06();
        }
    }

    public void BCi(EAJ eaj) {
        this.A05 = eaj;
        A01();
    }

    public EA3 BRy() {
        return this.A08;
    }

    public int BT4() {
        return this.A08.A00;
    }

    public int BVt() {
        return this.A08.A00;
    }

    public /* synthetic */ boolean Bfh() {
        return false;
    }

    public RuntimeException Bif() {
        E9R e9r = this.A04;
        if (e9r == null || this.A05 == null) {
            if (e9r == null) {
                this.A07.A00(C0H.A0J);
                return AnonymousClass000.A0n("Frame buffer is null");
            } else if (this.A05 == null) {
                this.A07.A00(C0H.A0K);
                return AnonymousClass000.A0n("Gl context is null");
            }
        }
        try {
            e9r.bind();
            C26058CrU.A01("Failure to bind frame buffer");
            return null;
        } catch (C27216DZt e) {
            this.A07.A00(C0H.A0I);
            return e;
        }
    }

    public void COr() {
        E9R e9r = this.A04;
        if (e9r == null) {
            this.A07.A00(C0H.A0N);
            return;
        }
        e9r.unbind();
        C28497E4c e4c = this.A0C;
        if (e4c != null) {
            e4c.Bv1();
        }
    }

    public CWX CR7(EA3 ea3) {
        C25639CjS cjS;
        C0H c0h;
        C26246Cvk cvk = this.A03;
        CWX Bbf = ea3.Bbf();
        if (Bbf == null) {
            cjS = this.A07;
            c0h = C0H.A0P;
        } else if (!Bbf.A00()) {
            cjS = this.A07;
            c0h = C0H.A0O;
        } else {
            cvk.A07(Bbf.A01, Bbf.A00, this.A02, this.A01, -this.A00, false, false);
            DE1 de1 = this.A08;
            de1.A02 = ea3.BVv();
            de1.A01 = ea3.BQb();
            de1.A03 = ea3.BaR();
            de1.A06 = ea3.Bev();
            return cvk.A06();
        }
        cjS.A00(c0h);
        return null;
    }

    public void BIY() {
        A02();
        this.A05 = null;
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1Z(obj, this);
    }

    public void CJe(C28497E4c e4c) {
        this.A0C = e4c;
    }

    public void CJf(C24863CNg cNg) {
        this.A06 = cNg;
    }
}
