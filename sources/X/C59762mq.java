package X;

/* renamed from: X.2mq  reason: invalid class name and case insensitive filesystem */
public final class C59762mq {
    public final int A00;
    public final int A01;
    public final C48252Lt A02;
    public final C48262Lu A03;
    public final C48262Lu A04;
    public final C59602ma A05;
    public final String A06;

    public C59762mq(C48252Lt r2, C48262Lu r3, C48262Lu r4, C59602ma r5, String str, int i, int i2) {
        C18070vi.A0d(str, 7);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A06 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r1 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r1 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r1 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        r1 = r3.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0066
            java.lang.Class r1 = r3.getClass()
            if (r4 == 0) goto L_0x0015
            java.lang.Class r0 = r4.getClass()
        L_0x000d:
            boolean r1 = X.C18070vi.A18(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0017
            return r0
        L_0x0015:
            r0 = 0
            goto L_0x000d
        L_0x0017:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.privacy.usernotice.UserNoticeContent"
            X.C18070vi.A0z(r4, r0)
            X.2mq r4 = (X.C59762mq) r4
            int r1 = r3.A00
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0065
            int r1 = r3.A01
            int r0 = r4.A01
            if (r1 != r0) goto L_0x0065
            X.2Lt r1 = r3.A02
            if (r1 == 0) goto L_0x0036
            X.2Lt r0 = r4.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0065
        L_0x0036:
            X.2Lu r1 = r3.A04
            if (r1 == 0) goto L_0x0042
            X.2Lu r0 = r4.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0065
        L_0x0042:
            X.2Lu r1 = r3.A03
            if (r1 == 0) goto L_0x004e
            X.2Lu r0 = r4.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0065
        L_0x004e:
            X.2ma r1 = r3.A05
            if (r1 == 0) goto L_0x005a
            X.2ma r0 = r4.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0065
        L_0x005a:
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r4.A06
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0065
            return r2
        L_0x0065:
            r2 = 0
        L_0x0066:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59762mq.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int A0l = ((((((((this.A00 * 31) + this.A01) * 31) + AnonymousClass001.A0l(this.A02)) * 31) + AnonymousClass001.A0l(this.A04)) * 31) + AnonymousClass001.A0l(this.A03)) * 31;
        C59602ma r0 = this.A05;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return ((A0l + i) * 31) + this.A06.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserNoticeContent{policyVersion=");
        A10.append(this.A01);
        A10.append(", banner=");
        A10.append(this.A02);
        A10.append(", modal=");
        A10.append(this.A04);
        A10.append(", blockingModal=");
        A10.append(this.A03);
        A10.append(", badged=");
        A10.append(this.A05);
        return C17890vO.A0b(A10);
    }
}
