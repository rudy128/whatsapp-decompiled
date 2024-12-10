package com.whatsapp.payments.ui;

import X.AnonymousClass00H;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.BD4;
import X.C17880vN;
import X.C18070vi;
import X.C72453Mb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class BrazilHostedPaymentPageDateOfBirthBottomSheetFragment extends Hilt_BrazilHostedPaymentPageDateOfBirthBottomSheetFragment {
    public BD4 A00;
    public AnonymousClass00H A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View A1q = super.A1q(bundle, layoutInflater, viewGroup);
        AnonymousClass1HF.A06(A1q, 2131429344).setVisibility(8);
        AnonymousClass3MY.A1A(A1q, 2131430761, 8);
        TextView A0J = AnonymousClass3MW.A0J(A1q, 2131429343);
        A0J.setGravity(17);
        A0J.setTextAlignment(4);
        TextView A0E = C17880vN.A0E(AnonymousClass3MY.A0I(C72453Mb.A0s(A1q, 2131431436), 0), 2131429347);
        if (A0E != null) {
            A0E.setText(2131887368);
        }
        return A1q;
    }
}
