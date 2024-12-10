package X;

import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;

/* renamed from: X.7Qs  reason: invalid class name and case insensitive filesystem */
public class C146817Qs implements Runnable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C146817Qs(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v118, resolved type: com.whatsapp.instrumentation.ui.PermissionsFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v126, resolved type: com.whatsapp.instrumentation.ui.ConfirmFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v252, resolved type: com.whatsapp.instrumentation.ui.PermissionsFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v253, resolved type: com.whatsapp.instrumentation.ui.PermissionsFragment} */
    /* JADX WARNING: type inference failed for: r0v31, types: [X.9sW] */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03f0, code lost:
        r1.A01(r0.A1D(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05b8, code lost:
        throw null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x0104;
                case 2: goto L_0x010f;
                case 3: goto L_0x0119;
                case 4: goto L_0x015c;
                case 5: goto L_0x0182;
                case 6: goto L_0x01a2;
                case 7: goto L_0x01ba;
                case 8: goto L_0x01c4;
                case 9: goto L_0x01d2;
                case 10: goto L_0x01e0;
                case 11: goto L_0x0217;
                case 12: goto L_0x025d;
                case 13: goto L_0x0280;
                case 14: goto L_0x0288;
                case 15: goto L_0x0288;
                case 16: goto L_0x0290;
                case 17: goto L_0x02fb;
                case 18: goto L_0x0305;
                case 19: goto L_0x031b;
                case 20: goto L_0x033e;
                case 21: goto L_0x038d;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x03a6;
                case 25: goto L_0x03b7;
                case 26: goto L_0x03c9;
                case 27: goto L_0x03d2;
                case 28: goto L_0x03e8;
                case 29: goto L_0x03f8;
                case 30: goto L_0x0408;
                case 31: goto L_0x041d;
                case 32: goto L_0x042d;
                case 33: goto L_0x048d;
                case 34: goto L_0x0497;
                case 35: goto L_0x04d0;
                case 36: goto L_0x051f;
                case 37: goto L_0x052d;
                case 38: goto L_0x0537;
                case 39: goto L_0x0545;
                case 40: goto L_0x055e;
                case 41: goto L_0x0568;
                case 42: goto L_0x058a;
                case 43: goto L_0x05a8;
                case 44: goto L_0x05f6;
                case 45: goto L_0x0632;
                case 46: goto L_0x0671;
                case 47: goto L_0x06e3;
                case 48: goto L_0x071a;
                case 49: goto L_0x06ce;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r13.A01
            X.6we r5 = (X.C138176we) r5
            java.lang.String r2 = r13.A02
            monitor-enter(r5)
            java.util.Map r1 = r5.A02     // Catch:{ all -> 0x007c }
            java.lang.Object r6 = r1.get(r2)     // Catch:{ all -> 0x007c }
            X.6gD r6 = (X.AnonymousClass6gD) r6     // Catch:{ all -> 0x007c }
            if (r6 == 0) goto L_0x007a
            int r0 = r6.A00     // Catch:{ all -> 0x007c }
            if (r0 <= 0) goto L_0x0077
            java.lang.String r4 = r6.A01     // Catch:{ all -> 0x007c }
            java.util.List r3 = r6.A02     // Catch:{ all -> 0x007c }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0038
            java.lang.Object r0 = X.C29431cG.A0b(r3)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x007c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = ", throttled="
            r1.append(r0)     // Catch:{ all -> 0x007c }
            int r0 = r6.A00     // Catch:{ all -> 0x007c }
            X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x007c }
        L_0x0038:
            X.190 r7 = r5.A00     // Catch:{ all -> 0x007c }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0042
            r1 = 0
            goto L_0x0057
        L_0x0042:
            java.lang.Object r0 = X.C29431cG.A0b(r3)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x007c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = ", throttled="
            r1.append(r0)     // Catch:{ all -> 0x007c }
            int r0 = r6.A00     // Catch:{ all -> 0x007c }
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x007c }
        L_0x0057:
            r0 = 0
            r7.A0G(r4, r1, r0)     // Catch:{ all -> 0x007c }
            r3.clear()     // Catch:{ all -> 0x007c }
            r6.A00 = r0     // Catch:{ all -> 0x007c }
            X.00H r0 = r5.A01     // Catch:{ all -> 0x007c }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x007c }
            X.11A r4 = (X.AnonymousClass11A) r4     // Catch:{ all -> 0x007c }
            r0 = 23
            X.7Qs r3 = new X.7Qs     // Catch:{ all -> 0x007c }
            r3.<init>(r0, r2, r5)     // Catch:{ all -> 0x007c }
            r1 = 30000(0x7530, double:1.4822E-319)
            android.os.Handler r0 = r4.A00     // Catch:{ all -> 0x007c }
            r0.postDelayed(r3, r1)     // Catch:{ all -> 0x007c }
            goto L_0x007a
        L_0x0077:
            r1.remove(r2)     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r5)
            return
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x007f:
            java.lang.Object r5 = r13.A01
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            java.lang.String r4 = r13.A02
            X.1To r3 = r5.A09
            X.Af0 r2 = new X.Af0
            r2.<init>()
            boolean r0 = r3.A0T()
            if (r0 != 0) goto L_0x00ae
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r2.A0B(r0)
        L_0x0099:
            r0 = 0
            X.Aei r6 = new X.Aei
            r6.<init>(r0, r4, r5)
            X.10I r3 = r5.A0T
            r3.getClass()
            r1 = 1
            X.AlB r0 = new X.AlB
            r0.<init>(r3, r1)
            r2.A0A(r6, r0)
            return
        L_0x00ae:
            java.lang.String r0 = "sync-manager/doPreCompanionLogoutTask start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            X.2ya r7 = new X.2ya
            r7.<init>(r2, r3, r0)
            X.1Ta r0 = r3.A09
            r0.registerObserver(r7)
            X.10I r8 = r3.A0W
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            X.18O r1 = r3.A08
            X.18Q r0 = X.AnonymousClass18O.A13
            int r0 = r1.A04(r0)
            long r0 = (long) r0
            long r0 = r6.toMillis(r0)
            X.2PF r6 = new X.2PF
            r6.<init>((X.C21132Af0) r2, (X.C26811To) r3)
            X.25d r1 = r8.CGv(r6, r0)
            r6 = 1
            X.3AW r0 = new X.3AW
            r0.<init>(r7, r3, r1, r6)
            r2.A09(r0)
            X.00H r0 = r3.A0a
            java.lang.Object r1 = r0.get()
            X.2lN r1 = (X.C58862lN) r1
            java.lang.String r0 = "sentinel"
            X.2nY r1 = r1.A00(r0)
            X.2Co r1 = (X.C46022Co) r1
            if (r1 == 0) goto L_0x0099
            boolean r0 = r3.A0T()
            if (r0 == 0) goto L_0x0099
            java.util.ArrayList r0 = X.C46022Co.A00(r1, r6)
            r3.A0N(r0)
            r3.A0I()
            goto L_0x0099
        L_0x0104:
            java.lang.Object r2 = r13.A01
            X.10T r2 = (X.AnonymousClass10T) r2
            java.lang.String r1 = r13.A02
            r0 = 2
            X.AnonymousClass7KZ.A00(r2, r1, r0)
            return
        L_0x010f:
            java.lang.Object r1 = r13.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r1 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r1
            java.lang.String r0 = r13.A02
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity.A03(r1, r0)
            return
        L_0x0119:
            java.lang.Object r4 = r13.A01
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.String r1 = r13.A02
            X.1kY r0 = r4.A1z     // Catch:{ 1iZ -> 0x014f }
            X.6gh r3 = r0.A00(r1)     // Catch:{ 1iZ -> 0x014f }
            java.util.ArrayList r2 = r3.A01
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L_0x013a
            r4.A34 = r2
            java.util.HashSet r1 = r4.A4D
            r0 = 14
        L_0x0134:
            X.C17890vO.A1D(r1, r0)
            r4.A02 = r0
            return
        L_0x013a:
            int r0 = r2.size()
            if (r0 != r1) goto L_0x06e2
            r0 = 0
            java.lang.String r0 = X.C108945cZ.A1H(r2, r0)
            r4.A2z = r0
            java.lang.String r0 = r3.A00
            r4.A30 = r0
            java.util.HashSet r1 = r4.A4D
            r0 = 4
            goto L_0x0134
        L_0x014f:
            r3 = move-exception
            X.1KB r2 = r4.A0S
            r1 = 1
            X.7Pi r0 = new X.7Pi
            r0.<init>(r4, r3, r1)
            r2.CGP(r0)
            return
        L_0x015c:
            java.lang.Object r3 = r13.A01
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r3 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r3
            java.lang.String r11 = r13.A02
            X.1KB r4 = r3.A05
            X.10I r10 = r3.A0J
            X.0vb r6 = r3.A01
            r0 = 1
            X.7Ie r9 = new X.7Ie
            r9.<init>(r3, r0)
            X.0ve r2 = r3.A02
            X.1gU r1 = r3.A0C
            X.181 r0 = r3.A02
            X.7Fe r5 = new X.7Fe
            r5.<init>(r0, r2, r1, r11)
            X.0ve r7 = r3.A02
            X.18K r8 = r3.A0A
            r12 = 0
            X.AnonymousClass4WC.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0182:
            java.lang.Object r3 = r13.A01
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r3 = (com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r3
            java.lang.String r2 = r13.A02
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r3.A0F
            java.lang.String r1 = "wdsSearchBar"
            if (r0 == 0) goto L_0x019d
            com.whatsapp.wds.components.search.WDSSearchView r0 = r0.A08
            r0.setText((java.lang.CharSequence) r2)
            com.whatsapp.wds.components.search.WDSSearchBar r2 = r3.A0F
            if (r2 == 0) goto L_0x019d
            r1 = 0
            r0 = 1
            com.whatsapp.wds.components.search.WDSSearchBar.A01(r2, r1, r0)
            return
        L_0x019d:
            X.C18070vi.A11(r1)
            goto L_0x05b7
        L_0x01a2:
            java.lang.Object r0 = r13.A01
            X.49P r0 = (X.AnonymousClass49P) r0
            java.lang.String r1 = r13.A02
            java.lang.ref.WeakReference r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.4R6 r0 = (X.AnonymousClass4R6) r0
            if (r0 == 0) goto L_0x06e2
            r0.A01 = r1
            X.5Z6 r0 = r0.A02
            r0.BvK()
            return
        L_0x01ba:
            java.lang.Object r1 = r13.A01
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r13.A02
            r1.setText(r0)
            return
        L_0x01c4:
            java.lang.Object r2 = r13.A01
            X.4VI r2 = (X.AnonymousClass4VI) r2
            java.lang.String r1 = r13.A02
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r2.A00(r1)
            return
        L_0x01d2:
            java.lang.Object r0 = r13.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            java.lang.String r2 = r13.A02
            X.19r r1 = r0.A2m
            java.lang.String r0 = "Resume"
            r1.A02(r2, r0)
            return
        L_0x01e0:
            java.lang.Object r5 = r13.A01
            X.3TA r5 = (X.AnonymousClass3TA) r5
            java.lang.String r4 = r13.A02
            java.lang.Integer r3 = r5.A06
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r2 = 0
            r1 = 0
            if (r3 != r0) goto L_0x0202
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0202
            java.lang.String r0 = r5.A0A
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0202
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            r5.A06 = r0
            X.AnonymousClass3TA.A06(r5, r2, r1, r1)
            return
        L_0x0202:
            X.4O2 r0 = r5.A01
            if (r0 == 0) goto L_0x06e2
            java.lang.String r0 = r0.A02
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x06e2
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            r5.A06 = r0
            r0 = 1
            X.AnonymousClass3TA.A06(r5, r2, r1, r0)
            return
        L_0x0217:
            java.lang.Object r4 = r13.A01
            X.3TA r4 = (X.AnonymousClass3TA) r4
            java.lang.String r5 = r13.A02
            java.lang.Integer r2 = r4.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r3 = 0
            r1 = 0
            if (r2 != r0) goto L_0x0248
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0248
            java.lang.String r0 = r4.A0A
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0248
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            r4.A07 = r0
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x0245
            X.1DT r2 = r4.A0M
            X.4DX r1 = X.AnonymousClass4DX.LARGE_THUMBNAIL_FAILED
            X.4UK r0 = new X.4UK
            r0.<init>(r3, r1, r3)
            r2.A0E(r0)
        L_0x0245:
            r4.A02 = r3
            return
        L_0x0248:
            X.4O2 r0 = r4.A02
            if (r0 == 0) goto L_0x06e2
            java.lang.String r0 = r0.A02
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x06e2
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            r4.A07 = r0
            r0 = 1
            X.AnonymousClass3TA.A07(r4, r3, r1, r0)
            return
        L_0x025d:
            java.lang.Object r0 = r13.A01
            X.4ob r0 = (X.C96904ob) r0
            java.lang.String r10 = r13.A02
            X.3TA r2 = r0.A00
            X.1KB r3 = r2.A0N
            X.10I r9 = r2.A0q
            X.0vb r5 = r2.A0b
            X.5a2 r8 = r2.A03
            boolean r11 = r2.A0E
            X.0ve r6 = r2.A0e
            X.1gU r1 = r2.A0g
            X.181 r0 = r2.A0P
            X.7Fe r4 = new X.7Fe
            r4.<init>(r0, r6, r1, r10)
            X.18K r7 = r2.A0f
            X.AnonymousClass4WC.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0280:
            java.lang.Object r0 = r13.A01
            X.1Gn r0 = (X.C23501Gn) r0
            r0.C2V()
            return
        L_0x0288:
            java.lang.Object r0 = r13.A01
            X.1Gn r0 = (X.C23501Gn) r0
            r0.C9R()
            return
        L_0x0290:
            java.lang.Object r3 = r13.A01
            X.871 r3 = (X.AnonymousClass871) r3
            java.lang.String r1 = r13.A02
            if (r1 == 0) goto L_0x02de
            boolean r0 = X.AnonymousClass1YF.A0T(r1)
            if (r0 != 0) goto L_0x02de
            android.net.Uri r1 = android.net.Uri.parse(r1)
        L_0x02a2:
            com.whatsapp.deeplink.DeepLinkActivity r3 = (com.whatsapp.deeplink.DeepLinkActivity) r3
            android.os.Handler r0 = r3.A00
            r4 = 1
            r0.removeMessages(r4)
            r3.CEx()
            if (r1 != 0) goto L_0x02e0
            X.3Rj r2 = X.AnonymousClass4a6.A00(r3)
            r0 = 2131890575(0x7f12118f, float:1.9415846E38)
            r2.A0D(r0)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 39
            X.757 r0 = X.AnonymousClass757.A00(r3, r0)
            r2.A0X(r0, r1)
            r1 = 2131897377(0x7f122c21, float:1.9429642E38)
            r0 = 40
            X.AnonymousClass757.A01(r2, r3, r0, r1)
            X.05w r2 = r2.create()
            r1 = 2
            X.759 r0 = new X.759
            r0.<init>(r3, r1)
            r2.setOnDismissListener(r0)
            r2.show()
            return
        L_0x02de:
            r1 = 0
            goto L_0x02a2
        L_0x02e0:
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r1)
            java.lang.String r1 = "com.android.browser.application_id"
            java.lang.String r0 = r3.getPackageName()
            r2.putExtra(r1, r0)
            java.lang.String r0 = "create_new_tab"
            r2.putExtra(r0, r4)
            X.1L9 r0 = r3.A01
            r0.A08(r3, r2)
            X.C108965cb.A0y(r3)
            return
        L_0x02fb:
            java.lang.Object r1 = r13.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = r13.A02
            r1.setTitle(r0)
            return
        L_0x0305:
            java.lang.Object r0 = r13.A01
            X.4X6 r0 = (X.AnonymousClass4X6) r0
            java.lang.String r1 = r13.A02
            android.content.Context r0 = r0.A03
            X.3Rj r0 = X.AnonymousClass4a6.A00(r0)
            r0.A0S(r1)
            X.C73203Rj.A06(r0)
            r0.A0C()
            return
        L_0x031b:
            java.lang.Object r2 = r13.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            java.lang.String r5 = r13.A02
            X.1MW r1 = r2.A0s
            X.1EC r0 = r2.A1K
            X.2tp r0 = r1.A0B(r0)
            r0.A06()
            X.12M r4 = r2.A1C
            X.1EC r3 = r2.A1K
            r2 = 0
            java.lang.String r1 = r0.A0F()
            X.2sm r0 = new X.2sm
            r0.<init>(r5, r2, r1)
            r4.A0C(r0, r3)
            return
        L_0x033e:
            java.lang.Object r5 = r13.A01
            X.3cj r5 = (X.C74793cj) r5
            java.lang.String r3 = r13.A02
            r2 = 0
            android.content.Context r6 = r5.getContext()
            r1 = 2131891015(0x7f121347, float:1.9416738E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r1 = X.AnonymousClass3Ma.A10(r6, r3, r0, r2, r1)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r4 = r1.append(r0)
            X.C18070vi.A0X(r4)
            r0 = 2131103150(0x7f060dae, float:1.7818758E38)
            int r0 = X.C19740yt.A00(r6, r0)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r0)
            int r2 = r4.length()
            r0 = 2131899101(0x7f1232dd, float:1.9433138E38)
            java.lang.String r0 = r6.getString(r0)
            r4.append(r0)
            int r1 = r4.length()
            r0 = 17
            r4.setSpan(r3, r2, r1, r0)
            r5.setDescription((java.lang.CharSequence) r4)
            return
        L_0x038d:
            java.lang.Object r3 = r13.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r2 = r13.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Creating group with LID: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r1, r0)
            r0.show()
            return
        L_0x03a6:
            java.lang.Object r2 = r13.A01
            X.6nD r2 = (X.C132636nD) r2
            java.lang.String r1 = r13.A02
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onSuccess uploading logs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.707 r0 = r2.A00
            r0.A03(r1)
            return
        L_0x03b7:
            java.lang.Object r0 = r13.A01
            X.AIw r0 = (X.C20383AIw) r0
            java.lang.String r1 = r13.A02
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.6xn r0 = (X.C138846xn) r0
            r0.A00(r1)
            return
        L_0x03c9:
            java.lang.Object r0 = r13.A01
            com.whatsapp.instrumentation.ui.ConfirmFragment r0 = (com.whatsapp.instrumentation.ui.ConfirmFragment) r0
            java.lang.String r2 = r13.A02
            X.1o3 r1 = r0.A01
            goto L_0x03f0
        L_0x03d2:
            java.lang.Object r0 = r13.A01
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r0 = (com.whatsapp.instrumentation.ui.InstrumentationAuthActivity) r0
            java.lang.String r3 = r13.A02
            com.whatsapp.instrumentation.ui.VerificationCodeFragment r2 = r0.A0A
            r1 = 0
            r2.A02 = r3
            X.41z r0 = new X.41z
            r0.<init>(r3, r1)
            r2.A00 = r0
            com.whatsapp.instrumentation.ui.VerificationCodeFragment.A00(r2)
            return
        L_0x03e8:
            java.lang.Object r0 = r13.A01
            com.whatsapp.instrumentation.ui.PermissionsFragment r0 = (com.whatsapp.instrumentation.ui.PermissionsFragment) r0
            java.lang.String r2 = r13.A02
            X.1o3 r1 = r0.A01
        L_0x03f0:
            X.1FL r0 = r0.A1D()
            r1.A01(r0, r2)
            return
        L_0x03f8:
            java.lang.Object r0 = r13.A01
            X.7Po r0 = (X.C146557Po) r0
            java.lang.String r1 = r13.A02
            java.lang.Object r0 = r0.A03
            X.75M r0 = (X.AnonymousClass75M) r0
            r0.A0a = r1
            X.AnonymousClass75M.A0A(r0)
            return
        L_0x0408:
            java.lang.Object r0 = r13.A01
            X.1h8 r0 = (X.C32401h8) r0
            java.lang.String r1 = r13.A02
            java.util.concurrent.ConcurrentHashMap r0 = r0.A08
            java.lang.Object r1 = r0.get(r1)
            X.7RU r1 = (X.AnonymousClass7RU) r1
            if (r1 == 0) goto L_0x06e2
            r0 = 0
            X.AnonymousClass7RU.A01(r1, r0)
            return
        L_0x041d:
            java.lang.Object r2 = r13.A01
            X.7Ka r2 = (X.C145127Ka) r2
            java.lang.String r1 = r13.A02
            java.lang.Runnable r0 = r2.A00
            if (r0 != 0) goto L_0x06e2
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0C
            r0.remove(r1)
            return
        L_0x042d:
            java.lang.Object r4 = r13.A01
            X.1gR r4 = (X.C31981gR) r4
            java.lang.String r3 = r13.A02
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0486 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r1 = r2.getHost()     // Catch:{ IOException -> 0x0486 }
            java.lang.String r0 = ".whatsapp.net"
            boolean r0 = r1.endsWith(r0)     // Catch:{ IOException -> 0x0486 }
            if (r0 == 0) goto L_0x047c
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0486 }
            boolean r0 = r2 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0486 }
            if (r0 == 0) goto L_0x0472
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0486 }
            java.lang.String r0 = "sonar connection success; url="
            X.C17900vP.A0f(r0, r3, r1)     // Catch:{ IOException -> 0x0486 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ IOException -> 0x0486 }
            X.18j r0 = r4.A00
            X.9A9 r0 = r0.A02()
            r2.setSSLSocketFactory(r0)
            int r2 = r2.getResponseCode()     // Catch:{ IOException -> 0x046e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x046e }
            java.lang.String r0 = "sonar response code: "
            X.C17900vP.A0j(r0, r1, r2)     // Catch:{ IOException -> 0x046e }
            return
        L_0x046e:
            r1 = move-exception
            java.lang.String r0 = "sonar IOException"
            goto L_0x0489
        L_0x0472:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0486 }
            java.lang.String r0 = "sonar pingback failed to open https url connection; url="
            X.C17900vP.A0g(r0, r3, r1)     // Catch:{ IOException -> 0x0486 }
            return
        L_0x047c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0486 }
            java.lang.String r0 = "sonar pingback url did not end with *.whatsapp.net actual; url="
            X.C17900vP.A0g(r0, r3, r1)     // Catch:{ IOException -> 0x0486 }
            return
        L_0x0486:
            r1 = move-exception
            java.lang.String r0 = "IOException on sonar pingback"
        L_0x0489:
            com.whatsapp.util.Log.i(r0, r1)
            return
        L_0x048d:
            java.lang.Object r1 = r13.A01
            X.1O5 r1 = (X.AnonymousClass1O5) r1
            java.lang.String r0 = r13.A02
            r1.BrD(r0)
            return
        L_0x0497:
            java.lang.Object r2 = r13.A01
            X.1dT r2 = (X.C30151dT) r2
            java.lang.String r4 = r13.A02
            X.1dn r3 = r2.A00
            if (r3 == 0) goto L_0x06e2
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x04cd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r0)
            r0 = 95
            java.lang.String r0 = X.C17890vO.A0c(r1, r0)
        L_0x04b2:
            X.19Y r2 = X.C30151dT.A00(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "call_ended"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            r0 = 125908665(0x78136b9, float:1.9441926E-34)
            r2.markerPoint((int) r0, (java.lang.String) r1, (java.lang.String) r4)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            return
        L_0x04cd:
            java.lang.String r0 = ""
            goto L_0x04b2
        L_0x04d0:
            java.lang.Object r6 = r13.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r6 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r6
            java.lang.String r5 = r13.A02
            X.00H r0 = r6.A0R
            X.1Ps r2 = X.AnonymousClass3MW.A0W(r0)
            X.1DT r0 = r6.A0E
            java.lang.Object r0 = r0.A06()
            X.6zo r0 = (X.C140016zo) r0
            if (r0 == 0) goto L_0x04ea
            java.lang.String r1 = r0.A05
            if (r1 != 0) goto L_0x04ec
        L_0x04ea:
            java.lang.String r1 = ""
        L_0x04ec:
            X.00H r0 = r2.A03
            java.lang.Object r4 = r0.get()
            X.6z3 r4 = (X.C139566z3) r4
            r3 = 0
            X.00H r0 = r4.A01
            java.lang.Object r2 = r0.get()
            X.6bK r2 = (X.C125586bK) r2
            java.lang.String r0 = "session_id"
            java.util.Map r1 = X.C108975cc.A0h(r0, r1)
            java.util.HashMap r0 = r2.A00
            r0.clear()
            r0.putAll(r1)
            X.00H r0 = r4.A04
            java.lang.Object r2 = r0.get()
            X.71k r2 = (X.C1404371k) r2
            java.lang.String r0 = ""
            r1 = 0
            r2.A02(r5, r0, r1, r3)
            X.1wy r0 = r6.A0Q
            r0.A0F(r1)
            return
        L_0x051f:
            java.lang.Object r2 = r13.A01
            X.BB1 r2 = (X.BB1) r2
            java.lang.String r1 = r13.A02
            X.1CQ r0 = X.AnonymousClass1D7.A0I()
            r2.C7h(r1, r0)
            return
        L_0x052d:
            java.lang.Object r1 = r13.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            java.lang.String r0 = r13.A02
            r1.A43(r0)
            return
        L_0x0537:
            java.lang.Object r1 = r13.A01
            X.1jf r1 = (X.C33961jf) r1
            java.lang.String r0 = r13.A02
            java.util.Set r0 = X.C18070vi.A0P(r0)
            X.C33961jf.A01(r1, r0)
            return
        L_0x0545:
            java.lang.Object r1 = r13.A01
            androidx.appcompat.app.AlertDialog$Builder r1 = (androidx.appcompat.app.AlertDialog$Builder) r1
            java.lang.String r0 = r13.A02
            android.content.Context r3 = r1.getContext()
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r3.startActivity(r0)
            return
        L_0x055e:
            java.lang.Object r1 = r13.A01
            X.1ie r1 = (X.C33331ie) r1
            java.lang.String r0 = r13.A02
            X.C33331ie.A01(r1, r0)
            return
        L_0x0568:
            java.lang.Object r3 = r13.A01
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r3 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r3
            java.lang.String r2 = r13.A02
            X.8Gd r0 = r3.A0C
            X.21K r1 = r0.A0V()
            if (r1 == 0) goto L_0x06e2
            X.AEt r0 = r1.BPK()
            if (r0 == 0) goto L_0x06e2
            X.AEn r0 = r0.A02
            if (r0 == 0) goto L_0x06e2
            r0.A08 = r2
            X.122 r0 = r3.A07
            X.206 r1 = (X.AnonymousClass206) r1
            r0.CQw(r1)
            return
        L_0x058a:
            java.lang.Object r2 = r13.A01
            com.whatsapp.payments.ui.BrazilPaymentActivity r2 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r2
            java.lang.String r1 = r13.A02
            X.1QS r0 = r2.A0Q
            X.AnonymousClass1QS.A00(r0)
            X.1KH r0 = r0.A05
            X.AEs r1 = r0.A08(r1)
            r2.CEx()
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r2.A0T
            if (r0 == 0) goto L_0x06e2
            if (r1 == 0) goto L_0x06e2
            r0.C0I(r1)
            return
        L_0x05a8:
            java.lang.Object r9 = r13.A01
            com.whatsapp.payments.ui.BrazilPaymentPixSendKeyActivity r9 = (com.whatsapp.payments.ui.BrazilPaymentPixSendKeyActivity) r9
            java.lang.String r8 = r13.A02
            java.lang.String r7 = r9.A08
            if (r7 != 0) goto L_0x05b9
            java.lang.String r0 = "referralScreen"
        L_0x05b4:
            X.C18070vi.A11(r0)
        L_0x05b7:
            r0 = 0
            throw r0
        L_0x05b9:
            java.lang.String r6 = r9.A07
            if (r6 != 0) goto L_0x05c0
            java.lang.String r0 = "previousScreen"
            goto L_0x05b4
        L_0x05c0:
            com.whatsapp.jid.UserJid r5 = r9.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.ChatJid"
            X.C18070vi.A0z(r5, r0)
            java.lang.String r4 = r9.A03
            if (r4 != 0) goto L_0x05ce
            java.lang.String r0 = "pixKeyCredentialId"
            goto L_0x05b4
        L_0x05ce:
            java.lang.String r3 = r9.A05
            if (r3 != 0) goto L_0x05d5
            java.lang.String r0 = "pixKeyType"
            goto L_0x05b4
        L_0x05d5:
            java.lang.String r2 = r9.A06
            if (r2 != 0) goto L_0x05dc
            java.lang.String r0 = "pixKeyValue"
            goto L_0x05b4
        L_0x05dc:
            java.lang.String r1 = r9.A04
            if (r1 != 0) goto L_0x05e3
            java.lang.String r0 = "pixKeyDisplayName"
            goto L_0x05b4
        L_0x05e3:
            X.9sW r0 = new X.9sW
            r0.<init>(r3, r2, r1, r4)
            com.whatsapp.payments.ui.BrazilPixSendKeyBottomSheet r2 = X.AnonymousClass9RH.A00(r0, r5, r7, r6, r8)
            X.1GP r1 = r9.getSupportFragmentManager()
            java.lang.String r0 = "BrazilPixSendKeyBottomSheet"
            X.C20098A7b.A03(r2, r1, r0)
            return
        L_0x05f6:
            java.lang.Object r1 = r13.A01
            X.91M r1 = (X.AnonymousClass91M) r1
            java.lang.String r3 = r13.A02
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x062a
            X.AXS r0 = r1.A0N
            java.lang.String r0 = r0.A0F()
            java.lang.String r0 = r1.A4m(r0)
            r1.A02 = r0
            r1.A5F()
            X.8pN r0 = r1.A00
            java.lang.String r4 = r0.A0B
            java.lang.String r5 = r1.A02
            X.8pb r2 = r0.A08
            X.8pS r2 = (X.AnonymousClass8pS) r2
            X.77e r0 = r0.A09
            if (r0 == 0) goto L_0x0628
            java.lang.Object r6 = r0.A00
        L_0x0621:
            java.lang.String r6 = (java.lang.String) r6
            r7 = 1
            r1.A5C(r2, r3, r4, r5, r6, r7)
            return
        L_0x0628:
            r6 = 0
            goto L_0x0621
        L_0x062a:
            X.8pN r0 = r1.A00
            X.8pb r0 = r0.A08
            r1.A5B(r0)
            return
        L_0x0632:
            java.lang.Object r3 = r13.A01
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r3 = (com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel) r3
            java.lang.String r1 = r13.A02
            X.00H r2 = r3.A0B
            java.lang.Object r0 = r2.get()
            X.9uF r0 = (X.C195969uF) r0
            r0.A02(r1)
            X.1QS r0 = r3.A06
            X.AnonymousClass1QS.A00(r0)
            X.1KH r0 = r0.A05
            boolean r0 = r0.A0L(r1)
            X.1DT r1 = r3.A01
            if (r0 == 0) goto L_0x066c
            r0 = 3
            X.AnonymousClass3MX.A1K(r1, r0)
            java.lang.Object r0 = r2.get()
            X.9uF r0 = (X.C195969uF) r0
            r0.A01()
            X.1KB r2 = r3.A02
            r1 = 35
            X.Aju r0 = new X.Aju
            r0.<init>(r3, r1)
            r2.CGP(r0)
            return
        L_0x066c:
            r0 = 2
            X.AnonymousClass3MX.A1K(r1, r0)
            return
        L_0x0671:
            java.lang.Object r6 = r13.A01
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r6 = (com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel) r6
            java.lang.String r5 = r13.A02
            X.1QS r0 = r6.A06
            X.AnonymousClass1QS.A00(r0)
            X.1KH r0 = r0.A05
            X.AEs r1 = r0.A08(r5)
            if (r1 == 0) goto L_0x06e2
            boolean r0 = r1 instanceof X.AnonymousClass8pM
            if (r0 == 0) goto L_0x06e2
            X.8pb r7 = r1.A08
            boolean r0 = r7 instanceof X.AnonymousClass8pJ
            if (r0 == 0) goto L_0x06e2
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.data.BrazilCustomPaymentMethodData"
            X.C18070vi.A0z(r7, r0)
            X.8pV r7 = (X.AnonymousClass8pV) r7
            java.util.HashMap r1 = r7.A03
            java.lang.String r0 = "pix_key_type"
            java.lang.Object r0 = r1.get(r0)
            X.ADJ r0 = (X.ADJ) r0
            r4 = 0
            if (r0 == 0) goto L_0x06c6
            java.lang.String r3 = r0.A00
            java.util.HashMap r1 = r7.A03
            java.lang.String r0 = "pix_key"
            java.lang.Object r0 = r1.get(r0)
            X.ADJ r0 = (X.ADJ) r0
            if (r0 == 0) goto L_0x06cc
            java.lang.String r2 = r0.A00
        L_0x06b2:
            java.util.HashMap r1 = r7.A03
            java.lang.String r0 = "pix_display_name"
            java.lang.Object r0 = r1.get(r0)
            X.ADJ r0 = (X.ADJ) r0
            if (r0 == 0) goto L_0x06c0
            java.lang.String r4 = r0.A00
        L_0x06c0:
            X.9sW r0 = new X.9sW
            r0.<init>(r3, r2, r4, r5)
            r4 = r0
        L_0x06c6:
            X.1DT r0 = r6.A00
            r0.A0E(r4)
            return
        L_0x06cc:
            r2 = r4
            goto L_0x06b2
        L_0x06ce:
            java.lang.Object r0 = r13.A01
            X.1jV r0 = (X.C33861jV) r0
            java.lang.String r2 = r13.A02
            X.00H r0 = r0.A03
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 3
            X.AnonymousClass7KZ.A00(r1, r2, r0)
        L_0x06e2:
            return
        L_0x06e3:
            java.lang.Object r4 = r13.A01
            X.8GL r4 = (X.AnonymousClass8GL) r4
            java.lang.String r6 = r13.A02
            X.1QS r1 = r4.A0G
            X.AnonymousClass1QS.A00(r1)
            X.1QR r5 = r1.A04
            X.AW0 r0 = r4.A07
            int r7 = r0.A03
            X.11P r0 = r4.A03
            long r9 = X.AnonymousClass11P.A01(r0)
            long r11 = X.AnonymousClass11P.A01(r0)
            r8 = 401(0x191, float:5.62E-43)
            r5.A0a(r6, r7, r8, r9, r11)
            X.AnonymousClass1QS.A00(r1)
            r2 = 0
            r0 = -1
            X.AW0 r3 = r5.A0N(r2, r6, r0)
            X.1KB r2 = r4.A0B
            r1 = 48
            X.Ajz r0 = new X.Ajz
            r0.<init>(r4, r3, r1)
            r2.A0J(r0)
            return
        L_0x071a:
            java.lang.Object r1 = r13.A01
            X.96o r1 = (X.AnonymousClass96o) r1
            java.lang.String r4 = r13.A02
            X.00H r0 = r1.A03
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0737
            X.AWa r1 = r1.A00
            X.8xu r0 = new X.8xu
            r0.<init>()
            r1.BtD(r4, r0)
            return
        L_0x0737:
            X.00H r0 = r1.A04
            java.lang.Object r2 = r0.get()
            X.9xr r2 = (X.C198149xr) r2
            X.22H r3 = r1.A01()
            X.AWa r1 = r1.A00
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            r6 = 0
            r5 = r4
            X.C198149xr.A00(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146817Qs.run():void");
    }

    public C146817Qs(LinkedDevicesSharedViewModel linkedDevicesSharedViewModel, String str) {
        this.A00 = 0;
        this.A01 = linkedDevicesSharedViewModel;
        this.A02 = str;
    }
}
