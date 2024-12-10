package com.whatsapp.interopui.optin;

import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
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

public final class InteropOptInSelectIntegratorsViewModel extends AnonymousClass1J2 implements AnonymousClass5a4 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1DT A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass1DT A06;
    public final AnonymousClass1DT A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;

    public InteropOptInSelectIntegratorsViewModel(AnonymousClass11P r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r3, r4, r5, r6, r7);
        C18070vi.A0l(r8, r2);
        this.A09 = r3;
        this.A0D = r4;
        this.A0C = r5;
        this.A0B = r6;
        this.A0A = r7;
        this.A0E = r8;
        this.A08 = r2;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A03 = A0L;
        this.A00 = A0L;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A05 = A0L2;
        this.A04 = A0L2;
        AnonymousClass1DT A0L3 = AnonymousClass3MW.A0L();
        this.A06 = A0L3;
        this.A01 = A0L3;
        AnonymousClass1DT A0L4 = AnonymousClass3MW.A0L();
        this.A07 = A0L4;
        this.A02 = A0L4;
    }

    public static final void A00(InteropOptInSelectIntegratorsViewModel interopOptInSelectIntegratorsViewModel, List list) {
        ArrayList A0D2 = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17890vO.A1D(A0D2, ((C86884Tl) it.next()).A01.A00);
        }
        AnonymousClass3MX.A1Q(new InteropOptInSelectIntegratorsViewModel$optInIntegrator$1(interopOptInSelectIntegratorsViewModel, A0D2, list, (C30391dr) null), C41561wd.A00(interopOptInSelectIntegratorsViewModel));
    }

    public void C9n(List list) {
        A00(this, list);
    }
}
