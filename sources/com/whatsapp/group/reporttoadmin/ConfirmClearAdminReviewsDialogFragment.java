package com.whatsapp.group.reporttoadmin;

import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4bB;
import X.C17880vN;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;

public final class ConfirmClearAdminReviewsDialogFragment extends Hilt_ConfirmClearAdminReviewsDialogFragment {
    public static final void A00(ConfirmClearAdminReviewsDialogFragment confirmClearAdminReviewsDialogFragment, boolean z) {
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("clear_all_admin_reviews", z);
        confirmClearAdminReviewsDialogFragment.A1F().A0w("confirm_clear_admin_reviews_dialog_result", A0D);
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        A04.A0E(2131891147);
        A04.A0D(2131891146);
        AnonymousClass4bB.A00(A04, this, 15, 2131891145);
        A04.setNegativeButton(2131891144, new AnonymousClass4bB(this, 16));
        return AnonymousClass3MY.A0L(A04);
    }
}
