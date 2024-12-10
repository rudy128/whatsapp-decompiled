package com.whatsapp.companionmode.registration;

import X.A15;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11E;
import X.AnonymousClass11J;
import X.AnonymousClass11Q;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1JU;
import X.AnonymousClass3MW;
import X.AnonymousClass6UT;
import X.C108945cZ;
import X.C116395xC;
import X.C116405xD;
import X.C143407Dg;
import X.C146437Pc;
import X.C149207ig;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C26721Tf;
import X.C41731wy;
import X.C72473Md;

public final class CompanionRegistrationViewModel extends AnonymousClass1J2 {
    public boolean A00;
    public final int A01 = AnonymousClass1JU.A01.A03(1, 1000);
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DS A03;
    public final AnonymousClass1DS A04;
    public final AnonymousClass1DT A05;
    public final C26721Tf A06;
    public final AnonymousClass11J A07;
    public final AnonymousClass11E A08;
    public final AnonymousClass11Q A09;
    public final C18030ve A0A;
    public final A15 A0B;
    public final C41731wy A0C;
    public final C41731wy A0D;
    public final C18100vl A0E = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C149207ig(this));
    public final AnonymousClass6UT A0F;
    public final AnonymousClass10I A0G;

    public CompanionRegistrationViewModel(C26721Tf r5, AnonymousClass11E r6, AnonymousClass11Q r7, C18030ve r8, A15 a15, AnonymousClass10I r10) {
        C18070vi.A0d(r8, 1);
        C18070vi.A0p(r10, a15, r6);
        C72473Md.A1J(r5, r7);
        this.A0A = r8;
        this.A0G = r10;
        this.A0B = a15;
        this.A08 = r6;
        this.A06 = r5;
        this.A09 = r7;
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A05 = A0S;
        this.A02 = A0S;
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A0C = A0o;
        this.A03 = A0o;
        C41731wy A0o2 = AnonymousClass3MW.A0o();
        this.A0D = A0o2;
        this.A04 = A0o2;
        C116395xC r2 = new C116395xC(this, 1);
        this.A0F = r2;
        this.A07 = new C143407Dg(this, 0);
        C26721Tf.A00(r5).A07(r2);
        r10.CGN(new C146437Pc(this, 18));
        this.A00 = r6.A09();
    }

    public static final void A00(CompanionRegistrationViewModel companionRegistrationViewModel) {
        companionRegistrationViewModel.A05.A0E(new C116405xD(false));
        companionRegistrationViewModel.A0B.A01.set(C17890vO.A0Q());
        companionRegistrationViewModel.A0G.CGN(new C146437Pc(companionRegistrationViewModel, 19));
    }

    public void A0S() {
        C26721Tf r2 = this.A06;
        C26721Tf.A00(r2).A08(this.A0F);
        C26721Tf.A00(r2).A05();
        this.A08.unregisterObserver(this.A07);
    }
}
