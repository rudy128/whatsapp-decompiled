package com.whatsapp.payments.ui;

import X.AFO;
import X.AZ6;
import X.AnonymousClass03S;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass78E;
import X.AnonymousClass8BR;
import X.BDt;
import X.C108955ca;
import X.C139436yq;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C20284AEs;
import X.C22467B8z;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public final class IndiaUpiAccountTypeSelectionFragment extends Hilt_IndiaUpiAccountTypeSelectionFragment implements BDt {
    public C18030ve A00;
    public AZ6 A01;
    public String A02;
    public String A03;
    public final C22467B8z A04;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        String str;
        LayoutInflater layoutInflater2 = layoutInflater;
        C18070vi.A0d(layoutInflater2, 0);
        View A0G = C108955ca.A0G(layoutInflater2, viewGroup, 2131625606, false);
        ImageView A0C = AnonymousClass3Ma.A0C(A0G, 2131432918);
        Fragment fragment = this.A0E;
        if (fragment == null || fragment.A1E().A0K() <= 1) {
            A0C.setImageDrawable(AnonymousClass03S.A01(A0G.getContext(), 2131231814));
            i = 25;
        } else {
            A0C.setImageDrawable(AnonymousClass03S.A01(A0G.getContext(), 2131231675));
            i = 26;
        }
        AFO.A00(A0C, this, i);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            str = AnonymousClass8BR.A0y(bundle2);
        } else {
            str = null;
        }
        this.A03 = str;
        PaymentMethodRow paymentMethodRow = (PaymentMethodRow) C18070vi.A05(A0G, 2131428048);
        PaymentMethodRow paymentMethodRow2 = (PaymentMethodRow) C18070vi.A05(A0G, 2131429720);
        PaymentMethodRow paymentMethodRow3 = (PaymentMethodRow) C18070vi.A05(A0G, 2131429721);
        View findViewById = A0G.findViewById(2131427433);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = paymentMethodRow.findViewById(2131433592);
        View findViewById3 = paymentMethodRow2.findViewById(2131433592);
        View findViewById4 = paymentMethodRow3.findViewById(2131433592);
        paymentMethodRow.A03.setText(A1H(2131897404));
        paymentMethodRow.A03(A1H(2131897405), false);
        AnonymousClass4aX.A0B(paymentMethodRow.getContext(), paymentMethodRow.A00, 2131233175, 2131100602);
        paymentMethodRow.A00();
        paymentMethodRow.setRadioButtonChecked(true);
        paymentMethodRow.setOnClickListener(new AnonymousClass78E(this, findViewById2, findViewById3, findViewById4, 22));
        C18030ve r8 = this.A00;
        if (r8 != null) {
            C18040vf r7 = C18040vf.A02;
            if (C18020vd.A05(r7, r8, 4638)) {
                paymentMethodRow2.A03.setText(A1H(2131897407));
                paymentMethodRow2.A03(A1H(2131897408), false);
                AnonymousClass4aX.A0B(paymentMethodRow2.getContext(), paymentMethodRow2.A00, 2131233265, 2131100602);
                paymentMethodRow2.A00();
                paymentMethodRow2.A05(false);
                paymentMethodRow2.setOnClickListener(new AnonymousClass78E(this, findViewById2, findViewById3, findViewById4, 23));
            } else {
                paymentMethodRow2.setVisibility(8);
            }
            C18030ve r4 = this.A00;
            if (r4 != null) {
                if (C18020vd.A05(r7, r4, 7974)) {
                    paymentMethodRow3.A03.setText(A1H(2131897406));
                    paymentMethodRow3.A03(A1H(2131897403), false);
                    paymentMethodRow3.A00.setImageResource(2131233112);
                    paymentMethodRow3.A00();
                    paymentMethodRow3.A05(false);
                    paymentMethodRow3.setOnClickListener(new AnonymousClass78E(this, findViewById2, findViewById3, findViewById4, 24));
                } else {
                    paymentMethodRow3.setVisibility(8);
                }
                WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) C18070vi.A05(A0G, 2131429535);
                waButtonWithLoader.setButtonText(2131887451);
                waButtonWithLoader.A00 = new AFO(this, 27);
                AZ6 az6 = this.A01;
                if (az6 != null) {
                    az6.BiL((Integer) null, "available_payment_methods_prompt", this.A03, 0);
                    return A0G;
                }
                C18070vi.A11("indiaUpiFieldStatsLogger");
                throw null;
            }
            C18070vi.A11("abProps");
            throw null;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public void A2I(C139436yq r2) {
        C18070vi.A0d(r2, 0);
        r2.A01(false);
    }

    public String BUt(C20284AEs aEs) {
        return null;
    }

    public boolean CMD() {
        return false;
    }

    public /* synthetic */ void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
    }

    public IndiaUpiAccountTypeSelectionFragment(C22467B8z b8z) {
        this.A04 = b8z;
    }

    public int A2F() {
        return 2131625606;
    }

    public /* synthetic */ int BUr(C20284AEs aEs) {
        return 0;
    }

    public /* synthetic */ String BUu(C20284AEs aEs) {
        return null;
    }

    public /* synthetic */ boolean CLr(C20284AEs aEs) {
        return false;
    }

    public /* synthetic */ boolean CMH() {
        return false;
    }
}
