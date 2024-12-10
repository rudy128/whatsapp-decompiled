package com.whatsapp.registration.phonenumberentry.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass19D;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.AnonymousClass99V;
import X.AnonymousClass99W;
import X.C18070vi;
import X.C30391dr;
import X.C41561wd;
import android.app.Activity;
import com.whatsapp.util.Log;

public final class PasskeyLoginViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00;
    public final AnonymousClass19D A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass1DS A05;

    public final void A0T(Activity activity, String str) {
        if (str == null || str.length() == 0) {
            Log.e("PasskeyViewModel/passkeyEvent/invalidCode");
            this.A00.A0E(AnonymousClass99V.A00);
            return;
        }
        Log.i("PasskeyViewModel/passkeyLoginEvent/passkey_start_login_success");
        AnonymousClass8BR.A0q(this.A02).A0G("enter_number", "passkey_start_login_success");
        AnonymousClass3MX.A1Q(new PasskeyLoginViewModel$startPasskeyFlow$1(activity, this, str, (C30391dr) null), C41561wd.A00(this));
    }

    public PasskeyLoginViewModel(AnonymousClass19D r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r3, r4, r5, r2);
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A01 = r2;
        AnonymousClass1DT A0M = AnonymousClass3MW.A0M(AnonymousClass99W.A00);
        this.A00 = A0M;
        this.A05 = A0M;
    }
}
