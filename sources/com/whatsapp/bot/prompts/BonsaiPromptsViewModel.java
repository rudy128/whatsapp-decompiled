package com.whatsapp.bot.prompts;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1BI;
import X.AnonymousClass1J2;
import X.AnonymousClass1NK;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C18460wS;
import X.C24681Lg;
import X.C33251iW;
import X.C41111vp;
import X.C446324e;
import X.C95504mL;

public final class BonsaiPromptsViewModel extends AnonymousClass1J2 {
    public AnonymousClass1BI A00;
    public final C95504mL A01 = new C95504mL(this, 2);
    public final C33251iW A02;
    public final C24681Lg A03;
    public final AnonymousClass1NK A04;
    public final C41111vp A05 = AnonymousClass3MW.A0n(C18460wS.A00);
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;
    public volatile C446324e A08;

    public void A0S() {
        this.A03.unregisterObserver(this.A01);
    }

    public BonsaiPromptsViewModel(C33251iW r3, C24681Lg r4, AnonymousClass1NK r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        C18070vi.A0w(r6, r5, r3, r4, r7);
        this.A06 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r7;
    }
}
