package X;

import java.util.Arrays;

/* renamed from: X.0vz  reason: invalid class name and case insensitive filesystem */
public final class C18230vz {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, this.A04, this.A05, this.A02, this.A06, this.A03});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18230vz)) {
            return false;
        }
        C18230vz r4 = (C18230vz) obj;
        if (!C25332Cdd.A01(this.A01, r4.A01) || !C25332Cdd.A01(this.A00, r4.A00) || !C25332Cdd.A01(this.A04, r4.A04) || !C25332Cdd.A01(this.A05, r4.A05) || !C25332Cdd.A01(this.A02, r4.A02) || !C25332Cdd.A01(this.A06, r4.A06) || !C25332Cdd.A01(this.A03, r4.A03)) {
            return false;
        }
        return true;
    }

    public String toString() {
        CYH cyh = new CYH(this);
        cyh.A00(this.A01, "applicationId");
        cyh.A00(this.A00, "apiKey");
        cyh.A00(this.A04, "databaseUrl");
        cyh.A00(this.A02, "gcmSenderId");
        cyh.A00(this.A06, "storageBucket");
        cyh.A00(this.A03, "projectId");
        return cyh.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.trim().isEmpty() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18230vz(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x0010
            java.lang.String r0 = r3.trim()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r1 = r0 ^ 1
            java.lang.String r0 = "ApplicationId must be set."
            X.C18210vx.A08(r1, r0)
            r2.A01 = r3
            r2.A00 = r4
            r2.A04 = r5
            r2.A05 = r6
            r2.A02 = r7
            r2.A06 = r8
            r2.A03 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18230vz.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
