package com.whatsapp.backup.encryptedbackup;

import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C192679on;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class EnableInfoFragment extends Hilt_EnableInfoFragment {
    public EncBackupViewModel A00;
    public C18000vb A01;
    public C18030ve A02;
    public C192679on A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625217, viewGroup, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r12, android.view.View r13) {
        /*
            r11 = this;
            r7 = 0
            X.C18070vi.A0d(r13, r7)
            super.A1z(r12)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = X.C72483Me.A0R(r11)
            X.C18070vi.A0d(r0, r7)
            r11.A00 = r0
            r0 = 2131430406(0x7f0b0c06, float:1.8482512E38)
            android.widget.TextView r8 = X.AnonymousClass3Ma.A0E(r13, r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r11.A00
            if (r0 == 0) goto L_0x01b5
            X.0z4 r1 = r0.A0I
            java.lang.String r0 = r1.A0f()
            if (r0 == 0) goto L_0x01ae
            long r3 = r1.A0V(r0)
        L_0x0027:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r11.A00
            if (r0 == 0) goto L_0x01b5
            X.0z4 r5 = r0.A0I
            java.lang.String r9 = r5.A0f()
            if (r9 == 0) goto L_0x01aa
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = -1
            if (r0 != 0) goto L_0x004d
            android.content.SharedPreferences r6 = X.C17890vO.A0B(r5)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "gdrive_last_successful_backup_media_size:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r9, r5)
            long r1 = r6.getLong(r0, r1)
        L_0x004d:
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0059
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
        L_0x0059:
            r0 = 2131430407(0x7f0b0c07, float:1.8482514E38)
            android.widget.TextView r5 = X.AnonymousClass3MW.A0J(r13, r0)
            r0 = 2131889805(0x7f120e8d, float:1.9414284E38)
            r5.setText(r0)
        L_0x0066:
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0098
            r8.setVisibility(r7)
            android.content.Context r9 = r11.A14()
            r6 = 2131889798(0x7f120e86, float:1.941427E38)
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1b()
            X.0vb r0 = r11.A01
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = X.C88584aA.A03(r0, r3)
            r5[r7] = r0
            X.0vb r0 = r11.A01
            if (r0 == 0) goto L_0x01b2
            java.lang.String r1 = X.C88584aA.A03(r0, r1)
            r0 = 1
            r5[r0] = r1
            android.text.Spanned r0 = X.AnonymousClass1EG.A01(r9, r5, r6)
            r8.setText(r0)
        L_0x0098:
            r0 = 2131430411(0x7f0b0c0b, float:1.8482522E38)
            android.widget.TextView r5 = X.AnonymousClass3Ma.A0E(r13, r0)
            X.9on r3 = r11.A03
            if (r3 == 0) goto L_0x01b8
            X.0ve r2 = r3.A02
            r1 = 9371(0x249b, float:1.3132E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01a1
            X.00H r0 = r3.A03
            java.lang.Object r1 = r0.get()
            X.9u8 r1 = (X.C195909u8) r1
            java.lang.Boolean r0 = X.C17970vW.A03
            r6 = 1
            long r3 = r1.A00()
            r1 = 241217000(0xe60ade8, double:1.19177033E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c6
            r6 = 0
        L_0x00c6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyGooglePlayChecks / gmsVersionIsNewEnoughForPrf : "
            X.C17900vP.A0n(r0, r1, r6)
            if (r6 == 0) goto L_0x01a1
            r0 = 2131889809(0x7f120e91, float:1.9414292E38)
            r5.setText(r0)
            r0 = 28
            X.AnonymousClass3MZ.A1J(r5, r11, r0)
            r0 = 2131430409(0x7f0b0c09, float:1.8482518E38)
            android.view.View r5 = X.C18070vi.A05(r13, r0)
            r5.setVisibility(r7)
            r0 = 29
            X.78J r1 = new X.78J
            r1.<init>(r11, r0)
        L_0x00ed:
            r5.setOnClickListener(r1)
            boolean r0 = X.C22891Dp.A02
            android.content.Context r1 = r11.A14()
            if (r0 == 0) goto L_0x0198
            X.3i4 r0 = X.C75683i4.A00
            X.1rd r1 = X.C83534Fm.A00(r1, r0)
        L_0x00fe:
            r0 = 2131430408(0x7f0b0c08, float:1.8482516E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0G(r13, r0)
            r0.setImageDrawable(r1)
            r0 = 2131430410(0x7f0b0c0a, float:1.848252E38)
            android.widget.TextView r2 = X.AnonymousClass3Ma.A0E(r13, r0)
            r0 = 2131889759(0x7f120e5f, float:1.941419E38)
            r2.setText(r0)
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r11)
            r0 = 2131166648(0x7f0705b8, float:1.7947547E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setPadding(r7, r7, r7, r0)
            android.view.View r1 = r11.A17()
            r0 = 2131430407(0x7f0b0c07, float:1.8482514E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            r4 = 8
            r0.setVisibility(r4)
            android.view.View r2 = r11.A17()
            r0 = 2131430415(0x7f0b0c0f, float:1.848253E38)
            r1 = 2131430415(0x7f0b0c0f, float:1.848253E38)
            android.view.View r3 = X.C18070vi.A05(r2, r0)
            r3.setVisibility(r7)
            r0 = 2131430440(0x7f0b0c28, float:1.8482581E38)
            X.AnonymousClass3MY.A1B(r3, r0, r4)
            r0 = 2131430442(0x7f0b0c2a, float:1.8482585E38)
            X.AnonymousClass3MY.A1B(r3, r0, r4)
            r0 = 2131430441(0x7f0b0c29, float:1.8482583E38)
            X.AnonymousClass3MY.A1B(r3, r0, r4)
            android.view.View r0 = r11.A17()
            android.view.View r2 = X.C18070vi.A05(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            X.Cw9 r1 = new X.Cw9
            r1.<init>()
            r1.A0C(r2)
            r0 = 2131430443(0x7f0b0c2b, float:1.8482587E38)
            r1.A07(r0)
            r0 = 2131430445(0x7f0b0c2d, float:1.8482591E38)
            r1.A07(r0)
            r0 = 2131430444(0x7f0b0c2c, float:1.848259E38)
            r1.A07(r0)
            r1.A0A(r2)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r3.setLayoutParams(r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r11.A00
            if (r0 == 0) goto L_0x01b5
            X.1DT r3 = r0.A0B
            X.1q9 r2 = r11.A1G()
            X.5QW r1 = new X.5QW
            r1.<init>(r11)
            r0 = 3
            X.AnonymousClass3MY.A1K(r2, r3, r1, r0)
            return
        L_0x0198:
            r0 = 2131232475(0x7f0806db, float:1.808106E38)
            android.graphics.drawable.Drawable r1 = X.C24261Jm.A00(r1, r0)
            goto L_0x00fe
        L_0x01a1:
            r0 = 8
            X.9Aa r1 = new X.9Aa
            r1.<init>(r11, r0)
            goto L_0x00ed
        L_0x01aa:
            r1 = 0
            goto L_0x004d
        L_0x01ae:
            r3 = 0
            goto L_0x0027
        L_0x01b2:
            java.lang.String r0 = "whatsAppLocale"
            goto L_0x01ba
        L_0x01b5:
            java.lang.String r0 = "viewModel"
            goto L_0x01ba
        L_0x01b8:
            java.lang.String r0 = "passkeyEligibility"
        L_0x01ba:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.EnableInfoFragment.A21(android.os.Bundle, android.view.View):void");
    }
}
