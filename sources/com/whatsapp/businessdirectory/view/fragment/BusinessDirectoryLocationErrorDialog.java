package com.whatsapp.businessdirectory.view.fragment;

import X.A5L;
import X.AFN;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.C010105w;
import X.C108365ba;
import X.C18070vi;
import X.C20041A4k;
import X.C73203Rj;
import X.C89994dM;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

public final class BusinessDirectoryLocationErrorDialog extends Hilt_BusinessDirectoryLocationErrorDialog {
    public A5L A00;
    public C20041A4k A01;
    public C108365ba A02;
    public boolean A03;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        Fragment fragment = this.A0E;
        if (fragment instanceof C108365ba) {
            this.A02 = (C108365ba) fragment;
        }
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        bundle.putBoolean("saved_state_settings_clicked", this.A03);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        C108365ba r0 = this.A02;
        if (r0 != null) {
            r0.BtI();
        }
    }

    public void A1K() {
        super.A1K();
        this.A02 = null;
    }

    public void A1u() {
        super.A1u();
        if (this.A03) {
            this.A03 = false;
            C108365ba r0 = this.A02;
            if (r0 != null) {
                r0.C40();
            }
            A28();
        }
    }

    public Dialog A27(Bundle bundle) {
        View A08 = AnonymousClass3MX.A08(A1n(), 2131625095);
        C73203Rj A032 = AnonymousClass4a6.A03(this);
        A032.A0c(A08);
        A032.A0T(true);
        C010105w A0L = AnonymousClass3MY.A0L(A032);
        View A05 = C18070vi.A05(A08, 2131428444);
        View A052 = C18070vi.A05(A08, 2131428450);
        View A053 = C18070vi.A05(A08, 2131428434);
        A0L.setCanceledOnTouchOutside(true);
        C89994dM.A00(A05, this, A0L, 3);
        A052.setOnClickListener(new AFN(this, 24));
        C89994dM.A00(A053, this, A0L, 4);
        if (bundle != null && bundle.getBoolean("saved_state_settings_clicked", false)) {
            this.A03 = true;
        }
        return A0L;
    }
}
