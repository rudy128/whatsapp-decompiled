package com.whatsapp.product.newsletterenforcements.newsletterguidelines;

import X.AnonymousClass00H;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C21433Ak0;
import X.C36401np;
import X.C72463Mc;
import X.C89964dJ;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class NewsletterGuidelinesRequirementsBottomSheet extends Hilt_NewsletterGuidelinesRequirementsBottomSheet {
    public C18030ve A00;
    public C36401np A01;
    public AnonymousClass00H A02;

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass1FL A1D = A1D();
        View findViewById = view.findViewById(2131429135);
        TextView A0E = C17880vN.A0E(view, 2131428347);
        C36401np r5 = this.A01;
        if (r5 != null) {
            A0E.setText(r5.A06(A1D, new C21433Ak0(this, A1D, 33), AnonymousClass3MX.A16(this, "clickable-span", AnonymousClass3MW.A1a(), 0, 2131892653), "clickable-span", C72463Mc.A02(A1D)));
            C18030ve r0 = this.A00;
            if (r0 != null) {
                AnonymousClass3Ma.A1I(A0E, r0);
                C89964dJ.A00(findViewById, this, 27);
                return;
            }
            str = "abProps";
        } else {
            str = "linkifier";
        }
        C18070vi.A11(str);
        throw null;
    }

    public int A2F() {
        return 2131626194;
    }
}
