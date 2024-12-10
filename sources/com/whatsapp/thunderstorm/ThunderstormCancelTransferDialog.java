package com.whatsapp.thunderstorm;

import X.AnonymousClass3MY;
import X.AnonymousClass4DG;
import X.AnonymousClass4a6;
import X.C1411874q;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ThunderstormCancelTransferDialog extends Hilt_ThunderstormCancelTransferDialog {
    public final DialogInterface.OnClickListener A00;
    public final Integer A01;

    public ThunderstormCancelTransferDialog(DialogInterface.OnClickListener onClickListener, Integer num) {
        this.A00 = onClickListener;
        this.A01 = num;
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        A04.A0E(2131896880);
        A04.setNegativeButton(2131896879, this.A00);
        A04.setPositiveButton(2131896878, new C1411874q(46));
        Integer num = this.A01;
        if (num != null) {
            A04.A0D(num.intValue());
        }
        this.A05 = AnonymousClass4DG.DESTRUCTIVE;
        return AnonymousClass3MY.A0L(A04);
    }
}
