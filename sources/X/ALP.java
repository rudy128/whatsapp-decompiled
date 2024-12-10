package X;

public final class ALP implements C22415B6x {
    public final C22415B6x A00;
    public final B4y A01;
    public final AnonymousClass9YL A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r3.equals("ui_rendered") != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r3.equals("shadow_bind") != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        return r6.A00.BKe(r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c4, code lost:
        if (r9.equals("wa.action.CheckCardNumber") == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cd, code lost:
        if (r9.equals("wa.action.CheckCpfCnpj") == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        switch(r0) {
            case 3: goto L_0x00e3;
            case 4: goto L_0x00ec;
            case 5: goto L_0x0041;
            default: goto L_0x00dd;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        r7.A00.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e3, code lost:
        r0 = X.A61.A01(X.AnonymousClass8BT.A0t(r7, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ec, code lost:
        r0 = X.A61.A00(X.AnonymousClass8BT.A0t(r7, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0109, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BKe(X.C199029zJ r7, X.C25681CkC r8, java.lang.String r9) {
        /*
            r6 = this;
            r1 = 0
            boolean r2 = X.AnonymousClass8BX.A1U(r9, r7, r8)
            java.lang.String r0 = "wa.action.perf.TrackPerfBlock"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x008d
            java.util.List r0 = r7.A00
            java.lang.Object r3 = r0.get(r1)
            X.C18070vi.A0X(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.get(r2)
            X.C18070vi.A0X(r5)
            java.lang.String r5 = (java.lang.String) r5
            X.9YL r2 = r6.A02
            if (r3 == 0) goto L_0x0040
            int r1 = r3.hashCode()
            r0 = -1564272644(0xffffffffa2c317fc, float:-5.288025E-18)
            if (r1 == r0) goto L_0x006f
            r0 = 283926139(0x10ec5e7b, float:9.323116E-29)
            if (r1 == r0) goto L_0x0042
            r0 = 646679040(0x268b8a00, float:9.682468E-16)
            if (r1 != r0) goto L_0x0040
            java.lang.String r0 = "ui_rendered"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0077
        L_0x0040:
            r2 = 0
        L_0x0041:
            return r2
        L_0x0042:
            java.lang.String r0 = "tracking_success"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0040
            if (r5 == 0) goto L_0x0040
            X.9xT r4 = r2.A00
            java.lang.String r3 = "ending_surface_name"
            java.lang.String r2 = "no_surface"
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L_0x005e
            X.19a r1 = r4.A01
            r0 = 0
            r1.A0A(r3, r5, r0)
        L_0x005e:
            java.lang.String r0 = X.C197909xT.A00(r5)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0040
            r1 = 2
            X.19a r0 = r4.A01
            r0.A0C(r1)
            goto L_0x0040
        L_0x006f:
            java.lang.String r0 = "shadow_bind"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0040
        L_0x0077:
            if (r5 == 0) goto L_0x0040
            X.9xT r2 = r2.A00
            java.lang.String r1 = X.C197909xT.A00(r5)
            java.lang.String r0 = "no_surface"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0040
            X.19a r0 = r2.A01
            r0.A08(r1)
            goto L_0x0040
        L_0x008d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: WaExtensions evaluate: action="
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r9, r2)
            java.lang.String r0 = "Whatsapp"
            android.util.Log.d(r0, r2)
            int r0 = r9.hashCode()
            switch(r0) {
                case -1560255199: goto L_0x00f5;
                case -1120004527: goto L_0x00aa;
                case -246975243: goto L_0x00b4;
                case 51260781: goto L_0x00be;
                case 268909162: goto L_0x00c7;
                case 1206046387: goto L_0x00d0;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            X.B6x r0 = r6.A00
            java.lang.Object r2 = r0.BKe(r7, r8, r9)
            return r2
        L_0x00aa:
            java.lang.String r0 = "wa.action.novi.EncryptLogEventV2"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00a3
            r0 = 1
            goto L_0x00d9
        L_0x00b4:
            java.lang.String r0 = "wa.action.novi.EncryptLogEvent"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00a3
            r0 = 2
            goto L_0x00d9
        L_0x00be:
            java.lang.String r0 = "wa.action.CheckCardNumber"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00e3
            goto L_0x00a3
        L_0x00c7:
            java.lang.String r0 = "wa.action.CheckCpfCnpj"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00ec
            goto L_0x00a3
        L_0x00d0:
            java.lang.String r0 = "wa.action.novi.GetDataEnv"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00a3
            r0 = 5
        L_0x00d9:
            r2 = 0
            switch(r0) {
                case 3: goto L_0x00e3;
                case 4: goto L_0x00ec;
                case 5: goto L_0x0041;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            java.util.List r0 = r7.A00
            r0.get(r1)
            return r2
        L_0x00e3:
            java.lang.String r0 = X.AnonymousClass8BT.A0t(r7, r1)
            boolean r0 = X.A61.A01(r0)
            goto L_0x0105
        L_0x00ec:
            java.lang.String r0 = X.AnonymousClass8BT.A0t(r7, r1)
            boolean r0 = X.A61.A00(r0)
            goto L_0x0105
        L_0x00f5:
            java.lang.String r0 = "wa.action.CheckPin"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = X.AnonymousClass8BT.A0t(r7, r1)
            boolean r0 = X.A61.A02(r0)
        L_0x0105:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALP.BKe(X.9zJ, X.CkC, java.lang.String):java.lang.Object");
    }

    public ALP(C22415B6x b6x, B4y b4y, AnonymousClass9YL r3) {
        this.A00 = b6x;
        this.A01 = b4y;
        this.A02 = r3;
    }
}
