package X;

import java.util.List;

public class D8W implements C28589E9d {
    public float A00;
    public float A01;
    public int A02 = -1;
    public C25223CbJ A03 = null;
    public List A04 = AnonymousClass000.A13();
    public boolean A05;
    public boolean A06 = true;
    public boolean A07 = false;
    public final /* synthetic */ C26304CxN A08;

    public void BCZ(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        this.A07 = true;
        this.A06 = false;
        C25223CbJ cbJ = this.A03;
        C26304CxN.A0T(this, cbJ.A02, cbJ.A03, f, f2, f3, f4, f5, z, z2);
        this.A06 = true;
        this.A05 = false;
    }

    public D8W(D8X d8x, C26304CxN cxN) {
        this.A08 = cxN;
        if (d8x != null) {
            d8x.A02(this);
            if (this.A05) {
                this.A04.get(-1);
                throw AnonymousClass000.A0s("add");
            }
        }
    }

    public void BHy(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.A06 || this.A07) {
            C25223CbJ cbJ = this.A03;
            cbJ.A00(f, f2);
            this.A04.add(cbJ);
            this.A07 = false;
        }
        this.A03 = new C25223CbJ(this.A08, f5, f6, f5 - f3, f6 - f4);
        this.A05 = false;
    }

    public void BhX(float f, float f2) {
        C25223CbJ cbJ = this.A03;
        cbJ.A00(f, f2);
        this.A04.add(cbJ);
        C26304CxN cxN = this.A08;
        C25223CbJ cbJ2 = this.A03;
        this.A03 = new C25223CbJ(cxN, f, f2, f - cbJ2.A02, f2 - cbJ2.A03);
        this.A05 = false;
    }

    public void Bk6(float f, float f2) {
        if (this.A05) {
            C25223CbJ cbJ = this.A03;
            List list = this.A04;
            cbJ.A01((C25223CbJ) list.get(this.A02));
            list.set(this.A02, this.A03);
            this.A05 = false;
        }
        C25223CbJ cbJ2 = this.A03;
        if (cbJ2 != null) {
            this.A04.add(cbJ2);
        }
        this.A00 = f;
        this.A01 = f2;
        this.A03 = new C25223CbJ(this.A08, f, f2, 0.0f, 0.0f);
        this.A02 = this.A04.size();
    }

    public void CD6(float f, float f2, float f3, float f4) {
        C25223CbJ cbJ = this.A03;
        cbJ.A00(f, f2);
        this.A04.add(cbJ);
        this.A03 = new C25223CbJ(this.A08, f3, f4, f3 - f, f4 - f2);
        this.A05 = false;
    }

    public void close() {
        this.A04.add(this.A03);
        BhX(this.A00, this.A01);
        this.A05 = true;
    }
}
