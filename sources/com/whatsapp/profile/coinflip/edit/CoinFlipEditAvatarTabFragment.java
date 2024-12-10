package com.whatsapp.profile.coinflip.edit;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass1XH;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass45q;
import X.AnonymousClass5KU;
import X.AnonymousClass5KV;
import X.AnonymousClass5KW;
import X.C105935Tx;
import X.C133856pc;
import X.C136936ue;
import X.C156767ut;
import X.C156777uu;
import X.C18070vi;
import X.C18100vl;
import X.C89964dJ;
import X.C91634g0;
import X.C97354pK;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;

public final class CoinFlipEditAvatarTabFragment extends Hilt_CoinFlipEditAvatarTabFragment {
    public DialogFragment A00;
    public AnonymousClass1LU A01;
    public AnonymousClass00H A02;
    public final C18100vl A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624549, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        C89964dJ.A00(AnonymousClass1HF.A06(view, 2131429171), this, 46);
        C89964dJ.A00(AnonymousClass1HF.A06(view, 2131429168), this, 47);
        C89964dJ.A00(AnonymousClass1HF.A06(view, 2131429173), this, 48);
        AnonymousClass1XH.A00(this);
        C91634g0.A00(A1G(), ((CoinFlipEditBottomSheetViewModel) this.A03.getValue()).A02, new C105935Tx(this), 18);
    }

    public void CBt(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("avatar_delete_dialog_tag")) {
            CoinFlipEditBottomSheetViewModel coinFlipEditBottomSheetViewModel = (CoinFlipEditBottomSheetViewModel) this.A03.getValue();
            coinFlipEditBottomSheetViewModel.A02.A0F(AnonymousClass45q.A00);
            ((C136936ue) C18070vi.A0E(coinFlipEditBottomSheetViewModel.A04)).A03((Boolean) null, 25);
            ((C133856pc) coinFlipEditBottomSheetViewModel.A05.get()).A01(new C97354pK(coinFlipEditBottomSheetViewModel));
        }
    }

    public CoinFlipEditAvatarTabFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5KV(new AnonymousClass5KU(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(CoinFlipEditBottomSheetViewModel.class);
        this.A03 = C99274sY.A00(new AnonymousClass5KW(A002), new C156777uu(this, A002), new C156767ut(A002), A15);
    }

    public void A1r() {
        super.A1r();
        this.A00 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A0D = false;
    }
}
