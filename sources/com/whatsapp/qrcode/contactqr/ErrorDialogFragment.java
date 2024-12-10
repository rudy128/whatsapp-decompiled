package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.C107625aK;
import X.C18070vi;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ErrorDialogFragment extends Hilt_ErrorDialogFragment {
    public C107625aK A00;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof C107625aK) {
            this.A00 = (C107625aK) context;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C107625aK r0 = this.A00;
        if (r0 != null) {
            r0.C2J();
        }
    }

    public void A1K() {
        super.A1K();
        this.A00 = null;
    }

    public Dialog A27(Bundle bundle) {
        int i;
        int i2 = A15().getInt("ARG_ERROR_CODE");
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.setPositiveButton(2131899286, (DialogInterface.OnClickListener) null);
        switch (i2) {
            case 2:
                A03.A0E(2131888851);
                String A16 = AnonymousClass3MX.A16(this, "https://whatsapp.com/android", AnonymousClass3MW.A1a(), 0, 2131888850);
                C18070vi.A0b(A16);
                A03.A0S(A16);
                break;
            case 3:
                i = 2131888840;
                break;
            case 4:
                i = 2131894865;
                break;
            case 5:
                i = 2131894864;
                break;
            case 6:
                i = 2131888841;
                break;
            case 7:
                i = 2131891440;
                break;
            default:
                i = 2131888839;
                break;
        }
        A03.A0D(i);
        return AnonymousClass3MY.A0L(A03);
    }
}
