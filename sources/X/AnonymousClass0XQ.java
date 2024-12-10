package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.0XQ  reason: invalid class name */
public final class AnonymousClass0XQ implements C17520un {
    public float A00;
    public float A01;
    public C24246By4 A02 = C24246By4.Rtl;
    public final /* synthetic */ AnonymousClass0VQ A03;

    public /* synthetic */ int CG9(float f) {
        return C26252Cvs.A04(this, f);
    }

    public /* synthetic */ float CPE(long j) {
        return C25292Ccu.A00(this, j);
    }

    public /* synthetic */ float CPF(float f) {
        return C26252Cvs.A00(this, f);
    }

    public /* synthetic */ float CPG(int i) {
        return C26252Cvs.A02(this, i);
    }

    public /* synthetic */ long CPH(long j) {
        return C26252Cvs.A06(this, j);
    }

    public /* synthetic */ float CPP(long j) {
        return C26252Cvs.A03(this, j);
    }

    public /* synthetic */ float CPQ(float f) {
        return C26252Cvs.A01(this, f);
    }

    public /* synthetic */ long CPT(long j) {
        return C26252Cvs.A07(this, j);
    }

    public /* synthetic */ long CPU(float f) {
        return C25292Ccu.A01(this, f);
    }

    public /* synthetic */ long CPV(float f) {
        return C26252Cvs.A05(this, f);
    }

    public AnonymousClass0XQ(AnonymousClass0VQ r2) {
        this.A03 = r2;
    }

    public boolean BfO() {
        Integer num = this.A03.A07.A0Q.A05;
        if (num == AnonymousClass00R.A0N || num == AnonymousClass00R.A01) {
            return true;
        }
        return false;
    }

    public C16820tH BhL(Map map, C22821Di r9, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if ((i & -16777216) == 0 && (-16777216 & i2) == 0) {
            return new AnonymousClass0XF(this, this.A03, map, r9, i3, i4);
        }
        throw AnonymousClass000.A0o(") is out of range. Each dimension must be between 0 and 16777215.", AnonymousClass001.A1M(i, i2));
    }

    public List COj(Object obj, AnonymousClass1OS r3) {
        return this.A03.A0D(obj, r3);
    }

    public float BQU() {
        return this.A00;
    }

    public float BRu() {
        return this.A01;
    }

    public C24246By4 getLayoutDirection() {
        return this.A02;
    }

    public void A00(float f) {
        this.A00 = f;
    }

    public void A01(float f) {
        this.A01 = f;
    }

    public void A02(C24246By4 by4) {
        this.A02 = by4;
    }
}
