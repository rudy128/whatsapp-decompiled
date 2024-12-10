package com.whatsapp.interopui.compose;

import X.AnonymousClass00H;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass5VC;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C22801Dg;
import X.C65032vj;
import X.C98494rF;
import X.C99244sV;
import java.util.List;

public final class InteropComposeSelectIntegratorViewModel extends AnonymousClass1J2 {
    public List A00 = C18460wS.A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18600wl A05;

    public InteropComposeSelectIntegratorViewModel(AnonymousClass00H r8, AnonymousClass00H r9, C18600wl r10) {
        AnonymousClass1DS r1;
        C18070vi.A0o(r8, r9, r10);
        this.A04 = r8;
        this.A03 = r9;
        this.A05 = r10;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A02 = A0L;
        C99244sV A002 = C99244sV.A00(this, 35);
        C22801Dg r4 = new C22801Dg();
        C98494rF A003 = C98494rF.A00();
        Object obj = A0L.A08;
        Object obj2 = AnonymousClass1DS.A0A;
        if (!(obj == obj2 || (r1 = (AnonymousClass1DS) A002.invoke(A0L.A06())) == null || r1.A08 == obj2)) {
            r4.A0F(r1.A06());
        }
        r4.A0H(A0L, new C65032vj(new AnonymousClass5VC(r4, A002, A003), 0));
        this.A01 = r4;
    }
}
