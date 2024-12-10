package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0CI;
import X.AnonymousClass0Q9;
import X.AnonymousClass0QY;
import X.AnonymousClass0t9;
import X.C10400iH;
import X.C16080rg;
import X.C16100ri;
import X.C16840tJ;
import X.C17330uU;
import X.C26199CuU;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;

public final class ScrollingLogic {
    public AnonymousClass0t9 A00;
    public C16080rg A01;
    public AnonymousClass0CI A02;
    public C16840tJ A03;
    public NestedScrollDispatcher A04;
    public boolean A05;
    public final C17330uU A06 = AnonymousClass0Q9.A03(false);

    public final long A01(float f) {
        long A0p;
        if (f == 0.0f) {
            return AnonymousClass0QY.A03;
        }
        if (this.A02 == AnonymousClass0CI.Horizontal) {
            A0p = AnonymousClass001.A0p(f, 0.0f);
        } else {
            A0p = AnonymousClass001.A0p(0.0f, f);
        }
        long j = AnonymousClass0QY.A03;
        return A0p;
    }

    public final float A00(long j) {
        AnonymousClass0CI r3 = this.A02;
        AnonymousClass0CI r2 = AnonymousClass0CI.Horizontal;
        long j2 = C26199CuU.A01;
        if (r3 == r2) {
            return AnonymousClass001.A02(j);
        }
        return AnonymousClass001.A01(j);
    }

    public final long A02(float f, long j) {
        AnonymousClass0CI r3 = this.A02;
        AnonymousClass0CI r2 = AnonymousClass0CI.Horizontal;
        long j2 = C26199CuU.A01;
        if (r3 == r2) {
            return AnonymousClass001.A0p(f, AnonymousClass001.A01(j));
        }
        return AnonymousClass001.A0p(AnonymousClass001.A02(j), f);
    }

    public final long A03(long j) {
        char c = 2;
        if (this.A02 == AnonymousClass0CI.Horizontal) {
            c = 1;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        long j2 = C26199CuU.A01;
        if ((c & 1) != 0) {
            f = AnonymousClass001.A02(j);
        }
        if ((c & 2) != 0) {
            f2 = AnonymousClass001.A01(j);
        }
        return AnonymousClass001.A0p(f, f2);
    }

    public final long A04(C16100ri r4, int i, long j) {
        C10400iH r2 = new C10400iH(r4, this, i);
        AnonymousClass0t9 r1 = this.A00;
        if (i == 4 || r1 == null || (!this.A03.BOF() && !this.A03.BOE())) {
            return ((AnonymousClass0QY) r2.invoke(AnonymousClass000.A0e(j))).A00;
        }
        return r1.BCY(r2, i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C30391dr r12, long r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.AnonymousClass0b9
            r6 = r11
            if (r0 == 0) goto L_0x004c
            r4 = r12
            X.0b9 r4 = (X.AnonymousClass0b9) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004c
            int r2 = r2 - r1
            r4.label = r2
        L_0x0013:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.AnonymousClass3F6.A03()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r1) goto L_0x0052
            java.lang.Object r8 = r4.L$0
            X.4rE r8 = (X.C98484rE) r8
            X.C30691eM.A01(r3)
        L_0x0027:
            long r0 = r8.element
            X.CuU r0 = X.C26199CuU.A01(r0)
            return r0
        L_0x002e:
            X.C30691eM.A01(r3)
            X.4rE r8 = new X.4rE
            r8.<init>()
            r9 = r13
            r8.element = r13
            X.0tJ r0 = r11.A03
            r7 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r5.<init>(r6, r7, r8, r9)
            r4.L$0 = r8
            r4.label = r1
            java.lang.Object r0 = r0.CH0(X.AnonymousClass0CH.Default, r4, r5)
            if (r0 != r2) goto L_0x0027
            return r2
        L_0x004c:
            X.0b9 r4 = new X.0b9
            r4.<init>(r11, r12)
            goto L_0x0013
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.A05(X.1dr, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(X.C30391dr r10, long r11) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C07480bA
            if (r0 == 0) goto L_0x0027
            r6 = r10
            X.0bA r6 = (X.C07480bA) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0027
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.AnonymousClass3F6.A03()
            int r0 = r6.label
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 == r8) goto L_0x006d
            if (r0 == r7) goto L_0x006d
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0027:
            X.0bA r6 = new X.0bA
            r6.<init>(r9, r10)
            goto L_0x0012
        L_0x002d:
            X.C30691eM.A01(r1)
            X.0uU r0 = r9.A06
            X.AnonymousClass000.A1C(r0, r8)
            long r1 = r9.A03(r11)
            r0 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r4 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r4.<init>(r9, r0)
            X.0t9 r3 = r9.A00
            if (r3 == 0) goto L_0x005e
            X.0tJ r0 = r9.A03
            boolean r0 = r0.BOF()
            if (r0 != 0) goto L_0x0053
            X.0tJ r0 = r9.A03
            boolean r0 = r0.BOE()
            if (r0 == 0) goto L_0x005e
        L_0x0053:
            r6.L$0 = r9
            r6.label = r8
            java.lang.Object r0 = r3.BCX(r6, r4, r1)
        L_0x005b:
            if (r0 != r5) goto L_0x006b
            return r5
        L_0x005e:
            X.CuU r0 = X.C26199CuU.A01(r1)
            r6.L$0 = r9
            r6.label = r7
            java.lang.Object r0 = r4.invoke(r0, r6)
            goto L_0x005b
        L_0x006b:
            r0 = r9
            goto L_0x0074
        L_0x006d:
            java.lang.Object r0 = r6.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = (androidx.compose.foundation.gestures.ScrollingLogic) r0
            X.C30691eM.A01(r1)
        L_0x0074:
            r1 = 0
            X.0uU r0 = r0.A06
            X.AnonymousClass000.A1C(r0, r1)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.A06(X.1dr, long):java.lang.Object");
    }

    public ScrollingLogic(AnonymousClass0t9 r2, C16080rg r3, AnonymousClass0CI r4, C16840tJ r5, NestedScrollDispatcher nestedScrollDispatcher, boolean z) {
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
        this.A05 = z;
        this.A01 = r3;
        this.A04 = nestedScrollDispatcher;
    }
}
