package com.whatsapp.shareselection;

import X.AnonymousClass000;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass4WX;
import X.C18070vi;
import X.C18100vl;
import X.C27142DWd;
import X.C41731wy;
import X.C72453Mb;
import X.C98974s1;
import X.CTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ShareActionsViewModel extends AnonymousClass1J2 {
    public List A00;
    public final C41731wy A01 = AnonymousClass3MW.A0o();
    public final CTO A02;

    public final void A0T() {
        AnonymousClass4WX r3 = new AnonymousClass4WX();
        C18100vl r4 = this.A02.A06;
        Set keySet = AnonymousClass3MW.A12(r4).keySet();
        C18070vi.A0d(keySet, 0);
        List A002 = C98974s1.A00(keySet, new C27142DWd(r3, 9), 14);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            Object A0w = AnonymousClass000.A0w(AnonymousClass3MW.A12(r4), C72453Mb.A0H(it));
            if (A0w != null) {
                A13.add(A0w);
            }
        }
        this.A00 = A13;
    }

    public ShareActionsViewModel(CTO cto) {
        this.A02 = cto;
    }
}
