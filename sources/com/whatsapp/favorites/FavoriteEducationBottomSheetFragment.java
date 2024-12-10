package com.whatsapp.favorites;

import X.AnonymousClass00H;
import X.AnonymousClass4AH;
import X.C139436yq;
import X.C18070vi;
import X.C89944dH;
import X.C90104dX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class FavoriteEducationBottomSheetFragment extends Hilt_FavoriteEducationBottomSheetFragment {
    public AnonymousClass00H A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625312, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        int i = A15().getInt("ENTRY_POINT", 6);
        C89944dH.A00(view.findViewById(2131429535), this, 6);
        C90104dX.A00(view.findViewById(2131432258), this, i, 18);
    }

    public void A2I(C139436yq r2) {
        C18070vi.A0d(r2, 0);
        r2.A00(AnonymousClass4AH.A00);
    }
}
