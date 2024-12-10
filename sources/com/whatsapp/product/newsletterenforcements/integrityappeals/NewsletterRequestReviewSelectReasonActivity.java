package com.whatsapp.product.newsletterenforcements.integrityappeals;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.C000200d;
import X.C103305Ju;
import X.C103315Jv;
import X.C103325Jw;
import X.C104435Od;
import X.C105865Tq;
import X.C18100vl;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C90024dP;
import X.C90834ei;
import X.C90894eo;
import X.C91024f1;
import X.C91634g0;
import X.C98494rF;
import X.C99274sY;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class NewsletterRequestReviewSelectReasonActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public final C18100vl A03;
    public final C18100vl A04;

    public NewsletterRequestReviewSelectReasonActivity() {
        this(0);
        this.A04 = C99274sY.A00(new C103325Jw(this), new C103315Jv(this), new C104435Od(this), AnonymousClass3MW.A15(NewsletterRequestReviewViewModel.class));
        this.A03 = AnonymousClass1DF.A01(new C103305Ju(this));
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = C000200d.A00(A0K.A5B);
            this.A01 = AnonymousClass3MW.A0s(r2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131892795);
        A3f();
        boolean A1S = C72473Md.A1S(this);
        setContentView(2131626244);
        C91634g0.A00(this, ((NewsletterRequestReviewViewModel) this.A04.getValue()).A00, new C105865Tq(this), 12);
        View findViewById = this.A00.findViewById(2131434609);
        RadioGroup radioGroup = (RadioGroup) this.A00.findViewById(2131434608);
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[4];
        C72463Mc.A1H(2131892792, "UNJUSTIFIED_SUSPENSION", r2);
        AnonymousClass1D6.A03(2131892790, "MISUNDERSTOOD_UPDATES", r2, A1S ? 1 : 0);
        C72463Mc.A1I(2131892789, "FOLLOWED_GUIDELINES", r2);
        C72463Mc.A1J(2131892791, "ALLOWED_UPDATES", r2);
        LinkedHashMap A0B = AnonymousClass1D7.A0B(r2);
        C98494rF A002 = C98494rF.A00();
        A002.element = "UNKNOWN";
        Iterator A15 = AnonymousClass000.A15(A0B);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            int A0M = AnonymousClass000.A0M(A16.getKey());
            RadioButton radioButton = new RadioButton(new ContextThemeWrapper(this, 2132083613));
            radioButton.setText(A0M);
            radioButton.setOnCheckedChangeListener(new C90834ei((String) A16.getValue(), A002));
            radioGroup.addView(radioButton);
        }
        radioGroup.setOnCheckedChangeListener(new C90894eo(findViewById, 5));
        C90024dP.A00(findViewById, this, A002, 3);
    }

    public NewsletterRequestReviewSelectReasonActivity(int i) {
        this.A02 = false;
        C91024f1.A00(this, 26);
    }
}
