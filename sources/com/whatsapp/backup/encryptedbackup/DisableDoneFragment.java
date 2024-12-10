package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C22891Dp;
import X.C75673i3;
import X.C83534Fm;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.base.WaFragment;

public final class DisableDoneFragment extends WaFragment {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625214, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A1z(bundle);
        AnonymousClass3Ma.A1C(AnonymousClass1HF.A06(view, 2131430012), AnonymousClass3Ma.A0I(this).A00(EncBackupViewModel.class), 5);
        if (C22891Dp.A02) {
            ImageView A0G = AnonymousClass3MW.A0G(view, 2131430013);
            A0G.setImageDrawable(C83534Fm.A00(A14(), C75673i3.A00));
            ViewGroup.LayoutParams layoutParams = A0G.getLayoutParams();
            if (layoutParams != null) {
                AnonymousClass3MZ.A1F(A0G, layoutParams);
                return;
            }
            throw AnonymousClass3MY.A0k();
        }
    }
}
