package X;

import java.math.BigInteger;

public final class DSG implements Comparable {
    public static final DSG A05 = new DSG(0, 1, "", 0);
    public static final DSG A06;
    public static final DSG A07 = new DSG(0, 0, "", 0);
    public static final DSG A08;
    public final int A00;
    public final int A01;
    public final int A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new C27468Dfx(this));
    public final String A04;

    static {
        DSG dsg = new DSG(1, 0, "", 0);
        A08 = dsg;
        A06 = dsg;
    }

    /* renamed from: A00 */
    public int compareTo(DSG dsg) {
        C18070vi.A0d(dsg, 0);
        return ((BigInteger) AnonymousClass3MX.A14(this.A03)).compareTo((BigInteger) AnonymousClass3MX.A14(dsg.A03));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSG)) {
            return false;
        }
        DSG dsg = (DSG) obj;
        if (this.A00 == dsg.A00 && this.A01 == dsg.A01 && this.A02 == dsg.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public String toString() {
        String str;
        String str2 = this.A04;
        if (!AnonymousClass1YF.A0T(str2)) {
            str = C17890vO.A0Z(str2, AnonymousClass000.A10(), '-');
        } else {
            str = "";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        A10.append('.');
        A10.append(this.A01);
        A10.append('.');
        A10.append(this.A02);
        return AnonymousClass000.A0y(str, A10);
    }

    public DSG(int i, int i2, String str, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = str;
    }
}
