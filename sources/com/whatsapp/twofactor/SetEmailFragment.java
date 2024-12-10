package com.whatsapp.twofactor;

import X.A3H;
import X.AnonymousClass11C;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass48E;
import X.AnonymousClass4a6;
import X.AnonymousClass6LG;
import X.AnonymousClass7RC;
import X.C010105w;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C19740yt;
import X.C72473Md;
import X.C73203Rj;
import X.C88814ar;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.TextEmojiLabel;

public final class SetEmailFragment extends Hilt_SetEmailFragment {
    public int A00;
    public EditText A01;
    public TextView A02;
    public AnonymousClass11C A03;
    public C18030ve A04;
    public TwoFactorAuthActivity A05;
    public Button A06;
    public final TextWatcher A07 = new AnonymousClass48E(this, 17);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625392, viewGroup, false);
    }

    public void A1s() {
        this.A02 = null;
        this.A01 = null;
        this.A06 = null;
        this.A05 = null;
        super.A1s();
    }

    public void A21(Bundle bundle, View view) {
        int i;
        C18070vi.A0d(view, 0);
        this.A05 = (TwoFactorAuthActivity) A1B();
        Button button = (Button) view.findViewById(2131435879);
        this.A06 = button;
        if (button != null) {
            button.setOnClickListener(new AnonymousClass6LG(this, 38));
        }
        this.A01 = (EditText) view.findViewById(2131430280);
        this.A02 = C17880vN.A0E(view, 2131430516);
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(view, 2131429927);
        int i2 = this.A00;
        int i3 = 1;
        if (i2 != 1) {
            if (i2 == 2) {
                A0W.setText(2131897175);
                Button button2 = this.A06;
                if (button2 != null) {
                    button2.setText(2131897198);
                }
                i = 1;
            }
            i = 0;
        } else {
            TwoFactorAuthActivity twoFactorAuthActivity = this.A05;
            if (twoFactorAuthActivity == null || twoFactorAuthActivity.A08[0] == 2) {
                A0W.setText(2131897178);
            } else {
                AnonymousClass3Ma.A1L(A0W.getAbProps(), A0W);
                C72473Md.A1C(A0W);
                A0W.setText(A3H.A00(A14(), new TextAppearanceSpan(A0W.getContext(), 2132083662), new AnonymousClass7RC(this, 22), AnonymousClass3MY.A0n(this, 2131897179), "skip", C19740yt.A00(A14(), C72473Md.A05(A0W)), false));
            }
            Button button3 = this.A06;
            if (button3 != null) {
                button3.setText(2131899268);
            }
            i = 0;
        }
        TwoFactorAuthActivity twoFactorAuthActivity2 = this.A05;
        if (twoFactorAuthActivity2 != null) {
            if (!twoFactorAuthActivity2.A4e(this) || twoFactorAuthActivity2.A08.length == 1) {
                i3 = i;
            }
            twoFactorAuthActivity2.A4b(view, i3);
        }
    }

    public final class ConfirmSkipEmailDialog extends Hilt_SetEmailFragment_ConfirmSkipEmailDialog {
        public Dialog A27(Bundle bundle) {
            C73203Rj A03 = AnonymousClass4a6.A03(this);
            A03.A0D(2131897181);
            C010105w A00 = C73203Rj.A00(new C88814ar(this, 30), A03, 2131899286);
            C18070vi.A0X(A00);
            return A00;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r3 == X.AnonymousClass1YF.A0B(r5, '@', r2 - 1)) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.whatsapp.twofactor.SetEmailFragment r7) {
        /*
            android.widget.Button r6 = r7.A06
            if (r6 == 0) goto L_0x0031
            android.widget.EditText r0 = r7.A01
            if (r0 == 0) goto L_0x0034
            android.text.Editable r0 = r0.getText()
        L_0x000c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = X.AnonymousClass1YF.A0I(r0)
            r4 = 64
            r0 = 0
            int r3 = X.AnonymousClass1YF.A0C(r5, r4, r0, r0)
            if (r3 <= 0) goto L_0x0032
            int r2 = r5.length()
            r1 = 1
            int r0 = r2 - r1
            if (r3 >= r0) goto L_0x0032
            int r0 = r2 + -1
            int r0 = X.AnonymousClass1YF.A0B(r5, r4, r0)
            if (r3 != r0) goto L_0x0032
        L_0x002e:
            r6.setEnabled(r1)
        L_0x0031:
            return
        L_0x0032:
            r1 = 0
            goto L_0x002e
        L_0x0034:
            r0 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetEmailFragment.A00(com.whatsapp.twofactor.SetEmailFragment):void");
    }

    public void A1u() {
        super.A1u();
        EditText editText = this.A01;
        if (editText != null) {
            TextWatcher textWatcher = this.A07;
            editText.removeTextChangedListener(textWatcher);
            int i = this.A00;
            String str = null;
            TwoFactorAuthActivity twoFactorAuthActivity = this.A05;
            if (i == 1) {
                if (twoFactorAuthActivity != null) {
                    str = twoFactorAuthActivity.A04;
                }
            } else if (twoFactorAuthActivity != null) {
                str = twoFactorAuthActivity.A05;
            }
            editText.setText(str);
            editText.addTextChangedListener(textWatcher);
            A00(this);
            editText.requestFocus();
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A00 = A15().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
    }
}
