package com.whatsapp.profile.coinflip.edit;

import X.AnonymousClass00R;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass5KX;
import X.AnonymousClass5KY;
import X.AnonymousClass5KZ;
import X.C105945Ty;
import X.C105955Tz;
import X.C156787uv;
import X.C156797uw;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C41561wd;
import X.C89964dJ;
import X.C91634g0;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;

public final class CoinFlipEditPhotoTabFragment extends Hilt_CoinFlipEditPhotoTabFragment {
    public DialogFragment A00;
    public AnonymousClass11S A01;
    public AnonymousClass1LU A02;
    public final C18100vl A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624551, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        C89964dJ.A00(AnonymousClass1HF.A06(view, 2131429166), this, 49);
        AnonymousClass3Ma.A1A(AnonymousClass1HF.A06(view, 2131429169), this, 0);
        AnonymousClass3Ma.A1A(AnonymousClass1HF.A06(view, 2131429174), this, 1);
        C18100vl r4 = this.A03;
        C91634g0.A00(A1G(), ((CoinFlipEditBottomSheetViewModel) r4.getValue()).A00, new C105955Tz(this), 19);
        C91634g0.A00(A1G(), ((CoinFlipEditBottomSheetViewModel) r4.getValue()).A03, new C105945Ty(this), 19);
    }

    public CoinFlipEditPhotoTabFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5KY(new AnonymousClass5KX(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(CoinFlipEditBottomSheetViewModel.class);
        this.A03 = C99274sY.A00(new AnonymousClass5KZ(A002), new C156797uw(this, A002), new C156787uv(A002), A15);
    }

    public void A1r() {
        super.A1r();
        this.A00 = null;
    }

    public void A1u() {
        super.A1u();
        CoinFlipEditBottomSheetViewModel coinFlipEditBottomSheetViewModel = (CoinFlipEditBottomSheetViewModel) this.A03.getValue();
        AnonymousClass3MW.A1X(coinFlipEditBottomSheetViewModel.A07, new CoinFlipEditBottomSheetViewModel$checkProfilePhotoExists$1(coinFlipEditBottomSheetViewModel, (C30391dr) null), C41561wd.A00(coinFlipEditBottomSheetViewModel));
    }
}
