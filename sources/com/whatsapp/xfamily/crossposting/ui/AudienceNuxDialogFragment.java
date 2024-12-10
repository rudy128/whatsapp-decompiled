package com.whatsapp.xfamily.crossposting.ui;

import X.AnonymousClass000;
import X.AnonymousClass3MY;
import X.AnonymousClass3QU;
import X.AnonymousClass4a6;
import X.AnonymousClass758;
import X.C128906gs;
import X.C18070vi;
import X.C62762rw;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class AudienceNuxDialogFragment extends Hilt_AudienceNuxDialogFragment {
    public final C128906gs A00;

    public AudienceNuxDialogFragment(C128906gs r1) {
        this.A00 = r1;
    }

    public Dialog A27(Bundle bundle) {
        Context A14 = A14();
        ArrayList A13 = AnonymousClass000.A13();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C62762rw.A01(A14(), 260.0f), C62762rw.A01(A14(), 148.0f));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = C62762rw.A01(A14(), 20.0f);
        String A1H = A1H(2131886765);
        String A1H2 = A1H(2131886766);
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        A04.A0c(new AnonymousClass3QU(A14, layoutParams, 2131233560, (Integer) null, 10, (Integer) null, A1H, A1H2, A13));
        A04.setPositiveButton(2131893112, new AnonymousClass758(this, 42));
        A04.setNegativeButton(2131893111, new AnonymousClass758(this, 41));
        A2D(false);
        C18070vi.A0d("AudienceNuxDialogFragment Opening audience nux fragment", 0);
        return AnonymousClass3MY.A0L(A04);
    }
}
