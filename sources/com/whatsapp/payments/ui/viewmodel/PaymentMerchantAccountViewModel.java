package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1J2;
import X.AnonymousClass1QS;
import X.B5R;
import X.BD4;
import X.C175378yc;
import X.C17880vN;
import X.C180609Nf;
import X.C18070vi;
import X.C18100vl;
import X.C20112A7u;
import X.C20755AXk;
import X.C22079AxJ;
import X.C22080AxK;
import X.C22081AxL;
import X.C22082AxM;
import X.C31051ew;
import X.C31071ey;
import X.C72453Mb;

public final class PaymentMerchantAccountViewModel extends AnonymousClass1J2 {
    public final C31051ew A00;
    public final AnonymousClass1QS A01;
    public final BD4 A02;
    public final C31071ey A03;
    public final AnonymousClass10I A04;
    public final C18100vl A05 = AnonymousClass1DF.A01(C22079AxJ.A00);
    public final C18100vl A06 = AnonymousClass1DF.A01(C22080AxK.A00);
    public final C18100vl A07 = AnonymousClass1DF.A01(C22081AxL.A00);
    public final C18100vl A08 = AnonymousClass1DF.A01(C22082AxM.A00);
    public final C180609Nf A09;
    public final B5R A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public final void A0T(int i) {
        this.A02.BiM((C20112A7u) null, Integer.valueOf(i), "business_hub", (String) null, 1);
    }

    public void A0S() {
        C17880vN.A0V(this.A0C).unregisterObserver(this.A0A);
        C17880vN.A0V(this.A0B).unregisterObserver(this.A09);
    }

    public PaymentMerchantAccountViewModel(C31051ew r4, AnonymousClass1QS r5, BD4 bd4, C31071ey r7, AnonymousClass10I r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r8, r5, bd4, r9, r7);
        C18070vi.A0l(r4, r10);
        this.A04 = r8;
        this.A01 = r5;
        this.A02 = bd4;
        this.A0B = r9;
        this.A03 = r7;
        this.A00 = r4;
        this.A0C = r10;
        C175378yc r2 = new C175378yc(this, 9);
        this.A09 = r2;
        C20755AXk aXk = new C20755AXk(this, 1);
        this.A0A = aXk;
        C72453Mb.A1Q(r10, aXk);
        C72453Mb.A1Q(r9, r2);
    }
}
