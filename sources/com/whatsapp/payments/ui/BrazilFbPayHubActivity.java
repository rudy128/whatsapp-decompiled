package com.whatsapp.payments.ui;

import X.A0R;
import X.A4K;
import X.A5H;
import X.A5Y;
import X.A8e;
import X.AGC;
import X.AXR;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1QO;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8k7;
import X.AnonymousClass91F;
import X.BDt;
import X.C000200d;
import X.C137116uw;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C195929uA;
import X.C20037A4g;
import X.C20110A7s;
import X.C20284AEs;
import X.C31051ew;
import X.C33301ib;
import X.C33311ic;
import X.C33651jA;
import X.C63662tU;
import X.C63932tv;
import android.content.Intent;
import android.view.View;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrazilFbPayHubActivity extends AnonymousClass91F implements BDt {
    public AXR A00;
    public C20110A7s A01;
    public AnonymousClass1QO A02;
    public A5H A03;
    public A4K A04;
    public C195929uA A05;
    public C20037A4g A06;
    public A5Y A07;
    public A0R A08;
    public AnonymousClass00H A09;
    public boolean A0A;

    public boolean CMD() {
        return true;
    }

    public boolean CMH() {
        return true;
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r2 = r3.A00;
            C63932tv.A01(r3, r2, this);
            C63662tU.A00(r3, r2, this, r2.A5A);
            this.A08 = AnonymousClass3MZ.A0z(r3);
            this.A06 = AnonymousClass8BU.A0Q(r3);
            this.A07 = AnonymousClass8BU.A0R(r3);
            this.A09 = (C33651jA) r3.A8B.get();
            this.A03 = AnonymousClass8BT.A0R(r3);
            this.A0D = C000200d.A00(r3.A8C);
            this.A04 = (C31051ew) r3.Ace.get();
            this.A02 = (C33301ib) r3.A6m.get();
            this.A05 = (C33311ic) r3.A88.get();
            this.A04 = (A4K) r2.AET.get();
            this.A00 = (AXR) r2.A6y.get();
            this.A06 = (C20037A4g) r2.A71.get();
            this.A05 = (C195929uA) r2.AEU.get();
            this.A02 = AnonymousClass3Ma.A0q(r3);
            this.A09 = C000200d.A00(r3.A87);
            this.A01 = r2.A8N();
            this.A03 = (A5H) r2.AER.get();
            this.A07 = (A5Y) r2.A7B.get();
            this.A08 = AnonymousClass1K1.A1T(A002);
        }
    }

    public String BUt(C20284AEs aEs) {
        return AnonymousClass8BR.A0c(this.A09).A02(aEs);
    }

    public void Bl5(boolean z) {
        String A012 = A5Y.A01(this.A07, "generic_context", false);
        Intent A032 = AnonymousClass8BS.A03(this);
        AnonymousClass8k7.A03(A032, "onboarding_context", "generic_context");
        AnonymousClass8k7.A03(A032, "referral_screen", "fbpay_payment_settings");
        if (A012 != null) {
            A032.putExtra("screen_name", A012);
        } else {
            AnonymousClass8k7.A03(A032, "verification_needed", AnonymousClass8BS.A0b(z ? 1 : 0));
            A032.putExtra("screen_name", "brpay_p_add_card");
        }
        A3q(A032, false);
    }

    public void CJw(boolean z) {
        C18030ve r1 = this.A02.A02;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 10897) || C18020vd.A05(r2, this.A02.A02, 10896)) {
            z = false;
        }
        super.CJw(z);
    }

    public BrazilFbPayHubActivity(int i) {
        this.A0A = false;
        AGC.A00(this, 16);
    }

    public /* synthetic */ int BUr(C20284AEs aEs) {
        return 0;
    }

    public void C0I(C20284AEs aEs) {
        if (aEs.A05() != 5) {
            startActivity(AnonymousClass8BW.A09(this, aEs, BrazilPaymentCardDetailsActivity.class));
        }
    }

    public /* synthetic */ boolean CLr(C20284AEs aEs) {
        return false;
    }

    public void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
        if (A8e.A08(aEs)) {
            this.A06.A02(aEs, paymentMethodRow);
        }
    }

    public void CR0(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20284AEs A0P = AnonymousClass8BR.A0P(it);
            int A052 = A0P.A05();
            if (A052 == 5 || A052 == 9) {
                A13.add(A0P);
            } else {
                A132.add(A0P);
            }
        }
        if (this.A02.A01()) {
            if (!C18020vd.A05(C18040vf.A02, this.A02.A02, 10897)) {
                boolean isEmpty = A132.isEmpty();
                View view = this.A0G;
                if (isEmpty) {
                    view.setVisibility(8);
                    this.A0H.setVisibility(0);
                } else {
                    view.setVisibility(0);
                    this.A0H.setVisibility(8);
                }
            }
        }
        super.CR0(A132);
    }

    public void onResume() {
        super.onResume();
        if (!this.A07.A03.A03()) {
            finish();
        }
    }

    public BrazilFbPayHubActivity() {
        this(0);
    }
}
