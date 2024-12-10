package com.whatsapp.payments.ui.international;

import X.AZ6;
import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass3MW;
import X.AnonymousClass8FK;
import X.C18030ve;
import X.C18070vi;
import X.C194559rv;
import X.C19968A1d;
import X.C41731wy;
import android.app.Application;

public final class IndiaUpiInternationalValidateQrViewModel extends AnonymousClass8FK {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0M(new C19968A1d((C194559rv) null, false));
    public final C18030ve A01;
    public final AZ6 A02;
    public final C41731wy A03 = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndiaUpiInternationalValidateQrViewModel(Application application, C18030ve r5, AZ6 az6, AnonymousClass00H r7) {
        super(application);
        C18070vi.A0s(application, r5, r7, az6);
        this.A01 = r5;
        this.A04 = r7;
        this.A02 = az6;
    }
}
