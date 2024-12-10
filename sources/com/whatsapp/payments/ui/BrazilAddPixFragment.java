package com.whatsapp.payments.ui;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass1FD;
import X.AnonymousClass1FL;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass8BX;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C21426Ajt;
import X.C21959AvN;
import X.C26261Rl;
import X.C36401np;
import X.C48212Lp;
import X.C63682tW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;

public final class BrazilAddPixFragment extends Hilt_BrazilAddPixFragment {
    public C26261Rl A00;
    public WaTextView A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public AnonymousClass1LU A04;
    public BrazilAddPixKeyViewModel A05;
    public C48212Lp A06;
    public C36401np A07;
    public AnonymousClass10I A08;
    public AnonymousClass00H A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public final C18100vl A0H = AnonymousClass1DF.A01(new C21959AvN(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131626314, false);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0297  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r21, android.view.View r22) {
        /*
            r20 = this;
            r2 = 0
            r0 = r22
            X.C18070vi.A0d(r0, r2)
            r13 = r20
            android.os.Bundle r3 = r13.A06
            if (r3 == 0) goto L_0x0047
            java.lang.String r1 = X.AnonymousClass8BR.A0y(r3)
            r13.A0F = r1
            java.lang.String r1 = "previous_screen"
            r3.getString(r1)
            java.lang.String r1 = "campaign_id"
            java.lang.String r1 = r3.getString(r1)
            r13.A0A = r1
            java.lang.String r1 = "extra_pix_info_key_credential_id"
            java.lang.String r1 = r3.getString(r1)
            r13.A0B = r1
            java.lang.String r1 = "extra_is_edit_mode_enabled"
            boolean r1 = r3.getBoolean(r1)
            r13.A0G = r1
            java.lang.String r1 = "pix_info_key_type"
            java.lang.String r1 = r3.getString(r1)
            r13.A0D = r1
            java.lang.String r1 = "pix_info_key_value"
            java.lang.String r1 = r3.getString(r1)
            r13.A0E = r1
            java.lang.String r1 = "pix_info_display_name"
            java.lang.String r1 = r3.getString(r1)
            r13.A0C = r1
        L_0x0047:
            X.1FL r5 = r13.A1B()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.C18070vi.A0z(r5, r1)
            X.01E r5 = (X.AnonymousClass01E) r5
            boolean r4 = r13.A0G
            android.content.res.Resources r3 = X.AnonymousClass3MZ.A09(r13)
            r1 = 2131887390(0x7f12051e, float:1.9409386E38)
            if (r4 == 0) goto L_0x0060
            r1 = 2131898750(0x7f12317e, float:1.9432427E38)
        L_0x0060:
            java.lang.CharSequence r1 = r3.getText(r1)
            r5.setTitle(r1)
            X.01n r3 = r5.getSupportActionBar()
            if (r3 == 0) goto L_0x0074
            java.lang.CharSequence r1 = r5.getTitle()
            r3.A0S(r1)
        L_0x0074:
            X.C72473Md.A18(r5)
            r1 = 2131428384(0x7f0b0420, float:1.847841E38)
            android.view.View r12 = X.C18070vi.A05(r0, r1)
            com.whatsapp.WaEditText r12 = (com.whatsapp.WaEditText) r12
            r1 = 2131428382(0x7f0b041e, float:1.8478407E38)
            android.view.View r1 = X.C18070vi.A05(r0, r1)
            android.widget.AbsSpinner r1 = (android.widget.AbsSpinner) r1
            r3 = 2131428385(0x7f0b0421, float:1.8478413E38)
            android.view.View r3 = X.C18070vi.A05(r0, r3)
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            X.4rF r15 = new X.4rF
            r15.<init>()
            java.util.ArrayList r14 = X.AnonymousClass000.A13()
            r4 = 2131887376(0x7f120510, float:1.9409357E38)
            java.lang.String r6 = X.AnonymousClass3MY.A0n(r13, r4)
            r9 = 14
            java.lang.String r7 = "###.###.###-##"
            java.lang.String r5 = "CPF"
            r8 = 2
            X.9t7 r4 = new X.9t7
            r4.<init>(r5, r6, r7, r8, r9)
            r14.add(r4)
            r4 = 2131887377(0x7f120511, float:1.940936E38)
            java.lang.String r6 = X.AnonymousClass3MY.A0n(r13, r4)
            r9 = 77
            r7 = 0
            java.lang.String r5 = "EMAIL"
            r8 = 32
            X.9t7 r4 = new X.9t7
            r4.<init>(r5, r6, r7, r8, r9)
            r14.add(r4)
            r4 = 2131887378(0x7f120512, float:1.9409361E38)
            java.lang.String r6 = X.AnonymousClass3MY.A0n(r13, r4)
            r9 = 36
            java.lang.String r5 = "EVP"
            r8 = 1
            X.9t7 r4 = new X.9t7
            r4.<init>(r5, r6, r7, r8, r9)
            r14.add(r4)
            r4 = 2131887379(0x7f120513, float:1.9409363E38)
            java.lang.String r8 = X.AnonymousClass3MY.A0n(r13, r4)
            r11 = 14
            java.lang.String r9 = "## ####-######"
            java.lang.String r7 = "PHONE"
            r10 = 2
            X.9t7 r6 = new X.9t7
            r6.<init>(r7, r8, r9, r10, r11)
            r14.add(r6)
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r4 = r13.A05
            java.lang.String r9 = "brazilAddPixKeyViewModel"
            if (r4 == 0) goto L_0x02a4
            java.lang.String r6 = r13.A0D
            if (r6 == 0) goto L_0x0113
            int r5 = r14.size()
            r8 = 0
        L_0x0100:
            if (r8 >= r5) goto L_0x0113
            java.lang.Object r4 = r14.get(r8)
            X.9t7 r4 = (X.C195299t7) r4
            java.lang.String r4 = r4.A03
            boolean r4 = X.C18070vi.A18(r4, r6)
            if (r4 != 0) goto L_0x0119
            int r8 = r8 + 1
            goto L_0x0100
        L_0x0113:
            int r4 = r14.size()
            int r8 = r4 + -1
        L_0x0119:
            android.content.Context r6 = r13.A14()
            r5 = 17367049(0x1090009, float:2.516295E-38)
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            r4.<init>(r6, r5, r14)
            r1.setAdapter(r4)
            X.AFw r11 = new X.AFw
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r1.setOnItemSelectedListener(r11)
            r4 = 1
            android.text.InputFilter$LengthFilter[] r6 = new android.text.InputFilter.LengthFilter[r4]
            java.lang.Object r4 = r14.get(r8)
            X.9t7 r4 = (X.C195299t7) r4
            int r5 = r4.A01
            android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
            r4.<init>(r5)
            r6[r2] = r4
            r12.setFilters(r6)
            r6 = 1
            X.AnonymousClass9AL.A00(r12, r13, r6)
            java.lang.Object r4 = r14.get(r8)
            X.9t7 r4 = (X.C195299t7) r4
            java.lang.String r5 = r4.A02
            if (r5 != 0) goto L_0x0297
            r4 = 0
        L_0x0156:
            r15.element = r4
            if (r4 == 0) goto L_0x015d
            r12.addTextChangedListener(r4)
        L_0x015d:
            r4 = 4
            X.AFX.A00(r12, r13, r4)
            boolean r4 = r13.A0G
            if (r4 == 0) goto L_0x0187
            java.lang.String r4 = r13.A0E
            if (r4 == 0) goto L_0x0187
            java.lang.String r5 = r13.A0D
            if (r5 == 0) goto L_0x0174
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r4 = r13.A05
            if (r4 == 0) goto L_0x02a4
            r4.A0W(r5)
        L_0x0174:
            java.lang.String r7 = r13.A0D
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r7, r5)
            java.lang.String r4 = r13.A0E
            X.C18070vi.A0z(r4, r5)
            java.lang.String r4 = X.A3V.A01(r7, r4)
            r12.setText(r4)
        L_0x0187:
            r1.setSelection(r8)
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r1 = r13.A05
            if (r1 == 0) goto L_0x02a4
            X.1DT r5 = r1.A03
            X.1q9 r4 = r13.A1G()
            X.B10 r1 = new X.B10
            r1.<init>(r3, r13)
            r7 = 32
            X.C20339AGv.A00(r4, r5, r1, r7)
            r1 = 2131428387(0x7f0b0423, float:1.8478417E38)
            android.view.View r8 = X.C18070vi.A05(r0, r1)
            com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
            r1 = 2131898749(0x7f12317d, float:1.9432425E38)
            java.lang.String r1 = r13.A1H(r1)
            r8.setHelperText(r1)
            r8.setHelperTextEnabled(r6)
            r1 = 2131428386(0x7f0b0422, float:1.8478415E38)
            android.widget.TextView r5 = X.AnonymousClass3Ma.A0E(r0, r1)
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r1 = r13.A05
            if (r1 == 0) goto L_0x02a4
            X.1DT r4 = r1.A02
            X.1q9 r3 = r13.A1G()
            X.B11 r1 = new X.B11
            r1.<init>(r8, r13)
            X.C20339AGv.A00(r3, r4, r1, r7)
            X.AnonymousClass9AL.A00(r5, r13, r10)
            r1 = 5
            X.AFX.A00(r5, r13, r1)
            boolean r1 = r13.A0G
            if (r1 == 0) goto L_0x01df
            java.lang.String r1 = r13.A0C
            if (r1 == 0) goto L_0x01df
            r5.setText(r1)
        L_0x01df:
            r1 = 2131428375(0x7f0b0417, float:1.8478393E38)
            android.view.View r5 = X.C18070vi.A05(r0, r1)
            com.whatsapp.WaButtonWithLoader r5 = (com.whatsapp.WaButtonWithLoader) r5
            boolean r3 = r13.A0G
            r1 = 2131887373(0x7f12050d, float:1.9409351E38)
            if (r3 == 0) goto L_0x01f2
            r1 = 2131887372(0x7f12050c, float:1.940935E38)
        L_0x01f2:
            r5.setButtonText((int) r1)
            r5.setEnabled(r2)
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r1 = r13.A05
            if (r1 == 0) goto L_0x02a4
            X.1DT r4 = r1.A01
            X.1q9 r3 = r13.A1G()
            X.B0y r1 = new X.B0y
            r1.<init>(r5, r13)
            X.C20339AGv.A00(r3, r4, r1, r7)
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r1 = r13.A05
            if (r1 == 0) goto L_0x02a4
            X.1DT r4 = r1.A00
            X.1q9 r3 = r13.A1G()
            X.B0z r1 = new X.B0z
            r1.<init>(r5, r13)
            X.C20339AGv.A00(r3, r4, r1, r7)
            r3 = 25
            X.9Ab r1 = new X.9Ab
            r1.<init>(r13, r3)
            r5.A00 = r1
            r1 = 2131428388(0x7f0b0424, float:1.847842E38)
            com.whatsapp.TextEmojiLabel r5 = X.C72453Mb.A0c(r0, r1)
            X.1np r14 = r13.A07
            if (r14 == 0) goto L_0x02a1
            android.content.Context r15 = r13.A14()
            android.content.res.Resources r3 = X.AnonymousClass3MZ.A09(r13)
            r1 = 2131887382(0x7f120516, float:1.940937E38)
            java.lang.String r16 = r3.getString(r1)
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.String r1 = "learn-more"
            r7[r2] = r1
            java.lang.String[] r4 = new java.lang.String[r6]
            java.lang.String r1 = "https://faq.whatsapp.com/544265288316777"
            r4[r2] = r1
            java.lang.Runnable[] r3 = new java.lang.Runnable[r6]
            r1 = 21
            X.C21422Ajp.A00(r3, r1, r2)
            r18 = r7
            r19 = r4
            r17 = r3
            android.text.SpannableString r3 = r14.A04(r15, r16, r17, r18, r19)
            android.graphics.Rect r1 = X.C39401t1.A0A
            X.11C r1 = r13.A02
            if (r1 == 0) goto L_0x029e
            X.AnonymousClass3Ma.A1K(r5, r1)
            X.0ve r1 = r13.A03
            if (r1 == 0) goto L_0x02a8
            X.AnonymousClass3Ma.A1L(r1, r5)
            r5.setText(r3)
            r1 = 2131434088(0x7f0b1a68, float:1.848998E38)
            android.view.View r3 = X.C18070vi.A05(r0, r1)
            r1 = 2131428390(0x7f0b0426, float:1.8478423E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r0, r1)
            r13.A01 = r0
            r13.A00()
            r0 = 41
            X.AnonymousClass3Ma.A19(r3, r13, r0)
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r3 = r13.A05
            if (r3 == 0) goto L_0x02a4
            java.lang.String r0 = r13.A0A
            java.lang.String r6 = r13.A0F
            r4 = 0
            r5 = r4
            r7 = r0
            r8 = r2
            r3.A0U(r4, r5, r6, r7, r8)
            return
        L_0x0297:
            X.8jp r4 = new X.8jp
            r4.<init>(r12, r5)
            goto L_0x0156
        L_0x029e:
            java.lang.String r0 = "systemServices"
            goto L_0x02aa
        L_0x02a1:
            java.lang.String r0 = "linkifier"
            goto L_0x02aa
        L_0x02a4:
            X.C18070vi.A11(r9)
            goto L_0x02ad
        L_0x02a8:
            java.lang.String r0 = "abProps"
        L_0x02aa:
            X.C18070vi.A11(r0)
        L_0x02ad:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilAddPixFragment.A21(android.os.Bundle, android.view.View):void");
    }

    private final void A00() {
        String str;
        C26261Rl r1 = this.A00;
        if (r1 != null) {
            int A002 = r1.A00("pix");
            if (A002 == 3) {
                AnonymousClass10I r2 = this.A08;
                if (r2 != null) {
                    r2.CGF(new C21426Ajt(this, 5));
                    return;
                }
                str = "waWorkers";
            } else {
                int i = C63682tW.A00[A002];
                WaTextView waTextView = this.A01;
                if (waTextView != null) {
                    waTextView.setText(i);
                    return;
                }
                return;
            }
        } else {
            str = "privacySettingManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1u() {
        super.A1u();
        A00();
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass1FL A1B = A1B();
        AnonymousClass1FD r0 = this;
        if (A1B instanceof BrazilPaymentPixOnboardingActivityV2) {
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivityV2");
            r0 = (BrazilPaymentPixOnboardingActivityV2) A1B;
        }
        this.A05 = AnonymousClass8BX.A0L(r0);
    }
}
