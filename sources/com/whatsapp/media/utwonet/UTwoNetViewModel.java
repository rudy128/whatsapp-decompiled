package com.whatsapp.media.utwonet;

import X.AnonymousClass00H;
import X.AnonymousClass190;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass6nl;
import X.C108945cZ;
import X.C126036c5;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18600wl;
import X.C25291Nq;
import X.C72453Mb;

public final class UTwoNetViewModel extends AnonymousClass1J2 {
    public C126036c5 A00;
    public boolean A01;
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final AnonymousClass190 A03;
    public final C18030ve A04;
    public final C25291Nq A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C18600wl A08;

    public static final boolean A00(UTwoNetViewModel uTwoNetViewModel, String str, int i) {
        Object obj;
        int i2;
        AnonymousClass6nl r3 = (AnonymousClass6nl) uTwoNetViewModel.A07.get();
        if (C18020vd.A05(C18040vf.A02, uTwoNetViewModel.A04, 10857)) {
            obj = r3.A02.getValue();
            i2 = C72453Mb.A0I(r3.A04);
        } else {
            obj = "UTwoNet";
            i2 = 1020;
        }
        if (!C18070vi.A18(obj, str) || i2 != i) {
            return false;
        }
        return true;
    }

    public UTwoNetViewModel(AnonymousClass190 r2, C18030ve r3, C25291Nq r4, AnonymousClass00H r5, AnonymousClass00H r6, C18600wl r7) {
        C18070vi.A0w(r3, r2, r4, r5, r7);
        C18070vi.A0d(r6, 6);
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
        this.A07 = r5;
        this.A08 = r7;
        this.A06 = r6;
    }
}
