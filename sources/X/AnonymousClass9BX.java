package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.9BX  reason: invalid class name */
public final class AnonymousClass9BX extends A34 {
    public C180559Na A00;
    public final int A01;
    public final C19830z4 A02;
    public final A98 A03;
    public final C58592kw A04;
    public final AnonymousClass00H A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;

    public void A0E() {
        B9P b9p = (B9P) this.A0A.get();
        if (b9p != null) {
            b9p.CIM(true);
        } else {
            Log.i("SecurityCodeTask/onPostExecute/null callback");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x026a, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x026d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0287, code lost:
        r9.startActivity(r0);
        r9.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x028d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a9, code lost:
        X.AnonymousClass4Yv.A01(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ac, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r19) {
        /*
            r18 = this;
            r4 = r19
            X.9IN r4 = (X.AnonymousClass9IN) r4
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            r1 = r18
            java.lang.ref.WeakReference r0 = r1.A0A
            java.lang.Object r9 = r0.get()
            X.B9P r9 = (X.B9P) r9
            if (r9 == 0) goto L_0x02b1
            r0 = 1
            r9.CIM(r0)
            X.9Na r2 = r1.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r9 = (com.whatsapp.registration.VerifyTwoFactorAuth) r9
            r0 = 0
            r9.A0U = r0
            int r0 = r9.A00
            X.AnonymousClass4Yv.A00(r9, r0)
            r8 = 1
            r9.CIM(r8)
            r9.A0i = r3
            X.11E r0 = r9.A07
            X.11J r5 = r9.A0o
            r0.unregisterObserver(r5)
            int r4 = r4.ordinal()
            r0 = 1000(0x3e8, double:4.94E-321)
            switch(r4) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0133;
                case 2: goto L_0x0291;
                case 3: goto L_0x0143;
                case 4: goto L_0x024f;
                case 5: goto L_0x0160;
                case 6: goto L_0x025d;
                case 7: goto L_0x01db;
                case 8: goto L_0x021a;
                case 9: goto L_0x0225;
                case 10: goto L_0x0143;
                case 11: goto L_0x026e;
                case 12: goto L_0x00ae;
                default: goto L_0x003a;
            }
        L_0x003a:
            return
        L_0x003b:
            X.C17960vV.A07(r2)
            int r4 = r9.A01
            if (r4 != r8) goto L_0x0062
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/reset-email-sent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131897186(0x7f122b62, float:1.9429254E38)
            r9.BhQ(r0)
            java.lang.String r0 = "forgotPinDialogTag"
            r9.A41(r0)
            r9.A4e(r2)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0d(r9, r3)
            r2 = 0
            android.os.Handler r1 = r9.A0n
            java.lang.Runnable r0 = r9.A0p
            r1.postDelayed(r0, r2)
            return
        L_0x0062:
            java.lang.String r3 = r2.A07
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x003a
            java.lang.String r3 = "VerifyTwoFactorAuth/onSecurityCheckResponse/verified"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.00H r3 = r9.A0Y
            X.A8V r3 = X.AnonymousClass8BR.A0q(r3)
            r3.A08()
            com.whatsapp.registration.VerifyTwoFactorAuth.A0d(r9, r8)
            X.0z4 r4 = r9.A0A
            boolean r3 = r2.A0G
            r4.A23(r3)
            X.0z4 r4 = r9.A0A
            boolean r3 = r2.A0F
            r4.A22(r3)
            X.0z4 r4 = r9.A0A
            boolean r3 = r2.A0E
            r4.A2B(r3)
            int r3 = r9.A01
            if (r3 != 0) goto L_0x009a
            X.05w r3 = X.A9B.A05(r9)
            r9.A09 = r3
        L_0x009a:
            r4 = 35
            X.7Pk r3 = new X.7Pk
            r3.<init>(r9, r2, r4)
            X.05w r2 = r9.A09
            if (r2 == 0) goto L_0x02ad
            r2.show()
            X.1KB r2 = r9.A05
            r2.A0K(r3, r0)
            return
        L_0x00ae:
            java.lang.String r0 = "VerifyTwoFactorAuth/removeProgressDialog/"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1CM r4 = r9.A07
            X.8BA r6 = r9.A0I
            X.1LU r7 = r9.A0M
            X.00H r5 = r9.A0Y
            X.0z4 r1 = r9.A0A
            X.10I r0 = r9.A05
            X.C18070vi.A0w(r4, r6, r2, r7, r5)
            X.C18070vi.A0l(r1, r0)
            java.lang.Boolean r0 = X.C17970vW.A01
            java.lang.String r0 = "VerifyPhoneNumberUtils/onConsentPending"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.A8V r5 = X.AnonymousClass8BR.A0q(r5)
            java.lang.String r1 = X.A80.A01(r4)
            java.lang.String r0 = "account_verification_complete"
            r5.A0F(r1, r0)
            java.lang.String r5 = r2.A07
            X.1Pe r6 = (X.C25681Pe) r6
            android.content.SharedPreferences r0 = r6.A02()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "registration_login"
            X.C17880vN.A1E(r1, r0, r5)
            java.lang.String r1 = r2.A0A
            if (r1 == 0) goto L_0x012d
            java.lang.String r0 = "dob"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x012d
            java.lang.String r0 = "parent_verification"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x011c
            r0 = 26
            r4.A01(r0)
            java.lang.String r2 = r2.A09
            if (r2 != 0) goto L_0x0109
            java.lang.String r2 = "https://whatsapp.com/parent_consent/"
        L_0x0109:
            android.content.SharedPreferences r0 = r6.A02()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "url"
            X.C17880vN.A1E(r1, r0, r2)
        L_0x0116:
            android.content.Intent r0 = X.AnonymousClass1LU.A1l(r9, r3)
            goto L_0x0287
        L_0x011c:
            java.lang.String r0 = "youth_consent"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0127
            r0 = 30
            goto L_0x012f
        L_0x0127:
            java.lang.String r0 = "VerifyPhoneNumberUtils/onConsentPending wrong pending for"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0116
        L_0x012d:
            r0 = 25
        L_0x012f:
            r4.A01(r0)
            goto L_0x0116
        L_0x0133:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/wamsys initialization fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "VerifyTwoFactorAuth/removeProgressDialog/"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1KB r0 = r9.A05
            X.C181689Rl.A00(r0)
            return
        L_0x0143:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/connectivity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 32
            X.9uO r0 = r9.A0O
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x015a
            boolean r0 = r9.Bed()
            if (r0 != 0) goto L_0x015a
            X.AnonymousClass4Yv.A01(r9, r1)
            return
        L_0x015a:
            X.1Vn r0 = r9.A0G
            X.A9B.A0O(r9, r0, r1)
            return
        L_0x0160:
            X.C17960vV.A07(r2)
            android.content.SharedPreferences r4 = X.C72453Mb.A0M(r9)
            java.lang.String r3 = "registration_code"
            r14 = 0
            java.lang.String r4 = r4.getString(r3, r14)
            java.lang.String r3 = r9.A0e
            boolean r5 = X.C42171xk.A00(r3, r4)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "VerifyTwoFactorAuth/onSecurityCheckResponse/mismatch "
            X.C17900vP.A0n(r3, r4, r5)
            X.4VX r3 = r9.A0N
            boolean r3 = r3.A07()
            if (r3 == 0) goto L_0x01b2
            X.4VX r3 = r9.A0N
            r3.A01()
        L_0x018a:
            if (r5 == 0) goto L_0x01b8
            r3 = 2131897162(0x7f122b4a, float:1.9429206E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r3 = 2131897161(0x7f122b49, float:1.9429204E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r3 = 2131897145(0x7f122b39, float:1.9429171E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r3 = 2131897202(0x7f122b72, float:1.9429287E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.String r15 = "smsMistake"
            r17 = r14
            r16 = r14
            r9.CMx(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c0
        L_0x01b2:
            com.whatsapp.CodeInputField r3 = r9.A0C
            X.AnonymousClass3MW.A1S(r3)
            goto L_0x018a
        L_0x01b8:
            X.9uO r4 = r9.A0O
            r3 = 2131897207(0x7f122b77, float:1.9429297E38)
            r4.A02(r3)
        L_0x01c0:
            java.lang.String r3 = r2.A06     // Catch:{ NumberFormatException -> 0x01cb }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x01cb }
            long r3 = r3 * r0
            com.whatsapp.registration.VerifyTwoFactorAuth.A0V(r9, r3)     // Catch:{ NumberFormatException -> 0x01cb }
            return
        L_0x01cb:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/mismatch failed to parse: "
            r1.append(r0)
            java.lang.String r0 = r2.A06
            X.C17890vO.A13(r0, r1, r3)
            return
        L_0x01db:
            java.lang.String r4 = "VerifyTwoFactorAuth/onSecurityCheckResponse/guessed-too-fast"
            com.whatsapp.util.Log.w((java.lang.String) r4)
            X.C17960vV.A07(r2)
            java.lang.String r4 = r2.A06     // Catch:{ NumberFormatException -> 0x0202 }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0202 }
            long r4 = r4 * r0
            X.9uO r7 = r9.A0O     // Catch:{ NumberFormatException -> 0x0202 }
            r6 = 2131894991(0x7f1222cf, float:1.9424802E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ NumberFormatException -> 0x0202 }
            X.0vb r0 = r9.A00     // Catch:{ NumberFormatException -> 0x0202 }
            java.lang.String r0 = X.C64052u8.A0A(r0, r4)     // Catch:{ NumberFormatException -> 0x0202 }
            java.lang.String r0 = X.C17880vN.A0q(r9, r0, r1, r3, r6)     // Catch:{ NumberFormatException -> 0x0202 }
            r7.A03(r0)     // Catch:{ NumberFormatException -> 0x0202 }
            com.whatsapp.registration.VerifyTwoFactorAuth.A0V(r9, r4)     // Catch:{ NumberFormatException -> 0x0202 }
            return
        L_0x0202:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/too_fast failed to parse: "
            r1.append(r0)
            java.lang.String r0 = r2.A06
            X.C17890vO.A13(r0, r1, r3)
            X.9uO r1 = r9.A0O
            r0 = 2131897200(0x7f122b70, float:1.9429283E38)
            r1.A02(r0)
            return
        L_0x021a:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/reset-too-soon"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.9uO r1 = r9.A0O
            r0 = 2131897187(0x7f122b63, float:1.9429256E38)
            goto L_0x026a
        L_0x0225:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/stale"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            int r3 = com.whatsapp.registration.VerifyTwoFactorAuth.A03(r9)
            X.C17960vV.A07(r2)
            r9.A4e(r2)
            int r1 = com.whatsapp.registration.VerifyTwoFactorAuth.A03(r9)
            boolean r0 = r9.A0h
            if (r0 != 0) goto L_0x0246
            if (r3 != r1) goto L_0x0246
            java.lang.String r1 = r9.A0e
            int r0 = r9.A01
            com.whatsapp.registration.VerifyTwoFactorAuth.A0c(r9, r1, r0, r8)
            return
        L_0x0246:
            com.whatsapp.registration.VerifyTwoFactorAuth.A0d(r9, r8)
            X.9uO r1 = r9.A0O
            r0 = 2131895028(0x7f1222f4, float:1.9424877E38)
            goto L_0x026a
        L_0x024f:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/incorrect"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0d(r9, r8)
            X.9uO r1 = r9.A0O
            r0 = 2131895064(0x7f122318, float:1.942495E38)
            goto L_0x026a
        L_0x025d:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/too-many-guesses"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0d(r9, r8)
            X.9uO r1 = r9.A0O
            r0 = 2131897200(0x7f122b70, float:1.9429283E38)
        L_0x026a:
            r1.A02(r0)
            return
        L_0x026e:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/blocked"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0d(r9, r8)
            if (r2 == 0) goto L_0x028e
            X.2mr r0 = r2.A04
            if (r0 == 0) goto L_0x028e
            X.1jT r0 = r9.A0Q
            r0.A0A()
            X.2mr r0 = r2.A04
            android.content.Intent r0 = X.AnonymousClass1LU.A1G(r9, r0)
        L_0x0287:
            r9.startActivity(r0)
            r9.finish()
            return
        L_0x028e:
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x02a9
        L_0x0291:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/unspecified"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.9BX r0 = r9.A0U
            if (r0 == 0) goto L_0x02a7
            boolean r0 = X.C108945cZ.A1T(r0)
            if (r0 != 0) goto L_0x02a7
            r9.A0i = r8
            X.11E r0 = r9.A07     // Catch:{ IllegalStateException -> 0x02a7 }
            r0.registerObserver(r5)     // Catch:{ IllegalStateException -> 0x02a7 }
        L_0x02a7:
            r0 = 109(0x6d, float:1.53E-43)
        L_0x02a9:
            X.AnonymousClass4Yv.A01(r9, r0)
            return
        L_0x02ad:
            r3.run()
            return
        L_0x02b1:
            java.lang.String r0 = "SecurityCodeTask/onPostExecute/null callback"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BX.A0H(java.lang.Object):void");
    }

    public AnonymousClass9BX(C19830z4 r2, A98 a98, B9P b9p, C58592kw r5, AnonymousClass00H r6, String str, String str2, String str3, String str4, int i) {
        C108985cd.A1D(str2, str3);
        C18070vi.A0q(r6, r2, a98);
        C18070vi.A0d(r5, 10);
        this.A01 = i;
        this.A09 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A05 = r6;
        this.A02 = r2;
        this.A03 = a98;
        this.A04 = r5;
        this.A0A = AnonymousClass3MW.A0z(b9p);
    }
}
