package X;

/* renamed from: X.CYz  reason: case insensitive filesystem */
public final class C25126CYz {
    public final int A00;
    public final int A01;
    public final D48 A02;
    public final D48 A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25126CYz cYz = (C25126CYz) obj;
            if (this.A01 != cYz.A01 || this.A00 != cYz.A00 || !this.A04.equals(cYz.A04) || !this.A03.equals(cYz.A03) || !this.A02.equals(cYz.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A03, C17890vO.A02(this.A04, (((527 + this.A01) * 31) + this.A00) * 31)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r6 == 0) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25126CYz(X.D48 r2, X.D48 r3, java.lang.String r4, int r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            if (r5 == 0) goto L_0x0008
            r0 = 0
            if (r6 != 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.C26056CrS.A02(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x001d
            r1.A04 = r4
            r1.A03 = r2
            r1.A02 = r3
            r1.A01 = r5
            r1.A00 = r6
            return
        L_0x001d:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25126CYz.<init>(X.D48, X.D48, java.lang.String, int, int):void");
    }
}
