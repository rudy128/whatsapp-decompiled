package X;

/* renamed from: X.7RN  reason: invalid class name */
public class AnonymousClass7RN implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7RN(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(AnonymousClass1KB r1, Object obj, Object obj2, int i) {
        r1.A0J(new AnonymousClass7RN(obj, obj2, i));
    }

    public static void A01(AnonymousClass1KB r1, Object obj, Object obj2, int i) {
        r1.CGP(new AnonymousClass7RN(obj, obj2, i));
    }

    public static void A02(AnonymousClass10I r1, Object obj, Object obj2, int i) {
        r1.CGF(new AnonymousClass7RN(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: com.whatsapp.voipcalling.VoipActivityV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: com.whatsapp.voipcalling.VoipActivityV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: com.whatsapp.voipcalling.VoipActivityV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v82, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v84, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03b8, code lost:
        r2.A02(r1, X.AnonymousClass1D7.A0I());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03e3, code lost:
        r2.Btu(X.C19980A1q.A03, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x055a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x055b, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x055e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0605, code lost:
        r0 = "accountLinkingResultObservers";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0607, code lost:
        X.C18070vi.A11(r0);
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0632, code lost:
        if (r2.getWidth() == 0) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x063e, code lost:
        r4.A0J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0641, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        X.AnonymousClass7KY.A00(r2, r1, 30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
        r3 = new X.C146787Qp(r2, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x02b3;
                case 1: goto L_0x02d3;
                case 2: goto L_0x02f0;
                case 3: goto L_0x0300;
                case 4: goto L_0x0015;
                case 5: goto L_0x0067;
                case 6: goto L_0x0091;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00d0;
                case 9: goto L_0x0324;
                case 10: goto L_0x0332;
                case 11: goto L_0x00ef;
                case 12: goto L_0x0108;
                case 13: goto L_0x012c;
                case 14: goto L_0x035c;
                case 15: goto L_0x037b;
                case 16: goto L_0x0387;
                case 17: goto L_0x0393;
                case 18: goto L_0x03a6;
                case 19: goto L_0x03c0;
                case 20: goto L_0x03cd;
                case 21: goto L_0x03db;
                case 22: goto L_0x03e9;
                case 23: goto L_0x0151;
                case 24: goto L_0x03f5;
                case 25: goto L_0x0164;
                case 26: goto L_0x0454;
                case 27: goto L_0x0454;
                case 28: goto L_0x0454;
                case 29: goto L_0x047b;
                case 30: goto L_0x048f;
                case 31: goto L_0x049b;
                case 32: goto L_0x0005;
                case 33: goto L_0x04ba;
                case 34: goto L_0x0562;
                case 35: goto L_0x01dd;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x01e5;
                case 40: goto L_0x022d;
                case 41: goto L_0x060c;
                case 42: goto L_0x0575;
                case 43: goto L_0x058f;
                case 44: goto L_0x058f;
                case 45: goto L_0x023f;
                case 46: goto L_0x0261;
                case 47: goto L_0x05a0;
                case 48: goto L_0x05b0;
                case 49: goto L_0x05d6;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r15.A01
            X.10T r2 = (X.AnonymousClass10T) r2
            java.lang.Object r1 = r15.A02
            r0 = 1
            X.C18070vi.A0d(r1, r0)
        L_0x000f:
            r0 = 30
            X.AnonymousClass7KY.A00(r2, r1, r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r3 = r15.A01
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.Object r4 = r15.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            X.1Me r5 = r3.A15
            if (r4 == 0) goto L_0x0014
            X.00H r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1E7 r2 = r0.A0E(r4)
            if (r2 == 0) goto L_0x0014
            r1 = -1
            r0 = 1
            X.1yg r0 = r5.A0F(r2, r1, r0, r0)
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.2R1 r2 = X.AnonymousClass2R1.A0O
            r0 = 0
            X.2sh r1 = new X.2sh
            r1.<init>(r2, r0)
            r0 = 1
            r1.A03 = r0
            X.2qq r0 = X.C62132qq.A0F
            r1.A00 = r0
            java.util.Set r0 = r1.A08
            r0.add(r4)
            X.2re r1 = r1.A02()
            X.12E r0 = r3.A18
            X.2rf r1 = r0.A03(r1)
            X.2rf r0 = X.C62602rf.A03
            if (r1 != r0) goto L_0x0014
            java.lang.String r0 = "Unable to fetch the verifiedNameDetails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0067:
            java.lang.Object r2 = r15.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r0 = r15.A02
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x0014
            X.1Ty r0 = r2.A0V
            X.AEW r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0W
            if (r0 == 0) goto L_0x0014
            com.whatsapp.voipcalling.WASecuredDialogFragment r1 = new com.whatsapp.voipcalling.WASecuredDialogFragment
            r1.<init>()
            X.1KB r4 = r2.A05
            r0 = 9
            X.7RN r3 = new X.7RN
            r3.<init>(r2, r1, r0)
            goto L_0x063e
        L_0x0091:
            java.lang.Object r2 = r15.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r0 = r15.A02
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x0014
            X.1Ty r0 = r2.A0V
            X.AEW r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0W
            if (r0 == 0) goto L_0x0014
            X.1KB r4 = r2.A05
            r0 = 20
            goto L_0x014a
        L_0x00b1:
            java.lang.Object r2 = r15.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r0 = r15.A02
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x0014
            X.1Ty r0 = r2.A0V
            X.AEW r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0W
            if (r0 == 0) goto L_0x0014
            X.1KB r4 = r2.A05
            r0 = 18
            goto L_0x014a
        L_0x00d0:
            java.lang.Object r2 = r15.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r0 = r15.A02
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x0014
            X.1Ty r0 = r2.A0V
            X.AEW r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0W
            if (r0 == 0) goto L_0x0014
            X.1KB r4 = r2.A05
            r0 = 19
            goto L_0x014a
        L_0x00ef:
            java.lang.Object r2 = r15.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r1 = r15.A02
            X.8At r1 = (X.C160958At) r1
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r2)
            com.whatsapp.voipcalling.VoipActivityV2.A1A(r1, r0, r2)
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A1z(r0, r2)
            if (r0 == 0) goto L_0x0014
            com.whatsapp.voipcalling.VoipActivityV2.A28(r2)
            return
        L_0x0108:
            java.lang.Object r2 = r15.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            java.lang.Object r0 = r15.A02
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x0014
            X.1Ty r0 = r2.A0I
            X.AEW r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0W
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "Disable dragging for bottom sheet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1KB r4 = r2.A0H
            r0 = 26
            goto L_0x014a
        L_0x012c:
            java.lang.Object r2 = r15.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            java.lang.Object r0 = r15.A02
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x0014
            X.1Ty r0 = r2.A0I
            X.AEW r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0W
            if (r0 == 0) goto L_0x0014
            X.1KB r4 = r2.A0H
            r0 = 24
        L_0x014a:
            X.7Qp r3 = new X.7Qp
            r3.<init>(r2, r0)
            goto L_0x063e
        L_0x0151:
            java.lang.Object r2 = r15.A01
            com.whatsapp.biz.catalog.manager.CatalogManager r2 = (com.whatsapp.biz.catalog.manager.CatalogManager) r2
            java.lang.Object r1 = r15.A02
            X.9gB r1 = (X.C187669gB) r1
            boolean r0 = r2.A0F(r1)
            if (r0 != 0) goto L_0x0014
            r0 = 0
            r2.A0C(r1, r0)
            return
        L_0x0164:
            java.lang.Object r2 = r15.A02
            com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity r2 = (com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity) r2
            r0 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            android.view.View r0 = r2.findViewById(r0)
            X.C72453Mb.A1D(r0)
            java.lang.Object r4 = r15.A01
            X.6U4 r4 = (X.AnonymousClass6U4) r4
            X.6N8 r0 = X.AnonymousClass6N8.A00
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 != 0) goto L_0x0014
            r1 = 2131887215(0x7f12046f, float:1.940903E38)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r1, r0)
            r0.show()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BloksCDSBottomSheetActivity - Bloks fails to load with: "
            java.lang.String r3 = X.AnonymousClass001.A1E(r4, r0, r1)
            boolean r0 = r4 instanceof X.AnonymousClass6N5
            if (r0 == 0) goto L_0x01ab
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BloksCDSBottomSheetActivity - Bloks fails to load with BloksLayoutDataError exception: "
            r1.append(r0)
            r0 = r4
            X.6N5 r0 = (X.AnonymousClass6N5) r0
            X.9f9 r0 = r0.A00
            java.lang.Exception r0 = r0.A02
            java.lang.String r3 = X.C17890vO.A0V(r0, r1)
        L_0x01ab:
            boolean r0 = r4 instanceof X.AnonymousClass6N6
            if (r0 == 0) goto L_0x01c1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BloksCDSBottomSheetActivity - Bloks fails to load with unknown error: "
            r1.append(r0)
            r0 = r4
            X.6N6 r0 = (X.AnonymousClass6N6) r0
            java.lang.Exception r0 = r0.A00
            java.lang.String r3 = X.C17890vO.A0V(r0, r1)
        L_0x01c1:
            boolean r0 = r4 instanceof X.AnonymousClass6N7
            if (r0 == 0) goto L_0x01c7
            java.lang.String r3 = "BloksCDSBottomSheetActivity - Bloks fails to load with ActivityNoLongerActiveError"
        L_0x01c7:
            com.whatsapp.util.Log.e((java.lang.String) r3)
            X.00H r0 = r2.A04
            if (r0 == 0) goto L_0x05fb
            java.lang.Object r1 = r0.get()
            X.1Qo r1 = (X.C26031Qo) r1
            X.3xI r0 = X.C80513xI.A00
            r1.A00(r0, r3)
            r2.finish()
            return
        L_0x01dd:
            java.lang.Object r2 = r15.A01
            X.10T r2 = (X.AnonymousClass10T) r2
            java.lang.Object r1 = r15.A02
            goto L_0x000f
        L_0x01e5:
            java.lang.Object r7 = r15.A01
            X.1DA r7 = (X.AnonymousClass1DA) r7
            java.lang.Object r5 = r15.A02
            java.util.concurrent.CountDownLatch r5 = (java.util.concurrent.CountDownLatch) r5
            X.19D r2 = r7.A05     // Catch:{ all -> 0x05fe }
            r0 = 2863(0xb2f, float:4.012E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x05fe }
            int r0 = X.C18020vd.A00(r1, r2, r0)     // Catch:{ all -> 0x05fe }
            long r3 = (long) r0     // Catch:{ all -> 0x05fe }
            r0 = 2864(0xb30, float:4.013E-42)
            int r6 = X.C18020vd.A00(r1, r2, r0)     // Catch:{ all -> 0x05fe }
        L_0x01fe:
            X.1Ct r2 = r7.A04     // Catch:{ all -> 0x05fe }
            X.1Cw r0 = r7.A03     // Catch:{ all -> 0x05fe }
            byte[] r1 = r0.A0J()     // Catch:{ all -> 0x05fe }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x05fe }
            byte[] r2 = X.C22671Ct.A03(r2, r0, r1)     // Catch:{ all -> 0x05fe }
            if (r2 == 0) goto L_0x021d
            com.whatsapp.wamsys.JniBridge r0 = r7.A07     // Catch:{ all -> 0x05fe }
            r1 = 1
            java.util.concurrent.atomic.AtomicReference r0 = r0.wajContext     // Catch:{ all -> 0x05fe }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05fe }
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0     // Catch:{ all -> 0x05fe }
            com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r1, r0, r2)     // Catch:{ all -> 0x05fe }
            goto L_0x0227
        L_0x021d:
            android.os.SystemClock.sleep(r3)     // Catch:{ all -> 0x05fe }
            r0 = 2
            long r3 = r3 * r0
            int r6 = r6 + -1
            if (r6 >= 0) goto L_0x01fe
        L_0x0227:
            if (r5 == 0) goto L_0x0014
            r5.countDown()
            return
        L_0x022d:
            java.lang.Object r2 = r15.A01
            X.5qe r2 = (X.C114365qe) r2
            java.lang.Object r1 = r15.A02
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.1Di r0 = r2.A01
            if (r0 == 0) goto L_0x0014
            r0.invoke(r1)
            return
        L_0x023f:
            java.lang.Object r0 = r15.A01
            X.6jZ r0 = (X.C130526jZ) r0
            java.lang.Object r3 = r15.A02
            android.content.Context r3 = (android.content.Context) r3
            X.0zA r0 = r0.A01
            java.lang.Object r0 = r0.A03()
            if (r0 == 0) goto L_0x0014
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity"
            r2.setClassName(r1, r0)
            r0 = 0
            r3.startActivity(r2, r0)
            return
        L_0x0261:
            java.lang.Object r5 = r15.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r5 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r5
            java.lang.Object r4 = r15.A02
            X.6p4 r4 = (X.C133616p4) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.00H r0 = r5.A06
            if (r0 == 0) goto L_0x02af
            java.lang.Object r3 = r0.get()
            X.6gq r3 = (X.C128886gq) r3
            java.lang.Integer r7 = X.AnonymousClass00R.A0C
            X.779 r2 = r5.A03
            if (r2 != 0) goto L_0x0281
            java.lang.String r0 = "fb4aUserEntityForNativeAuth"
            goto L_0x0607
        L_0x0281:
            X.6fW r1 = new X.6fW
            r1.<init>(r5, r4)
            X.00H r0 = r3.A00
            java.lang.Object r6 = r0.get()
            X.6wU r6 = (X.C138076wU) r6
            X.77S r5 = r2.A00
            X.6n1 r4 = new X.6n1
            r4.<init>(r3, r1, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NativeAuthTokenExchangeHelper/exchangeFb4aTokenForWaCrosspostingToken called by caller "
            r1.append(r0)
            java.lang.String r0 = "ACCOUNT_LINKING_NATIVE_AUTH_ACTIVITY"
            X.C108995ce.A1O(r1, r0)
            r3 = 3
            long r1 = X.C137916wE.A01
            X.705 r0 = new X.705
            r0.<init>(r3, r1)
            X.C138076wU.A00(r0, r5, r4, r6, r7)
            return
        L_0x02af:
            java.lang.String r0 = "accountLinkingLoginManager"
            goto L_0x0607
        L_0x02b3:
            java.lang.Object r5 = r15.A01
            X.74M r5 = (X.AnonymousClass74M) r5
            java.lang.Object r4 = r15.A02
            X.72K r4 = (X.AnonymousClass72K) r4
            r0 = 4
            X.AnonymousClass74M.A0D(r5, r0)
            X.70C r3 = r5.A0v
            r1 = 0
            r0 = 0
            r3.A02(r4, r1, r0)
            r5.A0Z(r0, r0)
            X.1FR r1 = r5.A0e
            r0 = 2131890014(0x7f120f5e, float:1.9414708E38)
            r1.BhQ(r0)
            return
        L_0x02d3:
            java.lang.Object r0 = r15.A01
            X.6gk r0 = (X.C128826gk) r0
            java.lang.Object r4 = r15.A02
            X.22l r4 = (X.C441822l) r4
            X.00H r0 = r0.A02
            r8 = 0
            java.lang.Object r0 = r0.get()
            X.6q0 r0 = (X.C134096q0) r0
            X.Bvt r3 = X.C24127Bvt.A00
            r5 = 0
            X.BvS r1 = X.C24100BvS.A00
            r7 = r5
            r2 = r1
            r6 = r5
            r0.A00(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x02f0:
            java.lang.Object r0 = r15.A01
            X.6q0 r0 = (X.C134096q0) r0
            java.lang.Object r2 = r15.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A02
            r0 = 46
            r1.A02(r2, r0)
            return
        L_0x0300:
            java.lang.Object r4 = r15.A01
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            java.lang.Object r0 = r15.A02
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.calling.header.CallHeaderStateHolder r3 = X.C108955ca.A0L(r4)
            com.whatsapp.jid.UserJid r2 = r0.getPeerJid()
            r1 = 0
            if (r2 == 0) goto L_0x0320
            X.1Ty r0 = r4.A0V
            X.AEW r0 = r0.A08(r2)
            if (r0 == 0) goto L_0x0320
            boolean r0 = r0.A0W
            if (r0 == 0) goto L_0x0320
            r1 = 1
        L_0x0320:
            r3.A01(r1)
            return
        L_0x0324:
            java.lang.Object r2 = r15.A01
            X.5rx r2 = (X.C114765rx) r2
            java.lang.Object r1 = r15.A02
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            java.lang.String r0 = "WASecuredDialogFragment"
            r2.A4h(r1, r0)
            return
        L_0x0332:
            java.lang.Object r3 = r15.A01
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.Object r6 = r15.A02
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.00H r0 = r3.A1g
            X.1pj r2 = X.AnonymousClass3MW.A0V(r0)
            r1 = 6
            X.AOI r0 = new X.AOI
            r0.<init>(r3, r6, r1)
            java.lang.String r10 = "ongoing_call_link_block"
            r14 = 1
            X.C18070vi.A0d(r6, r14)
            r5 = 0
            r8 = r5
            r9 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            X.9hX r4 = new X.9hX
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.C37551pj.A03(r3, r0, r2, r4, r14)
            return
        L_0x035c:
            java.lang.Object r2 = r15.A01
            X.BwM r2 = (X.C24156BwM) r2
            java.lang.Object r1 = r15.A02
            android.view.Surface r1 = (android.view.Surface) r1
            if (r1 == 0) goto L_0x036d
            android.view.Surface r0 = r2.A02
            if (r1 == r0) goto L_0x036d
            r1.release()
        L_0x036d:
            r0 = 0
            r2.A06 = r0
            java.lang.String r0 = "voip/video/VoipCamera/ cameraDevice configure failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.CaW r0 = r2.cameraEventsDispatcher
            r0.A02()
            return
        L_0x037b:
            java.lang.Object r1 = r15.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            java.lang.Object r0 = r15.A02
            com.whatsapp.voipcalling.VideoPort r0 = (com.whatsapp.voipcalling.VideoPort) r0
            r1.m76lambda$setVideoPort$2$comwhatsappvoipcallingcameraVoipPhysicalCamera(r0)
            return
        L_0x0387:
            java.lang.Object r1 = r15.A01
            com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment r1 = (com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment) r1
            java.lang.Object r0 = r15.A02
            X.7NW r0 = (X.AnonymousClass7NW) r0
            com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment.A00(r1, r0)
            return
        L_0x0393:
            java.lang.Object r0 = r15.A01
            X.AfL r0 = (X.C21150AfL) r0
            java.lang.Object r2 = r15.A02
            X.A45 r2 = (X.A45) r2
            X.9k7 r1 = r0.A00
            java.lang.String r0 = "extension_message_response"
            X.9sN r2 = r1.A00(r2, r0)
            java.lang.String r1 = "error"
            goto L_0x03b8
        L_0x03a6:
            java.lang.Object r0 = r15.A01
            X.AfL r0 = (X.C21150AfL) r0
            java.lang.Object r2 = r15.A02
            X.A45 r2 = (X.A45) r2
            X.9k7 r1 = r0.A00
            java.lang.String r0 = "extension_message_response"
            X.9sN r2 = r1.A00(r2, r0)
            java.lang.String r1 = "success"
        L_0x03b8:
            X.1CQ r0 = X.AnonymousClass1D7.A0I()
            r2.A02(r1, r0)
            return
        L_0x03c0:
            java.lang.Object r2 = r15.A01
            X.BBM r2 = (X.BBM) r2
            java.lang.Object r1 = r15.A02
            java.util.Map r1 = (java.util.Map) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            goto L_0x03e3
        L_0x03cd:
            java.lang.Object r0 = r15.A01
            X.AfF r0 = (X.C21144AfF) r0
            java.lang.Object r1 = r15.A02
            java.util.Map r1 = (java.util.Map) r1
            X.BBM r0 = r0.A00
            r0.C7V(r1)
            return
        L_0x03db:
            java.lang.Object r2 = r15.A01
            X.BBM r2 = (X.BBM) r2
            java.lang.Object r1 = r15.A02
            java.util.Map r1 = (java.util.Map) r1
        L_0x03e3:
            X.A1q r0 = X.C19980A1q.A03
            r2.Btu(r0, r1)
            return
        L_0x03e9:
            java.lang.Object r1 = r15.A01
            X.BBM r1 = (X.BBM) r1
            java.lang.Object r0 = r15.A02
            java.util.Map r0 = (java.util.Map) r0
            r1.C7V(r0)
            return
        L_0x03f5:
            java.lang.Object r3 = r15.A01
            X.86W r3 = (X.AnonymousClass86W) r3
            java.lang.Object r5 = r15.A02
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r5 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r5
            r2 = 0
            boolean r0 = r3 instanceof X.C20519AOe
            if (r0 == 0) goto L_0x0447
            r0 = r3
            X.AOe r0 = (X.C20519AOe) r0
            java.lang.String r1 = r0.A00()
        L_0x0409:
            if (r1 == 0) goto L_0x0415
            com.whatsapp.WaTextView r0 = r5.A05
            if (r0 == 0) goto L_0x0415
            r0.setText(r1)
            r0.setVisibility(r2)
        L_0x0415:
            r5.CL9(r2)
            X.DFL r1 = r3.BM2()
            r0 = 40
            X.DFL r1 = r1.A09(r0)
            X.6hk r0 = new X.6hk
            r0.<init>(r1)
            java.lang.String r4 = r0.A01
            X.E8A r3 = r0.A00
            if (r4 == 0) goto L_0x0450
            if (r3 == 0) goto L_0x0450
            X.1KB r2 = r5.A04
            if (r2 == 0) goto L_0x044c
            r1 = 34
            X.7RS r0 = new X.7RS
            r0.<init>(r1, r4, r5)
            r2.A0J(r0)
            r1 = 8
            X.7Cf r0 = new X.7Cf
            r0.<init>(r3, r1)
            r5.A08 = r0
            return
        L_0x0447:
            java.lang.String r1 = X.C108985cd.A0k(r3)
            goto L_0x0409
        L_0x044c:
            java.lang.String r0 = "globalUI"
            goto L_0x0607
        L_0x0450:
            r5.A2K()
            return
        L_0x0454:
            java.lang.Object r2 = r15.A01
            java.lang.Object r1 = r15.A02
            X.86X r1 = (X.AnonymousClass86X) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.E8A r3 = r1.BM3()
            r1 = 0
            X.Boh r0 = X.ALS.A06(r2)
            X.Cph r2 = new X.Cph
            r2.<init>(r0)
            X.A4p r0 = X.C108985cd.A0J(r1)
            java.util.List r1 = r0.A00
            X.9zJ r0 = new X.9zJ
            r0.<init>(r1)
            r2.A02(r0, r3)
            return
        L_0x047b:
            java.lang.Object r1 = r15.A01
            java.lang.Object r0 = r15.A02
            X.86X r0 = (X.AnonymousClass86X) r0
            X.E8A r2 = r0.BM3()
            X.Boh r1 = X.ALS.A06(r1)
            X.9zJ r0 = X.C199029zJ.A01
            X.C25974Cph.A00(r1, r0, r2)
            return
        L_0x048f:
            java.lang.Object r1 = r15.A01
            X.6OY r1 = (X.AnonymousClass6OY) r1
            java.lang.Object r0 = r15.A02
            X.89o r0 = (X.C1606989o) r0
            X.AnonymousClass6OY.A00(r0, r1)
            return
        L_0x049b:
            java.lang.Object r3 = r15.A01
            X.1x5 r3 = (X.C41801x5) r3
            java.lang.Object r2 = r15.A02
            X.6tc r2 = (X.C136316tc) r2
            X.1dO r1 = X.C41801x5.A00(r3)
            if (r1 == 0) goto L_0x04ae
            java.lang.String r0 = "TAP_UNDO_CROSSPOST"
            r1.A02(r0)
        L_0x04ae:
            X.00H r0 = r3.A06
            java.lang.Object r0 = r0.get()
            X.6y4 r0 = (X.C139016y4) r0
            r0.A01(r2)
            return
        L_0x04ba:
            java.lang.Object r0 = r15.A01
            X.7Od r0 = (X.C146187Od) r0
            java.lang.Object r8 = r15.A02
            java.util.List r8 = (java.util.List) r8
            X.00H r0 = r0.A00
            java.lang.Object r12 = r0.get()
            X.73E r12 = (X.AnonymousClass73E) r12
            r7 = 0
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r2 = X.C29351c6.A0D(r8)
            java.util.Iterator r1 = r8.iterator()
        L_0x04d7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04ed
            java.lang.Object r0 = r1.next()
            X.6Re r0 = (X.C122646Re) r0
            int r0 = r0.databaseValue
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x04d7
        L_0x04ed:
            r6.addAll(r2)
            X.738 r11 = r12.A03()
            X.AnonymousClass738.A02(r11)
            android.util.LongSparseArray r10 = r11.A00
            monitor-enter(r10)
            int r9 = r10.size()     // Catch:{ all -> 0x055f }
            r5 = 0
        L_0x04ff:
            if (r5 >= r9) goto L_0x051d
            long r1 = r10.keyAt(r5)     // Catch:{ all -> 0x055f }
            java.util.Iterator r4 = r8.iterator()     // Catch:{ all -> 0x055f }
        L_0x0509:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x055f }
            if (r0 == 0) goto L_0x051a
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x055f }
            X.6Re r3 = (X.C122646Re) r3     // Catch:{ all -> 0x055f }
            r0 = 0
            X.AnonymousClass738.A01(r3, r11, r0, r1)     // Catch:{ all -> 0x055f }
            goto L_0x0509
        L_0x051a:
            int r5 = r5 + 1
            goto L_0x04ff
        L_0x051d:
            monitor-exit(r10)
            X.1Cd r0 = r12.A00
            X.1au r5 = r0.A05()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0558 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0558 }
            java.lang.String r3 = "status_crossposting_v3"
            int r1 = r8.size()     // Catch:{ all -> 0x0558 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = "destination IN  ("
            r2.append(r0)     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0558 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C108995ce.A0X(r0, r1)     // Catch:{ all -> 0x0558 }
            java.lang.String r2 = X.C17900vP.A0B(r0, r2)     // Catch:{ all -> 0x0558 }
            java.lang.String[] r1 = X.C17890vO.A1b(r6, r7)     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/DELETE_CROSSPOSTING_DATA_BY_DESTINATION_IDS"
            r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x0558 }
            r5.close()
            return
        L_0x0558:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x055a }
        L_0x055a:
            r1 = move-exception
            X.CDX.A00(r5, r0)
            throw r1
        L_0x055f:
            r1 = move-exception
            monitor-exit(r10)
            throw r1
        L_0x0562:
            java.lang.Object r1 = r15.A01
            X.6kK r1 = (X.C130986kK) r1
            java.lang.Object r2 = r15.A02
            X.34B r2 = (X.AnonymousClass34B) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.1T6 r1 = r1.A05
            r0 = 0
            r1.A0J(r2, r0)
            return
        L_0x0575:
            java.lang.Object r0 = r15.A01
            X.5qG r0 = (X.C114165qG) r0
            java.lang.Object r2 = r15.A02
            android.content.Context r2 = (android.content.Context) r2
            X.8As r1 = r0.A03
            r0 = 2131898511(0x7f12308f, float:1.9431942E38)
            java.lang.String r0 = X.C18070vi.A0F(r2, r0)
            r1.CRT(r0)
            java.lang.String r0 = ""
            r1.CRU(r0)
            return
        L_0x058f:
            java.lang.Object r2 = r15.A01
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r2 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r2
            java.lang.Object r0 = r15.A02
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 0
            java.lang.String r0 = r0.getMessage()
            r2.A4i(r0, r1)
            return
        L_0x05a0:
            java.lang.Object r2 = r15.A01
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.Object r1 = r15.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            r2.setImageDrawable(r1)
            return
        L_0x05b0:
            java.lang.Object r5 = r15.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r5 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r5
            java.lang.Object r4 = r15.A02
            X.6p4 r4 = (X.C133616p4) r4
            r3 = 1
            X.C18070vi.A0d(r4, r3)
            X.00H r0 = r5.A02
            if (r0 == 0) goto L_0x0605
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.10T r2 = (X.AnonymousClass10T) r2
            r1 = 0
            X.7KW r0 = new X.7KW
            r0.<init>(r1, r1, r1, r3)
            r2.notifyAllObservers(r0)
            r4.A00()
            r5.finish()
            return
        L_0x05d6:
            java.lang.Object r2 = r15.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r2 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r2
            java.lang.Object r1 = r15.A02
            X.4rF r1 = (X.C98494rF) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r2.A02
            if (r0 == 0) goto L_0x0605
            java.lang.Object r4 = X.C18070vi.A0E(r0)
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.Object r3 = r1.element
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = 0
            r1 = 0
            X.7KW r0 = new X.7KW
            r0.<init>(r2, r3, r2, r1)
            r4.notifyAllObservers(r0)
            return
        L_0x05fb:
            java.lang.String r0 = "crashLogsWrapperLazy"
            goto L_0x0607
        L_0x05fe:
            r1 = move-exception
            if (r5 == 0) goto L_0x060b
            r5.countDown()
            throw r1
        L_0x0605:
            java.lang.String r0 = "accountLinkingResultObservers"
        L_0x0607:
            X.C18070vi.A11(r0)
            r1 = 0
        L_0x060b:
            throw r1
        L_0x060c:
            java.lang.Object r5 = r15.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r5 = (com.whatsapp.webpagepreview.WebPagePreviewView) r5
            java.lang.Object r3 = r15.A02
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L_0x0642
            int r2 = r5.A0d
            int r1 = r5.A0c
            X.25O r0 = new X.25O
            r0.<init>(r2, r1)
            X.25P r0 = X.AnonymousClass204.A0C(r0, r3)
            android.graphics.Bitmap r2 = r0.A02
            if (r2 == 0) goto L_0x0634
            int r0 = r2.getHeight()
            if (r0 == 0) goto L_0x0634
            int r0 = r2.getWidth()
            r1 = 1
            if (r0 != 0) goto L_0x0635
        L_0x0634:
            r1 = 0
        L_0x0635:
            X.1KB r4 = r5.A0C
            r0 = 19
            X.7Qx r3 = new X.7Qx
            r3.<init>(r5, r2, r0, r1)
        L_0x063e:
            r4.A0J(r3)
            return
        L_0x0642:
            r2 = 0
            goto L_0x0634
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RN.run():void");
    }
}
