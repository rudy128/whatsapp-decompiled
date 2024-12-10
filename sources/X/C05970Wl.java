package X;

import java.util.Map;

/* renamed from: X.0Wl  reason: invalid class name and case insensitive filesystem */
public final class C05970Wl implements C17740v9, C17530uo {
    public final C24246By4 A00;
    public final /* synthetic */ C17740v9 A01;

    public float BQU() {
        return this.A01.BQU();
    }

    public float BRu() {
        return this.A01.BRu();
    }

    public boolean BfO() {
        return this.A01.BfO();
    }

    public C16820tH BhL(Map map, C22821Di r4, int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & -16777216) == 0 && (-16777216 & i2) == 0) {
            return new AnonymousClass0XC(map, i, i2);
        }
        throw AnonymousClass000.A0o(") is out of range. Each dimension must be between 0 and 16777215.", AnonymousClass001.A1M(i, i2));
    }

    public int CG9(float f) {
        return this.A01.CG9(f);
    }

    public float CPE(long j) {
        return this.A01.CPE(j);
    }

    public float CPF(float f) {
        return this.A01.CPF(f);
    }

    public float CPG(int i) {
        return this.A01.CPG(i);
    }

    public long CPH(long j) {
        return this.A01.CPH(j);
    }

    public float CPP(long j) {
        return this.A01.CPP(j);
    }

    public float CPQ(float f) {
        return this.A01.CPQ(f);
    }

    public long CPT(long j) {
        return this.A01.CPT(j);
    }

    public long CPU(float f) {
        return this.A01.CPU(f);
    }

    public long CPV(float f) {
        return this.A01.CPV(f);
    }

    public C05970Wl(C17740v9 r1, C24246By4 by4) {
        this.A00 = by4;
        this.A01 = r1;
    }

    public C24246By4 getLayoutDirection() {
        return this.A00;
    }
}
