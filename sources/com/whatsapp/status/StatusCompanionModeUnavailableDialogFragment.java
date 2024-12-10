package com.whatsapp.status;

import X.AnonymousClass1FL;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass758;
import X.C17890vO;
import X.C18070vi;
import X.C34601kl;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.base.WaDialogFragment;

public final class StatusCompanionModeUnavailableDialogFragment extends WaDialogFragment {
    public C34601kl A00;

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C34601kl r0 = this.A00;
        if (r0 != null) {
            r0.BrY(false);
        }
    }

    public Dialog A27(Bundle bundle) {
        C34601kl r0 = this.A00;
        if (r0 != null) {
            r0.BrY(true);
        }
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            C73203Rj A002 = AnonymousClass4a6.A00(A1B);
            A002.A0E(2131896331);
            A002.A0D(2131896330);
            A002.A0T(true);
            AnonymousClass758.A01(A002, this, 15, 2131899286);
            return AnonymousClass3MY.A0L(A002);
        }
        throw C17890vO.A0K();
    }

    public void A1r() {
        super.A1r();
        this.A00 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        try {
            Fragment A19 = A19();
            C18070vi.A0z(A19, "null cannot be cast to non-null type com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment.Host");
            this.A00 = (C34601kl) A19;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }
}
