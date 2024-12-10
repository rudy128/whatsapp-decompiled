package com.whatsapp.events;

import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.C1411874q;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.base.WaDialogFragment;

public final class EventRemindersDialogFragment extends WaDialogFragment {
    public Dialog A27(Bundle bundle) {
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        A04.A0E(2131890126);
        A04.setPositiveButton(2131899286, new C1411874q(20));
        A04.setNegativeButton(2131898766, new C1411874q(21));
        A04.setView(AnonymousClass3MX.A09(AnonymousClass3MZ.A0E(this), (ViewGroup) null, 2131625093));
        return AnonymousClass3MY.A0L(A04);
    }
}
