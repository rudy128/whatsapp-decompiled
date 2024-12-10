package X;

import com.whatsapp.registration.task.RequestCodeRepository$requestCode$2;

/* renamed from: X.9p1  reason: invalid class name and case insensitive filesystem */
public final class C192809p1 {
    public final AnonymousClass11C A00;
    public final AnonymousClass118 A01;
    public final C19830z4 A02;
    public final C196159uY A03;
    public final A98 A04;
    public final C26145Ct9 A05;
    public final C192319oA A06;
    public final C18600wl A07;

    public final Object A01(AnonymousClass99F r17, String str, String str2, String str3, String str4, String str5, String str6, C30391dr r24, int i, int i2, int i3, int i4) {
        return C30451dy.A00(r24, this.A07, new RequestCodeRepository$requestCode$2(r17, this, str, str2, str3, str4, str5, str6, (C30391dr) null, i, i2, i3, i4));
    }

    public C192809p1(AnonymousClass11C r1, AnonymousClass118 r2, C19830z4 r3, C196159uY r4, A98 a98, C26145Ct9 ct9, C192319oA r7, C18600wl r8) {
        C18070vi.A0s(r2, r1, ct9, r3);
        C18070vi.A0q(a98, r4, r8);
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = ct9;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = a98;
        this.A03 = r4;
        this.A07 = r8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0497 A[Catch:{ Exception -> 0x0535 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x04a2 A[Catch:{ Exception -> 0x0535 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x04ad A[Catch:{ Exception -> 0x0535 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x04b8 A[Catch:{ Exception -> 0x0535 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x04c3 A[Catch:{ Exception -> 0x0535 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0509 A[Catch:{ Exception -> 0x0535 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009b A[SYNTHETIC, Splitter:B:18:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x029a A[Catch:{ Exception -> 0x03b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0452 A[Catch:{ Exception -> 0x0535 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x048c A[Catch:{ Exception -> 0x0535 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.ADN A00(X.AnonymousClass99F r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, int r48, int r49, int r50, int r51) {
        /*
            r40 = this;
            r0 = 1
            r1 = r42
            X.C18070vi.A0d(r1, r0)
            r3 = 3
            r39 = r44
            r2 = r39
            X.C18070vi.A0d(r2, r3)
            r6 = 4
            r10 = r41
            r34 = r45
            r2 = r34
            X.AnonymousClass8BU.A1H(r2, r6, r10)
            X.2qI r5 = X.C182119Td.A00
            r2 = r40
            X.118 r3 = r2.A01
            android.content.Context r4 = X.C108945cZ.A0E(r3)
            r3 = r34
            java.lang.String r26 = r5.A01(r4, r3)
            r3 = 3
            r7 = 1
            r5 = r48
            if (r5 == r3) goto L_0x0099
            r7 = 0
            if (r5 == r6) goto L_0x0034
            r4 = 5
            if (r5 != r4) goto L_0x0099
        L_0x0034:
            r6 = 1
        L_0x0035:
            X.0z4 r4 = r2.A02
            r38 = r4
            X.00H r9 = r4.A00
            android.content.SharedPreferences$Editor r5 = X.AnonymousClass8BV.A06(r9)
            java.lang.String r4 = "registration_last_code_method"
            X.C17880vN.A1E(r5, r4, r1)
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r4 = "RequestCodeRepository/method="
            r8.append(r4)
            r8.append(r1)
            java.lang.String r4 = "/useStandaloneVerification="
            r8.append(r4)
            r8.append(r7)
            java.lang.String r4 = "/useEmailPNOtpIq="
            r8.append(r4)
            r8.append(r6)
            java.lang.String r4 = "/authContext="
            r5 = r47
            X.C17900vP.A0f(r4, r5, r8)
            android.content.SharedPreferences r9 = X.C17880vN.A0B(r9)
            java.lang.String r8 = "com.whatsapp.registration.RegisterPhone.mistyped_state"
            r21 = 0
            r4 = r21
            java.lang.String r14 = r9.getString(r8, r4)
            X.11C r4 = r2.A00
            android.telephony.TelephonyManager r9 = r4.A0K()
            r4 = 0
            if (r9 == 0) goto L_0x0097
            java.lang.String r8 = r9.getNetworkOperator()
        L_0x0082:
            X.A6P r11 = X.A6P.A00(r8)
            if (r9 == 0) goto L_0x0095
            java.lang.String r8 = r9.getSimOperator()
        L_0x008c:
            X.A6P r12 = X.A6P.A00(r8)
            java.lang.String r20 = "RequestCodeRepository/doInBackground/"
            if (r6 == 0) goto L_0x029a
            goto L_0x009b
        L_0x0095:
            r8 = r4
            goto L_0x008c
        L_0x0097:
            r8 = r4
            goto L_0x0082
        L_0x0099:
            r6 = 0
            goto L_0x0035
        L_0x009b:
            X.9uY r5 = r2.A03     // Catch:{ Exception -> 0x0535 }
            java.lang.String r19 = "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorPNOTPTooRecentMixin"
            java.lang.String r15 = "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorPNOTPTooManyMixin"
            r8 = 0
            r7 = 2
            X.00H r4 = r5.A05     // Catch:{ Exception -> 0x0535 }
            r28 = r4
            java.lang.String r14 = X.C17890vO.A0T(r28)     // Catch:{ Exception -> 0x0535 }
            X.0vb r4 = r5.A02     // Catch:{ Exception -> 0x0535 }
            java.lang.String r18 = r4.A05()     // Catch:{ Exception -> 0x0535 }
            java.lang.String r17 = r4.A04()     // Catch:{ Exception -> 0x0535 }
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0535 }
            java.lang.String r6 = "sms"
            r4[r8] = r6     // Catch:{ Exception -> 0x0535 }
            java.lang.String r5 = "voice"
            java.util.List r9 = X.C18070vi.A0O(r5, r4, r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r13 = "iq"
            X.1cX r11 = X.C108945cZ.A0t(r13)     // Catch:{ Exception -> 0x0535 }
            X.C108995ce.A1E(r11)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r10 = "xmlns"
            java.lang.String r4 = "urn:xmpp:whatsapp:account"
            X.C29591cX.A01(r11, r10, r4)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r12 = "type"
            java.lang.String r4 = "set"
            X.C29591cX.A01(r11, r12, r4)     // Catch:{ Exception -> 0x0535 }
            X.AnonymousClass8BY.A15(r11, r14)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r16 = "verify_pn"
            X.1cX r10 = X.C108945cZ.A0t(r16)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r4 = "method"
            X.1cX r4 = X.C108945cZ.A0t(r4)     // Catch:{ Exception -> 0x0535 }
            X.C29591cX.A02(r1, r9)     // Catch:{ Exception -> 0x0535 }
            r4.A07(r1)     // Catch:{ Exception -> 0x0535 }
            X.C108955ca.A1P(r4, r10)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r4 = "lg"
            X.1cX r9 = X.C108945cZ.A0t(r4)     // Catch:{ Exception -> 0x0535 }
            r23 = 2
            r25 = 3
            r22 = r18
            r27 = r8
            boolean r4 = X.C29601cY.A04(r22, r23, r25, r27)     // Catch:{ Exception -> 0x0535 }
            if (r4 == 0) goto L_0x0109
            r4 = r18
            r9.A07(r4)     // Catch:{ Exception -> 0x0535 }
        L_0x0109:
            X.C108955ca.A1P(r9, r10)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r4 = "lc"
            X.1cX r4 = X.C108945cZ.A0t(r4)     // Catch:{ Exception -> 0x0535 }
            r22 = r17
            boolean r9 = X.C29601cY.A04(r22, r23, r25, r27)     // Catch:{ Exception -> 0x0535 }
            if (r9 == 0) goto L_0x011f
            r9 = r17
            r4.A07(r9)     // Catch:{ Exception -> 0x0535 }
        L_0x011f:
            X.AnonymousClass8BX.A1I(r4, r10, r11)     // Catch:{ Exception -> 0x0535 }
            X.1ca r4 = r11.A03()     // Catch:{ Exception -> 0x0535 }
            X.1OZ r10 = X.C17880vN.A0U(r28)     // Catch:{ Exception -> 0x0535 }
            r9 = 444(0x1bc, float:6.22E-43)
            X.1Ug r9 = r10.A09(r4, r14, r9)     // Catch:{ Exception -> 0x0535 }
            java.lang.Object r9 = r9.get()     // Catch:{ Exception -> 0x03b8 }
            X.C18070vi.A0X(r9)     // Catch:{ Exception -> 0x03b8 }
            X.1ca r9 = (X.C29621ca) r9     // Catch:{ Exception -> 0x03b8 }
            r10 = r21
            java.lang.String r11 = r9.A0Q(r12, r10)     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r10 = "result"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x03b8 }
            if (r10 == 0) goto L_0x01d3
            X.C29621ca.A04(r9, r13)     // Catch:{ Exception -> 0x03b8 }
            X.2rm r10 = X.AnonymousClass8BR.A0s()     // Catch:{ Exception -> 0x03b8 }
            java.lang.String[] r11 = new java.lang.String[r3]     // Catch:{ Exception -> 0x03b8 }
            r11[r8] = r16     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r12 = "sms_wait_time"
            r11[r0] = r12     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r12 = "#elementValue"
            r11[r7] = r12     // Catch:{ Exception -> 0x03b8 }
            java.lang.Class r24 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x03b8 }
            java.lang.Long r25 = X.AnonymousClass8BV.A0a()     // Catch:{ Exception -> 0x03b8 }
            java.lang.Long r26 = X.AnonymousClass8BU.A0j()     // Catch:{ Exception -> 0x03b8 }
            r22 = r10
            r23 = r9
            r27 = r21
            r28 = r11
            java.lang.Object r11 = r22.A04(r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x03b8 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ Exception -> 0x03b8 }
            if (r11 == 0) goto L_0x01cd
            long r13 = r11.longValue()     // Catch:{ Exception -> 0x03b8 }
            java.lang.String[] r11 = new java.lang.String[r3]     // Catch:{ Exception -> 0x03b8 }
            r11[r8] = r16     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r3 = "voice_wait_time"
            r11[r0] = r3     // Catch:{ Exception -> 0x03b8 }
            r11[r7] = r12     // Catch:{ Exception -> 0x03b8 }
            r28 = r11
            java.lang.Object r3 = r22.A04(r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x03b8 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Exception -> 0x03b8 }
            if (r3 == 0) goto L_0x01c7
            long r11 = r3.longValue()     // Catch:{ Exception -> 0x03b8 }
            X.A5w r3 = X.C20071A5w.A00     // Catch:{ Exception -> 0x03b8 }
            X.Ahb r3 = X.C21290Ahb.A00(r4, r3, r7)     // Catch:{ Exception -> 0x03b8 }
            java.lang.Object r3 = r3.BCF(r9, r10)     // Catch:{ Exception -> 0x03b8 }
            X.9DG r3 = (X.AnonymousClass9DG) r3     // Catch:{ Exception -> 0x03b8 }
            if (r3 == 0) goto L_0x0295
            java.lang.Integer r3 = X.AnonymousClass00R.A00     // Catch:{ Exception -> 0x03b8 }
            X.ADN r9 = new X.ADN     // Catch:{ Exception -> 0x03b8 }
            r9.<init>(r3)     // Catch:{ Exception -> 0x03b8 }
            r4 = r39
            r3 = r34
            java.lang.String r3 = X.C17900vP.A0A(r4, r3)     // Catch:{ Exception -> 0x03b8 }
            r9.A0H = r3     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x03b8 }
            r9.A0O = r3     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x03b8 }
            r9.A0Q = r3     // Catch:{ Exception -> 0x03b8 }
            java.lang.String[] r0 = X.C17880vN.A1b(r6, r5, r7, r0)     // Catch:{ Exception -> 0x03b8 }
            java.util.ArrayList r0 = X.AnonymousClass1ZU.A05(r0)     // Catch:{ Exception -> 0x03b8 }
            r9.A0V = r0     // Catch:{ Exception -> 0x03b8 }
            goto L_0x03c5
        L_0x01c7:
            X.1UI r0 = X.AnonymousClass1O9.A00(r10)     // Catch:{ Exception -> 0x03b8 }
            goto L_0x0299
        L_0x01cd:
            X.1UI r0 = X.AnonymousClass1O9.A00(r10)     // Catch:{ Exception -> 0x03b8 }
            goto L_0x0299
        L_0x01d3:
            X.C29621ca.A04(r9, r13)     // Catch:{ Exception -> 0x03b8 }
            X.2rm r11 = X.AnonymousClass8BR.A0s()     // Catch:{ Exception -> 0x03b8 }
            X.A5w r13 = X.C20071A5w.A00     // Catch:{ Exception -> 0x03b8 }
            X.Ahb r10 = new X.Ahb     // Catch:{ Exception -> 0x03b8 }
            r10.<init>(r4, r13, r0)     // Catch:{ Exception -> 0x03b8 }
            X.C18070vi.A0d(r10, r0)     // Catch:{ Exception -> 0x03b8 }
            java.lang.Object r4 = r10.BCF(r9, r11)     // Catch:{ Exception -> 0x03b8 }
            X.9DG r4 = (X.AnonymousClass9DG) r4     // Catch:{ Exception -> 0x03b8 }
            if (r4 == 0) goto L_0x0290
            r4 = 4
            X.B9c[] r12 = new X.C22470B9c[r4]     // Catch:{ Exception -> 0x03b8 }
            X.C21282AhT.A00(r12, r7, r8, r13)     // Catch:{ Exception -> 0x03b8 }
            X.C21282AhT.A00(r12, r3, r0, r13)     // Catch:{ Exception -> 0x03b8 }
            X.C21282AhT.A00(r12, r4, r7, r13)     // Catch:{ Exception -> 0x03b8 }
            r10 = 5
            X.AhT r4 = new X.AhT     // Catch:{ Exception -> 0x03b8 }
            r4.<init>(r13, r10)     // Catch:{ Exception -> 0x03b8 }
            java.util.List r10 = X.C18070vi.A0O(r4, r12, r3)     // Catch:{ Exception -> 0x03b8 }
            java.lang.String[] r4 = X.AnonymousClass8BS.A1b(r0, r8)     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r3 = "IQErrorPNOTPTooMany|IQErrorPNOTPTooRecent|IQErrorInternalServerError|IQErrorForbidden"
            java.lang.Object r3 = r11.A06(r9, r3, r10, r4)     // Catch:{ Exception -> 0x03b8 }
            if (r3 == 0) goto L_0x028b
            X.B67 r3 = (X.B67) r3     // Catch:{ Exception -> 0x03b8 }
            java.lang.Integer r4 = X.AnonymousClass00R.A0Y     // Catch:{ Exception -> 0x03b8 }
            X.ADN r9 = new X.ADN     // Catch:{ Exception -> 0x03b8 }
            r9.<init>(r4)     // Catch:{ Exception -> 0x03b8 }
            java.lang.String[] r0 = X.C17880vN.A1b(r6, r5, r7, r0)     // Catch:{ Exception -> 0x03b8 }
            java.util.ArrayList r0 = X.AnonymousClass1ZU.A05(r0)     // Catch:{ Exception -> 0x03b8 }
            r9.A0V = r0     // Catch:{ Exception -> 0x03b8 }
            boolean r0 = r3 instanceof X.AnonymousClass9DQ     // Catch:{ Exception -> 0x03b8 }
            if (r0 == 0) goto L_0x0270
            r4 = r3
            X.9DQ r4 = (X.AnonymousClass9DQ) r4     // Catch:{ Exception -> 0x03b8 }
            int r0 = r4.A00     // Catch:{ Exception -> 0x03b8 }
            if (r0 != r8) goto L_0x024c
            java.lang.Integer r0 = X.AnonymousClass00R.A15     // Catch:{ Exception -> 0x03b8 }
            r9.A09 = r0     // Catch:{ Exception -> 0x03b8 }
            X.C18070vi.A0z(r3, r15)     // Catch:{ Exception -> 0x03b8 }
            java.lang.Object r0 = r4.A02     // Catch:{ Exception -> 0x03b8 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x03b8 }
            r9.A0O = r0     // Catch:{ Exception -> 0x03b8 }
            X.C18070vi.A0z(r3, r15)     // Catch:{ Exception -> 0x03b8 }
            java.lang.Object r0 = r4.A03     // Catch:{ Exception -> 0x03b8 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x03b8 }
            r9.A0Q = r0     // Catch:{ Exception -> 0x03b8 }
            goto L_0x03c5
        L_0x024c:
            java.lang.Integer r0 = X.AnonymousClass00R.A0u     // Catch:{ Exception -> 0x03b8 }
            r9.A09 = r0     // Catch:{ Exception -> 0x03b8 }
            r0 = r19
            X.C18070vi.A0z(r3, r0)     // Catch:{ Exception -> 0x03b8 }
            java.lang.Object r0 = r4.A02     // Catch:{ Exception -> 0x03b8 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x03b8 }
            r9.A0O = r0     // Catch:{ Exception -> 0x03b8 }
            r0 = r19
            X.C18070vi.A0z(r3, r0)     // Catch:{ Exception -> 0x03b8 }
            java.lang.Object r0 = r4.A03     // Catch:{ Exception -> 0x03b8 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x03b8 }
            r9.A0Q = r0     // Catch:{ Exception -> 0x03b8 }
            goto L_0x03c5
        L_0x0270:
            boolean r0 = r3 instanceof X.AnonymousClass9DR     // Catch:{ Exception -> 0x03b8 }
            if (r0 == 0) goto L_0x0286
            X.9DR r3 = (X.AnonymousClass9DR) r3     // Catch:{ Exception -> 0x03b8 }
            int r0 = r3.A00     // Catch:{ Exception -> 0x03b8 }
            if (r0 != r8) goto L_0x0280
            java.lang.Integer r0 = X.AnonymousClass00R.A04     // Catch:{ Exception -> 0x03b8 }
            r9.A09 = r0     // Catch:{ Exception -> 0x03b8 }
            goto L_0x03c5
        L_0x0280:
            java.lang.Integer r0 = X.AnonymousClass00R.A19     // Catch:{ Exception -> 0x03b8 }
            r9.A09 = r0     // Catch:{ Exception -> 0x03b8 }
            goto L_0x03c5
        L_0x0286:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ Exception -> 0x03b8 }
            goto L_0x0299
        L_0x028b:
            X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ Exception -> 0x03b8 }
            goto L_0x0299
        L_0x0290:
            X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ Exception -> 0x03b8 }
            goto L_0x0299
        L_0x0295:
            X.1UI r0 = X.AnonymousClass1O9.A00(r10)     // Catch:{ Exception -> 0x03b8 }
        L_0x0299:
            throw r0     // Catch:{ Exception -> 0x03b8 }
        L_0x029a:
            r15 = r46
            if (r7 == 0) goto L_0x02f1
            if (r47 == 0) goto L_0x02ec
            X.A98 r9 = r2.A04     // Catch:{ Exception -> 0x0535 }
            java.lang.String r13 = X.A9B.A00     // Catch:{ Exception -> 0x0535 }
            X.C18070vi.A0Z(r13)     // Catch:{ Exception -> 0x0535 }
            boolean r3 = r9.A0T()     // Catch:{ Exception -> 0x0535 }
            if (r3 != 0) goto L_0x02b6
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ Exception -> 0x0535 }
            X.ADN r9 = new X.ADN     // Catch:{ Exception -> 0x0535 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x0535 }
            goto L_0x03c5
        L_0x02b6:
            r9.A0S(r0)     // Catch:{ Exception -> 0x0535 }
            r3 = r39
            r0 = r34
            byte[] r31 = r9.A0V(r3, r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "requestCodeForStandaloneVerification"
            byte[] r32 = r9.A0U(r0)     // Catch:{ Exception -> 0x0535 }
            java.util.LinkedHashMap r30 = X.A98.A03(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0535 }
            X.A7d r23 = X.A98.A00(r9)     // Catch:{ Exception -> 0x0535 }
            java.util.List r29 = X.A98.A04(r9)     // Catch:{ Exception -> 0x0535 }
            X.2bP r0 = r9.A09     // Catch:{ Exception -> 0x0535 }
            X.9CL r21 = new X.9CL     // Catch:{ Exception -> 0x0535 }
            r22 = r0
            r24 = r3
            r25 = r34
            r27 = r1
            r28 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x0535 }
            java.lang.Object r9 = X.C19951A0i.A00(r21)     // Catch:{ Exception -> 0x0535 }
            X.ADN r9 = (X.ADN) r9     // Catch:{ Exception -> 0x0535 }
            goto L_0x03a9
        L_0x02ec:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ Exception -> 0x0535 }
            throw r0     // Catch:{ Exception -> 0x0535 }
        L_0x02f1:
            java.lang.String r3 = "autoconf"
            boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x0535 }
            if (r3 == 0) goto L_0x0313
            X.Ct9 r3 = r2.A05     // Catch:{ Exception -> 0x0535 }
            r4 = r43
            byte[] r4 = r3.A05(r4)     // Catch:{ Exception -> 0x0535 }
            if (r4 == 0) goto L_0x0306
            int r3 = r4.length     // Catch:{ Exception -> 0x0535 }
            if (r3 != 0) goto L_0x0313
        L_0x0306:
            java.lang.String r0 = "RequestCodeRepository/doInBackground/no valid clientStartMessage, skip sending autoconf code request"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y     // Catch:{ Exception -> 0x0535 }
            X.ADN r2 = new X.ADN     // Catch:{ Exception -> 0x0535 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0535 }
            return r2
        L_0x0313:
            X.A98 r9 = r2.A04     // Catch:{ Exception -> 0x0535 }
            java.lang.String r13 = X.A9B.A00     // Catch:{ Exception -> 0x0535 }
            X.C18070vi.A0Z(r13)     // Catch:{ Exception -> 0x0535 }
            boolean r3 = r9.A0T()     // Catch:{ Exception -> 0x0535 }
            if (r3 != 0) goto L_0x0329
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ Exception -> 0x0535 }
            X.ADN r9 = new X.ADN     // Catch:{ Exception -> 0x0535 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x0535 }
            goto L_0x03c5
        L_0x0329:
            r9.A0S(r0)     // Catch:{ Exception -> 0x0535 }
            r3 = r39
            r0 = r34
            byte[] r32 = r9.A0V(r3, r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "requestCode"
            byte[] r33 = r9.A0U(r0)     // Catch:{ Exception -> 0x0535 }
            java.util.LinkedHashMap r6 = X.A98.A03(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0535 }
            X.A98.A0B(r9, r6)     // Catch:{ Exception -> 0x0535 }
            X.A98.A08(r9, r6)     // Catch:{ Exception -> 0x0535 }
            X.A98.A0A(r9, r6)     // Catch:{ Exception -> 0x0535 }
            X.A98.A07(r9, r6)     // Catch:{ Exception -> 0x0535 }
            r9.A0R(r6)     // Catch:{ Exception -> 0x0535 }
            X.A98.A0C(r9, r6)     // Catch:{ Exception -> 0x0535 }
            X.00H r0 = r9.A0B     // Catch:{ Exception -> 0x0535 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0535 }
            X.2jJ r0 = (X.C57582jJ) r0     // Catch:{ Exception -> 0x0535 }
            r0.A00()     // Catch:{ Exception -> 0x0535 }
            X.0z4 r0 = r9.A07     // Catch:{ Exception -> 0x0535 }
            android.content.SharedPreferences r7 = X.C17890vO.A0B(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r3 = "pref_autoconf_feo2_query_status"
            java.lang.String r0 = "did_not_query"
            java.lang.String r0 = r7.getString(r3, r0)     // Catch:{ Exception -> 0x0535 }
            X.C17960vV.A07(r0)     // Catch:{ Exception -> 0x0535 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x0535 }
            byte[] r3 = X.C108975cc.A1O(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "feo2_query_status"
            r6.put(r0, r3)     // Catch:{ Exception -> 0x0535 }
            X.A7d r23 = X.A98.A00(r9)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r3 = "code_entrypoint"
            r0 = r39
            java.lang.String r29 = r9.A0P(r0, r3)     // Catch:{ Exception -> 0x0535 }
            java.util.List r30 = X.A98.A04(r9)     // Catch:{ Exception -> 0x0535 }
            X.2bP r0 = r9.A09     // Catch:{ Exception -> 0x0535 }
            X.9CO r21 = new X.9CO     // Catch:{ Exception -> 0x0535 }
            r35 = r49
            r36 = r50
            r37 = r51
            r22 = r0
            r24 = r39
            r25 = r34
            r27 = r1
            r28 = r5
            r31 = r6
            r34 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ Exception -> 0x0535 }
            java.lang.Object r9 = X.C19951A0i.A00(r21)     // Catch:{ Exception -> 0x0535 }
            X.ADN r9 = (X.ADN) r9     // Catch:{ Exception -> 0x0535 }
        L_0x03a9:
            if (r9 != 0) goto L_0x03c5
            java.lang.String r0 = "RequestCodeRepository/doInBackground/null requestCodeResult"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y     // Catch:{ Exception -> 0x0535 }
            X.ADN r2 = new X.ADN     // Catch:{ Exception -> 0x0535 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0535 }
            return r2
        L_0x03b8:
            r3 = move-exception
            java.lang.String r0 = "EmailVerificationXmppMethods failed sending request IQ"
            com.whatsapp.util.Log.w(r0, r3)     // Catch:{ Exception -> 0x0535 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y     // Catch:{ Exception -> 0x0535 }
            X.ADN r9 = new X.ADN     // Catch:{ Exception -> 0x0535 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x0535 }
        L_0x03c5:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "RequestCodeRepository/code entrypoint response/autoconfType="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            int r0 = r9.A00     // Catch:{ Exception -> 0x0535 }
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/non-null authChallenge="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = r9.A0A     // Catch:{ Exception -> 0x0535 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/emailOtpEligible="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            int r0 = r9.A01     // Catch:{ Exception -> 0x0535 }
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/resetMethod="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = r9.A0K     // Catch:{ Exception -> 0x0535 }
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/wipeWait="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            long r4 = r9.A05     // Catch:{ Exception -> 0x0535 }
            r3.append(r4)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/smsWait="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = r9.A0O     // Catch:{ Exception -> 0x0535 }
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/voiceWait="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = r9.A0Q     // Catch:{ Exception -> 0x0535 }
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/waOldWait="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = r9.A0R     // Catch:{ Exception -> 0x0535 }
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/flashWait="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = r9.A0G     // Catch:{ Exception -> 0x0535 }
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/emailOtpWait="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = r9.A0E     // Catch:{ Exception -> 0x0535 }
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/retryAfter="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = r9.A0L     // Catch:{ Exception -> 0x0535 }
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/regMethodsOrder="
            r3.append(r0)     // Catch:{ Exception -> 0x0535 }
            java.util.ArrayList r0 = r9.A0V     // Catch:{ Exception -> 0x0535 }
            X.C17900vP.A0b(r0, r3)     // Catch:{ Exception -> 0x0535 }
            int r3 = r9.A00     // Catch:{ Exception -> 0x0535 }
            r0 = r38
            r0.A18(r3)     // Catch:{ Exception -> 0x0535 }
            java.lang.Integer r3 = r9.A09     // Catch:{ Exception -> 0x0535 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ Exception -> 0x0535 }
            if (r3 != r0) goto L_0x045d
            r0 = r20
            java.lang.StringBuilder r3 = X.AnonymousClass8BW.A0o(r0, r1)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "/status/error/yes-with-code"
            X.C17890vO.A19(r3, r0)     // Catch:{ Exception -> 0x0535 }
        L_0x045d:
            X.9oA r8 = r2.A06     // Catch:{ Exception -> 0x0535 }
            java.lang.String r15 = r9.A0O     // Catch:{ Exception -> 0x0535 }
            java.lang.String r14 = r9.A0Q     // Catch:{ Exception -> 0x0535 }
            java.lang.String r13 = r9.A0G     // Catch:{ Exception -> 0x0535 }
            java.lang.String r12 = r9.A0R     // Catch:{ Exception -> 0x0535 }
            java.lang.String r11 = r9.A0E     // Catch:{ Exception -> 0x0535 }
            java.lang.String r10 = r9.A0N     // Catch:{ Exception -> 0x0535 }
            int r2 = r1.hashCode()     // Catch:{ Exception -> 0x0535 }
            java.lang.String r7 = "email_otp"
            java.lang.String r6 = "send_sms"
            java.lang.String r5 = "voice"
            java.lang.String r4 = "flash"
            java.lang.String r0 = "sms"
            java.lang.String r3 = "wa_old"
            switch(r2) {
                case -795576526: goto L_0x048c;
                case 114009: goto L_0x0497;
                case 97513456: goto L_0x04a2;
                case 112386354: goto L_0x04ad;
                case 1247787042: goto L_0x04b8;
                case 2120743944: goto L_0x04c3;
                default: goto L_0x047e;
            }     // Catch:{ Exception -> 0x0535 }
        L_0x047e:
            java.lang.String r2 = "-1"
            if (r15 == 0) goto L_0x0488
            boolean r15 = r15.equals(r2)     // Catch:{ Exception -> 0x0535 }
            if (r15 == 0) goto L_0x04ce
        L_0x0488:
            r8.A00(r0)     // Catch:{ Exception -> 0x0535 }
            goto L_0x04ce
        L_0x048c:
            boolean r2 = r1.equals(r3)     // Catch:{ Exception -> 0x0535 }
            if (r2 == 0) goto L_0x047e
            if (r12 != 0) goto L_0x047e
            java.lang.String r12 = r9.A0L     // Catch:{ Exception -> 0x0535 }
            goto L_0x047e
        L_0x0497:
            boolean r2 = r1.equals(r0)     // Catch:{ Exception -> 0x0535 }
            if (r2 == 0) goto L_0x047e
            if (r15 != 0) goto L_0x047e
            java.lang.String r15 = r9.A0L     // Catch:{ Exception -> 0x0535 }
            goto L_0x047e
        L_0x04a2:
            boolean r2 = r1.equals(r4)     // Catch:{ Exception -> 0x0535 }
            if (r2 == 0) goto L_0x047e
            if (r13 != 0) goto L_0x047e
            java.lang.String r13 = r9.A0L     // Catch:{ Exception -> 0x0535 }
            goto L_0x047e
        L_0x04ad:
            boolean r2 = r1.equals(r5)     // Catch:{ Exception -> 0x0535 }
            if (r2 == 0) goto L_0x047e
            if (r14 != 0) goto L_0x047e
            java.lang.String r14 = r9.A0L     // Catch:{ Exception -> 0x0535 }
            goto L_0x047e
        L_0x04b8:
            boolean r2 = r1.equals(r6)     // Catch:{ Exception -> 0x0535 }
            if (r2 == 0) goto L_0x047e
            if (r10 != 0) goto L_0x047e
            java.lang.String r10 = r9.A0L     // Catch:{ Exception -> 0x0535 }
            goto L_0x047e
        L_0x04c3:
            boolean r2 = r1.equals(r7)     // Catch:{ Exception -> 0x0535 }
            if (r2 == 0) goto L_0x047e
            if (r11 != 0) goto L_0x047e
            java.lang.String r11 = r9.A0L     // Catch:{ Exception -> 0x0535 }
            goto L_0x047e
        L_0x04ce:
            if (r14 == 0) goto L_0x04d6
            boolean r0 = r14.equals(r2)     // Catch:{ Exception -> 0x0535 }
            if (r0 == 0) goto L_0x04d9
        L_0x04d6:
            r8.A00(r5)     // Catch:{ Exception -> 0x0535 }
        L_0x04d9:
            if (r13 == 0) goto L_0x04e1
            boolean r0 = r13.equals(r2)     // Catch:{ Exception -> 0x0535 }
            if (r0 == 0) goto L_0x04e4
        L_0x04e1:
            r8.A00(r4)     // Catch:{ Exception -> 0x0535 }
        L_0x04e4:
            if (r12 == 0) goto L_0x04ec
            boolean r0 = r12.equals(r2)     // Catch:{ Exception -> 0x0535 }
            if (r0 == 0) goto L_0x04ef
        L_0x04ec:
            r8.A00(r3)     // Catch:{ Exception -> 0x0535 }
        L_0x04ef:
            if (r11 == 0) goto L_0x04f7
            boolean r0 = r11.equals(r2)     // Catch:{ Exception -> 0x0535 }
            if (r0 == 0) goto L_0x04fa
        L_0x04f7:
            r8.A00(r7)     // Catch:{ Exception -> 0x0535 }
        L_0x04fa:
            if (r10 == 0) goto L_0x0502
            boolean r0 = r10.equals(r2)     // Catch:{ Exception -> 0x0535 }
            if (r0 == 0) goto L_0x0505
        L_0x0502:
            r8.A00(r6)     // Catch:{ Exception -> 0x0535 }
        L_0x0505:
            java.util.ArrayList r0 = r9.A0V     // Catch:{ Exception -> 0x0535 }
            if (r0 == 0) goto L_0x0534
            X.0z4 r6 = r8.A00     // Catch:{ Exception -> 0x0535 }
            java.util.ArrayList r5 = r6.A0u()     // Catch:{ Exception -> 0x0535 }
            if (r5 == 0) goto L_0x0531
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0535 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x0535 }
        L_0x0519:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0535 }
            if (r0 == 0) goto L_0x052d
            java.lang.Object r2 = r3.next()     // Catch:{ Exception -> 0x0535 }
            boolean r0 = r5.contains(r2)     // Catch:{ Exception -> 0x0535 }
            if (r0 == 0) goto L_0x0519
            r4.add(r2)     // Catch:{ Exception -> 0x0535 }
            goto L_0x0519
        L_0x052d:
            r6.A1y(r4)     // Catch:{ Exception -> 0x0535 }
            return r9
        L_0x0531:
            r6.A1y(r0)     // Catch:{ Exception -> 0x0535 }
        L_0x0534:
            return r9
        L_0x0535:
            r2 = move-exception
            r0 = r20
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r0, r1)
            java.lang.String r0 = "/error "
            X.C108985cd.A1M(r0, r1, r2)
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            X.ADN r2 = new X.ADN
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192809p1.A00(X.99F, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int):X.ADN");
    }
}
