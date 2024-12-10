package com.whatsapp.mediaview;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass21V;
import X.AnonymousClass3MW;
import X.AnonymousClass8BG;
import X.C108945cZ;
import X.C135816so;
import X.C152317ni;
import X.C18070vi;
import X.C18100vl;
import X.C18110vm;
import X.C18600wl;
import X.C24681Lg;
import X.C30391dr;
import X.C41561wd;
import X.C63272sn;
import X.C63892tr;
import X.C70643By;
import X.C88174Yp;

public final class MediaViewCurrentMessageViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = C108945cZ.A0S();
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final AnonymousClass11S A02;
    public final C88174Yp A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05;
    public final C18600wl A06;
    public final C18600wl A07;
    public final C63272sn A08;
    public final C24681Lg A09;

    public final void A0V(AnonymousClass21V r7) {
        String str = null;
        if (r7 == null) {
            this.A00.A0F((Object) null);
            return;
        }
        AnonymousClass1DT r5 = this.A00;
        AnonymousClass8BG A012 = C63892tr.A01(r7);
        AnonymousClass8BG A013 = C63892tr.A01(r7);
        if (A013 != null) {
            str = A013.BXu(AnonymousClass11S.A01(this.A02), r7.A0x);
        }
        r5.A0F(new C135816so(A012, r7, str, false));
        A0U();
        A0T();
    }

    public void A0S() {
        this.A09.unregisterObserver(this.A05.getValue());
    }

    public final void A0T() {
        C135816so r4 = (C135816so) this.A00.A06();
        if (r4 != null && !r4.A03) {
            AnonymousClass3MW.A1X(this.A06, new MediaViewCurrentMessageViewModel$loadIsSelectedMessageReactable$1(r4, this, (C30391dr) null), C41561wd.A00(this));
        }
    }

    public final void A0U() {
        C135816so r1 = (C135816so) this.A00.A06();
        if (r1 != null) {
            this.A08.A02(r1.A01, new C70643By(r1, this, 11), 56, false);
        }
    }

    public MediaViewCurrentMessageViewModel(AnonymousClass11S r2, C63272sn r3, C24681Lg r4, C88174Yp r5, AnonymousClass00H r6, C18600wl r7, C18600wl r8) {
        C18070vi.A0o(r2, r4, r6);
        C18070vi.A0d(r5, 5);
        C18070vi.A0l(r7, r8);
        this.A02 = r2;
        this.A09 = r4;
        this.A04 = r6;
        this.A08 = r3;
        this.A03 = r5;
        this.A07 = r7;
        this.A06 = r8;
        C18110vm A012 = AnonymousClass1DF.A01(new C152317ni(this));
        this.A05 = A012;
        r4.registerObserver(A012.getValue());
    }
}
