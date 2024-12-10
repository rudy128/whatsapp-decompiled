package com.whatsapp.expressionstray.expression.gifs;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass18K;
import X.AnonymousClass1DT;
import X.AnonymousClass1G3;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass600;
import X.AnonymousClass87D;
import X.C108945cZ;
import X.C108975cc;
import X.C125886bq;
import X.C133816pX;
import X.C140126zz;
import X.C144557Ht;
import X.C146747Ql;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C202111g;
import X.C217517g;
import X.C30391dr;
import X.C41561wd;
import com.whatsapp.util.Log;

public final class GifExpressionsSearchViewModel extends AnonymousClass1J2 {
    public AnonymousClass1OB A00;
    public AnonymousClass1OB A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass1DT A03;
    public final C18030ve A04;
    public final AnonymousClass18K A05;
    public final C140126zz A06;
    public final AnonymousClass87D A07;
    public final AnonymousClass00H A08 = C217517g.A00(32769);
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass1G3 A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;

    public static final void A00(GifExpressionsSearchViewModel gifExpressionsSearchViewModel) {
        if (C18020vd.A05(C18040vf.A02, gifExpressionsSearchViewModel.A04, 10145)) {
            AnonymousClass3MX.A0x(gifExpressionsSearchViewModel.A0E).CGS(C146747Ql.A00(gifExpressionsSearchViewModel, 11), "GifExpressionsSearchViewModelOnCleared");
        }
    }

    public static final void A03(GifExpressionsSearchViewModel gifExpressionsSearchViewModel) {
        C133816pX r2 = (C133816pX) gifExpressionsSearchViewModel.A03.A06();
        if (r2 != null) {
            AnonymousClass87D r1 = gifExpressionsSearchViewModel.A07;
            C18070vi.A0d(r1, 0);
            r2.A03.remove(r1);
        }
    }

    public final void A0T(String str) {
        C30391dr A0j = C108975cc.A0j(this.A01);
        if (str == null || str.length() == 0) {
            C140126zz r1 = this.A06;
            if (r1.A04() != null) {
                Log.i("GifExpressionsSearchViewModel/usingCachedTrending");
                A03(this);
                C133816pX A042 = r1.A04();
                if (A042 != null) {
                    AnonymousClass1DT r12 = this.A03;
                    A042.A00(this.A07);
                    r12.A0F(A042);
                    return;
                }
                return;
            }
        }
        Log.i("GifExpressionsSearchViewModel/performingNewSearch");
        AnonymousClass600 r2 = AnonymousClass600.A00;
        C17900vP.A0Y(r2, "GifExpressionsSearchViewModel/setGifExpressionsViewState/", AnonymousClass000.A10());
        this.A02.A0F(r2);
        this.A01 = AnonymousClass3MY.A0s(new GifExpressionsSearchViewModel$runSearch$2(this, str, A0j), C41561wd.A00(this));
    }

    public GifExpressionsSearchViewModel(C18030ve r3, AnonymousClass18K r4, C140126zz r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0w(r4, r5, r6, r7, r8);
        C18070vi.A0l(r9, r3);
        this.A05 = r4;
        this.A06 = r5;
        this.A0B = r6;
        this.A09 = r7;
        this.A0A = r8;
        this.A0E = r9;
        this.A04 = r3;
        C202111g A002 = C217517g.A00(32768);
        this.A0D = A002;
        this.A03 = C108945cZ.A0S();
        this.A0C = ((C125886bq) A002.get()).A00;
        this.A02 = AnonymousClass3MW.A0M(AnonymousClass600.A00);
        this.A07 = new C144557Ht(this);
    }

    public void A0S() {
        A03(this);
        A00(this);
    }
}
