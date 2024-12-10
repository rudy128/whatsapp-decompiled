package com.whatsapp.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.C108255bO;
import android.content.Context;

public class PromptDialogFragment extends Hilt_PromptDialogFragment {
    public AnonymousClass11C A00;
    public C108255bO A01;

    public void A1x(Context context) {
        super.A1x(context);
        try {
            this.A01 = (C108255bO) context;
        } catch (ClassCastException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(context.toString());
            throw new ClassCastException(AnonymousClass000.A0y(" must implement PromptDialogClickListener", A10));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (r3.getBoolean("cancelable") != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r7) {
        /*
            r6 = this;
            android.os.Bundle r3 = r6.A15()
            java.lang.String r1 = "dialog_id"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00a6
            int r5 = r3.getInt(r1)
            X.3Rj r4 = X.AnonymousClass4a6.A02(r6)
            java.lang.String r1 = "title"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r3.getString(r1)
            r4.setTitle(r0)
        L_0x0023:
            java.lang.String r1 = "message"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0032
            java.lang.CharSequence r0 = r3.getCharSequence(r1)
            r4.A0S(r0)
        L_0x0032:
            java.lang.String r1 = "neutral_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0047
            java.lang.String r2 = r3.getString(r1)
            r1 = 5
            X.4at r0 = new X.4at
            r0.<init>(r6, r5, r1)
            r4.A0K(r0, r2)
        L_0x0047:
            java.lang.String r1 = "positive_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x005c
            java.lang.String r2 = r3.getString(r1)
            r1 = 6
            X.4at r0 = new X.4at
            r0.<init>(r6, r5, r1)
            r4.A0L(r0, r2)
        L_0x005c:
            java.lang.String r1 = "negative_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0071
            java.lang.String r2 = r3.getString(r1)
            r1 = 7
            X.4at r0 = new X.4at
            r0.<init>(r6, r5, r1)
            r4.A0J(r0, r2)
        L_0x0071:
            java.lang.String r1 = "cancelable"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0080
            boolean r1 = r3.getBoolean(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0081
        L_0x0080:
            r0 = 1
        L_0x0081:
            r4.A0T(r0)
            r6.A2D(r0)
            X.05w r2 = r4.create()
            r2.setCanceledOnTouchOutside(r0)
            java.lang.String r1 = "is_message_clickable"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r3.getBoolean(r1)
            if (r0 == 0) goto L_0x00a5
            r1 = 1
            X.AA0 r0 = new X.AA0
            r0.<init>(r6, r2, r1)
            r2.setOnShowListener(r0)
        L_0x00a5:
            return r2
        L_0x00a6:
            java.lang.String r0 = "dialog_id should be provided."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dialogs.PromptDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }
}
