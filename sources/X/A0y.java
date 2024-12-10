package X;

import java.util.Arrays;

public class A0y {
    public String A00;
    public A0x A01;
    public C21338AiO A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof A0y)) {
            return false;
        }
        A0y a0y = (A0y) obj;
        if (!this.A01.equals(a0y.A01) || !this.A00.equals(a0y.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.AiO] */
    public A0y(String str, A0x a0x) {
        this.A01 = a0x;
        this.A00 = str;
        ? obj = new Object();
        obj.ssoEligibility = "2";
        obj.ntaEligibility = "2";
        obj.ntaSuperEligibility = "2";
        this.A02 = obj;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        A1b[1] = this.A00;
        return Arrays.deepHashCode(A1b);
    }

    public A0y() {
        this("", new A0x());
    }
}
