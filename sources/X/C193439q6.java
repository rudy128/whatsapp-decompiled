package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9q6  reason: invalid class name and case insensitive filesystem */
public final class C193439q6 {
    public final UserJid A00;
    public final String A01;

    public C193439q6(UserJid userJid, String str) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = userJid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0022
            boolean r1 = r4 instanceof X.C193439q6
            r0 = 0
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = r3.A01
            X.9q6 r4 = (X.C193439q6) r4
            java.lang.String r0 = r4.A01
            boolean r0 = X.C42171xk.A00(r1, r0)
            if (r0 == 0) goto L_0x0023
            com.whatsapp.jid.UserJid r1 = r3.A00
            if (r1 == 0) goto L_0x0022
            com.whatsapp.jid.UserJid r0 = r4.A00
            if (r0 == 0) goto L_0x0022
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            return r2
        L_0x0023:
            r2 = 0
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193439q6.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + AnonymousClass001.A0l(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductCacheKey(productId=");
        A10.append(this.A01);
        A10.append(", businessJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
