package com.whatsapp.calling.psa.viewmodel;

import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass3MW;
import X.AnonymousClass4W8;
import X.AnonymousClass4WB;
import X.AnonymousClass4Y7;
import X.C108485bm;
import X.C18070vi;
import X.C18460wS;
import X.C23421Fz;
import X.C24921Me;
import X.C25691Pg;
import X.C27178DXn;
import X.C34081jt;
import X.C85804Ou;

public final class GroupCallPsaViewModel extends AnonymousClass1J2 {
    public final C85804Ou A00;
    public final C24921Me A01;
    public final C108485bm A02;
    public final C23421Fz A03;
    public final AnonymousClass1G4 A04;
    public final AnonymousClass1G1 A05;

    public GroupCallPsaViewModel(C85804Ou r5, C24921Me r6) {
        C18070vi.A0d(r6, 1);
        this.A01 = r6;
        this.A00 = r5;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new AnonymousClass4Y7(0, C18460wS.A00));
        this.A04 = A18;
        this.A05 = new C34081jt((AnonymousClass1OB) null, A18);
        C27178DXn A012 = AnonymousClass4W8.A01(C25691Pg.SUSPEND, -2);
        this.A02 = A012;
        this.A03 = AnonymousClass4WB.A01(A012);
    }
}
