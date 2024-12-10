package com.whatsapp.status.advertise;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1WR;
import X.AnonymousClass2D9;
import X.AnonymousClass7FH;
import X.C108945cZ;
import X.C108955ca;
import X.C143617Ec;
import X.C153537pg;
import X.C153547ph;
import X.C18070vi;
import X.C18100vl;
import X.C18140vp;
import X.C18460wS;
import X.C19830z4;
import X.C19880zA;
import X.C37361pP;
import X.C37471pb;
import java.util.List;

public final class AdvertiseViewModel extends AnonymousClass1J2 {
    public C19830z4 A00;
    public List A01 = C18460wS.A00;
    public AnonymousClass2D9 A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass10I A04;
    public final C18100vl A05;
    public final AnonymousClass1DS A06;
    public final C37361pP A07;
    public final C19880zA A08;
    public final C19880zA A09;
    public final C19880zA A0A;
    public final AnonymousClass1WR A0B;
    public final AnonymousClass00H A0C;
    public final C18140vp A0D;
    public final C18100vl A0E = AnonymousClass1DF.A01(new C153547ph(this));

    public final void A0T() {
        C108955ca.A1O(this.A02);
        AnonymousClass2D9 r3 = (AnonymousClass2D9) this.A0D.get();
        ((C37471pb) this.A05.getValue()).A00(new C143617Ec(this, 2), r3);
        this.A02 = r3;
    }

    public AdvertiseViewModel(C37361pP r3, C19880zA r4, C19880zA r5, C19880zA r6, C19830z4 r7, AnonymousClass10I r8, AnonymousClass00H r9, C18140vp r10) {
        C18070vi.A0w(r8, r10, r7, r3, r9);
        C18070vi.A0q(r4, r5, r6);
        this.A04 = r8;
        this.A0D = r10;
        this.A00 = r7;
        this.A07 = r3;
        this.A0C = r9;
        this.A08 = r4;
        this.A0A = r5;
        this.A09 = r6;
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A03 = A0S;
        this.A06 = A0S;
        this.A0B = new AnonymousClass7FH(this, 10);
        this.A05 = AnonymousClass1DF.A01(new C153537pg(this));
    }
}
