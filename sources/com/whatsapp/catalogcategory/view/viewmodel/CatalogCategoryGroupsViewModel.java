package com.whatsapp.catalogcategory.view.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C169528lq;
import X.C169538lr;
import X.C179299Hk;
import X.C18070vi;
import X.C18100vl;
import X.C18110vm;
import X.C190919lj;
import X.C192569oc;
import X.C195139sr;
import X.C201811d;
import X.C21434Ak1;
import X.C22053Awt;
import X.C41731wy;
import X.C72473Md;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class CatalogCategoryGroupsViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DT A03;
    public final C192569oc A04;
    public final AnonymousClass10I A05;
    public final C18100vl A06;
    public final C41731wy A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09 = C201811d.A00(65551);

    public final void A0T(UserJid userJid, List list) {
        C18070vi.A0d(list, 0);
        AnonymousClass3MY.A1L(this.A03, false);
        C21434Ak1.A00(this.A05, this, list, userJid, 36);
    }

    public static final void A00(C195139sr r4, CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid, int i) {
        Object r1;
        C179299Hk r2 = C179299Hk.CATALOG_CATEGORY_FLOW;
        C41731wy r3 = catalogCategoryGroupsViewModel.A07;
        catalogCategoryGroupsViewModel.A09.get();
        if (r4.A04) {
            r1 = new C169538lr(userJid, r4.A01, r4.A02, i);
        } else {
            r1 = new C169528lq(r2, userJid, r4.A01);
        }
        r3.A0F(r1);
    }

    public static final void A03(C195139sr r5, CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid, int i, int i2) {
        ((C190919lj) catalogCategoryGroupsViewModel.A08.get()).A00(userJid, r5.A01, i, 3, i2, r5.A04);
    }

    public CatalogCategoryGroupsViewModel(C192569oc r2, AnonymousClass10I r3, AnonymousClass00H r4) {
        C72473Md.A1I(r3, r4);
        this.A05 = r3;
        this.A04 = r2;
        this.A08 = r4;
        C18110vm A012 = AnonymousClass1DF.A01(C22053Awt.A00);
        this.A06 = A012;
        this.A00 = (AnonymousClass1DS) A012.getValue();
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A07 = A0o;
        this.A01 = A0o;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A03 = A0L;
        this.A02 = A0L;
    }
}
