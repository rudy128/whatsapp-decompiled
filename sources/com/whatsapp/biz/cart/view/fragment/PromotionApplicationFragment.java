package com.whatsapp.biz.cart.view.fragment;

import X.AF3;
import X.AFU;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.C161558Fv;
import X.C167978i5;
import X.C18000vb;
import X.C18070vi;
import X.C195679tj;
import X.C20339AGv;
import X.C20342AGy;
import X.C22111Axp;
import X.C56512ha;
import X.C90084dV;
import X.D6V;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.google.android.material.textfield.TextInputLayout;

public final class PromotionApplicationFragment extends Hilt_PromotionApplicationFragment {
    public TextInputLayout A00;
    public C56512ha A01;
    public AnonymousClass11C A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C167978i5 r8, com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment r9) {
        /*
            r6 = 0
            if (r8 == 0) goto L_0x003c
            com.google.android.material.textfield.TextInputLayout r7 = r9.A00
            if (r7 == 0) goto L_0x0037
            boolean r0 = r8 instanceof X.C167968i4
            if (r0 != 0) goto L_0x002d
            boolean r0 = r8 instanceof X.C167958i3
            if (r0 == 0) goto L_0x0052
            X.0vb r5 = r9.A01
            if (r5 == 0) goto L_0x002d
            r4 = 2131889071(0x7f120baf, float:1.9412795E38)
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            X.8i3 r8 = (X.C167958i3) r8
            X.A6S r1 = r8.A00
            java.math.BigDecimal r0 = r8.A01
            java.lang.String r1 = r1.A03(r5, r0, r3)
            X.C18070vi.A0X(r1)
            r0 = 0
            java.lang.String r0 = X.AnonymousClass3MX.A16(r9, r1, r2, r0, r4)
            if (r0 != 0) goto L_0x0034
        L_0x002d:
            r0 = 2131894810(0x7f12221a, float:1.9424435E38)
            java.lang.String r0 = r9.A1H(r0)
        L_0x0034:
            r7.setError(r0)
        L_0x0037:
            com.google.android.material.textfield.TextInputLayout r1 = r9.A00
            if (r1 != 0) goto L_0x004e
        L_0x003b:
            return
        L_0x003c:
            com.google.android.material.textfield.TextInputLayout r0 = r9.A00
            if (r0 == 0) goto L_0x0043
            r0.setError(r6)
        L_0x0043:
            com.google.android.material.textfield.TextInputLayout r1 = r9.A00
            if (r1 == 0) goto L_0x003b
            r0 = 2131886687(0x7f12025f, float:1.940796E38)
            java.lang.String r6 = r9.A1H(r0)
        L_0x004e:
            r1.setHelperText(r6)
            return
        L_0x0052:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment.A00(X.8i5, com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment):void");
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625385, false);
    }

    public void A20(Bundle bundle) {
        EditText editText;
        Editable text;
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        TextInputLayout textInputLayout = this.A00;
        if (textInputLayout != null && (editText = textInputLayout.A0B) != null && (text = editText.getText()) != null) {
            bundle.putString("store.coupon.input.key", text.toString());
        }
    }

    public void A21(Bundle bundle, View view) {
        C161558Fv r2;
        EditText editText;
        C195679tj A0T;
        String string;
        C56512ha r1;
        C18070vi.A0d(view, 0);
        Fragment fragment = this.A0E;
        if (fragment == null) {
            fragment = this;
        }
        Bundle bundle2 = this.A06;
        EditText editText2 = null;
        if (bundle2 == null || (string = bundle2.getString("business.jid.arg")) == null || (r1 = this.A01) == null) {
            r2 = null;
        } else {
            r2 = (C161558Fv) AnonymousClass8BR.A0C(new C20342AGy(r1.A00(AnonymousClass8BR.A0X(string))), fragment).A00(C161558Fv.class);
        }
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(2131431655);
        this.A00 = textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.setHint((CharSequence) A1H(2131891361));
        }
        A00((C167978i5) null, this);
        TextInputLayout textInputLayout2 = this.A00;
        if (!(textInputLayout2 == null || (editText = textInputLayout2.A0B) == null)) {
            editText.setInputType(49152);
            AnonymousClass1HF.A0i(editText, new D6V(), new String[]{"image/*"});
            if (!(r2 == null || (A0T = r2.A0T()) == null)) {
                editText.setText(A0T.A06);
            }
            editText2 = editText;
            editText.addTextChangedListener(new AF3(this, 1));
            editText.requestFocus();
        }
        C90084dV.A00(view.findViewById(2131427827), editText2, this, r2, 9);
        if (r2 != null) {
            C20339AGv.A00(this, r2.A02.A0A, new C22111Axp(this), 2);
        }
        View findViewById = view.findViewById(2131429148);
        if (findViewById != null) {
            C18000vb r0 = this.A01;
            if (r0 != null && AnonymousClass3MW.A1Z(r0)) {
                findViewById.setScaleX(-1.0f);
            }
            AFU.A00(findViewById, this, 43);
        }
    }

    public void A1Q(Bundle bundle) {
        String string;
        TextInputLayout textInputLayout;
        EditText editText;
        super.A1Q(bundle);
        if (bundle != null && (string = bundle.getString("store.coupon.input.key")) != null && (textInputLayout = this.A00) != null && (editText = textInputLayout.A0B) != null) {
            editText.setText(string);
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A2A(2, 2132083326);
    }
}
