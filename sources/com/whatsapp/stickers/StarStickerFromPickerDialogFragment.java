package com.whatsapp.stickers;

import X.AnonymousClass1FL;
import X.AnonymousClass1SB;
import X.AnonymousClass4a6;
import X.AnonymousClass758;
import X.AnonymousClass75D;
import X.C010105w;
import X.C1418377d;
import X.C17960vV;
import X.C25311Ns;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;

public class StarStickerFromPickerDialogFragment extends Hilt_StarStickerFromPickerDialogFragment {
    public C25311Ns A00;
    public C1418377d A01;
    public AnonymousClass1SB A02;

    public Dialog A27(Bundle bundle) {
        AnonymousClass1FL A1D = A1D();
        Parcelable parcelable = A15().getParcelable("sticker");
        C17960vV.A07(parcelable);
        this.A01 = (C1418377d) parcelable;
        C73203Rj A002 = AnonymousClass4a6.A00(A1D);
        A002.A0D(2131896483);
        String A1H = A1H(2131896482);
        A002.A0L(new AnonymousClass758(this, 31), A1H);
        A002.setNegativeButton(2131898766, (DialogInterface.OnClickListener) null);
        C010105w create = A002.create();
        create.setOnShowListener(new AnonymousClass75D(create, A1H));
        return create;
    }

    public void A1x(Context context) {
        super.A1x(context);
    }
}
