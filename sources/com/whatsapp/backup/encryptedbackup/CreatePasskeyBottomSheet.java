package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass5QT;
import X.AnonymousClass78J;
import X.C18070vi;
import X.C72483Me;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class CreatePasskeyBottomSheet extends WDSBottomSheetDialogFragment {
    public EncBackupViewModel A00;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        EncBackupViewModel A0R = C72483Me.A0R(this);
        C18070vi.A0d(A0R, 0);
        this.A00 = A0R;
        WDSTextLayout wDSTextLayout = (WDSTextLayout) C18070vi.A05(view, 2131430414);
        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131889801);
        wDSTextLayout.setDescriptionText(A1H(2131889800));
        AnonymousClass3MY.A1I(this, wDSTextLayout, 2131889799);
        wDSTextLayout.setPrimaryButtonClickListener(new AnonymousClass78J(this, 24));
        wDSTextLayout.setSecondaryButtonText(A1H(2131898766));
        wDSTextLayout.setSecondaryButtonClickListener(new AnonymousClass78J(this, 25));
        EncBackupViewModel encBackupViewModel = this.A00;
        if (encBackupViewModel != null) {
            AnonymousClass3MY.A1K(A1G(), encBackupViewModel.A0C, new AnonymousClass5QT(this), 1);
            return;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public int A2F() {
        return 2131625213;
    }
}
