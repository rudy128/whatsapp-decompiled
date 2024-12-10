package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8gZ  reason: invalid class name and case insensitive filesystem */
public class C167548gZ extends C36821oW {
    public boolean A00 = true;
    public boolean A01 = true;
    public boolean A02 = true;
    public boolean A03 = true;
    public final C36801oU A04;
    public final Object A05 = C17880vN.A0p();
    public final C196239ug A06;
    public final C36841oY A07;

    public boolean A01() {
        boolean z;
        synchronized (this) {
            z = this.A00;
        }
        if (!z) {
            C36801oU r4 = this.A04;
            AtomicBoolean atomicBoolean = r4.A0P;
            if (atomicBoolean.get()) {
                boolean A1W = AnonymousClass8BY.A1W(r4, this.A07, this.A06.A00());
                synchronized (this.A05) {
                    this.A03 = r4.A0H.A02();
                    this.A02 = r4.A09;
                    this.A00 = r4.A05;
                    this.A01 = r4.A0T.get();
                }
                if (!A1W || !atomicBoolean.get()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public boolean A02() {
        boolean z;
        synchronized (this.A05) {
            z = this.A00;
        }
        return z;
    }

    public boolean A03() {
        boolean z;
        synchronized (this.A05) {
            z = this.A01;
        }
        return z;
    }

    public boolean A04() {
        boolean z;
        synchronized (this.A05) {
            z = this.A02;
        }
        return z;
    }

    public boolean A05() {
        boolean z;
        synchronized (this.A05) {
            z = this.A03;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r3.A00 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A05
            monitor-enter(r2)
            boolean r0 = r3.A02     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A01     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A03     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r1 = r3.A00     // Catch:{ all -> 0x0017 }
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167548gZ.A06():boolean");
    }

    public C167548gZ(C36801oU r2, C196239ug r3, C36841oY r4) {
        this.A06 = r3;
        this.A04 = r2;
        this.A07 = r4;
    }

    public String toString() {
        return "backup-condition";
    }
}
