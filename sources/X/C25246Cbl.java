package X;

import android.graphics.Rect;

/* renamed from: X.Cbl  reason: case insensitive filesystem */
public final class C25246Cbl {
    public final C25147CZy A00;
    public final E0B A01;

    public final void A00() {
        C25147CZy cZy = this.A00;
        if (AnonymousClass00N.A00(this, (Object) null, cZy.A01)) {
            D64 d64 = (D64) cZy.A00;
            d64.A07 = false;
            d64.A05 = C28119Drd.A00;
            d64.A06 = C28120Dre.A00;
            d64.A00 = null;
            D64.A00(C24268ByR.StopInput, d64);
        }
    }

    public final void A01(AnonymousClass0NU r7) {
        Rect rect;
        if (C18070vi.A18(this.A00.A01.get(), this)) {
            D64 d64 = (D64) this.A01;
            d64.A00 = new Rect(C22339B3q.A01(r7.A01), C22339B3q.A01(r7.A03), C22339B3q.A01(r7.A02), C22339B3q.A01(r7.A00));
            if (d64.A04.isEmpty() && (rect = d64.A00) != null) {
                d64.A08.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    public final void A02(AnonymousClass0NU r4, AnonymousClass0NU r5, C26227CvJ cvJ, EBT ebt, C26224CvE cvE, C22821Di r9) {
        if (C18070vi.A18(this.A00.A01.get(), this)) {
            C25964CpW cpW = ((D64) this.A01).A0A;
            synchronized (cpW.A0C) {
                cpW.A04 = cvE;
                cpW.A03 = ebt;
                cpW.A02 = cvJ;
                cpW.A05 = r9;
                cpW.A01 = r4;
                cpW.A00 = r5;
                if (cpW.A06 || cpW.A0B) {
                    C25964CpW.A00(cpW);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (X.C18070vi.A18(r7.A02, r15.A02) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C26224CvE r14, X.C26224CvE r15) {
        /*
            r13 = this;
            X.CZy r0 = r13.A00
            java.util.concurrent.atomic.AtomicReference r0 = r0.A01
            java.lang.Object r0 = r0.get()
            boolean r0 = X.C18070vi.A18(r0, r13)
            if (r0 == 0) goto L_0x0096
            X.E0B r4 = r13.A01
            X.D64 r4 = (X.D64) r4
            X.CvE r7 = r4.A02
            long r0 = r7.A00
            long r2 = r15.A00
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r5)
            r6 = 0
            if (r0 == 0) goto L_0x002c
            X.Cw5 r1 = r7.A02
            X.Cw5 r0 = r15.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            r9 = 0
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r9 = 1
        L_0x002d:
            r4.A02 = r15
            java.util.List r5 = r4.A04
            int r7 = r5.size()
            r1 = 0
        L_0x0036:
            if (r1 >= r7) goto L_0x004b
            java.lang.Object r0 = r5.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.D5P r0 = (X.D5P) r0
            if (r0 == 0) goto L_0x0048
            r0.A02 = r15
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x0036
        L_0x004b:
            X.CpW r8 = r4.A0A
            java.lang.Object r7 = r8.A0C
            monitor-enter(r7)
            r1 = 0
            r8.A04 = r1     // Catch:{ all -> 0x0060 }
            r8.A03 = r1     // Catch:{ all -> 0x0060 }
            r8.A02 = r1     // Catch:{ all -> 0x0060 }
            X.DrY r0 = X.C28115DrY.A00     // Catch:{ all -> 0x0060 }
            r8.A05 = r0     // Catch:{ all -> 0x0060 }
            r8.A01 = r1     // Catch:{ all -> 0x0060 }
            r8.A00 = r1     // Catch:{ all -> 0x0060 }
            goto L_0x0063
        L_0x0060:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0063:
            monitor-exit(r7)
            boolean r0 = X.C18070vi.A18(r14, r15)
            if (r0 == 0) goto L_0x0099
            if (r9 == 0) goto L_0x0096
            X.E0A r5 = r4.A0B
            int r6 = X.C26260Cw5.A02(r2)
            int r7 = X.C26260Cw5.A01(r2)
            X.CvE r0 = r4.A02
            X.Cw5 r0 = r0.A02
            r9 = -1
            if (r0 == 0) goto L_0x0097
            long r0 = r0.A00
            int r8 = X.C26260Cw5.A02(r0)
            int r9 = X.C26260Cw5.A01(r0)
        L_0x0087:
            X.D62 r5 = (X.D62) r5
            X.0vl r0 = r5.A02
            java.lang.Object r4 = r0.getValue()
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
            android.view.View r5 = r5.A00
            r4.updateSelection(r5, r6, r7, r8, r9)
        L_0x0096:
            return
        L_0x0097:
            r8 = -1
            goto L_0x0087
        L_0x0099:
            if (r14 == 0) goto L_0x00bd
            X.DRu r0 = r14.A01
            java.lang.String r1 = r0.A00
            X.DRu r0 = r15.A01
            java.lang.String r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00b9
            long r0 = r14.A00
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x00bd
            X.Cw5 r1 = r14.A02
            X.Cw5 r0 = r15.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x00bd
        L_0x00b9:
            X.D64.A01(r4)
            return
        L_0x00bd:
            int r2 = r5.size()
        L_0x00c1:
            if (r6 >= r2) goto L_0x0096
            java.lang.Object r0 = r5.get(r6)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r1 = r0.get()
            X.D5P r1 = (X.D5P) r1
            if (r1 == 0) goto L_0x011d
            X.CvE r8 = r4.A02
            X.E0A r3 = r4.A0B
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x011d
            r1.A02 = r8
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00f5
            int r10 = r1.A01
            android.view.inputmethod.ExtractedText r9 = X.C74.A00(r8)
            r7 = r3
            X.D62 r7 = (X.D62) r7
            X.0vl r0 = r7.A02
            java.lang.Object r1 = r0.getValue()
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.view.View r0 = r7.A00
            r1.updateExtractedText(r0, r10, r9)
        L_0x00f5:
            X.Cw5 r0 = r8.A02
            r12 = -1
            if (r0 == 0) goto L_0x0120
            long r0 = r0.A00
            int r11 = X.C26260Cw5.A02(r0)
            int r12 = X.C26260Cw5.A01(r0)
        L_0x0104:
            long r0 = r8.A00
            int r9 = X.C26260Cw5.A02(r0)
            int r10 = X.C26260Cw5.A01(r0)
            X.D62 r3 = (X.D62) r3
            X.0vl r0 = r3.A02
            java.lang.Object r7 = r0.getValue()
            android.view.inputmethod.InputMethodManager r7 = (android.view.inputmethod.InputMethodManager) r7
            android.view.View r8 = r3.A00
            r7.updateSelection(r8, r9, r10, r11, r12)
        L_0x011d:
            int r6 = r6 + 1
            goto L_0x00c1
        L_0x0120:
            r11 = -1
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25246Cbl.A03(X.CvE, X.CvE):void");
    }

    public C25246Cbl(E0B e0b, C25147CZy cZy) {
        this.A00 = cZy;
        this.A01 = e0b;
    }
}
