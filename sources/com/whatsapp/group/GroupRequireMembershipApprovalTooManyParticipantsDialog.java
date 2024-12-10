package com.whatsapp.group;

import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.AnonymousClass4bC;
import X.C17880vN;
import X.C18070vi;
import X.C73203Rj;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;

public final class GroupRequireMembershipApprovalTooManyParticipantsDialog extends WaDialogFragment {
    public static final void A00(Bundle bundle, GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog) {
        C18070vi.A0d(bundle, 0);
        bundle.putBoolean("is_approve_all_pending_requests", true);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A1F().A0w("group_join_request_group_too_full", bundle);
    }

    public static final void A01(Bundle bundle, GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog) {
        C18070vi.A0d(bundle, 0);
        bundle.putBoolean("is_approve_all_pending_requests", false);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A1F().A0w("group_join_request_group_too_full", bundle);
    }

    public Dialog A27(Bundle bundle) {
        int i;
        int i2;
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0E(2131891046);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            i = bundle2.getInt("remaining_capacity");
        } else {
            i = 0;
        }
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            i2 = bundle3.getInt("pending_request_count");
        } else {
            i2 = 0;
        }
        Resources A09 = AnonymousClass3MZ.A09(this);
        Object[] A1b = AnonymousClass3MW.A1b();
        C17880vN.A1T(A1b, i, 0);
        C17880vN.A1T(A1b, i2, 1);
        A03.A0S(A09.getQuantityString(2131755174, i2, A1b));
        Bundle A0D = C17880vN.A0D();
        A03.setPositiveButton(2131887451, new AnonymousClass4bC((Object) A0D, (Object) this, 23));
        A03.setNegativeButton(2131898766, new AnonymousClass4bC((Object) A0D, (Object) this, 24));
        return AnonymousClass3MY.A0L(A03);
    }
}
