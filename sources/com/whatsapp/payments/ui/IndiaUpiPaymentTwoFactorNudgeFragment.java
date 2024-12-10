package com.whatsapp.payments.ui;

import X.AFP;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11P;
import X.AnonymousClass1HF;
import X.AnonymousClass1QD;
import X.AnonymousClass3MX;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.C17880vN;
import X.C17890vO;
import X.C22371B5a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class IndiaUpiPaymentTwoFactorNudgeFragment extends Hilt_IndiaUpiPaymentTwoFactorNudgeFragment {
    public AnonymousClass1QD A00;
    public AZ6 A01;
    public C22371B5a A02;

    public void A1K() {
        super.A1K();
        this.A02 = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625669);
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        AFP.A00(AnonymousClass1HF.A06(view, 2131429535), this, 25);
        AFP.A00(AnonymousClass8BS.A06(view), this, 26);
        AFP.A00(AnonymousClass1HF.A06(view, 2131431955), this, 27);
        AnonymousClass1QD r2 = this.A00;
        long A012 = AnonymousClass11P.A01(r2.A01);
        C17880vN.A1D(AnonymousClass8BU.A07(r2), "payments_last_two_factor_nudge_time", A012);
        r2.A02.A06(C17890vO.A0a("updateLastTwoFactorNudgeTimeMilli to: ", AnonymousClass000.A10(), A012));
        AnonymousClass1QD r22 = this.A00;
        int A002 = C17890vO.A00(r22.A03(), "payments_two_factor_nudge_count") + 1;
        C17880vN.A1C(AnonymousClass8BU.A07(r22), "payments_two_factor_nudge_count", A002);
        r22.A02.A06(AnonymousClass001.A1I("updateTwoFactorNudgeCount to: ", AnonymousClass000.A10(), A002));
        this.A01.BiL((Integer) null, "two_factor_nudge_prompt", (String) null, 0);
    }
}
