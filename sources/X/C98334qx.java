package X;

/* renamed from: X.4qx  reason: invalid class name and case insensitive filesystem */
public class C98334qx implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;

    public C98334qx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C21132Af0 af0, Object obj, int i) {
        af0.A09(new C98334qx(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0223, code lost:
        r0.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0226, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026d, code lost:
        if (r2 == false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0289, code lost:
        if (r2 == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x029f, code lost:
        if (r1 != 404) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        if (r4.A0J.A0J(r3) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0174, code lost:
        if (r1 != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0179, code lost:
        r4.CMl(r5.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0180, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0146;
                case 1: goto L_0x011b;
                case 2: goto L_0x024f;
                case 3: goto L_0x0227;
                case 4: goto L_0x00f9;
                case 5: goto L_0x021d;
                case 6: goto L_0x01ea;
                case 7: goto L_0x00aa;
                case 8: goto L_0x01e0;
                case 9: goto L_0x0082;
                case 10: goto L_0x0070;
                case 11: goto L_0x01cd;
                case 12: goto L_0x0062;
                case 13: goto L_0x0024;
                case 14: goto L_0x0187;
                case 15: goto L_0x0181;
                case 16: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A01
            com.whatsapp.settings.SettingsUserProxyViewModel r1 = (com.whatsapp.settings.SettingsUserProxyViewModel) r1
            int r0 = X.AnonymousClass000.A0M(r8)
            r1.A01 = r0
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r2 = r7.A01
            com.whatsapp.settings.SettingsUserProxyViewModel r2 = (com.whatsapp.settings.SettingsUserProxyViewModel) r2
            int r1 = X.AnonymousClass000.A0M(r8)
            r0 = 2
            if (r1 != r0) goto L_0x001f
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x000f
        L_0x001f:
            r0 = 0
            r2.A0W(r1, r0)
            return
        L_0x0024:
            java.lang.Object r0 = r7.A01
            X.48g r0 = (X.C825148g) r0
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.Object r4 = r0.A01
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            boolean r0 = r4.Bed()
            if (r0 != 0) goto L_0x000f
            X.1E7 r0 = r4.A0u
            com.whatsapp.jid.GroupJid r3 = X.AnonymousClass3MY.A0a(r0)
            X.0ve r2 = r4.A0E
            X.C17960vV.A07(r3)
            java.lang.String r1 = "group_info_report"
            boolean r0 = r8.booleanValue()
            X.6q6 r5 = new X.6q6
            r5.<init>(r2, r3, r1, r0)
            X.1CJ r0 = r4.A0H
            boolean r0 = r0.A0R(r3)
            if (r0 == 0) goto L_0x005b
            X.1MZ r0 = r4.A0J
            boolean r1 = r0.A0J(r3)
            r0 = 1
            if (r1 != 0) goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            r0 = r0 ^ 1
            r5.A08 = r0
            goto L_0x0179
        L_0x0062:
            java.lang.Object r1 = r7.A01
            java.util.List r1 = (java.util.List) r1
            X.4Ut r8 = (X.C87224Ut) r8
            int r0 = r8.A00
            if (r0 != 0) goto L_0x000f
            r1.add(r8)
            return
        L_0x0070:
            java.lang.Object r1 = r7.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x000f
            r1.run()
            return
        L_0x0082:
            java.lang.Object r3 = r7.A01
            X.3sj r3 = (X.C78393sj) r3
            X.4OY r8 = (X.AnonymousClass4OY) r8
            X.206 r0 = r8.A01
            X.205 r1 = r0.A0v
            android.widget.TextView r0 = r3.A05
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r2 = r8.A00
            X.73C r0 = r8.A04
            if (r0 != 0) goto L_0x00a5
            r1 = 0
        L_0x009f:
            java.util.List r0 = r8.A03
            X.C78393sj.A01(r3, r1, r0, r2)
            return
        L_0x00a5:
            java.lang.String r1 = r0.A02()
            goto L_0x009f
        L_0x00aa:
            java.lang.Object r5 = r7.A01
            X.3hT r5 = (X.C75423hT) r5
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            X.1FR r3 = r5.A03
            boolean r0 = r3.Bed()
            if (r0 != 0) goto L_0x000f
            X.0ve r6 = r5.A0E
            X.1BI r2 = r5.A0G
            java.lang.String r1 = "overflow_menu_report"
            boolean r0 = r8.booleanValue()
            X.6q6 r4 = new X.6q6
            r4.<init>(r6, r2, r1, r0)
            X.1E7 r2 = r5.A00
            X.1BI r0 = r2.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x00e2
            X.1CJ r1 = r5.A0D
            X.1BI r0 = r2.A0J
            X.1ci r1 = r1.A0A(r0)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x00e2
            X.2Dk r1 = (X.C46162Dk) r1
            r4.A01(r1)
        L_0x00e2:
            X.1CJ r1 = r5.A0D
            X.1E7 r0 = r5.A00
            X.1BI r0 = r0.A0J
            boolean r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x00f1
            r0 = 0
            r4.A08 = r0
        L_0x00f1:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r4.A00()
            r3.CMl(r0)
            return
        L_0x00f9:
            java.lang.Object r6 = r7.A01
            X.3PU r6 = (X.AnonymousClass3PU) r6
            boolean r5 = X.AnonymousClass000.A1Y(r8)
            r4 = 0
            X.1FU r0 = r6.getActivity()
            boolean r0 = r0.Bed()
            if (r0 != 0) goto L_0x000f
            X.0ve r3 = r6.getAbProps$app_product_community_community()
            X.1EC r2 = r6.A03
            if (r2 != 0) goto L_0x02c8
            java.lang.String r0 = "cagJid"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x011b:
            java.lang.Object r2 = r7.A01
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r2 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r2
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            X.3oo r1 = X.C76923oo.A00
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x0132
            r0 = 0
            r2.A01 = r0
            r2.A29()
            return
        L_0x0132:
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x000f
            com.google.android.material.textfield.TextInputEditText r0 = r2.A00
            if (r0 == 0) goto L_0x000f
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x000f
            r0.clear()
            return
        L_0x0146:
            java.lang.Object r0 = r7.A01
            X.48l r0 = (X.AnonymousClass48l) r0
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.Object r4 = r0.A01
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            boolean r0 = r4.Bed()
            if (r0 != 0) goto L_0x000f
            X.0ve r3 = r4.A0E
            com.whatsapp.jid.UserJid r2 = r4.A4l()
            java.lang.String r1 = "account_info_report"
            boolean r0 = r8.booleanValue()
            X.6q6 r5 = new X.6q6
            r5.<init>(r3, r2, r1, r0)
            boolean r0 = com.whatsapp.chatinfo.ContactInfoActivity.A1J(r4)
            if (r0 == 0) goto L_0x0176
            X.24e r0 = r4.A0F
            if (r0 == 0) goto L_0x0176
            boolean r1 = r0.A0J
            r0 = 1
            if (r1 == 0) goto L_0x0177
        L_0x0176:
            r0 = 0
        L_0x0177:
            r5.A04 = r0
        L_0x0179:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.A00()
            r4.CMl(r0)
            return
        L_0x0181:
            java.lang.Object r0 = r7.A01
            X.1DS r0 = (X.AnonymousClass1DS) r0
            goto L_0x0223
        L_0x0187:
            java.lang.Object r6 = r7.A01
            com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity r6 = (com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity) r6
            java.util.List r8 = (java.util.List) r8
            X.4Lu r5 = r6.A05
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            if (r8 == 0) goto L_0x01b7
            java.util.Iterator r3 = r8.iterator()
        L_0x0199:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01b7
            X.1E7 r2 = X.C17880vN.A0O(r3)
            X.00H r0 = r5.A00
            X.1pj r1 = X.AnonymousClass3MW.A0V(r0)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r2)
            boolean r0 = r1.A0P(r0)
            if (r0 != 0) goto L_0x0199
            r4.add(r2)
            goto L_0x0199
        L_0x01b7:
            X.1Me r2 = r6.A08
            X.0vb r1 = r6.A0F
            X.C18070vi.A0j(r2, r1)
            X.3qc r0 = new X.3qc
            r0.<init>(r2, r1)
            java.util.Collections.sort(r4, r0)
            r6.A58(r4)
            r0 = 0
            r6.A06 = r0
            return
        L_0x01cd:
            java.lang.Object r3 = r7.A01
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r2 = X.AnonymousClass000.A1Y(r8)
            r1 = 43
            X.7RK r0 = new X.7RK
            r0.<init>((int) r1, (java.lang.Object) r3, (boolean) r2)
            r3.runOnUiThread(r0)
            return
        L_0x01e0:
            java.lang.Object r0 = r7.A01
            X.3so r0 = (X.C78443so) r0
            X.4OY r8 = (X.AnonymousClass4OY) r8
            r0.A2j(r8)
            return
        L_0x01ea:
            java.lang.Object r3 = r7.A01
            X.2g1 r3 = (X.C55572g1) r3
            boolean r0 = r8 instanceof X.C46192Dn
            if (r0 == 0) goto L_0x0203
            X.11Q r0 = r3.A03
            r2 = 3
        L_0x01f5:
            android.content.SharedPreferences r0 = X.AnonymousClass11Q.A01(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            X.C17880vN.A1C(r1, r0, r2)
            return
        L_0x0203:
            java.util.Set r0 = X.C20126A8l.A09
            java.util.Iterator r2 = r0.iterator()
        L_0x0209:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0219
            java.lang.String r1 = X.C17880vN.A0v(r2)
            X.1TS r0 = r3.A04
            r0.A03(r1)
            goto L_0x0209
        L_0x0219:
            X.11Q r0 = r3.A03
            r2 = 0
            goto L_0x01f5
        L_0x021d:
            java.lang.Object r0 = r7.A01
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r0 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r0
            X.1wy r0 = r0.A0S
        L_0x0223:
            r0.A0F(r8)
            return
        L_0x0227:
            java.lang.Object r4 = r7.A01
            X.3VM r4 = (X.AnonymousClass3VM) r4
            X.1DT r1 = r4.A0E
            r0 = 2
            X.AnonymousClass3MX.A1K(r1, r0)
            X.1DT r3 = r4.A0F
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 2131886549(0x7f1201d5, float:1.940768E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            X.C87634Wi.A00(r3, r2, r0, r1)
            r0 = 1
            X.AnonymousClass3VM.A05(r4, r0)
            X.1kb r2 = r4.A0J
            X.1EC r1 = r4.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0K(r1, r0)
            return
        L_0x024f:
            java.lang.Object r5 = r7.A01
            X.3VM r5 = (X.AnonymousClass3VM) r5
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            boolean r0 = r8 instanceof X.C83134Dy
            r4 = 0
            if (r0 == 0) goto L_0x028c
            X.4Dy r8 = (X.C83134Dy) r8
            X.4Dd r0 = r8.error
            boolean r2 = r0.isRecoverable
            int r1 = r0.code
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0286
            r0 = 423(0x1a7, float:5.93E-43)
            if (r1 == r0) goto L_0x0286
            r3 = 2131891053(0x7f12136d, float:1.9416815E38)
            if (r2 != 0) goto L_0x0278
        L_0x026f:
            r3 = 2131891052(0x7f12136c, float:1.9416813E38)
        L_0x0272:
            X.1DT r1 = r5.A0E
            r0 = 7
            X.AnonymousClass3MX.A1K(r1, r0)
        L_0x0278:
            X.1DT r2 = r5.A0F
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131100447(0x7f06031f, float:1.7813276E38)
            X.C87634Wi.A00(r2, r1, r0, r3)
        L_0x0282:
            X.AnonymousClass3VM.A05(r5, r4)
            return
        L_0x0286:
            r3 = 2131891054(0x7f12136e, float:1.9416817E38)
            if (r2 != 0) goto L_0x0278
            goto L_0x0272
        L_0x028c:
            boolean r0 = r8 instanceof X.C83144Dz
            if (r0 == 0) goto L_0x02a6
            X.4Dz r8 = (X.C83144Dz) r8
            X.4DW r0 = r8.error
            int r1 = r0.code
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x02a2
            r0 = 404(0x194, float:5.66E-43)
            r3 = 2131891056(0x7f121370, float:1.9416821E38)
            if (r1 == r0) goto L_0x0272
            goto L_0x026f
        L_0x02a2:
            r3 = 2131891055(0x7f12136f, float:1.941682E38)
            goto L_0x0272
        L_0x02a6:
            boolean r0 = r8 instanceof X.AnonymousClass4E0
            if (r0 == 0) goto L_0x02be
            X.1DT r1 = r5.A0E
            r0 = 7
            X.AnonymousClass3MX.A1K(r1, r0)
            X.1DT r3 = r5.A0F
            r2 = 2131891052(0x7f12136c, float:1.9416813E38)
        L_0x02b5:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131100447(0x7f06031f, float:1.7813276E38)
            X.C87634Wi.A00(r3, r1, r0, r2)
            goto L_0x0282
        L_0x02be:
            boolean r0 = r8 instanceof X.AnonymousClass4E1
            if (r0 == 0) goto L_0x0282
            X.1DT r3 = r5.A0F
            r2 = 2131891053(0x7f12136d, float:1.9416815E38)
            goto L_0x02b5
        L_0x02c8:
            java.lang.String r1 = "group_info_report"
            X.6q6 r0 = new X.6q6
            r0.<init>(r3, r2, r1, r5)
            r0.A08 = r4
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r0.A00()
            X.1FU r0 = r6.getActivity()
            r0.CMl(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98334qx.accept(java.lang.Object):void");
    }
}
