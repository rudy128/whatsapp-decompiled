package com.whatsapp.tosgating.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass4WY;
import X.C17880vN;
import X.C18070vi;

public final class ToSGatingViewModel extends AnonymousClass1J2 {
    public boolean A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass4WY A02 = new AnonymousClass4WY(this);
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public void A0S() {
        C17880vN.A0V(this.A07).unregisterObserver(this.A02);
    }

    public ToSGatingViewModel(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A03 = r2;
        this.A06 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A08 = r7;
    }
}
