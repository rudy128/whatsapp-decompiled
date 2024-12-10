package com.whatsapp.community;

import X.AnonymousClass11E;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OB;
import X.AnonymousClass3MW;
import X.AnonymousClass4Y9;
import X.C18070vi;
import X.C18600wl;
import X.C34081jt;
import X.C40371ub;
import X.C42941yz;
import X.C77153pT;
import X.C87834Xg;

public final class SelectCommunityForGroupViewModel extends AnonymousClass1J2 {
    public final C87834Xg A00;
    public final C40371ub A01;
    public final AnonymousClass11E A02;
    public final AnonymousClass1CJ A03;
    public final C18600wl A04;
    public final AnonymousClass1G4 A05;
    public final AnonymousClass1G1 A06;
    public final AnonymousClass1MZ A07;

    public final void A0T(AnonymousClass1E7 r7) {
        AnonymousClass1BI r0;
        Object value;
        boolean z;
        C42941yz r02 = AnonymousClass1EC.A01;
        if (r7 != null) {
            r0 = r7.A0J;
        } else {
            r0 = null;
        }
        AnonymousClass1EC A002 = C42941yz.A00(r0);
        AnonymousClass1G4 r4 = this.A05;
        do {
            value = r4.getValue();
            z = false;
            if (A002 != null && !this.A07.A0K(A002)) {
                z = true;
            }
        } while (!r4.BFK(value, new C77153pT(new AnonymousClass4Y9(A002, z))));
    }

    public SelectCommunityForGroupViewModel(C87834Xg r4, C40371ub r5, AnonymousClass11E r6, AnonymousClass1CJ r7, AnonymousClass1MZ r8, C18600wl r9) {
        C18070vi.A0w(r9, r7, r5, r8, r6);
        C18070vi.A0d(r4, 6);
        this.A04 = r9;
        this.A03 = r7;
        this.A01 = r5;
        this.A07 = r8;
        this.A02 = r6;
        this.A00 = r4;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new C77153pT(new AnonymousClass4Y9((AnonymousClass1EC) null, false)));
        this.A05 = A18;
        this.A06 = new C34081jt((AnonymousClass1OB) null, A18);
    }
}
