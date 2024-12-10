package X;

import java.util.Map;

/* renamed from: X.0AM  reason: invalid class name */
public abstract class AnonymousClass0AM extends AnonymousClass0XJ implements C17530uo {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass0QZ A02 = AnonymousClass0O5.A00(this);

    public abstract int A0a(C04280Mo r1);

    public abstract long A0b();

    public abstract C16820tH A0c();

    public abstract AnonymousClass0AM A0e();

    public abstract void A0f();

    public abstract boolean A0k();

    public boolean BfO() {
        return false;
    }

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

    public C16820tH BhL(Map map, C22821Di r4, int i, int i2) {
        if ((i & -16777216) == 0 && (-16777216 & i2) == 0) {
            return new AnonymousClass0XD(this, map, r4, i, i2);
        }
        throw AnonymousClass000.A0o(") is out of range. Each dimension must be between 0 and 16777215.", AnonymousClass001.A1M(i, i2));
    }

    public static final void A00(C01850Ad r2) {
        AnonymousClass0XV r1;
        C04670Oh BMo;
        C01850Ad A0w = r2.A0w();
        if (A0w != null) {
            r1 = A0w.A0t();
        } else {
            r1 = null;
        }
        boolean A18 = C18070vi.A18(r1, r2.A0t());
        AnonymousClass0AK A0u = r2.A0u();
        if (!A18) {
            BMo = A0u.A0L;
        } else {
            C17490uk BWB = A0u.BWB();
            if (BWB == null || (BMo = BWB.BMo()) == null) {
                return;
            }
        }
        BMo.A05();
    }

    public final AnonymousClass0QZ A0d() {
        return this.A02;
    }

    public final boolean A0i() {
        return this.A00;
    }

    public final boolean A0j() {
        return this.A01;
    }

    public final int BLy(C04280Mo r4) {
        int A0a;
        if (!A0k() || (A0a = A0a(r4)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return A0a + AnonymousClass000.A0H(this.A02);
    }

    public final void A0g(boolean z) {
        this.A00 = z;
    }

    public final void A0h(boolean z) {
        this.A01 = z;
    }
}
