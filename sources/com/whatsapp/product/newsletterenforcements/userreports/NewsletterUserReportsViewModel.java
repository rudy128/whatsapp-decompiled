package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass00H;
import X.AnonymousClass11E;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C18600wl;
import X.C201811d;
import X.C41731wy;
import X.C85054Lx;
import com.whatsapp.util.Log;

public final class NewsletterUserReportsViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass11E A01;
    public final C41731wy A02 = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04 = C201811d.A00(16429);
    public final AnonymousClass1M9 A05;
    public final C18600wl A06;

    public void A0S() {
        Log.i("onCleared");
        ((C85054Lx) this.A04.get()).A00.clear();
    }

    public NewsletterUserReportsViewModel(AnonymousClass11E r2, AnonymousClass1M9 r3, AnonymousClass00H r4, C18600wl r5) {
        C18070vi.A0s(r3, r2, r5, r4);
        this.A05 = r3;
        this.A01 = r2;
        this.A06 = r5;
        this.A03 = r4;
    }
}
