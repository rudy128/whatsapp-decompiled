package com.whatsapp.shops;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass48o;
import X.C17960vV;
import X.C187529fx;
import X.C36361nl;
import X.C85424Ni;
import X.C98844ro;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;

public class ShopsProductPreviewFragment extends Hilt_ShopsProductPreviewFragment {
    public ConstraintLayout A00;
    public ShimmerFrameLayout A01;
    public C36361nl A02;
    public C85424Ni A03;
    public ShopsProductPreviewFragmentViewModel A04;
    public C187529fx A05;
    public Runnable A06;
    public String A07;
    public final Handler A08 = new Handler();

    public void A28() {
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A08.removeCallbacks(runnable);
        }
        this.A01.A04();
        this.A01.setVisibility(8);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625388);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        String string = A15().getString("shopUrl");
        C17960vV.A07(string);
        this.A07 = string;
        this.A04 = (ShopsProductPreviewFragmentViewModel) AnonymousClass3MW.A0N(this).A00(ShopsProductPreviewFragmentViewModel.class);
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        A17();
        this.A01 = (ShimmerFrameLayout) AnonymousClass1HF.A06(view, 2131435410);
        this.A00 = (ConstraintLayout) AnonymousClass1HF.A06(view, 2131433874);
        AnonymousClass48o.A00(AnonymousClass1HF.A06(view, 2131435057), this, 47);
        C98844ro r3 = new C98844ro((Object) this, 47);
        this.A06 = r3;
        this.A08.postDelayed(r3, 200);
    }

    public int A25() {
        return 2131428145;
    }
}
