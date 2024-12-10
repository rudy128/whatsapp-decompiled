package X;

import java.util.Arrays;

/* renamed from: X.2yI  reason: invalid class name and case insensitive filesystem */
public class C66512yI implements C41121vq {
    public final C70483Bg A00;
    public final C58782lF A01;
    public final AnonymousClass1E7 A02;
    public final String A03;

    public int BTW() {
        return 3;
    }

    public AnonymousClass1BI BTb() {
        return null;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        AnonymousClass000.A1L(objArr, 3);
        objArr[1] = this.A00;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        objArr[4] = this.A03;
        objArr[5] = null;
        C17890vO.A1H(objArr, -1);
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C66512yI)) {
            return false;
        }
        C66512yI r4 = (C66512yI) obj;
        if (!C42171xk.A00(this.A00, r4.A00) || !C42171xk.A00(this.A02, r4.A02) || !C42171xk.A00(this.A01, r4.A01) || !C42171xk.A00(this.A03, r4.A03)) {
            return false;
        }
        return true;
    }

    public C66512yI(C70483Bg r1, C58782lF r2, AnonymousClass1E7 r3, String str) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
    }

    public C70483Bg BO2() {
        return this.A00;
    }

    public int BYi() {
        return -1;
    }
}
