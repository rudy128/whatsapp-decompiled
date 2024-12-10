package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1VA;
import X.AnonymousClass3MW;
import X.AnonymousClass4L9;
import X.C18070vi;

public final class ReachoutTimelockViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass4L9 A01 = new AnonymousClass4L9(this);
    public final AnonymousClass1VA A02;

    public ReachoutTimelockViewModel(AnonymousClass1VA r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    public void A0S() {
        this.A02.unregisterObserver(this.A01);
    }
}
