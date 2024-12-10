package com.whatsapp.payments.ui;

import X.A56;
import X.A5I;
import X.A8e;
import X.AFT;
import X.AnonymousClass00H;
import X.AnonymousClass1QS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass8BR;
import X.C170278pb;
import X.C175378yc;
import X.C17880vN;
import X.C17960vV;
import X.C180609Nf;
import X.C18070vi;
import X.C20284AEs;
import X.C21132Af0;
import X.C22466B8y;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public abstract class ConfirmReceivePaymentFragment extends Hilt_ConfirmReceivePaymentFragment implements C22466B8y {
    public C21132Af0 A00;
    public C20284AEs A01;
    public AnonymousClass1QS A02;
    public PaymentMethodRow A03;
    public AnonymousClass00H A04;
    public Button A05;
    public final C180609Nf A06 = new C175378yc(this, 1);

    public void C0I(C20284AEs aEs) {
        this.A01 = aEs;
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this;
        brazilConfirmReceivePaymentFragment.A03.A01.setVisibility(0);
        PaymentMethodRow paymentMethodRow = brazilConfirmReceivePaymentFragment.A03;
        A56 A0c = AnonymousClass8BR.A0c(brazilConfirmReceivePaymentFragment.A0I);
        C18070vi.A0d(aEs, 0);
        paymentMethodRow.A03.setText(A0c.A03(aEs, true));
        C170278pb r0 = aEs.A08;
        C17960vV.A07(r0);
        if (!r0.A0A()) {
            brazilConfirmReceivePaymentFragment.A03.A03(brazilConfirmReceivePaymentFragment.A1H(2131893673), false);
        }
        PaymentMethodRow paymentMethodRow2 = brazilConfirmReceivePaymentFragment.A03;
        if (A8e.A08(aEs)) {
            brazilConfirmReceivePaymentFragment.A0D.A02(aEs, paymentMethodRow2);
        }
        brazilConfirmReceivePaymentFragment.A03.A04(true);
        AFT.A00(this.A05, this, aEs, 11);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A09 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624628);
        this.A03 = (PaymentMethodRow) A09.findViewById(2131433594);
        this.A05 = (Button) A09.findViewById(2131429352);
        View findViewById = A09.findViewById(2131427577);
        A09.findViewById(2131427433).setVisibility(8);
        AnonymousClass3MY.A1B(A09, 2131433574, 8);
        C20284AEs aEs = this.A01;
        C17960vV.A07(aEs);
        C0I(aEs);
        Fragment fragment = this.A0E;
        if (fragment != null) {
            AFT.A00(A09.findViewById(2131433578), this, fragment, 9);
            AFT.A00(findViewById, this, fragment, 10);
        }
        return A09;
    }

    public void A1r() {
        super.A1r();
        C17880vN.A0V(this.A04).unregisterObserver(this.A06);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        C21132Af0 af0 = this.A00;
        if (af0 != null) {
            af0.A0D();
        }
        this.A00 = A5I.A00(this.A02);
        Parcelable parcelable = A15().getParcelable("args_payment_method");
        C17960vV.A07(parcelable);
        this.A01 = (C20284AEs) parcelable;
        C17880vN.A0V(this.A04).registerObserver(this.A06);
    }
}
