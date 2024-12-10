package com.whatsapp.interopui.notification;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4W8;
import X.AnonymousClass4WB;
import X.C108485bm;
import X.C17890vO;
import X.C18070vi;
import X.C18460wS;
import X.C23421Fz;
import X.C25691Pg;
import X.C27178DXn;
import X.C29351c6;
import X.C30391dr;
import X.C34071js;
import X.C34081jt;
import X.C41561wd;
import X.C86884Tl;
import java.util.ArrayList;
import java.util.List;

public final class InteropNotifOptInViewModel extends AnonymousClass1J2 {
    public final AnonymousClass00H A00;
    public final C108485bm A01;
    public final C23421Fz A02;
    public final AnonymousClass1G4 A03;
    public final AnonymousClass1G4 A04;
    public final AnonymousClass1G1 A05;
    public final AnonymousClass1G1 A06;

    public InteropNotifOptInViewModel(AnonymousClass00H r4) {
        C18070vi.A0d(r4, 1);
        this.A00 = r4;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(true);
        this.A03 = A18;
        this.A05 = new C34081jt((AnonymousClass1OB) null, A18);
        AnonymousClass1G7 A002 = C34071js.A00(C18460wS.A00);
        this.A04 = A002;
        this.A06 = new C34081jt((AnonymousClass1OB) null, A002);
        C27178DXn A012 = AnonymousClass4W8.A01(C25691Pg.SUSPEND, -2);
        this.A01 = A012;
        this.A02 = AnonymousClass4WB.A01(A012);
    }

    public static final void A00(InteropNotifOptInViewModel interopNotifOptInViewModel, List list, boolean z) {
        ArrayList<C86884Tl> A13 = AnonymousClass000.A13();
        List list2 = list;
        for (Object next : list) {
            if (((C86884Tl) next).A00) {
                A13.add(next);
            }
        }
        ArrayList A0D = C29351c6.A0D(A13);
        for (C86884Tl r0 : A13) {
            C17890vO.A1D(A0D, r0.A01.A00);
        }
        AnonymousClass3MX.A1Q(new InteropNotifOptInViewModel$onSave$1(interopNotifOptInViewModel, A0D, list2, (C30391dr) null, z), C41561wd.A00(interopNotifOptInViewModel));
    }
}
