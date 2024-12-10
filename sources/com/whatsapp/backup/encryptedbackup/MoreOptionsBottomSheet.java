package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1HF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass5BE;
import X.AnonymousClass5BF;
import X.C103855Lx;
import X.C18070vi;
import X.C18100vl;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

public final class MoreOptionsBottomSheet extends WDSBottomSheetDialogFragment {
    public final C18100vl A00;
    public final int A01 = 2131625227;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass3MZ.A1J(AnonymousClass1HF.A06(view, 2131430426), this, 36);
        WDSListItem wDSListItem = (WDSListItem) C18070vi.A05(view, 2131430425);
        wDSListItem.setText((CharSequence) AnonymousClass3MZ.A09(this).getQuantityString(2131755102, 64, new Object[]{64}));
        wDSListItem.setSubText((CharSequence) AnonymousClass3MZ.A09(this).getQuantityString(2131755103, 64, new Object[]{64}));
        AnonymousClass3MZ.A1J(wDSListItem, this, 37);
    }

    public int A2F() {
        return this.A01;
    }

    public MoreOptionsBottomSheet() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(EncBackupViewModel.class);
        this.A00 = C99274sY.A00(new AnonymousClass5BE(this), new AnonymousClass5BF(this), new C103855Lx(this), A15);
    }
}
