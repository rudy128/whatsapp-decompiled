package com.whatsapp.businessdirectory.viewmodel;

import X.AEQ;
import X.AF0;
import X.AM7;
import X.AWN;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1XN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass8BY;
import X.AnonymousClass8FK;
import X.BAY;
import X.C108975cc;
import X.C169208kX;
import X.C173998w4;
import X.C174098wE;
import X.C174308wZ;
import X.C17880vN;
import X.C18070vi;
import X.C184189aY;
import X.C190499l3;
import X.C190599lD;
import X.C192609og;
import X.C195699tl;
import X.C20041A4k;
import X.C20079A6f;
import X.C20650ATi;
import X.C20653ATl;
import X.C22557BCq;
import X.C72463Mc;
import X.C72473Md;
import android.app.Application;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class BusinessDirectoryPopularApiBusinessesViewModel extends AnonymousClass8FK implements C22557BCq, BAY {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final C192609og A01;
    public final AnonymousClass00H A02;
    public final C20653ATl A03;
    public final C20041A4k A04;
    public final AnonymousClass1XN A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessDirectoryPopularApiBusinessesViewModel(Application application, C20653ATl aTl, C192609og r7, C20041A4k a4k, AnonymousClass1XN r9, AnonymousClass00H r10) {
        super(application);
        C72473Md.A1M(application, a4k, r10, 1);
        C18070vi.A0d(r9, 6);
        this.A03 = aTl;
        this.A01 = r7;
        this.A04 = a4k;
        this.A02 = r10;
        this.A05 = r9;
        aTl.A08 = this;
        ((AM7) C18070vi.A0E(r10)).A04((Integer) null, 13, 89);
        A00();
    }

    public void Bmz(C190599lD r4, int i) {
        AnonymousClass1DT r2 = this.A00;
        int i2 = 2;
        if (i == -1) {
            i2 = 1;
        }
        r2.A0E(C18070vi.A0M(new C174308wZ(this, i2)));
    }

    private final void A00() {
        this.A00.A0E(C18070vi.A0M(new C173998w4()));
        C20653ATl aTl = this.A03;
        C20079A6f A002 = C20041A4k.A00(this.A04);
        aTl.A01();
        C20650ATi aTi = new C20650ATi(A002, aTl, (Jid) null);
        aTl.A03 = aTi;
        C169208kX BGx = aTl.A0H.BGx(new C184189aY(25, (String) null), (C190499l3) null, A002, (AEQ) null, aTi, aTl.A0M.A00, "all_descendents", "all_descendents", (String) null, "per_category_popular_biz");
        BGx.A0E();
        aTl.A00 = BGx;
    }

    public void A0S() {
        this.A03.A08 = null;
    }

    public void Boe(int i) {
        throw AnonymousClass000.A0n("Popular api businesses do not need location information");
    }

    public void Boj() {
        throw AnonymousClass000.A0n("Popular api businesses do not show filters");
    }

    public void C44() {
        throw AnonymousClass000.A0n("Popular api businesses do not need location information");
    }

    public void C4r() {
        throw AnonymousClass000.A0n("Popular api businesses do not show categories");
    }

    public void Bn0(C195699tl r13) {
        ArrayList A0s = C72463Mc.A0s(r13);
        for (AF0 af0 : r13.A06) {
            A0s.add(new C174098wE(af0, new AWN(this, af0, 1), 70));
        }
        LinkedHashMap A13 = C17880vN.A13();
        LinkedHashMap A132 = C17880vN.A13();
        A132.put("endpoint", "businesses");
        Integer A0f = AnonymousClass3MY.A0f();
        A132.put("api_biz_count", C108975cc.A0U("local_biz_count", A0f, A132));
        A132.put("sub_categories", A0f);
        A13.put("result", A132);
        ((AM7) this.A02.get()).A08((Integer) null, 13, A13, 13, 4, 2);
        this.A00.A0E(A0s);
    }

    public void BxL() {
        throw AnonymousClass8BY.A0b();
    }

    public void C45() {
        A00();
    }
}
