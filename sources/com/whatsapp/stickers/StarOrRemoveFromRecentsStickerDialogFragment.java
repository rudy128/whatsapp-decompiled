package com.whatsapp.stickers;

import X.AnonymousClass00H;
import X.AnonymousClass1FL;
import X.AnonymousClass1SB;
import X.AnonymousClass4a6;
import X.C1412174t;
import X.C1418377d;
import X.C17880vN;
import X.C17960vV;
import X.C26811To;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;

public class StarOrRemoveFromRecentsStickerDialogFragment extends Hilt_StarOrRemoveFromRecentsStickerDialogFragment {
    public C26811To A00;
    public C1418377d A01;
    public AnonymousClass1SB A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.stickers.Hilt_StarOrRemoveFromRecentsStickerDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment] */
    public static StarOrRemoveFromRecentsStickerDialogFragment A00(C1418377d r3, boolean z) {
        ? hilt_StarOrRemoveFromRecentsStickerDialogFragment = new Hilt_StarOrRemoveFromRecentsStickerDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("sticker", r3);
        A0D.putBoolean("avatar_sticker", z);
        hilt_StarOrRemoveFromRecentsStickerDialogFragment.A1R(A0D);
        return hilt_StarOrRemoveFromRecentsStickerDialogFragment;
    }

    public Dialog A27(Bundle bundle) {
        AnonymousClass1FL A1D = A1D();
        Bundle A15 = A15();
        Parcelable parcelable = A15.getParcelable("sticker");
        C17960vV.A07(parcelable);
        this.A01 = (C1418377d) parcelable;
        C1412174t r2 = new C1412174t(2, this, A15.getBoolean("avatar_sticker", false));
        C73203Rj A002 = AnonymousClass4a6.A00(A1D);
        A002.A0D(2131896483);
        A002.setPositiveButton(2131896482, r2);
        A002.A0Y(r2, 2131896480);
        A002.setNegativeButton(2131898766, r2);
        return A002.create();
    }
}
