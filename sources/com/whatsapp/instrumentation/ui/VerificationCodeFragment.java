package com.whatsapp.instrumentation.ui;

import X.AnonymousClass000;
import X.AnonymousClass1ZU;
import X.AnonymousClass3Ma;
import X.AnonymousClass41z;
import X.AnonymousClass420;
import X.AnonymousClass421;
import X.AnonymousClass5Y0;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C83234Ei;
import X.C89954dI;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class VerificationCodeFragment extends Hilt_VerificationCodeFragment {
    public C83234Ei A00 = AnonymousClass421.A00;
    public AnonymousClass5Y0 A01;
    public String A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625716, viewGroup, false);
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof AnonymousClass5Y0) {
            this.A01 = (AnonymousClass5Y0) context;
        }
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        A00(this);
    }

    public static final void A00(VerificationCodeFragment verificationCodeFragment) {
        TextView A0E;
        TextView A0E2;
        View view = verificationCodeFragment.A0B;
        if (view != null && (A0E = C17880vN.A0E(view, 2131431732)) != null) {
            C83234Ei r5 = verificationCodeFragment.A00;
            if (r5 instanceof AnonymousClass421) {
                A0E.setEnabled(false);
            } else if (r5 instanceof AnonymousClass41z) {
                Integer[] numArr = new Integer[8];
                int i = 0;
                numArr[0] = 2131431733;
                AnonymousClass000.A1M(numArr, 2131431734);
                AnonymousClass3Ma.A1S(numArr, 2131431735);
                C17890vO.A1G(numArr, 2131431736);
                AnonymousClass3Ma.A1T(numArr, 2131431737);
                AnonymousClass3Ma.A1U(numArr, 2131431738);
                C17890vO.A1H(numArr, 2131431739);
                for (Object next : C18070vi.A0O(2131431740, numArr, 7)) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AnonymousClass1ZU.A0B();
                    } else {
                        int A0M = AnonymousClass000.A0M(next);
                        View view2 = verificationCodeFragment.A0B;
                        if (!(view2 == null || (A0E2 = C17880vN.A0E(view2, A0M)) == null)) {
                            String str = verificationCodeFragment.A02;
                            if (str == null) {
                                C18070vi.A11("verificationCode");
                            } else {
                                A0E2.setText(String.valueOf(str.charAt(i)));
                            }
                        }
                        i = i2;
                    }
                    throw null;
                }
                A0E.setEnabled(((AnonymousClass41z) r5).A00);
                A0E.setText(2131891400);
                C89954dI.A00(A0E, verificationCodeFragment, 21);
            } else if (r5 instanceof AnonymousClass420) {
                A0E.setEnabled(false);
                A0E.setText(2131891401);
                A0E.setBackgroundColor(0);
            }
        }
    }
}
