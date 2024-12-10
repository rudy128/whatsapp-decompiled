package com.whatsapp.catalogsearch.view.viewmodel;

import X.AEW;
import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1J2;
import X.AnonymousClass1YF;
import X.AnonymousClass8mE;
import X.AnonymousClass8mH;
import X.AnonymousClass8mI;
import X.AnonymousClass8mJ;
import X.AnonymousClass8mK;
import X.C108945cZ;
import X.C179309Hl;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C185779d8;
import X.C186649eX;
import X.C198309y8;
import X.C19973A1i;
import X.C201811d;
import X.C202111g;
import X.C21905AuV;
import X.C22055Awv;
import com.whatsapp.jid.UserJid;

public final class CatalogSearchViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(C22055Awv.A00);
    public final C18100vl A07 = AnonymousClass1DF.A01(new C21905AuV(this));

    public final void A0T(AEW aew, UserJid userJid, String str) {
        C18070vi.A0d(userJid, 1);
        if (!((C19973A1i) this.A02.get()).A02(aew)) {
            A00(this, new AnonymousClass8mI(AnonymousClass8mE.A00));
            return;
        }
        A00(this, AnonymousClass8mJ.A00);
        C198309y8.A00(C179309Hl.START, (C198309y8) this.A05.get(), userJid, str);
    }

    public static final void A00(CatalogSearchViewModel catalogSearchViewModel, C186649eX r1) {
        C108945cZ.A0Q(catalogSearchViewModel.A06).A0F(r1);
    }

    public CatalogSearchViewModel(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0o(r3, r4, r5);
        this.A05 = r3;
        this.A03 = r4;
        this.A02 = r5;
        C202111g A002 = C201811d.A00(49513);
        this.A04 = A002;
        this.A01 = ((C198309y8) r3.get()).A00;
        this.A00 = ((C185779d8) A002.get()).A00;
    }

    public final void A0U(AEW aew, String str) {
        if (str.length() == 0) {
            C19973A1i a1i = (C19973A1i) this.A02.get();
            A00(this, new AnonymousClass8mH(C19973A1i.A00(a1i, aew, "categories", C18020vd.A05(C18040vf.A02, a1i.A00, 1514))));
            ((C185779d8) this.A04.get()).A01.A0F("");
            return;
        }
        C185779d8 r2 = (C185779d8) this.A04.get();
        r2.A02.get();
        r2.A01.A0F(AnonymousClass1YF.A0I(str));
        A00(this, AnonymousClass8mK.A00);
    }
}
