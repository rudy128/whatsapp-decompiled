package com.whatsapp.calling.views;

import X.AnonymousClass00H;
import X.AnonymousClass112;
import X.AnonymousClass12Q;
import X.AnonymousClass1YL;
import X.AnonymousClass3MX;
import X.AnonymousClass4UU;
import X.AnonymousClass4aR;
import X.AnonymousClass4bD;
import X.C175258yP;
import X.C17880vN;
import X.C19740yt;
import X.C22971Dz;
import X.C28281Zt;
import X.C34001jj;
import X.C37091ox;
import X.C72453Mb;
import X.C89404cP;
import X.C99054sC;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.VoipContactPickerFragment;

public class VoipContactPickerDialogFragment extends Hilt_VoipContactPickerDialogFragment {
    public C175258yP A00;
    public AnonymousClass00H A01 = AnonymousClass12Q.A00(C37091ox.class);
    public final ContactPickerFragment A02 = new VoipContactPickerFragment();
    public final AnonymousClass00H A03 = C99054sC.A00(this, 0);

    public void A21(Bundle bundle, View view) {
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.getWindow().setSoftInputMode(16);
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A09 = AnonymousClass3MX.A09(LayoutInflater.from(A1B()), viewGroup, 2131627499);
        AnonymousClass4UU r5 = (AnonymousClass4UU) this.A03.get();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("for_group_call", true);
        A0D.putStringArrayList("contacts_to_exclude", C22971Dz.A0B(r5.A02));
        C89404cP A05 = AnonymousClass4aR.A05(A14(), r5.A01, r5.A03);
        if (A05 != null) {
            A0D.putParcelable("share_sheet_data", A05);
        }
        Integer num = r5.A00;
        if (num != null) {
            A0D.putBoolean("use_custom_multiselect_limit", true);
            A0D.putInt("custom_multiselect_limit", num.intValue());
        }
        ContactPickerFragment contactPickerFragment = this.A02;
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putBundle("extras", A0D);
        contactPickerFragment.A1R(A0D2);
        C34001jj A0Y = C72453Mb.A0Y(this);
        A0Y.A08(contactPickerFragment, 2131430999);
        A0Y.A04();
        return A09;
    }

    public void A1u() {
        super.A1u();
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setOnKeyListener(new AnonymousClass4bD(this, 1));
        }
    }

    public void A1v() {
        int i;
        super.A1v();
        Dialog dialog = this.A03;
        if (dialog != null && dialog.getWindow() != null) {
            Window window = this.A03.getWindow();
            if (AnonymousClass112.A04()) {
                C28281Zt.A09(window, AnonymousClass1YL.A00(window.getContext(), 2130970285, 2131101276), 1);
                return;
            }
            if (((AnonymousClass4UU) this.A03.get()).A03) {
                i = AnonymousClass1YL.A00(window.getContext(), 2130970676, 2131102067);
            } else {
                i = 2131102900;
            }
            window.setNavigationBarColor(C19740yt.A00(window.getContext(), i));
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A2A(0, 2132084327);
    }
}
