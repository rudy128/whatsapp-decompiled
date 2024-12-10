package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass1DT;
import X.AnonymousClass3MW;
import X.AnonymousClass3VX;
import X.AnonymousClass72U;
import X.C108945cZ;
import X.C139926zf;
import X.C175258yP;
import X.C41111vp;
import X.C86534Sa;

public class BottomSheetViewModel extends AnonymousClass3VX {
    public C139926zf A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass1DT A03 = C108945cZ.A0S();
    public final AnonymousClass1DT A04 = C108945cZ.A0S();
    public final AnonymousClass1DT A05 = C108945cZ.A0S();
    public final AnonymousClass1DT A06 = C108945cZ.A0S();
    public final C175258yP A07;
    public final AnonymousClass11C A08;
    public final C41111vp A09;
    public final C41111vp A0A;
    public final C41111vp A0B;

    public static boolean A03(C86534Sa r3, BottomSheetViewModel bottomSheetViewModel) {
        C139926zf r0 = bottomSheetViewModel.A00;
        if (r0 == null || r0.A00 != 2) {
            if (AnonymousClass72U.A00(r3.A0B) && r3.A0L) {
                return true;
            }
            if (r3.A0K || bottomSheetViewModel.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A0S() {
        this.A07.unregisterObserver(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r3 == 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BnL(X.C86534Sa r7) {
        /*
            r6 = this;
            boolean r4 = r7.A0Q
            r6.A02 = r4
            int r3 = r7.A00
            r1 = 1
            if (r3 == r1) goto L_0x000d
            r0 = 2
            if (r3 == r0) goto L_0x000d
            r1 = 0
        L_0x000d:
            r2 = 0
            if (r1 != 0) goto L_0x0014
            r0 = 3
            r1 = 0
            if (r3 != r0) goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            r6.A01 = r1
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x001e
            if (r1 != 0) goto L_0x001e
            r2 = 1
        L_0x001e:
            X.1DT r0 = r6.A05
            X.C108995ce.A12(r0, r2)
            com.whatsapp.voipcalling.CallState r5 = r7.A0B
            boolean r1 = X.AnonymousClass72U.A00(r5)
            X.1vp r2 = r6.A0A
            java.lang.Object r0 = r2.A06()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003c
            r2.A0F(r1)
        L_0x003c:
            X.1vp r3 = r6.A0B
            java.lang.Object r0 = r3.A06()
            boolean r2 = r7.A0P
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0051
            r3.A0F(r1)
        L_0x0051:
            r1 = 1
            boolean r0 = X.AnonymousClass72U.A00(r5)
            if (r0 != 0) goto L_0x0090
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x0090
            boolean r0 = r7.A0M
            if (r0 != 0) goto L_0x0090
            if (r4 == 0) goto L_0x0090
            if (r2 != 0) goto L_0x0090
            X.11C r0 = r6.A08
            boolean r0 = X.C108965cb.A1X(r0)
            if (r0 != 0) goto L_0x0090
        L_0x006c:
            X.1DT r0 = r6.A06
            X.C108995ce.A12(r0, r1)
            X.1DT r3 = r6.A04
            java.lang.Object r2 = r3.A06()
            boolean r0 = r7.A0L
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C42171xk.A00(r2, r1)
            if (r0 != 0) goto L_0x0086
            r3.A0F(r1)
        L_0x0086:
            boolean r1 = A03(r7, r6)
            X.1DT r0 = r6.A03
            X.C108995ce.A12(r0, r1)
            return
        L_0x0090:
            r1 = 0
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel.BnL(X.4Sa):void");
    }

    public BottomSheetViewModel(C175258yP r3, AnonymousClass11C r4) {
        Boolean A0h = AnonymousClass000.A0h();
        this.A0A = AnonymousClass3MW.A0n(A0h);
        this.A0B = AnonymousClass3MW.A0n(A0h);
        this.A09 = AnonymousClass3MW.A0n(A0h);
        this.A07 = r3;
        this.A08 = r4;
        r3.registerObserver(this);
        AnonymousClass3VX.A00(r3, this);
    }
}
