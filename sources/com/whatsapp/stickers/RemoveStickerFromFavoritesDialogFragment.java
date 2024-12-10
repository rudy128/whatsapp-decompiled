package com.whatsapp.stickers;

import X.AnonymousClass1FL;
import X.AnonymousClass1SB;
import X.AnonymousClass4a6;
import X.C010105w;
import X.C1418377d;
import X.C18070vi;
import X.C73203Rj;
import X.C88814ar;
import android.app.Dialog;
import android.os.Bundle;

public final class RemoveStickerFromFavoritesDialogFragment extends Hilt_RemoveStickerFromFavoritesDialogFragment {
    public C1418377d A00;
    public AnonymousClass1SB A01;

    public Dialog A27(Bundle bundle) {
        AnonymousClass1FL A1D = A1D();
        this.A00 = (C1418377d) A15().getParcelable("sticker");
        C73203Rj A002 = AnonymousClass4a6.A00(A1D);
        A002.A0D(2131896481);
        C010105w A003 = C73203Rj.A00(new C88814ar(this, 22), A002, 2131899460);
        C18070vi.A0X(A003);
        return A003;
    }
}
