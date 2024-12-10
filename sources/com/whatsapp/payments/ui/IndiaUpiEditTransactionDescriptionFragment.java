package com.whatsapp.payments.ui;

import X.AF3;
import X.AFO;
import X.AZ6;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass48A;
import X.C108955ca;
import X.C161358Cw;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C20112A7u;
import X.C22379B5i;
import X.C72453Mb;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class IndiaUpiEditTransactionDescriptionFragment extends Hilt_IndiaUpiEditTransactionDescriptionFragment {
    public AnonymousClass1KB A00;
    public WaEditText A01;
    public WaTextView A02;
    public AnonymousClass11C A03;
    public C18000vb A04;
    public AnonymousClass1L2 A05;
    public AnonymousClass1KW A06;
    public C18030ve A07;
    public AZ6 A08;
    public C22379B5i A09;
    public C18010vc A0A;
    public WDSButton A0B;
    public String A0C;

    public void A21(Bundle bundle, View view) {
        this.A0C = C108955ca.A0s(A15(), "arg_payment_description");
        View view2 = view;
        AFO.A00(AnonymousClass1HF.A06(view2, 2131429217), this, 47);
        this.A0B = AnonymousClass3MW.A0q(view2, 2131434790);
        this.A02 = AnonymousClass3MW.A0T(view2, 2131433525);
        WaEditText waEditText = (WaEditText) AnonymousClass1HF.A06(view2, 2131433529);
        this.A01 = waEditText;
        waEditText.requestFocus();
        this.A01.addTextChangedListener(new AF3(this, 4));
        C18030ve r11 = this.A07;
        AnonymousClass1KW r10 = this.A06;
        AnonymousClass11C r7 = this.A03;
        C18000vb r8 = this.A04;
        C18010vc r12 = this.A0A;
        AnonymousClass48A r4 = new AnonymousClass48A(this.A01, AnonymousClass3MW.A0J(view2, 2131429680), r7, r8, this.A05, r10, r11, r12, 50, 0, true, false, false);
        C72453Mb.A1H(this.A01, new InputFilter[1], 50, 0);
        this.A01.addTextChangedListener(r4);
        if (!TextUtils.isEmpty(this.A0C) && this.A01.getText() != null) {
            this.A01.setText(this.A0C);
            WaEditText waEditText2 = this.A01;
            waEditText2.setSelection(AnonymousClass3Ma.A03(waEditText2));
        }
        AFO.A00(AnonymousClass1HF.A06(view2, 2131434790), this, 46);
        TextView A0J = AnonymousClass3MW.A0J(view2, 2131433524);
        String A1H = A1H(2131897611);
        String A0o = AnonymousClass3MY.A0o(this, A1H, 0, 2131897609);
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(A0o);
        C161358Cw r42 = new C161358Cw(this, 1);
        int length = A0o.length();
        A092.setSpan(r42, length - A1H.length(), length, 33);
        A0J.setText(A092);
        A0J.setLinksClickable(true);
        A0J.setMovementMethod(LinkMovementMethod.getInstance());
        this.A08.BiM((C20112A7u) null, (Integer) null, "payment_description", (String) null, 0);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625621);
    }
}
