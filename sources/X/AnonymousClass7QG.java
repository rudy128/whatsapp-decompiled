package X;

/* renamed from: X.7QG  reason: invalid class name */
public class AnonymousClass7QG implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public AnonymousClass7QG(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A06 = str;
        this.A01 = i;
        this.A04 = obj3;
        this.A05 = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0366  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0258;
                case 1: goto L_0x00dc;
                case 2: goto L_0x029b;
                case 3: goto L_0x02bb;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r11 = r0.A02
            X.1x5 r11 = (X.C41801x5) r11
            java.lang.Object r9 = r0.A03
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Object r10 = r0.A04
            X.6Re r10 = (X.C122646Re) r10
            java.lang.Object r13 = r0.A05
            java.util.List r13 = (java.util.List) r13
            java.lang.String r12 = r0.A06
            int r14 = r0.A01
            X.7wf r8 = new X.7wf
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.6Re r6 = X.C122646Re.FACEBOOK
            r3 = 1
            r7 = 0
            if (r10 != r6) goto L_0x0040
            X.00H r0 = r11.A08
            java.lang.Object r0 = r0.get()
            X.Cir r0 = (X.C25611Cir) r0
            X.0vl r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.get()
            if (r0 < r3) goto L_0x0040
        L_0x003c:
            r8.invoke()
        L_0x003f:
            return
        L_0x0040:
            X.6Re r5 = X.C122646Re.INSTAGRAM
            if (r10 != r5) goto L_0x005b
            X.00H r0 = r11.A08
            java.lang.Object r0 = r0.get()
            X.Cir r0 = (X.C25611Cir) r0
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.get()
            if (r0 < r3) goto L_0x005b
            goto L_0x003c
        L_0x005b:
            int r2 = r10.ordinal()
            java.lang.String r1 = "CrosspostManager/maybeShowManualCrosspostNux invalid destination app"
            java.lang.String r0 = "Invalid destination app"
            if (r2 == r7) goto L_0x0075
            if (r2 == r3) goto L_0x006e
            X.C17960vV.A0F(r7, r0)
            X.C31081ez.A01(r1)
            return
        L_0x006e:
            r1 = 2131898386(0x7f123012, float:1.9431688E38)
            r0 = 2131898385(0x7f123011, float:1.9431686E38)
            goto L_0x007b
        L_0x0075:
            r1 = 2131898384(0x7f123010, float:1.9431684E38)
            r0 = 2131898383(0x7f12300f, float:1.9431682E38)
        L_0x007b:
            r4 = 0
            X.3Ri r3 = X.C73193Ri.A00(r9)
            r3.A0V(r1)
            r3.A0U(r0)
            r3.A0f(r7)
            r2 = 2131898388(0x7f123014, float:1.9431692E38)
            r1 = 38
            X.758 r0 = new X.758
            r0.<init>(r8, r1)
            r3.A0X(r0, r2)
            r0 = 2131898387(0x7f123013, float:1.943169E38)
            r3.A0W(r4, r0)
            X.AnonymousClass3MY.A1G(r3)
            if (r10 != r6) goto L_0x00bf
            X.00H r0 = r11.A08
            java.lang.Object r0 = r0.get()
            X.Cir r0 = (X.C25611Cir) r0
            android.content.SharedPreferences$Editor r2 = X.C108965cb.A02(r0)
            X.0vl r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r1 = r0.incrementAndGet()
            java.lang.String r0 = "fb_manual_xpost_nux_seen_count"
        L_0x00bb:
            X.C17880vN.A1C(r2, r0, r1)
            return
        L_0x00bf:
            if (r10 != r5) goto L_0x003f
            X.00H r0 = r11.A08
            java.lang.Object r0 = r0.get()
            X.Cir r0 = (X.C25611Cir) r0
            android.content.SharedPreferences$Editor r2 = X.C108965cb.A02(r0)
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r1 = r0.incrementAndGet()
            java.lang.String r0 = "ig_manual_xpost_nux_seen_count"
            goto L_0x00bb
        L_0x00dc:
            java.lang.String r1 = r0.A06
            java.lang.Object r4 = r0.A02
            X.5yP r4 = (X.C116655yP) r4
            java.lang.Object r9 = r0.A03
            java.util.TimerTask r9 = (java.util.TimerTask) r9
            java.lang.Object r13 = r0.A04
            android.content.Context r13 = (android.content.Context) r13
            java.lang.Object r5 = r0.A05
            X.206 r5 = (X.AnonymousClass206) r5
            int r3 = r0.A01
            boolean r11 = X.C108975cc.A1J(r9)
            r0 = 21
            android.net.TrafficStats.setThreadStatsTag(r0)
            r8 = 0
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x0323, all -> 0x0320 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0323, all -> 0x0320 }
            java.net.URLConnection r7 = r0.openConnection()     // Catch:{ Exception -> 0x0323, all -> 0x0320 }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.C18070vi.A0z(r7, r0)     // Catch:{ Exception -> 0x0323, all -> 0x0320 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Exception -> 0x0323, all -> 0x0320 }
            int r1 = r7.getResponseCode()     // Catch:{ Exception -> 0x031e }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x017a
            X.181 r1 = r4.A03     // Catch:{ Exception -> 0x031e }
            r0 = 5
            X.9Hb r8 = X.C108995ce.A0N(r1, r7, r0)     // Catch:{ Exception -> 0x031e }
            java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ Exception -> 0x031e }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x031e }
            r2.<init>(r8, r0)     // Catch:{ Exception -> 0x031e }
            boolean r0 = r2 instanceof java.io.BufferedReader     // Catch:{ Exception -> 0x031e }
            if (r0 == 0) goto L_0x0135
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch:{ Exception -> 0x031e }
        L_0x0126:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x031e }
            r1.<init>()     // Catch:{ Exception -> 0x031e }
        L_0x012b:
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x031e }
            if (r0 == 0) goto L_0x013e
            r1.append(r0)     // Catch:{ Exception -> 0x031e }
            goto L_0x012b
        L_0x0135:
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x031e }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x031e }
            r2 = r0
            goto L_0x0126
        L_0x013e:
            java.lang.String r0 = X.C18070vi.A0H(r1)     // Catch:{ Exception -> 0x031e }
            org.json.JSONObject r6 = X.C17880vN.A16(r0)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "deep_link_url"
            java.lang.String r2 = r6.optString(r0)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "fallback_url"
            java.lang.String r1 = r6.optString(r0)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "package_name"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ all -> 0x015e }
            X.6rm r6 = new X.6rm     // Catch:{ all -> 0x015e }
            r6.<init>(r2, r1, r0)     // Catch:{ all -> 0x015e }
            goto L_0x0163
        L_0x015e:
            r0 = move-exception
            X.1IU r6 = X.C108945cZ.A1J(r0)     // Catch:{ Exception -> 0x031e }
        L_0x0163:
            java.lang.Throwable r10 = X.C30671eK.A00(r6)     // Catch:{ Exception -> 0x031e }
            if (r10 == 0) goto L_0x0172
            X.190 r2 = r4.A01     // Catch:{ Exception -> 0x031e }
            java.lang.String r1 = "AppAction"
            java.lang.String r0 = "AppAction/getMetadataResponse can not parse response"
            r2.A0E(r1, r0, r10)     // Catch:{ Exception -> 0x031e }
        L_0x0172:
            boolean r0 = r6 instanceof X.AnonymousClass1IU     // Catch:{ Exception -> 0x031e }
            if (r0 == 0) goto L_0x0177
            r6 = 0
        L_0x0177:
            X.6rm r6 = (X.C135176rm) r6     // Catch:{ Exception -> 0x031e }
            goto L_0x017b
        L_0x017a:
            r6 = r8
        L_0x017b:
            r9.cancel()
            X.1KB r2 = r4.A02
            r1 = 18
            X.4rn r0 = new X.4rn
            r0.<init>((X.C116655yP) r4, (int) r1)
            r2.CGP(r0)
            if (r8 == 0) goto L_0x018f
            r8.close()
        L_0x018f:
            r7.disconnect()
            if (r6 == 0) goto L_0x0343
            X.10I r2 = r4.A06
            r1 = 38
            X.Akb r0 = new X.Akb
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1, (java.lang.Object) r5)
            r2.CGF(r0)
            r1 = 39
            X.Akb r0 = new X.Akb
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1, (java.lang.Object) r5)
            r2.CGF(r0)
            java.lang.String r1 = r6.A00
            if (r1 == 0) goto L_0x01d4
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01d4
            android.net.Uri r0 = android.net.Uri.parse(r1)
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r0)
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x01c9
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01c9
            r2.setPackage(r1)
        L_0x01c9:
            r13.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x01ce }
            goto L_0x02eb
        L_0x01ce:
            r1 = move-exception
            java.lang.String r0 = "AppAction/openApp can not open app"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x01d4:
            java.lang.String r14 = r6.A01
            if (r14 == 0) goto L_0x003f
            X.205 r2 = r5.A0v
            X.1BI r8 = r2.A00
            if (r8 == 0) goto L_0x01e6
            X.0ve r0 = r4.A04
            java.lang.String r1 = X.C196919vr.A00(r0, r8, r14)
            if (r1 != 0) goto L_0x01e8
        L_0x01e6:
            java.lang.String r1 = "external_browser"
        L_0x01e8:
            java.lang.String r0 = "webview"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02ec
            X.A19 r7 = r4.A05
            boolean r0 = r5 instanceof X.C439521o
            if (r0 == 0) goto L_0x0256
            X.21o r5 = (X.C439521o) r5
            X.2k6 r0 = r5.A00
            java.lang.String r10 = r0.A05
        L_0x01fc:
            java.lang.String r9 = "marketing_msg_webview"
            r12 = r11
            r7.A01(r8, r9, r10, r11, r12)
            if (r8 == 0) goto L_0x0254
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://api.whatsapp.com/send/?phone="
            r1.append(r0)
            java.lang.String r0 = r8.user
            java.lang.String r15 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0213:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r2.A01
            java.lang.String r17 = X.AnonymousClass001.A1I(r0, r1, r3)
            r16 = 0
            r18 = 1
            android.content.Intent r3 = X.AnonymousClass1LU.A1f(r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = "webview_should_ask_before_close"
            r3.putExtra(r0, r11)
            java.lang.String r0 = "message_cta_type"
            r3.putExtra(r0, r9)
            X.0ve r2 = r4.A04
            r1 = 10466(0x28e2, float:1.4666E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = r0 ^ 1
            java.lang.String r0 = "clear_webview"
            r3.putExtra(r0, r1)
            if (r8 == 0) goto L_0x0247
            java.lang.String r0 = "webview_receiver_jid"
            X.AnonymousClass3MY.A12(r3, r8, r0)
        L_0x0247:
            if (r10 == 0) goto L_0x024e
            java.lang.String r0 = "webview_message_template_id"
            r3.putExtra(r0, r10)
        L_0x024e:
            X.1L9 r0 = r4.A00
            r0.A08(r13, r3)
            return
        L_0x0254:
            r15 = 0
            goto L_0x0213
        L_0x0256:
            r10 = 0
            goto L_0x01fc
        L_0x0258:
            java.lang.Object r7 = r0.A02
            X.A8Q r7 = (X.A8Q) r7
            java.lang.Object r6 = r0.A03
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            java.lang.String r5 = r0.A06
            int r4 = r0.A01
            java.lang.Object r3 = r0.A04
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r0.A05
            java.lang.Long r2 = (java.lang.Long) r2
            X.63h r1 = new X.63h
            r1.<init>()
            X.9jB r0 = r7.A0A
            java.lang.String r0 = r0.A00(r6)
            r1.A04 = r0
            java.lang.String r0 = r7.A03
            r1.A05 = r0
            r1.A06 = r5
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A0E
            int r0 = r0.getAndIncrement()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r1.A03 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A01 = r0
            r1.A00 = r3
            r1.A02 = r2
            X.18K r0 = r7.A09
            r0.CC7(r1)
            return
        L_0x029b:
            java.lang.Object r1 = r0.A02
            X.5l5 r1 = (X.C112195l5) r1
            java.lang.Object r7 = r0.A03
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            java.lang.Object r6 = r0.A04
            X.5nJ r6 = (X.C113575nJ) r6
            java.lang.String r5 = r0.A06
            java.lang.Object r4 = r0.A05
            X.6hS r4 = (X.C129226hS) r4
            int r3 = r0.A01
            r2 = 0
            X.1pZ r1 = r1.A04
            android.widget.ImageView r0 = r6.A00
            r1.A0C(r0, r7, r2)
            r6.A0B(r4, r5, r3)
            return
        L_0x02bb:
            java.lang.String r6 = r0.A06
            int r5 = r0.A01
            java.lang.Object r3 = r0.A02
            X.17r r3 = (X.C218617r) r3
            java.lang.Object r2 = r0.A03
            X.11P r2 = (X.AnonymousClass11P) r2
            java.lang.Object r1 = r0.A04
            X.1Rp r1 = (X.C26301Rp) r1
            java.lang.Object r4 = r0.A05
            X.18K r4 = (X.AnonymousClass18K) r4
            X.71d r0 = new X.71d
            r0.<init>(r2, r1)
            long r2 = X.C31141f5.A00(r3, r0)
            X.3za r1 = new X.3za
            r1.<init>()
            r0 = 2
            X.C83964Hi.A00(r1, r6, r0, r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A05 = r0
            r4.CC7(r1)
            return
        L_0x02eb:
            return
        L_0x02ec:
            java.lang.String r0 = "browser_tab"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0313
            X.0wS r0 = X.C18460wS.A00
            java.lang.String r0 = X.AnonymousClass0DQ.A00(r13, r0, r11)
            if (r0 == 0) goto L_0x0313
            X.0Mv r0 = new X.0Mv
            r0.<init>()
            X.0Gx r1 = r0.A01()
            android.net.Uri r0 = X.C26215Cuu.A01(r14)
            android.content.Intent r1 = r1.A00
            r1.setData(r0)
            r0 = 0
            r13.startActivity(r1, r0)
            return
        L_0x0313:
            X.1L9 r2 = r4.A00
            android.net.Uri r1 = android.net.Uri.parse(r14)
            r0 = 0
            r2.CGU(r13, r1, r0)
            return
        L_0x031e:
            r1 = move-exception
            goto L_0x0325
        L_0x0320:
            r3 = move-exception
            r7 = r8
            goto L_0x0350
        L_0x0323:
            r1 = move-exception
            r7 = r8
        L_0x0325:
            java.lang.String r0 = "AppAction/performMetadataNetworkRequest unable to perform request"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x034f }
            r9.cancel()
            X.1KB r2 = r4.A02
            r1 = 18
            X.4rn r0 = new X.4rn
            r0.<init>((X.C116655yP) r4, (int) r1)
            r2.CGP(r0)
            if (r8 == 0) goto L_0x033e
            r8.close()
        L_0x033e:
            if (r7 == 0) goto L_0x0343
            r7.disconnect()
        L_0x0343:
            java.lang.String r0 = "AppAction/openShimLink can not get shimlink response"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2131886669(0x7f12024d, float:1.9407923E38)
            r2.A09(r0, r11)
            return
        L_0x034f:
            r3 = move-exception
        L_0x0350:
            r9.cancel()
            X.1KB r2 = r4.A02
            r1 = 18
            X.4rn r0 = new X.4rn
            r0.<init>((X.C116655yP) r4, (int) r1)
            r2.CGP(r0)
            if (r8 == 0) goto L_0x0364
            r8.close()
        L_0x0364:
            if (r7 == 0) goto L_0x0369
            r7.disconnect()
        L_0x0369:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7QG.run():void");
    }
}
