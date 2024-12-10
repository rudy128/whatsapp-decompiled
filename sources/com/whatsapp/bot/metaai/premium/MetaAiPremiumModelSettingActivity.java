package com.whatsapp.bot.metaai.premium;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3NL;
import X.AnonymousClass72E;
import X.AnonymousClass782;
import X.AnonymousClass79Z;
import X.AnonymousClass7AT;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C110885hR;
import X.C148677hp;
import X.C148687hq;
import X.C148697hr;
import X.C148707hs;
import X.C148717ht;
import X.C148727hu;
import X.C148737hv;
import X.C155247sR;
import X.C18070vi;
import X.C18100vl;
import X.C47192Hl;
import X.C99274sY;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

public final class MetaAiPremiumModelSettingActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public boolean A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0c(A0A2, r1, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A00 = C000200d.A00(A0A2.A12);
            this.A01 = AnonymousClass3MX.A10(A0A2);
            this.A02 = C000200d.A00(r1.A30);
            this.A03 = C000200d.A00(A0A2.ABY);
            this.A04 = C000200d.A00(A0A2.A9B);
        }
    }

    public void A3H() {
        C47192Hl r1 = new C47192Hl();
        C108945cZ.A1M(r1, 59);
        AnonymousClass3MZ.A1T(r1, C108955ca.A0i());
        C108965cb.A1F(r1, ((MetaAiPremiumViewModel) this.A08.getValue()).A02);
    }

    public MetaAiPremiumModelSettingActivity(int i) {
        this.A05 = false;
        AnonymousClass79Z.A00(this, 24);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624073);
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131436270);
        AnonymousClass3NL.A02(this, toolbar, this.A00, 2131231675);
        toolbar.setTitle((CharSequence) getString(2131899175));
        toolbar.setBackgroundResource(C108955ca.A02(AnonymousClass3MY.A04(toolbar)));
        toolbar.setNavigationOnClickListener(new AnonymousClass782(this, 36));
        toolbar.A0Q(this, 2132083960);
        setSupportActionBar(toolbar);
        AnonymousClass3MZ.A1H(AnonymousClass3MW.A0A(this.A0B), this, 37);
        AnonymousClass3MZ.A1H(AnonymousClass3MW.A0A(this.A07), this, 38);
        C18100vl r5 = this.A08;
        if (((AnonymousClass72E) ((MetaAiPremiumViewModel) r5.getValue()).A01.get()).A04()) {
            C110885hR.A0A(this, 2131434036).setVisibility(0);
        }
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            String A032 = AnonymousClass3MW.A0W(r0).A03();
            AnonymousClass00H r02 = this.A00;
            if (r02 != null) {
                String A042 = AnonymousClass3MW.A0W(r02).A04();
                TextView textView = (TextView) C110885hR.A0A(this, 2131428095);
                AnonymousClass00H r03 = this.A03;
                if (r03 != null) {
                    textView.setText(((AnonymousClass118) r03.get()).A02(2131892113, A032));
                    TextView textView2 = (TextView) C110885hR.A0A(this, 2131434035);
                    AnonymousClass00H r04 = this.A03;
                    if (r04 != null) {
                        textView2.setText(((AnonymousClass118) r04.get()).A02(2131892198, A042));
                        AnonymousClass7AT.A01(this, ((MetaAiPremiumViewModel) r5.getValue()).A00, C108945cZ.A1K(this, 5), 12);
                        return;
                    }
                }
                str = "waContext";
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "bonsaiUiUtil";
        C18070vi.A11(str);
        throw null;
    }

    public MetaAiPremiumModelSettingActivity() {
        this(0);
        this.A0B = AnonymousClass1DF.A01(new C148717ht(this));
        this.A07 = AnonymousClass1DF.A01(new C148687hq(this));
        this.A0A = AnonymousClass1DF.A01(new C148707hs(this));
        this.A06 = AnonymousClass1DF.A01(new C148677hp(this));
        this.A09 = AnonymousClass1DF.A01(new C148697hr(this));
        this.A08 = C99274sY.A00(new C148737hv(this), new C148727hu(this), new C155247sR(this), AnonymousClass3MW.A15(MetaAiPremiumViewModel.class));
    }
}
