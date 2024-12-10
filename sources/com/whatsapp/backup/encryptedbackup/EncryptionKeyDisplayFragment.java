package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C72483Me;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.base.WaFragment;

public abstract class EncryptionKeyDisplayFragment extends WaFragment {
    public RelativeLayout A00;
    public EncBackupViewModel A01;

    public boolean A1m(MenuItem menuItem) {
        C18070vi.A0d(menuItem, 0);
        RelativeLayout relativeLayout = this.A00;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(2131231379);
        }
        if (menuItem.getItemId() != 0) {
            return true;
        }
        EncBackupViewModel encBackupViewModel = this.A01;
        if (encBackupViewModel != null) {
            ClipboardManager A09 = encBackupViewModel.A0H.A09();
            String str = (String) encBackupViewModel.A01.A06();
            if (A09 == null || str == null) {
                return true;
            }
            A09.setPrimaryClip(ClipData.newPlainText(str, str));
            return true;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        EncBackupViewModel A0R = C72483Me.A0R(this);
        C18070vi.A0d(A0R, 0);
        this.A01 = A0R;
        this.A00 = (RelativeLayout) AnonymousClass1HF.A06(view, 2131430446);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        boolean A15 = C18070vi.A15(contextMenu, view);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(A15 ? 1 : 0, A15, A15, 2131889050);
        RelativeLayout relativeLayout = this.A00;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(2131231383);
        }
    }
}
