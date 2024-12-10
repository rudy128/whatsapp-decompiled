package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.CrD  reason: case insensitive filesystem */
public class C26046CrD {
    public static final C26046CrD A02;
    public E7H A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C26046CrD crD = (C26046CrD) obj;
            if (this.A01.equals(crD.A01)) {
                E7H e7h = this.A00;
                E7H e7h2 = crD.A00;
                if (e7h != null) {
                    return e7h.equals(e7h2);
                }
                return e7h2 == null;
            }
        }
        return false;
    }

    public int A00(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (!C17880vN.A0w(list, i).equals("**")) {
                return 1;
            }
            if (i == AnonymousClass3MX.A02(list, 1) || !C17880vN.A0w(list, i + 1).equals(str)) {
                return 0;
            }
            return 2;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r0 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(java.lang.String r8, int r9) {
        /*
            r7 = this;
            java.util.List r3 = r7.A01
            int r0 = r3.size()
            r6 = 0
            if (r9 >= r0) goto L_0x004a
            int r0 = r3.size()
            r5 = 1
            int r0 = r0 - r5
            boolean r4 = X.AnonymousClass000.A1T(r9, r0)
            java.lang.String r1 = X.C17880vN.A0w(r3, r9)
            java.lang.String r2 = "**"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x004b
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "*"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            if (r4 != 0) goto L_0x0047
            int r0 = r3.size()
            int r0 = r0 + -2
            if (r9 != r0) goto L_0x004a
            int r0 = X.AnonymousClass3MX.A01(r3)
            java.lang.String r0 = X.C17880vN.A0w(r3, r0)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x004a
        L_0x0047:
            if (r1 == 0) goto L_0x004a
        L_0x0049:
            r6 = 1
        L_0x004a:
            return r6
        L_0x004b:
            if (r4 != 0) goto L_0x0085
            int r1 = r9 + 1
            java.lang.String r0 = X.C17880vN.A0w(r3, r1)
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0076
            int r0 = r3.size()
            int r0 = r0 + -2
            if (r9 == r0) goto L_0x0049
            int r0 = r3.size()
            int r0 = r0 + -3
            if (r9 != r0) goto L_0x004a
            int r0 = X.AnonymousClass3MX.A01(r3)
            java.lang.String r0 = X.C17880vN.A0w(r3, r0)
            boolean r1 = r0.equals(r2)
            goto L_0x0047
        L_0x0076:
            int r0 = X.AnonymousClass3MX.A02(r3, r5)
            if (r1 < r0) goto L_0x004a
            java.lang.String r0 = X.C17880vN.A0w(r3, r1)
            boolean r0 = r0.equals(r8)
            return r0
        L_0x0085:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26046CrD.A01(java.lang.String, int):boolean");
    }

    public boolean A02(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (i >= list.size() || (!C17880vN.A0w(list, i).equals(str) && !C17880vN.A0w(list, i).equals("**") && !C17880vN.A0w(list, i).equals("*"))) {
                return false;
            }
        }
        return true;
    }

    public boolean A03(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.A01;
        if (i < AnonymousClass3MX.A02(list, 1) || C17880vN.A0w(list, i).equals("**")) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + AnonymousClass001.A0l(this.A00);
    }

    static {
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "COMPOSITION";
        A02 = new C26046CrD(A1Y);
    }

    public C26046CrD(C26046CrD crD) {
        this.A01 = C17880vN.A10(crD.A01);
        this.A00 = crD.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("KeyPath{keys=");
        A10.append(this.A01);
        A10.append(",resolved=");
        A10.append(AnonymousClass000.A1W(this.A00));
        return C17890vO.A0b(A10);
    }

    public C26046CrD(String... strArr) {
        this.A01 = Arrays.asList(strArr);
    }
}
