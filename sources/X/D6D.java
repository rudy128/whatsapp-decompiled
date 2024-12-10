package X;

public final class D6D implements C28644ECa {
    public final float A00;
    public final float A01;
    public final E79 A02;

    public /* synthetic */ int CG9(float f) {
        return C26252Cvs.A04(this, f);
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

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof D6D) {
                D6D d6d = (D6D) obj;
                if (!(Float.compare(this.A00, d6d.A00) == 0 && Float.compare(this.A01, d6d.A01) == 0 && C18070vi.A18(this.A02, d6d.A02))) {
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

    public long CPU(float f) {
        return C26054CrP.A01(this.A02.BFt(f), 4294967296L);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0B(AnonymousClass000.A05(this.A00), this.A01));
    }

    public D6D(E79 e79, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = e79;
    }

    public float CPE(long j) {
        if (C26130Cst.A00(j) == 4294967296L) {
            return this.A02.BFu(AnonymousClass001.A01(j));
        }
        throw AnonymousClass000.A0n("Only Sp can convert to Px");
    }

    public /* synthetic */ long CPV(float f) {
        return CPU(CPF(f));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DensityWithConverter(density=");
        A10.append(this.A00);
        A10.append(", fontScale=");
        A10.append(this.A01);
        A10.append(", converter=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
