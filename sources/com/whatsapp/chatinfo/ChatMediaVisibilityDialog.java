package com.whatsapp.chatinfo;

import X.AnonymousClass1BI;
import X.AnonymousClass1FL;
import X.AnonymousClass1Nb;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.C22851Dl;
import X.C73203Rj;
import X.C84784Kv;
import X.C91574fu;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class ChatMediaVisibilityDialog extends Hilt_ChatMediaVisibilityDialog {
    public int A00;
    public int A01;
    public C84784Kv A02;
    public AnonymousClass1BI A03;
    public AnonymousClass1Nb A04;
    public boolean A05;

    public Dialog A27(Bundle bundle) {
        CharSequence[] charSequenceArr = new CharSequence[3];
        int i = 2131889239;
        if (this.A05) {
            i = 2131889240;
        }
        int i2 = 0;
        charSequenceArr[0] = A1H(i);
        charSequenceArr[1] = A1H(2131898593);
        charSequenceArr[2] = A1H(2131892908);
        int i3 = this.A00;
        if (i3 == 1) {
            i2 = 2;
        } else if (i3 == 2) {
            i2 = 1;
        }
        AnonymousClass1FL A1D = A1D();
        TextView textView = (TextView) A1D.getLayoutInflater().inflate(2131625044, (ViewGroup) null);
        textView.setText(2131888191);
        C73203Rj A002 = AnonymousClass4a6.A00(A1D);
        A002.A0R(textView);
        A002.A00.A0N(new AnonymousClass4aq(this, 34), charSequenceArr, i2);
        A002.A0g(this, new C91574fu(this, 22), 2131899286);
        A002.A0e(this, (C22851Dl) null, 2131898766);
        return A002.create();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r2 == 2) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1z(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A1z(r4)
            android.os.Bundle r1 = r3.A15()
            java.lang.String r0 = "chatJid"
            X.1BI r2 = X.C72463Mc.A0f(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Chat jid must be passed to "
            r1.append(r0)
            java.lang.String r0 = "ChatMediaVisibilityDialog"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.C17960vV.A08(r2, r0)
            r3.A03 = r2
            X.1Nb r0 = r3.A04
            X.1yM r0 = r0.A0W()
            int r2 = r0.A01
            if (r2 == 0) goto L_0x002f
            r0 = 2
            r1 = 0
            if (r2 != r0) goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            r3.A05 = r1
            X.1Nb r1 = r3.A04
            X.1BI r0 = r3.A03
            X.1yM r0 = r1.A0a(r0)
            int r0 = r0.A01
            r3.A00 = r0
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ChatMediaVisibilityDialog.A1z(android.os.Bundle):void");
    }
}
