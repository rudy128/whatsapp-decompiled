package com.whatsapp.chatinfo;

import X.AnonymousClass1FL;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass7AL;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.TextView;

public class ChatMediaVisibilityOffDialog extends Hilt_ChatMediaVisibilityOffDialog {
    public Dialog A27(Bundle bundle) {
        int i;
        AnonymousClass1FL A1D = A1D();
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            i = bundle2.getInt("reason");
        } else {
            i = 0;
        }
        C73203Rj A00 = AnonymousClass4a6.A00(A1D);
        TextView textView = (TextView) AnonymousClass3MY.A0D(A1D.getLayoutInflater(), 2131625044);
        if (i != 1) {
            textView.setText(2131889905);
            A00.A0D(2131889904);
        } else {
            textView.setText(2131891947);
            A00.A0S(A14().getString(2131891945));
        }
        A00.A0R(textView);
        A00.A0i(this, new AnonymousClass7AL(0), A1H(2131899286));
        return A00.create();
    }
}
