package com.whatsapp.mediacomposer.viewmodel;

import X.AnonymousClass10I;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass3MX;
import X.AnonymousClass6UD;
import X.AnonymousClass89B;
import X.C108945cZ;
import X.C108975cc;
import X.C131126kY;
import X.C138086wV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C37361pP;
import X.C72453Mb;

public final class MediaViewOnceViewModel extends AnonymousClass1J2 {
    public AnonymousClass1DT A00;
    public C138086wV A01;
    public AnonymousClass89B A02;
    public AnonymousClass6UD A03;
    public final AnonymousClass1KB A04;
    public final C18030ve A05;
    public final AnonymousClass10I A06;

    public final int A0T() {
        Number A1C = C108945cZ.A1C(this.A00);
        if (A1C == null) {
            return -1;
        }
        return A1C.intValue();
    }

    public final void A0U() {
        Number A1C = C108945cZ.A1C(this.A00);
        int i = 3;
        if (A1C != null) {
            int intValue = A1C.intValue();
            if (intValue != 2) {
                if (intValue == 3) {
                    i = 2;
                }
            }
            AnonymousClass3MX.A1J(this.A00, i);
        }
        i = A0T();
        AnonymousClass3MX.A1J(this.A00, i);
    }

    public final void A0V() {
        if (C18020vd.A05(C18040vf.A02, this.A05, 12104)) {
            this.A06.CGN(C108945cZ.A0X(this, 15));
            return;
        }
        AnonymousClass3MX.A1J(this.A00, A00(this));
    }

    public final boolean A0W() {
        int i;
        AnonymousClass89B r0;
        AnonymousClass6UD r02 = this.A03;
        if (r02 == null) {
            return false;
        }
        C131126kY r1 = r02.A00;
        C138086wV r2 = this.A01;
        if (r2 == null || C72453Mb.A1a(r1.A07) || (i = r2.A00) == 35 || i == 38 || i == 37 || C72453Mb.A1a(r1.A0D) || C72453Mb.A1a(r1.A09) || i == 40 || C72453Mb.A1a(r1.A0E) || C72453Mb.A1a(r1.A0G) || C72453Mb.A1a(r1.A0I) || C72453Mb.A1a(r1.A0H) || C72453Mb.A1a(r1.A0F) || (r0 = this.A02) == null) {
            return false;
        }
        return C108975cc.A1B(r0.CMQ() ? 1 : 0);
    }

    public MediaViewOnceViewModel(C37361pP r3, AnonymousClass1KB r4, C18030ve r5, AnonymousClass10I r6) {
        C18070vi.A0s(r5, r4, r6, r3);
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = r6;
        this.A00 = r3.A00(-1, "arg_view_once_state");
    }

    public static final int A00(MediaViewOnceViewModel mediaViewOnceViewModel) {
        if (!mediaViewOnceViewModel.A0W()) {
            return 0;
        }
        AnonymousClass89B r0 = mediaViewOnceViewModel.A02;
        if (r0 == null || !r0.CLu()) {
            return 1;
        }
        Number A1C = C108945cZ.A1C(mediaViewOnceViewModel.A00);
        if (A1C == null || A1C.intValue() != 3) {
            return 2;
        }
        return 3;
    }
}
