package X;

import android.content.SharedPreferences;

public final class A5R {
    public SharedPreferences A00;
    public final AnonymousClass11P A01;
    public final C18010vc A02;

    public static final synchronized SharedPreferences A01(A5R a5r) {
        SharedPreferences sharedPreferences;
        synchronized (a5r) {
            sharedPreferences = a5r.A00;
            if (sharedPreferences == null) {
                sharedPreferences = a5r.A02.A05("registration.verifyphone.VerifyPhoneNumber");
                a5r.A00 = sharedPreferences;
            }
            C18070vi.A0z(sharedPreferences, "null cannot be cast to non-null type android.content.SharedPreferences");
        }
        return sharedPreferences;
    }

    public static long A00(A5R a5r, String str) {
        return a5r.A02(str, -1);
    }

    public A5R(AnonymousClass11P r1, C18010vc r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r4 = r1.getLong(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A02(java.lang.String r3, long r4) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -795576526: goto L_0x000b;
                case 114009: goto L_0x0018;
                case 97513456: goto L_0x0025;
                case 112386354: goto L_0x0032;
                case 1247787042: goto L_0x0041;
                case 2120743944: goto L_0x0050;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.System.currentTimeMillis()
            return r4
        L_0x000b:
            boolean r0 = X.AnonymousClass8BR.A1W(r3)
            if (r0 == 0) goto L_0x0007
            android.content.SharedPreferences r1 = A01(r2)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
            goto L_0x005c
        L_0x0018:
            boolean r0 = X.AnonymousClass8BR.A1U(r3)
            if (r0 == 0) goto L_0x0007
            android.content.SharedPreferences r1 = A01(r2)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time"
            goto L_0x005c
        L_0x0025:
            boolean r0 = X.AnonymousClass8BR.A1V(r3)
            if (r0 == 0) goto L_0x0007
            android.content.SharedPreferences r1 = A01(r2)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.flash_retry_time"
            goto L_0x005c
        L_0x0032:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.content.SharedPreferences r1 = A01(r2)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.call_countdown_end_time"
            goto L_0x005c
        L_0x0041:
            java.lang.String r0 = "send_sms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.content.SharedPreferences r1 = A01(r2)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.send_sms_retry_time"
            goto L_0x005c
        L_0x0050:
            boolean r0 = X.AnonymousClass8BR.A1X(r3)
            if (r0 == 0) goto L_0x0007
            android.content.SharedPreferences r1 = A01(r2)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.email_retry_time"
        L_0x005c:
            long r4 = r1.getLong(r0, r4)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A5R.A02(java.lang.String, long):long");
    }

    public final String A03(String str, String str2) {
        C18070vi.A0h(str, str2);
        if (!str.equals(A01(this).getString("com.whatsapp.registration.VerifyPhoneNumber.sms_cc", (String) null)) || !str2.equals(A01(this).getString("com.whatsapp.registration.VerifyPhoneNumber.sms_phone_number", (String) null))) {
            return null;
        }
        return A01(this).getString("com.whatsapp.registration.VerifyPhoneNumber.sms_code", (String) null);
    }

    public final void A04() {
        C17880vN.A1B(A01(this).edit(), "com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time");
    }

    public final void A05() {
        SharedPreferences.Editor edit = A01(this).edit();
        edit.remove("com.whatsapp.registration.VerifyPhoneNumber.sms_code");
        edit.remove("com.whatsapp.registration.VerifyPhoneNumber.sms_cc");
        edit.remove("com.whatsapp.registration.VerifyPhoneNumber.sms_phone_number");
        edit.apply();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r1.remove(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumberPrefs/clearRequestCodeRetryTime/method="
            X.C17900vP.A0f(r0, r3, r1)
            android.content.SharedPreferences r0 = A01(r2)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            int r0 = r3.hashCode()
            switch(r0) {
                case -795576526: goto L_0x001c;
                case 114009: goto L_0x0025;
                case 97513456: goto L_0x002e;
                case 112386354: goto L_0x0037;
                case 1247787042: goto L_0x0042;
                case 2120743944: goto L_0x004d;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1.apply()
            return
        L_0x001c:
            boolean r0 = X.AnonymousClass8BR.A1W(r3)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
            goto L_0x0055
        L_0x0025:
            boolean r0 = X.AnonymousClass8BR.A1U(r3)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time"
            goto L_0x0055
        L_0x002e:
            boolean r0 = X.AnonymousClass8BR.A1V(r3)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.flash_retry_time"
            goto L_0x0055
        L_0x0037:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.call_countdown_end_time"
            goto L_0x0055
        L_0x0042:
            java.lang.String r0 = "send_sms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.send_sms_retry_time"
            goto L_0x0055
        L_0x004d:
            boolean r0 = X.AnonymousClass8BR.A1X(r3)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.email_retry_time"
        L_0x0055:
            r1.remove(r0)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A5R.A06(java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r1.putLong(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.lang.String r3, long r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumberPrefs/saveRequestCodeRetryTime/method="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "/endTimeInMs="
            X.C17900vP.A0m(r0, r1, r4)
            android.content.SharedPreferences r0 = A01(r2)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            int r0 = r3.hashCode()
            switch(r0) {
                case -795576526: goto L_0x0024;
                case 114009: goto L_0x002d;
                case 97513456: goto L_0x0036;
                case 112386354: goto L_0x003f;
                case 1247787042: goto L_0x004a;
                case 2120743944: goto L_0x0055;
                default: goto L_0x0020;
            }
        L_0x0020:
            r1.apply()
            return
        L_0x0024:
            boolean r0 = X.AnonymousClass8BR.A1W(r3)
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
            goto L_0x005d
        L_0x002d:
            boolean r0 = X.AnonymousClass8BR.A1U(r3)
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time"
            goto L_0x005d
        L_0x0036:
            boolean r0 = X.AnonymousClass8BR.A1V(r3)
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.flash_retry_time"
            goto L_0x005d
        L_0x003f:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.call_countdown_end_time"
            goto L_0x005d
        L_0x004a:
            java.lang.String r0 = "send_sms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.send_sms_retry_time"
            goto L_0x005d
        L_0x0055:
            boolean r0 = X.AnonymousClass8BR.A1X(r3)
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.email_retry_time"
        L_0x005d:
            r1.putLong(r0, r4)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A5R.A07(java.lang.String, long):void");
    }
}
