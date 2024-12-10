package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass1BI;
import X.AnonymousClass3MY;
import X.AnonymousClass97f;
import X.C1771897p;
import X.C17880vN;
import X.C17960vV;
import X.C436420i;
import X.C58522kp;
import android.os.Bundle;

public class DeviceUpdateDialogFragment extends Hilt_DeviceUpdateDialogFragment {
    public C58522kp A00;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
        if (r4 != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014e, code lost:
        if (r6 != 0) goto L_0x0150;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r15) {
        /*
            r14 = this;
            r10 = r14
            android.os.Bundle r1 = r14.A15()
            java.lang.String r0 = "chat_jid"
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r0 = "participant_jid"
            java.lang.String r12 = r1.getString(r0)
            java.lang.String r0 = "device_added_count"
            int r6 = r1.getInt(r0)
            java.lang.String r0 = "device_removed_count"
            int r7 = r1.getInt(r0)
            java.lang.String r0 = "device_update_failure"
            boolean r4 = r1.getBoolean(r0)
            if (r6 > 0) goto L_0x002a
            if (r7 > 0) goto L_0x002a
            r0 = 0
            if (r4 == 0) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            X.C17960vV.A0C(r0)
            X.1Dv r2 = X.AnonymousClass1BI.A00
            X.1BI r9 = r2.A02(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DeviceChangeDialogFragment/onCreateDialog/invalid chat jid="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            X.C17960vV.A08(r9, r0)
            X.1BI r11 = r2.A02(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DeviceChangeDialogFragment/onCreateDialog/invalid remote resource jid="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r12, r1)
            X.C17960vV.A08(r11, r0)
            X.1M9 r0 = r14.A02
            X.1E7 r3 = r0.A0H(r9)
            X.1M9 r0 = r14.A02
            X.1E7 r5 = r0.A0H(r11)
            X.11S r0 = r14.A01
            boolean r0 = X.AnonymousClass3Ma.A1V(r0, r5)
            if (r0 == 0) goto L_0x0155
            boolean r0 = r3.A0F()
            if (r0 != 0) goto L_0x0086
            X.1BI r0 = r3.A0J
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 != 0) goto L_0x0086
            com.whatsapp.jid.Jid r8 = X.AnonymousClass1E7.A01(r3)
        L_0x0078:
            if (r8 == 0) goto L_0x0086
            X.10I r2 = r14.A07
            r1 = 43
            X.4rl r0 = new X.4rl
            r0.<init>(r14, r8, r1)
            r2.CGF(r0)
        L_0x0086:
            android.content.Context r0 = r14.A1n()
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r0)
            if (r4 == 0) goto L_0x00da
            r0 = 2131897369(0x7f122c19, float:1.9429626E38)
        L_0x0094:
            java.lang.CharSequence r0 = r14.A2H(r5, r0)
        L_0x0098:
            android.app.AlertDialog$Builder r2 = r2.setMessage(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 0
            android.app.AlertDialog$Builder r5 = r2.setNegativeButton(r1, r0)
            r2 = 2131899101(0x7f1232dd, float:1.9433138E38)
            r1 = 2
            X.A9T r0 = new X.A9T
            r0.<init>(r1, r14, r4)
            android.app.AlertDialog$Builder r1 = r5.setNeutralButton(r2, r0)
            X.11S r0 = r14.A01
            boolean r0 = r0.A0O(r11)
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r3.A0F()
            if (r0 != 0) goto L_0x00c7
            X.1BI r0 = r3.A0J
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 == 0) goto L_0x00cc
        L_0x00c7:
            android.app.AlertDialog r0 = r1.create()
            return r0
        L_0x00cc:
            r0 = 2131897761(0x7f122da1, float:1.943042E38)
            r13 = 0
            X.A9d r8 = new X.A9d
            r8.<init>(r9, r10, r11, r12, r13)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r0, r8)
            goto L_0x00c7
        L_0x00da:
            X.11S r0 = r14.A01
            boolean r1 = X.AnonymousClass3Ma.A1V(r0, r5)
            r0 = 1
            if (r1 == 0) goto L_0x0140
            if (r6 != r0) goto L_0x0104
            if (r7 != 0) goto L_0x0104
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x00f5
            r0 = 2131895645(0x7f12255d, float:1.9426129E38)
        L_0x00f0:
            java.lang.String r0 = r14.A1H(r0)
            goto L_0x0098
        L_0x00f5:
            X.1BI r0 = r3.A0J
            boolean r0 = X.C22971Dz.A0N(r0)
            r1 = 2131895644(0x7f12255c, float:1.9426127E38)
            if (r0 == 0) goto L_0x013a
            r0 = 2131895646(0x7f12255e, float:1.942613E38)
            goto L_0x00f0
        L_0x0104:
            if (r7 != r0) goto L_0x0121
            if (r6 != 0) goto L_0x0121
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0112
            r0 = 2131895648(0x7f122560, float:1.9426135E38)
            goto L_0x00f0
        L_0x0112:
            X.1BI r0 = r3.A0J
            boolean r0 = X.C22971Dz.A0N(r0)
            r1 = 2131895647(0x7f12255f, float:1.9426133E38)
            if (r0 == 0) goto L_0x013a
            r0 = 2131895649(0x7f122561, float:1.9426137E38)
            goto L_0x00f0
        L_0x0121:
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x012b
            r0 = 2131895651(0x7f122563, float:1.9426141E38)
            goto L_0x00f0
        L_0x012b:
            X.1BI r0 = r3.A0J
            boolean r0 = X.C22971Dz.A0N(r0)
            r1 = 2131895650(0x7f122562, float:1.942614E38)
            if (r0 == 0) goto L_0x013a
            r0 = 2131895652(0x7f122564, float:1.9426143E38)
            goto L_0x00f0
        L_0x013a:
            java.lang.CharSequence r0 = r14.A2H(r3, r1)
            goto L_0x0098
        L_0x0140:
            if (r6 != r0) goto L_0x0149
            if (r7 != 0) goto L_0x0149
            r0 = 2131893418(0x7f121caa, float:1.9421612E38)
            goto L_0x0094
        L_0x0149:
            if (r7 != r0) goto L_0x0150
            r0 = 2131893419(0x7f121cab, float:1.9421614E38)
            if (r6 == 0) goto L_0x0094
        L_0x0150:
            r0 = 2131893420(0x7f121cac, float:1.9421616E38)
            goto L_0x0094
        L_0x0155:
            com.whatsapp.jid.Jid r8 = X.AnonymousClass1E7.A01(r5)
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.conversation.conversationrow.Hilt_DeviceUpdateDialogFragment] */
    public static DeviceUpdateDialogFragment A00(C436420i r5) {
        ? hilt_DeviceUpdateDialogFragment = new Hilt_DeviceUpdateDialogFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass1BI r2 = r5.A0v.A00;
        C17960vV.A07(r2);
        A0D.putString("chat_jid", r2.getRawString());
        C17960vV.A07(r2);
        AnonymousClass1BI A0H = r5.A0H();
        if (A0H != null) {
            r2 = A0H;
        }
        AnonymousClass3MY.A15(A0D, r2, "participant_jid");
        if (r5 instanceof C1771897p) {
            C1771897p r52 = (C1771897p) r5;
            A0D.putInt("device_added_count", r52.A00);
            A0D.putInt("device_removed_count", r52.A01);
        } else {
            C17960vV.A0C(r5 instanceof AnonymousClass97f);
            A0D.putBoolean("device_update_failure", true);
        }
        hilt_DeviceUpdateDialogFragment.A1R(A0D);
        return hilt_DeviceUpdateDialogFragment;
    }
}
