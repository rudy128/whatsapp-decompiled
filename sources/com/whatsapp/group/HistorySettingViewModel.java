package com.whatsapp.group;

import X.AnonymousClass00H;
import X.AnonymousClass11E;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass3L6;
import X.AnonymousClass3MW;
import X.AnonymousClass4WB;
import X.C108485bm;
import X.C17880vN;
import X.C18070vi;
import X.C23421Fz;
import X.C27178DXn;
import X.C72453Mb;
import X.C72473Md;
import X.C86834Tg;
import X.C96294nc;
import X.C96314ne;

public final class HistorySettingViewModel extends AnonymousClass1J2 {
    public AnonymousClass1E7 A00;
    public AnonymousClass1EC A01;
    public final AnonymousClass11E A02;
    public final AnonymousClass1M9 A03;
    public final AnonymousClass1MZ A04;
    public final AnonymousClass00H A05;
    public final C108485bm A06;
    public final C23421Fz A07;
    public final AnonymousClass1G4 A08;
    public final AnonymousClass1G1 A09;
    public final C96314ne A0A;
    public final AnonymousClass3L6 A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    public HistorySettingViewModel(AnonymousClass11E r4, AnonymousClass1M9 r5, AnonymousClass1MZ r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0p(r5, r6, r7);
        C72473Md.A1J(r8, r9);
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A0C = r8;
        this.A0D = r9;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new C86834Tg(false, true));
        this.A08 = A18;
        this.A09 = A18;
        C27178DXn dXn = new C27178DXn(0);
        this.A06 = dXn;
        this.A07 = AnonymousClass4WB.A01(dXn);
        C96294nc r2 = new C96294nc(this, 16);
        this.A0B = r2;
        C96314ne r1 = new C96314ne(this, 21);
        this.A0A = r1;
        AnonymousClass3MW.A0e(r8).A00(r2);
        C72453Mb.A1Q(r9, r1);
    }

    public void A0S() {
        AnonymousClass3MW.A0e(this.A0C).A01(this.A0B);
        C17880vN.A0V(this.A0D).unregisterObserver(this.A0A);
    }
}
