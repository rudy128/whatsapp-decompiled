package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass11C;
import X.AnonymousClass3MX;
import X.C36401np;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealUnbannedDecisionFragment extends Hilt_BanAppealUnbannedDecisionFragment {
    public AnonymousClass11C A00;
    public BanAppealViewModel A01;
    public C36401np A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.A1q(bundle, layoutInflater, viewGroup);
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624262);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r14, android.view.View r15) {
        /*
            r13 = this;
            super.A21(r14, r15)
            X.1It r1 = X.AnonymousClass3Ma.A0I(r13)
            java.lang.Class<com.whatsapp.userban.ui.viewmodel.BanAppealViewModel> r0 = com.whatsapp.userban.ui.viewmodel.BanAppealViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r0 = (com.whatsapp.userban.ui.viewmodel.BanAppealViewModel) r0
            r13.A01 = r0
            X.1FL r0 = r13.A1D()
            r4 = 0
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel.A03(r0, r4)
            r0 = 2131428043(0x7f0b02cb, float:1.847772E38)
            android.widget.ImageView r2 = X.AnonymousClass3MW.A0G(r15, r0)
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r13)
            r0 = 2131233673(0x7f080b89, float:1.808349E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setImageDrawable(r0)
            r0 = 2131431392(0x7f0b0fe0, float:1.8484512E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r15, r0)
            r0 = 2131897268(0x7f122bb4, float:1.942942E38)
            r1.setText(r0)
            r0 = 2131435859(0x7f0b2153, float:1.8493572E38)
            com.whatsapp.TextEmojiLabel r3 = X.AnonymousClass3MX.A0V(r15, r0)
            r0 = 2131435860(0x7f0b2154, float:1.8493574E38)
            android.widget.TextView r2 = X.AnonymousClass3MW.A0J(r15, r0)
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r5 = r13.A01
            X.71O r0 = r5.A08
            X.0z4 r0 = r0.A06
            X.00H r8 = r0.A00
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r8)
            java.lang.String r0 = "support_ban_appeal_unban_reason"
            java.lang.String r6 = X.C17880vN.A0r(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BanAppealRepository/getUnbanReason "
            X.C17900vP.A0f(r0, r6, r1)
            java.lang.String r7 = "OOPS"
            boolean r0 = r7.equals(r6)
            if (r0 == 0) goto L_0x0084
            r6 = r7
        L_0x006d:
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r8)
            java.lang.String r0 = "support_ban_appeal_unban_reason_url"
            r8 = 0
            java.lang.String r9 = r1.getString(r0, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BanAppealRepository/getUnbanReasonUrl "
            X.C17900vP.A0f(r0, r9, r1)
            if (r9 == 0) goto L_0x009b
            goto L_0x0087
        L_0x0084:
            java.lang.String r6 = "OTHER"
            goto L_0x006d
        L_0x0087:
            X.1LC r0 = r5.A04     // Catch:{ Exception -> 0x0092 }
            android.net.Uri r0 = r0.A00(r9)     // Catch:{ Exception -> 0x0092 }
            android.util.Pair r1 = X.C108945cZ.A0N(r6, r0)     // Catch:{ Exception -> 0x0092 }
            goto L_0x00ad
        L_0x0092:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BanAppealViewModel/getUnbanReasonData Exception when creating uri from unban reason url: "
            X.C17900vP.A0e(r0, r9, r1)
        L_0x009b:
            boolean r0 = r7.equals(r6)
            X.129 r5 = r5.A06
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = "android"
            android.net.Uri r0 = X.AnonymousClass129.A00(r8, r5, r0, r8, r8)
        L_0x00a9:
            android.util.Pair r1 = X.C108945cZ.A0N(r6, r0)
        L_0x00ad:
            java.lang.Object r0 = r1.first
            java.lang.Object r6 = r1.second
            boolean r0 = r7.equals(r0)
            r5 = 8
            if (r0 == 0) goto L_0x00e4
            r0 = 2131897269(0x7f122bb5, float:1.9429423E38)
            r3.setText(r0)
            r2.setVisibility(r4)
            r0 = 2131897271(0x7f122bb7, float:1.9429427E38)
            r2.setText(r0)
        L_0x00c8:
            r0 = 2131427483(0x7f0b009b, float:1.8476584E38)
            X.AnonymousClass3MY.A1A(r15, r0, r5)
            r0 = 2131427484(0x7f0b009c, float:1.8476586E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r15, r0)
            r1.setVisibility(r4)
            r0 = 2131897272(0x7f122bb8, float:1.9429429E38)
            r1.setText(r0)
            r0 = 11
            X.AnonymousClass78L.A00(r1, r13, r0)
            return
        L_0x00e4:
            X.1np r7 = r13.A02
            android.content.Context r8 = r3.getContext()
            r0 = 2131897270(0x7f122bb6, float:1.9429425E38)
            java.lang.String r9 = r13.A1H(r0)
            r1 = 1
            java.lang.String[] r11 = new java.lang.String[r1]
            java.lang.String r0 = "using-whatsapp-responsibly-link"
            r11[r4] = r0
            java.lang.String[] r12 = new java.lang.String[r1]
            java.lang.String r0 = r6.toString()
            r12[r4] = r0
            java.lang.Runnable[] r10 = new java.lang.Runnable[r1]
            r1 = 23
            X.Ajq r0 = new X.Ajq
            r0.<init>(r1)
            r10[r4] = r0
            android.text.SpannableString r1 = r7.A04(r8, r9, r10, r11, r12)
            X.11C r0 = r13.A00
            X.AnonymousClass3Ma.A1K(r3, r0)
            X.0ve r0 = r13.A04
            X.AnonymousClass3Ma.A1L(r0, r3)
            r3.setText(r1)
            r2.setVisibility(r5)
            goto L_0x00c8
        L_0x0120:
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "how-to-use-whatsapp-responsibly"
            android.net.Uri r0 = r5.A05(r1, r0)
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment.A21(android.os.Bundle, android.view.View):void");
    }
}
