package com.whatsapp.bizintegrity.callpermission;

import X.AGB;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1FP;
import X.C137116uw;
import X.C18100vl;
import X.C183009Wo;
import X.C183989aE;
import X.C21855Ath;
import X.C21856Ati;
import X.C21857Atj;
import X.C21858Atk;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class BizCallbackActivity extends AnonymousClass1FP {
    public C183989aE A00;
    public boolean A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E r1 = C137116uw.A00(this).AAQ;
            this.A05 = AnonymousClass10E.AL1(r1);
            this.A00 = (C183989aE) r1.AGf.get();
        }
    }

    public BizCallbackActivity(int i) {
        this.A01 = false;
        AGB.A00(this, 23);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18100vl r2 = this.A03;
        ((CallPermissionRequestBottomSheet) r2.getValue()).A05 = new C183009Wo(this);
        ((DialogFragment) r2.getValue()).A2C(getSupportFragmentManager(), "CallPermissionRequestBottomSheet");
    }

    public BizCallbackActivity() {
        this(0);
        this.A04 = AnonymousClass1DF.A01(new C21857Atj(this));
        this.A05 = AnonymousClass1DF.A01(new C21858Atk(this));
        this.A02 = AnonymousClass1DF.A01(new C21855Ath(this));
        this.A03 = AnonymousClass1DF.A01(new C21856Ati(this));
    }
}
