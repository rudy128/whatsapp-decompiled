package X;

/* renamed from: X.1cU  reason: invalid class name and case insensitive filesystem */
public final class C29561cU {
    public final AnonymousClass18K A00;

    public C29561cU(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final int A00(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1730152220:
                    str2 = "CONTACTS_FILTER";
                    break;
                case -817912192:
                    if (str.equals("FAVORITES_FILTER")) {
                        return 3;
                    }
                    break;
                case 72525144:
                    if (str.equals("GROUP_FILTER")) {
                        return 2;
                    }
                    break;
                case 1184498283:
                    str2 = "CUSTOM_LIST_FILTER";
                    break;
                case 1827283464:
                    if (str.equals("UNREAD_FILTER")) {
                        return 1;
                    }
                    break;
            }
            if (str.equals(str2)) {
                return 5;
            }
        }
        return 0;
    }

    public static final AnonymousClass2H5 A01(int i, int i2, long j, long j2) {
        AnonymousClass2H5 r1 = new AnonymousClass2H5();
        r1.A01 = Integer.valueOf(i2);
        r1.A02 = Integer.valueOf(i);
        r1.A07 = Long.valueOf(j);
        r1.A05 = Long.valueOf(j2);
        r1.A00 = 2;
        r1.A04 = 0;
        return r1;
    }

    public final void A02(int i) {
        C46362Eg r1 = new C46362Eg();
        r1.A00 = Integer.valueOf(i);
        this.A00.CC7(r1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        r1.A01 = java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(long r5, java.lang.String r7, long r8) {
        /*
            r4 = this;
            int r3 = A00(r7)
            X.18K r2 = r4.A00
            X.2H5 r1 = new X.2H5
            r1.<init>()
            r0 = 46
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r1.A05 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1.A07 = r0
            int r0 = r7.hashCode()
            switch(r0) {
                case -1730152220: goto L_0x0037;
                case -817912192: goto L_0x0042;
                case 72525144: goto L_0x004d;
                case 1827283464: goto L_0x0057;
                default: goto L_0x0033;
            }
        L_0x0033:
            r2.CC7(r1)
            return
        L_0x0037:
            java.lang.String r0 = "CONTACTS_FILTER"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 10
            goto L_0x0060
        L_0x0042:
            java.lang.String r0 = "FAVORITES_FILTER"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 22
            goto L_0x0060
        L_0x004d:
            java.lang.String r0 = "GROUP_FILTER"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0060
        L_0x0057:
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
        L_0x0060:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29561cU.A03(long, java.lang.String, long):void");
    }
}
