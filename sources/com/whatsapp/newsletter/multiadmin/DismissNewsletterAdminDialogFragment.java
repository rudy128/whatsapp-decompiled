package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass5OD;
import X.C17880vN;
import X.C18100vl;
import X.C73203Rj;
import X.C91524fp;
import X.C91604fx;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class DismissNewsletterAdminDialogFragment extends Hilt_DismissNewsletterAdminDialogFragment {
    public AnonymousClass11S A00;
    public AnonymousClass00H A01;
    public final C18100vl A02 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5OD(this));

    public Dialog A27(Bundle bundle) {
        AnonymousClass11S r1 = this.A00;
        if (r1 != null) {
            boolean A0O = r1.A0O(AnonymousClass3MX.A0m(this.A02));
            View A08 = AnonymousClass3MX.A08(A1B(), 2131626179);
            TextView A0E = C17880vN.A0E(A08, 2131436501);
            A0E.setText(2131897308);
            C73203Rj A03 = AnonymousClass4a6.A03(this);
            int i = 2131889492;
            if (A0O) {
                i = 2131889502;
            }
            A03.A0E(i);
            int i2 = 2131889491;
            if (A0O) {
                i2 = 2131889501;
            }
            A03.A0D(i2);
            if (A0O) {
                A03.A0c(A08);
            }
            A03.A0g(this, new C91524fp(A0E, this, 1, A0O), 2131899286);
            A03.A0e(this, new C91604fx(this, 49), 2131898766);
            return AnonymousClass3MY.A0L(A03);
        }
        AnonymousClass3MW.A1D();
        throw null;
    }
}
