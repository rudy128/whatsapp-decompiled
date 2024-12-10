package com.whatsapp.registration.accountdefence.ui;

import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass1LU;
import X.C010105w;
import X.C59242lz;
import X.C84474Jq;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;

public class DeviceConfirmationRegAlertDialogFragment extends Hilt_DeviceConfirmationRegAlertDialogFragment {
    public static C59242lz A08;
    public View A00;
    public Button A01;
    public Button A02;
    public C84474Jq A03;
    public AnonymousClass11S A04;
    public AnonymousClass11P A05;
    public AnonymousClass1LU A06;
    public AnonymousClass00H A07;

    public void A1u() {
        Dialog dialog;
        Dialog dialog2;
        super.A1u();
        if (this.A02 == null && (dialog2 = this.A03) != null) {
            this.A02 = ((C010105w) dialog2).A00.A0H;
        }
        if (this.A01 == null && (dialog = this.A03) != null) {
            this.A01 = ((C010105w) dialog).A00.A0F;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.A14()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131624127(0x7f0e00bf, float:1.8875425E38)
            r0 = 0
            r3 = 0
            android.view.View r1 = r2.inflate(r1, r0, r3)
            r6.A00 = r1
            r0 = 2131432808(0x7f0b1568, float:1.8487384E38)
            X.AnonymousClass3MY.A1A(r1, r0, r3)
            android.view.View r1 = r6.A00
            r0 = 2131432159(0x7f0b12df, float:1.8486068E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            r0 = 4
            r1.setVisibility(r0)
            android.view.View r1 = r6.A00
            r0 = 2131432807(0x7f0b1567, float:1.8487382E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r1, r0)
            r0 = 2131886323(0x7f1200f3, float:1.9407222E38)
            r1.setText(r0)
            android.view.View r1 = r6.A00
            r0 = 2131432804(0x7f0b1564, float:1.8487376E38)
            android.widget.TextView r5 = X.AnonymousClass3MW.A0J(r1, r0)
            X.11S r0 = r6.A04
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x00d1
            java.lang.String r4 = r0.jabber_id
            if (r4 == 0) goto L_0x00d1
            X.0vb r2 = r6.A01
            java.lang.String r1 = r0.cc
            int r0 = r1.length()
            java.lang.String r0 = r4.substring(r0)
            java.lang.String r0 = X.A9B.A0H(r1, r0)
            java.lang.String r1 = r2.A0G(r0)
            if (r1 == 0) goto L_0x00d1
            r0 = 2131886319(0x7f1200ef, float:1.9407213E38)
            java.lang.String r0 = X.AnonymousClass3MY.A0o(r6, r1, r3, r0)
        L_0x0068:
            r5.setText(r0)
            android.view.View r1 = r6.A00
            r0 = 2131432805(0x7f0b1565, float:1.8487378E38)
            android.widget.TextView r5 = X.AnonymousClass3MW.A0J(r1, r0)
            X.2lz r0 = A08
            long r1 = r0.A00
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            X.11P r4 = r6.A05
            X.0vb r2 = r6.A01
            long r0 = r0.getTime()
            long r0 = r4.A09(r0)
            java.lang.String r0 = X.C64052u8.A08(r2, r0)
            r5.setText(r0)
            android.view.View r1 = r6.A00
            r0 = 2131432806(0x7f0b1566, float:1.848738E38)
            android.widget.TextView r2 = X.AnonymousClass3MW.A0J(r1, r0)
            X.2lz r0 = A08
            java.lang.String r1 = r0.A01
            if (r1 != 0) goto L_0x00c9
            r0 = 2131886322(0x7f1200f2, float:1.940722E38)
            java.lang.String r0 = r6.A1H(r0)
        L_0x00a6:
            r2.setText(r0)
            X.3Rj r3 = X.AnonymousClass4a6.A04(r6)
            android.view.View r0 = r6.A00
            r3.A0c(r0)
            r1 = 2131886318(0x7f1200ee, float:1.9407211E38)
            r0 = 46
            X.AnonymousClass4bB.A00(r3, r6, r0, r1)
            r2 = 2131886317(0x7f1200ed, float:1.940721E38)
            r1 = 45
            X.4bB r0 = new X.4bB
            r0.<init>(r6, r1)
            X.05w r0 = X.AnonymousClass3MX.A0N(r0, r3, r2)
            return r0
        L_0x00c9:
            r0 = 2131886321(0x7f1200f1, float:1.9407218E38)
            java.lang.String r0 = X.AnonymousClass3MY.A0o(r6, r1, r3, r0)
            goto L_0x00a6
        L_0x00d1:
            r0 = 2131886320(0x7f1200f0, float:1.9407216E38)
            java.lang.String r0 = r6.A1H(r0)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }
}
