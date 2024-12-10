package com.whatsapp.payments.ui.viewmodel;

import X.A5I;
import X.A5Y;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1KH;
import X.AnonymousClass1QD;
import X.AnonymousClass1QS;
import X.AnonymousClass3Bx;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.BD4;
import X.C108965cb;
import X.C171858sO;
import X.C175378yc;
import X.C175998zc;
import X.C17880vN;
import X.C180609Nf;
import X.C18070vi;
import X.C20112A7u;
import X.C21114Aei;
import X.C21132Af0;
import X.C48052Kz;
import X.C72473Md;

public final class BrazilPixKeySettingViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0M((Object) null);
    public final AnonymousClass1DT A01 = C108965cb.A0D(0);
    public final AnonymousClass1KB A02;
    public final AnonymousClass1KH A03;
    public final C180609Nf A04 = new C175378yc(this, 7);
    public final C48052Kz A05;
    public final AnonymousClass1QS A06;
    public final C175998zc A07;
    public final A5Y A08;
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass1QD A0C;
    public final BD4 A0D;

    public final void A0U(String str) {
        C18070vi.A0d(str, 0);
        AnonymousClass1QD r3 = this.A0C;
        if (!r3.A03().getBoolean("pix_used", false)) {
            C17880vN.A1F(AnonymousClass8BU.A07(r3), "pix_used", true);
        }
        AnonymousClass3MX.A1K(this.A01, 1);
        A5I A012 = this.A06.A01();
        C21132Af0 af0 = new C21132Af0();
        A012.A03.CGF(new AnonymousClass3Bx(A012, af0, 44));
        af0.A09(new C21114Aei(5, str, this));
    }

    public void A0S() {
        this.A05.unregisterObserver(this.A04);
    }

    public final void A0T(Integer num, String str, String str2, String str3, int i) {
        BD4 bd4 = this.A0D;
        C171858sO A0D2 = AnonymousClass8BV.A0D(bd4, i);
        A0D2.A07 = num;
        A0D2.A0b = str;
        A0D2.A0Y = str3;
        A0D2.A0a = str2;
        C20112A7u A022 = C20112A7u.A02();
        A022.A07("payment_method", "pix");
        AnonymousClass8BR.A1H(A0D2, A022);
        bd4.BiH(A0D2);
    }

    public BrazilPixKeySettingViewModel(AnonymousClass1KB r3, AnonymousClass1KH r4, C48052Kz r5, AnonymousClass1QD r6, AnonymousClass1QS r7, C175998zc r8, BD4 bd4, A5Y a5y, AnonymousClass10I r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r3, r11, r4, r7, r6);
        C18070vi.A0l(bd4, r5);
        C72473Md.A1K(a5y, r12);
        C18070vi.A0d(r13, 11);
        this.A02 = r3;
        this.A09 = r11;
        this.A03 = r4;
        this.A06 = r7;
        this.A0C = r6;
        this.A0D = bd4;
        this.A05 = r5;
        this.A07 = r8;
        this.A08 = a5y;
        this.A0A = r12;
        this.A0B = r13;
    }
}
