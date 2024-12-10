package X;

import com.whatsapp.registration.VerifyTwoFactorAuth;

/* renamed from: X.AkG  reason: case insensitive filesystem */
public class C21449AkG implements Runnable {
    public final int A00;
    public final Object A01;

    public C21449AkG(VerifyTwoFactorAuth verifyTwoFactorAuth, int i) {
        this.A00 = i;
        switch (i) {
            case 27:
            case 28:
            case 29:
            case 30:
                this.A01 = verifyTwoFactorAuth;
                return;
            default:
                this.A01 = verifyTwoFactorAuth;
                return;
        }
    }

    public static void A00(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C21449AkG(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity} */
    /* JADX WARNING: type inference failed for: r4v10, types: [X.BZ6, X.Cso] */
    /* JADX WARNING: type inference failed for: r1v88, types: [X.E1k, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04d1, code lost:
        r2 = new X.C2L(X.C24340Bzb.A02, "packageName isn't supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0511, code lost:
        if (r2.equals(r0) == false) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0513, code lost:
        r3 = new X.AnonymousClass8QV(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0555, code lost:
        r1 = new X.AnonymousClass9UU(r1).A00;
        r0 = r1.getPackageManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0560, code lost:
        if (r0 != null) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x056e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0570, code lost:
        r2 = new X.C191259mH(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0575, code lost:
        r4 = new X.CSS(r1, r3, r7);
        r3 = new X.C189719jh(r6);
        r1 = X.AnonymousClass00R.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0581, code lost:
        if (r2 == null) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0583, code lost:
        r7 = r2.A02;
        r8 = r2.A00.A00();
        r10 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        r13 = r2.A01.A00;
        r9 = r13.getPackageInfo(X.C24717CHe.A01, 4288);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x059d, code lost:
        if (r9.applicationInfo == null) goto L_0x0619;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x059f, code lost:
        r6 = r9.signatures;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05a1, code lost:
        if (r6 == null) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05a5, code lost:
        if (r6.length != 1) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05a7, code lost:
        r11 = r6[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05b0, code lost:
        if (X.AnonymousClass9U3.A01.equals(r11) == false) goto L_0x061c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05b2, code lost:
        r12 = X.AnonymousClass9IH.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        r1.A0K(6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0622, code lost:
        if (X.AnonymousClass9U3.A00.equals(r11) == false) goto L_0x0627;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0624, code lost:
        r12 = X.AnonymousClass9IH.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x062d, code lost:
        if (X.AnonymousClass9U3.A02.equals(r11) == false) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x062f, code lost:
        r12 = X.AnonymousClass9IH.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        r6 = r13.getPackageInfo("android", 64).signatures;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x063c, code lost:
        if (r6 == null) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x063f, code lost:
        if (r6.length != 1) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0647, code lost:
        if (r6[0].equals(r11) == false) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0649, code lost:
        r12 = X.AnonymousClass9IH.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x064d, code lost:
        r12 = X.AnonymousClass9IH.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0651, code lost:
        r12 = X.AnonymousClass9IH.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x08ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x08ef, code lost:
        r1 = X.AnonymousClass000.A11("AppManagerInstallReferrerUtils/getInstallReferrerFromAppManager/onError ");
        X.AnonymousClass8BS.A1I(r1, r0);
        r1.append(' ');
        r1.append(r0.getStackTrace());
        X.C17890vO.A0w(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0a15, code lost:
        X.AnonymousClass3MX.A1J(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0a18, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0a56, code lost:
        r0.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0a59, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a89, code lost:
        ((X.C22881Do) r0.get()).A00(false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a93, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0b6a, code lost:
        if (r8 == null) goto L_0x0b6c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0bdb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0bdf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0be6, code lost:
        if (r12 != null) goto L_0x0c0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0c0b, code lost:
        if (r12 != null) goto L_0x0c0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0c13, code lost:
        if (X.AnonymousClass1YF.A0Y(r12, "@", false) == false) goto L_0x0c1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c15, code lost:
        r12 = X.C108955ca.A0q(0, X.AnonymousClass1YF.A0F(r12, "@", 0, false), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c1d, code lost:
        r8 = r12.replace('.', ' ');
        X.C18070vi.A0X(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0c30, code lost:
        r3.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0c33, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0c4a, code lost:
        r1.A2G(new byte[r0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0c4f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0c82, code lost:
        X.AnonymousClass4Yv.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0c85, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0cbb, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0cbf, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x067d A[Catch:{ C2L | Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x06c0 A[SYNTHETIC, Splitter:B:304:0x06c0] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0743 A[Catch:{ C2L | Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x07b4 A[Catch:{ C2L | Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x07bb A[Catch:{ C2L | Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0864 A[Catch:{ C2L | Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0867 A[Catch:{ C2L | Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0881 A[Catch:{ C2L | Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0890 A[Catch:{ C2L | Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x08a3 A[Catch:{ C2L | Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x08ee A[ExcHandler: C2L | Exception (r0v170 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:179:0x04bb] */
    /* JADX WARNING: Removed duplicated region for block: B:619:0x06be A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r1 = r26
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0c86;
                case 1: goto L_0x041c;
                case 2: goto L_0x0c77;
                case 3: goto L_0x0c6f;
                case 4: goto L_0x0c5a;
                case 5: goto L_0x0c5a;
                case 6: goto L_0x02bd;
                case 7: goto L_0x0c50;
                case 8: goto L_0x029d;
                case 9: goto L_0x042a;
                case 10: goto L_0x01d0;
                case 11: goto L_0x01a9;
                case 12: goto L_0x0c43;
                case 13: goto L_0x016d;
                case 14: goto L_0x0156;
                case 15: goto L_0x0b2d;
                case 16: goto L_0x008c;
                case 17: goto L_0x0b1f;
                case 18: goto L_0x0ac5;
                case 19: goto L_0x0a94;
                case 20: goto L_0x0068;
                case 21: goto L_0x0044;
                case 22: goto L_0x0017;
                case 23: goto L_0x0a83;
                case 24: goto L_0x0a7a;
                case 25: goto L_0x0a6d;
                case 26: goto L_0x0a61;
                case 27: goto L_0x0a5a;
                case 28: goto L_0x0a50;
                case 29: goto L_0x0a3c;
                case 30: goto L_0x0a34;
                case 31: goto L_0x0a19;
                case 32: goto L_0x0a0b;
                case 33: goto L_0x0007;
                case 34: goto L_0x09d0;
                case 35: goto L_0x09b9;
                case 36: goto L_0x09af;
                case 37: goto L_0x09a9;
                case 38: goto L_0x0007;
                case 39: goto L_0x09a1;
                case 40: goto L_0x0996;
                case 41: goto L_0x0988;
                case 42: goto L_0x0037;
                case 43: goto L_0x096f;
                case 44: goto L_0x001e;
                case 45: goto L_0x0963;
                case 46: goto L_0x094a;
                case 47: goto L_0x0921;
                case 48: goto L_0x091b;
                case 49: goto L_0x0911;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r1.A01
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r2 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r2
            X.00H r0 = r2.A0B
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "notification-problems-troubleshooting"
        L_0x0013:
            r1.A01(r2, r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r0 = r1.A01
            X.1jT r0 = (X.C33841jT) r0
            X.1To r1 = r0.A08
            goto L_0x0087
        L_0x001e:
            java.lang.Object r2 = r1.A01
            X.4SH r2 = (X.AnonymousClass4SH) r2
            r1 = 0
            com.whatsapp.WaImageView r0 = r2.A02
            X.C72453Mb.A1D(r0)
            com.airbnb.lottie.LottieAnimationView r0 = r2.A01
            if (r0 == 0) goto L_0x002f
            r0.setVisibility(r1)
        L_0x002f:
            com.airbnb.lottie.LottieAnimationView r0 = r2.A01
            if (r0 == 0) goto L_0x0016
            r0.A04()
            return
        L_0x0037:
            java.lang.Object r2 = r1.A01
            com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity r2 = (com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity) r2
            X.00H r0 = r2.A03
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "received-verification-code"
            goto L_0x0013
        L_0x0044:
            java.lang.Object r4 = r1.A01
            X.1jT r4 = (X.C33841jT) r4
            X.1KB r0 = r4.A04
            X.1FR r3 = r0.A00
            if (r3 == 0) goto L_0x0064
            X.0ve r2 = r4.A0G
            X.00H r0 = r4.A0O
            java.lang.Object r1 = r0.get()
            X.1Do r1 = (X.C22881Do) r1
            X.00H r0 = r4.A0M
            X.1cN r0 = X.C17880vN.A0I(r0)
            boolean r0 = X.C88364Zk.A01(r3, r0, r2, r1)
            if (r0 != 0) goto L_0x0016
        L_0x0064:
            r4.A0B()
            return
        L_0x0068:
            java.lang.Object r4 = r1.A01
            X.1jT r4 = (X.C33841jT) r4
            X.1RK r3 = r4.A0F
            boolean r0 = r3.A0B()
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "companion-device-manager/removeAllDevicesFromDatabase"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10s r2 = r3.A0I
            r1 = 42
            X.3Bq r0 = new X.3Bq
            r0.<init>(r3, r1)
            r2.execute(r0)
            X.1To r1 = r4.A08
        L_0x0087:
            r0 = 6
            r1.A0K(r0)
            return
        L_0x008c:
            java.lang.Object r4 = r1.A01
            com.whatsapp.registration.RegisterName r4 = (com.whatsapp.registration.RegisterName) r4
            java.lang.String r6 = "registername/waiting for abprop update exception"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "registername/checkAndWaitForAbpropUpdated/version/ "
            r1.append(r0)
            X.19F r0 = r4.A0e
            if (r0 == 0) goto L_0x0cb6
            int r0 = r0.A01()
            X.C17900vP.A0o(r1, r0)
            X.19F r0 = r4.A0e
            if (r0 == 0) goto L_0x0cb6
            int r0 = r0.A01()
            if (r0 > 0) goto L_0x00eb
            X.10U r0 = r4.A0f
            if (r0 == 0) goto L_0x0cb3
            X.1Py r5 = r4.A1h
            r0.registerObserver(r5)
            X.19F r0 = r4.A0e
            if (r0 == 0) goto L_0x0cb6
            int r0 = r0.A01()
            if (r0 > 0) goto L_0x00d1
            X.5qs r3 = r4.A1f     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00cd }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00cd }
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.get(r0, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00cd }
            goto L_0x00d1
        L_0x00cd:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
        L_0x00d1:
            X.10U r0 = r4.A0f
            if (r0 == 0) goto L_0x0cb3
            r0.unregisterObserver(r5)
            X.19F r0 = r4.A0e
            if (r0 == 0) goto L_0x0cb6
            int r0 = r0.A01()
            if (r0 > 0) goto L_0x00eb
            X.190 r3 = r4.A03
            r2 = 0
            r1 = 0
            java.lang.String r0 = "abprop-not-updated before nc logging"
            r3.A0G(r0, r2, r1)
        L_0x00eb:
            X.00H r0 = r4.A1G
            if (r0 == 0) goto L_0x0cb0
            java.lang.Object r5 = r0.get()
            X.1pJ r5 = (X.C37311pJ) r5
            X.0z4 r3 = r5.A07
            r0 = 0
            r3.A26(r0)
            X.0ve r2 = r5.A08
            r1 = 5868(0x16ec, float:8.223E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0115
            X.1iv r1 = r5.A0A
            int r0 = r5.A00
            boolean r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0115
            r0 = 1
            r3.A26(r0)
        L_0x0115:
            X.1UN r0 = r4.A0b
            if (r0 == 0) goto L_0x0cad
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x0135
            X.1PY r3 = r4.A0k
            if (r3 == 0) goto L_0x0caa
            X.0z4 r2 = r4.A0A
            X.C18070vi.A0W(r2)
            X.11S r1 = r4.A02
            X.C18070vi.A0W(r1)
            X.3He r0 = new X.3He
            r0.<init>(r4)
            X.AnonymousClass9Q2.A00(r1, r2, r3, r0)
        L_0x0135:
            int r1 = X.AnonymousClass8BU.A02(r4)
            r0 = 37
            if (r1 == r0) goto L_0x014e
            X.00H r0 = r4.A1H
            if (r0 == 0) goto L_0x0ca7
            java.lang.Object r1 = r0.get()
            X.9m8 r1 = (X.C191169m8) r1
            java.lang.String r0 = r4.A4k()
            r1.A00(r0)
        L_0x014e:
            X.3Ce r0 = com.whatsapp.registration.RegisterName.A1n
            if (r0 == 0) goto L_0x0016
            r0.run()
            return
        L_0x0156:
            java.lang.Object r2 = r1.A01
            com.whatsapp.registration.RegisterName r2 = (com.whatsapp.registration.RegisterName) r2
            X.4UI r0 = r2.A0a
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.A01()
            r1 = 1
            if (r0 != r1) goto L_0x0016
            X.4UI r0 = r2.A0a
            if (r0 == 0) goto L_0x0016
            r0.A00(r1)
            return
        L_0x016d:
            java.lang.Object r5 = r1.A01
            X.1FU r5 = (X.AnonymousClass1FU) r5
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r5)     // Catch:{ IOException -> 0x0016 }
            java.lang.String r0 = "pref_nta_profile_pic"
            java.lang.String r1 = X.C17880vN.A0r(r1, r0)     // Catch:{ IOException -> 0x0016 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0016 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0016 }
            java.io.InputStream r4 = r0.openStream()     // Catch:{ IOException -> 0x0016 }
            if (r4 != 0) goto L_0x018d
            java.lang.String r0 = "Failed to fetch profile picture for nta"
            X.C31081ez.A01(r0)     // Catch:{ all -> 0x01a2 }
            goto L_0x0cc0
        L_0x018d:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ all -> 0x01a2 }
            X.1KB r2 = r5.A05     // Catch:{ all -> 0x01a2 }
            r1 = 29
            X.7Pk r0 = new X.7Pk     // Catch:{ all -> 0x01a2 }
            r0.<init>(r5, r3, r1)     // Catch:{ all -> 0x01a2 }
            r2.A0J(r0)     // Catch:{ all -> 0x01a2 }
            r4.close()     // Catch:{ IOException -> 0x0016 }
            goto L_0x0cc1
        L_0x01a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a4 }
        L_0x01a4:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ IOException -> 0x0016 }
            throw r0     // Catch:{ IOException -> 0x0016 }
        L_0x01a9:
            java.lang.Object r2 = r1.A01
            X.2lH r2 = (X.C58802lH) r2
            X.1Ro r0 = r2.A02
            X.1Cd r0 = r0.A00
            r0.A06()
            java.io.File r0 = r0.A03
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0016
            X.1Le r0 = r2.A03
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x0016
            X.1Mm r1 = r2.A01
            X.0zA r0 = r2.A00
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = X.C50252Ts.A00(r0)
            r1.A01(r0)
            return
        L_0x01d0:
            java.lang.Object r3 = r1.A01
            X.2lH r3 = (X.C58802lH) r3
            X.00H r0 = r3.A09
            boolean r0 = X.C72453Mb.A1X(r0)
            if (r0 == 0) goto L_0x01f7
            X.00H r0 = r3.A06
            java.lang.Object r1 = r0.get()
            X.6cK r1 = (X.C126186cK) r1
            X.00H r0 = r3.A08
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.put(r2, r0)
        L_0x01f7:
            X.00H r0 = r3.A07
            java.lang.Object r0 = r0.get()
            X.1tF r0 = (X.C39541tF) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x021f
            X.00H r0 = r3.A06
            java.lang.Object r1 = r0.get()
            X.6cK r1 = (X.C126186cK) r1
            X.36V r2 = new X.36V
            r2.<init>()
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.put(r2, r0)
        L_0x021f:
            X.00H r0 = r3.A05
            java.lang.Object r2 = r0.get()
            X.4oy r2 = (X.C97134oy) r2
            X.0vl r0 = r2.A03
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0240
            X.00H r0 = r3.A06
            java.lang.Object r0 = r0.get()
            X.6cK r0 = (X.C126186cK) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.A00
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.put(r2, r0)
        L_0x0240:
            X.1iv r9 = r3.A04
            X.1iu r8 = r9.A04
            r3 = 0
            r8.A01(r3, r3)
            X.0ve r2 = r9.A01
            r1 = 4679(0x1247, float:6.557E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0016
            X.00H r0 = r9.A06
            java.lang.Object r0 = r0.get()
            X.6cK r0 = (X.C126186cK) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Set r1 = r0.keySet()
            X.C18070vi.A0X(r1)
            X.B9E[] r0 = new X.B9E[r3]
            java.lang.Object[] r7 = r1.toArray(r0)
            X.B9E[] r7 = (X.B9E[]) r7
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            int r5 = r7.length
            r4 = 0
        L_0x0273:
            if (r4 >= r5) goto L_0x028f
            r0 = r7[r4]
            X.2tN[] r3 = r0.CEA()
            r9.A05(r3)
            int r2 = r3.length
            r1 = 0
        L_0x0280:
            if (r1 >= r2) goto L_0x028c
            r0 = r3[r1]
            int r0 = r0.A01
            X.C17890vO.A1D(r6, r0)
            int r1 = r1 + 1
            goto L_0x0280
        L_0x028c:
            int r4 = r4 + 1
            goto L_0x0273
        L_0x028f:
            boolean r0 = X.C17880vN.A1X(r6)
            if (r0 == 0) goto L_0x0016
            int[] r0 = X.C41431wN.A00(r6)
            r8.A02(r0)
            return
        L_0x029d:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.EULA r0 = (com.whatsapp.registration.EULA) r0
            java.lang.String r3 = "eula_tos_accepted"
            java.lang.String r2 = "eula_screen"
            X.00H r0 = r0.A0h
            java.lang.Object r1 = r0.get()
            X.A29 r1 = (X.A29) r1
            X.0vl r0 = r1.A04
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0016
            r0 = 0
            X.A29.A00(r1, r2, r3, r0)
            r1.A02(r2, r3)
            return
        L_0x02bd:
            java.lang.Object r8 = r1.A01
            com.whatsapp.registration.EULA r8 = (com.whatsapp.registration.EULA) r8
            X.00H r0 = r8.A0c
            java.lang.Object r1 = r0.get()
            X.9Yu r1 = (X.C183579Yu) r1
            java.lang.String r0 = "FoaBackupTokenRequester/requestFoaBackupToken"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r1 = r1.A00
            java.lang.Object r0 = r1.get()
            X.A14 r0 = (X.A14) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x02f0
            java.lang.Object r3 = r1.get()
            X.A14 r3 = (X.A14) r3
            X.26C r2 = new X.26C
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "com.facebook.GET_FOA_BACKUP_TOKEN"
            r3.A01(r2, r1, r0)
        L_0x02f0:
            java.lang.String r0 = "EULA/retrieveBackupToken/try to retrieve token from block store"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r5 = r8.A0V
            r5.get()
            X.0z4 r6 = r8.A0A
            X.190 r7 = r8.A03
            X.CPx r2 = X.BZ6.A00
            X.DHv r1 = X.C28622EAu.A00
            X.Chd r0 = X.C25540Chd.A02
            X.BZ6 r4 = new X.BZ6
            r4.<init>(r8, r1, r2, r0)
            X.CWc r2 = X.C25558Chw.A00()
            r0 = 1
            X.Bcl[] r1 = new X.C23191Bcl[r0]
            X.Bcl r0 = X.AnonymousClass9UG.A00
            r3 = 0
            r1[r3] = r0
            r2.A03 = r1
            X.DIL r0 = new X.DIL
            r0.<init>(r4)
            r2.A01 = r0
            r2.A02 = r3
            r0 = 1570(0x622, float:2.2E-42)
            r2.A00 = r0
            X.BZS r0 = r2.A00()
            com.google.android.gms.tasks.zzw r2 = X.C26126Cso.A02(r4, r0, r3)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0334 }
            r0 = 60
            com.google.android.gms.tasks.Tasks.await(r2, r0, r4)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0334 }
            goto L_0x0354
        L_0x0334:
            r4 = move-exception
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/exception receiving bytes"
            com.whatsapp.util.Log.e(r0, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = " : "
            java.lang.String r1 = X.C17900vP.A0C(r0, r1, r4)
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore"
            r7.A0E(r0, r1, r4)
        L_0x0354:
            boolean r0 = r2.isSuccessful()
            r4 = 0
            if (r0 == 0) goto L_0x0408
            java.lang.Object r0 = r2.getResult()
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x0408
            int r0 = r0.length
            if (r0 == 0) goto L_0x0408
            java.lang.Object r3 = r2.getResult()
            byte[] r3 = (byte[]) r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/Block Store token success/saved token size is "
            r2.append(r0)
            int r1 = r3.length
            r2.append(r1)
            java.lang.String r0 = " bytes"
            X.C17890vO.A1A(r2, r0)
            X.C20138A8z.A06(r6, r4, r1)
            r0 = 1
            X.C20138A8z.A05(r8, r6, r4, r3, r0)
        L_0x0385:
            r5.get()
            r4 = 1
            java.io.File r1 = r8.getFilesDir()
            java.lang.String r0 = "backup_token"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x03ac
            java.lang.String r0 = "EULA/retrieveBackupToken/successfully retrieved token from block store"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r0 = r8.A0A
            java.lang.String r2 = "block_store"
        L_0x03a2:
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "backup_token_source"
            X.C17880vN.A1E(r1, r0, r2)
            return
        L_0x03ac:
            boolean r0 = X.AnonymousClass9P3.A00(r8)
            r3 = 0
            if (r0 == 0) goto L_0x0ceb
            X.CPx r11 = X.BZ0.A00
            X.DI2 r10 = X.DI2.A01
            X.DIj r1 = new X.DIj
            r1.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            X.Chd r12 = new X.Chd
            r12.<init>(r0, r1)
            X.BZ0 r7 = new X.BZ0
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.String r1 = "com.whatsapp"
            X.Ba6 r0 = new X.Ba6
            r0.<init>(r1)
            X.BYH r1 = new X.BYH
            r1.<init>(r0)
            r0 = 0
            com.google.android.gms.tasks.zzw r5 = X.C26126Cso.A02(r7, r1, r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0cc2 }
            r0 = 10
            com.google.android.gms.tasks.Tasks.await(r5, r0, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0cc2 }
            boolean r0 = r5.isSuccessful()
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/import successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r5.getResult()
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0cee
            int r0 = r1.length
            if (r0 == 0) goto L_0x0cee
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/save imported token to backup_token file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r0 = r8.A0A
            X.C20138A8z.A05(r8, r0, r3, r1, r4)
            X.0z4 r0 = r8.A0A
            java.lang.String r2 = "device_to_device_transfer"
            goto L_0x03a2
        L_0x0408:
            boolean r0 = r2.isSuccessful()
            if (r0 != 0) goto L_0x0412
            java.lang.Exception r4 = r2.getException()
        L_0x0412:
            X.C20138A8z.A06(r6, r4, r3)
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/Block Store token not retrieved"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0385
        L_0x041c:
            java.lang.Object r0 = r1.A01
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r0 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r0
            com.whatsapp.WaTabLayout r1 = r0.A04
            if (r1 == 0) goto L_0x0016
            X.8B5 r0 = r0.A0U
            r1.A0E(r0)
            return
        L_0x042a:
            java.lang.Object r4 = r1.A01
            com.whatsapp.registration.EULA r4 = (com.whatsapp.registration.EULA) r4
            X.00H r0 = r4.A0g
            java.lang.Object r1 = r0.get()
            X.9oy r1 = (X.C192779oy) r1
            X.11P r0 = r1.A00
            long r5 = X.AnonymousClass11P.A01(r0)
            X.19D r0 = r1.A01
            android.content.SharedPreferences r1 = r0.A0P()
            java.lang.String r0 = "pref_pre_chatd_ab_next_fetch_time"
            long r1 = X.C17890vO.A05(r1, r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0450
            java.lang.String r0 = "EULA/should not fetch ABProps so returning early"
            goto L_0x0cf0
        L_0x0450:
            android.app.Application r3 = r4.getApplication()
            java.lang.String r0 = "EULA/fetching prechatd ABProps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r4.A0g
            java.lang.Object r1 = r0.get()
            X.9oy r1 = (X.C192779oy) r1
            r0 = 0
            java.lang.String r2 = r1.A00(r0, r0)
            X.00H r0 = r4.A0g
            java.lang.Object r0 = r0.get()
            X.9oy r0 = (X.C192779oy) r0
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0907
            X.00H r0 = r4.A0i
            java.lang.Object r0 = r0.get()
            X.9p7 r0 = (X.C192869p7) r0
            r0.A00(r3)
            X.00H r0 = r4.A0U
            java.lang.Object r6 = r0.get()
            X.9c0 r6 = (X.C185089c0) r6
            android.content.Context r1 = r4.getApplicationContext()
            java.lang.String r17 = "AppManagerInstallReferrerUtils/getInstallReferrerFromAppManager/onError "
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0z4 r7 = r6.A00
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r7)
            java.lang.String r5 = "am_referrer_fetching_random_number"
            int r4 = X.AnonymousClass8BT.A01(r0, r5)
            if (r4 >= 0) goto L_0x04ab
            r3 = 1
            r2 = 10001(0x2711, float:1.4014E-41)
            X.1JU r0 = X.AnonymousClass1JU.A01
            int r4 = r0.A03(r3, r2)
            X.C17900vP.A0M(r7, r5, r4)
        L_0x04ab:
            if (r4 <= 0) goto L_0x0903
            X.19D r3 = r6.A01
            r2 = 11184(0x2bb0, float:1.5672E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r3, r2)
            if (r4 > r0) goto L_0x0903
            r5 = 32
            X.9iX r7 = new X.9iX     // Catch:{ C2L | Exception -> 0x08ee }
            r7.<init>()     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.String r2 = r1.getPackageName()     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r0 = r2.isEmpty()     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 != 0) goto L_0x0563
            int r0 = r2.hashCode()     // Catch:{ C2L | Exception -> 0x08ee }
            switch(r0) {
                case -1914449536: goto L_0x0547;
                case -1547699361: goto L_0x0538;
                case -662003450: goto L_0x0529;
                case -122760062: goto L_0x051a;
                case 419128298: goto L_0x050b;
                case 714499313: goto L_0x0508;
                case 908042537: goto L_0x04f9;
                case 908140028: goto L_0x04ea;
                case 2095523191: goto L_0x04db;
                default: goto L_0x04d1;
            }     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x04d1:
            X.Bzb r1 = X.C24340Bzb.INTERNAL_UNRECOVERABLE     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.String r0 = "packageName isn't supported"
            X.C2L r2 = new X.C2L     // Catch:{ C2L | Exception -> 0x08ee }
            r2.<init>((X.C24340Bzb) r1, (java.lang.String) r0)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x04da:
            throw r2     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x04db:
            java.lang.String r0 = "com.instagram.lite"
            boolean r0 = r2.equals(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x04d1
            r0 = 5
            X.8QV r3 = new X.8QV     // Catch:{ C2L | Exception -> 0x08ee }
            r3.<init>(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0555
        L_0x04ea:
            java.lang.String r0 = "com.facebook.orca"
            boolean r0 = r2.equals(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x04d1
            r0 = 3
            X.8QV r3 = new X.8QV     // Catch:{ C2L | Exception -> 0x08ee }
            r3.<init>(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0555
        L_0x04f9:
            java.lang.String r0 = "com.facebook.lite"
            boolean r0 = r2.equals(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x04d1
            r0 = 1
            X.8QV r3 = new X.8QV     // Catch:{ C2L | Exception -> 0x08ee }
            r3.<init>(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0555
        L_0x0508:
            java.lang.String r0 = "com.facebook.katana"
            goto L_0x050d
        L_0x050b:
            java.lang.String r0 = "com.facebook.wakizashi"
        L_0x050d:
            boolean r0 = r2.equals(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x04d1
            r0 = 0
            X.8QV r3 = new X.8QV     // Catch:{ C2L | Exception -> 0x08ee }
            r3.<init>(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0555
        L_0x051a:
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r0 = r2.equals(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x04d1
            r0 = 6
            X.8QV r3 = new X.8QV     // Catch:{ C2L | Exception -> 0x08ee }
            r3.<init>(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0555
        L_0x0529:
            java.lang.String r0 = "com.instagram.android"
            boolean r0 = r2.equals(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x04d1
            r0 = 4
            X.8QV r3 = new X.8QV     // Catch:{ C2L | Exception -> 0x08ee }
            r3.<init>(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0555
        L_0x0538:
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = r2.equals(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x04d1
            r0 = 7
            X.8QV r3 = new X.8QV     // Catch:{ C2L | Exception -> 0x08ee }
            r3.<init>(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0555
        L_0x0547:
            java.lang.String r0 = "com.facebook.mlite"
            boolean r0 = r2.equals(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x04d1
            r0 = 2
            X.8QV r3 = new X.8QV     // Catch:{ C2L | Exception -> 0x08ee }
            r3.<init>(r0)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0555:
            X.9UU r0 = new X.9UU     // Catch:{ C2L | Exception -> 0x08ee }
            r0.<init>(r1)     // Catch:{ C2L | Exception -> 0x08ee }
            android.content.Context r1 = r0.A00     // Catch:{ C2L | Exception -> 0x08ee }
            android.content.pm.PackageManager r0 = r1.getPackageManager()     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 != 0) goto L_0x0570
            goto L_0x056e
        L_0x0563:
            X.Bzb r1 = X.C24340Bzb.INTERNAL_UNRECOVERABLE     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.String r0 = "packageName cannot be empty"
            X.C2L r2 = new X.C2L     // Catch:{ C2L | Exception -> 0x08ee }
            r2.<init>((X.C24340Bzb) r1, (java.lang.String) r0)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x04da
        L_0x056e:
            r2 = 0
            goto L_0x0575
        L_0x0570:
            X.9mH r2 = new X.9mH     // Catch:{ C2L | Exception -> 0x08ee }
            r2.<init>(r1, r0)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0575:
            X.CSS r4 = new X.CSS     // Catch:{ C2L | Exception -> 0x08ee }
            r4.<init>(r1, r3, r7)     // Catch:{ C2L | Exception -> 0x08ee }
            X.9jh r3 = new X.9jh     // Catch:{ C2L | Exception -> 0x08ee }
            r3.<init>(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ C2L | Exception -> 0x08ee }
            if (r2 == 0) goto L_0x07b6
            X.9jv r7 = r2.A02     // Catch:{ C2L | Exception -> 0x08ee }
            X.9ih r0 = r2.A00     // Catch:{ C2L | Exception -> 0x08ee }
            X.9cS r8 = r0.A00()     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ C2L | Exception -> 0x08ee }
            X.9UV r0 = r2.A01     // Catch:{ C2L | Exception -> 0x08ee }
            android.content.pm.PackageManager r13 = r0.A00     // Catch:{ NameNotFoundException -> 0x0619, C2L | Exception -> 0x08ee }
            java.lang.String r6 = X.C24717CHe.A01     // Catch:{ NameNotFoundException -> 0x0619, C2L | Exception -> 0x08ee }
            r0 = 4288(0x10c0, float:6.009E-42)
            android.content.pm.PackageInfo r9 = r13.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x0619, C2L | Exception -> 0x08ee }
            android.content.pm.ApplicationInfo r0 = r9.applicationInfo     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x0619
            android.content.pm.Signature[] r6 = r9.signatures     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x0651
            int r0 = r6.length     // Catch:{ C2L | Exception -> 0x08ee }
            r12 = 1
            if (r0 != r12) goto L_0x0651
            r14 = 0
            r11 = r6[r14]     // Catch:{ C2L | Exception -> 0x08ee }
            android.content.pm.Signature r0 = X.AnonymousClass9U3.A01     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r0 = r0.equals(r11)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x061c
            X.9IH r12 = X.AnonymousClass9IH.FB_INSTALLER_OLD_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x05b4:
            android.content.pm.ApplicationInfo r0 = r9.applicationInfo     // Catch:{ C2L | Exception -> 0x08ee }
            r11 = 1
            if (r0 == 0) goto L_0x05c2
            android.os.Bundle r6 = r0.metaData     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x05c2
            java.lang.String r0 = "com.facebook.system.api.level"
            r6.getInt(r0, r11)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x05c2:
            java.util.HashSet r13 = X.C17880vN.A12()     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.HashSet r6 = X.C180849Oe.A00(r9)     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.String r0 = "android.permission.INSTALL_PACKAGES"
            boolean r0 = r6.contains(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x05d7
            X.9I7 r0 = X.AnonymousClass9I7.INSTALL     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r0)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x05d7:
            java.lang.String r0 = "android.permission.DELETE_PACKAGES"
            boolean r0 = r6.contains(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x05e4
            X.9I7 r0 = X.AnonymousClass9I7.DELETE     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r0)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x05e4:
            java.lang.String r0 = "android.permission.CHANGE_COMPONENT_ENABLED_STATE"
            boolean r0 = r6.contains(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x05f1
            X.9I7 r0 = X.AnonymousClass9I7.SET_COMPONENT_STATE     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r0)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x05f1:
            java.lang.String r0 = "android.permission.REAL_GET_TASKS"
            boolean r0 = r6.contains(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x05fe
            X.9I7 r0 = X.AnonymousClass9I7.GET_RUNNING_APPS     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r0)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x05fe:
            java.lang.String r0 = "android.permission.INSTALL_PACKAGE_UPDATES"
            boolean r0 = r6.contains(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x060b
            X.9I7 r0 = X.AnonymousClass9I7.INSTALL_PACKAGE_UPDATES     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r0)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x060b:
            android.content.pm.ApplicationInfo r0 = r9.applicationInfo     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r11 = r0.enabled     // Catch:{ C2L | Exception -> 0x08ee }
            int r6 = r9.versionCode     // Catch:{ C2L | Exception -> 0x08ee }
            X.9e7 r0 = new X.9e7     // Catch:{ C2L | Exception -> 0x08ee }
            r0.<init>(r12, r13, r6, r11)     // Catch:{ C2L | Exception -> 0x08ee }
            r10.add(r0)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0619:
            X.9UW r0 = r2.A03     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0655
        L_0x061c:
            android.content.pm.Signature r0 = X.AnonymousClass9U3.A00     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r0 = r0.equals(r11)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x0627
            X.9IH r12 = X.AnonymousClass9IH.FB_INSTALLER_NEW_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x05b4
        L_0x0627:
            android.content.pm.Signature r0 = X.AnonymousClass9U3.A02     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r0 = r0.equals(r11)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x0632
            X.9IH r12 = X.AnonymousClass9IH.FB_INSTALLER_UPDATE_ONLY_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x05b4
        L_0x0632:
            java.lang.String r6 = "android"
            r0 = 64
            android.content.pm.PackageInfo r0 = r13.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x064d, C2L | Exception -> 0x08ee }
            android.content.pm.Signature[] r6 = r0.signatures     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x0651
            int r0 = r6.length     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 != r12) goto L_0x0651
            r0 = r6[r14]     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r0 = r0.equals(r11)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x0651
            X.9IH r12 = X.AnonymousClass9IH.FB_INSTALLER_OEM_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x05b4
        L_0x064d:
            X.9IH r12 = X.AnonymousClass9IH.FB_INSTALLER_UNKNOWN_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x05b4
        L_0x0651:
            X.9IH r12 = X.AnonymousClass9IH.FB_INSTALLER_UNKNOWN_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x05b4
        L_0x0655:
            android.content.pm.PackageManager r9 = r0.A00     // Catch:{ NameNotFoundException -> 0x06be, C2L | Exception -> 0x08ee }
            java.lang.String r6 = "com.LogiaGroup.LogiaDeck"
            r0 = 4232(0x1088, float:5.93E-42)
            android.content.pm.PackageInfo r13 = r9.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x06be, C2L | Exception -> 0x08ee }
            android.content.pm.ApplicationInfo r0 = r13.applicationInfo     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x06be
            android.os.Bundle r6 = r0.metaData     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x06be
            java.lang.String r0 = "CarrierAttribution"
            java.lang.String r6 = r6.getString(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.String r0 = "Verizon"
            boolean r0 = r0.equals(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x06be
            android.content.pm.ProviderInfo[] r14 = r13.providers     // Catch:{ C2L | Exception -> 0x08ee }
            if (r14 == 0) goto L_0x06be
            int r12 = r14.length     // Catch:{ C2L | Exception -> 0x08ee }
            r11 = 0
        L_0x067b:
            if (r11 >= r12) goto L_0x06be
            r9 = r14[r11]     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.String r6 = "com.digitalturbine.ignite.installer"
            java.lang.String r0 = r9.authority     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r0 = r6.equals(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x06bb
            boolean r0 = r9.enabled     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x06be
            boolean r0 = r9.exported     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x06be
            android.content.pm.ApplicationInfo r0 = r13.applicationInfo     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x06be
            X.9IH r12 = X.AnonymousClass9IH.TRITIUM     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.HashSet r11 = X.C17880vN.A12()     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.HashSet r6 = X.C180849Oe.A00(r13)     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.String r0 = "android.permission.INSTALL_PACKAGES"
            boolean r0 = r6.contains(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x06ac
            X.9I7 r0 = X.AnonymousClass9I7.INSTALL     // Catch:{ C2L | Exception -> 0x08ee }
            r11.add(r0)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x06ac:
            int r9 = r13.versionCode     // Catch:{ C2L | Exception -> 0x08ee }
            android.content.pm.ApplicationInfo r0 = r13.applicationInfo     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r6 = r0.enabled     // Catch:{ C2L | Exception -> 0x08ee }
            X.9e7 r0 = new X.9e7     // Catch:{ C2L | Exception -> 0x08ee }
            r0.<init>(r12, r11, r9, r6)     // Catch:{ C2L | Exception -> 0x08ee }
            r10.add(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x06be
        L_0x06bb:
            int r11 = r11 + 1
            goto L_0x067b
        L_0x06be:
            if (r8 != 0) goto L_0x0743
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r6 = r10.isEmpty()     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x06ea
            java.util.HashSet r7 = X.C17880vN.A12()     // Catch:{ C2L | Exception -> 0x08ee }
            X.9Iq r6 = X.C179609Iq.A03     // Catch:{ C2L | Exception -> 0x08ee }
            r7.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            X.9Iq r6 = X.C179609Iq.A0B     // Catch:{ C2L | Exception -> 0x08ee }
            r7.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ C2L | Exception -> 0x08ee }
            r14 = 0
            r9 = 0
            X.9gU r6 = new X.9gU     // Catch:{ C2L | Exception -> 0x08ee }
            r8 = r6
            r10 = r9
            r11 = r1
            r13 = r7
            r15 = r14
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0782
        L_0x06ea:
            java.util.Iterator r11 = r10.iterator()     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x06ee:
            boolean r6 = r11.hasNext()     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x08d1
            java.lang.Object r9 = r11.next()     // Catch:{ C2L | Exception -> 0x08ee }
            X.9e7 r9 = (X.C186389e7) r9     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.HashSet r8 = X.C17880vN.A12()     // Catch:{ C2L | Exception -> 0x08ee }
            X.9Iq r6 = X.C179609Iq.A03     // Catch:{ C2L | Exception -> 0x08ee }
            r8.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.HashSet r6 = r7.A00(r9)     // Catch:{ C2L | Exception -> 0x08ee }
            r8.addAll(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            X.9IH r6 = r9.A01     // Catch:{ C2L | Exception -> 0x08ee }
            int r10 = r6.ordinal()     // Catch:{ C2L | Exception -> 0x08ee }
            r6 = 0
            if (r10 == r6) goto L_0x0725
            r6 = 1
            if (r10 == r6) goto L_0x0725
            r6 = 2
            if (r10 == r6) goto L_0x0725
            r6 = 3
            if (r10 == r6) goto L_0x0722
            r6 = 6
            if (r10 == r6) goto L_0x0728
            r21 = r1
            goto L_0x072a
        L_0x0722:
            java.lang.Integer r21 = X.AnonymousClass00R.A0N     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x072a
        L_0x0725:
            java.lang.Integer r21 = X.AnonymousClass00R.A01     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x072a
        L_0x0728:
            java.lang.Integer r21 = X.AnonymousClass00R.A0Y     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x072a:
            java.util.ArrayList r22 = X.AnonymousClass000.A13()     // Catch:{ C2L | Exception -> 0x08ee }
            r19 = 0
            r24 = 0
            X.9gU r6 = new X.9gU     // Catch:{ C2L | Exception -> 0x08ee }
            r20 = r9
            r23 = r8
            r25 = r24
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ C2L | Exception -> 0x08ee }
            r0.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x06ee
        L_0x0743:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r6 = r10.isEmpty()     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x07d5
            java.util.HashSet r9 = X.C17880vN.A12()     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ C2L | Exception -> 0x08ee }
            X.9Iq r6 = X.C179609Iq.A0B     // Catch:{ C2L | Exception -> 0x08ee }
            r9.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.HashSet r10 = X.C17880vN.A12()     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r6 = r8.A02     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 != 0) goto L_0x0767
            X.9Iq r6 = X.C179609Iq.A02     // Catch:{ C2L | Exception -> 0x08ee }
            r10.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0767:
            java.lang.Integer r7 = r8.A01     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.Integer r6 = X.AnonymousClass00R.A0N     // Catch:{ C2L | Exception -> 0x08ee }
            if (r7 != r6) goto L_0x0772
            X.9Iq r6 = X.C179609Iq.A01     // Catch:{ C2L | Exception -> 0x08ee }
            r10.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0772:
            r9.addAll(r10)     // Catch:{ C2L | Exception -> 0x08ee }
            r15 = 0
            r11 = 0
            X.9gU r6 = new X.9gU     // Catch:{ C2L | Exception -> 0x08ee }
            r12 = r1
            r14 = r9
            r16 = r15
            r9 = r6
            r10 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0782:
            r0.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0785:
            r7 = 0
            java.lang.Object r6 = r0.get(r7)     // Catch:{ C2L | Exception -> 0x08ee }
            X.9gU r6 = (X.C187859gU) r6     // Catch:{ C2L | Exception -> 0x08ee }
            r0.remove(r7)     // Catch:{ C2L | Exception -> 0x08ee }
            X.9e7 r12 = r6.A01     // Catch:{ C2L | Exception -> 0x08ee }
            X.9cS r11 = r6.A00     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.Integer r10 = r6.A02     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r9 = r6.A06     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r8 = r6.A05     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.Set r7 = r6.A04     // Catch:{ C2L | Exception -> 0x08ee }
            X.9gU r6 = new X.9gU     // Catch:{ C2L | Exception -> 0x08ee }
            r19 = r11
            r20 = r12
            r21 = r10
            r22 = r0
            r23 = r7
            r24 = r9
            r25 = r8
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r0 = r6.A06     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 != 0) goto L_0x07bb
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x07b6:
            r3.A00(r1)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0903
        L_0x07bb:
            boolean r0 = r6.A05     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 != 0) goto L_0x07ca
            X.9cS r0 = r6.A00     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 == 0) goto L_0x07c7
            boolean r0 = r0.A02     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 != 0) goto L_0x07ca
        L_0x07c7:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x07b6
        L_0x07ca:
            r0 = 27
            boolean r0 = r2.A00(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r0 != 0) goto L_0x08d8
            java.lang.Integer r1 = X.AnonymousClass00R.A0j     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x07b6
        L_0x07d5:
            java.util.Iterator r16 = r10.iterator()     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x07d9:
            boolean r6 = r16.hasNext()     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x08d1
            java.lang.Object r11 = r16.next()     // Catch:{ C2L | Exception -> 0x08ee }
            X.9e7 r11 = (X.C186389e7) r11     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.HashSet r10 = X.C17880vN.A12()     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.HashSet r13 = X.C17880vN.A12()     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r6 = r8.A02     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 != 0) goto L_0x07f6
            X.9Iq r6 = X.C179609Iq.A02     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x07f6:
            java.lang.Integer r12 = r8.A01     // Catch:{ C2L | Exception -> 0x08ee }
            java.lang.Integer r9 = X.AnonymousClass00R.A0N     // Catch:{ C2L | Exception -> 0x08ee }
            if (r12 != r9) goto L_0x0801
            X.9Iq r6 = X.C179609Iq.A01     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0801:
            r10.addAll(r13)     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.HashSet r6 = r7.A00(r11)     // Catch:{ C2L | Exception -> 0x08ee }
            r10.addAll(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r12 != r9) goto L_0x0810
            X.9Iq r6 = X.C179609Iq.A01     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0818
        L_0x0810:
            X.9IH r14 = r11.A01     // Catch:{ C2L | Exception -> 0x08ee }
            X.9IH r6 = X.AnonymousClass9IH.FB_INSTALLER_UNKNOWN_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
            if (r14 != r6) goto L_0x0829
            X.9Iq r6 = X.C179609Iq.A07     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0818:
            java.util.Set r6 = java.util.Collections.singleton(r6)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x081c:
            r10.addAll(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            X.9IH r14 = r11.A01     // Catch:{ C2L | Exception -> 0x08ee }
            int r12 = r12.intValue()     // Catch:{ C2L | Exception -> 0x08ee }
            r13 = 0
            if (r12 == r13) goto L_0x0875
            goto L_0x0888
        L_0x0829:
            java.util.HashSet r13 = X.C17880vN.A12()     // Catch:{ C2L | Exception -> 0x08ee }
            int r15 = r12.intValue()     // Catch:{ C2L | Exception -> 0x08ee }
            r6 = 0
            if (r15 == r6) goto L_0x0854
            r6 = 1
            if (r15 == r6) goto L_0x083d
            r6 = 2
            if (r15 != r6) goto L_0x085e
            X.9IH r6 = X.AnonymousClass9IH.FB_INSTALLER_UPDATE_ONLY_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x085b
        L_0x083d:
            X.9IH r6 = X.AnonymousClass9IH.FB_INSTALLER_NEW_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            X.9IH r6 = X.AnonymousClass9IH.FB_DEVICE_OWNER     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            X.9IH r6 = X.AnonymousClass9IH.TRITIUM     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            int r15 = r11.A00     // Catch:{ C2L | Exception -> 0x08ee }
            r6 = 63328846(0x3c6524e, float:1.165629E-36)
            if (r15 < r6) goto L_0x085e
            goto L_0x0859
        L_0x0854:
            X.9IH r6 = X.AnonymousClass9IH.FB_INSTALLER_OLD_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
            r13.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0859:
            X.9IH r6 = X.AnonymousClass9IH.FB_INSTALLER_OEM_SIGN     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x085b:
            r13.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x085e:
            boolean r6 = r13.isEmpty()     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x0867
            X.9Iq r6 = X.C179609Iq.A0D     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0818
        L_0x0867:
            boolean r6 = r13.contains(r14)     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 != 0) goto L_0x0870
            X.9Iq r6 = X.C179609Iq.A06     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0818
        L_0x0870:
            java.util.Set r6 = java.util.Collections.emptySet()     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x081c
        L_0x0875:
            int r12 = r14.ordinal()     // Catch:{ C2L | Exception -> 0x08ee }
            if (r12 == r13) goto L_0x0890
            r6 = 1
            if (r12 == r6) goto L_0x0890
            r6 = 2
            if (r12 == r6) goto L_0x0890
            r6 = 3
            if (r12 == r6) goto L_0x0895
            r6 = 6
            if (r12 != r6) goto L_0x088e
            goto L_0x0893
        L_0x0888:
            r6 = 1
            if (r12 == r6) goto L_0x0875
            r6 = 2
            if (r12 == r6) goto L_0x0875
        L_0x088e:
            r9 = r1
            goto L_0x0895
        L_0x0890:
            java.lang.Integer r9 = X.AnonymousClass00R.A01     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0895
        L_0x0893:
            java.lang.Integer r9 = X.AnonymousClass00R.A0Y     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x0895:
            java.util.HashSet r14 = X.C17880vN.A12()     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.Iterator r13 = r10.iterator()     // Catch:{ C2L | Exception -> 0x08ee }
        L_0x089d:
            boolean r6 = r13.hasNext()     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x08b1
            java.lang.Object r12 = r13.next()     // Catch:{ C2L | Exception -> 0x08ee }
            X.9Iq r12 = (X.C179609Iq) r12     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r6 = r12.isPresenceIssue     // Catch:{ C2L | Exception -> 0x08ee }
            if (r6 == 0) goto L_0x089d
            r14.add(r12)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x089d
        L_0x08b1:
            boolean r24 = r14.isEmpty()     // Catch:{ C2L | Exception -> 0x08ee }
            boolean r25 = r10.isEmpty()     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.ArrayList r22 = X.AnonymousClass000.A13()     // Catch:{ C2L | Exception -> 0x08ee }
            X.9gU r6 = new X.9gU     // Catch:{ C2L | Exception -> 0x08ee }
            r20 = r11
            r21 = r9
            r23 = r10
            r18 = r6
            r19 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ C2L | Exception -> 0x08ee }
            r0.add(r6)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x07d9
        L_0x08d1:
            X.Akh r6 = r7.A00     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.Collections.sort(r0, r6)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0785
        L_0x08d8:
            X.CNQ r7 = r4.A03     // Catch:{ C2L | Exception -> 0x08ee }
            r0 = 23
            X.DTg r6 = new X.DTg     // Catch:{ C2L | Exception -> 0x08ee }
            r6.<init>(r3, r4, r1, r0)     // Catch:{ C2L | Exception -> 0x08ee }
            java.util.concurrent.ScheduledExecutorService r2 = r7.A01     // Catch:{ C2L | Exception -> 0x08ee }
            r1 = 18
            X.DTa r0 = new X.DTa     // Catch:{ C2L | Exception -> 0x08ee }
            r0.<init>(r7, r6, r1)     // Catch:{ C2L | Exception -> 0x08ee }
            r2.submit(r0)     // Catch:{ C2L | Exception -> 0x08ee }
            goto L_0x0903
        L_0x08ee:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r17)
            X.AnonymousClass8BS.A1I(r1, r0)
            r1.append(r5)
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1.append(r0)
            X.C17890vO.A0w(r1)
        L_0x0903:
            java.lang.String r0 = "EULA/success fetching prechatd ABProps"
            goto L_0x0cf0
        L_0x0907:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "EULA/error fetching prechatd ABProps: "
            X.C17900vP.A0e(r0, r2, r1)
            return
        L_0x0911:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
            r0 = 1
            goto L_0x0c82
        L_0x091b:
            java.lang.Object r0 = r1.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x0921:
            java.lang.Object r2 = r1.A01
            X.8GT r2 = (X.AnonymousClass8GT) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.0z4 r0 = r2.A04
            int r1 = r0.A0H()
            r0 = 4
            X.AnonymousClass8GT.A05(r2, r1, r0)
            X.AnonymousClass8GT.A04(r2, r0)
            java.lang.String r0 = "DirectTransferBackgroundTaskViewModel/removeAllListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r1 = r2.A00
            java.lang.Runnable r0 = r2.A07
            r1.removeCallbacks(r0)
            X.2NV r0 = r2.A05
            X.2NU r0 = r0.A00
            X.C17890vO.A0t(r0)
            return
        L_0x094a:
            java.lang.Object r0 = r1.A01
            X.A0K r0 = (X.A0K) r0
            X.00H r3 = r0.A00
            X.A8V r2 = X.AnonymousClass8BR.A0q(r3)
            java.lang.String r0 = "click_verification_complete_dialog_learn_more"
            java.lang.String r1 = "verification_complete_dialog"
            r2.A0I(r1, r0)
            X.A8V r0 = X.AnonymousClass8BR.A0q(r3)
            r0.A0C(r1)
            return
        L_0x0963:
            java.lang.Object r1 = r1.A01
            android.widget.PopupWindow r1 = (android.widget.PopupWindow) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.dismiss()
            return
        L_0x096f:
            java.lang.Object r2 = r1.A01
            X.4SH r2 = (X.AnonymousClass4SH) r2
            r1 = 0
            com.airbnb.lottie.LottieAnimationView r0 = r2.A01
            if (r0 == 0) goto L_0x097b
            r0.A02()
        L_0x097b:
            com.whatsapp.WaImageView r0 = r2.A02
            if (r0 == 0) goto L_0x0982
            r0.setVisibility(r1)
        L_0x0982:
            com.airbnb.lottie.LottieAnimationView r0 = r2.A01
            X.C72453Mb.A1D(r0)
            return
        L_0x0988:
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 1
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1V(r2, r0, r0, r1)
            r2.startActivity(r0)
            return
        L_0x0996:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1wy r1 = r0.A0E
            r0 = 4
            X.AnonymousClass3MX.A1K(r1, r0)
            return
        L_0x09a1:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1jT r0 = r0.A09
            goto L_0x0a56
        L_0x09a9:
            java.lang.Object r0 = r1.A01
            X.C108945cZ.A1P(r0)
            return
        L_0x09af:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 12
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x09b9:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r3 = r0.A07
            X.00H r0 = r3.A0G
            X.A8V r2 = X.AnonymousClass8BR.A0q(r0)
            java.lang.String r1 = "device_confirm"
            java.lang.String r0 = "confirm_with_second_sms"
            r2.A0I(r1, r0)
            X.1wy r2 = r3.A0E
            r1 = 2
            goto L_0x0a15
        L_0x09d0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r5 = r0.A07
            X.6py r0 = r5.A0C
            X.9o9 r1 = r0.A05
            java.lang.String r0 = "AccountDefenceLocalDataRepository/isRetryLimitReachedForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r1 = r1.A05(r0)
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            boolean r2 = X.C17880vN.A1W(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountDefenceLocalDataRepository/isRetryLimitReachedForResendingNotice/result "
            X.C17900vP.A0n(r0, r1, r2)
            if (r2 == 0) goto L_0x09fc
            X.1wy r2 = r5.A0D
            r1 = 5
            goto L_0x0a15
        L_0x09fc:
            long r3 = r5.A0T()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            X.1wy r2 = r5.A0D
            r1 = 1
            if (r0 <= 0) goto L_0x0a15
            r1 = 6
            goto L_0x0a15
        L_0x0a0b:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = r0.A07
            X.1wy r2 = r0.A0D
            r1 = 9
        L_0x0a15:
            X.AnonymousClass3MX.A1J(r2, r1)
            return
        L_0x0a19:
            java.lang.Object r5 = r1.A01
            com.whatsapp.registration.VerifyTwoFactorAuth r5 = (com.whatsapp.registration.VerifyTwoFactorAuth) r5
            X.10I r0 = r5.A05
            X.0z4 r3 = r5.A0A
            X.A98 r4 = r5.A0P
            java.lang.String r6 = r5.A0c
            java.lang.String r7 = r5.A0d
            X.118 r2 = r5.A0F
            X.9BG r1 = new X.9BG
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r5.A0S = r1
            X.C17890vO.A0u(r1, r0)
            return
        L_0x0a34:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.VerifyTwoFactorAuth r0 = (com.whatsapp.registration.VerifyTwoFactorAuth) r0
            com.whatsapp.registration.VerifyTwoFactorAuth.A0Q(r0)
            return
        L_0x0a3c:
            java.lang.Object r1 = r1.A01
            com.whatsapp.registration.VerifyTwoFactorAuth r1 = (com.whatsapp.registration.VerifyTwoFactorAuth) r1
            X.1jT r0 = r1.A0Q
            r0.A0A()
            android.content.Intent r0 = X.AnonymousClass1LU.A04(r1)
            r1.startActivity(r0)
            r1.finish()
            return
        L_0x0a50:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.VerifyTwoFactorAuth r0 = (com.whatsapp.registration.VerifyTwoFactorAuth) r0
            X.1jT r0 = r0.A0Q
        L_0x0a56:
            r0.A0E()
            return
        L_0x0a5a:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.VerifyTwoFactorAuth r0 = (com.whatsapp.registration.VerifyTwoFactorAuth) r0
            X.00H r0 = r0.A0Z
            goto L_0x0a89
        L_0x0a61:
            java.lang.Object r2 = r1.A01
            X.1KB r2 = (X.AnonymousClass1KB) r2
            r1 = 2131897315(0x7f122be3, float:1.9429516E38)
            r0 = 1
            r2.A08(r1, r0)
            return
        L_0x0a6d:
            java.lang.Object r1 = r1.A01
            X.1FR r1 = (X.AnonymousClass1FR) r1
            com.whatsapp.dialogs.UnrecoverableErrorDialogFragment r0 = new com.whatsapp.dialogs.UnrecoverableErrorDialogFragment
            r0.<init>()
            r1.CMl(r0)
            return
        L_0x0a7a:
            java.lang.Object r0 = r1.A01
            X.1jT r0 = (X.C33841jT) r0
            X.0z4 r1 = r0.A0C
            r0 = 0
            goto L_0x0c4a
        L_0x0a83:
            java.lang.Object r0 = r1.A01
            X.1jT r0 = (X.C33841jT) r0
            X.00H r0 = r0.A0O
        L_0x0a89:
            java.lang.Object r1 = r0.get()
            X.1Do r1 = (X.C22881Do) r1
            r0 = 0
            r1.A00(r0, r0)
            return
        L_0x0a94:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            X.00H r0 = r0.A1A
            if (r0 == 0) goto L_0x0ac1
            java.lang.Object r0 = r0.get()
            X.9Yv r0 = (X.C183589Yv) r0
            X.00H r0 = r0.A00
            X.17w r1 = X.AnonymousClass3MW.A0c(r0)
            java.lang.Class<X.17e> r0 = X.C217317e.class
            X.11a r1 = r1.A01(r0)
            X.17e r1 = (X.C217317e) r1
            java.lang.String r0 = "ConsumerBridge/onSyncExportMigrationFeatureState"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.A7R r0 = (X.A7R) r0
            r0.A06()
            return
        L_0x0ac1:
            java.lang.String r0 = "crossPlatformMigrationLazy"
            goto L_0x0cbb
        L_0x0ac5:
            java.lang.Object r8 = r1.A01
            com.whatsapp.registration.RegisterName r8 = (com.whatsapp.registration.RegisterName) r8
            X.0vb r2 = r8.A00
            X.1Wb r0 = r8.A0U
            if (r0 == 0) goto L_0x0b1b
            long r0 = r0.A0G()
            java.lang.String r7 = X.C64052u8.A08(r2, r0)
            X.0vb r9 = r8.A00
            X.17r r0 = r8.A04
            java.io.File r0 = r0.A0J()
            r1 = 0
            long r4 = X.C64062u9.A01(r1, r0)
            X.1Wb r0 = r8.A0U
            if (r0 == 0) goto L_0x0b15
            java.util.ArrayList r0 = r0.A0K()
            java.util.Iterator r6 = r0.iterator()
            r2 = 0
        L_0x0af2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0b02
            java.io.File r0 = X.AnonymousClass8BS.A0T(r6)
            long r0 = r0.length()
            long r2 = r2 + r0
            goto L_0x0af2
        L_0x0b02:
            long r4 = r4 + r2
            java.lang.String r1 = X.C88584aA.A03(r9, r4)
            X.C18070vi.A0X(r1)
            X.1KB r3 = r8.A05
            r0 = 18
            X.7Pq r2 = new X.7Pq
            r2.<init>(r8, r7, r1, r0)
            goto L_0x0c30
        L_0x0b15:
            java.lang.String r0 = "messageStoreBackup"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0b1b:
            java.lang.String r0 = "messageStoreBackup"
            goto L_0x0cbb
        L_0x0b1f:
            java.lang.Object r2 = r1.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 0
            java.lang.String r0 = "RegisterName/dialog/initprogress/removedialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass4Yv.A00(r2, r1)
            return
        L_0x0b2d:
            java.lang.Object r5 = r1.A01
            com.whatsapp.registration.RegisterName r5 = (com.whatsapp.registration.RegisterName) r5
            X.0zA r1 = r5.A0B
            if (r1 == 0) goto L_0x0cb9
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0b45
            r1.A03()
            java.lang.String r0 = "getUnsignedBizVNameCertVerifiedName"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0b45:
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r5)
            java.lang.String r1 = "pref_wfs_name"
            r12 = 0
            java.lang.String r0 = r0.getString(r1, r12)
            if (r0 == 0) goto L_0x0b7a
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r5)
            java.lang.String r0 = r0.getString(r1, r12)
            if (r0 == 0) goto L_0x0b7a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0b7a
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r5)
            java.lang.String r8 = r0.getString(r1, r12)
        L_0x0b6a:
            if (r8 != 0) goto L_0x0c28
        L_0x0b6c:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            r2 = 1
            boolean r0 = r0.equalsIgnoreCase(r1)
            r8 = 0
            if (r0 != 0) goto L_0x0c28
            r7 = 0
            goto L_0x0baf
        L_0x0b7a:
            X.1Cd r0 = r5.A0W
            if (r0 == 0) goto L_0x0c3d
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0b6c
            X.9XQ r0 = r5.A0X
            if (r0 == 0) goto L_0x0c37
            java.lang.String r1 = "user_push_name"
            X.1Cd r0 = r0.A00     // Catch:{ SQLException -> 0x0ba8 }
            X.1at r2 = r0.get()     // Catch:{ SQLException -> 0x0ba8 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0b9e }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0b9e }
            java.lang.String r8 = X.C28341Zz.A00(r0, r1, r12)     // Catch:{ all -> 0x0b9e }
            r2.close()     // Catch:{ SQLException -> 0x0ba8 }
            goto L_0x0b6a
        L_0x0b9e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0ba3 }
            goto L_0x0ba7
        L_0x0ba3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLException -> 0x0ba8 }
        L_0x0ba7:
            throw r1     // Catch:{ SQLException -> 0x0ba8 }
        L_0x0ba8:
            r1 = move-exception
            java.lang.String r0 = "UserSettingsStore/getPushName/Error reading push name"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0b6c
        L_0x0baf:
            X.11C r0 = r5.A08     // Catch:{ Exception -> 0x0be0 }
            X.11B r9 = r0.A0O()     // Catch:{ Exception -> 0x0be0 }
            java.lang.String r1 = "display_name"
            if (r9 == 0) goto L_0x0be8
            android.net.Uri r10 = android.provider.ContactsContract.Profile.CONTENT_URI     // Catch:{ Exception -> 0x0be0 }
            java.lang.String[] r11 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0be0 }
            r11[r7] = r1     // Catch:{ Exception -> 0x0be0 }
            r14 = r12
            r13 = r12
            android.database.Cursor r2 = r9.A03(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0be0 }
            if (r2 == 0) goto L_0x0be8
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0bd9 }
            if (r0 == 0) goto L_0x0bd5
            int r0 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0bd9 }
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0bd9 }
        L_0x0bd5:
            r2.close()     // Catch:{ Exception -> 0x0be0 }
            goto L_0x0be6
        L_0x0bd9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0bdb }
        L_0x0bdb:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x0be0 }
            throw r0     // Catch:{ Exception -> 0x0be0 }
        L_0x0be0:
            r1 = move-exception
            java.lang.String r0 = "RegisterName/getmename "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0be6:
            if (r12 != 0) goto L_0x0c0d
        L_0x0be8:
            android.content.Context r0 = r5.getApplicationContext()
            android.accounts.AccountManager r0 = android.accounts.AccountManager.get(r0)
            if (r0 == 0) goto L_0x0c28
            android.accounts.Account[] r6 = r0.getAccounts()
            X.C18070vi.A0X(r6)
            int r4 = r6.length
            r3 = 0
        L_0x0bfb:
            if (r3 >= r4) goto L_0x0c28
            r2 = r6[r3]
            java.lang.String r1 = r2.type
            java.lang.String r0 = "com.google"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0c34
            java.lang.String r12 = r2.name
            if (r12 == 0) goto L_0x0c28
        L_0x0c0d:
            java.lang.String r1 = "@"
            boolean r0 = X.AnonymousClass1YF.A0Y(r12, r1, r7)
            if (r0 == 0) goto L_0x0c1d
            int r0 = X.AnonymousClass1YF.A0F(r12, r1, r7, r7)
            java.lang.String r12 = X.C108955ca.A0q(r7, r0, r12)
        L_0x0c1d:
            r1 = 46
            r0 = 32
            java.lang.String r8 = r12.replace(r1, r0)
            X.C18070vi.A0X(r8)
        L_0x0c28:
            X.1KB r3 = r5.A05
            r0 = 6
            X.7RS r2 = new X.7RS
            r2.<init>(r0, r8, r5)
        L_0x0c30:
            r3.A0J(r2)
            return
        L_0x0c34:
            int r3 = r3 + 1
            goto L_0x0bfb
        L_0x0c37:
            java.lang.String r0 = "userSettingsStore"
            X.C18070vi.A11(r0)
            throw r12
        L_0x0c3d:
            java.lang.String r0 = "messageStoreManager"
            X.C18070vi.A11(r0)
            throw r12
        L_0x0c43:
            java.lang.Object r1 = r1.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 0
            X.0z4 r1 = r1.A0A
        L_0x0c4a:
            byte[] r0 = new byte[r0]
            r1.A2G(r0)
            return
        L_0x0c50:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.EULA r0 = (com.whatsapp.registration.EULA) r0
            X.1iq r0 = r0.A0K
            r0.A0A()
            return
        L_0x0c5a:
            java.lang.Object r0 = r1.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.0z4 r0 = r0.A0A
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "is_latam_tos_shown_during_reg"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.commit()
            return
        L_0x0c6f:
            java.lang.Object r0 = r1.A01
            android.content.Context r0 = (android.content.Context) r0
            X.C17970vW.A09(r0)
            return
        L_0x0c77:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "AccountDefenceSecondCodeViewPresenter/learn-more tapped"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 604(0x25c, float:8.46E-43)
        L_0x0c82:
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x0c86:
            java.lang.Object r3 = r1.A01
            X.4OE r3 = (X.AnonymousClass4OE) r3
            X.A7K r2 = X.A7K.A00()
            java.lang.Class<com.whatsapp.infra.graphql.generated.integrityenforcements.FetchReachoutTimelockQueryResponseImpl> r1 = com.whatsapp.infra.graphql.generated.integrityenforcements.FetchReachoutTimelockQueryResponseImpl.class
            java.lang.String r0 = "FetchReachoutTimelockQuery"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            X.1PY r0 = r3.A01
            X.A2g r2 = r0.A01(r1)
            r1 = 13
            X.4sW r0 = new X.4sW
            r0.<init>((X.AnonymousClass4OE) r3, (int) r1)
            r2.A04(r0)
            return
        L_0x0ca7:
            java.lang.String r0 = "pushNameManager"
            goto L_0x0cbb
        L_0x0caa:
            java.lang.String r0 = "graphQlClient"
            goto L_0x0cbb
        L_0x0cad:
            java.lang.String r0 = "nativeContactGateKeeper"
            goto L_0x0cbb
        L_0x0cb0:
            java.lang.String r0 = "nativeContactsLauncherLazy"
            goto L_0x0cbb
        L_0x0cb3:
            java.lang.String r0 = "abPropsObservers"
            goto L_0x0cbb
        L_0x0cb6:
            java.lang.String r0 = "abPropsManager"
            goto L_0x0cbb
        L_0x0cb9:
            java.lang.String r0 = "smbRegistrationManager"
        L_0x0cbb:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0cc0:
            return
        L_0x0cc1:
            return
        L_0x0cc2:
            r2 = move-exception
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/error during import"
            com.whatsapp.util.Log.e(r0, r2)
            boolean r0 = r2 instanceof java.util.concurrent.ExecutionException
            if (r0 == 0) goto L_0x0ce5
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof X.C22994BYq
            if (r0 == 0) goto L_0x0ce5
            java.lang.Throwable r0 = r2.getCause()
            com.google.android.gms.common.api.ApiException r0 = (com.google.android.gms.common.api.ApiException) r0
            com.google.android.gms.common.api.Status r0 = r0.mStatus
            int r1 = r0.A00
            r0 = 20501(0x5015, float:2.8728E-41)
            if (r1 != r0) goto L_0x0ce5
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/NO_DATA_AVAILABLE exception"
            goto L_0x0cf0
        L_0x0ce5:
            java.lang.String r0 = "EULA/create/exception during retrieving data from account transfer"
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x0ceb:
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/accountTransferClient is null"
            goto L_0x0cf0
        L_0x0cee:
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/imported empty data"
        L_0x0cf0:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21449AkG.run():void");
    }

    public C21449AkG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
