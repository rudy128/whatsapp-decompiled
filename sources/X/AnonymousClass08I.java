package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08I  reason: invalid class name */
public final class AnonymousClass08I extends AnonymousClass08M {
    public final AnonymousClass08M A00;
    public final boolean A01;
    public final boolean A02;

    public void A0D() {
        AnonymousClass08M r0;
        this.A03 = true;
        if (this.A02 && (r0 = this.A00) != null) {
            r0.A0D();
        }
    }

    private final AnonymousClass08M A00() {
        AnonymousClass08M r0 = this.A00;
        if (r0 == null) {
            return (AnonymousClass08M) C05200Qx.A09.get();
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r5.A0A();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass08I(X.AnonymousClass08M r5, X.C22821Di r6, X.C22821Di r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            X.0Ye r3 = X.AnonymousClass0EV.A00()
            if (r5 == 0) goto L_0x000c
            X.1Di r0 = r5.A0A()
            if (r0 != 0) goto L_0x0018
        L_0x000c:
            java.util.concurrent.atomic.AtomicReference r0 = X.C05200Qx.A09
            java.lang.Object r0 = r0.get()
            androidx.compose.runtime.snapshots.Snapshot r0 = (androidx.compose.runtime.snapshots.Snapshot) r0
            X.1Di r0 = r0.A0A()
        L_0x0018:
            X.1Di r2 = X.C05200Qx.A0P(r6, r0, r8)
            if (r5 == 0) goto L_0x0024
            X.1Di r0 = r5.A0B()
            if (r0 != 0) goto L_0x0030
        L_0x0024:
            java.util.concurrent.atomic.AtomicReference r0 = X.C05200Qx.A09
            java.lang.Object r0 = r0.get()
            androidx.compose.runtime.snapshots.Snapshot r0 = (androidx.compose.runtime.snapshots.Snapshot) r0
            X.1Di r0 = r0.A0B()
        L_0x0030:
            X.1Di r1 = X.C05200Qx.A0M(r7, r0)
            r0 = 0
            r4.<init>(r3, r2, r1, r0)
            r4.A00 = r5
            r4.A01 = r8
            r4.A02 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08I.<init>(X.08M, X.1Di, X.1Di, boolean, boolean):void");
    }

    public int A04() {
        return A00().A04();
    }

    public C06400Ye A05() {
        return A00().A05();
    }

    public void A06(int i) {
        C04120Lx.A00();
        throw null;
    }

    public void A07(C06400Ye r2) {
        C04120Lx.A00();
        throw null;
    }

    public int A08() {
        return A00().A08();
    }

    public Snapshot A09(C22821Di r5) {
        C22821Di A0N = C05200Qx.A0P(r5, A0A(), true);
        boolean z = this.A01;
        AnonymousClass08M A002 = A00();
        if (!z) {
            return C05200Qx.A04(A002.A09((C22821Di) null), A0N, true);
        }
        return A002.A09(A0N);
    }

    public /* bridge */ /* synthetic */ void A0F() {
        C04120Lx.A00();
        throw null;
    }

    public /* bridge */ /* synthetic */ void A0G() {
        C04120Lx.A00();
        throw null;
    }

    public void A0H() {
        A00().A0H();
    }

    public void A0I(int i) {
        A00().A0I(i);
    }

    public void A0J(AnonymousClass0t4 r2) {
        A00().A0J(r2);
    }

    public boolean A0K() {
        return A00().A0K();
    }

    public C06990aB A0L() {
        return A00().A0L();
    }

    public AnonymousClass08M A0M(C22821Di r8, C22821Di r9) {
        C22821Di A0N = C05200Qx.A0P(r8, A0A(), true);
        C22821Di A0O = C05200Qx.A0M(r9, A0B());
        boolean z = this.A01;
        AnonymousClass08M A002 = A00();
        if (!z) {
            return new AnonymousClass08I(A002.A0M((C22821Di) null, A0O), A0N, A0O, false, true);
        }
        return A002.A0M(A0N, A0O);
    }

    public C01980Ce A0N() {
        return A00().A0N();
    }

    public void A0T(C06990aB r2) {
        C04120Lx.A00();
        throw null;
    }
}
