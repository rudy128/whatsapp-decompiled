package com.whatsapp.polls.creator;

import X.AGE;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.C137116uw;
import X.C166938eL;
import X.C63662tU;
import X.C63932tv;

public final class PollCreatorBottomSheetActivity extends PollCreatorActivity {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            C166938eL.A03(A002, r1, this);
        }
    }

    public PollCreatorBottomSheetActivity(int i) {
        this.A00 = false;
        AGE.A00(this, 12);
    }

    public PollCreatorBottomSheetActivity() {
        this(0);
    }
}
