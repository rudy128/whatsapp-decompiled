package com.whatsapp.group;

import X.AnonymousClass3MX;
import X.AnonymousClass4a6;
import X.AnonymousClass4bC;
import X.C17880vN;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;

public class ConfirmApproveAllPendingRequestsDialogFragment extends Hilt_ConfirmApproveAllPendingRequestsDialogFragment {
    public /* synthetic */ void A2H(Bundle bundle) {
        bundle.putBoolean("is_approve_all_pending_requests", true);
        A1F().A0w("group_join_request_approve_all_pending_requests", bundle);
    }

    public /* synthetic */ void A2I(Bundle bundle) {
        bundle.putBoolean("is_approve_all_pending_requests", false);
        A1F().A0w("group_join_request_approve_all_pending_requests", bundle);
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A02 = AnonymousClass4a6.A02(this);
        A02.A0E(2131891045);
        A02.A0D(2131891044);
        Bundle A0D = C17880vN.A0D();
        A02.setPositiveButton(2131899286, new AnonymousClass4bC((Object) this, (Object) A0D, 19));
        return AnonymousClass3MX.A0N(new AnonymousClass4bC((Object) this, (Object) A0D, 20), A02, 2131898766);
    }
}
