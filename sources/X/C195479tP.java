package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.9tP  reason: invalid class name and case insensitive filesystem */
public class C195479tP {
    public int A00;
    public int A01;
    public C179449Hz A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        AnonymousClass000.A1M(objArr, this.A01);
        AnonymousClass3Ma.A1S(objArr, this.A00);
        C17890vO.A1G(objArr, 0);
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C195479tP)) {
            return false;
        }
        C195479tP r4 = (C195479tP) obj;
        if (this.A02 == r4.A02 && r4.A01 == this.A01 && r4.A00 == this.A00) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ResumeCheck.Result type=");
        A10.append(this.A02);
        A10.append(", resume=");
        A10.append(this.A01);
        A10.append(", error=");
        A10.append(this.A00);
        A10.append(", message=");
        A10.append(this.A04);
        A10.append(", backoff=");
        A10.append(0);
        return AnonymousClass000.A0z(A10);
    }
}
