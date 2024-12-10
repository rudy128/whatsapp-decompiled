package com.whatsapp.stickers.store;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1FL;
import X.AnonymousClass1SB;
import X.AnonymousClass4a6;
import X.AnonymousClass725;
import X.AnonymousClass758;
import X.C010105w;
import X.C108955ca;
import X.C1412274u;
import X.C17880vN;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;

public class ConfirmPackDeleteDialogFragment extends Hilt_ConfirmPackDeleteDialogFragment {
    public AnonymousClass1SB A00;
    public AnonymousClass00H A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment, com.whatsapp.stickers.store.Hilt_ConfirmPackDeleteDialogFragment, androidx.fragment.app.Fragment] */
    public static ConfirmPackDeleteDialogFragment A00(AnonymousClass725 r4) {
        ? hilt_ConfirmPackDeleteDialogFragment = new Hilt_ConfirmPackDeleteDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("pack_id", r4.A0H);
        A0D.putString("pack_name", r4.A04);
        hilt_ConfirmPackDeleteDialogFragment.A1R(A0D);
        return hilt_ConfirmPackDeleteDialogFragment;
    }

    public Dialog A27(Bundle bundle) {
        AnonymousClass1FL A1B = A1B();
        String A0s = C108955ca.A0s(A15(), "pack_id");
        String A0s2 = C108955ca.A0s(A15(), "pack_name");
        AnonymousClass758 r5 = new AnonymousClass758(this, 33);
        C1412274u r4 = new C1412274u(3, A0s, this);
        C73203Rj A002 = AnonymousClass4a6.A00(A1B);
        A002.A0S(A1I(2131896454, AnonymousClass000.A1b(A0s2, 1)));
        A002.setPositiveButton(2131896455, r4);
        A002.setNegativeButton(2131898766, r5);
        C010105w create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
