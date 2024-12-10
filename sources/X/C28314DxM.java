package X;

import java.io.IOException;

/* renamed from: X.DxM  reason: case insensitive filesystem */
public class C28314DxM extends AnonymousClass1By {
    public static final AnonymousClass1C0 A03 = BE8.A0u("1.3.6.1.5.5.7.1.4");
    public static final AnonymousClass1C0 A04 = BE8.A0u("1.3.6.1.5.5.7.1.1");
    public static final AnonymousClass1C0 A05 = BE8.A0u("2.5.29.35");
    public static final AnonymousClass1C0 A06 = BE8.A0u("2.5.29.19");
    public static final AnonymousClass1C0 A07 = BE8.A0u("1.3.6.1.5.5.7.1.2");
    public static final AnonymousClass1C0 A08 = BE8.A0u("2.5.29.31");
    public static final AnonymousClass1C0 A09 = BE8.A0u("2.5.29.20");
    public static final AnonymousClass1C0 A0A = BE8.A0u("2.5.29.29");
    public static final AnonymousClass1C0 A0B = BE8.A0u("2.5.29.32");
    public static final AnonymousClass1C0 A0C = BE8.A0u("2.5.29.27");
    public static final AnonymousClass1C0 A0D = BE8.A0u("2.5.29.60");
    public static final AnonymousClass1C0 A0E = BE8.A0u("2.5.29.37");
    public static final AnonymousClass1C0 A0F = BE8.A0u("2.5.29.46");
    public static final AnonymousClass1C0 A0G = BE8.A0u("2.5.29.54");
    public static final AnonymousClass1C0 A0H = BE8.A0u("2.5.29.23");
    public static final AnonymousClass1C0 A0I = BE8.A0u("2.5.29.24");
    public static final AnonymousClass1C0 A0J = BE8.A0u("2.5.29.18");
    public static final AnonymousClass1C0 A0K = BE8.A0u("2.5.29.28");
    public static final AnonymousClass1C0 A0L = BE8.A0u("2.5.29.15");
    public static final AnonymousClass1C0 A0M = BE8.A0u("1.3.6.1.5.5.7.1.12");
    public static final AnonymousClass1C0 A0N = BE8.A0u("2.5.29.30");
    public static final AnonymousClass1C0 A0O = BE8.A0u("2.5.29.56");
    public static final AnonymousClass1C0 A0P = BE8.A0u("2.5.29.36");
    public static final AnonymousClass1C0 A0Q = BE8.A0u("2.5.29.33");
    public static final AnonymousClass1C0 A0R = BE8.A0u("2.5.29.16");
    public static final AnonymousClass1C0 A0S = BE8.A0u("1.3.6.1.5.5.7.1.3");
    public static final AnonymousClass1C0 A0T = BE8.A0u("2.5.29.21");
    public static final AnonymousClass1C0 A0U = BE8.A0u("2.5.29.17");
    public static final AnonymousClass1C0 A0V = BE8.A0u("2.5.29.9");
    public static final AnonymousClass1C0 A0W = BE8.A0u("1.3.6.1.5.5.7.1.11");
    public static final AnonymousClass1C0 A0X = BE8.A0u("2.5.29.14");
    public static final AnonymousClass1C0 A0Y = BE8.A0u("2.5.29.55");
    public AnonymousClass1C0 A00;
    public C28342Dxo A01;
    public boolean A02;

    public AnonymousClass1Bz CP9() {
        C26135Csy csy = new C26135Csy(3);
        csy.A02(this.A00);
        if (this.A02) {
            csy.A02(C28336Dxi.A02);
        }
        return C28339Dxl.A07(this.A01, csy);
    }

    public static AnonymousClass1Bz A01(C28314DxM dxM) {
        try {
            return AnonymousClass1Bz.A01(dxM.A01.A00);
        } catch (IOException e) {
            throw AnonymousClass8BX.A0V(e, "can't convert extension: ", AnonymousClass000.A10());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C28314DxM)) {
            return false;
        }
        C28314DxM dxM = (C28314DxM) obj;
        if (!dxM.A00.A0J(this.A00) || !dxM.A01.A0J(this.A01) || dxM.A02 != this.A02) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.A02;
        int hashCode = this.A01.hashCode() ^ this.A00.hashCode();
        if (!z) {
            return hashCode ^ -1;
        }
        return hashCode;
    }
}
