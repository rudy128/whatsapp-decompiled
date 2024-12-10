package com.whatsapp.profile;

import X.AnonymousClass10E;
import X.AnonymousClass1FL;
import X.AnonymousClass1FP;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4bB;
import X.C17880vN;
import X.C72473Md;
import X.C73203Rj;
import X.C91024f1;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class ResetGroupPhoto extends AnonymousClass1FP {
    public boolean A00;

    public ResetGroupPhoto() {
        this(0);
    }

    public class ConfirmDialogFragment extends Hilt_ResetGroupPhoto_ConfirmDialogFragment {
        public Dialog A27(Bundle bundle) {
            int i = A15().getInt("PROMPT_RES_ID_KEY", -1);
            if (i == -1) {
                i = 2131895127;
            }
            C73203Rj A03 = AnonymousClass4a6.A03(this);
            A03.A0D(i);
            A03.A0T(true);
            A03.A0X(new AnonymousClass4bB(this, 35), 2131898766);
            C73203Rj.A0A(A03, this, 36, 2131895092);
            return A03.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                A1B.finish();
                A1B.overridePendingTransition(17432576, 17432577);
            }
        }
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            this.A05 = AnonymousClass10E.AL1(C72473Md.A0L(this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131895134);
        int intExtra = getIntent().getIntExtra("PROMPT_RES_ID_KEY", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        if (intExtra == -1) {
            valueOf = null;
        }
        if (bundle == null) {
            Hilt_ResetGroupPhoto_ConfirmDialogFragment hilt_ResetGroupPhoto_ConfirmDialogFragment = new Hilt_ResetGroupPhoto_ConfirmDialogFragment();
            Bundle A0D = C17880vN.A0D();
            if (valueOf != null) {
                A0D.putInt("PROMPT_RES_ID_KEY", valueOf.intValue());
            }
            hilt_ResetGroupPhoto_ConfirmDialogFragment.A1R(A0D);
            AnonymousClass3MY.A1H(hilt_ResetGroupPhoto_ConfirmDialogFragment, this, (String) null);
        }
    }

    public ResetGroupPhoto(int i) {
        this.A00 = false;
        C91024f1.A00(this, 36);
    }
}
