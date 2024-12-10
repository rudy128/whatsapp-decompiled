package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass11C;
import X.AnonymousClass1KB;
import X.AnonymousClass1LC;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C108955ca;
import X.C29491cN;
import X.C36361nl;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealFormSubmittedFragment extends Hilt_BanAppealFormSubmittedFragment {
    public AnonymousClass1KB A00;
    public C36361nl A01;
    public AnonymousClass1LC A02;
    public AnonymousClass11C A03;
    public BanAppealViewModel A04;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A1Z(true);
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624261);
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        if (!((C29491cN) this.A05.get()).A0F()) {
            C108955ca.A1G(menu, 0, 1, 2131894997);
        }
        super.A22(menu, menuInflater);
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        this.A04 = (BanAppealViewModel) AnonymousClass3Ma.A0I(this).A00(BanAppealViewModel.class);
        BanAppealViewModel.A03(A1D(), true);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(view, 2131431392);
        AnonymousClass3Ma.A1L(this.A04, A0V);
        AnonymousClass3Ma.A1K(A0V, this.A03);
        A0V.setText(this.A04.A0T(A14(), this.A00, this.A01, this.A03));
        AnonymousClass3MW.A0J(view, 2131427818).setText(2131886923);
    }

    public boolean A24(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.A04.A0W(A1D(), false);
            return true;
        } else if (itemId != 16908332) {
            return super.A24(menuItem);
        } else {
            AnonymousClass3MY.A1L(this.A04.A09, true);
            return true;
        }
    }
}
