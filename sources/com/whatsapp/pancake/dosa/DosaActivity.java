package com.whatsapp.pancake.dosa;

import X.AnonymousClass10E;
import X.AnonymousClass1FP;
import X.AnonymousClass1K1;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C108955ca;
import X.C108975cc;
import X.C122496Qp;
import X.C1423279a;
import X.C152797oU;
import X.C152807oV;
import X.C156507uT;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C37561pk;
import X.C72463Mc;
import X.C99274sY;
import android.content.Intent;
import android.os.Bundle;

public final class DosaActivity extends AnonymousClass1FP {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C18100vl A03;

    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        A00(intent);
    }

    private final void A00(Intent intent) {
        C122496Qp r3;
        if (intent.hasExtra("geVerificationResult")) {
            String stringExtra = intent.getStringExtra("geVerificationResult");
            if (C18070vi.A18(stringExtra, "APPROVE")) {
                r3 = C122496Qp.APPROVE;
            } else if (C18070vi.A18(stringExtra, "REJECT")) {
                r3 = C122496Qp.REJECT;
            } else {
                r3 = C122496Qp.ABANDON;
            }
            AnonymousClass3MX.A1Q(new DosaActivity$processIntent$1(r3, this, (C30391dr) null), C37561pk.A00(getLifecycle()));
            return;
        }
        String stringExtra2 = intent.getStringExtra("appealToken");
        long A05 = C108975cc.A05(intent, "expireTimeout");
        if (stringExtra2 != null) {
            AnonymousClass3MX.A1Q(new DosaActivity$processIntent$2$1(this, stringExtra2, (C30391dr) null, A05), C37561pk.A00(getLifecycle()));
        }
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            this.A01 = AnonymousClass1K1.A1X(A0K);
            this.A05 = AnonymousClass10E.AL1(A0K.AAQ);
        }
    }

    public void onBackPressed() {
        if (this.A01) {
            AnonymousClass1L9.A02(this);
        } else {
            super.onBackPressed();
        }
    }

    public DosaActivity(int i) {
        this.A02 = false;
        C1423279a.A00(this, 22);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624632);
        C72463Mc.A0t(this);
        C37561pk.A00(getLifecycle()).A00(new DosaActivity$onCreate$1(this, (C30391dr) null));
        Intent intent = getIntent();
        C18070vi.A0X(intent);
        A00(intent);
    }

    public DosaActivity() {
        this(0);
        this.A03 = C99274sY.A00(new C152807oV(this), new C152797oU(this), new C156507uT(this), AnonymousClass3MW.A15(DosaNavigationViewModel.class));
    }
}
