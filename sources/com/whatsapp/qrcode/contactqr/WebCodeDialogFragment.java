package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass00H;
import X.AnonymousClass3MX;
import X.AnonymousClass4a6;
import X.AnonymousClass4bB;
import X.C107625aK;
import X.C19880zA;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class WebCodeDialogFragment extends Hilt_WebCodeDialogFragment {
    public C19880zA A00;
    public AnonymousClass00H A01;
    public C107625aK A02;

    public void A1K() {
        this.A02 = null;
        super.A1K();
    }

    public void A1x(Context context) {
        super.A1x(context);
        if (context instanceof C107625aK) {
            this.A02 = (C107625aK) context;
        }
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0E(2131894862);
        A03.A0D(2131894861);
        AnonymousClass4bB.A00(A03, this, 42, 2131887451);
        return AnonymousClass3MX.A0N((DialogInterface.OnClickListener) null, A03, 2131898766);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C107625aK r0 = this.A02;
        if (r0 != null) {
            r0.C2J();
        }
    }
}
