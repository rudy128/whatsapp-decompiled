package X;

/* renamed from: X.2nC  reason: invalid class name and case insensitive filesystem */
public class C59982nC {
    public final C60002nE A00;
    public final String A01;

    public String[] A00() {
        C60002nE r2 = this.A00;
        return new String[]{this.A01, r2.A03, String.valueOf(r2.A01), String.valueOf(r2.A00)};
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C59982nC)) {
            return false;
        }
        C59982nC r4 = (C59982nC) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        if (r0 == null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.String r4 = r7.A01
            java.lang.String r5 = "@"
            boolean r0 = r4.contains(r5)
            r3 = 4
            if (r0 == 0) goto L_0x0035
            int r1 = r4.indexOf(r5)
            r0 = 0
            java.lang.String r6 = r4.substring(r0, r1)
            int r0 = r1 + 1
            java.lang.String r2 = r4.substring(r0)
            java.lang.String r0 = "g.us"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0049
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 15
            java.lang.String r0 = X.AnonymousClass1EG.A0B(r6, r0)
        L_0x002c:
            X.C17890vO.A10(r0, r5, r2, r1)
            java.lang.String r0 = r1.toString()
            if (r0 != 0) goto L_0x0039
        L_0x0035:
            java.lang.String r0 = X.AnonymousClass1EG.A0B(r4, r3)
        L_0x0039:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "::"
            r1.append(r0)
            X.2nE r0 = r7.A00
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            return r0
        L_0x0049:
            java.lang.String r0 = "broadcast"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0035
            X.1cg r0 = X.C29671cg.A00
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0072
            X.8v1 r0 = X.C173408v1.A00
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0072
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass1EG.A0B(r6, r3)
            goto L_0x002c
        L_0x0072:
            r0 = r4
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59982nC.toString():java.lang.String");
    }

    public C59982nC(C60002nE r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
