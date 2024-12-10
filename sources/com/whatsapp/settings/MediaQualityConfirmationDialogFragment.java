package com.whatsapp.settings;

import X.AnonymousClass3MY;
import X.C17880vN;
import X.C18100vl;
import X.C72453Mb;
import X.C88414Zp;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.SingleSelectionDialogFragment;

public final class MediaQualityConfirmationDialogFragment extends SingleSelectionDialogFragment {
    public final C18100vl A00 = C88414Zp.A03(this, "customSubTitleId", 2131895955);
    public final C18100vl A01 = C88414Zp.A03(this, "customTitleId", 2131895954);

    public AlertDialog$Builder A2I() {
        View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(A1B()), 2131625971);
        TextView A0E = C17880vN.A0E(A0D, 2131432420);
        if (A0E != null) {
            A0E.setText(C72453Mb.A0I(this.A01));
        }
        TextView A0E2 = C17880vN.A0E(A0D, 2131432418);
        if (A0E2 != null) {
            A0E2.setText(C72453Mb.A0I(this.A00));
        }
        AlertDialog$Builder A2I = super.A2I();
        A2I.A0R(A0D);
        return A2I;
    }
}
