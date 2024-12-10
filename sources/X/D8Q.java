package X;

public class D8Q implements C28487E3r {
    public String A00;
    public boolean A01;

    public boolean Bj6(C24424C2z c2z, C22761BNy bNy) {
        String str;
        if (!this.A01 || this.A00 != null) {
            str = this.A00;
        } else {
            str = bNy.A00();
        }
        E7L e7l = bNy.A00;
        if (e7l == null) {
            return true;
        }
        int i = 0;
        for (C24482C5y c5y : e7l.BOi()) {
            if (str == null || c5y.A00().equals(str)) {
                i++;
            }
        }
        if (i != 1) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (!this.A01) {
            return String.format("only-child", new Object[0]);
        }
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = this.A00;
        return String.format("only-of-type <%s>", A1a);
    }
}
