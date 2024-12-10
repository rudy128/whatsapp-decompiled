package androidx.compose.ui.input.nestedscroll;

import X.AnonymousClass000;
import X.AnonymousClass0GE;
import X.AnonymousClass0OJ;
import X.AnonymousClass0QY;
import X.AnonymousClass0XW;
import X.AnonymousClass1OX;
import X.AnonymousClass6YK;
import X.C02080Cq;
import X.C02670Ex;
import X.C02680Ey;
import X.C08540fG;
import X.C15830rH;
import X.C16810tG;
import X.C17540up;

public final class NestedScrollNode extends AnonymousClass0XW implements C16810tG, C17540up, C15830rH {
    public NestedScrollDispatcher A00;
    public C16810tG A01;
    public final C02080Cq A02 = C02680Ey.A00(AnonymousClass6YK.A00(AnonymousClass0GE.A00, this));

    public /* synthetic */ Object BPr(AnonymousClass0OJ r2) {
        return C02670Ex.A00(this, r2);
    }

    /* access modifiers changed from: private */
    public final AnonymousClass1OX A00() {
        NestedScrollNode nestedScrollNode;
        if (this.A07 && (nestedScrollNode = (NestedScrollNode) C02670Ex.A00(this, AnonymousClass0GE.A00)) != null) {
            return nestedScrollNode.A00();
        }
        AnonymousClass1OX A03 = this.A00.A03();
        if (A03 != null) {
            return A03;
        }
        throw AnonymousClass000.A0n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final void A02() {
        NestedScrollDispatcher nestedScrollDispatcher = this.A00;
        nestedScrollDispatcher.A00 = this;
        nestedScrollDispatcher.A04(new C08540fG(this));
        nestedScrollDispatcher.A05(A0B());
    }

    public void A0M() {
        NestedScrollDispatcher nestedScrollDispatcher = this.A00;
        if (nestedScrollDispatcher.A00 == this) {
            nestedScrollDispatcher.A00 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object C15(X.C30391dr r19, long r20, long r22) {
        /*
            r18 = this;
            r8 = r20
            r10 = r22
            r3 = r19
            boolean r0 = r3 instanceof X.C07590bR
            r5 = r18
            if (r0 == 0) goto L_0x00b1
            r7 = r3
            X.0bR r7 = (X.C07590bR) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b1
            int r2 = r2 - r1
            r7.label = r2
        L_0x001a:
            java.lang.Object r2 = r7.result
            X.1g4 r4 = X.AnonymousClass3F6.A03()
            int r1 = r7.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0050
            if (r1 == r0) goto L_0x0064
            if (r1 != r3) goto L_0x00b8
            long r0 = r7.J$0
            X.C30691eM.A01(r2)
        L_0x002f:
            X.CuU r2 = (X.C26199CuU) r2
            long r4 = r2.A03()
        L_0x0035:
            float r3 = X.AnonymousClass000.A03(r0)
            float r2 = X.AnonymousClass000.A03(r4)
            float r3 = r3 + r2
            float r1 = X.AnonymousClass001.A01(r0)
            float r0 = X.AnonymousClass001.A01(r4)
            float r1 = r1 + r0
            long r0 = X.AnonymousClass001.A0p(r3, r1)
            X.CuU r0 = X.C26199CuU.A01(r0)
            return r0
        L_0x0050:
            X.C30691eM.A01(r2)
            X.0tG r6 = r5.A01
            r7.L$0 = r5
            r7.J$0 = r8
            r7.J$1 = r10
            r7.label = r0
            java.lang.Object r2 = r6.C15(r7, r8, r10)
            if (r2 != r4) goto L_0x006f
            return r4
        L_0x0064:
            long r10 = r7.J$1
            long r8 = r7.J$0
            java.lang.Object r5 = r7.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r5 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r5
            X.C30691eM.A01(r2)
        L_0x006f:
            X.CuU r2 = (X.C26199CuU) r2
            long r0 = r2.A03()
            boolean r2 = r5.A07
            if (r2 == 0) goto L_0x00ac
            X.0OJ r2 = X.AnonymousClass0GE.A00
            java.lang.Object r12 = X.C02670Ex.A00(r5, r2)
            X.0tG r12 = (X.C16810tG) r12
            if (r12 == 0) goto L_0x00ac
            float r6 = X.AnonymousClass000.A03(r8)
            float r2 = X.AnonymousClass000.A03(r0)
            float r6 = r6 + r2
            float r5 = X.AnonymousClass001.A01(r8)
            float r2 = X.AnonymousClass001.A01(r0)
            float r5 = r5 + r2
            long r14 = X.AnonymousClass001.A0p(r6, r5)
            long r16 = X.C26199CuU.A00(r10, r0)
            r2 = 0
            r7.L$0 = r2
            r7.J$0 = r0
            r7.label = r3
            r13 = r7
            java.lang.Object r2 = r12.C15(r13, r14, r16)
            if (r2 != r4) goto L_0x002f
            return r4
        L_0x00ac:
            long r4 = X.C7C.A00()
            goto L_0x0035
        L_0x00b1:
            X.0bR r7 = new X.0bR
            r7.<init>(r5, r3)
            goto L_0x001a
        L_0x00b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.C15(X.1dr, long, long):java.lang.Object");
    }

    public long C1C(long j, long j2, int i) {
        long j3;
        C16810tG r2;
        int i2 = i;
        long C1C = this.A01.C1C(j, j2, i2);
        if (!this.A07 || (r2 = (C16810tG) C02670Ex.A00(this, AnonymousClass0GE.A00)) == null) {
            j3 = AnonymousClass0QY.A03;
        } else {
            j3 = r2.C1C(AnonymousClass0QY.A05(j, C1C), AnonymousClass0QY.A04(j2, C1C), i2);
        }
        return AnonymousClass0QY.A05(C1C, j3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        if (r2 == r8) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object C1K(X.C30391dr r10, long r11) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.AnonymousClass0bN
            if (r0 == 0) goto L_0x0092
            r7 = r10
            X.0bN r7 = (X.AnonymousClass0bN) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0092
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r2 = r7.result
            X.1g4 r8 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 == r1) goto L_0x0048
            if (r0 != r6) goto L_0x0099
            long r3 = r7.J$0
            X.C30691eM.A01(r2)
        L_0x0027:
            X.CuU r2 = (X.C26199CuU) r2
            long r5 = r2.A03()
            float r2 = X.AnonymousClass000.A03(r3)
            float r0 = X.AnonymousClass000.A03(r5)
            float r2 = r2 + r0
            float r1 = X.AnonymousClass001.A01(r3)
            float r0 = X.AnonymousClass001.A01(r5)
            float r1 = r1 + r0
            long r0 = X.AnonymousClass001.A0p(r2, r1)
            X.CuU r0 = X.C26199CuU.A01(r0)
            return r0
        L_0x0048:
            long r11 = r7.J$0
            java.lang.Object r0 = r7.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r0
            X.C30691eM.A01(r2)
            goto L_0x0070
        L_0x0052:
            X.C30691eM.A01(r2)
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x008a
            X.0OJ r0 = X.AnonymousClass0GE.A00
            java.lang.Object r0 = X.C02670Ex.A00(r9, r0)
            X.0tG r0 = (X.C16810tG) r0
            if (r0 == 0) goto L_0x008a
            r7.L$0 = r9
            r7.J$0 = r11
            r7.label = r1
            java.lang.Object r2 = r0.C1K(r7, r11)
            if (r2 == r8) goto L_0x0089
            r0 = r9
        L_0x0070:
            X.CuU r2 = (X.C26199CuU) r2
            long r3 = r2.A03()
        L_0x0076:
            X.0tG r5 = r0.A01
            long r1 = X.C26199CuU.A00(r11, r3)
            r0 = 0
            r7.L$0 = r0
            r7.J$0 = r3
            r7.label = r6
            java.lang.Object r2 = r5.C1K(r7, r1)
            if (r2 != r8) goto L_0x0027
        L_0x0089:
            return r8
        L_0x008a:
            long r0 = X.C26199CuU.A01
            long r3 = X.C7C.A00()
            r0 = r9
            goto L_0x0076
        L_0x0092:
            X.0bN r7 = new X.0bN
            r7.<init>(r9, r10)
            goto L_0x0012
        L_0x0099:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.C1K(X.1dr, long):java.lang.Object");
    }

    public long C1Q(long j, int i) {
        long j2;
        C16810tG r0;
        if (!this.A07 || (r0 = (C16810tG) C02670Ex.A00(this, AnonymousClass0GE.A00)) == null) {
            j2 = AnonymousClass0QY.A03;
        } else {
            j2 = r0.C1Q(j, i);
        }
        return AnonymousClass0QY.A05(j2, this.A01.C1Q(AnonymousClass0QY.A04(j, j2), i));
    }

    public NestedScrollNode(C16810tG r2, NestedScrollDispatcher nestedScrollDispatcher) {
        this.A01 = r2;
        this.A00 = nestedScrollDispatcher;
    }

    public void A0L() {
        A02();
    }

    public C02080Cq BXh() {
        return this.A02;
    }
}
