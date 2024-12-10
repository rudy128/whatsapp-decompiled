package com.whatsapp.businessdirectory.view.custom;

import X.AFN;
import X.AnonymousClass1HF;
import X.AnonymousClass3MX;
import X.AnonymousClass4a6;
import X.C192189nx;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

public class ClearLocationDialogFragment extends Hilt_ClearLocationDialogFragment {
    public C192189nx A00;

    public Dialog A27(Bundle bundle) {
        View A08 = AnonymousClass3MX.A08(A14(), 2131624542);
        View A06 = AnonymousClass1HF.A06(A08, 2131429119);
        View A062 = AnonymousClass1HF.A06(A08, 2131428814);
        AFN.A00(A06, this, 16);
        AFN.A00(A062, this, 17);
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0c(A08);
        A03.A0T(true);
        return A03.create();
    }
}
