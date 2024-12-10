package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C17880vN;
import X.C18070vi;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.base.WaFragment;

public final class EnableEducationFragment extends WaFragment {
    public EncBackupViewModel A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625216, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        this.A00 = (EncBackupViewModel) AnonymousClass3Ma.A0I(this).A00(EncBackupViewModel.class);
        TextView A0E = AnonymousClass3Ma.A0E(view, 2131430405);
        Resources A09 = AnonymousClass3MZ.A09(this);
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, 64, 0);
        AnonymousClass3MX.A1E(A09, A0E, A1a, 2131755115, 64);
        AnonymousClass3MZ.A1J(A0E, this, 27);
        AnonymousClass3MZ.A1J(AnonymousClass1HF.A06(view, 2131430404), this, 26);
    }
}
