package X;

/* renamed from: X.CbJ  reason: case insensitive filesystem */
public class C25223CbJ {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02;
    public float A03;
    public boolean A04 = false;
    public final /* synthetic */ C26304CxN A05;

    public C25223CbJ(C26304CxN cxN, float f, float f2, float f3, float f4) {
        this.A05 = cxN;
        this.A02 = f;
        this.A03 = f2;
        double A002 = BE9.A00(f3, f4);
        if (A002 != 0.0d) {
            this.A00 = (float) (((double) f3) / A002);
            this.A01 = (float) (((double) f4) / A002);
        }
    }

    public void A00(float f, float f2) {
        float f3 = f - this.A02;
        float f4 = f2 - this.A03;
        double A002 = BE9.A00(f3, f4);
        if (A002 != 0.0d) {
            f3 = (float) (((double) f3) / A002);
            f4 = (float) (((double) f4) / A002);
        }
        float f5 = this.A00;
        if (f3 == (-f5) && f4 == (-this.A01)) {
            this.A04 = true;
            this.A00 = -f4;
        } else {
            this.A00 = f5 + f3;
            f3 = this.A01 + f4;
        }
        this.A01 = f3;
    }

    public void A01(C25223CbJ cbJ) {
        float f = cbJ.A00;
        float f2 = this.A00;
        if (f == (-f2)) {
            float f3 = cbJ.A01;
            if (f3 == (-this.A01)) {
                this.A04 = true;
                this.A00 = -f3;
                this.A01 = cbJ.A00;
                return;
            }
        }
        this.A00 = f2 + f;
        this.A01 += cbJ.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("(");
        A10.append(this.A02);
        A10.append(",");
        A10.append(this.A03);
        BE6.A1J(A10);
        A10.append(this.A00);
        A10.append(",");
        A10.append(this.A01);
        return AnonymousClass8BU.A0q(A10);
    }
}
