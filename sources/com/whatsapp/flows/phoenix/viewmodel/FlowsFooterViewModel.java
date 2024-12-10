package com.whatsapp.flows.phoenix.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass6WL;
import X.C108945cZ;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C27191Vc;
import android.content.Context;

public final class FlowsFooterViewModel extends AnonymousClass1J2 {
    public AnonymousClass1M9 A00;
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final AnonymousClass1PM A02;
    public final C27191Vc A03;
    public final C18030ve A04;

    public final String A0T(Context context, String str) {
        if (str != null) {
            String string = context.getResources().getString(2131890445, AnonymousClass000.A1b(str, 1));
            C18070vi.A0X(string);
            C18030ve r3 = this.A04;
            C18040vf r2 = C18040vf.A02;
            int A002 = C18020vd.A00(r2, r3, 5275);
            if (C18020vd.A05(r2, r3, 5936) || !C18020vd.A05(r2, r3, 4078) || str.length() == 0 || string.length() <= A002) {
                return string;
            }
            String valueOf = String.valueOf(AnonymousClass6WL.A00(string, A002));
            if (valueOf != null) {
                return valueOf;
            }
        }
        return C18070vi.A0F(context, 2131890446);
    }

    public FlowsFooterViewModel(AnonymousClass1M9 r2, AnonymousClass1PM r3, C27191Vc r4, C18030ve r5) {
        C18070vi.A0s(r5, r3, r4, r2);
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r2;
    }
}
