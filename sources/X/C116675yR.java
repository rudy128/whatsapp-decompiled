package X;

import android.app.Activity;

/* renamed from: X.5yR  reason: invalid class name and case insensitive filesystem */
public final class C116675yR extends C196289ul {
    public final AnonymousClass190 A00;
    public final C18030ve A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass70E A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000f A[Catch:{ all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016 A[Catch:{ all -> 0x0018 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A08(android.content.Context r7, X.C20285AEt r8, X.C20271AEe r9) {
        /*
            r6 = this;
            r5 = 0
            if (r9 == 0) goto L_0x000c
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x000c
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ all -> 0x0018 }
            goto L_0x000d
        L_0x000c:
            r1 = r5
        L_0x000d:
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "display_text"
            java.lang.String r4 = r1.optString(r0)     // Catch:{ all -> 0x0018 }
            goto L_0x001d
        L_0x0016:
            r4 = r5
            goto L_0x001d
        L_0x0018:
            r0 = move-exception
            X.1IU r4 = X.C108945cZ.A1J(r0)
        L_0x001d:
            java.lang.Throwable r3 = X.C30671eK.A00(r4)
            if (r3 == 0) goto L_0x002c
            X.190 r2 = r6.A00
            java.lang.String r1 = "UrlAction"
            java.lang.String r0 = "UrlAction/getButtonText can not get button test"
            r2.A0E(r1, r0, r3)
        L_0x002c:
            boolean r0 = r4 instanceof X.AnonymousClass1IU
            if (r0 != 0) goto L_0x0031
            r5 = r4
        L_0x0031:
            java.lang.String r5 = (java.lang.String) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116675yR.A08(android.content.Context, X.AEt, X.AEe):java.lang.String");
    }

    public boolean A0E(C18030ve r3) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 4001);
    }

    public boolean A0F(C18030ve r3, C166418cr r4) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 4001);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r22 == null) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b0 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.app.Activity r27, X.AnonymousClass5XY r28, X.AnonymousClass206 r29, X.C20271AEe r30, int r31) {
        /*
            r26 = this;
            r19 = r28
            r9 = 0
            r11 = r27
            r10 = r29
            int r17 = X.C72453Mb.A0G(r11, r10, r9)
            r15 = 3
            r1 = r30
            X.C18070vi.A0d(r1, r15)
            boolean r0 = r10 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r1.A00
            r8 = 0
            if (r0 == 0) goto L_0x0150
            org.json.JSONObject r0 = X.C17880vN.A16(r0)
        L_0x001e:
            java.lang.String r1 = "url"
            if (r0 == 0) goto L_0x002b
            r0.optString(r1)
            java.lang.String r22 = r0.optString(r1)
            if (r22 != 0) goto L_0x013c
        L_0x002b:
            java.lang.String r22 = ""
            if (r0 != 0) goto L_0x013c
            r12 = r8
            r7 = r8
            r16 = r8
        L_0x0033:
            java.lang.String r21 = ""
            X.2qD r6 = new X.2qD
            r25 = r31
            r20 = r6
            r23 = r7
            r24 = r17
            r20.<init>(r21, r22, r23, r24, r25)
            if (r0 == 0) goto L_0x0139
            java.lang.String r1 = "webview_interaction"
            boolean r1 = r0.optBoolean(r1)
        L_0x004a:
            r6.A05 = r1
            r13 = r26
            X.0ve r5 = r13.A01
            r1 = 5970(0x1752, float:8.366E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r4, r5, r1)
            r3 = 1
            if (r1 == 0) goto L_0x006f
            if (r0 == 0) goto L_0x006f
            java.lang.String r1 = "webview_presentation"
            java.lang.String r1 = r0.optString(r1)
            if (r1 == 0) goto L_0x006f
            boolean r0 = X.AnonymousClass1YF.A0T(r1)
            r0 = r0 ^ 1
            if (r0 != r3) goto L_0x006f
            r6.A03 = r1
        L_0x006f:
            r0 = r19
            boolean r2 = r0 instanceof X.AnonymousClass7EX
            if (r2 == 0) goto L_0x0136
            r0 = r19
            X.7EX r0 = (X.AnonymousClass7EX) r0
        L_0x0079:
            com.whatsapp.jid.UserJid r14 = r10.A0I()
            if (r14 == 0) goto L_0x0092
            X.00H r1 = r13.A03
            java.lang.Object r1 = r1.get()
            X.A5M r1 = (X.A5M) r1
            if (r0 == 0) goto L_0x0133
            java.lang.Integer r0 = r0.A01
            int r0 = r0.intValue()
        L_0x008f:
            r1.A02(r14, r10, r0)
        L_0x0092:
            X.00H r14 = r13.A08
            java.lang.Object r1 = r14.get()
            X.706 r1 = (X.AnonymousClass706) r1
            if (r7 == 0) goto L_0x0130
            boolean r0 = X.AnonymousClass1YF.A0T(r7)
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)
        L_0x00a4:
            r1.A04(r10, r0, r9, r3)
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = r10.A11(r0)
            if (r0 != 0) goto L_0x01b0
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = r10.A11(r0)
            if (r0 != 0) goto L_0x01b0
            com.whatsapp.jid.UserJid r1 = r10.A0I()
            if (r2 != 0) goto L_0x00c1
            r19 = r8
        L_0x00c1:
            java.lang.String r0 = X.C20120A8f.A04(r10)
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e3
            X.10I r2 = r13.A02
            r24 = 9
            X.7Q7 r0 = new X.7Q7
            r18 = r0
            r20 = r13
            r21 = r10
            r22 = r6
            r23 = r25
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r2.CGF(r0)
        L_0x00e3:
            java.lang.String r2 = "ctwa_auto_reply"
            r0 = r16
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 == 0) goto L_0x00fa
            X.00H r0 = r13.A0A
            java.lang.Object r2 = r0.get()
            X.6lF r2 = (X.C131526lF) r2
            java.lang.String r0 = "cta_url"
            r2.A00(r1, r0)
        L_0x00fa:
            X.70E r4 = r13.A07
            boolean r0 = r4.A05(r10)
            if (r0 == 0) goto L_0x0153
            r23 = r7
            r24 = r3
            r25 = r9
            r20 = r8
            r21 = r10
            r22 = r6
            r19 = r11
            r18 = r4
            r18.A02(r19, r20, r21, r22, r23, r24, r25)
            if (r1 == 0) goto L_0x012f
            java.lang.Object r2 = r14.get()
            X.706 r2 = (X.AnonymousClass706) r2
            r2.A01(r1)
            if (r7 == 0) goto L_0x012a
            boolean r0 = X.AnonymousClass1YF.A0T(r7)
            java.lang.Boolean r8 = X.C108945cZ.A1A(r0)
        L_0x012a:
            r0 = r17
            r2.A04(r10, r8, r0, r3)
        L_0x012f:
            return
        L_0x0130:
            r0 = r8
            goto L_0x00a4
        L_0x0133:
            r0 = 0
            goto L_0x008f
        L_0x0136:
            r0 = r8
            goto L_0x0079
        L_0x0139:
            r1 = 0
            goto L_0x004a
        L_0x013c:
            java.lang.String r1 = "merchant_url"
            java.lang.String r12 = r0.optString(r1)
            java.lang.String r1 = "consented_users_url"
            java.lang.String r7 = r0.optString(r1)
            java.lang.String r1 = "message_origin"
            java.lang.String r16 = r0.optString(r1)
            goto L_0x0033
        L_0x0150:
            r0 = r8
            goto L_0x001e
        L_0x0153:
            java.lang.Object r2 = r14.get()
            X.706 r2 = (X.AnonymousClass706) r2
            if (r7 == 0) goto L_0x01ae
            boolean r0 = X.AnonymousClass1YF.A0T(r7)
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)
        L_0x0163:
            r2.A04(r10, r0, r15, r3)
            if (r7 == 0) goto L_0x0199
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0199
            if (r1 == 0) goto L_0x0199
            X.00H r0 = r13.A09
            java.lang.Object r0 = r0.get()
            X.73F r0 = (X.AnonymousClass73F) r0
            boolean r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0199
            r6.A01 = r7
            java.lang.Object r2 = r14.get()
            X.706 r2 = (X.AnonymousClass706) r2
            r2.A01(r1)
            boolean r0 = X.AnonymousClass1YF.A0T(r7)
            java.lang.Boolean r1 = X.C108945cZ.A1A(r0)
            r0 = 4
            r2.A04(r10, r1, r0, r3)
        L_0x0195:
            r4.A04(r11, r10, r6)
            return
        L_0x0199:
            java.lang.Object r1 = r14.get()
            X.706 r1 = (X.AnonymousClass706) r1
            if (r7 == 0) goto L_0x01a9
            boolean r0 = X.AnonymousClass1YF.A0T(r7)
            java.lang.Boolean r8 = X.C108945cZ.A1A(r0)
        L_0x01a9:
            r0 = 5
            r1.A04(r10, r8, r0, r3)
            goto L_0x0195
        L_0x01ae:
            r0 = r8
            goto L_0x0163
        L_0x01b0:
            if (r12 == 0) goto L_0x01b8
            boolean r0 = X.AnonymousClass1YF.A0T(r12)
            if (r0 == 0) goto L_0x01ba
        L_0x01b8:
            java.lang.String r12 = r6.A01
        L_0x01ba:
            X.C18070vi.A0b(r12)
            java.lang.String r1 = r6.A01
            X.C18070vi.A0W(r1)
            java.lang.String r2 = "UrlAction"
            r0 = 6626(0x19e2, float:9.285E-42)
            java.lang.String r8 = X.C108955ca.A0v(r5, r0)
            boolean r0 = X.C18070vi.A18(r12, r1)
            if (r0 != 0) goto L_0x020d
            boolean r0 = X.AnonymousClass1YF.A0T(r8)
            if (r0 != 0) goto L_0x020d
            java.net.URI r7 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0205 }
            r7.<init>(r1)     // Catch:{ URISyntaxException -> 0x0205 }
            java.lang.String r1 = r7.getScheme()     // Catch:{ URISyntaxException -> 0x0205 }
            java.lang.String r0 = "https"
            if (r1 == 0) goto L_0x01fd
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ URISyntaxException -> 0x0205 }
            if (r0 == 0) goto L_0x01fd
            java.lang.String r0 = r7.getHost()     // Catch:{ URISyntaxException -> 0x0205 }
            if (r0 == 0) goto L_0x01f5
            boolean r0 = r0.equalsIgnoreCase(r8)     // Catch:{ URISyntaxException -> 0x0205 }
            if (r0 != 0) goto L_0x020d
        L_0x01f5:
            X.190 r1 = r13.A00     // Catch:{ URISyntaxException -> 0x0205 }
            java.lang.String r0 = "Trackable link domain mismatch"
            r1.A0G(r2, r0, r9)     // Catch:{ URISyntaxException -> 0x0205 }
            return
        L_0x01fd:
            X.190 r1 = r13.A00     // Catch:{ URISyntaxException -> 0x0205 }
            java.lang.String r0 = "Trackable link protocol mismatch"
            r1.A0G(r2, r0, r9)     // Catch:{ URISyntaxException -> 0x0205 }
            return
        L_0x0205:
            X.190 r1 = r13.A00
            java.lang.String r0 = "Trackable link uri syntax invalid"
            r1.A0G(r2, r0, r9)
            return
        L_0x020d:
            r0 = 5044(0x13b4, float:7.068E-42)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)
            if (r0 == 0) goto L_0x0261
            r0 = 6693(0x1a25, float:9.379E-42)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)
            if (r0 == 0) goto L_0x0259
            r0 = 2131897659(0x7f122d3b, float:1.9430214E38)
            java.lang.String r1 = X.C18070vi.A0F(r11, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r0 = X.C108995ce.A0Y(r12, r1, r0, r9, r3)
            android.text.Spanned r0 = X.AnonymousClass6VI.A00(r0)
        L_0x022e:
            X.C18070vi.A0b(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            X.3Rj r3 = X.AnonymousClass4a6.A00(r11)
            r3.A0S(r0)
            r1 = 2131897657(0x7f122d39, float:1.943021E38)
            r2 = r11
            X.1F9 r2 = (X.AnonymousClass1F9) r2
            r0 = 1
            X.AnonymousClass7AL.A00(r2, r3, r0, r1)
            r1 = 2131897660(0x7f122d3c, float:1.9430216E38)
            X.7AK r0 = new X.7AK
            r7 = r0
            r8 = r11
            r9 = r13
            r11 = r6
            r12 = r25
            r7.<init>(r8, r9, r10, r11, r12)
            r3.A0g(r2, r0, r1)
            X.AnonymousClass3MY.A1G(r3)
            return
        L_0x0259:
            r0 = 2131897658(0x7f122d3a, float:1.9430212E38)
            java.lang.String r0 = X.C17890vO.A0R(r11, r12, r3, r9, r0)
            goto L_0x022e
        L_0x0261:
            r0 = r25
            A00(r11, r13, r10, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116675yR.A0A(android.app.Activity, X.5XY, X.206, X.AEe, int):void");
    }

    public C116675yR(AnonymousClass190 r2, AnonymousClass70E r3, C18030ve r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0w(r4, r2, r5, r6, r3);
        C18070vi.A0x(r7, r8, r9, r10, r11);
        C18070vi.A0d(r12, 11);
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = r5;
        this.A04 = r6;
        this.A07 = r3;
        this.A06 = r7;
        this.A05 = r8;
        this.A08 = r9;
        this.A09 = r10;
        this.A03 = r11;
        this.A0A = r12;
    }

    public static final void A00(Activity activity, C116675yR r4, AnonymousClass206 r5, C61762qD r6, int i) {
        if (r5.A11(4194304)) {
            ((C132656nI) r4.A06.get()).A00(r5, Integer.valueOf(i), 1);
        }
        r4.A07.A04(activity, r5, r6);
    }

    public int A04() {
        return 2131232150;
    }

    public String A07() {
        return "cta_url";
    }

    public void A0B(Activity activity, AnonymousClass5XY r3, AnonymousClass206 r4, C20271AEe aEe, Class cls) {
        throw C17880vN.A0y();
    }
}
