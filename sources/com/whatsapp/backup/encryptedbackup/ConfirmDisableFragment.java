package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1J2;
import X.AnonymousClass3Ma;
import X.AnonymousClass4WJ;
import X.AnonymousClass78J;
import X.C18070vi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.base.WaFragment;

public final class ConfirmDisableFragment extends WaFragment {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625212, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A1z(bundle);
        AnonymousClass1J2 A00 = AnonymousClass3Ma.A0I(this).A00(EncBackupViewModel.class);
        AnonymousClass4WJ.A00(new AnonymousClass78J(A00, 20), C18070vi.A05(view, 2131429342));
        AnonymousClass4WJ.A00(new AnonymousClass78J(A00, 21), C18070vi.A05(view, 2131429341));
    }
}
