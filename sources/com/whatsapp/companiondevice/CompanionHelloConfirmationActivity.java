package com.whatsapp.companiondevice;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C138746xc;
import X.C18070vi;
import X.C195219sz;
import X.C19880zA;
import X.C72473Md;
import X.C72483Me;
import X.C89894dC;
import X.C91004ez;
import android.os.Bundle;
import android.widget.TextView;

public final class CompanionHelloConfirmationActivity extends AnonymousClass1FY {
    public C19880zA A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;

    public CompanionHelloConfirmationActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = C000200d.A00(A0L.AD1);
            this.A00 = (C19880zA) A0L.A7g.get();
            this.A02 = C000200d.A00(A0L.AA1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624609);
        TextView A0E = AnonymousClass3Ma.A0E(this.A00, 2131429927);
        String stringExtra = getIntent().getStringExtra("companion_platform_display");
        if (stringExtra == null) {
            stringExtra = getString(2131886539);
        }
        C18070vi.A0b(stringExtra);
        AnonymousClass3MY.A1X(C72473Md.A0j(this, stringExtra, 2131886537), A0E);
        C89894dC.A00(C18070vi.A05(this.A00, 2131429338), this, 45);
        C89894dC.A00(C18070vi.A05(this.A00, 2131428815), this, 46);
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            C195219sz r3 = (C195219sz) r0.get();
            r3.A02(C138746xc.A00(getIntent().getStringExtra("companion_platform_id")), getIntent().getStringExtra("pairing_ref"), 11);
            r3.A01 = true;
            return;
        }
        C18070vi.A11("altPairingPrimaryStepLogger");
        throw null;
    }

    public CompanionHelloConfirmationActivity(int i) {
        this.A03 = false;
        C91004ez.A00(this, 13);
    }
}
