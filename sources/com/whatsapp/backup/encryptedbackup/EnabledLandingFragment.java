package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1NP;
import X.C18030ve;
import X.C18070vi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class EnabledLandingFragment extends Hilt_EnabledLandingFragment {
    public AnonymousClass1NP A00;
    public C18030ve A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625220, viewGroup, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r12, android.view.View r13) {
        /*
            r11 = this;
            r8 = 0
            X.C18070vi.A0d(r13, r8)
            super.A1z(r12)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r3 = X.C72483Me.A0R(r11)
            r0 = 2131430418(0x7f0b0c12, float:1.8482536E38)
            android.widget.TextView r2 = X.AnonymousClass3Ma.A0E(r13, r0)
            X.0z4 r1 = r3.A0I
            java.lang.String r0 = r1.A0f()
            if (r0 == 0) goto L_0x0031
            long r6 = r1.A0V(r0)
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
            r0 = 2131430419(0x7f0b0c13, float:1.8482538E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r13, r0)
            r0 = 2131889847(0x7f120eb7, float:1.941437E38)
            r1.setText(r0)
        L_0x0031:
            r0 = 2131430420(0x7f0b0c14, float:1.848254E38)
            android.widget.TextView r5 = X.AnonymousClass3Ma.A0E(r13, r0)
            X.0ve r4 = r11.A01
            if (r4 == 0) goto L_0x0118
            r1 = 9371(0x249b, float:1.3132E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            r10 = 1
            r4 = 3
            r7 = 64
            if (r0 == 0) goto L_0x008a
            r0 = 2131430421(0x7f0b0c15, float:1.8482542E38)
            android.widget.TextView r9 = X.AnonymousClass3Ma.A0E(r13, r0)
            X.1NP r0 = r11.A00
            if (r0 == 0) goto L_0x0115
            X.2Qv r0 = r0.A08()
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x007d
            r0 = 2
            if (r1 == r0) goto L_0x00a8
            if (r1 == r10) goto L_0x006d
            if (r1 != r8) goto L_0x00dd
            java.lang.String r0 = "This UI should not be launched when backup is unencrypted"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x006d:
            r0 = 2131889820(0x7f120e9c, float:1.9414314E38)
            r9.setText(r0)
            r0 = 2131889817(0x7f120e99, float:1.9414308E38)
            r5.setText(r0)
            r2.setVisibility(r8)
            goto L_0x00dd
        L_0x007d:
            r0 = 2131889819(0x7f120e9b, float:1.9414312E38)
            r9.setText(r0)
            r0 = 2131889816(0x7f120e98, float:1.9414306E38)
            r5.setText(r0)
            goto L_0x00dd
        L_0x008a:
            r2.setVisibility(r8)
            X.1NP r0 = r11.A00
            if (r0 == 0) goto L_0x0115
            X.2Qv r1 = r0.A08()
            X.2Qv r0 = X.C49532Qv.ENCRYPTION_KEY_ENCRYPTED
            if (r1 != r0) goto L_0x00dd
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r11)
            r0 = 2131755114(0x7f10006a, float:1.9141098E38)
            java.lang.String r0 = X.C72473Md.A0k(r1, r7, r0)
            r5.setText(r0)
            goto L_0x00cb
        L_0x00a8:
            android.content.res.Resources r4 = X.AnonymousClass3MZ.A09(r11)
            r1 = 2131755105(0x7f100061, float:1.914108E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r0[r8] = r6
            X.AnonymousClass3MX.A1E(r4, r9, r0, r1, r7)
            android.content.res.Resources r4 = X.AnonymousClass3MZ.A09(r11)
            r1 = 2131755104(0x7f100060, float:1.9141078E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r8] = r6
            X.AnonymousClass3MX.A1E(r4, r5, r0, r1, r7)
            r2.setVisibility(r8)
        L_0x00cb:
            r1 = 2131889814(0x7f120e96, float:1.9414302E38)
            android.content.Context r0 = r11.A14()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.CharSequence r0 = r0.getText(r1)
            r2.setText(r0)
        L_0x00dd:
            r0 = 9
            X.AnonymousClass3Ma.A1C(r2, r3, r0)
            r0 = 2131430416(0x7f0b0c10, float:1.8482532E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r13, r0)
            r0 = 10
            X.AnonymousClass3Ma.A1C(r1, r3, r0)
            boolean r0 = X.C22891Dp.A02
            if (r0 == 0) goto L_0x010f
            r0 = 2131430417(0x7f0b0c11, float:1.8482534E38)
            android.widget.ImageView r2 = X.AnonymousClass3MW.A0G(r13, r0)
            android.content.Context r1 = r11.A14()
            X.3i4 r0 = X.C75683i4.A00
            X.1rd r0 = X.C83534Fm.A00(r1, r0)
            r2.setImageDrawable(r0)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L_0x0110
            X.AnonymousClass3MZ.A1F(r2, r0)
        L_0x010f:
            return
        L_0x0110:
            java.lang.NullPointerException r0 = X.AnonymousClass3MY.A0k()
            throw r0
        L_0x0115:
            java.lang.String r0 = "backupSharedPreferences"
            goto L_0x011a
        L_0x0118:
            java.lang.String r0 = "abProps"
        L_0x011a:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.EnabledLandingFragment.A21(android.os.Bundle, android.view.View):void");
    }
}
