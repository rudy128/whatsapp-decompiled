package com.whatsapp.payments.ui.widget;

import X.A43;
import X.A8C;
import X.ADI;
import X.AFR;
import X.AW0;
import X.AXS;
import X.AZ6;
import X.AnonymousClass1HF;
import X.AnonymousClass1KN;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BS;
import X.AnonymousClass8FM;
import X.AnonymousClass9O4;
import X.C170318pf;
import X.C17960vV;
import X.C196219ue;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MandateUpdateBottomSheetFragment extends Hilt_MandateUpdateBottomSheetFragment {
    public Button A00;
    public Button A01;
    public LinearLayout A02;
    public TextView A03;
    public AW0 A04;
    public AXS A05;
    public AZ6 A06;
    public AnonymousClass8FM A07;
    public A8C A08;
    public A43 A09;

    public void A21(Bundle bundle, View view) {
        AnonymousClass1KN r1;
        this.A06.BiI((Integer) null, "approve_mandate_update_request_prompt", "payment_transaction_details", 0, true);
        this.A07 = (AnonymousClass8FM) AnonymousClass3Ma.A0I(this).A00(AnonymousClass8FM.class);
        View view2 = view;
        AFR.A00(AnonymousClass8BS.A06(view2), this, 39);
        String A0G = this.A05.A0G();
        if (!TextUtils.isEmpty(A0G)) {
            AnonymousClass3MW.A0G(view2, 2131434229).setImageResource(A43.A00(A0G, (String) null).A00);
        }
        this.A04 = ((ADI) A15().getParcelable("transaction")).A00;
        this.A02.setVisibility(0);
        C170318pf r5 = (C170318pf) this.A04.A0A;
        C196219ue r0 = r5.A0H;
        C17960vV.A07(r0);
        AnonymousClass9O4 r2 = r0.A0C;
        boolean equals = r2.A09.equals("PENDING");
        TextView textView = this.A03;
        int i = 2131897578;
        if (equals) {
            i = 2131897570;
        }
        textView.setText(i);
        long j = r2.A00;
        boolean z = false;
        int i2 = 2131897505;
        if (j != r5.A0H.A01) {
            z = true;
            i2 = 2131897504;
        }
        String A1H = A1H(i2);
        String A072 = this.A08.A07(j);
        LinearLayout linearLayout = this.A02;
        Context context = linearLayout.getContext();
        int i3 = 2130971113;
        int i4 = 2131102439;
        if (z) {
            i3 = 2130970831;
            i4 = 2131102246;
        }
        linearLayout.addView(A00(linearLayout, A1H, A072, AnonymousClass1YL.A00(context, i3, i4), false));
        int i5 = 2131897503;
        if (this.A04.A09.equals(r2.A00())) {
            i5 = 2131897490;
        }
        String A1H2 = A1H(i5);
        A8C a8c = this.A08;
        if (r2.A00() != null) {
            r1 = r2.A00();
        } else {
            r1 = this.A04.A09;
        }
        String str = r2.A07;
        if (str == null) {
            str = r5.A0H.A0G;
        }
        String A082 = a8c.A08(r1, str);
        LinearLayout linearLayout2 = this.A02;
        linearLayout2.addView(A00(linearLayout2, A1H2, A082, AnonymousClass1YL.A00(A1n(), 2130970831, 2131102246), true));
        if (!r2.A09.equals("INIT") || !r2.A08.equals("UNKNOWN")) {
            this.A00.setVisibility(8);
            this.A01.setVisibility(8);
            return;
        }
        AFR.A00(this.A00, this, 37);
        this.A01.setVisibility(0);
        AFR.A00(this.A01, this, 38);
    }

    private LinearLayout A00(LinearLayout linearLayout, CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        LinearLayout linearLayout2 = (LinearLayout) AnonymousClass3MX.A09(LayoutInflater.from(A1B()), linearLayout, 2131625630);
        TextView A0J = AnonymousClass3MW.A0J(linearLayout2, 2131431979);
        TextView A0J2 = AnonymousClass3MW.A0J(linearLayout2, 2131434721);
        A0J.setText(charSequence);
        A0J2.setText(charSequence2);
        if (z) {
            A0J.setTypeface(A0J.getTypeface(), 1);
            A0J2.setTypeface(A0J2.getTypeface(), 1);
        }
        AnonymousClass3MX.A1C(A0J.getContext(), A0J, i);
        AnonymousClass3MX.A1C(A0J2.getContext(), A0J2, i);
        return linearLayout2;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A092 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625632);
        this.A03 = AnonymousClass3MW.A0J(A092, 2131436208);
        this.A02 = AnonymousClass3MX.A0K(A092, 2131436542);
        this.A00 = (Button) AnonymousClass1HF.A06(A092, 2131433997);
        this.A01 = (Button) AnonymousClass1HF.A06(A092, 2131432938);
        return A092;
    }
}
