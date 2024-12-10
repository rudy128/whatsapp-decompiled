package com.whatsapp.status.crossposting;

import X.AnonymousClass00H;
import X.AnonymousClass10T;
import X.AnonymousClass1F9;
import X.AnonymousClass1GC;
import X.AnonymousClass1J2;
import X.AnonymousClass72B;
import X.AnonymousClass7FX;
import X.AnonymousClass7M7;
import X.AnonymousClass7PL;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C122726Rr;
import X.C123476Up;
import X.C131736la;
import X.C136856uW;
import X.C146327Or;
import X.C146367Ov;
import X.C17880vN;
import X.C18070vi;
import X.C27581Wq;
import X.C32741hg;
import com.whatsapp.bridge.wfal.WfalManager;

public final class CrossPostingUpdatesViewModel extends AnonymousClass1J2 implements AnonymousClass1GC {
    public C123476Up A00;
    public C131736la A01;
    public final C32741hg A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass7M7 A09;
    public final C146327Or A0A = new C146327Or(this, 0);
    public final C146327Or A0B = new C146327Or(this, 1);

    public void A0S() {
        this.A01 = null;
        if (!A03(this)) {
            AnonymousClass7M7 r1 = this.A09;
            C18070vi.A0d(r1, 0);
            C108965cb.A1L(((AnonymousClass7FX) this.A05.get()).A01, r1);
        }
    }

    public void C6U(C27581Wq r5, AnonymousClass1F9 r6) {
        AnonymousClass10T A0V;
        C146367Ov r0;
        int A042 = C108955ca.A04(r5, 1);
        if (A042 != 0) {
            if (A042 != 1) {
                if (A042 == 5) {
                    if (((AnonymousClass72B) this.A03.get()).A03()) {
                        AnonymousClass7PL r1 = (AnonymousClass7PL) this.A04.get();
                        r1.A00 = null;
                        r1.A02 = false;
                        A0V = C17880vN.A0V(r1.A06);
                        r0 = r1.A03;
                    } else if (C108985cd.A1a(this.A08)) {
                        C136856uW r12 = (C136856uW) this.A07.get();
                        r12.A00 = null;
                        r12.A03 = false;
                        A0V = C17880vN.A0V(r12.A06);
                        r0 = r12.A04;
                    } else {
                        return;
                    }
                    A0V.unregisterObserver(r0);
                }
            } else if (((AnonymousClass72B) this.A03.get()).A03()) {
                AnonymousClass00H r3 = this.A04;
                C146327Or r13 = this.A0A;
                C18070vi.A0d(r13, 0);
                ((AnonymousClass7PL) r3.get()).A00 = r13;
                AnonymousClass7PL r2 = (AnonymousClass7PL) r3.get();
                if (!r2.A02) {
                    r2.A02 = true;
                    C17880vN.A0V(r2.A06).registerObserver(r2.A03);
                }
            } else if (C108985cd.A1a(this.A08)) {
                AnonymousClass00H r32 = this.A07;
                C146327Or r14 = this.A0B;
                C18070vi.A0d(r14, 0);
                ((C136856uW) r32.get()).A00 = r14;
                ((C136856uW) r32.get()).A03();
            }
        } else if (!((AnonymousClass72B) this.A03.get()).A03() && C108985cd.A1a(this.A08)) {
            AnonymousClass00H r33 = this.A07;
            C146327Or r15 = this.A0B;
            C18070vi.A0d(r15, 0);
            ((C136856uW) r33.get()).A00 = r15;
            ((C136856uW) r33.get()).A01();
        }
    }

    public static final void A00(CrossPostingUpdatesViewModel crossPostingUpdatesViewModel, boolean z, boolean z2) {
        C123476Up r1 = crossPostingUpdatesViewModel.A00;
        if (r1 == null) {
            C18070vi.A11("crossPostingViewModelState");
            throw null;
        } else if (r1.A04 != z || r1.A03 != z2) {
            r1.A04 = z;
            r1.A03 = z2;
            C131736la r0 = crossPostingUpdatesViewModel.A01;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    public static final boolean A03(CrossPostingUpdatesViewModel crossPostingUpdatesViewModel) {
        if (WfalManager.A00((WfalManager) crossPostingUpdatesViewModel.A06.get(), false) || C108985cd.A1a(crossPostingUpdatesViewModel.A08)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6Up, java.lang.Object] */
    public final C123476Up A0T() {
        C123476Up r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("crossPostingViewModelState");
            throw null;
        }
        boolean z = r0.A04;
        boolean z2 = r0.A03;
        C122726Rr r5 = r0.A00;
        C122726Rr r4 = r0.A01;
        boolean z3 = r0.A02;
        boolean z4 = r0.A06;
        boolean z5 = r0.A05;
        ? obj = new Object();
        obj.A04 = z;
        obj.A03 = z2;
        obj.A00 = r5;
        obj.A01 = r4;
        obj.A02 = z3;
        obj.A06 = z4;
        obj.A05 = z5;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.6Up, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0043, code lost:
        if (((X.AnonymousClass7FX) r12.get()).A01().isEmpty() != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CrossPostingUpdatesViewModel(X.C32741hg r6, X.AnonymousClass00H r7, X.AnonymousClass00H r8, X.AnonymousClass00H r9, X.AnonymousClass00H r10, X.AnonymousClass00H r11, X.AnonymousClass00H r12) {
        /*
            r5 = this;
            X.C18070vi.A0w(r7, r6, r8, r9, r10)
            X.C18070vi.A0l(r11, r12)
            r5.<init>()
            r5.A08 = r7
            r5.A02 = r6
            r5.A06 = r8
            r5.A07 = r9
            r5.A03 = r10
            r5.A04 = r11
            r5.A05 = r12
            r4 = 0
            X.7M7 r3 = new X.7M7
            r3.<init>(r5, r4)
            r5.A09 = r3
            r1 = 1
            X.7Or r0 = new X.7Or
            r0.<init>(r5, r1)
            r5.A0B = r0
            X.7Or r0 = new X.7Or
            r0.<init>(r5, r4)
            r5.A0A = r0
            boolean r0 = A03(r5)
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = r12.get()
            X.7FX r0 = (X.AnonymousClass7FX) r0
            X.1IX r0 = r0.A01()
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 == 0) goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            X.6Rr r1 = X.C122726Rr.HIDE
            X.6Up r0 = new X.6Up
            r0.<init>()
            r0.A04 = r2
            r0.A03 = r2
            r0.A00 = r1
            r0.A01 = r1
            r0.A02 = r4
            r0.A06 = r4
            r0.A05 = r4
            r5.A00 = r0
            boolean r0 = A03(r5)
            if (r0 != 0) goto L_0x006e
            java.lang.Object r0 = r12.get()
            X.7FX r0 = (X.AnonymousClass7FX) r0
            X.00H r0 = r0.A01
            X.C72453Mb.A1Q(r0, r3)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel.<init>(X.1hg, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H):void");
    }
}
