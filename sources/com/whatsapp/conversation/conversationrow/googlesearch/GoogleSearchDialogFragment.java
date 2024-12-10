package com.whatsapp.conversation.conversationrow.googlesearch;

import X.AnonymousClass10I;
import X.AnonymousClass181;
import X.AnonymousClass18K;
import X.AnonymousClass18O;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass206;
import X.AnonymousClass210;
import X.AnonymousClass3MX;
import X.AnonymousClass4a6;
import X.AnonymousClass4bA;
import X.C010105w;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C438421d;
import X.C73193Ri;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog$Builder;

public class GoogleSearchDialogFragment extends Hilt_GoogleSearchDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass18O A02;
    public AnonymousClass181 A03;
    public AnonymousClass18K A04;
    public AnonymousClass10I A05;

    public static void A00(AnonymousClass1FU r4, AnonymousClass18O r5, AnonymousClass206 r6) {
        if (!(r6 instanceof C438421d) && (r6 instanceof AnonymousClass210) && r5.A09(AnonymousClass18O.A0b)) {
            String A0P = r6.A0P();
            Bundle A0D = C17880vN.A0D();
            A0D.putInt("search_query_type", 0);
            A0D.putString("search_query_text", A0P);
            Hilt_GoogleSearchDialogFragment hilt_GoogleSearchDialogFragment = new Hilt_GoogleSearchDialogFragment();
            hilt_GoogleSearchDialogFragment.A1R(A0D);
            r4.CMl(hilt_GoogleSearchDialogFragment);
        }
    }

    public Dialog A27(Bundle bundle) {
        AlertDialog$Builder A002;
        AnonymousClass4bA r4 = new AnonymousClass4bA(this, 20);
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A02, 8171);
        AnonymousClass1FL A1D = A1D();
        if (A052) {
            A002 = C73193Ri.A00(A1D);
        } else {
            A002 = AnonymousClass4a6.A00(A1D);
        }
        if (A052) {
            A002.A0R(LayoutInflater.from(A1D).inflate(2131626835, (ViewGroup) null));
            A002.A0D(2131895531);
            A002.setPositiveButton(2131899369, r4);
        } else {
            A002.A0D(2131894873);
            A002.setPositiveButton(2131886437, r4);
        }
        C010105w A0N = AnonymousClass3MX.A0N((DialogInterface.OnClickListener) null, A002, 2131898766);
        A0N.setCanceledOnTouchOutside(true);
        return A0N;
    }

    public void A1x(Context context) {
        super.A1x(context);
        if (!(AnonymousClass1L9.A00(context) instanceof AnonymousClass1FU)) {
            C17960vV.A0F(false, "GoogleSearchDialogFragment does not have a DialogActivity as a host");
        }
    }
}
