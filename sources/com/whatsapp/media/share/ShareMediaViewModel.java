package com.whatsapp.media.share;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass1OX;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C1418377d;
import X.C18070vi;
import X.C18600wl;
import X.C30391dr;
import X.C30451dy;
import X.C41561wd;
import X.C83284En;
import java.util.concurrent.CancellationException;

public final class ShareMediaViewModel extends AnonymousClass1J2 {
    public AnonymousClass1BI A00;
    public AnonymousClass1OB A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final C18600wl A0B;
    public final C18600wl A0C;

    public final void A0T(AnonymousClass1E7 r15, AnonymousClass1BI r16, AnonymousClass206 r17, C1418377d r18, Integer num, int i, boolean z) {
        C18070vi.A0d(r15, 2);
        AnonymousClass3Ma.A1R(this.A01);
        AnonymousClass1OX A002 = C41561wd.A00(this);
        this.A01 = C30451dy.A02(AnonymousClass00R.A00, this.A0B, new ShareMediaViewModel$sendSticker$1(r15, r16, this, r17, r18, num, (C30391dr) null, i, z, false), A002);
    }

    public static final Object A00(C83284En r3, ShareMediaViewModel shareMediaViewModel, C30391dr r5) {
        return AnonymousClass3MX.A13(C30451dy.A00(r5, shareMediaViewModel.A0C, new ShareMediaViewModel$notifyState$2(r3, shareMediaViewModel, (C30391dr) null)));
    }

    public void A0S() {
        AnonymousClass1OB r1 = this.A01;
        if (r1 != null) {
            r1.BEM((CancellationException) null);
        }
        this.A01 = null;
    }

    public ShareMediaViewModel(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, C18600wl r10, C18600wl r11) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0x(r7, r8, r9, r10, r11);
        this.A08 = r2;
        this.A03 = r3;
        this.A06 = r4;
        this.A07 = r5;
        this.A0A = r6;
        this.A09 = r7;
        this.A04 = r8;
        this.A05 = r9;
        this.A0B = r10;
        this.A0C = r11;
    }
}
