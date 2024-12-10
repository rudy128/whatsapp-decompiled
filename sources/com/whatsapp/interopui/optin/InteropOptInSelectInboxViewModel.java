package com.whatsapp.interopui.optin;

import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1G1;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass5a4;
import X.C17890vO;
import X.C18070vi;
import X.C29351c6;
import X.C30391dr;
import X.C41561wd;
import X.C86884Tl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class InteropOptInSelectInboxViewModel extends AnonymousClass1J2 implements AnonymousClass5a4 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass1G1 A06;

    public InteropOptInSelectInboxViewModel(AnonymousClass11P r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r3, r4, r5, r2);
        this.A05 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = r2;
        this.A06 = AnonymousClass3MX.A0k(r3).A03;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A01 = A0L;
        this.A00 = A0L;
    }

    public void C9n(List list) {
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17890vO.A1D(A0D, ((C86884Tl) it.next()).A01.A00);
        }
        AnonymousClass3MX.A1Q(new InteropOptInSelectInboxViewModel$onUserOptedIn$1(this, A0D, list, (C30391dr) null), C41561wd.A00(this));
    }
}
