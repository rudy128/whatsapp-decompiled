package com.whatsapp.authgraphql.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.C111175ia;
import X.C187029f9;
import com.whatsapp.util.Log;

public final class CommonViewModel extends C111175ia {
    public boolean A0V(C187029f9 r5) {
        String A1I;
        int i = r5.A00;
        if (i == 7) {
            A1I = "Common/handleError: layout network";
        } else {
            A1I = AnonymousClass001.A1I("Common/handleError: Something went wrong ", AnonymousClass000.A10(), i);
        }
        Log.e(A1I);
        return false;
    }

    public CommonViewModel(AnonymousClass00H r1) {
        super(r1);
    }
}
