package com.whatsapp.registration;

import X.AnonymousClass18K;
import X.AnonymousClass86E;
import X.C139436yq;
import X.C18000vb;
import X.C18070vi;
import X.C19830z4;
import X.C27301Vn;
import X.C72483Me;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.msys.mci.DefaultCrypto;

public final class VerificationCodeBottomSheet extends Hilt_VerificationCodeBottomSheet implements AnonymousClass86E {
    public C27301Vn A00;
    public C19830z4 A01;
    public C18000vb A02;
    public AnonymousClass18K A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131627334, viewGroup);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f4, code lost:
        r0 = "whatsAppLocale";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r13, android.view.View r14) {
        /*
            r12 = this;
            r7 = 0
            X.C18070vi.A0d(r14, r7)
            super.A21(r13, r14)
            X.1FL r0 = r12.A1D()
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            if (r2 == 0) goto L_0x0142
            X.C18070vi.A0b(r0)
            int r0 = X.C72483Me.A02(r0)
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.AnonymousClass3MZ.A1G(r14, r2, r1, r0)
            r0 = 2131436694(0x7f0b2496, float:1.8495266E38)
            android.view.View r9 = X.C18070vi.A05(r14, r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r9 = (com.whatsapp.wds.components.textlayout.WDSTextLayout) r9
            r0 = 2131897745(0x7f122d91, float:1.9430388E38)
            X.AnonymousClass3MY.A1J(r12, r9, r0)
            android.content.Context r1 = r12.A1n()
            r0 = 2131627335(0x7f0e0d47, float:1.8881932E38)
            android.view.View r8 = X.AnonymousClass3MX.A08(r1, r0)
            r0 = 2131429927(0x7f0b0a27, float:1.848154E38)
            android.widget.TextView r10 = X.AnonymousClass3Ma.A0E(r8, r0)
            android.content.Context r6 = r12.A14()
            r5 = 2131897744(0x7f122d90, float:1.9430386E38)
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1a()
            android.content.Context r3 = r12.A14()
            android.content.Context r2 = r12.A1n()
            r1 = 2130970831(0x7f0408cf, float:1.7550383E38)
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            java.lang.String r0 = X.AnonymousClass1EG.A03(r3, r0)
            r4[r7] = r0
            android.text.Spanned r0 = X.AnonymousClass1EG.A01(r6, r4, r5)
            r10.setText(r0)
            r0 = 2131429151(0x7f0b071f, float:1.8479967E38)
            android.view.View r6 = X.C18070vi.A05(r8, r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.os.Bundle r2 = r12.A15()
            java.lang.String r1 = "code"
            java.lang.String r0 = ""
            java.lang.String r5 = r2.getString(r1, r0)
            X.C18070vi.A0X(r5)
            int r4 = r5.length()
            r3 = 0
            r11 = 1
            boolean r1 = X.AnonymousClass000.A1R(r4)
            java.lang.String r0 = "Invalid code"
            X.C17960vV.A0G(r1, r0)
            if (r4 < 0) goto L_0x00f7
        L_0x0092:
            r10 = r4
            android.content.Context r0 = r12.A14()
            com.whatsapp.WaTextView r2 = new com.whatsapp.WaTextView
            r2.<init>(r0)
            android.content.Context r1 = r12.A14()
            r0 = 2132084302(0x7f15064e, float:1.980877E38)
            r2.setTextAppearance(r1, r0)
            X.0vb r0 = r12.A02
            if (r0 == 0) goto L_0x00f4
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 != 0) goto L_0x00b1
            r10 = 0
        L_0x00b1:
            if (r3 == r10) goto L_0x00c8
            android.widget.LinearLayout$LayoutParams r10 = X.AnonymousClass3Ma.A0D()
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r2)
            r0 = 2131168345(0x7f070c59, float:1.795099E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.setMargins(r7, r7, r0, r7)
            r2.setLayoutParams(r10)
        L_0x00c8:
            int r1 = r4 / 2
            if (r3 != r1) goto L_0x00d9
            java.lang.String r0 = "-"
        L_0x00ce:
            r2.setText(r0)
            r6.addView(r2)
            if (r3 == r4) goto L_0x00f7
            int r3 = r3 + 1
            goto L_0x0092
        L_0x00d9:
            int r0 = r3 + -1
            if (r3 >= r1) goto L_0x00de
            r0 = r3
        L_0x00de:
            X.0vb r1 = r12.A02
            if (r1 == 0) goto L_0x00f4
            boolean r1 = X.AnonymousClass3MW.A1Z(r1)
            if (r1 == 0) goto L_0x00eb
            int r0 = r4 - r0
            int r0 = r0 - r11
        L_0x00eb:
            char r0 = r5.charAt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x00ce
        L_0x00f4:
            java.lang.String r0 = "whatsAppLocale"
            goto L_0x013d
        L_0x00f7:
            X.C18070vi.A0b(r8)
            X.AnonymousClass4CG.A00(r8, r9)
            X.0z4 r3 = r12.A01
            if (r3 == 0) goto L_0x0138
            X.1Vn r2 = r12.A00
            if (r2 == 0) goto L_0x0135
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "device_switching_code"
            X.C17880vN.A1B(r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "device_switching_code_expiry"
            X.C17880vN.A1B(r1, r0)
            r1 = 53
            java.lang.String r0 = "CodeDisplayed"
            r2.BEJ(r1, r0)
            X.3yn r1 = new X.3yn
            r1.<init>()
            X.0z4 r0 = r12.A01
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = r0.A0j()
            r1.A00 = r0
            X.18K r0 = r12.A03
            if (r0 == 0) goto L_0x013b
            r0.CC7(r1)
            return
        L_0x0135:
            java.lang.String r0 = "waNotificationManager"
            goto L_0x013d
        L_0x0138:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x013d
        L_0x013b:
            java.lang.String r0 = "wamRuntime"
        L_0x013d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0142:
            java.lang.NullPointerException r0 = X.AnonymousClass3MY.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerificationCodeBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        Window window = A27.getWindow();
        if (window != null) {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        return A27;
    }

    public void A2I(C139436yq r1) {
        C72483Me.A13(r1);
    }
}
