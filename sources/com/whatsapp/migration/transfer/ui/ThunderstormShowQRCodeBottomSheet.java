package com.whatsapp.migration.transfer.ui;

import X.AnonymousClass4AH;
import X.C139436yq;
import X.C18070vi;
import X.C90054dS;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public final class ThunderstormShowQRCodeBottomSheet extends WDSBottomSheetDialogFragment {
    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C90054dS.A00(C18070vi.A05(view, 2131436173), this, 20);
        C18070vi.A11("logger");
        throw null;
    }

    public void A2I(C139436yq r2) {
        C18070vi.A0d(r2, 0);
        r2.A00(AnonymousClass4AH.A00);
        r2.A01(true);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
    }

    public int A2F() {
        return 2131627205;
    }
}
