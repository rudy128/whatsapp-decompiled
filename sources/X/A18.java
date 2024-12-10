package X;

import java.security.MessageDigest;
import java.util.Arrays;

public class A18 {
    public int A00;
    public long A01 = -1;
    public String A02;
    public boolean A03 = false;
    public final String A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A18)) {
            return false;
        }
        A18 a18 = (A18) obj;
        return this.A01 == a18.A01 && this.A00 == a18.A00 && C42171xk.A00(this.A02, a18.A02) && C42171xk.A00(this.A04, a18.A04) && this.A03 == a18.A03;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A04;
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = this.A02;
        C17890vO.A1O(objArr, this.A01);
        return Arrays.hashCode(objArr);
    }

    public A18(String str, String str2) {
        this.A04 = str;
        this.A02 = str2;
    }

    public A18(String str) {
        this.A04 = str;
        try {
            MessageDigest A1I = C108945cZ.A1I();
            A1I.update(str.getBytes(C19620yd.A0C));
            this.A02 = C108955ca.A14(A1I.digest());
        } catch (Exception e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }
}
