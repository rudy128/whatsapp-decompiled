package X;

import com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment;

/* renamed from: X.48n  reason: invalid class name */
public class AnonymousClass48n extends C38471rL {
    public final int A00;
    public final int A01;
    public final Object A02;

    public static PrivacyCheckupBaseFragment A00(AnonymousClass48n r1, Object obj) {
        C18070vi.A0d(obj, 0);
        return (PrivacyCheckupBaseFragment) r1.A02;
    }

    public AnonymousClass48n(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0146, code lost:
        A01(r0, r2, r4);
        r0 = r9.getContext();
        r3 = X.C17880vN.A0A();
        r3.setClassName(r0.getPackageName(), "com.whatsapp.privacy.checkup.PrivacyCheckupDetailActivity");
        r3.putExtra("DETAIL_CATEGORY", r2);
        r0 = "ENTRY_POINT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01cb, code lost:
        r3.setClassName(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0205, code lost:
        r3 = r1.setClassName(r2, r0);
        X.C18070vi.A0X(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0242, code lost:
        r3.putExtra(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0245, code lost:
        X.AnonymousClass3MY.A11(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0248, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x024b, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x024f, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0250;
                case 1: goto L_0x020d;
                case 2: goto L_0x01e9;
                case 3: goto L_0x01cf;
                case 4: goto L_0x01af;
                case 5: goto L_0x0183;
                case 6: goto L_0x0163;
                case 7: goto L_0x013f;
                case 8: goto L_0x0137;
                case 9: goto L_0x012f;
                case 10: goto L_0x0127;
                case 11: goto L_0x00f9;
                case 12: goto L_0x00db;
                case 13: goto L_0x00bd;
                case 14: goto L_0x009a;
                case 15: goto L_0x007a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r8.A02
            com.whatsapp.settings.SettingsTabActivity r4 = (com.whatsapp.settings.SettingsTabActivity) r4
            int r0 = r8.A01
            X.AnonymousClass3MY.A1S(r4, r0)
            X.00H r0 = r4.A0n
            java.lang.Object r0 = r0.get()
            X.6oZ r0 = (X.C133326oZ) r0
            X.00H r0 = r0.A00
            android.content.Intent r3 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ProfileInfoActivity"
            r3.setClassName(r1, r0)
            boolean r0 = X.AnonymousClass3MX.A1V(r4)
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x006a
            boolean r0 = r4.A1F
            if (r0 == 0) goto L_0x006a
            r0 = 2
            X.0yx[] r5 = new X.C19760yx[r0]
            android.widget.ImageView r2 = r4.A04
            java.lang.String r1 = X.AnonymousClass4ZR.A01(r4)
            X.0yx r0 = new X.0yx
            r0.<init>(r2, r1)
            r5[r7] = r0
            com.whatsapp.WaImageView r2 = r4.A0H
            X.4ZR r1 = new X.4ZR
            r1.<init>(r4)
            r0 = 2131899530(0x7f12348a, float:1.9434009E38)
            java.lang.String r1 = r1.A02(r0)
            X.0yx r0 = new X.0yx
            r0.<init>(r2, r1)
            r5[r6] = r0
        L_0x0056:
            boolean r0 = X.AnonymousClass745.A00
            if (r0 == 0) goto L_0x0068
            X.5hM r0 = X.C1406772n.A01(r4, r5)
            android.app.ActivityOptions r0 = r0.A00
            android.os.Bundle r0 = r0.toBundle()
        L_0x0064:
            r4.startActivity(r3, r0)
        L_0x0067:
            return
        L_0x0068:
            r0 = 0
            goto L_0x0064
        L_0x006a:
            X.0yx[] r5 = new X.C19760yx[r6]
            android.widget.ImageView r2 = r4.A04
            java.lang.String r1 = X.AnonymousClass4ZR.A01(r4)
            X.0yx r0 = new X.0yx
            r0.<init>(r2, r1)
            r5[r7] = r0
            goto L_0x0056
        L_0x007a:
            java.lang.Object r1 = r8.A02
            X.3Wm r1 = (X.C73573Wm) r1
            X.0vk r0 = r1.A03
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0067
            X.5aM r2 = r1.A00
            java.util.List r0 = r1.A02
            int r1 = r8.A01
            java.lang.Object r0 = r0.get(r1)
            X.77E r0 = (X.AnonymousClass77E) r0
            r2.C7o(r0, r1)
            return
        L_0x009a:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A01
            r0 = 14
            A01(r2, r0, r1)
            r0 = 11
            r2.A26(r0, r1)
            android.content.Context r0 = r9.getContext()
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.authentication.AppAuthSettingsActivity"
            r3.setClassName(r1, r0)
            goto L_0x0245
        L_0x00bd:
            r3 = 0
            X.C18070vi.A0d(r9, r3)
            java.lang.Object r2 = r8.A02
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = (com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment) r2
            int r1 = r8.A01
            r0 = 15
            A01(r2, r0, r1)
            r0 = 17
            r2.A26(r0, r1)
            android.content.Context r0 = X.AnonymousClass3MY.A04(r9)
            android.content.Intent r3 = X.AnonymousClass1LU.A1m(r0, r3)
            goto L_0x0245
        L_0x00db:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A01
            r0 = 11
            A01(r2, r0, r1)
            r0 = 12
            r2.A26(r0, r1)
            android.content.Context r1 = r9.getContext()
            r0 = 1
            android.content.Intent r3 = X.C17880vN.A0A()
            X.AnonymousClass1LU.A1q(r1, r3, r0)
            goto L_0x0245
        L_0x00f9:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            java.lang.Object r3 = r8.A02
            com.whatsapp.privacy.checkup.PrivacyCheckupMorePrivacyFragment r3 = (com.whatsapp.privacy.checkup.PrivacyCheckupMorePrivacyFragment) r3
            int r1 = r8.A01
            r0 = 13
            A01(r3, r0, r1)
            r0 = 16
            r3.A26(r0, r1)
            android.content.Context r2 = r9.getContext()
            X.1NT r0 = r3.A01
            if (r0 == 0) goto L_0x0123
            boolean r1 = r0.A04()
            r0 = 1
            if (r1 == 0) goto L_0x011d
            r0 = 3
        L_0x011d:
            android.content.Intent r3 = X.AnonymousClass1LU.A0D(r2, r0)
            goto L_0x0245
        L_0x0123:
            java.lang.String r0 = "encBackupManager"
            goto L_0x024b
        L_0x0127:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r0 = A00(r8, r9)
            int r4 = r8.A01
            r2 = 1
            goto L_0x0146
        L_0x012f:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r0 = A00(r8, r9)
            int r4 = r8.A01
            r2 = 2
            goto L_0x0146
        L_0x0137:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r0 = A00(r8, r9)
            int r4 = r8.A01
            r2 = 3
            goto L_0x0146
        L_0x013f:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r0 = A00(r8, r9)
            int r4 = r8.A01
            r2 = 4
        L_0x0146:
            A01(r0, r2, r4)
            android.content.Context r0 = r9.getContext()
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.privacy.checkup.PrivacyCheckupDetailActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "DETAIL_CATEGORY"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "ENTRY_POINT"
            goto L_0x0242
        L_0x0163:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A01
            java.lang.Integer r0 = X.C17880vN.A0l()
            r2.A27(r1, r0)
            r0 = 3
            r2.A26(r0, r1)
            android.content.Context r0 = X.AnonymousClass3MY.A04(r9)
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAddPrivacyActivity"
            goto L_0x01cb
        L_0x0183:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A01
            java.lang.Integer r0 = X.C17880vN.A0m()
            r2.A27(r1, r0)
            r0 = 10
            r2.A26(r0, r1)
            android.content.Context r0 = X.AnonymousClass3MY.A04(r9)
            java.lang.String r2 = "silence_unknown_caller"
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsCallingPrivacyActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "target_setting"
            r3.putExtra(r0, r2)
            goto L_0x0245
        L_0x01af:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A01
            r0 = 7
            A01(r2, r0, r1)
            r0 = 6
            r2.A26(r0, r1)
            android.content.Context r0 = r9.getContext()
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.blocklist.BlockList"
        L_0x01cb:
            r3.setClassName(r1, r0)
            goto L_0x0245
        L_0x01cf:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A01
            r0 = 8
            A01(r2, r0, r1)
            r0 = 1
            r2.A26(r0, r1)
            android.content.Context r2 = r9.getContext()
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoPrivacyActivity"
            goto L_0x0205
        L_0x01e9:
            r3 = 0
            X.C18070vi.A0d(r9, r3)
            java.lang.Object r2 = r8.A02
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = (com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment) r2
            int r1 = r8.A01
            r0 = 9
            A01(r2, r0, r1)
            r2.A26(r3, r1)
            android.content.Context r2 = r9.getContext()
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.lastseen.PresencePrivacyActivity"
        L_0x0205:
            android.content.Intent r3 = r1.setClassName(r2, r0)
            X.C18070vi.A0X(r3)
            goto L_0x0245
        L_0x020d:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r8, r9)
            int r4 = r8.A01
            r0 = 10
            A01(r1, r0, r4)
            r0 = 5
            r1.A26(r0, r4)
            X.00H r0 = r1.A02
            if (r0 == 0) goto L_0x0249
            java.lang.Object r0 = r0.get()
            X.6oZ r0 = (X.C133326oZ) r0
            android.content.Context r1 = X.AnonymousClass3MY.A04(r9)
            java.lang.String r2 = "read_receipts_enabled"
            X.00H r0 = r0.A00
            android.content.Intent r3 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacy"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "target_setting"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "entry_point"
        L_0x0242:
            r3.putExtra(r0, r4)
        L_0x0245:
            X.AnonymousClass3MY.A11(r3, r9)
            return
        L_0x0249:
            java.lang.String r0 = "activities"
        L_0x024b:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0250:
            java.lang.Object r1 = r8.A02
            X.3Oc r1 = (X.AnonymousClass3Oc) r1
            int r0 = r8.A01
            r1.A00 = r0
            r1.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48n.A04(android.view.View):void");
    }

    public static void A01(PrivacyCheckupBaseFragment privacyCheckupBaseFragment, int i, int i2) {
        privacyCheckupBaseFragment.A27(i2, Integer.valueOf(i));
    }
}
