package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass1DT;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a5;
import X.AnonymousClass4a6;
import X.AnonymousClass5QU;
import X.AnonymousClass5QV;
import X.C17900vP;
import X.C18070vi;
import X.C22891Dp;
import X.C72483Me;
import X.C73203Rj;
import X.C75683i4;
import X.C83534Fm;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public final class EnableDoneFragment extends Hilt_EnableDoneFragment {
    public AnonymousClass11C A00;

    public static final void A00(EnableDoneFragment enableDoneFragment, int i) {
        int i2 = 2131896261;
        if (i != 4) {
            if (i == 8) {
                i2 = 2131889829;
            } else {
                return;
            }
        }
        String A1H = enableDoneFragment.A1H(i2);
        C73203Rj A04 = AnonymousClass4a6.A04(enableDoneFragment);
        A04.A0S(A1H);
        A04.A0Z((DialogInterface.OnClickListener) null, 2131899286);
        AnonymousClass3MY.A0L(A04).show();
        AnonymousClass11C r0 = enableDoneFragment.A00;
        if (r0 != null) {
            AnonymousClass4a5.A03(r0);
            C17900vP.A0f("encb/EnableDoneFragment/error modal shown with message: ", A1H, AnonymousClass000.A10());
            return;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625215, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A1z(bundle);
        EncBackupViewModel A0R = C72483Me.A0R(this);
        AnonymousClass3Ma.A1C(AnonymousClass1HF.A06(view, 2131430402), A0R, 6);
        AnonymousClass1DT r3 = A0R.A04;
        AnonymousClass3MY.A1K(A1G(), r3, new AnonymousClass5QU(this), 2);
        AnonymousClass3Ma.A1C(AnonymousClass1HF.A06(view, 2131430401), A0R, 7);
        AnonymousClass3MY.A1K(A1G(), r3, new AnonymousClass5QV(this), 2);
        if (C22891Dp.A02) {
            ImageView A0G = AnonymousClass3MW.A0G(view, 2131430403);
            A0G.setImageDrawable(C83534Fm.A00(A14(), C75683i4.A00));
            ViewGroup.LayoutParams layoutParams = A0G.getLayoutParams();
            if (layoutParams != null) {
                AnonymousClass3MZ.A1F(A0G, layoutParams);
                return;
            }
            throw AnonymousClass3MY.A0k();
        }
    }
}
