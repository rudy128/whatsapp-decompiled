package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1hA  reason: invalid class name and case insensitive filesystem */
public final class C32421hA {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AnonymousClass1CJ A01;
    public final C18030ve A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public C32421hA(AnonymousClass1CJ r3, C18030ve r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r9, 7);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A07 = r7;
        this.A06 = r8;
        this.A05 = r9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r1 == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r1 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.AnonymousClass206 r6) {
        /*
            r5 = this;
            r4 = 0
            X.2KB r3 = r5.A01(r6)
            monitor-enter(r3)
            java.util.Map r2 = r3.A01     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x002d }
            X.3Cx r0 = (X.C70893Cx) r0     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0015
            boolean r1 = r0.A03     // Catch:{ all -> 0x002d }
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x001a
            return r4
        L_0x001a:
            monitor-enter(r3)
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x002d }
            X.3Cx r0 = (X.C70893Cx) r0     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002a
            boolean r1 = X.C26461Sf.A00(r0, r3, r6)     // Catch:{ all -> 0x002d }
            r0 = 1
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            monitor-exit(r3)
            return r0
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32421hA.A02(X.206):boolean");
    }

    public final AnonymousClass2KB A00() {
        AnonymousClass00H r0;
        if (C18020vd.A05(C18040vf.A02, this.A02, 8633)) {
            r0 = this.A06;
        } else {
            r0 = this.A07;
        }
        Object obj = r0.get();
        C18070vi.A0b(obj);
        return (AnonymousClass2KB) obj;
    }

    public final AnonymousClass2KB A01(AnonymousClass206 r2) {
        if (r2 == null || !r2.A0w()) {
            return A00();
        }
        Object obj = this.A05.get();
        C18070vi.A0b(obj);
        return (AnonymousClass2KB) obj;
    }
}
