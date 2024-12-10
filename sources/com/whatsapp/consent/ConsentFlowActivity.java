package com.whatsapp.consent;

import X.A9B;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass79Z;
import X.C108955ca;
import X.C109005cf;
import X.C149297ip;
import X.C149307iq;
import X.C155467sn;
import X.C18070vi;
import X.C18100vl;
import X.C29491cN;
import X.C30391dr;
import X.C31361fR;
import X.C37561pk;
import X.C72463Mc;
import X.C99274sY;
import android.os.Bundle;
import com.whatsapp.util.Log;

public final class ConsentFlowActivity extends AnonymousClass1FY {
    public C31361fR A00;
    public C29491cN A01;
    public AnonymousClass1LU A02;
    public boolean A03;
    public boolean A04;
    public final C18100vl A05;

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A01 = (C29491cN) A0A.A08.get();
            this.A00 = (C31361fR) A0A.A1z.get();
            this.A02 = AnonymousClass3MY.A0Z(A0A);
        }
    }

    public void onBackPressed() {
        String str;
        C29491cN r1 = this.A01;
        if (r1 != null) {
            C31361fR r0 = this.A00;
            if (r0 == null) {
                str = "changeNumberManager";
            } else if (r1.A0J(r0.A02())) {
                Log.i("ConsentFlowActivity/onBackPressed: isAddingNewAccount");
                A9B.A0J(this, this.A0A, this.A0B);
                return;
            } else {
                return;
            }
        } else {
            str = "accountSwitcher";
        }
        C18070vi.A11(str);
        throw null;
    }

    public ConsentFlowActivity(int i) {
        this.A04 = false;
        AnonymousClass79Z.A00(this, 34);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A03 = AnonymousClass3MY.A1a(getIntent(), "isAccountTransfer");
        setContentView(2131624632);
        C72463Mc.A0t(this);
        C37561pk.A00(getLifecycle()).A00(new ConsentFlowActivity$onCreate$1(this, (C30391dr) null));
    }

    public ConsentFlowActivity() {
        this(0);
        this.A05 = C99274sY.A00(new C149307iq(this), new C149297ip(this), new C155467sn(this), AnonymousClass3MW.A15(ConsentNavigationViewModel.class));
    }
}
