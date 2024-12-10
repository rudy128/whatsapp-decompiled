package com.whatsapp.catalogcategory.view.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.C18100vl;
import X.C18110vm;
import X.C192569oc;
import X.C201811d;
import X.C22051Awr;
import X.C22052Aws;
import X.C41731wy;
import X.C72473Md;

public final class CatalogAllCategoryViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final C192569oc A03;
    public final C41731wy A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07 = C201811d.A00(65551);
    public final C18100vl A08;
    public final C18100vl A09;

    public CatalogAllCategoryViewModel(C192569oc r2, AnonymousClass10I r3, AnonymousClass00H r4) {
        C72473Md.A1I(r3, r4);
        this.A05 = r3;
        this.A03 = r2;
        this.A06 = r4;
        C18110vm A012 = AnonymousClass1DF.A01(C22052Aws.A00);
        this.A09 = A012;
        this.A01 = (AnonymousClass1DS) A012.getValue();
        C18110vm A013 = AnonymousClass1DF.A01(C22051Awr.A00);
        this.A08 = A013;
        this.A00 = (AnonymousClass1DS) A013.getValue();
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A04 = A0o;
        this.A02 = A0o;
    }
}
