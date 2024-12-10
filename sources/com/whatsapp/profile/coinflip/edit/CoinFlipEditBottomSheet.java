package com.whatsapp.profile.coinflip.edit;

import X.AnonymousClass1HF;
import X.C134026pt;
import X.C18070vi;
import X.C74433Zy;
import X.C91884gP;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

public final class CoinFlipEditBottomSheet extends Hilt_CoinFlipEditBottomSheet {
    public ViewPager2 A00;
    public TabLayout A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624550, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A00 = (ViewPager2) AnonymousClass1HF.A06(view, 2131436808);
        this.A01 = (TabLayout) AnonymousClass1HF.A06(view, 2131436000);
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            viewPager2.setAdapter(new C74433Zy(this));
            TabLayout tabLayout = this.A01;
            if (tabLayout != null) {
                new C134026pt(viewPager2, tabLayout, new C91884gP(this, 2)).A00();
            }
        }
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
        this.A01 = null;
    }
}
