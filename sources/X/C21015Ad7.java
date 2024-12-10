package X;

/* renamed from: X.Ad7  reason: case insensitive filesystem */
public class C21015Ad7 implements AnonymousClass89K {
    public final int A00;
    public final Object A01;

    public C21015Ad7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        com.whatsapp.util.Log.i("NewDeviceConfirmationRegistrationViewModel/onRegistrationVerified");
        r4.A08.A23(r1);
        r1 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (r1.A07() == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        r1.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b9, code lost:
        throw X.AnonymousClass000.A0s("setVNameCertSetInRegistration");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r3 = r4.A09;
        r3.A0D(r6, r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (r4.A03 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        X.C21449AkG.A00(r4.A0F, r4, 39);
        X.AnonymousClass3MX.A1K(r4.A0E, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        r5 = r4.A0G;
        X.AnonymousClass8BR.A0q(r5).A0I("device_confirm", "successful");
        X.AnonymousClass8BR.A0q(r5).A08();
        X.C33841jT.A03(r3, 2, true);
        ((X.C22881Do) r4.A0H.get()).A00(false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        if (r4.A02 == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fa, code lost:
        X.AnonymousClass3MX.A1K(r4.A0D, 8);
        r4.A0F.CGv(new X.C21449AkG((java.lang.Object) r4, 40), 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0110, code lost:
        X.A9B.A0P(r4.A06.A00, r4.A07, r3, r4.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0126, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012a, code lost:
        r1.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015b, code lost:
        if (r1 == 14) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015d, code lost:
        r1 = ((com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r10.A01).A0D;
        r0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0170, code lost:
        r3 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r10.A01;
        X.C33841jT.A03(r3.A09, 7, true);
        X.AnonymousClass8BR.A0q(r3.A0G).A0I("device_confirm", "successful");
        X.AnonymousClass3MX.A1K(r3.A0E, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BpK(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0085;
                case 1: goto L_0x004e;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.6tX r11 = (X.C136266tX) r11
            int r1 = r11.A00
            r0 = 1
            if (r1 != r0) goto L_0x0022
            java.lang.Object r2 = r10.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r2 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r2
            X.05w r1 = X.A9B.A05(r2)
            r2.A0I = r1
            r0 = 0
            X.7Pl r3 = new X.7Pl
            r3.<init>(r10, r11, r0)
            if (r1 != 0) goto L_0x0072
            r3.run()
        L_0x0021:
            return
        L_0x0022:
            r0 = 11
            if (r1 != r0) goto L_0x003e
            java.lang.Object r1 = r10.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            boolean r0 = r1.A1T
            r5 = 6
            if (r0 == 0) goto L_0x0030
            r5 = 5
        L_0x0030:
            r2 = 0
            r8 = 0
            r6 = -1
            r4 = r2
            r3 = r2
            r9 = r8
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1q(r1, r2, r3, r4, r5, r6, r8, r9)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1k(r1)
            return
        L_0x003e:
            r0 = 13
            if (r1 != r0) goto L_0x0021
            java.lang.Object r0 = r10.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r0 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r0
            X.9uO r1 = r0.A0h
            r0 = 45
            r1.A01(r0)
            return
        L_0x004e:
            X.6tX r11 = (X.C136266tX) r11
            int r1 = r11.A00
            r0 = 1
            if (r1 != r0) goto L_0x0068
            java.lang.Object r4 = r10.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r4 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r4
            java.lang.String r6 = r4.A00
            X.C17960vV.A07(r6)
            java.lang.String r5 = r4.A01
            X.C17960vV.A07(r5)
            java.lang.String r2 = r11.A02
            boolean r1 = r11.A05
            goto L_0x009e
        L_0x0068:
            r0 = 11
            if (r1 == r0) goto L_0x0170
            r0 = 13
            if (r1 != r0) goto L_0x0021
            goto L_0x015d
        L_0x0072:
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x007d
            X.05w r0 = r2.A0I
            r0.show()
        L_0x007d:
            X.1KB r2 = r2.A05
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A0K(r3, r0)
            return
        L_0x0085:
            X.6tW r11 = (X.C136256tW) r11
            int r1 = r11.A00
            r0 = 2
            if (r1 != r0) goto L_0x011c
            java.lang.Object r4 = r10.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r4 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r4
            java.lang.String r6 = r4.A00
            X.C17960vV.A07(r6)
            java.lang.String r5 = r4.A01
            X.C17960vV.A07(r5)
            java.lang.String r2 = r11.A02
            boolean r1 = r11.A05
        L_0x009e:
            java.lang.String r0 = "NewDeviceConfirmationRegistrationViewModel/onRegistrationVerified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r0 = r4.A08
            r0.A23(r1)
            X.0zA r1 = r4.A05
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x00ba
            r1.A03()
            java.lang.String r0 = "setVNameCertSetInRegistration"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00ba:
            X.1jT r3 = r4.A09
            r3.A0D(r6, r5, r2)
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x00d1
            X.10I r1 = r4.A0F
            r0 = 39
            X.C21449AkG.A00(r1, r4, r0)
            X.1wy r1 = r4.A0E
            r0 = 1
            X.AnonymousClass3MX.A1K(r1, r0)
            return
        L_0x00d1:
            X.00H r5 = r4.A0G
            X.A8V r2 = X.AnonymousClass8BR.A0q(r5)
            java.lang.String r1 = "device_confirm"
            java.lang.String r0 = "successful"
            r2.A0I(r1, r0)
            X.A8V r0 = X.AnonymousClass8BR.A0q(r5)
            r0.A08()
            r1 = 2
            r0 = 1
            X.C33841jT.A03(r3, r1, r0)
            X.00H r0 = r4.A0H
            java.lang.Object r1 = r0.get()
            X.1Do r1 = (X.C22881Do) r1
            r0 = 0
            r1.A00(r0, r0)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0110
            X.1wy r1 = r4.A0D
            r0 = 8
            X.AnonymousClass3MX.A1K(r1, r0)
            X.10I r3 = r4.A0F
            r0 = 40
            X.AkG r2 = new X.AkG
            r2.<init>((java.lang.Object) r4, (int) r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.CGv(r2, r0)
            return
        L_0x0110:
            X.118 r0 = r4.A06
            android.content.Context r2 = r0.A00
            X.1Vn r1 = r4.A07
            boolean r0 = r4.A03
            X.A9B.A0P(r2, r1, r3, r0)
            return
        L_0x011c:
            r0 = 1
            if (r1 != r0) goto L_0x012e
            java.lang.Object r0 = r10.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1wy r1 = r0.A0D
            r0 = 3
        L_0x0126:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x012a:
            r1.A0E(r0)
            return
        L_0x012e:
            r0 = 11
            if (r1 != r0) goto L_0x013a
            java.lang.Object r0 = r10.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1wy r1 = r0.A0D
            r0 = 5
            goto L_0x0126
        L_0x013a:
            r0 = 12
            r5 = 4
            if (r1 != r0) goto L_0x0155
            java.lang.String r2 = r11.A03
            r0 = -1
            long r3 = X.A9B.A02(r2, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0165
            java.lang.Object r0 = r10.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1wy r1 = r0.A0D
            r0 = 6
            goto L_0x0126
        L_0x0155:
            r0 = 10
            if (r1 == r0) goto L_0x0170
            r0 = 14
            if (r1 != r0) goto L_0x0165
        L_0x015d:
            java.lang.Object r0 = r10.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1wy r1 = r0.A0D
            r0 = 7
            goto L_0x0126
        L_0x0165:
            java.lang.Object r0 = r10.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1wy r1 = r0.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x012a
        L_0x0170:
            java.lang.Object r3 = r10.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r3 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r3
            X.1jT r2 = r3.A09
            r1 = 7
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            X.00H r0 = r3.A0G
            X.A8V r2 = X.AnonymousClass8BR.A0q(r0)
            java.lang.String r1 = "device_confirm"
            java.lang.String r0 = "successful"
            r2.A0I(r1, r0)
            X.1wy r1 = r3.A0E
            r0 = 3
            X.AnonymousClass3MX.A1K(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015Ad7.BpK(java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(int r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 14
            if (r3 != r0) goto L_0x0017
            java.lang.String r0 = "VerifyPhoneNumber/startFetchingDeviceConfirmationStatus/wamsys initialization fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r2.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.1KB r0 = r0.A05
            X.C181689Rl.A00(r0)
        L_0x0017:
            return
        L_0x0018:
            r0 = 14
            if (r3 != r0) goto L_0x0017
            java.lang.String r0 = "NewDeviceConfirmationRegistrationViewModel/send device confirmation/error/wamsys initialization fails"
            goto L_0x0025
        L_0x001f:
            r0 = 15
            if (r3 != r0) goto L_0x0033
            java.lang.String r0 = "NewDeviceConfirmationRegistrationViewModel/resend device confirmation/error/wamsys initialization fails"
        L_0x0025:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r2.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1wy r1 = r0.A0D
            r0 = 0
        L_0x002f:
            X.AnonymousClass3MX.A1K(r1, r0)
            return
        L_0x0033:
            java.lang.Object r0 = r2.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1wy r1 = r0.A0D
            r0 = 4
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015Ad7.onError(int):void");
    }
}
