package com.whatsapp.registration.entercode;

import X.A5R;
import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass8BV;
import X.C161178Cc;
import X.C17880vN;
import X.C18070vi;
import X.C41731wy;
import X.C72463Mc;
import android.os.CountDownTimer;

public final class EnterCodeViewModel extends AnonymousClass1J2 {
    public CountDownTimer A00;
    public A5R A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0M(AnonymousClass000.A0h());
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0M(AnonymousClass8BV.A0Q());
    public final C41731wy A04 = new C41731wy("idle");
    public final AnonymousClass11P A05;

    public EnterCodeViewModel(AnonymousClass11P r3) {
        C18070vi.A0d(r3, 1);
        this.A05 = r3;
    }

    public final void A0T() {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A00 = null;
        this.A04.A0E("idle");
        this.A03.A0E(AnonymousClass8BV.A0Q());
        AnonymousClass3MY.A1M(this.A02, false);
    }

    public final void A0U(long j) {
        A0T();
        if (j < 1000) {
            A5R a5r = this.A01;
            if (a5r != null) {
                a5r.A04();
                return;
            }
        } else {
            C72463Mc.A1B(this.A02);
            this.A03.A0E(AnonymousClass8BV.A0Q());
            this.A04.A0E("running");
            A5R a5r2 = this.A01;
            if (a5r2 != null) {
                C17880vN.A1D(A5R.A01(a5r2).edit(), "com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time", System.currentTimeMillis() + j);
                this.A00 = new C161178Cc(this, j).start();
                return;
            }
        }
        C18070vi.A11("verifyPhoneNumberPrefs");
        throw null;
    }
}
