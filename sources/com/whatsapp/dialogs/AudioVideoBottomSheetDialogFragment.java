package com.whatsapp.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1HF;
import X.AnonymousClass3MX;
import X.AnonymousClass86E;
import X.C23201Fc;
import X.C89924dF;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AudioVideoBottomSheetDialogFragment extends Hilt_AudioVideoBottomSheetDialogFragment implements AnonymousClass86E {
    public C23201Fc A00;
    public AnonymousClass00H A01;

    public void A1K() {
        super.A1K();
        this.A00 = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A09 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624235);
        View A06 = AnonymousClass1HF.A06(A09, 2131427882);
        View A062 = AnonymousClass1HF.A06(A09, 2131436741);
        C89924dF.A00(A06, this, 40);
        C89924dF.A00(A062, this, 41);
        return A09;
    }

    public void A1x(Context context) {
        super.A1x(context);
        if (context instanceof C23201Fc) {
            this.A00 = (C23201Fc) context;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Activity must implement ");
        throw AnonymousClass000.A0o(C23201Fc.class.getSimpleName(), A10);
    }
}
