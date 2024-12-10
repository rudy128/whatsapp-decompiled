package X;

/* renamed from: X.7AQ  reason: invalid class name */
public class AnonymousClass7AQ implements C22851Dl {
    public final int A00;
    public final Object A01;

    public AnonymousClass7AQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass1F9 r1, AnonymousClass1DS r2, int i) {
        r2.A0A(r1, new AnonymousClass7AQ(r1, i));
    }

    public static void A01(AnonymousClass1F9 r1, AnonymousClass1DS r2, Object obj, int i) {
        r2.A0A(r1, new AnonymousClass7AQ(obj, i));
    }

    public static void A02(AnonymousClass1DS r1, C22801Dg r2, Object obj, int i) {
        r2.A0H(r1, new AnonymousClass7AQ(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04a8, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06dc, code lost:
        if (r4.A0A.hasFocus() == false) goto L_0x06de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0710, code lost:
        if (X.C72463Mc.A1O(r5.A0X) != false) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x07f8, code lost:
        r0.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x07fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0839, code lost:
        com.whatsapp.pushtorecordmedia.MediaTimeDisplay.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x083c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0abb, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0abf, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0ae7, code lost:
        r4.startActivity(X.AnonymousClass1LU.A1Z(r4, r5, r2, 2, r1));
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0af2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0b30, code lost:
        if (r3.booleanValue() == false) goto L_0x0b36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0b32, code lost:
        r1.A4e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0b35, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0b36, code lost:
        r1.finish();
        r1.A05.A08(2131890323, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0b42, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0b49, code lost:
        r1.A05.A04();
        X.C108995ce.A1A(r1, r3.booleanValue() ? 1 : 0);
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0b58, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:426:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r30) {
        /*
            r29 = this;
            r3 = r30
            r5 = r29
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0730;
                case 1: goto L_0x0a41;
                case 2: goto L_0x0a2d;
                case 3: goto L_0x06c9;
                case 4: goto L_0x09d5;
                case 5: goto L_0x0976;
                case 6: goto L_0x0927;
                case 7: goto L_0x0915;
                case 8: goto L_0x0907;
                case 9: goto L_0x08fd;
                case 10: goto L_0x06a9;
                case 11: goto L_0x05c9;
                case 12: goto L_0x04a0;
                case 13: goto L_0x0478;
                case 14: goto L_0x08d2;
                case 15: goto L_0x044b;
                case 16: goto L_0x08ca;
                case 17: goto L_0x087d;
                case 18: goto L_0x086d;
                case 19: goto L_0x043d;
                case 20: goto L_0x074d;
                case 21: goto L_0x0b43;
                case 22: goto L_0x0b26;
                case 23: goto L_0x0433;
                case 24: goto L_0x0429;
                case 25: goto L_0x0433;
                case 26: goto L_0x0429;
                case 27: goto L_0x084b;
                case 28: goto L_0x083d;
                case 29: goto L_0x082f;
                case 30: goto L_0x0824;
                case 31: goto L_0x07fc;
                case 32: goto L_0x03f4;
                case 33: goto L_0x0009;
                case 34: goto L_0x03b8;
                case 35: goto L_0x0119;
                case 36: goto L_0x00e1;
                case 37: goto L_0x0009;
                case 38: goto L_0x00cf;
                case 39: goto L_0x00ab;
                case 40: goto L_0x002e;
                case 41: goto L_0x07eb;
                case 42: goto L_0x07da;
                case 43: goto L_0x07cd;
                case 44: goto L_0x07c0;
                case 45: goto L_0x07b2;
                case 46: goto L_0x07a1;
                case 47: goto L_0x0794;
                case 48: goto L_0x0787;
                case 49: goto L_0x0775;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r5.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r3 = (java.lang.String) r3
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass4Yv.A00(r2, r0)
            r0 = 128(0x80, float:1.794E-43)
            X.AnonymousClass4Yv.A00(r2, r0)
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            java.lang.String r0 = "application/zip"
            r1.setType(r0)
            java.lang.String r0 = "business_activity_report"
            android.net.Uri r0 = com.whatsapp.contentprovider.MediaProvider.A05(r0, r3)
            X.C109005cf.A0L(r2, r1, r0)
        L_0x002d:
            return
        L_0x002e:
            java.lang.Object r5 = r5.A01
            X.6qB r5 = (X.C134186qB) r5
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            X.1DS r0 = r5.A05
            java.lang.Number r0 = X.C108945cZ.A1C(r0)
            if (r0 == 0) goto L_0x002d
            int r1 = r0.intValue()
            X.1DS r0 = r5.A06
            java.lang.Object r7 = r0.A06()
            java.util.AbstractList r7 = (java.util.AbstractList) r7
            boolean r6 = r5.A02
            r4 = 0
            r5.A02 = r2
            if (r7 == 0) goto L_0x002d
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x002d
            int r0 = r7.size()
            r3 = 1
            int r0 = r0 - r3
            int r2 = java.lang.Math.min(r1, r0)
            if (r2 < 0) goto L_0x0078
        L_0x0063:
            java.lang.Object r0 = r7.get(r4)
            X.1tM r0 = (X.C39611tM) r0
            if (r0 == 0) goto L_0x0073
            int r1 = r0.A00
            r0 = 43
            if (r1 != r0) goto L_0x0073
            r5.A02 = r3
        L_0x0073:
            if (r4 == r2) goto L_0x0078
            int r4 = r4 + 1
            goto L_0x0063
        L_0x0078:
            if (r6 != 0) goto L_0x002d
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x002d
            r5.A00()
            X.6ku r1 = r5.A0D
            r0 = 6
            X.6ua r4 = r1.A00(r0)
            r4.A02()
            X.1DS r0 = r5.A07
            java.lang.String r3 = X.C108945cZ.A1F(r0)
            if (r3 == 0) goto L_0x002d
            int r0 = r3.length()
            if (r0 == 0) goto L_0x002d
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r3)
            if (r0 != 0) goto L_0x002d
            X.1OX r2 = r5.A0J
            r1 = 0
            com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$fireRequest$1 r0 = new com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$fireRequest$1
            r0.<init>(r5, r4, r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x00ab:
            java.lang.Object r2 = r5.A01
            X.6qB r2 = (X.C134186qB) r2
            boolean r0 = X.C18070vi.A15(r2, r3)
            boolean r1 = r2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r3.equals(r0)
            r0 = r0 ^ 1
            r2.A01 = r0
            if (r0 != 0) goto L_0x002d
            if (r1 == 0) goto L_0x002d
            X.1DS r0 = r2.A07
            java.lang.String r0 = X.C108945cZ.A1F(r0)
            r2.A01(r0)
            return
        L_0x00cf:
            java.lang.Object r1 = r5.A01
            X.6qB r1 = (X.C134186qB) r1
            java.lang.String r3 = (java.lang.String) r3
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x002d
            r1.A01(r3)
            return
        L_0x00e1:
            java.lang.Object r4 = r5.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r4 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r4
            X.85i r3 = (X.C1596485i) r3
            boolean r0 = r3 instanceof X.C145517Lo
            r1 = 613(0x265, float:8.59E-43)
            if (r0 == 0) goto L_0x00f1
            X.AnonymousClass4Yv.A01(r4, r1)
            return
        L_0x00f1:
            boolean r0 = r3 instanceof X.C145507Ln
            if (r0 == 0) goto L_0x010c
            X.AnonymousClass4Yv.A00(r4, r1)
            X.7Ln r3 = (X.C145507Ln) r3
            X.ADN r3 = r3.A01
            X.1jT r2 = r4.A0j
            r1 = 22
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            java.lang.String r5 = r3.A0M
            java.lang.String r2 = r3.A0C
            boolean r1 = r4.A1N
            goto L_0x0ae7
        L_0x010c:
            boolean r0 = r3 instanceof X.C145477Lk
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "VerifyPhoneNumber/setupAndObserveSendSmsToWaUseCase/failed to request code"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.AnonymousClass4Yv.A00(r4, r1)
            return
        L_0x0119:
            java.lang.Object r14 = r5.A01
            com.whatsapp.registration.sendsmstowa.SendSmsToWa r14 = (com.whatsapp.registration.sendsmstowa.SendSmsToWa) r14
            X.85i r3 = (X.C1596485i) r3
            r0 = 1
            r1 = 5
            X.C18070vi.A0d(r3, r0)
            boolean r0 = r3 instanceof X.C145517Lo
            if (r0 != 0) goto L_0x002d
            boolean r0 = r3 instanceof X.C145487Ll
            if (r0 == 0) goto L_0x01c4
            X.7Ll r3 = (X.C145487Ll) r3
            X.9hy r0 = r3.A00
            java.lang.String r1 = "SendSmsToWa/updateTokensAndStateVariablesOnVerification"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.10I r9 = r14.A05
            X.C18070vi.A0W(r9)
            android.content.Context r2 = r14.getApplicationContext()
            X.C18070vi.A0X(r2)
            X.190 r3 = r14.A03
            X.C18070vi.A0W(r3)
            X.11P r5 = r14.A05
            X.C18070vi.A0W(r5)
            X.11S r4 = r14.A02
            X.C18070vi.A0W(r4)
            X.0z4 r6 = r14.A0A
            X.C18070vi.A0W(r6)
            X.0z4 r1 = r14.A0A
            java.lang.String r10 = X.C108955ca.A0t(r1)
            X.0z4 r1 = r14.A0A
            java.lang.String r11 = X.C108955ca.A0u(r1)
            X.Ct9 r8 = r14.A0B
            if (r8 == 0) goto L_0x0a94
            X.00H r1 = r14.A0P
            if (r1 == 0) goto L_0x0a91
            java.lang.Object r7 = X.C18070vi.A0E(r1)
            X.A98 r7 = (X.A98) r7
            r13 = 0
            r12 = 11
            X.A80.A04(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r8 = r0.A0H
            boolean r9 = r0.A0G
            X.0z4 r1 = r14.A0A
            java.lang.String r5 = X.C108955ca.A0t(r1)
            X.0z4 r1 = r14.A0A
            java.lang.String r6 = X.C108955ca.A0u(r1)
            X.00H r1 = r14.A0N
            if (r1 == 0) goto L_0x0a8b
            java.lang.Object r2 = X.C18070vi.A0E(r1)
            X.1Do r2 = (X.C22881Do) r2
            java.lang.String r7 = r0.A08
            boolean r10 = r0.A0F
            X.1jT r3 = r14.A4b()
            X.0z4 r1 = r14.A0A
            X.C18070vi.A0W(r1)
            X.0zA r0 = r14.A02
            if (r0 == 0) goto L_0x0ab9
            r4 = 0
            X.A80.A05(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.A8V r0 = X.C108975cc.A0N(r14)
            r0.A08()
            r0 = 1
            X.AnonymousClass4Yv.A00(r14, r0)
            r0 = 2
            X.AnonymousClass4Yv.A00(r14, r0)
            X.7Qn r3 = new X.7Qn
            r3.<init>(r14, r0)
            X.05w r0 = X.A9B.A05(r14)
            r14.A01 = r0
            if (r0 != 0) goto L_0x0a80
            r3.run()
            return
        L_0x01c4:
            boolean r0 = r3 instanceof X.C145467Lj
            if (r0 == 0) goto L_0x024e
            X.7Lj r3 = (X.C145467Lj) r3
            X.9hy r0 = r3.A00
            java.lang.String r1 = "SendSmsToWa/updateTokensAndStateVariablesOn2FaRequired"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.10I r9 = r14.A05
            X.C18070vi.A0W(r9)
            android.content.Context r2 = r14.getApplicationContext()
            X.C18070vi.A0X(r2)
            X.190 r3 = r14.A03
            X.C18070vi.A0W(r3)
            X.11P r5 = r14.A05
            X.C18070vi.A0W(r5)
            X.11S r4 = r14.A02
            X.C18070vi.A0W(r4)
            X.0z4 r6 = r14.A0A
            X.C18070vi.A0W(r6)
            X.0z4 r1 = r14.A0A
            java.lang.String r10 = X.C108955ca.A0t(r1)
            X.0z4 r1 = r14.A0A
            java.lang.String r11 = X.C108955ca.A0u(r1)
            X.Ct9 r8 = r14.A0B
            if (r8 == 0) goto L_0x0a94
            X.00H r1 = r14.A0P
            if (r1 == 0) goto L_0x0a91
            java.lang.Object r7 = X.C18070vi.A0E(r1)
            X.A98 r7 = (X.A98) r7
            r12 = 11
            r13 = 0
            X.A80.A04(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.0z4 r1 = r14.A0A
            java.lang.String r2 = r0.A0E
            java.lang.String r3 = r0.A0D
            long r4 = r0.A03
            X.11P r0 = r14.A05
            long r10 = X.AnonymousClass11P.A01(r0)
            r6 = -1
            r8 = r6
            r1.A1v(r2, r3, r4, r6, r8, r10)
            X.1jT r2 = r14.A4b()
            r1 = 7
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            X.AnonymousClass4Yv.A00(r14, r0)
            r0 = 2
            X.AnonymousClass4Yv.A00(r14, r0)
            java.lang.String r0 = "SendSmsToWa/start2FAActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r14.A0Q
            if (r0 == 0) goto L_0x0a8e
            r0.get()
            boolean r0 = r14.A0V
            android.content.Intent r0 = X.AnonymousClass1LU.A1o(r14, r0, r13)
            r14.A3q(r0, r13)
            r14.finish()
            return
        L_0x024e:
            boolean r0 = r3 instanceof X.C145497Lm
            r8 = 3
            r6 = 9
            r4 = 2
            r5 = 8
            if (r0 == 0) goto L_0x027a
            X.7Lm r3 = (X.C145497Lm) r3
            X.9hy r0 = r3.A00
            java.lang.Integer r0 = r0.A07
            int r0 = r0.intValue()
            java.lang.String r2 = "sendSmsToWaViewModel"
            if (r0 == r1) goto L_0x0aa7
            java.lang.String r1 = "exponentialBackoffProvider"
            if (r0 == r5) goto L_0x0a97
            if (r0 != r6) goto L_0x0a97
            com.whatsapp.registration.sendsmstowa.SendSmsToWaViewModel r0 = r14.A0E
            if (r0 == 0) goto L_0x0ab5
            X.6Eo r1 = r0.A00
            X.1pm r0 = X.AnonymousClass3MZ.A0H(r14)
            r1.A04(r0, r8)
            return
        L_0x027a:
            boolean r0 = r3 instanceof X.C145507Ln
            if (r0 == 0) goto L_0x03a5
            X.7Ln r3 = (X.C145507Ln) r3
            X.ADN r0 = r3.A01
            java.lang.String r2 = r0.A0C
            r14.A0T = r2
            java.lang.String r1 = r0.A0M
            r14.A0U = r1
            if (r2 == 0) goto L_0x0ac0
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0ac0
            if (r1 == 0) goto L_0x0ac0
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0ac0
            android.content.SharedPreferences r0 = com.whatsapp.registration.sendsmstowa.SendSmsToWa.A03(r14)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_send_sms_code"
            X.C17880vN.A1E(r1, r0, r2)
            java.lang.String r2 = r14.A0U
            if (r2 == 0) goto L_0x02b8
            android.content.SharedPreferences r0 = com.whatsapp.registration.sendsmstowa.SendSmsToWa.A03(r14)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_send_sms_number"
            X.C17880vN.A1E(r1, r0, r2)
        L_0x02b8:
            com.whatsapp.registration.sendsmstowa.SendSmsToWa.A0q(r14)
            int r0 = r3.A00
            if (r0 == r4) goto L_0x0320
            if (r0 != r8) goto L_0x002d
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r14)
            r0 = 2131626887(0x7f0e0b87, float:1.8881023E38)
            android.view.View r6 = X.AnonymousClass3MY.A0D(r1, r0)
            X.3Rj r1 = X.AnonymousClass4a6.A00(r14)
            r0 = 0
            r1.A0T(r0)
            r1.A0c(r6)
            X.05w r5 = X.AnonymousClass3MY.A0L(r1)
            r0 = 2131429986(0x7f0b0a62, float:1.848166E38)
            android.widget.TextView r4 = X.AnonymousClass3Ma.A0E(r6, r0)
            r0 = 2131429980(0x7f0b0a5c, float:1.8481648E38)
            android.widget.TextView r3 = X.AnonymousClass3Ma.A0E(r6, r0)
            r0 = 2131433997(0x7f0b1a0d, float:1.8489795E38)
            android.view.View r2 = X.C18070vi.A05(r6, r0)
            r0 = 2131432938(0x7f0b15ea, float:1.8487648E38)
            android.widget.TextView r1 = X.AnonymousClass3Ma.A0E(r6, r0)
            r0 = 2131895720(0x7f1225a8, float:1.942628E38)
            X.AnonymousClass3MY.A0x(r14, r4, r0)
            r0 = 2131895719(0x7f1225a7, float:1.9426279E38)
            X.AnonymousClass3MY.A0x(r14, r3, r0)
            r0 = 35
            X.C90024dP.A00(r2, r5, r14, r0)
            r0 = 2131897757(0x7f122d9d, float:1.9430413E38)
            X.AnonymousClass3MY.A0x(r14, r1, r0)
            r0 = 32
            X.C90024dP.A00(r1, r14, r5, r0)
            r5.show()
            X.A8V r1 = X.C108975cc.A0N(r14)
            java.lang.String r0 = "send_sms_to_wa_expired_dialog"
        L_0x031c:
            r1.A0C(r0)
            return
        L_0x0320:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r14)
            r0 = 2131626887(0x7f0e0b87, float:1.8881023E38)
            android.view.View r2 = X.AnonymousClass3MY.A0D(r1, r0)
            X.3Rj r0 = X.AnonymousClass4a6.A00(r14)
            r7 = 0
            r0.A0T(r7)
            r0.A0c(r2)
            X.05w r4 = X.AnonymousClass3MY.A0L(r0)
            r0 = 2131429986(0x7f0b0a62, float:1.848166E38)
            android.widget.TextView r1 = X.AnonymousClass3Ma.A0E(r2, r0)
            r0 = 2131429980(0x7f0b0a5c, float:1.8481648E38)
            com.whatsapp.TextEmojiLabel r6 = X.C72453Mb.A0c(r2, r0)
            r0 = 2131433997(0x7f0b1a0d, float:1.8489795E38)
            android.view.View r5 = X.C18070vi.A05(r2, r0)
            r0 = 2131432938(0x7f0b15ea, float:1.8487648E38)
            android.widget.TextView r3 = X.AnonymousClass3Ma.A0E(r2, r0)
            r0 = 2131895736(0x7f1225b8, float:1.9426313E38)
            X.AnonymousClass3MY.A0x(r14, r1, r0)
            r2 = 2131895735(0x7f1225b7, float:1.9426311E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.String r0 = com.whatsapp.registration.sendsmstowa.SendSmsToWa.A0Q(r14)
            java.lang.String r17 = X.AnonymousClass3Ma.A10(r14, r0, r1, r7, r2)
            X.0ve r0 = r14.A0E
            X.AnonymousClass3Ma.A1L(r0, r6)
            X.11C r0 = r14.A08
            X.AnonymousClass3Ma.A1K(r6, r0)
            X.7Qn r0 = new X.7Qn
            r0.<init>(r14, r8)
            java.lang.String r18 = "edit-number"
            r15 = 0
            r20 = r7
            r16 = r0
            r19 = r7
            android.text.SpannableStringBuilder r0 = X.A3H.A00(r14, r15, r16, r17, r18, r19, r20)
            r6.setText(r0)
            r0 = 33
            X.C90024dP.A00(r5, r14, r4, r0)
            r0 = 2131897757(0x7f122d9d, float:1.9430413E38)
            X.AnonymousClass3MY.A0x(r14, r3, r0)
            r0 = 34
            X.C90024dP.A00(r3, r14, r4, r0)
            r4.show()
            X.A8V r1 = X.C108975cc.A0N(r14)
            java.lang.String r0 = "send_sms_to_wa_mismatch_dialog"
            goto L_0x031c
        L_0x03a5:
            boolean r0 = r3 instanceof X.C145477Lk
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "SendSmsToWa/failed to request code"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 2131897757(0x7f122d9d, float:1.9430413E38)
            X.7pI r0 = new X.7pI
            r0.<init>(r14)
            goto L_0x0acd
        L_0x03b8:
            java.lang.Object r4 = r5.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r4 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r4
            X.85i r3 = (X.C1596485i) r3
            boolean r0 = r3 instanceof X.C145517Lo
            if (r0 == 0) goto L_0x03c6
            r4.A4f()
            return
        L_0x03c6:
            boolean r0 = r3 instanceof X.C145507Ln
            if (r0 == 0) goto L_0x03e2
            r0 = 9
            X.AnonymousClass4Yv.A00(r4, r0)
            X.7Ln r3 = (X.C145507Ln) r3
            X.ADN r3 = r3.A01
            X.1jT r2 = r4.A0I
            r1 = 22
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            java.lang.String r5 = r3.A0M
            java.lang.String r2 = r3.A0C
            r1 = 0
            goto L_0x0ae7
        L_0x03e2:
            boolean r0 = r3 instanceof X.C145477Lk
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "RegisterPhone/setupAndObserveSendSmsToWaUseCase/failed to request code"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 9
            X.AnonymousClass4Yv.A00(r4, r0)
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1F(r4)
            return
        L_0x03f4:
            java.lang.Object r6 = r5.A01
            X.Ad6 r6 = (X.C21014Ad6) r6
            X.85i r3 = (X.C1596485i) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            boolean r0 = r3 instanceof X.C145507Ln
            if (r0 == 0) goto L_0x0421
            X.1CM r1 = r6.A0D
            r0 = 0
            int r1 = r1.A00(r0)
            r0 = 22
            if (r1 != r0) goto L_0x0ad3
            X.1FY r2 = r6.A09
            boolean r0 = r2 instanceof com.whatsapp.registration.sendsmstowa.SendSmsToWa
            if (r0 == 0) goto L_0x0ad3
            com.whatsapp.registration.sendsmstowa.SendSmsToWa r2 = (com.whatsapp.registration.sendsmstowa.SendSmsToWa) r2
            X.7Ln r3 = (X.C145507Ln) r3
            X.ADN r0 = r3.A01
            java.lang.String r1 = r0.A0M
            java.lang.String r0 = r0.A0C
            r2.A4d(r1, r0)
            return
        L_0x0421:
            boolean r0 = r3 instanceof X.C145477Lk
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "DynamicBottomSheetNavigator/failed to request code"
            goto L_0x04a8
        L_0x0429:
            java.lang.Object r1 = r5.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x002d
            goto L_0x0b49
        L_0x0433:
            java.lang.Object r1 = r5.A01
            X.5rQ r1 = (X.C114635rQ) r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x002d
            goto L_0x0b2c
        L_0x043d:
            java.lang.Object r1 = r5.A01
            com.whatsapp.phonematching.CountryPicker r1 = (com.whatsapp.phonematching.CountryPicker) r1
            boolean r0 = com.whatsapp.phonematching.CountryPicker.A0z(r1)
            if (r0 == 0) goto L_0x002d
            com.whatsapp.phonematching.CountryPicker.A0y(r1)
            return
        L_0x044b:
            X.6zV r3 = (X.C139826zV) r3
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            java.lang.Object r4 = r5.A01
            com.whatsapp.music.ui.MusicBrowseFragment r4 = (com.whatsapp.music.ui.MusicBrowseFragment) r4
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 == r0) goto L_0x0af3
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x0af3
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x046d
            r4.A08 = r2
            android.app.Dialog r0 = r4.A03
            if (r0 == 0) goto L_0x002d
            r0.hide()
            return
        L_0x046d:
            r0 = 1
            r4.A08 = r0
            android.app.Dialog r0 = r4.A03
            if (r0 == 0) goto L_0x002d
            r0.show()
            return
        L_0x0478:
            java.lang.Object r4 = r5.A01
            android.content.Context r4 = (android.content.Context) r4
            int r1 = X.AnonymousClass000.A0M(r3)
            r0 = 1
            if (r1 != r0) goto L_0x002d
            r0 = 2131892302(0x7f12184e, float:1.9419348E38)
            java.lang.String r0 = r4.getString(r0)
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r2.A0S(r0)
            r0 = 0
            r2.A0T(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 4
            X.AnonymousClass758.A01(r2, r4, r0, r1)
            r2.A0C()
            return
        L_0x04a0:
            java.lang.Object r7 = r5.A01
            com.whatsapp.migration.export.ui.ExportMigrationActivity r7 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r7
            if (r30 != 0) goto L_0x04ac
            java.lang.String r0 = "ExportMigrationActivity/onCurrentScreenChanged/screen is null"
        L_0x04a8:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x04ac:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportMigrationActivity/onCurrentScreenChanged/screen="
            X.C17900vP.A0Y(r3, r0, r1)
            com.whatsapp.migration.export.ui.ExportMigrationViewModel r0 = r7.A0F
            X.6kH r6 = r0.A03
            int r4 = r6.A03
            int r2 = r6.A06
            int r9 = r6.A00
            int r8 = r6.A04
            int r5 = r6.A0A
            com.whatsapp.WaTextView r1 = r7.A05
            int r0 = r6.A08
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r7.A04
            int r0 = r6.A07
            r1.setText(r0)
            if (r9 != 0) goto L_0x053d
            r0 = 2131892286(0x7f12183e, float:1.9419316E38)
            java.lang.String r0 = r7.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r12 = X.AnonymousClass3MW.A09(r0)
            int r1 = r12.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r13 = 0
            java.lang.Object[] r11 = r12.getSpans(r13, r1, r0)
            android.text.style.URLSpan[] r11 = (android.text.style.URLSpan[]) r11
            if (r11 == 0) goto L_0x0521
            int r0 = r11.length
            r16 = r0
        L_0x04f4:
            r0 = r16
            if (r13 >= r0) goto L_0x0521
            r1 = r11[r13]
            java.lang.String r10 = "edit-number"
            java.lang.String r0 = r1.getURL()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x051e
            int r15 = r12.getSpanStart(r1)
            int r14 = r12.getSpanEnd(r1)
            int r10 = r12.getSpanFlags(r1)
            r12.removeSpan(r1)
            r1 = 1
            X.5dr r0 = new X.5dr
            r0.<init>(r7, r1)
            r12.setSpan(r0, r15, r14, r10)
        L_0x051e:
            int r13 = r13 + 1
            goto L_0x04f4
        L_0x0521:
            com.whatsapp.WaTextView r0 = r7.A02
            r0.setText(r12)
            com.whatsapp.WaTextView r1 = r7.A02
            int r0 = X.C72463Mc.A02(r7)
            int r0 = X.C19740yt.A00(r7, r0)
            r1.setLinkTextColor(r0)
            com.whatsapp.WaTextView r1 = r7.A02
            android.text.method.LinkMovementMethod r0 = new android.text.method.LinkMovementMethod
            r0.<init>()
            r1.setMovementMethod(r0)
        L_0x053d:
            com.whatsapp.WaTextView r0 = r7.A02
            r0.setVisibility(r9)
            if (r4 != 0) goto L_0x0552
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0H
            int r0 = r6.A02
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0H
            r0 = 26
            X.AnonymousClass3MZ.A1O(r1, r7, r3, r0)
        L_0x0552:
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A0H
            r0.setVisibility(r4)
            if (r2 != 0) goto L_0x0567
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0I
            int r0 = r6.A05
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0I
            r0 = 27
            X.AnonymousClass3MZ.A1O(r1, r7, r3, r0)
        L_0x0567:
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A0I
            r0.setVisibility(r2)
            X.0ve r1 = r7.A0E
            r0 = 3005(0xbbd, float:4.211E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x05ab
            X.0ve r1 = r7.A0E
            r0 = 3666(0xe52, float:5.137E-42)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x05ab
            com.whatsapp.WaNetworkResourceImageView r2 = r7.A01
            X.C0L r1 = r6.A0B
            r0 = 1
            r2.A06(r1, r0)
        L_0x058a:
            com.whatsapp.components.RoundCornerProgressBar r0 = r7.A09
            r0.setVisibility(r8)
            com.whatsapp.WaTextView r0 = r7.A03
            r0.setVisibility(r8)
            if (r8 != 0) goto L_0x059c
            com.whatsapp.components.RoundCornerProgressBar r1 = r7.A09
            r0 = 0
            r1.setProgress(r0)
        L_0x059c:
            com.whatsapp.WaTextView r0 = r7.A06
            r0.setVisibility(r5)
            if (r5 != 0) goto L_0x002d
            com.whatsapp.WaTextView r1 = r7.A06
            int r0 = r6.A09
            r1.setText(r0)
            return
        L_0x05ab:
            com.whatsapp.WaNetworkResourceImageView r4 = r7.A01
            int r3 = r6.A01
            android.content.res.Resources r1 = r7.getResources()
            r0 = 0
            X.1Jp r2 = X.C24291Jp.A00(r0, r1, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportMigrationActivity/getVectorDrawable/drawableId is invalid/drawableId = "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            X.C17960vV.A08(r2, r0)
            r4.setImageDrawable(r2)
            goto L_0x058a
        L_0x05c9:
            java.lang.Object r7 = r5.A01
            com.whatsapp.mediaview.MediaViewFragment r7 = (com.whatsapp.mediaview.MediaViewFragment) r7
            int r1 = X.AnonymousClass000.A0M(r3)
            r2 = 0
            if (r1 == 0) goto L_0x069f
            r0 = 1
            if (r1 == r0) goto L_0x067f
            r0 = 2
            if (r1 != r0) goto L_0x002d
            X.3d3 r11 = r7.A0b
            if (r11 != 0) goto L_0x0648
            X.1FL r12 = r7.A1B()
            r11 = 0
            if (r12 == 0) goto L_0x064b
            r0 = 2131432450(0x7f0b1402, float:1.8486658E38)
            android.view.View r15 = r12.findViewById(r0)
            if (r15 == 0) goto L_0x064b
            X.0ve r9 = r7.A0e
            X.1L4 r8 = r7.A1A
            X.190 r14 = r7.A0E
            X.1KW r6 = r7.A0d
            X.67r r5 = r7.A0c
            X.11C r4 = r7.A0Q
            X.0vb r3 = r7.A0W
            X.00H r0 = r7.A1L
            java.lang.Object r2 = r0.get()
            com.whatsapp.emoji.search.EmojiSearchProvider r2 = (com.whatsapp.emoji.search.EmojiSearchProvider) r2
            X.0z4 r1 = r7.A0V
            X.0vc r0 = r7.A0v
            com.whatsapp.KeyboardPopupLayout r15 = (com.whatsapp.KeyboardPopupLayout) r15
            java.lang.Integer r27 = X.C108955ca.A0e()
            X.21V r10 = r7.A10
            if (r10 == 0) goto L_0x0616
            X.205 r10 = r10.A0v
            X.1BI r11 = r10.A00
        L_0x0616:
            java.lang.Integer r28 = X.A3P.A00(r11)
            X.00H r10 = r7.A1M
            X.A59 r20 = X.C108945cZ.A0e(r10)
            r13 = 0
            X.3d3 r11 = new X.3d3
            r16 = r13
            r24 = r9
            r25 = r0
            r26 = r8
            r22 = r6
            r23 = r2
            r21 = r5
            r19 = r3
            r18 = r1
            r17 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r7.A0b = r11
            r1 = 4
            X.7Bo r0 = new X.7Bo
            r0.<init>(r7, r1)
            r11.A0J(r0)
            r0 = 1
            r11.A0F = r0
        L_0x0648:
            r11.A0D()
        L_0x064b:
            X.3RQ r0 = r7.A0O
        L_0x064d:
            if (r0 == 0) goto L_0x0652
            r0.dismiss()
        L_0x0652:
            X.1bI r1 = r7.A0C
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x002d
            android.view.View r0 = r1.A02()
            android.view.ViewPropertyAnimator r2 = r0.animate()
            r0 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            r0 = 0
            android.view.ViewPropertyAnimator r1 = r1.alpha(r0)
            r0 = 17
            X.3Br r0 = X.C108945cZ.A0X(r7, r0)
            android.view.ViewPropertyAnimator r1 = r1.withStartAction(r0)
            r0 = 18
        L_0x0677:
            X.3Br r0 = X.C108945cZ.A0X(r7, r0)
            r1.withEndAction(r0)
            return
        L_0x067f:
            X.3RQ r1 = r7.A0O
            if (r1 == 0) goto L_0x002d
            com.whatsapp.reactions.ReactionsTrayViewModel r0 = r7.A13
            if (r0 == 0) goto L_0x002d
            int r0 = r0.A02
            r1.A00(r0, r2, r2)
            X.1bI r0 = r7.A0C
            android.view.View r0 = r0.A02()
            android.view.ViewPropertyAnimator r2 = X.C108985cd.A0G(r0)
            r0 = 100
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            r0 = 19
            goto L_0x0677
        L_0x069f:
            X.3RQ r0 = r7.A0O
            if (r0 == 0) goto L_0x0652
            r0.dismiss()
            X.3d3 r0 = r7.A0b
            goto L_0x064d
        L_0x06a9:
            java.lang.Object r1 = r5.A01
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            X.85R r3 = (X.AnonymousClass85R) r3
            boolean r0 = r3 instanceof X.AnonymousClass7JZ
            if (r0 == 0) goto L_0x06bd
            X.7JZ r3 = (X.AnonymousClass7JZ) r3
            X.21V r0 = r3.A00
            if (r0 == 0) goto L_0x0b1d
            com.whatsapp.mediaview.MediaViewFragment.A0f(r1, r0)
            return
        L_0x06bd:
            boolean r0 = r3 instanceof X.C144877Ja
            if (r0 == 0) goto L_0x002d
            X.7Ja r3 = (X.C144877Ja) r3
            X.21V r0 = r3.A00
            com.whatsapp.mediaview.MediaViewFragment.A0d(r1, r0)
            return
        L_0x06c9:
            java.lang.Object r5 = r5.A01
            X.72m r5 = (X.AnonymousClass72m) r5
            boolean r1 = X.AnonymousClass000.A1Y(r3)
            X.71R r4 = r5.A0M
            if (r4 == 0) goto L_0x06de
            com.whatsapp.ClearableEditText r0 = r4.A0A
            boolean r0 = r0.hasFocus()
            r3 = 1
            if (r0 != 0) goto L_0x06df
        L_0x06de:
            r3 = 0
        L_0x06df:
            if (r1 == 0) goto L_0x0713
            android.view.ViewGroup r2 = r5.A09
            r0 = 2131435346(0x7f0b1f52, float:1.8492532E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x0706
            android.view.View r1 = r5.A07
            if (r0 == r1) goto L_0x0706
            r2.removeView(r0)
        L_0x06f3:
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r0 = r5.A0Q
            r0.removeView(r1)
            r2.addView(r1)
        L_0x06fb:
            if (r3 == 0) goto L_0x002d
            X.C17960vV.A07(r4)
            com.whatsapp.ClearableEditText r0 = r4.A0A
            r0.requestFocus()
            return
        L_0x0706:
            android.view.View r1 = r5.A07
            if (r0 != r1) goto L_0x06f3
            X.1vp r0 = r5.A0X
            boolean r0 = X.C72463Mc.A1O(r0)
            if (r0 == 0) goto L_0x06f3
            goto L_0x06fb
        L_0x0713:
            android.view.ViewGroup r1 = r5.A09
            r0 = 2131435346(0x7f0b1f52, float:1.8492532E38)
            r2 = 2131435346(0x7f0b1f52, float:1.8492532E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.removeView(r0)
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r1 = r5.A0Q
            android.view.View r0 = r1.findViewById(r2)
            if (r0 != 0) goto L_0x06fb
            android.view.View r0 = r5.A07
            r1.addView(r0)
            goto L_0x06fb
        L_0x0730:
            java.lang.Object r2 = r5.A01
            X.72m r2 = (X.AnonymousClass72m) r2
            boolean r0 = X.AnonymousClass000.A1Y(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0743
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r0 = r2.A0Q
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x002d
        L_0x0743:
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView r0 = r2.A0P
            r0.A0f(r1)
            X.5lw r0 = r2.A0L
            r0.A00 = r1
            return
        L_0x074d:
            java.lang.Object r0 = r5.A01
            com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment r0 = (com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment) r0
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            X.5io r0 = r0.A03
            if (r0 != 0) goto L_0x075b
            java.lang.String r0 = "viewModel"
            goto L_0x0abb
        L_0x075b:
            X.206 r6 = X.C111195io.A00(r0)
            if (r6 == 0) goto L_0x0771
            X.2k4 r5 = r0.A04
            X.6Rs r4 = r0.A00
            X.10I r2 = r5.A04
            r1 = 8
            X.3C5 r0 = new X.3C5
            r0.<init>(r6, r5, r4, r1)
            r2.CGF(r0)
        L_0x0771:
            r3.dismiss()
            return
        L_0x0775:
            java.lang.Object r2 = r5.A01
            X.6k7 r2 = (X.C130856k7) r2
            X.6ep r3 = (X.C127726ep) r3
            X.6iQ r1 = r2.A08
            java.util.Set r0 = r3.A01
            r1.A02 = r0
            X.1Dg r0 = r2.A02
            r0.A0E(r1)
            return
        L_0x0787:
            java.lang.Object r0 = r5.A01
            X.6kQ r0 = (X.C131046kQ) r0
            X.77Z r3 = (X.AnonymousClass77Z) r3
            X.1jz r2 = r0.A0B
            r2.A06 = r3
            X.1Dg r0 = r0.A01
            goto L_0x07f8
        L_0x0794:
            java.lang.Object r0 = r5.A01
            X.6kQ r0 = (X.C131046kQ) r0
            X.1BI r3 = (X.AnonymousClass1BI) r3
            X.1jz r2 = r0.A0B
            r2.A03 = r3
            X.1Dg r0 = r0.A01
            goto L_0x07f8
        L_0x07a1:
            java.lang.Object r1 = r5.A01
            X.6kQ r1 = (X.C131046kQ) r1
            java.lang.Number r3 = (java.lang.Number) r3
            X.1jz r2 = r1.A0B
            int r0 = r3.intValue()
            r2.A02 = r0
            X.1Dg r0 = r1.A01
            goto L_0x07f8
        L_0x07b2:
            java.lang.Object r0 = r5.A01
            X.6kQ r0 = (X.C131046kQ) r0
            java.lang.String r3 = (java.lang.String) r3
            X.1jz r2 = r0.A0B
            r2.A05(r3)
            X.1Dg r0 = r0.A01
            goto L_0x07f8
        L_0x07c0:
            java.lang.Object r0 = r5.A01
            X.6kP r0 = (X.C131036kP) r0
            X.77Z r3 = (X.AnonymousClass77Z) r3
            X.1jz r2 = r0.A0B
            r2.A06 = r3
            X.1Dg r0 = r0.A02
            goto L_0x07f8
        L_0x07cd:
            java.lang.Object r0 = r5.A01
            X.6kP r0 = (X.C131036kP) r0
            X.1BI r3 = (X.AnonymousClass1BI) r3
            X.1jz r2 = r0.A0B
            r2.A03 = r3
            X.1Dg r0 = r0.A02
            goto L_0x07f8
        L_0x07da:
            java.lang.Object r1 = r5.A01
            X.6kP r1 = (X.C131036kP) r1
            java.lang.Number r3 = (java.lang.Number) r3
            X.1jz r2 = r1.A0B
            int r0 = r3.intValue()
            r2.A02 = r0
            X.1Dg r0 = r1.A02
            goto L_0x07f8
        L_0x07eb:
            java.lang.Object r0 = r5.A01
            X.6kP r0 = (X.C131036kP) r0
            java.lang.String r3 = (java.lang.String) r3
            X.1jz r2 = r0.A0B
            r2.A05(r3)
            X.1Dg r0 = r0.A02
        L_0x07f8:
            r0.A0F(r2)
            return
        L_0x07fc:
            java.lang.Object r0 = r5.A01
            X.5nE r0 = (X.C113525nE) r0
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            X.6Ek r0 = (X.C120606Ek) r0
            if (r3 == 0) goto L_0x080c
            android.widget.ImageView r0 = r0.A00
            r0.setImageBitmap(r3)
            return
        L_0x080c:
            android.widget.ImageView r4 = r0.A00
            android.content.Context r3 = r4.getContext()
            android.content.Context r2 = r4.getContext()
            r1 = 2130969324(0x7f0402ec, float:1.7547327E38)
            r0 = 2131100309(0x7f060295, float:1.7812996E38)
            int r0 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            X.C108955ca.A1L(r4, r0)
            return
        L_0x0824:
            java.lang.Object r1 = r5.A01
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay r1 = (com.whatsapp.pushtorecordmedia.MediaTimeDisplay) r1
            int r0 = X.AnonymousClass000.A0M(r3)
            r1.A00 = r0
            goto L_0x0839
        L_0x082f:
            java.lang.Object r1 = r5.A01
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay r1 = (com.whatsapp.pushtorecordmedia.MediaTimeDisplay) r1
            boolean r0 = X.AnonymousClass000.A1Y(r3)
            r1.A05 = r0
        L_0x0839:
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay.A01(r1)
            return
        L_0x083d:
            java.lang.Object r1 = r5.A01
            com.whatsapp.pushtorecordmedia.MediaProgressRing r1 = (com.whatsapp.pushtorecordmedia.MediaProgressRing) r1
            boolean r0 = X.AnonymousClass000.A1Y(r3)
            r1.A02 = r0
            r1.invalidate()
            return
        L_0x084b:
            java.lang.Object r6 = r5.A01
            X.74G r6 = (X.AnonymousClass74G) r6
            boolean r0 = X.AnonymousClass000.A1Y(r3)
            if (r0 == 0) goto L_0x085c
            long r0 = java.lang.System.currentTimeMillis()
        L_0x0859:
            r6.A02 = r0
            return
        L_0x085c:
            int r0 = r6.A00
            long r4 = (long) r0
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r6.A02
            long r2 = r2 - r0
            long r4 = r4 + r2
            int r0 = (int) r4
            r6.A00 = r0
            r0 = -1
            goto L_0x0859
        L_0x086d:
            java.lang.Object r0 = r5.A01
            com.whatsapp.phonematching.CountryPicker r0 = (com.whatsapp.phonematching.CountryPicker) r0
            java.lang.String r3 = (java.lang.String) r3
            X.5f6 r0 = r0.A04
            android.widget.Filter r0 = r0.getFilter()
            r0.filter(r3)
            return
        L_0x087d:
            java.lang.Object r5 = r5.A01
            X.91E r5 = (X.AnonymousClass91E) r5
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r6 = "personal"
            java.lang.String r0 = r5.A0Q
            boolean r1 = r6.equals(r0)
            r0 = 2131889580(0x7f120dac, float:1.9413828E38)
            if (r1 == 0) goto L_0x0893
            r0 = 2131889589(0x7f120db5, float:1.9413846E38)
        L_0x0893:
            java.lang.String r4 = r5.getString(r0)
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r2 = X.C108945cZ.A0G(r0)
            java.lang.String r0 = "application/zip"
            r2.setType(r0)
            java.lang.String r0 = r5.A0Q
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x08c7
            java.lang.String r0 = "personal_dyi_report"
        L_0x08ac:
            android.net.Uri r1 = com.whatsapp.contentprovider.MediaProvider.A05(r0, r3)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            r2.putExtra(r0, r4)
            r0 = 524288(0x80000, float:7.34684E-40)
            r2.addFlags(r0)
            android.content.Intent r0 = android.content.Intent.createChooser(r2, r4)
            r5.startActivity(r0)
            return
        L_0x08c7:
            java.lang.String r0 = "business_dyi_report"
            goto L_0x08ac
        L_0x08ca:
            java.lang.Object r1 = r5.A01
            X.2cn r1 = (X.C53602cn) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x08d2:
            java.lang.Object r8 = r5.A01
            com.whatsapp.migration.export.ui.ExportMigrationActivity r8 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r8
            int r1 = X.AnonymousClass000.A0M(r3)
            com.whatsapp.components.RoundCornerProgressBar r0 = r8.A09
            r0.setProgress(r1)
            com.whatsapp.WaTextView r7 = r8.A03
            r6 = 2131892296(0x7f121848, float:1.9419336E38)
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1a()
            X.0vb r0 = r8.A00
            java.text.NumberFormat r4 = r0.A0M()
            double r2 = (double) r1
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r0
            java.lang.String r1 = r4.format(r2)
            r0 = 0
            r5[r0] = r1
            X.AnonymousClass3MY.A0y(r8, r7, r5, r6)
            return
        L_0x08fd:
            java.lang.Object r0 = r5.A01
            com.whatsapp.mediacomposer.ui.caption.CaptionFragment r0 = (com.whatsapp.mediacomposer.ui.caption.CaptionFragment) r0
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0.A2B(r3)
            return
        L_0x0907:
            java.lang.Object r4 = r5.A01
            X.71R r4 = (X.AnonymousClass71R) r4
            boolean r2 = X.AnonymousClass000.A1Y(r3)
            r0 = 200(0xc8, double:9.9E-322)
            X.AnonymousClass71R.A01(r4, r0, r2)
            return
        L_0x0915:
            java.lang.Object r1 = r5.A01
            X.71R r1 = (X.AnonymousClass71R) r1
            boolean r0 = X.AnonymousClass000.A1Y(r3)
            android.view.View r1 = r1.A05
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            return
        L_0x0927:
            java.lang.Object r3 = r5.A01
            X.71R r3 = (X.AnonymousClass71R) r3
            X.5iA r0 = r3.A0C
            X.1vp r0 = r0.A03
            int r0 = X.C72463Mc.A0A(r0)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x0971
            android.widget.TextView r5 = r3.A09
            android.widget.TextView r4 = r3.A08
        L_0x093d:
            android.content.Context r2 = r5.getContext()
            r1 = 2130971223(0x7f040a57, float:1.7551178E38)
            r0 = 2131102546(0x7f060b52, float:1.7817533E38)
            int r2 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r1 = 230(0xe6, float:3.22E-43)
            android.view.View r3 = r3.A03
            android.content.Context r0 = r3.getContext()
            X.AnonymousClass3MX.A1C(r0, r5, r2)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            r0.setAlpha(r1)
            r2 = 2131102545(0x7f060b51, float:1.781753E38)
            r1 = 51
            android.content.Context r0 = r3.getContext()
            X.AnonymousClass3MX.A1C(r0, r4, r2)
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            r0.setAlpha(r1)
            return
        L_0x0971:
            android.widget.TextView r5 = r3.A08
            android.widget.TextView r4 = r3.A09
            goto L_0x093d
        L_0x0976:
            java.lang.Object r5 = r5.A01
            X.71R r5 = (X.AnonymousClass71R) r5
            boolean r0 = X.AnonymousClass000.A1Y(r3)
            if (r0 == 0) goto L_0x09a4
            android.view.View r2 = r5.A03
            r1 = 10
            X.78d r0 = new X.78d
            r0.<init>((X.AnonymousClass71R) r5, (int) r1)
            r2.addOnLayoutChangeListener(r0)
            android.view.View r3 = r5.A06
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            X.0vb r0 = r5.A0B
            boolean r1 = X.AnonymousClass3MW.A1Z(r0)
            r0 = 5
            if (r1 == 0) goto L_0x099e
            r0 = 3
        L_0x099e:
            r2.gravity = r0
            r3.setLayoutParams(r2)
            return
        L_0x09a4:
            android.view.View r4 = r5.A03
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass3MW.A0B(r4)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168686(0x7f070dae, float:1.795168E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168687(0x7f070daf, float:1.7951683E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r3.setMargins(r2, r1, r2, r0)
            r0 = -1
            r3.width = r0
            r4.setLayoutParams(r3)
            android.view.View r3 = r5.A06
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r0 = 49
            goto L_0x099e
        L_0x09d5:
            java.lang.Object r5 = r5.A01
            X.72m r5 = (X.AnonymousClass72m) r5
            X.6eR r3 = (X.C127486eR) r3
            X.725 r4 = r3.A00
            if (r4 != 0) goto L_0x09f4
            java.lang.String r1 = r3.A01
            X.C17960vV.A07(r1)
            java.util.Map r0 = r5.A0Z
            r0.remove(r1)
            java.util.Map r0 = r5.A0a
            r0.remove(r1)
            X.5lP r0 = r5.A0I
            r0.A0V(r1)
            return
        L_0x09f4:
            java.util.ArrayList r1 = X.AnonymousClass72m.A00(r5, r4)
            X.AnonymousClass72m.A02(r5, r1)
            java.util.Map r0 = r5.A0Z
            java.lang.String r2 = r4.A0H
            r0.put(r2, r4)
            java.util.Map r0 = r5.A0a
            r0.put(r2, r1)
            X.5lP r3 = r5.A0I
            java.util.LinkedHashMap r1 = r3.A02
            java.util.ArrayList r0 = X.C112395lP.A01(r3, r4)
            r1.put(r2, r0)
            X.C112395lP.A03(r3)
            java.util.List r0 = r3.A03
            int r2 = r0.size()
            int r1 = r3.A0Q()
            java.util.List r0 = r3.A03
            int r0 = r0.size()
            int r1 = r1 - r0
            r3.A0J(r2, r1)
            X.C112395lP.A04(r3)
            return
        L_0x0a2d:
            java.lang.Object r0 = r5.A01
            X.72m r0 = (X.AnonymousClass72m) r0
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            X.6z6 r1 = r0.A03
            boolean r0 = r3.booleanValue()
            r0 = r0 ^ 1
            r1.A01 = r0
            X.AnonymousClass6z6.A00(r1)
            return
        L_0x0a41:
            java.lang.Object r1 = r5.A01
            X.72m r1 = (X.AnonymousClass72m) r1
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0a59
            X.5lP r1 = r1.A0I
            r0 = 0
            r1.A01 = r0
            r1.A0U()
            r1.notifyDataSetChanged()
            return
        L_0x0a59:
            X.5lP r4 = r1.A0I
            X.67n r2 = r1.A0R
            X.5iA r0 = r1.A0N
            X.C17960vV.A07(r0)
            X.1vp r0 = r0.A03
            int r0 = X.C72463Mc.A0A(r0)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r1 = r0 ^ 1
            r0 = 1
            X.6ly r2 = r2.A00(r3, r1, r0)
            X.6ly r1 = r4.A01
            if (r1 == 0) goto L_0x0a7a
            r0 = 0
            r1.A00 = r0
        L_0x0a7a:
            r4.A01 = r2
            r2.A00(r4)
            return
        L_0x0a80:
            r0.show()
            X.1KB r2 = r14.A05
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A0K(r3, r0)
            return
        L_0x0a8b:
            java.lang.String r0 = "loginManager"
            goto L_0x0abb
        L_0x0a8e:
            java.lang.String r0 = "waIntents"
            goto L_0x0abb
        L_0x0a91:
            java.lang.String r0 = "registrationHttpManager"
            goto L_0x0abb
        L_0x0a94:
            java.lang.String r0 = "autoconfManager"
            goto L_0x0abb
        L_0x0a97:
            X.1NV r0 = r14.A0H
            if (r0 != 0) goto L_0x0a9f
            X.C18070vi.A11(r1)
            goto L_0x0abe
        L_0x0a9f:
            java.lang.Long r0 = r0.A01()
            com.whatsapp.registration.sendsmstowa.SendSmsToWa.A0s(r14, r0)
            return
        L_0x0aa7:
            com.whatsapp.registration.sendsmstowa.SendSmsToWaViewModel r0 = r14.A0E
            if (r0 == 0) goto L_0x0ab5
            X.6Eo r1 = r0.A00
            X.1pm r0 = X.AnonymousClass3MZ.A0H(r14)
            r1.A04(r0, r4)
            return
        L_0x0ab5:
            X.C18070vi.A11(r2)
            goto L_0x0abe
        L_0x0ab9:
            java.lang.String r0 = "smbRegistrationManager"
        L_0x0abb:
            X.C18070vi.A11(r0)
        L_0x0abe:
            r0 = 0
            throw r0
        L_0x0ac0:
            java.lang.String r0 = "SendSmsToWa/failed to get send sms code or number"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 2131897757(0x7f122d9d, float:1.9430413E38)
            X.7pH r0 = new X.7pH
            r0.<init>(r14)
        L_0x0acd:
            X.0vk r0 = (X.C18090vk) r0
            com.whatsapp.registration.sendsmstowa.SendSmsToWa.A0t(r14, r0, r1)
            return
        L_0x0ad3:
            X.1jT r2 = r6.A0C
            r1 = 22
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            X.1FY r4 = r6.A09
            X.7Ln r3 = (X.C145507Ln) r3
            X.ADN r0 = r3.A01
            java.lang.String r5 = r0.A0M
            java.lang.String r2 = r0.A0C
            boolean r1 = r6.A0H
        L_0x0ae7:
            r0 = 2
            android.content.Intent r0 = X.AnonymousClass1LU.A1Z(r4, r5, r2, r0, r1)
            r4.startActivity(r0)
            r4.finish()
            return
        L_0x0af3:
            X.0vl r1 = r4.A0C
            X.5iM r0 = X.C108945cZ.A0n(r1)
            X.1DS r0 = r0.A02
            r0.A0D(r5)
            X.5iM r0 = X.C108945cZ.A0n(r1)
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            X.1DT r2 = r0.A06
            java.lang.Object r0 = r2.A06()
            X.6zV r0 = (X.C139826zV) r0
            r1 = 0
            if (r0 == 0) goto L_0x0b16
            boolean r0 = r0.A01
            X.6zV r1 = new X.6zV
            r1.<init>(r3, r0)
        L_0x0b16:
            r2.A0F(r1)
            r4.A28()
            return
        L_0x0b1d:
            java.lang.String r0 = "MediaViewFragment/setupObservers/media is null for MessageResult."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A2D()
            return
        L_0x0b26:
            java.lang.Object r1 = r5.A01
            X.5rQ r1 = (X.C114635rQ) r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3
        L_0x0b2c:
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x0b36
            r1.A4e()
            return
        L_0x0b36:
            r1.finish()
            X.1KB r2 = r1.A05
            r1 = 2131890323(0x7f121093, float:1.9415335E38)
            r0 = 1
            r2.A08(r1, r0)
            return
        L_0x0b43:
            java.lang.Object r1 = r5.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3
        L_0x0b49:
            X.1KB r0 = r1.A05
            r0.A04()
            boolean r0 = r3.booleanValue()
            X.C108995ce.A1A(r1, r0)
            r1.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7AQ.Bo9(java.lang.Object):void");
    }
}
