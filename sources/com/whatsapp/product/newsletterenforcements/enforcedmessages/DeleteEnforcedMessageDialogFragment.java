package com.whatsapp.product.newsletterenforcements.enforcedmessages;

import X.AnonymousClass00H;
import X.AnonymousClass122;
import X.C21448AkF;
import X.C33251iW;
import X.C72463Mc;

public final class DeleteEnforcedMessageDialogFragment extends Hilt_DeleteEnforcedMessageDialogFragment {
    public C33251iW A00;
    public AnonymousClass122 A01;
    public AnonymousClass00H A02;

    public static final void A00(DeleteEnforcedMessageDialogFragment deleteEnforcedMessageDialogFragment) {
        deleteEnforcedMessageDialogFragment.A04.CGF(new C21448AkF(deleteEnforcedMessageDialogFragment, 44));
        if (deleteEnforcedMessageDialogFragment.A15().getBoolean("arg_finish_activity_on_dismiss")) {
            C72463Mc.A1A(deleteEnforcedMessageDialogFragment);
        }
    }
}
