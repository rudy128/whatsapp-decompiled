package com.whatsapp.privacy.disclosure.ui;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass71X;
import X.C108945cZ;
import X.C138126wZ;
import X.C18070vi;
import X.C33501iv;

public final class PrivacyDisclosureContainerViewModel extends AnonymousClass1J2 {
    public int A00;
    public C138126wZ A01 = C138126wZ.A06;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DT A03;
    public final C33501iv A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass1KB A07;
    public final AnonymousClass00H A08;

    public void A0S() {
        AnonymousClass71X.A01 = null;
        AnonymousClass71X.A03 = null;
        AnonymousClass71X.A00 = null;
        AnonymousClass71X.A04 = null;
        AnonymousClass71X.A02 = null;
        AnonymousClass71X.A06.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r6 != 145) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(int r6) {
        /*
            r5 = this;
            X.1DT r0 = r5.A03
            java.lang.Object r0 = r0.A06()
            X.6s9 r0 = (X.C135406s9) r0
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r0.A01
            X.6rI r0 = (X.C134876rI) r0
            if (r0 == 0) goto L_0x0052
            int r4 = r0.A00
            X.1iv r3 = r5.A04
            X.10I r2 = r3.A05
            r1 = 7
            X.7RE r0 = new X.7RE
            r0.<init>(r3, r6, r4, r1)
            r2.CGF(r0)
            X.00H r0 = r5.A08
            java.lang.Object r1 = r0.get()
            X.Clf r1 = (X.C25768Clf) r1
            X.6wZ r0 = r5.A01
            r2 = 1
            r1.A03(r0, r4, r6, r2)
            r0 = 145(0x91, float:2.03E-43)
            if (r6 >= r0) goto L_0x0035
            r0 = 5
            if (r6 == r0) goto L_0x0037
            return
        L_0x0035:
            if (r6 == r0) goto L_0x004c
        L_0x0037:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            if (r1 == 0) goto L_0x004c
            java.util.concurrent.ConcurrentSkipListSet r0 = r3.A0B
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x004c
            X.71X r1 = X.AnonymousClass71X.A05
            r0 = 0
            r1.A01(r6, r0)
            return
        L_0x004c:
            X.71X r0 = X.AnonymousClass71X.A05
            r0.A01(r6, r2)
            return
        L_0x0052:
            java.lang.String r0 = "PrivacyDisclosureContainerViewModel: saveStage: disclosure not loaded yet"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel.A0T(int):void");
    }

    public PrivacyDisclosureContainerViewModel(AnonymousClass1KB r2, C33501iv r3, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0w(r2, r4, r3, r5, r6);
        this.A07 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A08 = r5;
        this.A06 = r6;
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A03 = A0S;
        this.A02 = A0S;
    }
}
