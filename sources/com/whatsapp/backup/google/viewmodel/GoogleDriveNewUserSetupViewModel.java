package com.whatsapp.backup.google.viewmodel;

import X.AnonymousClass11P;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1NP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass8BY;
import X.C196239ug;
import X.C19830z4;

public class GoogleDriveNewUserSetupViewModel extends AnonymousClass1J2 {
    public static final int[] A07;
    public static final int[] A08 = {0, 4, 1, 2, 3};
    public final AnonymousClass1DT A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass1NP A02;
    public final C196239ug A03;
    public final C19830z4 A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass11P A06;

    static {
        int[] iArr = new int[5];
        AnonymousClass8BY.A1O(iArr);
        A07 = iArr;
    }

    public void A0T(int i) {
        AnonymousClass1NP r0 = this.A02;
        r0.A0G(i);
        AnonymousClass3MX.A1J(this.A05, r0.A03());
    }

    public GoogleDriveNewUserSetupViewModel(AnonymousClass1NP r5, C196239ug r6, AnonymousClass11P r7, C19830z4 r8) {
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A01 = A0L;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A00 = A0L2;
        AnonymousClass1DT A0L3 = AnonymousClass3MW.A0L();
        this.A05 = A0L3;
        this.A06 = r7;
        this.A03 = r6;
        this.A04 = r8;
        this.A02 = r5;
        AnonymousClass3MY.A1L(A0L, r5.A0P());
        A0L2.A0F(r8.A0f());
        AnonymousClass3MX.A1J(A0L3, r5.A03());
    }
}
