package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass5OC;
import X.AnonymousClass9IF;
import X.B8S;
import X.C18070vi;
import X.C18100vl;
import X.C20336AGs;
import X.C22030AwW;
import X.C73203Rj;
import X.C88414Zp;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;
import java.util.List;

public final class AdminInviteErrorDialog extends WaDialogFragment {
    public B8S A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03 = C88414Zp.A02(this, "arg_dialog_message");
    public final C18100vl A04;

    public void A1x(Context context) {
        B8S b8s;
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (this.A00 == null) {
            AnonymousClass1FL A1B = A1B();
            if (A1B instanceof B8S) {
                b8s = (B8S) A1B;
            } else {
                b8s = null;
            }
            this.A00 = b8s;
        }
    }

    public AdminInviteErrorDialog() {
        Integer num = AnonymousClass00R.A0C;
        this.A04 = AnonymousClass1DF.A00(num, new AnonymousClass5OC(this));
        this.A01 = AnonymousClass1DF.A00(num, new C22030AwW(this, AnonymousClass9IF.NOT_SUPPORTED));
        this.A02 = C88414Zp.A01(this, "arg_caption");
    }

    public void A1K() {
        super.A1K();
        this.A00 = null;
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A032 = AnonymousClass4a6.A03(this);
        A032.A0S(AnonymousClass3MW.A0y(this.A03));
        if (AnonymousClass000.A1a((List) this.A04.getValue())) {
            C20336AGs.A01(this, A032, 16, 2131897145);
            A032.A0e(this, new C20336AGs(this, 17), 2131898766);
        } else {
            C20336AGs.A01(this, A032, 18, 2131899286);
        }
        return AnonymousClass3MY.A0L(A032);
    }
}
