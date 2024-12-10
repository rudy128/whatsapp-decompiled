package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.AnonymousClass4bF;
import X.AnonymousClass5YL;
import X.C1411874q;
import X.C17880vN;
import X.C73203Rj;
import X.C88814ar;
import android.app.Dialog;
import android.os.Bundle;

public class MultiSelectionDialogFragment extends Hilt_MultiSelectionDialogFragment {
    public int A00;
    public AnonymousClass5YL A01;
    public boolean[] A02;
    public String A03;
    public String[] A04;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.settings.Hilt_MultiSelectionDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.settings.MultiSelectionDialogFragment] */
    public static MultiSelectionDialogFragment A00(boolean[] zArr, int i, int i2) {
        ? hilt_MultiSelectionDialogFragment = new Hilt_MultiSelectionDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("dialogId", i);
        A0D.putInt("dialogTitleResId", i2);
        A0D.putInt("itemsResId", 2130903042);
        A0D.putBooleanArray("selectedItems", zArr);
        hilt_MultiSelectionDialogFragment.A1R(A0D);
        return hilt_MultiSelectionDialogFragment;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        if (A1B() instanceof AnonymousClass5YL) {
            Bundle bundle2 = this.A06;
            this.A00 = bundle2.getInt("dialogId");
            this.A03 = A1H(bundle2.getInt("dialogTitleResId"));
            this.A04 = AnonymousClass3MZ.A09(this).getStringArray(bundle2.getInt("itemsResId"));
            this.A02 = bundle2.getBooleanArray("selectedItems");
            this.A01 = (AnonymousClass5YL) A1B();
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Activity must implement ");
        throw AnonymousClass000.A0o(AnonymousClass5YL.class.getSimpleName(), A10);
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A042 = AnonymousClass4a6.A04(this);
        A042.setTitle(this.A03);
        A042.A0Q(new AnonymousClass4bF(this), this.A04, this.A02);
        A042.setPositiveButton(2131899286, new C88814ar(this, 11));
        return AnonymousClass3MX.A0N(new C1411874q(35), A042, 2131898766);
    }
}
