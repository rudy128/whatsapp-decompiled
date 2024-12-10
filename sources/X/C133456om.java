package X;

/* renamed from: X.6om  reason: invalid class name and case insensitive filesystem */
public final class C133456om {
    public final AnonymousClass18K A00;

    public C133456om(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r6 != 3) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r4, int r5, int r6) {
        /*
            r3 = this;
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WfacLogger/logBanAction for "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", source "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", launchSource "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " and banReason "
            r1.append(r0)
            X.C108995ce.A1O(r1, r2)
            X.62q r2 = new X.62q
            r2.<init>()
            java.lang.String r0 = "banned"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0066
            r0 = 1
        L_0x0033:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0037:
            r2.A01 = r1
            r1 = 1
            if (r5 == 0) goto L_0x0043
            r0 = 2
            if (r5 == r1) goto L_0x0064
            r1 = 3
            if (r5 == r0) goto L_0x0043
            r1 = 4
        L_0x0043:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
            r1 = 4
            r0 = 1
            if (r6 == r0) goto L_0x005f
            r1 = 2
            if (r6 == r1) goto L_0x0053
            r0 = 3
            if (r6 == r0) goto L_0x005f
        L_0x0053:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0057:
            r2.A02 = r0
            X.18K r0 = r3.A00
            r0.CC7(r2)
            return
        L_0x005f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0057
        L_0x0064:
            r1 = 2
            goto L_0x0043
        L_0x0066:
            java.lang.String r0 = "unbanned"
            boolean r0 = r4.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0037
            r0 = 2
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133456om.A00(java.lang.String, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WfacLogger/logBanAction for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", source "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " and launchSource "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r7)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.62r r2 = new X.62r
            r2.<init>()
            int r0 = r5.hashCode()
            switch(r0) {
                case -1485908803: goto L_0x00ae;
                case -1183303787: goto L_0x00a6;
                case -283300949: goto L_0x009e;
                case -128660402: goto L_0x0095;
                case 419043773: goto L_0x008d;
                case 734040229: goto L_0x0084;
                case 783475687: goto L_0x007c;
                case 1042768158: goto L_0x0074;
                case 1726877999: goto L_0x006b;
                case 1972642484: goto L_0x0063;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = 0
        L_0x002b:
            r2.A02 = r0
            r1 = 1
            if (r6 == 0) goto L_0x0037
            r0 = 2
            if (r6 == r1) goto L_0x0061
            r1 = 3
            if (r6 == r0) goto L_0x0037
            r1 = 4
        L_0x0037:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
            r3 = 4
            r1 = 1
            if (r7 == r1) goto L_0x005c
            r0 = 2
            if (r7 == r0) goto L_0x0057
            r1 = 3
            if (r7 == r1) goto L_0x0052
            if (r7 == r3) goto L_0x0057
            r0 = 0
        L_0x004a:
            r2.A01 = r0
            X.18K r0 = r4.A00
            r0.CC7(r2)
            return
        L_0x0052:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x004a
        L_0x0057:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x004a
        L_0x005c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x004a
        L_0x0061:
            r1 = 2
            goto L_0x0037
        L_0x0063:
            java.lang.String r0 = "ban_decision_received"
            boolean r1 = r5.equals(r0)
            r0 = 3
            goto L_0x00b5
        L_0x006b:
            java.lang.String r0 = "account_verification_started"
            boolean r1 = r5.equals(r0)
            r0 = 8
            goto L_0x00b5
        L_0x0074:
            java.lang.String r0 = "redirect_to_source_app"
            boolean r1 = r5.equals(r0)
            r0 = 6
            goto L_0x00b5
        L_0x007c:
            java.lang.String r0 = "tos_link_opened"
            boolean r1 = r5.equals(r0)
            r0 = 7
            goto L_0x00b5
        L_0x0084:
            java.lang.String r0 = "account_switched"
            boolean r1 = r5.equals(r0)
            r0 = 9
            goto L_0x00b5
        L_0x008d:
            java.lang.String r0 = "show_ban_decision_screen"
            boolean r1 = r5.equals(r0)
            r0 = 2
            goto L_0x00b5
        L_0x0095:
            java.lang.String r0 = "account_removed"
            boolean r1 = r5.equals(r0)
            r0 = 10
            goto L_0x00b5
        L_0x009e:
            java.lang.String r0 = "show_ban_info_screen"
            boolean r1 = r5.equals(r0)
            r0 = 1
            goto L_0x00b5
        L_0x00a6:
            java.lang.String r0 = "reg_new_number_started"
            boolean r1 = r5.equals(r0)
            r0 = 5
            goto L_0x00b5
        L_0x00ae:
            java.lang.String r0 = "notification_shown"
            boolean r1 = r5.equals(r0)
            r0 = 4
        L_0x00b5:
            if (r1 == 0) goto L_0x002a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133456om.A01(java.lang.String, int, int):void");
    }
}
