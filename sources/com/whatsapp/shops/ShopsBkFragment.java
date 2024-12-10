package com.whatsapp.shops;

import X.C108965cb;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.wabloks.base.BkFragment;

public abstract class ShopsBkFragment extends BkFragment {
    public void A1s() {
        super.A1s();
        ShopsBkLayoutViewModel shopsBkLayoutViewModel = (ShopsBkLayoutViewModel) this.A08;
        shopsBkLayoutViewModel.A0T();
        shopsBkLayoutViewModel.A01.A09(A1G());
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        ShopsBkLayoutViewModel shopsBkLayoutViewModel = (ShopsBkLayoutViewModel) this.A08;
        shopsBkLayoutViewModel.A0T();
        C108965cb.A13(A1G(), shopsBkLayoutViewModel.A01, this, 33);
    }
}
