package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11S;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1V9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4I5;
import X.AnonymousClass4Z7;
import X.AnonymousClass4Z8;
import X.C101605Dg;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C18600wl;
import X.C19880zA;
import X.C30391dr;
import X.C34071js;
import X.C41561wd;
import X.C41731wy;
import X.C72473Md;
import X.C99654tF;

public final class FavoriteCallListViewModel extends AnonymousClass1J2 {
    public final C19880zA A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1V9 A02;
    public final AnonymousClass1M9 A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1MZ A05;
    public final C18030ve A06;
    public final C41731wy A07 = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final C18100vl A0A;
    public final C18600wl A0B;
    public final C18600wl A0C;
    public final AnonymousClass1G4 A0D;
    public final AnonymousClass1G4 A0E;
    public final AnonymousClass1G1 A0F;
    public final AnonymousClass1G1 A0G;
    public final AnonymousClass00H A0H;

    public void A0S() {
        AnonymousClass3MY.A1R(C17880vN.A0V(this.A0H), this.A0A);
    }

    public FavoriteCallListViewModel(C19880zA r8, AnonymousClass11S r9, AnonymousClass1V9 r10, AnonymousClass1M9 r11, AnonymousClass1CJ r12, AnonymousClass1MZ r13, C18030ve r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, C18600wl r18, C18600wl r19) {
        C18070vi.A0w(r14, r9, r12, r11, r15);
        AnonymousClass00H r4 = r17;
        AnonymousClass00H r1 = r16;
        C18070vi.A0x(r1, r10, r4, r13, r8);
        C18600wl r3 = r18;
        C18600wl r0 = r19;
        C72473Md.A1L(r3, r0);
        this.A06 = r14;
        this.A01 = r9;
        this.A04 = r12;
        this.A03 = r11;
        this.A08 = r15;
        this.A09 = r1;
        this.A02 = r10;
        this.A0H = r4;
        this.A05 = r13;
        this.A00 = r8;
        this.A0B = r3;
        this.A0C = r0;
        C18460wS r6 = C18460wS.A00;
        AnonymousClass1G7 A002 = C34071js.A00(r6);
        this.A0E = A002;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(AnonymousClass000.A0h());
        this.A0D = A18;
        this.A0F = A18;
        this.A0G = AnonymousClass4Z7.A01(r6, C41561wd.A00(this), AnonymousClass4I5.A00(r3, AnonymousClass4Z8.A00(new FavoriteCallListViewModel$favorites$1(this, (C30391dr) null), A002, A18)), C99654tF.A00());
        this.A0A = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C101605Dg(this));
        AnonymousClass3MW.A1X(this.A0B, new FavoriteCallListViewModel$loadFavorites$1(this, (C30391dr) null), C41561wd.A00(this));
        C17880vN.A0V(r4).registerObserver(this.A0A.getValue());
    }
}
