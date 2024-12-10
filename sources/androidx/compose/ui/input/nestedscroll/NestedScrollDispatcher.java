package androidx.compose.ui.input.nestedscroll;

import X.AnonymousClass000;
import X.AnonymousClass1OX;
import X.C08530fF;
import X.C17540up;
import X.C18090vk;

public final class NestedScrollDispatcher {
    public C17540up A00;
    public C18090vk A01 = new C08530fF(this);
    public AnonymousClass1OX A02;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C30391dr r6, long r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.AnonymousClass0b1
            if (r0 == 0) goto L_0x004e
            r4 = r6
            X.0b1 r4 = (X.AnonymousClass0b1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r2) goto L_0x0054
            X.C30691eM.A01(r1)
        L_0x0022:
            X.CuU r1 = (X.C26199CuU) r1
            long r0 = r1.A03()
        L_0x0028:
            X.CuU r0 = X.C26199CuU.A01(r0)
            return r0
        L_0x002d:
            X.C30691eM.A01(r1)
            X.0up r1 = r5.A00
            if (r1 == 0) goto L_0x0047
            X.0OJ r0 = X.AnonymousClass0GE.A00
            java.lang.Object r0 = r1.BPr(r0)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r0
            if (r0 == 0) goto L_0x0047
            r4.label = r2
            java.lang.Object r1 = r0.C1K(r4, r7)
            if (r1 != r3) goto L_0x0022
            return r3
        L_0x0047:
            long r0 = X.C26199CuU.A01
            long r0 = X.C7C.A00()
            goto L_0x0028
        L_0x004e:
            X.0b1 r4 = new X.0b1
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0054:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.A00(X.1dr, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C30391dr r11, long r12, long r14) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.AnonymousClass0b0
            if (r0 == 0) goto L_0x0050
            r5 = r11
            X.0b0 r5 = (X.AnonymousClass0b0) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r2) goto L_0x0056
            X.C30691eM.A01(r1)
        L_0x0022:
            X.CuU r1 = (X.C26199CuU) r1
            long r0 = r1.A03()
        L_0x0028:
            X.CuU r0 = X.C26199CuU.A01(r0)
            return r0
        L_0x002d:
            X.C30691eM.A01(r1)
            X.0up r1 = r10.A00
            if (r1 == 0) goto L_0x0049
            X.0OJ r0 = X.AnonymousClass0GE.A00
            java.lang.Object r4 = r1.BPr(r0)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r4 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r4
            if (r4 == 0) goto L_0x0049
            r5.label = r2
            r6 = r12
            r8 = r14
            java.lang.Object r1 = r4.C15(r5, r6, r8)
            if (r1 != r3) goto L_0x0022
            return r3
        L_0x0049:
            long r0 = X.C26199CuU.A01
            long r0 = X.C7C.A00()
            goto L_0x0028
        L_0x0050:
            X.0b0 r5 = new X.0b0
            r5.<init>(r10, r11)
            goto L_0x0012
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.A01(X.1dr, long, long):java.lang.Object");
    }

    public final AnonymousClass1OX A02() {
        AnonymousClass1OX r0 = (AnonymousClass1OX) this.A01.invoke();
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final AnonymousClass1OX A03() {
        return this.A02;
    }

    public final void A04(C18090vk r1) {
        this.A01 = r1;
    }

    public final void A05(AnonymousClass1OX r1) {
        this.A02 = r1;
    }
}
