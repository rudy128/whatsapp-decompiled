package X;

/* renamed from: X.Ai1  reason: case insensitive filesystem */
public final class C21316Ai1 implements C22486B9s {
    public final A6F A00;
    public final AnonymousClass11P A01;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r3 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        switch(r3.hashCode()) {
            case -1806407742: goto L_0x00b5;
            case -526668609: goto L_0x00a3;
            case 851903629: goto L_0x008f;
            case 1832379851: goto L_0x0076;
            default: goto L_0x0075;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r3.equals("SECONDS_SINCE_GREATER_THAN") == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        r0 = ((java.lang.System.currentTimeMillis() - r9.A00.A04(r1, r2)) > (r7 * 1000) ? 1 : ((java.lang.System.currentTimeMillis() - r9.A00.A04(r1, r2)) == (r7 * 1000) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r3.equals("COUNT_AT_LEAST") == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        r0 = (((long) r9.A00.A03(r1, r2)) > r7 ? 1 : (((long) r9.A00.A03(r1, r2)) == r7 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        if (r0 < 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a9, code lost:
        if (r3.equals("COUNT_AT_MOST") == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        r2 = (((long) r9.A00.A03(r1, r2)) > r7 ? 1 : (((long) r9.A00.A03(r1, r2)) == r7 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (r3.equals("SECONDS_SINCE_LESS_THAN") == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        r2 = ((java.lang.System.currentTimeMillis() - r9.A00.A04(r1, r2)) > (r7 * 1000) ? 1 : ((java.lang.System.currentTimeMillis() - r9.A00.A04(r1, r2)) == (r7 * 1000) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cd, code lost:
        if (r2 > 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BCL(X.C186309dz r10, X.C22484B9q r11, X.AnonymousClass5YR r12) {
        /*
            r9 = this;
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            java.util.Map r4 = r10.A01
            java.lang.String r0 = "promo_id"
            java.lang.Object r2 = r4.get(r0)
            if (r2 == 0) goto L_0x00d6
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "event_count"
            java.lang.String r0 = X.C17880vN.A0s(r0, r4)
            if (r0 == 0) goto L_0x003e
            long r7 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "event"
            java.lang.String r0 = X.C17880vN.A0s(r0, r4)
            r3 = 0
            if (r0 == 0) goto L_0x00d1
            java.lang.String r1 = X.AnonymousClass8BW.A0j(r0)
        L_0x0029:
            java.lang.String r0 = "metric"
            java.lang.String r0 = X.C17880vN.A0s(r0, r4)
            if (r0 == 0) goto L_0x0035
            java.lang.String r3 = X.AnonymousClass8BW.A0j(r0)
        L_0x0035:
            if (r1 == 0) goto L_0x003e
            int r0 = r1.hashCode()
            switch(r0) {
                case -1413131469: goto L_0x0062;
                case -1395292287: goto L_0x0057;
                case -956430933: goto L_0x004c;
                case 605715977: goto L_0x0041;
                default: goto L_0x003e;
            }
        L_0x003e:
            boolean r0 = r10.A02
            return r0
        L_0x0041:
            java.lang.String r0 = "IMPRESSION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.9Ik r1 = X.C179549Ik.IMPRESSION
            goto L_0x006c
        L_0x004c:
            java.lang.String r0 = "DISMISS_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.9Ik r1 = X.C179549Ik.DISMISS_ACTION
            goto L_0x006c
        L_0x0057:
            java.lang.String r0 = "SECONDARY_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.9Ik r1 = X.C179549Ik.SECONDARY_ACTION
            goto L_0x006c
        L_0x0062:
            java.lang.String r0 = "PRIMARY_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.9Ik r1 = X.C179549Ik.PRIMARY_ACTION
        L_0x006c:
            if (r3 == 0) goto L_0x003e
            int r0 = r3.hashCode()
            switch(r0) {
                case -1806407742: goto L_0x00b5;
                case -526668609: goto L_0x00a3;
                case 851903629: goto L_0x008f;
                case 1832379851: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x003e
        L_0x0076:
            java.lang.String r0 = "SECONDS_SINCE_GREATER_THAN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.A6F r0 = r9.A00
            long r4 = r0.A04(r1, r2)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            long r2 = r2 - r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            goto L_0x00a0
        L_0x008f:
            java.lang.String r0 = "COUNT_AT_LEAST"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.A6F r0 = r9.A00
            int r0 = r0.A03(r1, r2)
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
        L_0x00a0:
            if (r0 < 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00a3:
            java.lang.String r0 = "COUNT_AT_MOST"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.A6F r0 = r9.A00
            int r0 = r0.A03(r1, r2)
            long r0 = (long) r0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            goto L_0x00cd
        L_0x00b5:
            java.lang.String r0 = "SECONDS_SINCE_LESS_THAN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.A6F r0 = r9.A00
            long r5 = r0.A04(r1, r2)
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            long r3 = r3 - r5
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
        L_0x00cd:
            if (r2 > 0) goto L_0x00d4
        L_0x00cf:
            r0 = 1
            return r0
        L_0x00d1:
            r1 = r3
            goto L_0x0029
        L_0x00d4:
            r0 = 0
            return r0
        L_0x00d6:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21316Ai1.BCL(X.9dz, X.B9q, X.5YR):boolean");
    }

    public C21316Ai1(AnonymousClass11P r1, A6F a6f) {
        this.A00 = a6f;
        this.A01 = r1;
    }
}
