package X;

import android.content.Intent;
import android.os.Bundle;

public final class BVP extends C3P {
    public C24345Bzg A00 = C24345Bzg.INITIAL;
    public boolean A01;
    public final C24345Bzg A02;

    public final void A00(Intent intent, Bundle bundle) {
        boolean z;
        C24345Bzg bzg;
        if (!(intent == null || (bzg = (C24345Bzg) intent.getSerializableExtra("previous_step")) == null)) {
            this.A00 = bzg;
        }
        if (bundle != null) {
            z = bundle.getBoolean("step_change_logged");
        } else {
            z = false;
        }
        this.A01 = z;
    }

    public final void A01(Bundle bundle) {
        bundle.putBoolean("step_change_logged", this.A01);
    }

    public BVP(C24345Bzg bzg) {
        this.A02 = bzg;
        C18070vi.A0d(bzg.text, 0);
    }
}
