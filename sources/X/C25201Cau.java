package X;

import java.util.Arrays;

/* renamed from: X.Cau  reason: case insensitive filesystem */
public class C25201Cau {
    public final int A00;
    public final E4J A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        String str;
        String str2;
        Object obj2;
        Object obj3;
        String str3;
        String str4;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C25201Cau cau = (C25201Cau) obj;
                if (this.A00 != cau.A00 || (((str = this.A02) != (str2 = cau.A02) && (str == null || !str.equals(str2))) || (((obj2 = this.A01.get()) != (obj3 = cau.A01.get()) && (obj2 == null || !obj2.equals(obj3))) || ((str3 = this.A03) != (str4 = cau.A03) && (str3 == null || !str3.equals(str4)))))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C25201Cau(C54662eV r3) {
        this.A02 = r3.A01;
        this.A03 = r3.A02;
        this.A00 = r3.A00;
        this.A01 = new DB5(new DB4(r3));
    }

    public int hashCode() {
        Object[] A1a = BE6.A1a();
        A1a[0] = this.A02;
        A1a[1] = this.A03;
        AnonymousClass8BU.A1Q(A1a, false);
        C17890vO.A1G(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SoftError{mCategory='");
        A10.append(this.A02);
        A10.append('\'');
        A10.append(", mMessage='");
        A10.append(this.A03);
        A10.append('\'');
        A10.append(", mCause=");
        A10.append(this.A01.get());
        C108975cc.A15(A10, ", mFailHarder=");
        A10.append(", mSamplingFrequency=");
        A10.append(this.A00);
        C108975cc.A15(A10, ", mOnlyIfEmployeeOrBetaBuild=");
        return C17890vO.A0b(A10);
    }
}
