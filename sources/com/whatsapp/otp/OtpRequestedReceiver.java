package com.whatsapp.otp;

import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.C17880vN;
import android.content.BroadcastReceiver;

public final class OtpRequestedReceiver extends BroadcastReceiver {
    public AnonymousClass11P A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public final Object A05;
    public volatile boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r1.A00, 6758) != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            boolean r0 = r11.A06
            if (r0 != 0) goto L_0x001a
            java.lang.Object r1 = r11.A05
            monitor-enter(r1)
            boolean r0 = r11.A06     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            X.10G r0 = X.AnonymousClass10E.A10(r12)     // Catch:{ all -> 0x0017 }
            X.AnonymousClass10G.AVg(r0, r11)     // Catch:{ all -> 0x0017 }
            r0 = 1
            r11.A06 = r0     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            X.C18070vi.A0h(r12, r13)
            X.00H r0 = r11.A01     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01af
            r0.get()     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "Wa-otp-handshake: handshake intent received"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "_ci_"
            android.os.Parcelable r0 = r13.getParcelableExtra(r0)     // Catch:{ Exception -> 0x01bc }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0187
            java.lang.String r8 = r0.getCreatorPackage()     // Catch:{ Exception -> 0x01bc }
            if (r8 != 0) goto L_0x003b
            java.lang.String r8 = ""
        L_0x003b:
            java.lang.String r2 = "request_id"
            java.lang.String r5 = r13.getStringExtra(r2)     // Catch:{ Exception -> 0x01bc }
            X.00H r0 = r11.A03     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x01bc }
            X.71Z r1 = (X.AnonymousClass71Z) r1     // Catch:{ Exception -> 0x01bc }
            boolean r0 = r1.A02(r8)     // Catch:{ Exception -> 0x01bc }
            if (r0 != 0) goto L_0x005e
            X.0ve r3 = r1.A00     // Catch:{ Exception -> 0x01bc }
            r1 = 6758(0x1a66, float:9.47E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x01bc }
            boolean r1 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ Exception -> 0x01bc }
            r0 = 0
            if (r1 == 0) goto L_0x005f
        L_0x005e:
            r0 = 1
        L_0x005f:
            r4 = 0
            if (r0 == 0) goto L_0x0065
            if (r5 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r5 = r4
            goto L_0x0074
        L_0x0067:
            java.lang.String r1 = "^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$"
            X.1wr r0 = new X.1wr     // Catch:{ Exception -> 0x01bc }
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x01bc }
            boolean r0 = r0.A03(r5)     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0065
        L_0x0074:
            X.00H r0 = r11.A04     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x017b
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x01bc }
            X.6gP r3 = (X.C128616gP) r3     // Catch:{ Exception -> 0x01bc }
            X.11P r0 = r11.A00     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0175
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01bc }
            r10 = r5
            java.lang.String r7 = X.C108985cd.A0f()     // Catch:{ Exception -> 0x01bc }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x01bc }
            java.util.Map r0 = r3.A02     // Catch:{ Exception -> 0x01bc }
            r0.put(r8, r1)     // Catch:{ Exception -> 0x01bc }
            java.util.Map r0 = r3.A00     // Catch:{ Exception -> 0x01bc }
            r0.put(r8, r7)     // Catch:{ Exception -> 0x01bc }
            if (r5 == 0) goto L_0x00a0
            java.util.Map r0 = r3.A01     // Catch:{ Exception -> 0x01bc }
            r0.put(r8, r5)     // Catch:{ Exception -> 0x01bc }
        L_0x00a0:
            java.lang.String r0 = "SDK_VERSION"
            java.lang.String r1 = r13.getStringExtra(r0)     // Catch:{ Exception -> 0x01bc }
            X.00H r0 = r11.A01     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x016f
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x01bc }
            X.72y r4 = (X.C1407672y) r4     // Catch:{ Exception -> 0x01bc }
            X.64P r3 = new X.64P     // Catch:{ Exception -> 0x01bc }
            r3.<init>()     // Catch:{ Exception -> 0x01bc }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ Exception -> 0x01bc }
            r3.A08 = r0     // Catch:{ Exception -> 0x01bc }
            java.lang.Integer r9 = X.C108955ca.A0e()     // Catch:{ Exception -> 0x01bc }
            r3.A07 = r9     // Catch:{ Exception -> 0x01bc }
            r3.A0L = r8     // Catch:{ Exception -> 0x01bc }
            r3.A0E = r7     // Catch:{ Exception -> 0x01bc }
            r3.A0H = r1     // Catch:{ Exception -> 0x01bc }
            X.00H r0 = r4.A07     // Catch:{ Exception -> 0x01bc }
            X.0ve r1 = X.AnonymousClass71Z.A00(r0)     // Catch:{ Exception -> 0x01bc }
            r0 = 7493(0x1d45, float:1.05E-41)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ Exception -> 0x01bc }
            boolean r0 = X.C18020vd.A05(r6, r1, r0)     // Catch:{ Exception -> 0x01bc }
            if (r0 != 0) goto L_0x00d8
            r10 = 0
        L_0x00d8:
            r3.A0G = r10     // Catch:{ Exception -> 0x01bc }
            X.C1407672y.A00(r3, r4)     // Catch:{ Exception -> 0x01bc }
            X.18K r0 = r4.A03     // Catch:{ Exception -> 0x01bc }
            r0.CC7(r3)     // Catch:{ Exception -> 0x01bc }
            X.00H r0 = r4.A06     // Catch:{ Exception -> 0x01bc }
            r0.get()     // Catch:{ Exception -> 0x01bc }
            X.00H r0 = r11.A01     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0169
            r0.get()     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "Wa-otp-handshake: handshake intent registered"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x01bc }
            X.00H r0 = r11.A03     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0166
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01bc }
            X.71Z r0 = (X.AnonymousClass71Z) r0     // Catch:{ Exception -> 0x01bc }
            boolean r0 = r0.A02(r8)     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01e0
            if (r5 == 0) goto L_0x01e0
            X.00H r0 = r11.A02     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01b5
            android.content.Intent r1 = X.AnonymousClass3MZ.A06(r0)     // Catch:{ Exception -> 0x01bc }
            r1.setPackage(r8)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "com.whatsapp.otp.OTP_HANDSHAKE_CONFIRMATION"
            r1.setAction(r0)     // Catch:{ Exception -> 0x01bc }
            r1.putExtra(r2, r5)     // Catch:{ Exception -> 0x01bc }
            r12.sendBroadcast(r1)     // Catch:{ Exception -> 0x01bc }
            X.00H r0 = r11.A01     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0163
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x01bc }
            X.72y r4 = (X.C1407672y) r4     // Catch:{ Exception -> 0x01bc }
            X.00H r3 = r4.A07     // Catch:{ Exception -> 0x01bc }
            X.0ve r1 = X.AnonymousClass71Z.A00(r3)     // Catch:{ Exception -> 0x01bc }
            r0 = 7204(0x1c24, float:1.0095E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01e0
            X.64P r2 = new X.64P     // Catch:{ Exception -> 0x01bc }
            r2.<init>()     // Catch:{ Exception -> 0x01bc }
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01bc }
            r2.A08 = r0     // Catch:{ Exception -> 0x01bc }
            r2.A07 = r9     // Catch:{ Exception -> 0x01bc }
            r2.A0L = r8     // Catch:{ Exception -> 0x01bc }
            r2.A0E = r7     // Catch:{ Exception -> 0x01bc }
            X.0ve r1 = X.AnonymousClass71Z.A00(r3)     // Catch:{ Exception -> 0x01bc }
            r0 = 7493(0x1d45, float:1.05E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)     // Catch:{ Exception -> 0x01bc }
            if (r0 != 0) goto L_0x0153
            r5 = 0
        L_0x0153:
            r2.A0G = r5     // Catch:{ Exception -> 0x01bc }
            X.C1407672y.A00(r2, r4)     // Catch:{ Exception -> 0x01bc }
            X.18K r0 = r4.A03     // Catch:{ Exception -> 0x01bc }
            r0.CC7(r2)     // Catch:{ Exception -> 0x01bc }
            X.00H r0 = r4.A06     // Catch:{ Exception -> 0x01bc }
            r0.get()     // Catch:{ Exception -> 0x01bc }
            return
        L_0x0163:
            java.lang.String r0 = "loggingUtil"
            goto L_0x01b7
        L_0x0166:
            java.lang.String r0 = "otpGatingManager"
            goto L_0x01b7
        L_0x0169:
            java.lang.String r0 = "loggingUtil"
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x01bc }
            goto L_0x01ba
        L_0x016f:
            java.lang.String r0 = "loggingUtil"
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x01bc }
            goto L_0x01ba
        L_0x0175:
            java.lang.String r0 = "time"
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x01bc }
            throw r4     // Catch:{ Exception -> 0x01bc }
        L_0x017b:
            java.lang.String r0 = "otpStateManager"
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x01bc }
            throw r4     // Catch:{ Exception -> 0x01bc }
        L_0x0181:
            java.lang.String r0 = "otpGatingManager"
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x01bc }
            goto L_0x01ba
        L_0x0187:
            X.00H r0 = r11.A01     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x01bc }
            X.72y r1 = (X.C1407672y) r1     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "OTP intent has no caller info"
            r1.A03(r0)     // Catch:{ Exception -> 0x01bc }
            X.00H r0 = r11.A01     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01a3
            r0.get()     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "Wa-otp-handshake: PendingIntent missing from handshake Intent"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x01bc }
            return
        L_0x01a3:
            java.lang.String r0 = "loggingUtil"
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x01bc }
            goto L_0x01ba
        L_0x01a9:
            java.lang.String r0 = "loggingUtil"
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x01bc }
            goto L_0x01ba
        L_0x01af:
            java.lang.String r0 = "loggingUtil"
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x01bc }
            goto L_0x01ba
        L_0x01b5:
            java.lang.String r0 = "otpClient"
        L_0x01b7:
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x01bc }
        L_0x01ba:
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x01bc }
        L_0x01bc:
            r3 = move-exception
            java.lang.String r0 = "OTP: Error while unmarshalling"
            com.whatsapp.util.Log.e(r0, r3)
            X.00H r0 = r11.A01
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r2 = r0.get()
            X.72y r2 = (X.C1407672y) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17890vO.A0U(r3)
            r1.append(r0)
            java.lang.String r0 = " / "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r3)
            r2.A03(r0)
        L_0x01e0:
            return
        L_0x01e1:
            java.lang.String r0 = "loggingUtil"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.otp.OtpRequestedReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public OtpRequestedReceiver(int i) {
        this.A06 = false;
        this.A05 = C17880vN.A0p();
    }

    public OtpRequestedReceiver() {
        this(0);
    }
}
