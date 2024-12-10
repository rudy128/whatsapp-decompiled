package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00H;
import X.AnonymousClass129;
import X.AnonymousClass18K;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.C81453zG;
import android.content.DialogInterface;

public class BusinessTransitionInfoDialogFragment extends Hilt_BusinessTransitionInfoDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1M9 A01;
    public AnonymousClass1MZ A02;
    public AnonymousClass1KW A03;
    public AnonymousClass18K A04;
    public C81453zG A05;
    public AnonymousClass129 A06;
    public AnonymousClass00H A07;

    public void onCancel(DialogInterface dialogInterface) {
        C81453zG r1 = this.A05;
        if (r1 != null) {
            r1.A01 = 0;
            this.A04.CC7(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r4 == 5) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r4 == 4) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r10) {
        /*
            r9 = this;
            android.os.Bundle r3 = r9.A15()
            java.lang.String r0 = "jid"
            X.1BI r2 = X.C72463Mc.A0f(r3, r0)
            java.lang.String r0 = "message"
            java.lang.String r7 = r3.getString(r0)
            java.lang.String r0 = "transitionId"
            int r4 = r3.getInt(r0)
            java.lang.String r1 = "systemAction"
            r0 = -1
            int r1 = r3.getInt(r1, r0)
            r0 = 69
            if (r1 != r0) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            X.3zG r3 = new X.3zG
            r3.<init>()
            r9.A05 = r3
            boolean r0 = r2 instanceof X.AnonymousClass1E9
            if (r0 == 0) goto L_0x00e7
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 == 0) goto L_0x00e7
            X.1MZ r0 = r9.A02
            X.C72483Me.A0z(r0, r3, r2)
            r1 = 2
        L_0x003a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A00 = r0
        L_0x0040:
            X.3zG r3 = r9.A05
            r0 = 2
            if (r4 == r0) goto L_0x0050
            r0 = 3
            r1 = 1
            if (r4 == r0) goto L_0x0051
            r0 = 4
            if (r4 == r0) goto L_0x0050
            r0 = 5
            r1 = 0
            if (r4 != r0) goto L_0x0051
        L_0x0050:
            r1 = 2
        L_0x0051:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A03 = r0
        L_0x0057:
            X.3Rj r3 = X.AnonymousClass4a6.A03(r9)
            r0 = 5
            if (r4 == r0) goto L_0x0062
            r1 = 4
            r0 = 0
            if (r4 != r1) goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            r5 = 1
            if (r0 == 0) goto L_0x00d9
            android.content.Context r0 = r9.A14()
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            com.whatsapp.jid.UserJid r8 = X.C22941Dw.A00(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00d7
            if (r8 == 0) goto L_0x00d7
            java.util.HashMap r2 = X.C17880vN.A11()
            r0 = 0
            X.3Ne r1 = new X.3Ne
            r1.<init>(r9, r8, r0)
            java.lang.String r0 = "coex-verify-encryption"
            r2.put(r0, r1)
            android.text.SpannableStringBuilder r2 = X.C26302CxJ.A03(r7, r2)
        L_0x008e:
            android.content.Context r1 = r9.A14()
            X.1KW r0 = r9.A03
            java.lang.CharSequence r0 = X.C43251zV.A05(r1, r0, r2)
            r6.setText(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r6.setMovementMethod(r0)
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r9)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            r0 = 1103101952(0x41c00000, float:24.0)
            float r0 = android.util.TypedValue.applyDimension(r5, r0, r1)
            int r0 = (int) r0
            r6.setPadding(r0, r0, r0, r0)
            r0 = 5
            r6.setTextAlignment(r0)
            r3.setView(r6)
        L_0x00bb:
            r3.A0T(r5)
            r0 = 2
            X.4at r1 = new X.4at
            r1.<init>(r9, r4, r0)
            r0 = 2131899101(0x7f1232dd, float:1.9433138E38)
            r3.A0Y(r1, r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 17
            X.AnonymousClass4bA.A00(r3, r9, r0, r1)
            X.05w r0 = r3.create()
            return r0
        L_0x00d7:
            r2 = 0
            goto L_0x008e
        L_0x00d9:
            android.content.Context r1 = r9.A14()
            X.1KW r0 = r9.A03
            java.lang.CharSequence r0 = X.C43251zV.A05(r1, r0, r7)
            r3.A0S(r0)
            goto L_0x00bb
        L_0x00e7:
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 == 0) goto L_0x0040
            X.1M9 r0 = r9.A01
            boolean r0 = r0.A0z(r2)
            r1 = 1
            if (r0 == 0) goto L_0x003a
            r1 = 0
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }
}
