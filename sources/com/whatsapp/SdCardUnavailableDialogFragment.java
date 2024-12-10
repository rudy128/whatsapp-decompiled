package com.whatsapp;

import X.AnonymousClass00H;
import X.AnonymousClass11Z;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.C1411874q;
import X.C18070vi;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;

public final class SdCardUnavailableDialogFragment extends Hilt_SdCardUnavailableDialogFragment {
    public AnonymousClass00H A00;

    public Dialog A27(Bundle bundle) {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            r0.get();
            boolean A002 = AnonymousClass11Z.A00();
            C73203Rj A04 = AnonymousClass4a6.A04(this);
            int i = 2131894960;
            if (A002) {
                i = 2131894959;
            }
            A04.A0E(i);
            int i2 = 2131894958;
            if (A002) {
                i2 = 2131894957;
            }
            A04.A0D(i2);
            A04.setPositiveButton(2131899286, new C1411874q(5));
            return AnonymousClass3MY.A0L(A04);
        }
        C18070vi.A11("storageUtils");
        throw null;
    }
}
