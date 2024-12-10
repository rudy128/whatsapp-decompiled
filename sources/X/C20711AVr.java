package X;

/* renamed from: X.AVr  reason: case insensitive filesystem */
public final class C20711AVr implements C25471Oi, AnonymousClass3M6 {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ac, code lost:
        if (r1.length() != 0) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A00, 11921) != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (((X.C166398cp) r2.format_).interactiveMessageCase_ == 7) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f4, code lost:
        if (r3 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0100, code lost:
        if (r3.equals(r1) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        if (r1 != null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0142, code lost:
        if (r0.contains(r1) != false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A00(X.C166418cr r7, X.C63362sw r8, int r9) {
        /*
            r6 = this;
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r0 = 10
            if (r9 >= r0) goto L_0x023a
            java.util.List r0 = X.AnonymousClass9TP.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r1 = r2.next()
            X.9qi r1 = (X.C193819qi) r1
            X.1Di r0 = r1.A01
            java.lang.Object r0 = r0.invoke(r7)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x000e
            X.1Di r0 = r1.A00
            java.lang.Object r1 = r0.invoke(r7)
            X.8cr r1 = (X.C166418cr) r1
            int r0 = r9 + 1
            java.lang.Integer r1 = r6.A00(r1, r8, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x000e
            return r1
        L_0x0039:
            if (r9 == 0) goto L_0x0047
            X.0ve r2 = r6.A00
            r1 = 11921(0x2e91, float:1.6705E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01bc
        L_0x0047:
            java.lang.Class<X.AVy> r0 = X.C20718AVy.class
            X.B5K r5 = X.C63362sw.A00(r8, r0)
            X.AVy r5 = (X.C20718AVy) r5
            boolean r0 = r7.A0R()
            if (r0 == 0) goto L_0x00b9
            X.8ck r2 = r7.templateMessage_
            if (r2 != 0) goto L_0x005b
            X.8ck r2 = X.C166348ck.DEFAULT_INSTANCE
        L_0x005b:
            int r1 = r2.formatCase_
            r0 = 5
            if (r1 != r0) goto L_0x00b9
            java.lang.Object r0 = r2.format_
            X.8cp r0 = (X.C166398cp) r0
            int r1 = r0.interactiveMessageCase_
            r0 = 7
            if (r1 != r0) goto L_0x00b9
        L_0x0069:
            X.00H r0 = r6.A02
            java.lang.Object r2 = r0.get()
            X.1l7 r2 = (X.C34811l7) r2
            X.9ul r0 = r2.A01(r7)
            if (r0 == 0) goto L_0x00b6
            java.lang.String r1 = r0.A07()
            if (r1 == 0) goto L_0x00b6
            X.00H r0 = r2.A09
            java.lang.Object r0 = r0.get()
            X.9ne r0 = (X.C192029ne) r0
            X.9ul r0 = r0.A00(r7, r1)
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r0 instanceof X.C170018ny
            if (r0 == 0) goto L_0x00b6
            r1 = 0
            com.whatsapp.jid.UserJid r0 = r8.A05()
            if (r0 == 0) goto L_0x00aa
            X.8cp r0 = X.A89.A00(r7)
            java.lang.String r0 = X.AnonymousClass8BX.A0b(r0, r1)
            java.util.HashMap r1 = X.A3M.A01(r0)
            java.lang.String r0 = "flow_message_version"
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x00b6
        L_0x00aa:
            java.lang.String r0 = "NfmIncomingMessageListener/validateNativeFlowMessage Extensions Flow id is not owned by the sender jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r1 = X.AnonymousClass00R.A0u
        L_0x00b1:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x01bc
            return r1
        L_0x00b6:
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            goto L_0x00b1
        L_0x00b9:
            boolean r0 = r8.A0S
            if (r0 == 0) goto L_0x00cd
            r3 = 4194304(0x400000, double:2.0722615E-317)
            long r1 = r8.A05
            long r1 = r1 & r3
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00cd
            int r0 = r7.bitField1_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0069
        L_0x00cd:
            X.00H r4 = r6.A02
            java.lang.Object r0 = r4.get()
            X.1l7 r0 = (X.C34811l7) r0
            r2 = 0
            if (r5 == 0) goto L_0x0106
            java.lang.String r3 = r5.A01
        L_0x00da:
            X.9ul r0 = r0.A01(r7)
            if (r0 == 0) goto L_0x0104
            java.lang.String r1 = r0.A07()
        L_0x00e4:
            if (r3 == 0) goto L_0x00ec
            int r0 = r3.length()
            if (r0 != 0) goto L_0x00f6
        L_0x00ec:
            if (r1 == 0) goto L_0x0069
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0069
            if (r3 == 0) goto L_0x0108
        L_0x00f6:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0108
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x0108
            goto L_0x0069
        L_0x0104:
            r1 = 0
            goto L_0x00e4
        L_0x0106:
            r3 = r2
            goto L_0x00da
        L_0x0108:
            java.lang.Object r3 = r4.get()
            X.1l7 r3 = (X.C34811l7) r3
            if (r5 == 0) goto L_0x0112
            java.lang.String r2 = r5.A01
        L_0x0112:
            X.9ul r0 = r3.A01(r7)
            if (r0 == 0) goto L_0x01b0
            java.lang.String r1 = r0.A07()
        L_0x011c:
            if (r2 == 0) goto L_0x01a6
            int r0 = r2.length()
            if (r0 == 0) goto L_0x01a6
            if (r1 == 0) goto L_0x0144
        L_0x0126:
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0144
            if (r2 == 0) goto L_0x0144
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0144
            java.util.Map r0 = r3.A00
            java.lang.Object r0 = r0.get(r2)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0144
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0069
        L_0x0144:
            java.lang.String r0 = "mixed"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0154
            java.lang.String r0 = "quick_reply"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b3
        L_0x0154:
            java.lang.String r0 = "cta_url"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "cta_call"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "voice_call"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "cta_copy"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "menu_options"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "cta_reminder"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "view_product"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "cta_app_link"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "galaxy_message"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            if (r1 == 0) goto L_0x0069
            int r0 = r1.length()
            if (r0 != 0) goto L_0x01b3
            goto L_0x0069
        L_0x01a6:
            if (r1 == 0) goto L_0x0069
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0126
            goto L_0x0069
        L_0x01b0:
            r1 = 0
            goto L_0x011c
        L_0x01b3:
            java.lang.String r0 = "NfmIncomingMessageListener/validateNativeFlowMessage Native flow name in envelope and proto must be consistent or an identified pair"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r1 = X.AnonymousClass00R.A0j
            goto L_0x00b1
        L_0x01bc:
            int r0 = r7.bitField1_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01ef
            java.lang.Class<X.AVy> r0 = X.C20718AVy.class
            X.B5K r0 = X.C63362sw.A00(r8, r0)
            X.AVy r0 = (X.C20718AVy) r0
            if (r0 == 0) goto L_0x01ed
            java.lang.Integer r0 = r0.A00
        L_0x01ce:
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            if (r0 == r2) goto L_0x01ef
            X.8bs r0 = r7.buttonsMessage_
            r1 = r0
            if (r0 != 0) goto L_0x01d9
            X.8bs r0 = X.C165858bs.DEFAULT_INSTANCE
        L_0x01d9:
            X.EE9 r0 = r0.buttons_
            if (r0 == 0) goto L_0x01ef
            if (r1 != 0) goto L_0x01e1
            X.8bs r1 = X.C165858bs.DEFAULT_INSTANCE
        L_0x01e1:
            X.EE9 r0 = r1.buttons_
            X.C18070vi.A0X(r0)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x01ef
            return r2
        L_0x01ed:
            r0 = 0
            goto L_0x01ce
        L_0x01ef:
            int r1 = r7.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x020d
            java.lang.Class<X.AVy> r0 = X.C20718AVy.class
            X.B5K r0 = X.C63362sw.A00(r8, r0)
            X.AVy r0 = (X.C20718AVy) r0
            if (r0 == 0) goto L_0x020b
            java.lang.Integer r0 = r0.A00
        L_0x0206:
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            if (r0 == r2) goto L_0x020d
            return r2
        L_0x020b:
            r0 = 0
            goto L_0x0206
        L_0x020d:
            boolean r0 = r7.A0R()
            if (r0 != 0) goto L_0x0219
            int r0 = r7.bitField0_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0232
        L_0x0219:
            java.lang.Class<X.AVy> r0 = X.C20718AVy.class
            X.B5K r0 = X.C63362sw.A00(r8, r0)
            X.AVy r0 = (X.C20718AVy) r0
            if (r0 == 0) goto L_0x0235
            java.lang.Integer r1 = r0.A00
        L_0x0225:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0237
            r3 = 32
            long r1 = r8.A05
            long r1 = r1 & r3
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0237
        L_0x0232:
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            return r2
        L_0x0235:
            r1 = 0
            goto L_0x0225
        L_0x0237:
            java.lang.Integer r2 = X.AnonymousClass00R.A0Y
            return r2
        L_0x023a:
            java.lang.String r0 = "NfmIncomingMessageListener/validateNativeFlowMessage: Nested messages depth exceeded"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20711AVr.A00(X.8cr, X.2sw, int):java.lang.Integer");
    }

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r2 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r7.A0K("hsm") != null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ X.B5K CBD(X.C194979sb r6, X.C29621ca r7) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.String r0 = "biz"
            X.1ca r4 = r7.A0K(r0)
            if (r4 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            r3 = r4
            java.lang.String r0 = "interactive"
            X.1ca r2 = r4.A0K(r0)
            if (r2 == 0) goto L_0x005c
            java.lang.String r0 = "type"
            java.lang.String r0 = X.C29621ca.A02(r2, r0)
            java.lang.String r1 = "native_flow"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005c
            X.1ca r3 = r2.A0K(r1)
            if (r3 == 0) goto L_0x005a
            java.lang.String r0 = "name"
        L_0x002d:
            java.lang.String r2 = X.C29621ca.A02(r3, r0)
            if (r2 != 0) goto L_0x004b
        L_0x0033:
            java.lang.String r0 = "buttons"
            X.1ca r0 = r4.A0K(r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "list"
            X.1ca r0 = r4.A0K(r0)
            if (r0 == 0) goto L_0x0057
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
        L_0x0045:
            X.AVy r0 = new X.AVy
            r0.<init>(r2, r1)
            return r0
        L_0x004b:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r2 == 0) goto L_0x0045
            java.lang.String r0 = "hsm"
            X.1ca r0 = r7.A0K(r0)
            if (r0 == 0) goto L_0x0045
        L_0x0057:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x0045
        L_0x005a:
            r2 = 0
            goto L_0x0033
        L_0x005c:
            java.lang.String r0 = "native_flow_name"
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20711AVr.CBD(X.9sb, X.1ca):X.B5K");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01eb, code lost:
        if (r5.mediaCase_ != 8) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        if (r6 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024a A[Catch:{ JSONException -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x025e A[Catch:{ JSONException -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0337  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B5I Bvs(X.C166418cr r29, X.C63362sw r30, boolean r31) {
        /*
            r28 = this;
            r11 = r29
            r10 = r30
            boolean r0 = X.C18070vi.A15(r10, r11)
            if (r31 == 0) goto L_0x00e1
            r4 = r28
            java.lang.Integer r2 = r4.A00(r11, r10, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r2 == r0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NfmIncomingMessageListener/onIncomingMessageDecrypted: NFM message is invalid, result="
            r1.append(r0)
            if (r2 == 0) goto L_0x0045
            int r0 = r2.intValue()
            switch(r0) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.String r0 = "Valid"
        L_0x0028:
            X.C17890vO.A19(r1, r0)
            X.AVc r0 = new X.AVc
            r0.<init>()
        L_0x0030:
            X.B5I r0 = (X.B5I) r0
            return r0
        L_0x0033:
            java.lang.String r0 = "InvalidFlowNotOwned"
            goto L_0x0028
        L_0x0036:
            java.lang.String r0 = "InvalidInconsistentFlowName"
            goto L_0x0028
        L_0x0039:
            java.lang.String r0 = "InvalidTemplateMessage"
            goto L_0x0028
        L_0x003c:
            java.lang.String r0 = "InvalidListMessage"
            goto L_0x0028
        L_0x003f:
            java.lang.String r0 = "InvalidButtonMessage"
            goto L_0x0028
        L_0x0042:
            java.lang.String r0 = "InvalidDeeplyNested"
            goto L_0x0028
        L_0x0045:
            java.lang.String r0 = "null"
            goto L_0x0028
        L_0x0048:
            X.00H r0 = r4.A02
            java.lang.Object r2 = r0.get()
            X.1l7 r2 = (X.C34811l7) r2
            X.9ul r0 = r2.A01(r11)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r1 = r0.A07()
            if (r1 == 0) goto L_0x00e1
            X.00H r0 = r2.A09
            java.lang.Object r0 = r0.get()
            X.9ne r0 = (X.C192029ne) r0
            X.9ul r3 = r0.A00(r11, r1)
            if (r3 == 0) goto L_0x00e1
            boolean r0 = r3 instanceof X.C169998nv
            if (r0 == 0) goto L_0x00f3
            X.8nv r3 = (X.C169998nv) r3
            X.0ve r2 = r4.A00
            r1 = 3754(0xeaa, float:5.26E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00e1
            X.8cp r2 = X.A89.A00(r11)
            X.C18070vi.A0X(r2)
            int r1 = r2.interactiveMessageCase_
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            r6 = 0
            if (r0 == 0) goto L_0x00ed
            X.8a7 r0 = r2.A0S()
            X.EE9 r0 = r0.buttons_
            java.util.Iterator r5 = X.AnonymousClass8BS.A0r(r0)
        L_0x0097:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.8Z3 r0 = (X.AnonymousClass8Z3) r0
            java.lang.String r1 = r0.name_
            java.lang.String r0 = "catalog_message"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0097
        L_0x00ae:
            X.8Z3 r2 = (X.AnonymousClass8Z3) r2
            if (r2 == 0) goto L_0x00e5
            int r0 = r2.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = r2.buttonParamsJson_
            java.lang.String r6 = X.C169998nv.A00(r3, r0)
            if (r6 != 0) goto L_0x00c5
        L_0x00c0:
            java.lang.String r0 = "NfmIncomingMessageListener/onIncomingMessageViewCatalogAction: phone is null!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00c5:
            X.00H r0 = r4.A01
            java.lang.Object r2 = r0.get()
            X.9ea r2 = (X.C186679ea) r2
            if (r6 != 0) goto L_0x00d1
            java.lang.String r6 = ""
        L_0x00d1:
            X.10I r1 = r2.A00
            r7 = 25
            X.AkN r0 = new X.AkN
            r4 = r2
            r5 = r11
            r2 = r0
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.CGF(r0)
        L_0x00e1:
            X.AVd r0 = X.C20697AVd.A00
            goto L_0x0030
        L_0x00e5:
            java.lang.String r0 = "ViewCatalogAction/extractBizPhone: cannot get phone number; either button or params json is not presented"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00c0
        L_0x00eb:
            r2 = r6
            goto L_0x00ae
        L_0x00ed:
            java.lang.String r0 = "ViewCatalogAction/extractBizPhone: cannot get phone number; no native flow message found"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00c0
        L_0x00f3:
            boolean r0 = r3 instanceof X.C170018ny
            if (r0 == 0) goto L_0x00e1
            X.8ny r3 = (X.C170018ny) r3
            com.whatsapp.jid.UserJid r4 = r10.A05()
            X.C17960vV.A07(r4)
            X.C18070vi.A0X(r4)
            X.8cp r0 = X.A89.A00(r11)
            X.8a7 r0 = r0.A0S()
            r8 = 0
            X.EE9 r0 = r0.buttons_
            java.lang.Object r0 = r0.get(r8)
            X.8Z3 r0 = (X.AnonymousClass8Z3) r0
            java.lang.String r0 = r0.buttonParamsJson_
            java.util.HashMap r9 = X.A3M.A01(r0)
            java.lang.String r7 = "flow_id"
            java.lang.Object r2 = r9.get(r7)
            X.AnonymousClass8BR.A1I(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = X.AnonymousClass9Q6.A00(r9)
            java.lang.String r14 = "mode"
            java.lang.Object r1 = r9.get(r14)
            java.lang.String r0 = "draft"
            boolean r17 = X.C18070vi.A18(r1, r0)
            r5 = 0
            if (r6 == 0) goto L_0x014d
            X.00H r0 = r3.A0D
            r0.get()
            java.lang.String r0 = "flow_action"
            java.lang.Object r1 = r9.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x01f0
            java.lang.String r1 = (java.lang.String) r1
        L_0x0149:
            boolean r8 = X.C20119A8c.A07(r6, r1)
        L_0x014d:
            X.00H r0 = r3.A0J
            java.lang.Object r0 = r0.get()
            X.1PM r0 = (X.AnonymousClass1PM) r0
            X.1yf r0 = r0.A02(r4)
            int r16 = X.AnonymousClass9Q5.A00(r0)
            java.lang.String r1 = "galaxy_message"
            X.8cp r5 = X.A89.A00(r11)
            X.C18070vi.A0X(r5)
            int r0 = r5.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01ed
            X.8bW r0 = r5.header_
            r5 = r0
            r12 = r0
            if (r0 != 0) goto L_0x0174
            X.8bW r0 = X.C165638bW.DEFAULT_INSTANCE
        L_0x0174:
            int r0 = r0.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01a6
            if (r5 != 0) goto L_0x017e
            X.8bW r12 = X.C165638bW.DEFAULT_INSTANCE
        L_0x017e:
            int r12 = r12.mediaCase_
            r0 = 3
            if (r12 != r0) goto L_0x01a6
            r27 = 8
        L_0x0185:
            X.8cp r0 = X.A89.A00(r11)
            X.8a7 r0 = r0.A0S()
            r5 = 0
            X.EE9 r0 = r0.buttons_
            java.lang.Object r0 = r0.get(r5)
            X.8Z3 r0 = (X.AnonymousClass8Z3) r0
            java.lang.String r15 = r0.buttonParamsJson_
            X.C18070vi.A0X(r15)
            java.lang.String r5 = r10.A0h
            org.json.JSONObject r13 = X.C17880vN.A15()
            java.util.HashMap r12 = X.C17880vN.A11()
            goto L_0x01f3
        L_0x01a6:
            r0 = r5
            r12 = r5
            if (r5 != 0) goto L_0x01ac
            X.8bW r0 = X.C165638bW.DEFAULT_INSTANCE
        L_0x01ac:
            int r0 = r0.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01be
            if (r5 != 0) goto L_0x01b6
            X.8bW r12 = X.C165638bW.DEFAULT_INSTANCE
        L_0x01b6:
            int r12 = r12.mediaCase_
            r0 = 4
            if (r12 != r0) goto L_0x01be
            r27 = 2
            goto L_0x0185
        L_0x01be:
            r0 = r5
            r12 = r5
            if (r5 != 0) goto L_0x01c4
            X.8bW r0 = X.C165638bW.DEFAULT_INSTANCE
        L_0x01c4:
            int r0 = r0.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01d6
            if (r5 != 0) goto L_0x01ce
            X.8bW r12 = X.C165638bW.DEFAULT_INSTANCE
        L_0x01ce:
            int r12 = r12.mediaCase_
            r0 = 7
            if (r12 != r0) goto L_0x01d6
            r27 = 3
            goto L_0x0185
        L_0x01d6:
            r0 = r5
            if (r5 != 0) goto L_0x01db
            X.8bW r0 = X.C165638bW.DEFAULT_INSTANCE
        L_0x01db:
            int r0 = r0.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01ed
            if (r5 != 0) goto L_0x01e5
            X.8bW r5 = X.C165638bW.DEFAULT_INSTANCE
        L_0x01e5:
            int r5 = r5.mediaCase_
            r0 = 8
            r27 = 6
            if (r5 == r0) goto L_0x0185
        L_0x01ed:
            r27 = 1
            goto L_0x0185
        L_0x01f0:
            r1 = r5
            goto L_0x0149
        L_0x01f3:
            java.lang.String r0 = "cta"
            r13.put(r0, r1)     // Catch:{ JSONException -> 0x021d }
            java.util.HashMap r12 = X.A3M.A01(r15)     // Catch:{ JSONException -> 0x021d }
            java.lang.Object r0 = r12.get(r7)     // Catch:{ JSONException -> 0x021d }
            r13.put(r7, r0)     // Catch:{ JSONException -> 0x021d }
            java.lang.String r15 = "extensions_message_id"
            X.A4O r7 = X.A4O.A00     // Catch:{ JSONException -> 0x021d }
            X.00H r0 = r3.A0K     // Catch:{ JSONException -> 0x021d }
            java.lang.Object r1 = X.C18070vi.A0E(r0)     // Catch:{ JSONException -> 0x021d }
            X.9uT r1 = (X.C196109uT) r1     // Catch:{ JSONException -> 0x021d }
            r0 = 0
            java.lang.String r0 = r7.A01(r1, r5, r0)     // Catch:{ JSONException -> 0x021d }
            r13.put(r15, r0)     // Catch:{ JSONException -> 0x021d }
            java.lang.String r0 = "is_flow_message_with_payload"
            r13.put(r0, r8)     // Catch:{ JSONException -> 0x021d }
            goto L_0x0223
        L_0x021d:
            r1 = move-exception
            java.lang.String r0 = "FlowsLogger/FlowsAction/sendMessageReceiveWamEvent()  exception in parsing json"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0223:
            boolean r7 = r11.A0R()
            java.lang.Class<X.AVx> r0 = X.C20717AVx.class
            X.B5K r0 = X.C63362sw.A00(r10, r0)
            X.AVx r0 = (X.C20717AVx) r0
            if (r0 == 0) goto L_0x0234
            java.lang.String r1 = r0.A01
            goto L_0x0235
        L_0x0234:
            r1 = 0
        L_0x0235:
            java.lang.String r0 = "is_template"
            r13.put(r0, r7)     // Catch:{ JSONException -> 0x0240 }
            java.lang.String r0 = "hsm_tag"
            r13.put(r0, r1)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x0244
        L_0x0240:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0244:
            java.lang.String r1 = X.C108945cZ.A1G(r14, r12)     // Catch:{ JSONException -> 0x0261 }
            if (r1 == 0) goto L_0x025e
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ JSONException -> 0x0261 }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r1 = r1.toUpperCase(r0)     // Catch:{ JSONException -> 0x0261 }
            X.C18070vi.A0X(r1)     // Catch:{ JSONException -> 0x0261 }
        L_0x0258:
            java.lang.String r0 = "extension_status"
            r13.put(r0, r1)     // Catch:{ JSONException -> 0x0261 }
            goto L_0x0265
        L_0x025e:
            java.lang.String r1 = "PUBLISHED"
            goto L_0x0258
        L_0x0261:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0265:
            X.00H r0 = r3.A03
            java.lang.Object r0 = r0.get()
            X.1eX r0 = (X.C30801eX) r0
            X.2nM r0 = r0.A03(r4)
            if (r0 == 0) goto L_0x0333
            java.lang.String r11 = r0.A08
            java.lang.String r12 = r0.A05
        L_0x0277:
            X.00H r0 = r3.A0P
            java.lang.Object r1 = r0.get()
            X.9eg r1 = (X.C186739eg) r1
            java.lang.String r23 = r13.toString()
            java.lang.Integer r21 = java.lang.Integer.valueOf(r16)
            X.00H r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.9o1 r0 = (X.C192229o1) r0
            java.lang.Integer r22 = r0.A00(r4)
            r26 = 4
            X.10I r10 = r1.A03
            r7 = 0
            X.AkA r0 = new X.AkA
            r24 = r11
            r25 = r12
            r20 = r4
            r18 = r0
            r19 = r1
            r18.<init>((X.C186739eg) r19, (com.whatsapp.jid.Jid) r20, (java.lang.Integer) r21, (java.lang.Integer) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (int) r26, (int) r27)
            r10.CGF(r0)
            X.00H r0 = r3.A0N
            java.lang.Object r10 = r0.get()
            X.9lC r10 = (X.C190589lC) r10
            r1 = 2
            r0 = r17
            r10.A00(r2, r0, r1)
            X.00H r11 = r3.A00
            X.0vd r1 = X.C17880vN.A0P(r11)
            r0 = 8552(0x2168, float:1.1984E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r1, r0)
            if (r0 == 0) goto L_0x02d3
            X.00H r0 = r3.A0A
            java.lang.Object r0 = r0.get()
            X.9mO r0 = (X.C191319mO) r0
            r0.A00(r5, r2)
        L_0x02d3:
            X.00H r0 = r3.A02
            java.lang.Object r0 = r0.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1E7 r0 = r0.A0E(r4)
            if (r0 == 0) goto L_0x0337
            X.1yf r0 = r0.A0G
            if (r0 == 0) goto L_0x0337
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0337
            X.0vd r1 = X.C17880vN.A0P(r11)
            r0 = 10130(0x2792, float:1.4195E-41)
            boolean r0 = X.C18020vd.A05(r10, r1, r0)
            if (r0 == 0) goto L_0x0337
            java.lang.String r1 = "flow_metadata"
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x0337
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>"
            X.C18070vi.A0z(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            X.B1J r0 = new X.B1J
            r0.<init>(r3, r2, r1)
            X.84U r1 = X.AnonymousClass84U.A00(r0)
            X.00H r0 = r3.A0K
            java.lang.Object r0 = r0.get()
            X.9uT r0 = (X.C196109uT) r0
            java.lang.String r4 = X.C18070vi.A0H(r1)
            X.C18070vi.A0d(r2, r7)
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r3 = X.C17890vO.A0A(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "extensions_metadata_v2_"
            X.AnonymousClass8BX.A0z(r3, r0, r2, r4, r1)
            goto L_0x00e1
        L_0x0333:
            r11 = 0
            r12 = r11
            goto L_0x0277
        L_0x0337:
            X.9ph r12 = X.AnonymousClass9Q7.A00(r5, r2)
            if (r6 == 0) goto L_0x00e1
            r9 = 60000(0xea60, double:2.9644E-319)
            X.0vd r1 = X.C17880vN.A0P(r11)
            r0 = 2891(0xb4b, float:4.051E-42)
            if (r8 == 0) goto L_0x034a
            r0 = 4849(0x12f1, float:6.795E-42)
        L_0x034a:
            long r0 = X.AnonymousClass8BR.A05(r1, r0)
            long r0 = r0 * r9
            if (r17 != 0) goto L_0x00e1
            X.00H r9 = r3.A06
            X.A5U r8 = X.AnonymousClass8BR.A0S(r9)
            X.A1Y r0 = r8.A02(r2, r0)
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x00e1
            X.00H r10 = r3.A0C
            X.8sh r1 = X.AnonymousClass8BR.A0U(r10)
            r22 = 0
            java.lang.String r0 = "message_receive_integrity_check"
            int r8 = r1.A0E(r4, r0)
            X.A6h r13 = X.AnonymousClass8BR.A0V(r10)
            r14 = r4
            r15 = r5
            r16 = r22
            r17 = r2
            r18 = r8
            r13.A09(r14, r15, r16, r17, r18)
            X.A6h r1 = X.AnonymousClass8BR.A0V(r10)
            java.lang.String r0 = "fetch_cache_hit"
            r1.A07(r8, r0, r7)
            X.A5U r18 = X.AnonymousClass8BR.A0S(r9)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r8)
            X.ASB r9 = new X.ASB
            r16 = r5
            r10 = r3
            r11 = r4
            r13 = r6
            r14 = r2
            r17 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r19 = r9
            r23 = r22
            r24 = r2
            r25 = r7
            r18.A04(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20711AVr.Bvs(X.8cr, X.2sw, boolean):X.B5I");
    }

    public C20711AVr(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public String BSr() {
        return "NfmIncomingMessageListener";
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }
}
