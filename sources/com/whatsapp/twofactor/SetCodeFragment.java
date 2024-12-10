package com.whatsapp.twofactor;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass3MW;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C19830z4;
import X.C72453Mb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.CodeInputField;

public final class SetCodeFragment extends Hilt_SetCodeFragment {
    public int A00;
    public TextView A01;
    public CodeInputField A02;
    public AnonymousClass11S A03;
    public C19830z4 A04;
    public C18030ve A05;
    public TwoFactorAuthActivity A06;
    public AnonymousClass00H A07;
    public Button A08;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625390, viewGroup, false);
        C18030ve r2 = this.A05;
        if (r2 != null) {
            if (C18020vd.A05(C18040vf.A01, r2, 11695)) {
                C72453Mb.A1B(inflate.findViewById(2131434182));
            }
            return inflate;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r16, android.view.View r17) {
        /*
            r15 = this;
            r5 = 0
            r4 = r17
            X.C18070vi.A0d(r4, r5)
            X.1FL r0 = r15.A1B()
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r0
            r15.A06 = r0
            r0 = 2131435879(0x7f0b2167, float:1.8493613E38)
            android.view.View r2 = r4.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r15.A08 = r2
            if (r2 == 0) goto L_0x0025
            r1 = 37
            X.6LG r0 = new X.6LG
            r0.<init>(r15, r1)
            r2.setOnClickListener(r0)
        L_0x0025:
            r0 = 2131430516(0x7f0b0c74, float:1.8482735E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r4, r0)
            r15.A01 = r0
            r0 = 2131429150(0x7f0b071e, float:1.8479965E38)
            android.view.View r0 = r4.findViewById(r0)
            com.whatsapp.CodeInputField r0 = (com.whatsapp.CodeInputField) r0
            r15.A02 = r0
            r12 = 42
            r6 = 2
            X.4gY r9 = new X.4gY
            r9.<init>(r15, r6)
            r7 = 2131886292(0x7f1200d4, float:1.9407159E38)
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r14 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r2 = 0
            java.lang.String r11 = X.AnonymousClass3MX.A16(r15, r1, r0, r5, r7)
            X.C18070vi.A0X(r11)
            com.whatsapp.CodeInputField r7 = r15.A02
            if (r7 == 0) goto L_0x0063
            r0 = 3
            X.4gX r8 = new X.4gX
            r8.<init>(r15, r0)
            r10 = 0
            r13 = r12
            r7.A0N(r8, r9, r10, r11, r12, r13, r14)
        L_0x0063:
            int r0 = r15.A00
            if (r0 == r3) goto L_0x009b
            if (r0 == r6) goto L_0x0092
            r0 = 2131897203(0x7f122b73, float:1.9429289E38)
            java.lang.String r6 = r15.A1H(r0)
        L_0x0070:
            X.C18070vi.A0X(r6)
        L_0x0073:
            r0 = 2131429152(0x7f0b0720, float:1.8479969E38)
            android.view.View r1 = r4.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.C18070vi.A0z(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r6)
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = r15.A06
            if (r1 == 0) goto L_0x0091
            int[] r0 = r1.A08
            int r0 = r0.length
            if (r0 != r3) goto L_0x008e
            r2 = r5
        L_0x008e:
            r1.A4b(r4, r2)
        L_0x0091:
            return
        L_0x0092:
            r0 = 2131897171(0x7f122b53, float:1.9429224E38)
            java.lang.String r6 = X.AnonymousClass3MY.A0n(r15, r0)
            r5 = 1
            goto L_0x0073
        L_0x009b:
            r0 = 2131897167(0x7f122b4f, float:1.9429216E38)
            java.lang.String r6 = X.AnonymousClass3MY.A0o(r15, r1, r5, r0)
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A21(android.os.Bundle, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r0.A2N() == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.whatsapp.twofactor.SetCodeFragment r5) {
        /*
            int r0 = r5.A00
            r4 = 2
            r3 = 1
            if (r0 == r3) goto L_0x0056
            if (r0 != r4) goto L_0x001a
            com.whatsapp.twofactor.TwoFactorAuthActivity r2 = r5.A06
            if (r2 == 0) goto L_0x001a
            boolean r0 = r2.A4e(r5)
            if (r0 != r3) goto L_0x0079
            r1 = 0
            boolean r0 = r2.A07
            if (r0 != r3) goto L_0x001b
            r2.A4d(r1)
        L_0x001a:
            return
        L_0x001b:
            X.00H r0 = r5.A07
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r0.get()
            X.9uM r0 = (X.C196039uM) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0054
            X.0ve r2 = r5.A05
            if (r2 == 0) goto L_0x0072
            r1 = 5156(0x1424, float:7.225E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0054
            X.0z4 r0 = r5.A04
            if (r0 == 0) goto L_0x006c
            boolean r0 = r0.A2N()
            if (r0 != 0) goto L_0x0054
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SetCodeFragment/shouldShowAddEmailActivity : "
            X.C17900vP.A0n(r0, r1, r3)
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r5.A06
            if (r0 == 0) goto L_0x001a
            r0.A4d(r3)
            return
        L_0x0054:
            r3 = 0
            goto L_0x0043
        L_0x0056:
            com.whatsapp.twofactor.TwoFactorAuthActivity r2 = r5.A06
            if (r2 == 0) goto L_0x001a
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "type"
            r1.putInt(r0, r4)
            com.whatsapp.twofactor.SetCodeFragment r0 = new com.whatsapp.twofactor.SetCodeFragment
            r0.<init>()
            r0.A1R(r1)
            goto L_0x007d
        L_0x006c:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x0074
        L_0x006f:
            java.lang.String r0 = "emailVerificationManager"
            goto L_0x0074
        L_0x0072:
            java.lang.String r0 = "abProps"
        L_0x0074:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0079:
            com.whatsapp.twofactor.SetEmailFragment r0 = X.C83984Hk.A00(r3)
        L_0x007d:
            r2.A4c(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A00(com.whatsapp.twofactor.SetCodeFragment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r0 == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0.length() == 6) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.twofactor.SetCodeFragment r3) {
        /*
            android.widget.Button r0 = r3.A08
            if (r0 == 0) goto L_0x0021
            int r0 = r3.A00
            r2 = 1
            if (r0 != r2) goto L_0x0022
            com.whatsapp.CodeInputField r0 = r3.A02
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.getCode()
            if (r0 == 0) goto L_0x003a
            int r1 = r0.length()
            r0 = 6
            if (r1 != r0) goto L_0x003a
        L_0x001a:
            android.widget.Button r0 = r3.A08
            if (r0 == 0) goto L_0x0021
            r0.setEnabled(r2)
        L_0x0021:
            return
        L_0x0022:
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r3.A06
            r2 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x003a
            com.whatsapp.CodeInputField r0 = r3.A02
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = r0.getCode()
        L_0x0033:
            boolean r0 = X.AnonymousClass1YE.A08(r1, r2)
            r2 = 1
            if (r0 != 0) goto L_0x001a
        L_0x003a:
            r2 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A01(com.whatsapp.twofactor.SetCodeFragment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (X.AnonymousClass1YE.A08(r1, r2) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(com.whatsapp.twofactor.SetCodeFragment r5, java.lang.CharSequence r6) {
        /*
            android.widget.TextView r0 = r5.A01
            if (r0 == 0) goto L_0x0007
            X.AnonymousClass3MW.A1S(r0)
        L_0x0007:
            int r1 = r6.length()
            r0 = 6
            r4 = 0
            if (r1 != r0) goto L_0x0040
            int r1 = r5.A00
            r3 = 1
            if (r1 == r3) goto L_0x002e
            r0 = 2
            if (r1 != r0) goto L_0x0039
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r5.A06
            r2 = 0
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x002f
            com.whatsapp.CodeInputField r0 = r5.A02
            if (r0 == 0) goto L_0x0028
            java.lang.String r2 = r0.getCode()
        L_0x0028:
            boolean r0 = X.AnonymousClass1YE.A08(r1, r2)
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            return r3
        L_0x002f:
            android.widget.TextView r1 = r5.A01
            if (r1 == 0) goto L_0x0039
            r0 = 2131897168(0x7f122b50, float:1.9429218E38)
            r1.setText(r0)
        L_0x0039:
            com.whatsapp.CodeInputField r0 = r5.A02
            if (r0 == 0) goto L_0x0040
            r0.requestFocus()
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A02(com.whatsapp.twofactor.SetCodeFragment, java.lang.CharSequence):boolean");
    }

    public void A1s() {
        super.A1s();
        this.A06 = null;
        this.A08 = null;
        this.A02 = null;
        this.A01 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0.A4e(r5) == true) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1u() {
        /*
            r5 = this;
            super.A1u()
            int r0 = r5.A00
            r4 = 2
            if (r0 != r4) goto L_0x006f
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r5.A06
            if (r0 == 0) goto L_0x006f
            boolean r0 = r0.A4e(r5)
            r2 = 1
            if (r0 != r2) goto L_0x006f
        L_0x0013:
            android.widget.Button r1 = r5.A08
            if (r1 == 0) goto L_0x0022
            r0 = 2131899268(0x7f123384, float:1.9433477E38)
            if (r2 == 0) goto L_0x001f
            r0 = 2131897198(0x7f122b6e, float:1.9429279E38)
        L_0x001f:
            r1.setText(r0)
        L_0x0022:
            android.widget.Button r0 = r5.A08
            r3 = 0
            if (r0 == 0) goto L_0x002b
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
        L_0x002b:
            X.0ve r2 = r5.A05
            if (r2 == 0) goto L_0x0071
            r1 = 5711(0x164f, float:8.003E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x006b
            if (r3 == 0) goto L_0x003e
            r0 = -1
        L_0x003c:
            r3.width = r0
        L_0x003e:
            int r0 = r5.A00
            if (r0 != r4) goto L_0x0060
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r5.A06
            if (r0 == 0) goto L_0x0060
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x0060
            com.whatsapp.CodeInputField r0 = r5.A02
            if (r0 == 0) goto L_0x0051
            r0.setCode(r1)
        L_0x0051:
            com.whatsapp.CodeInputField r0 = r5.A02
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r0.getCode()
            if (r0 != 0) goto L_0x005d
        L_0x005b:
            java.lang.String r0 = ""
        L_0x005d:
            A02(r5, r0)
        L_0x0060:
            A01(r5)
            com.whatsapp.CodeInputField r0 = r5.A02
            if (r0 == 0) goto L_0x006a
            r0.requestFocus()
        L_0x006a:
            return
        L_0x006b:
            if (r3 == 0) goto L_0x003e
            r0 = -2
            goto L_0x003c
        L_0x006f:
            r2 = 0
            goto L_0x0013
        L_0x0071:
            X.AnonymousClass3MW.A1A()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A1u():void");
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A00 = A15().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
    }
}
