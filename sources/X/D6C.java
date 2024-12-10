package X;

public final class D6C implements C28644ECa {
    public final float A00;
    public final float A01;

    public /* synthetic */ int CG9(float f) {
        return C26252Cvs.A04(this, f);
    }

    public /* synthetic */ float CPE(long j) {
        return C25292Ccu.A00(this, j);
    }

    public /* synthetic */ float CPG(int i) {
        return ((float) i) / BQU();
    }

    public /* synthetic */ long CPH(long j) {
        return C26252Cvs.A06(this, j);
    }

    public /* synthetic */ float CPP(long j) {
        return C26252Cvs.A03(this, j);
    }

    public /* synthetic */ long CPT(long j) {
        return C26252Cvs.A07(this, j);
    }

    public /* synthetic */ long CPU(float f) {
        return C25292Ccu.A01(this, f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof D6C) {
                D6C d6c = (D6C) obj;
                if (!(Float.compare(this.A00, d6c.A00) == 0 && Float.compare(this.A01, d6c.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public float BQU() {
        return this.A00;
    }

    public float BRu() {
        return this.A01;
    }

    public /* synthetic */ float CPF(float f) {
        return f / this.A00;
    }

    public /* synthetic */ float CPQ(float f) {
        return f * this.A00;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A05(this.A00), this.A01);
    }

    public D6C(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public /* synthetic */ long CPV(float f) {
        return CPU(CPF(f));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DensityImpl(density=");
        A10.append(this.A00);
        A10.append(", fontScale=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
