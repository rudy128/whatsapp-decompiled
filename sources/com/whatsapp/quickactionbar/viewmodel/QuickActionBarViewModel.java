package com.whatsapp.quickactionbar.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass1G0;
import X.AnonymousClass1G3;
import X.AnonymousClass1J2;
import X.AnonymousClass1KR;
import X.AnonymousClass1OW;
import X.AnonymousClass4Z7;
import X.AnonymousClass4ZC;
import X.C147287So;
import X.C18070vi;
import X.C18600wl;
import X.C25691Pg;
import X.C25701Ph;
import X.C30391dr;

public final class QuickActionBarViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1KR A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass1G3 A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final C18600wl A06;
    public final C18600wl A07;
    public final AnonymousClass1G0 A08;

    public QuickActionBarViewModel(AnonymousClass1KR r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, C18600wl r11, C18600wl r12) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0p(r11, r12, r7);
        C18070vi.A0d(r8, 5);
        C18070vi.A0l(r9, r10);
        this.A00 = r6;
        this.A07 = r11;
        this.A06 = r12;
        this.A01 = r7;
        this.A05 = r8;
        this.A04 = r9;
        this.A02 = r10;
        C25701Ph r1 = new C25701Ph(C25691Pg.SUSPEND, 0, 0);
        this.A03 = r1;
        this.A08 = AnonymousClass4Z7.A00(AnonymousClass1OW.A02(r11), new C147287So(new QuickActionBarViewModel$actionBarState$1((C30391dr) null), r1), AnonymousClass4ZC.A01, 1);
    }
}
