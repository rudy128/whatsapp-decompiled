package com.whatsapp.registration.flashcall;

import X.AnonymousClass19D;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C108965cb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import android.os.CountDownTimer;

public final class FlashCallViewModel extends AnonymousClass1J2 {
    public CountDownTimer A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A02 = C108965cb.A0D(0);
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0M("idle");
    public final AnonymousClass19D A04;

    public FlashCallViewModel(AnonymousClass19D r3) {
        C18070vi.A0d(r3, 1);
        this.A04 = r3;
    }

    public final void A0T() {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A00 = null;
        this.A03.A0E("idle");
        AnonymousClass3MY.A1M(this.A01, false);
        if (C18020vd.A05(C18040vf.A02, this.A04, 8940)) {
            AnonymousClass3MX.A1K(this.A02, 0);
        }
    }
}
