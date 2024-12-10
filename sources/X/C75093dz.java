package X;

import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity;
import com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3dz  reason: invalid class name and case insensitive filesystem */
public abstract class C75093dz extends AnonymousClass1FY {
    public TextInputEditText A00;
    public TextInputLayout A01;
    public C31191fA A02;
    public WDSButton A03;
    public WDSButton A04;
    public AnonymousClass00H A05;
    public String A06;

    public final TextInputLayout A4b() {
        TextInputLayout textInputLayout = this.A01;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        C18070vi.A11("secretCodeInputLayout");
        throw null;
    }

    public final WDSButton A4c() {
        WDSButton wDSButton = this.A03;
        if (wDSButton != null) {
            return wDSButton;
        }
        C18070vi.A11("primaryButton");
        throw null;
    }

    public final String A4d() {
        String str = this.A06;
        if (str != null) {
            return str;
        }
        C18070vi.A11("secretCodeString");
        throw null;
    }

    public final void A4f(int i) {
        C23520Bik A012 = C23520Bik.A01(this.A00, i, 0);
        BIE bie = A012.A0J;
        ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(bie);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168774);
        A0P.setMargins(dimensionPixelSize, A0P.topMargin, dimensionPixelSize, getResources().getDimensionPixelSize(2131168777));
        bie.setLayoutParams(A0P);
        A012.A0F(new C89884dB(A012, 48), 2131899286);
        A012.A08();
    }

    public boolean A4g() {
        String str;
        Object A4d;
        Object obj;
        if (this instanceof ChatLockCreateSecretCodeActivity) {
            AnonymousClass00H r0 = this.A05;
            if (r0 != null) {
                A4d = ((ChatLockPasscodeManager) r0.get()).A02(A4d());
                obj = C76923oo.A00;
            } else {
                str = "passcodeManager";
                C18070vi.A11(str);
                throw null;
            }
        } else {
            ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity = (ChatLockConfirmSecretCodeActivity) this;
            A4d = chatLockConfirmSecretCodeActivity.A4d();
            obj = chatLockConfirmSecretCodeActivity.A03;
            if (obj == null) {
                str = "correctSecretCode";
                C18070vi.A11(str);
                throw null;
            }
        }
        return C18070vi.A18(A4d, obj);
    }

    public void A4e() {
        CharSequence error = A4b().getError();
        if (error != null && error.length() > 0 && A4g()) {
            A4b().setError((CharSequence) null);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            boolean r5 = X.C72473Md.A1S(r9)
            r0 = 2131624030(0x7f0e005e, float:1.8875228E38)
            r9.setContentView((int) r0)
            r0 = 2131435012(0x7f0b1e04, float:1.8491854E38)
            android.view.View r0 = r9.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            r9.A01 = r0
            com.google.android.material.textfield.TextInputLayout r1 = r9.A4b()
            r0 = 2131895541(0x7f1224f5, float:1.9425918E38)
            r1.setHint((int) r0)
            com.google.android.material.textfield.TextInputLayout r1 = r9.A4b()
            r0 = 2
            r1.setEndIconMode(r0)
            com.google.android.material.textfield.TextInputLayout r1 = r9.A4b()
            r0 = 2131898780(0x7f12319c, float:1.9432487E38)
            java.lang.String r0 = r9.getString(r0)
            r1.setEndIconContentDescription((java.lang.CharSequence) r0)
            com.google.android.material.textfield.TextInputLayout r1 = r9.A4b()
            r0 = 2131101222(0x7f060626, float:1.7814848E38)
            int r0 = X.C19740yt.A00(r9, r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setEndIconTintList(r0)
            com.google.android.material.textfield.TextInputLayout r0 = r9.A4b()
            r0.setErrorEnabled(r5)
            com.google.android.material.textfield.TextInputLayout r0 = r9.A4b()
            r0.setHelperTextEnabled(r5)
            r0 = 2131436097(0x7f0b2241, float:1.8494055E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto L_0x0068
            r0.setAccessibilityLiveRegion(r5)
        L_0x0068:
            r0 = 2131436066(0x7f0b2222, float:1.8493992E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto L_0x0074
            r0.setImportantForAccessibility(r5)
        L_0x0074:
            r8 = 3
            int[][] r6 = new int[r8][]
            r7 = 2
            int[] r0 = new int[r7]
            r0 = {16842910, 16842908} // fill-array
            r4 = 0
            r6[r2] = r0
            int[] r1 = new int[r5]
            r0 = 16842910(0x101009e, float:2.3694E-38)
            r1[r2] = r0
            r6[r5] = r1
            int[] r0 = new int[r2]
            r6[r7] = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            r3 = 0
            int r2 = X.AnonymousClass1YH.A00(r3, r1, r0)
            android.content.res.Resources r1 = r9.getResources()
            int r0 = X.C72463Mc.A01(r9)
            int r1 = X.AnonymousClass1YH.A00(r3, r1, r0)
            int[] r0 = new int[r8]
            r0[r4] = r2
            r0[r5] = r1
            r0[r7] = r1
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            r1.<init>(r6, r0)
            com.google.android.material.textfield.TextInputLayout r0 = r9.A4b()
            r0.setBoxStrokeColorStateList(r1)
            r0.setHintTextColor(r1)
            java.lang.String r0 = ""
            r9.A06 = r0
            r0 = 2131435010(0x7f0b1e02, float:1.849185E38)
            android.view.View r1 = r9.findViewById(r0)
            com.google.android.material.textfield.TextInputEditText r1 = (com.google.android.material.textfield.TextInputEditText) r1
            r9.A00 = r1
            if (r1 != 0) goto L_0x00d3
            java.lang.String r0 = "secretCodeEditText"
            X.C18070vi.A11(r0)
            throw r3
        L_0x00d3:
            X.AnonymousClass48E.A00(r1, r9, r5)
            boolean r2 = r9 instanceof com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity
            if (r2 == 0) goto L_0x0163
            r0 = 5
        L_0x00db:
            r1.setImeOptions(r0)
            X.4et r0 = new X.4et
            r0.<init>(r9, r5)
            r1.setOnEditorActionListener(r0)
            r0 = 2131435009(0x7f0b1e01, float:1.8491848E38)
            android.widget.TextView r1 = X.AnonymousClass3MX.A0L(r9, r0)
            r0 = 2131895538(0x7f1224f2, float:1.9425912E38)
            r1.setText(r0)
            r0 = 2131429045(0x7f0b06b5, float:1.8479752E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            X.C18070vi.A0d(r0, r4)
            r9.A03 = r0
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A4c()
            java.lang.String r0 = r9.A4d()
            int r0 = r0.length()
            if (r0 > 0) goto L_0x0110
            r5 = 0
        L_0x0110:
            r1.setEnabled(r5)
            r0 = 2131429047(0x7f0b06b7, float:1.8479756E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            X.C18070vi.A0d(r0, r4)
            r9.A04 = r0
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A4c()
            if (r2 == 0) goto L_0x0166
            r0 = 2131895542(0x7f1224f6, float:1.942592E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A4c()
            r0 = 42
            X.C89884dB.A00(r1, r9, r0)
            r2 = r9
            com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity r2 = (com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity) r2
            X.00H r0 = r2.A05
            if (r0 == 0) goto L_0x0185
            boolean r0 = com.whatsapp.chatlock.passcode.ChatLockPasscodeManager.A01(r0)
            if (r0 == 0) goto L_0x0178
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x0178
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A04
            if (r0 == 0) goto L_0x0182
            r0.setVisibility(r4)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            if (r1 == 0) goto L_0x0182
            r0 = 2131895549(0x7f1224fd, float:1.9425934E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            if (r1 == 0) goto L_0x0182
            r0 = 43
            X.C89884dB.A00(r1, r2, r0)
            return
        L_0x0163:
            r0 = 6
            goto L_0x00db
        L_0x0166:
            r0 = 2131895539(0x7f1224f3, float:1.9425914E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A4c()
            r0 = 41
            X.C89884dB.A00(r1, r9, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A04
            goto L_0x017a
        L_0x0178:
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
        L_0x017a:
            if (r1 == 0) goto L_0x0182
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0182:
            java.lang.String r0 = "secondaryButton"
            goto L_0x0187
        L_0x0185:
            java.lang.String r0 = "passcodeManager"
        L_0x0187:
            X.C18070vi.A11(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75093dz.onCreate(android.os.Bundle):void");
    }
}
