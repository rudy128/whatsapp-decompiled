package com.whatsapp.growthlock;

import X.AnonymousClass00H;
import X.AnonymousClass1FL;
import X.AnonymousClass4a6;
import X.AnonymousClass4bC;
import X.C010105w;
import X.C18070vi;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class InviteLinkUnavailableDialogFragment extends Hilt_InviteLinkUnavailableDialogFragment {
    public AnonymousClass00H A00;

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        if (A15().getBoolean("finishCurrentActivity")) {
            C72463Mc.A1A(this);
        }
    }

    public Dialog A27(Bundle bundle) {
        AnonymousClass1FL A0Z = C72453Mb.A0Z(this);
        boolean z = A15().getBoolean("isGroupStillLocked");
        AnonymousClass4bC r4 = new AnonymousClass4bC((Object) this, (Object) A0Z, 25);
        View inflate = A16().inflate(2131625044, (ViewGroup) null);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        TextView textView = (TextView) inflate;
        int i = 2131891505;
        if (z) {
            i = 2131891503;
        }
        textView.setText(i);
        C73203Rj A002 = AnonymousClass4a6.A00(A0Z);
        A002.A0R(textView);
        int i2 = 2131891504;
        if (z) {
            i2 = 2131891502;
        }
        A002.A0D(i2);
        A002.A0T(true);
        A002.A0X(r4, 2131899101);
        A002.A0Z((DialogInterface.OnClickListener) null, 2131899286);
        C010105w create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
