package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1DT;
import X.AnonymousClass1KH;
import X.AnonymousClass1KI;
import X.AnonymousClass3MW;
import X.AnonymousClass8BV;
import X.AnonymousClass8FL;
import X.BD4;
import X.C171858sO;
import X.C175378yc;
import X.C180609Nf;
import X.C18070vi;
import X.C33251iW;
import X.C48052Kz;

public final class BrazilSendPixKeyViewModel extends AnonymousClass8FL {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass11S A01;
    public final C33251iW A02;
    public final AnonymousClass1KH A03;
    public final C180609Nf A04 = new C175378yc(this, 8);
    public final C48052Kz A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass1KI A07;
    public final BD4 A08;

    public void A0S() {
        this.A05.unregisterObserver(this.A04);
    }

    public final void A0T(Integer num, String str, String str2, int i) {
        BD4 bd4 = this.A08;
        C171858sO A0D = AnonymousClass8BV.A0D(bd4, i);
        if (num != null) {
            A0D.A07 = num;
        }
        A0D.A0b = "send_pix_key";
        A0D.A0Y = str2;
        A0D.A0a = str;
        bd4.BiH(A0D);
    }

    public BrazilSendPixKeyViewModel(AnonymousClass11S r3, C33251iW r4, AnonymousClass1KI r5, AnonymousClass1KH r6, C48052Kz r7, BD4 bd4, AnonymousClass10I r9) {
        C18070vi.A0w(r3, r9, r4, r6, r5);
        C18070vi.A0l(r7, bd4);
        this.A01 = r3;
        this.A06 = r9;
        this.A02 = r4;
        this.A03 = r6;
        this.A07 = r5;
        this.A05 = r7;
        this.A08 = bd4;
    }
}
