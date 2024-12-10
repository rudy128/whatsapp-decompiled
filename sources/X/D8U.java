package X;

public class D8U implements C28487E3r {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public boolean Bj6(C24424C2z c2z, C22761BNy bNy) {
        String str;
        int i;
        int i2;
        if (!this.A04 || this.A02 != null) {
            str = this.A02;
        } else {
            str = bNy.A00();
        }
        E7L e7l = bNy.A00;
        if (e7l != null) {
            i2 = 0;
            i = 0;
            for (C24482C5y c5y : e7l.BOi()) {
                if (c5y == bNy) {
                    i2 = i;
                }
                if (str == null || c5y.A00().equals(str)) {
                    i++;
                }
            }
        } else {
            i2 = 0;
            i = 1;
        }
        int i3 = i - i2;
        if (this.A03) {
            i3 = i2 + 1;
        }
        int i4 = this.A00;
        int i5 = this.A01;
        if (i4 != 0) {
            int i6 = i3 - i5;
            if (i6 % i4 != 0) {
                return false;
            }
            i3 = Integer.signum(i6);
            if (i3 != 0) {
                i5 = Integer.signum(i4);
            }
            return true;
        }
        if (i3 == i5) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        Object[] objArr;
        String str2;
        if (this.A03) {
            str = "";
        } else {
            str = "last-";
        }
        if (this.A04) {
            objArr = BE6.A1a();
            objArr[0] = str;
            C17880vN.A1T(objArr, this.A00, 1);
            C17880vN.A1T(objArr, this.A01, 2);
            objArr[3] = this.A02;
            str2 = "nth-%schild(%dn%+d of type <%s>)";
        } else {
            objArr = new Object[3];
            objArr[0] = str;
            C17880vN.A1T(objArr, this.A00, 1);
            C17880vN.A1T(objArr, this.A01, 2);
            str2 = "nth-%schild(%dn%+d)";
        }
        return String.format(str2, objArr);
    }

    public D8U(String str, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str;
    }
}
