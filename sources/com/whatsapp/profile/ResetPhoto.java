package com.whatsapp.profile;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1FL;
import X.AnonymousClass1FP;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass4bB;
import X.C17880vN;
import X.C19880zA;
import X.C19890zB;
import X.C72453Mb;
import X.C72473Md;
import X.C73203Rj;
import X.C91024f1;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class ResetPhoto extends AnonymousClass1FP {
    public C19880zA A00;
    public boolean A01;

    public class ConfirmDialogFragment extends Hilt_ResetPhoto_ConfirmDialogFragment {
        public C19880zA A00;

        public Dialog A27(Bundle bundle) {
            Bundle bundle2 = this.A06;
            int i = 0;
            if (bundle2 != null) {
                i = bundle2.getInt("photo_type", 0);
            }
            C73203Rj A03 = AnonymousClass4a6.A03(this);
            if (i == 1) {
                this.A00.A03();
                throw AnonymousClass000.A0s("getRemoveCoverPhotoConfirmationStringId");
            }
            A03.A0D(2131895136);
            A03.A0T(true);
            A03.A0X(new AnonymousClass4bB(this, 37), 2131895137);
            C73203Rj.A0A(A03, this, 38, 2131895138);
            return A03.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            AnonymousClass1FL A1B = A1B();
            if (A1B != null && !AnonymousClass4Yv.A02(A1B)) {
                A1B.finish();
                A1B.overridePendingTransition(17432576, 17432577);
            }
        }
    }

    public ResetPhoto() {
        this(0);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            this.A05 = AnonymousClass10E.AL1(C72473Md.A0L(this));
            this.A00 = C19890zB.A00;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("photo_type", 0);
        if (intExtra == 1) {
            this.A00.A03();
            throw AnonymousClass000.A0s("getRemoveCoverPhotoStringId");
        }
        setTitle(2131895135);
        if (bundle == null) {
            Hilt_ResetPhoto_ConfirmDialogFragment hilt_ResetPhoto_ConfirmDialogFragment = new Hilt_ResetPhoto_ConfirmDialogFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putInt("photo_type", intExtra);
            hilt_ResetPhoto_ConfirmDialogFragment.A1R(A0D);
            C72453Mb.A1I(hilt_ResetPhoto_ConfirmDialogFragment, this);
        }
    }

    public ResetPhoto(int i) {
        this.A01 = false;
        C91024f1.A00(this, 37);
    }
}
