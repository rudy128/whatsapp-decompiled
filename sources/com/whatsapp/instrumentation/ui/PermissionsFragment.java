package com.whatsapp.instrumentation.ui;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass1LC;
import X.AnonymousClass1TM;
import X.AnonymousClass3KR;
import X.C146817Qs;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C36401np;
import X.C36531o3;
import X.C39441t5;
import X.C50182Tl;
import X.C89954dI;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PermissionsFragment extends Hilt_PermissionsFragment {
    public AnonymousClass1LC A00;
    public C36531o3 A01;
    public C18030ve A02;
    public AnonymousClass1TM A03;
    public AnonymousClass3KR A04;
    public C36401np A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(2131625714, viewGroup, false);
    }

    public void A1x(Context context) {
        super.A1x(context);
        if (context instanceof AnonymousClass3KR) {
            this.A04 = (AnonymousClass3KR) context;
        }
    }

    public void A21(Bundle bundle, View view) {
        int i;
        int i2;
        String str;
        String str2;
        int i3;
        int i4;
        view.findViewById(2131431726).setOnClickListener(new C89954dI(this, 18));
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            i = bundle2.getInt("content_variant");
        } else {
            i = 0;
        }
        TextView A0E = C17880vN.A0E(view, 2131431729);
        if (A0E != null) {
            if (i == 2 || i == 1 || i == 4) {
                i4 = 2131891397;
            } else {
                i4 = 2131891395;
                if (i == 3) {
                    i4 = 2131891396;
                }
            }
            A0E.setText(i4);
        }
        TextView A0E2 = C17880vN.A0E(view, 2131431727);
        if (A0E2 != null) {
            if (i == 2 || i == 1 || i == 4) {
                i3 = 2131891391;
            } else {
                i3 = 2131891389;
                if (i == 3) {
                    i3 = 2131891390;
                }
            }
            A0E2.setText(i3);
        }
        View findViewById = view.findViewById(2131431741);
        View findViewById2 = view.findViewById(2131431742);
        if (findViewById == null || findViewById2 == null || i != 3) {
            if (i == 1) {
                str2 = "whatsapp-smart-glasses-learn-more";
            } else if (i == 2) {
                str2 = "whatsapp-smart-glasses-learn-more-rbm";
            } else if (!(i == 3 || i == 4)) {
                if (C18020vd.A00(C18040vf.A02, this.A03.A01, 2624) == 2) {
                    i2 = 2131891394;
                    str = "https://faq.whatsapp.com/660493885504088";
                } else {
                    i2 = 2131891392;
                    str = "https://faq.whatsapp.com/general/security-and-privacy/about-your-privacy-when-using-whatsapp-on-ray-ban-stories/";
                }
                C50182Tl.A00((TextView) AnonymousClass1HF.A06(view, 2131431728), this.A02, AnonymousClass000.A1b(this.A00.A00(str).toString(), 1), i2);
            }
            SpannableStringBuilder A052 = this.A05.A05(A14(), new C146817Qs(28, str2, this), A1I(2131891393, "learn-more"), "learn-more");
            TextView textView = (TextView) AnonymousClass1HF.A06(view, 2131431728);
            textView.setMovementMethod(new C39441t5(this.A02));
            textView.setText(A052);
            return;
        }
        findViewById.setVisibility(8);
        findViewById2.setVisibility(0);
        i2 = 2131891393;
        str = "https://faq.whatsapp.com/836703167795647";
        C50182Tl.A00((TextView) AnonymousClass1HF.A06(view, 2131431728), this.A02, AnonymousClass000.A1b(this.A00.A00(str).toString(), 1), i2);
    }
}
