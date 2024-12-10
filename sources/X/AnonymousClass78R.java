package X;

import android.view.View;

/* renamed from: X.78R  reason: invalid class name */
public class AnonymousClass78R implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AnonymousClass78R(C55872gV r2, C1606089d r3) {
        this.A00 = 11;
        this.A01 = r2;
        this.A03 = "status_fragment";
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        X.C17960vV.A0F(false, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e8, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ec, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0215, code lost:
        r1.A2C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0218, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0219;
                case 1: goto L_0x01d8;
                case 2: goto L_0x01cd;
                case 3: goto L_0x01bf;
                case 4: goto L_0x01b1;
                case 5: goto L_0x016f;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00ae;
                case 8: goto L_0x009c;
                case 9: goto L_0x0088;
                case 10: goto L_0x004e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r13.A01
            X.2gV r7 = (X.C55872gV) r7
            java.lang.String r11 = "status_fragment"
            java.lang.Object r9 = r13.A02
            X.89d r9 = (X.C1606089d) r9
            r0 = 2
            X.C18070vi.A0d(r9, r0)
            X.00H r0 = r7.A06
            X.1dR r1 = X.C108945cZ.A13(r0)
            java.lang.String r0 = "TAP_F_ICON"
            r1.A04(r0)
            X.00H r6 = r7.A04
            java.util.ArrayList r0 = X.AnonymousClass7FM.A00(r6)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = "CrosspostContextualShareViewController/fbIconOnClickListener recent statuses empty"
        L_0x002c:
            r0 = 0
            X.C17960vV.A0F(r0, r1)
            return
        L_0x0031:
            java.util.ArrayList r0 = X.AnonymousClass7FM.A00(r6)
            java.util.Iterator r5 = r0.iterator()
        L_0x0039:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0070
            X.206 r0 = X.C17880vN.A0Y(r5)
            long r1 = r0.A0H
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0039
            java.lang.String r1 = "CrosspostContextualShareViewController/fbIconOnClickListener some sent messages are not delivered"
            goto L_0x002c
        L_0x004e:
            java.lang.Object r1 = r13.A01
            X.6yQ r1 = (X.C139216yQ) r1
            java.lang.Object r2 = r13.A02
            X.6Re r2 = (X.C122646Re) r2
            java.lang.String r3 = "status_fragment"
            X.00H r0 = r1.A03
            java.util.ArrayList r4 = X.AnonymousClass7FM.A00(r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = "CrosspostShareViewController/generateWaffleAppIconOnClickListener recent statuses empty"
            goto L_0x002c
        L_0x0067:
            boolean r0 = X.C1402870s.A02(r4)
            if (r0 != 0) goto L_0x0227
            java.lang.String r1 = "CrosspostShareViewController/generateWaffleAppIconOnClickListener some sent messages are not delivered"
            goto L_0x002c
        L_0x0070:
            X.00H r0 = r7.A03
            java.lang.Object r7 = r0.get()
            X.6yI r7 = (X.C139146yI) r7
            android.content.Context r8 = X.AnonymousClass3MY.A04(r14)
            java.util.ArrayList r12 = X.AnonymousClass7FM.A00(r6)
            java.lang.Integer r10 = X.C17880vN.A0j()
            r7.A00(r8, r9, r10, r11, r12)
            return
        L_0x0088:
            java.lang.Object r1 = r13.A01
            X.5ks r1 = (X.C112065ks) r1
            java.lang.Object r0 = r13.A02
            X.6fa r0 = (X.C128186fa) r0
            java.lang.String r3 = r13.A03
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r2 = r1.A02
            X.700 r1 = r2.A06
            X.1E2 r0 = r0.A00
            r1.A02(r2, r0, r3)
            return
        L_0x009c:
            java.lang.Object r0 = r13.A01
            X.5ks r0 = (X.C112065ks) r0
            java.lang.Object r3 = r13.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.String r2 = r13.A03
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r1 = r0.A02
            X.700 r0 = r1.A06
            r0.A02(r1, r3, r2)
            return
        L_0x00ae:
            java.lang.Object r4 = r13.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r4
            java.lang.Object r1 = r13.A02
            X.206 r1 = (X.AnonymousClass206) r1
            java.lang.String r3 = r13.A03
            X.1hg r0 = r4.A0R
            if (r0 == 0) goto L_0x00d9
            java.lang.String r2 = X.C108955ca.A0w(r1)
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
            java.util.Map r0 = r0.A0Q
            r0.put(r2, r1)
            X.1nl r1 = r4.A02
            if (r1 == 0) goto L_0x00d5
            android.content.Context r0 = r4.A14()
            X.C72453Mb.A18(r0, r1, r3)
            return
        L_0x00d5:
            java.lang.String r0 = "linkLauncher"
            goto L_0x01e8
        L_0x00d9:
            java.lang.String r0 = "statusesStatsManager"
            goto L_0x01e8
        L_0x00dd:
            java.lang.Object r7 = r13.A01
            com.whatsapp.payments.ui.BusinessHubActivity r7 = (com.whatsapp.payments.ui.BusinessHubActivity) r7
            java.lang.String r9 = r13.A03
            java.lang.Object r8 = r13.A02
            X.8pD r8 = (X.AnonymousClass8pD) r8
            r4 = 0
            r3 = 1
            X.0vl r2 = r7.A0E
            java.lang.Object r1 = r2.getValue()
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r1 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r1
            r6 = 0
            r0 = 108(0x6c, float:1.51E-43)
            r1.A0T(r0)
            r1 = 2131895131(0x7f12235b, float:1.9425086E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r5 = X.AnonymousClass3Ma.A10(r7, r9, r0, r4, r1)
            java.lang.String r1 = r8.A00()
            java.lang.String r0 = "EXTERNALLY_DISABLED"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0158
            r0 = 2131895140(0x7f122364, float:1.9425105E38)
            java.lang.String r9 = r7.getString(r0)
        L_0x0113:
            X.C18070vi.A0b(r9)
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r0 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r0
            X.1QS r0 = r0.A01
            X.BD1 r0 = r0.A06()
            int r4 = r0.BQc()
            r0 = 2131895092(0x7f122334, float:1.9425007E38)
            java.lang.String r3 = r7.getString(r0)
            r0 = 19
            X.A9p r2 = new X.A9p
            r2.<init>(r8, r7, r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            java.lang.String r1 = r7.getString(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r7, r4)
            r0.setMessage(r9)
            r0.setTitle(r5)
            if (r3 == 0) goto L_0x014b
            r0.setPositiveButton(r3, r2)
        L_0x014b:
            if (r1 == 0) goto L_0x0150
            r0.setNegativeButton(r1, r6)
        L_0x0150:
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            return
        L_0x0158:
            java.lang.String r1 = r8.A00()
            java.lang.String r0 = "INITED"
            boolean r1 = X.C18070vi.A18(r1, r0)
            r0 = 2131895130(0x7f12235a, float:1.9425084E38)
            if (r1 == 0) goto L_0x016a
            r0 = 2131895132(0x7f12235c, float:1.9425088E38)
        L_0x016a:
            java.lang.String r9 = X.C17890vO.A0R(r7, r9, r3, r4, r0)
            goto L_0x0113
        L_0x016f:
            java.lang.Object r5 = r13.A01
            com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet r5 = (com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet) r5
            java.lang.Object r2 = r13.A02
            X.77P r2 = (X.AnonymousClass77P) r2
            java.lang.String r4 = r13.A03
            X.11C r0 = r5.A00
            if (r0 == 0) goto L_0x01ae
            android.content.ClipboardManager r1 = r0.A09()
            if (r1 == 0) goto L_0x018c
            java.lang.String r0 = r2.A00
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)
            r1.setPrimaryClip(r0)
        L_0x018c:
            X.1FL r1 = r5.A1B()
            r0 = 2131894618(0x7f12215a, float:1.9424046E38)
            r3 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)
            r0.show()
            X.BD4 r2 = r5.A02
            if (r2 == 0) goto L_0x01ab
            r0 = 186(0xba, float:2.6E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "pix_qr_code_found_prompt"
            r2.BiL(r1, r0, r4, r3)
            return
        L_0x01ab:
            java.lang.String r0 = "paymentUIEventLogger"
            goto L_0x01e8
        L_0x01ae:
            java.lang.String r0 = "systemServices"
            goto L_0x01e8
        L_0x01b1:
            java.lang.Object r2 = r13.A01
            X.3R7 r2 = (X.AnonymousClass3R7) r2
            java.lang.String r1 = r13.A03
            java.lang.Object r0 = r13.A02
            X.23z r0 = (X.C445823z) r0
            X.AnonymousClass3R7.setUpCallLink$lambda$6$lambda$4(r2, r1, r0, r14)
            return
        L_0x01bf:
            java.lang.Object r2 = r13.A01
            com.whatsapp.WaTextView r2 = (com.whatsapp.WaTextView) r2
            java.lang.String r1 = r13.A03
            java.lang.Object r0 = r13.A02
            X.3R7 r0 = (X.AnonymousClass3R7) r0
            X.AnonymousClass3R7.setUpLocation$lambda$3$lambda$2$lambda$1(r2, r1, r0, r14)
            return
        L_0x01cd:
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            java.lang.Object r0 = r13.A02
            X.1GP r0 = (X.AnonymousClass1GP) r0
            java.lang.String r2 = r13.A03
            goto L_0x0215
        L_0x01d8:
            java.lang.Object r6 = r13.A01
            com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity r6 = (com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity) r6
            java.lang.String r5 = r13.A03
            java.lang.Object r0 = r13.A02
            X.4Zh r0 = (X.C88344Zh) r0
            com.whatsapp.jid.DeviceJid r4 = r6.A05
            if (r4 != 0) goto L_0x01ed
            java.lang.String r0 = "deviceJid"
        L_0x01e8:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01ed:
            java.lang.String r3 = X.C88344Zh.A00(r6, r0)
            X.C18070vi.A0X(r3)
            com.whatsapp.companiondevice.SetDeviceNicknameFragment r1 = new com.whatsapp.companiondevice.SetDeviceNicknameFragment
            r1.<init>()
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "device_jid_raw_string"
            X.AnonymousClass3MY.A15(r2, r4, r0)
            java.lang.String r0 = "existing_display_name"
            r2.putString(r0, r5)
            java.lang.String r0 = "device_string"
            r2.putString(r0, r3)
            r1.A1R(r2)
            X.1GP r0 = r6.getSupportFragmentManager()
            java.lang.String r2 = "LinkedDeviceEditDeviceActivity"
        L_0x0215:
            r1.A2C(r0, r2)
            return
        L_0x0219:
            java.lang.Object r2 = r13.A01
            com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity r2 = (com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity) r2
            java.lang.String r1 = r13.A03
            java.lang.Object r0 = r13.A02
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity.A0V(r0, r2, r1)
            return
        L_0x0227:
            X.00H r0 = r1.A02
            java.lang.Object r0 = r0.get()
            X.1x5 r0 = (X.C41801x5) r0
            android.content.Context r1 = X.AnonymousClass3MY.A04(r14)
            r5 = 3
            r0.A03(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78R.onClick(android.view.View):void");
    }

    public AnonymousClass78R(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public AnonymousClass78R(C122646Re r2, C139216yQ r3) {
        this.A00 = 10;
        this.A01 = r3;
        this.A02 = r2;
        this.A03 = "status_fragment";
    }
}
