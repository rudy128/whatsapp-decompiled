package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C72483Me;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class ForcedRegLandingFragment extends Hilt_ForcedRegLandingFragment {
    public EncBackupViewModel A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625225, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        this.A00 = C72483Me.A0R(this);
        AnonymousClass3MZ.A1J(AnonymousClass1HF.A06(view, 2131430436), this, 34);
        AnonymousClass3MZ.A1J(AnonymousClass1HF.A06(view, 2131430439), this, 35);
        EncBackupViewModel encBackupViewModel = this.A00;
        if (encBackupViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else if (encBackupViewModel.A0T() == 9) {
            AnonymousClass3MW.A0J(view, 2131430437).setText(2131889830);
        }
    }
}
