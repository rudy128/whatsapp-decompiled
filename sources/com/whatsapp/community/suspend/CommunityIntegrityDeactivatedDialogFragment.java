package com.whatsapp.community.suspend;

import X.AnonymousClass00H;
import X.AnonymousClass1FL;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4bC;
import X.C72453Mb;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class CommunityIntegrityDeactivatedDialogFragment extends Hilt_CommunityIntegrityDeactivatedDialogFragment {
    public AnonymousClass00H A00;

    public Dialog A27(Bundle bundle) {
        AnonymousClass1FL A0Z = C72453Mb.A0Z(this);
        C73203Rj A002 = AnonymousClass4a6.A00(A0Z);
        AnonymousClass4bC r1 = new AnonymousClass4bC((Object) this, (Object) A0Z, 8);
        A002.A0D(2131888520);
        A002.setNegativeButton(2131899101, r1);
        A002.setPositiveButton(2131891164, (DialogInterface.OnClickListener) null);
        return AnonymousClass3MY.A0L(A002);
    }
}
