package X;

/* renamed from: X.ATd  reason: case insensitive filesystem */
public class C20645ATd implements C22508BAp {
    public final /* synthetic */ C20653ATl A00;

    public C20645ATd(C20653ATl aTl) {
        this.A00 = aTl;
    }

    public void BtA(C190599lD r3, int i) {
        AP6 ap6 = this.A00.A0B;
        if (ap6 != null) {
            AP6.A05(ap6, r3, i, 2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.9ND, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        throw X.AnonymousClass8BR.A0w(X.AnonymousClass001.A1H("HomeWidgetsDelegate/getWidgetTypeById: Widget not supported: ", r2, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r0 = r4.A00;
        r1 = new java.lang.Object();
        r1.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (r0 != 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        r1.A01 = r4;
        X.C17880vN.A1O(r1, r3.A0B, r2);
        X.AP6.A04(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r8) {
        /*
            r7 = this;
            java.util.List r8 = (java.util.List) r8
            X.ATl r0 = r7.A00
            X.AP6 r3 = r0.A0B
            if (r3 == 0) goto L_0x002a
            boolean r0 = r8.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "HomeWidgetsDelegate/onFetchUnifiedHomeSuccess widgets list cannot be empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.9hD r2 = r3.A06
            r0 = 4
            r2.A02 = r0
            r0 = 3
            r2.A00 = r0
            r0 = 2
            r2.A01 = r0
            r1 = 7
            X.9lD r0 = new X.9lD
            r0.<init>(r4, r4, r1)
            r2.A07 = r0
            r3.A0A()
        L_0x002a:
            return
        L_0x002b:
            java.util.Iterator r6 = r8.iterator()
            r5 = 0
        L_0x0030:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r4 = r6.next()
            X.9aZ r4 = (X.C184199aZ) r4
            java.lang.String r2 = r4.A01
            int r0 = r2.hashCode()
            switch(r0) {
                case -1425004772: goto L_0x0072;
                case -1049482625: goto L_0x0068;
                case -805635793: goto L_0x005e;
                case 1594529602: goto L_0x0054;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "HomeWidgetsDelegate/getWidgetTypeById: Widget not supported: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0054:
            java.lang.String r0 = "popular_categories"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r2 = 1
            goto L_0x007b
        L_0x005e:
            java.lang.String r0 = "frequently_contacted_biz"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r2 = 3
            goto L_0x007b
        L_0x0068:
            java.lang.String r0 = "nearby"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r2 = 0
            goto L_0x007b
        L_0x0072:
            java.lang.String r0 = "verified_biz"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r2 = 2
        L_0x007b:
            int r0 = r4.A00
            X.9ND r1 = new X.9ND
            r1.<init>()
            r1.A00 = r0
            if (r0 != 0) goto L_0x0087
            r5 = 1
        L_0x0087:
            r1.A01 = r4
            java.util.Map r0 = r3.A0B
            X.C17880vN.A1O(r1, r0, r2)
            X.AP6.A04(r3, r2)
            goto L_0x0030
        L_0x0092:
            if (r5 == 0) goto L_0x00d1
            java.util.Map r2 = r3.A0B
            java.lang.Integer r1 = X.AnonymousClass3MY.A0f()
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r2.get(r1)
            X.9ND r0 = (X.AnonymousClass9ND) r0
            java.lang.Object r0 = r0.A01
            X.8kI r0 = (X.C169058kI) r0
            X.9tl r0 = r0.A00
            r3.Bn0(r0)
        L_0x00af:
            java.lang.Integer r1 = X.C17880vN.A0j()
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r2.get(r1)
            X.9ND r0 = (X.AnonymousClass9ND) r0
            java.lang.Object r0 = r0.A01
            X.8kH r0 = (X.C169048kH) r0
            int r1 = r0.A00
            X.00H r0 = r3.A0A
            java.lang.Object r0 = r0.get()
            X.6o8 r0 = (X.C133076o8) r0
            r0.A00(r3, r1)
            return
        L_0x00d1:
            X.AP6.A03(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20645ATd.onSuccess(java.lang.Object):void");
    }
}
