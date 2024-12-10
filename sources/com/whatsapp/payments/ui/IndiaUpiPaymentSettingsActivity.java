package com.whatsapp.payments.ui;

import X.A0F;
import X.A12;
import X.AGD;
import X.AX3;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass8BT;
import X.AnonymousClass8BX;
import X.AnonymousClass921;
import X.AnonymousClass9YW;
import X.C000200d;
import X.C010105w;
import X.C137116uw;
import X.C170628qP;
import X.C18020vd;
import X.C18040vf;
import X.C194529rs;
import X.C19954A0l;
import X.C20154A9q;
import X.C22462B8u;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;

public final class IndiaUpiPaymentSettingsActivity extends AnonymousClass921 {
    public A12 A00;
    public C170628qP A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public boolean A04;

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MY.A0Z(r2);
            this.A01 = AnonymousClass3Ma.A0q(r2);
            this.A02 = AnonymousClass8BT.A0h(r2);
            this.A00 = (A12) r1.A6g.get();
            this.A01 = (C170628qP) r2.AcW.get();
            this.A02 = C000200d.A00(r1.A7s);
            this.A03 = C000200d.A00(r1.ACO);
        }
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj A042;
        PaymentSettingsFragment paymentSettingsFragment = this.A03;
        if (paymentSettingsFragment instanceof IndiaUpiPaymentSettingsFragment) {
            if (i == 100) {
                A042 = AnonymousClass4a6.A04(paymentSettingsFragment);
                A042.A0D(2131893997);
                A042.A0T(false);
                C20154A9q.A00(A042, paymentSettingsFragment, 40, 2131899286);
                A042.A0E(2131893993);
            } else if (i == 101) {
                A042 = AnonymousClass4a6.A04(paymentSettingsFragment);
                A042.A0D(2131891441);
                A042.A0T(true);
                C20154A9q.A00(A042, paymentSettingsFragment, 41, 2131899286);
            }
            C010105w create = A042.create();
            if (create != null) {
                return create;
            }
        }
        return super.onCreateDialog(i);
    }

    public IndiaUpiPaymentSettingsActivity(int i) {
        this.A04 = false;
        AGD.A00(this, 15);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((A0F) this.A02.get()).A01((C22462B8u) null);
        if (C18020vd.A05(C18040vf.A02, this.A01.A02, 698)) {
            this.A01.A0B();
        }
        AnonymousClass8BX.A0u(this);
        if (getIntent().getBooleanExtra("extra_open_transaction_confirmation_fragment", false) && bundle == null) {
            ((C19954A0l) this.A03.get()).A00(this, new C194529rs(AnonymousClass3MY.A09(this), false, true), (AnonymousClass9YW) null);
            getIntent().putExtra("extra_open_transaction_confirmation_fragment", false);
        }
        this.A00.A01(new AX3(this, 3));
    }

    public void onResume() {
        super.onResume();
        if (this.A00.A02()) {
            A12.A00(this);
        }
    }

    public IndiaUpiPaymentSettingsActivity() {
        this(0);
    }
}
