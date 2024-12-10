package X;

import java.util.Set;

/* renamed from: X.2rf  reason: invalid class name and case insensitive filesystem */
public class C62602rf {
    public static final C62602rf A02 = new C62602rf((Set) null, 6);
    public static final C62602rf A03 = new C62602rf((Set) null, 4);
    public static final C62602rf A04 = new C62602rf((Set) null, 0);
    public static final C62602rf A05 = new C62602rf((Set) null, 5);
    public static final C62602rf A06 = new C62602rf((Set) null, 3);
    public static final C62602rf A07 = new C62602rf((Set) null, 2);
    public static final C62602rf A08 = new C62602rf((Set) null, 1);
    public final int A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C62602rf r5 = (C62602rf) obj;
            if (this.A00 != r5.A00 || !C42171xk.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        AnonymousClass000.A1L(objArr, this.A00);
        return AnonymousClass000.A0P(this.A01, objArr, 1);
    }

    public boolean A00() {
        int i = this.A00;
        if (i == 2 || i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public boolean A01() {
        int i = this.A00;
        if (i == 3 || i == 2) {
            return true;
        }
        return false;
    }

    public C62602rf(Set set, int i) {
        this.A00 = i;
        this.A01 = set;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncResult(resultType=");
        A10.append(this.A00);
        return AnonymousClass000.A0y(")", A10);
    }
}
