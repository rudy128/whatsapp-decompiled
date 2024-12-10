package com.whatsapp.calling.dialogs;

import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass868;
import X.C18070vi;
import X.C18100vl;
import X.C73203Rj;
import X.C88414Zp;
import X.C98414r6;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.voipcalling.VoipActivityV2;

public final class MessageDialogFragment extends Hilt_MessageDialogFragment {
    public AnonymousClass868 A00;

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass868 r1 = this.A00;
        if (r1 != null) {
            C98414r6 r12 = (C98414r6) r1;
            switch (r12.A00) {
                case 0:
                    AnonymousClass3MW.A1U(r12.A01);
                    return;
                case 1:
                    ((VoipActivityV2) r12.A01).A0Q = null;
                    return;
                default:
                    VoipActivityV2 voipActivityV2 = (VoipActivityV2) r12.A01;
                    voipActivityV2.A0Q = null;
                    if (!voipActivityV2.A11.A01()) {
                        voipActivityV2.finish();
                        return;
                    }
                    return;
            }
        }
    }

    public Dialog A27(Bundle bundle) {
        Context A14 = A14();
        C18100vl A02 = C88414Zp.A02(this, "message");
        C73203Rj A002 = AnonymousClass4a6.A00(A14);
        A002.A0S(AnonymousClass3MW.A0y(A02));
        A002.A0T(true);
        C73203Rj.A09(A002, this, 27, 2131899286);
        return AnonymousClass3MY.A0L(A002);
    }
}
