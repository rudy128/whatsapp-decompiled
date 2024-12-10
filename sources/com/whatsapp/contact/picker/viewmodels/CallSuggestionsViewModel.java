package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass11P;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass3MW;
import X.AnonymousClass3VX;
import X.C102285Fw;
import X.C107185Ys;
import X.C175258yP;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C25511Om;
import X.EEF;
import java.util.Set;

public final class CallSuggestionsViewModel extends AnonymousClass3VX {
    public long A00;
    public Set A01 = C25511Om.A00;
    public EEF A02;
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final C107185Ys A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new C102285Fw(this));
    public final C18600wl A08;
    public final C175258yP A09;

    public void A0S() {
        this.A09.unregisterObserver(this);
    }

    public CallSuggestionsViewModel(C175258yP r2, C107185Ys r3, AnonymousClass11P r4, C18030ve r5, C18600wl r6) {
        C18070vi.A0w(r4, r2, r3, r5, r6);
        this.A05 = r4;
        this.A09 = r2;
        this.A04 = r3;
        this.A06 = r5;
        this.A08 = r6;
        r2.registerObserver(this);
        AnonymousClass3VX.A00(r2, this);
    }
}
