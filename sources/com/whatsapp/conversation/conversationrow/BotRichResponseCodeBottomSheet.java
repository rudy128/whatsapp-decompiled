package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C18100vl;
import X.C27717Djz;
import X.C27718Dk0;
import X.C27719Dk1;
import X.C89904dD;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class BotRichResponseCodeBottomSheet extends Hilt_BotRichResponseCodeBottomSheet {
    public final C18100vl A00 = AnonymousClass1DF.A01(new C27717Djz(this));
    public final C18100vl A01 = AnonymousClass1DF.A01(new C27718Dk0(this));
    public final C18100vl A02 = AnonymousClass1DF.A01(new C27719Dk1(this));

    public void A21(Bundle bundle, View view) {
        String str;
        String str2;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (str = bundle2.getString("title")) == null) {
            str = A1H(2131895359);
        }
        C18070vi.A0b(str);
        Bundle bundle3 = this.A06;
        if (bundle3 == null || (str2 = bundle3.getString("code")) == null) {
            str2 = "";
        }
        ((TextView) this.A02.getValue()).setText(str);
        ((TextView) this.A01.getValue()).setText(str2);
        C89904dD.A00(AnonymousClass3MW.A0A(this.A00), this, 19);
    }

    public int A2F() {
        return 2131624317;
    }
}
