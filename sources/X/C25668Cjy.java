package X;

/* renamed from: X.Cjy  reason: case insensitive filesystem */
public class C25668Cjy {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public C25668Cjy(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f4;
    }

    public String toString() {
        StringBuilder A0q = BE9.A0q();
        A0q.append(this.A01);
        A0q.append(" ");
        A0q.append(this.A02);
        A0q.append(" ");
        A0q.append(this.A03);
        A0q.append(" ");
        A0q.append(this.A00);
        return AnonymousClass000.A0z(A0q);
    }

    public C25668Cjy(C25668Cjy cjy) {
        this.A01 = cjy.A01;
        this.A02 = cjy.A02;
        this.A03 = cjy.A03;
        this.A00 = cjy.A00;
    }
}
