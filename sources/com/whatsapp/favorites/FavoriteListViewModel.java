package com.whatsapp.favorites;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4I5;
import X.AnonymousClass4Z7;
import X.AnonymousClass4Z8;
import X.AnonymousClass5HX;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C18600wl;
import X.C29351c6;
import X.C30391dr;
import X.C34071js;
import X.C41561wd;
import X.C62482rT;
import X.C72463Mc;
import X.C96044nD;
import X.C99654tF;
import java.util.ArrayList;
import java.util.List;

public final class FavoriteListViewModel extends AnonymousClass1J2 {
    public int A00 = 6;
    public boolean A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04;
    public final C18600wl A05;
    public final AnonymousClass1G4 A06;
    public final AnonymousClass1G4 A07;
    public final AnonymousClass1G1 A08;
    public final AnonymousClass1G1 A09;
    public final AnonymousClass00H A0A;

    public void A0S() {
        AnonymousClass3MY.A1R(C17880vN.A0V(this.A0A), this.A04);
        this.A01 = false;
    }

    public final void A0T() {
        if (!this.A01) {
            AnonymousClass3MW.A1X(this.A05, new FavoriteListViewModel$loadFavorites$1(this, (C30391dr) null), C41561wd.A00(this));
            C17880vN.A0V(this.A0A).registerObserver(this.A04.getValue());
            this.A01 = true;
        }
    }

    public FavoriteListViewModel(AnonymousClass1M9 r6, AnonymousClass00H r7, AnonymousClass00H r8, C18600wl r9) {
        C18070vi.A0s(r6, r7, r8, r9);
        this.A02 = r6;
        this.A03 = r7;
        this.A0A = r8;
        this.A05 = r9;
        C18460wS r4 = C18460wS.A00;
        AnonymousClass1G7 A002 = C34071js.A00(r4);
        this.A06 = A002;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(AnonymousClass000.A0h());
        this.A07 = A18;
        this.A09 = A18;
        this.A08 = AnonymousClass4Z7.A01(r4, C41561wd.A00(this), AnonymousClass4I5.A00(r9, AnonymousClass4Z8.A00(new FavoriteListViewModel$favorites$1(this, (C30391dr) null), A002, A18)), C99654tF.A00());
        this.A04 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5HX(this));
    }

    public final void A0U(C62482rT r8) {
        Object value;
        ArrayList A13;
        AnonymousClass3MW.A1X(this.A05, new FavoriteListViewModel$deleteFavorite$1(r8, this, (C30391dr) null), C41561wd.A00(this));
        AnonymousClass1G4 r6 = this.A06;
        do {
            value = r6.getValue();
            A13 = AnonymousClass000.A13();
            for (Object next : (List) value) {
                if (!C18070vi.A18(((C62482rT) next).A03, r8.A03)) {
                    A13.add(next);
                }
            }
        } while (!r6.BFK(value, A13));
    }

    public final void A0V(List list) {
        ArrayList<C96044nD> A0s = C72463Mc.A0s(list);
        for (Object next : list) {
            if (next instanceof C96044nD) {
                A0s.add(next);
            }
        }
        ArrayList A0D = C29351c6.A0D(A0s);
        for (C96044nD r0 : A0s) {
            A0D.add(r0.A01);
        }
        AnonymousClass1G4 r1 = this.A06;
        do {
        } while (!r1.BFK(r1.getValue(), A0D));
        AnonymousClass3MW.A1X(this.A05, new FavoriteListViewModel$updateFavoritesOrder$1(this, A0D, (C30391dr) null), C41561wd.A00(this));
    }
}
