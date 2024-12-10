package com.whatsapp.mediacomposer.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass3MY;
import X.C108945cZ;
import X.C108975cc;
import X.C18070vi;
import X.C18600wl;
import X.C218617r;
import X.C30391dr;
import X.C41561wd;

public final class StickerComposerViewModel extends AnonymousClass1J2 {
    public int A00;
    public AnonymousClass1OB A01;
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final AnonymousClass1DT A03 = C108945cZ.A0S();
    public final AnonymousClass1DT A04 = C108945cZ.A0S();
    public final C218617r A05;
    public final AnonymousClass00H A06;
    public final C18600wl A07;
    public final C18600wl A08;

    public final void A0T(int i) {
        this.A00 = Math.max(i, this.A00);
        C30391dr A0j = C108975cc.A0j(this.A01);
        this.A01 = AnonymousClass3MY.A0s(new StickerComposerViewModel$runProgress$1(this, A0j), C41561wd.A00(this));
    }

    public StickerComposerViewModel(C218617r r2, AnonymousClass00H r3, C18600wl r4, C18600wl r5) {
        C18070vi.A0s(r2, r3, r4, r5);
        this.A05 = r2;
        this.A06 = r3;
        this.A07 = r4;
        this.A08 = r5;
    }
}
