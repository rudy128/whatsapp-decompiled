package X;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: X.CrF  reason: case insensitive filesystem */
public abstract class C26048CrF {
    public float A00 = 0.0f;
    public Integer A01 = AnonymousClass00R.A00;
    public Object A02 = null;
    public Throwable A03 = null;
    public Map A04;
    public boolean A05 = false;
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();

    private void A01() {
        boolean A1Z;
        synchronized (this) {
            A1Z = AnonymousClass000.A1Z(this.A01, AnonymousClass00R.A0C);
        }
        boolean A022 = A02();
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new C70753Cj(this, pair.first, 0, A1Z, A022));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        if (A07() != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean A02() {
        /*
            r3 = this;
            r2 = r3
            monitor-enter(r2)
            boolean r0 = r3.A05     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            boolean r1 = r3.A07()     // Catch:{ all -> 0x0012 }
            r0 = 1
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            monitor-exit(r2)
            return r0
        L_0x0010:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26048CrF.A02():boolean");
    }

    public synchronized Object A03() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (A02() != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        r5 = X.AnonymousClass000.A1Z(r7.A01, X.AnonymousClass00R.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003e, code lost:
        r9.execute(new X.C70753Cj(r2, r3, 0, r5, A02()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C72423Lx r8, java.util.concurrent.Executor r9) {
        /*
            r7 = this;
            r2 = r7
            X.C26208Cuj.A01(r9)
            monitor-enter(r2)
            boolean r0 = r7.A05     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            return
        L_0x000b:
            java.lang.Integer r1 = r7.A01     // Catch:{ all -> 0x004e }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x004e }
            r3 = r8
            if (r1 != r0) goto L_0x001b
            java.util.concurrent.ConcurrentLinkedQueue r1 = r7.A06     // Catch:{ all -> 0x004e }
            android.util.Pair r0 = android.util.Pair.create(r8, r9)     // Catch:{ all -> 0x004e }
            r1.add(r0)     // Catch:{ all -> 0x004e }
        L_0x001b:
            java.lang.Object r0 = r7.A02     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x002c
            boolean r0 = r7.A07()     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x002c
            boolean r1 = r7.A02()     // Catch:{ all -> 0x004e }
            r0 = 0
            if (r1 == 0) goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004b
            monitor-enter(r2)
            java.lang.Integer r1 = r7.A01     // Catch:{ all -> 0x0036 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0036 }
            goto L_0x0039
        L_0x0036:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0039:
            boolean r5 = X.AnonymousClass000.A1Z(r1, r0)
            monitor-exit(r2)
            boolean r6 = r7.A02()
            r4 = 0
            X.3Cj r1 = new X.3Cj
            r1.<init>(r2, r3, r4, r5, r6)
            r9.execute(r1)
        L_0x004b:
            return
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26048CrF.A04(X.3Lx, java.util.concurrent.Executor):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (A07() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.A06.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        A05(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A05     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            r2 = 0
            return r2
        L_0x0008:
            r2 = 1
            r3.A05 = r2     // Catch:{ all -> 0x002a }
            java.lang.Object r1 = r3.A02     // Catch:{ all -> 0x002a }
            r0 = 0
            r3.A02 = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.A05(r1)
        L_0x0016:
            boolean r0 = r3.A07()
            if (r0 != 0) goto L_0x001f
            r3.A01()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.A06     // Catch:{ all -> 0x0027 }
            r0.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26048CrF.A06():boolean");
    }

    public synchronized boolean A07() {
        return AnonymousClass3Ma.A1Z(this.A01, AnonymousClass00R.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(java.lang.Throwable r4, java.util.Map r5) {
        /*
            r3 = this;
            r2 = r3
            monitor-enter(r2)
            boolean r0 = r3.A05     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001a
            java.lang.Integer r1 = r3.A01     // Catch:{ all -> 0x001d }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x001d }
            if (r1 != r0) goto L_0x001a
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x001d }
            r3.A01 = r0     // Catch:{ all -> 0x001d }
            r3.A03 = r4     // Catch:{ all -> 0x001d }
            r3.A04 = r5     // Catch:{ all -> 0x001d }
            monitor-exit(r2)
            r0 = 1
            r3.A01()
            return r0
        L_0x001a:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26048CrF.A09(java.lang.Throwable, java.util.Map):boolean");
    }

    public void A05(Object obj) {
        DRN drn;
        if (((this instanceof BRN) || (this instanceof BRM)) && (drn = (DRN) obj) != null) {
            drn.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0036, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0038, code lost:
        A05(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return false;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0031=Splitter:B:24:0x0031, B:18:0x0026=Splitter:B:18:0x0026} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(java.lang.Object r5, java.util.Map r6, boolean r7) {
        /*
            r4 = this;
            r4.A04 = r6
            r3 = r4
            r2 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x0040 }
            boolean r0 = r4.A05     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0031
            java.lang.Integer r1 = r4.A01     // Catch:{ all -> 0x003d }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x003d }
            if (r1 != r0) goto L_0x0031
            if (r7 == 0) goto L_0x0019
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x003d }
            r4.A01 = r0     // Catch:{ all -> 0x003d }
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.A00 = r0     // Catch:{ all -> 0x003d }
        L_0x0019:
            java.lang.Object r1 = r4.A02     // Catch:{ all -> 0x003d }
            if (r1 == r5) goto L_0x0025
            r4.A02 = r5     // Catch:{ all -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            r2 = r1
            goto L_0x003e
        L_0x0023:
            r5 = r1
            goto L_0x0026
        L_0x0025:
            r5 = r2
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            if (r5 == 0) goto L_0x002c
            r4.A05(r5)
        L_0x002c:
            r0 = 1
            r4.A01()
            return r0
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0036
        L_0x0033:
            r0 = move-exception
            r2 = r5
            goto L_0x003e
        L_0x0036:
            if (r5 == 0) goto L_0x003b
            r4.A05(r5)
        L_0x003b:
            r0 = 0
            return r0
        L_0x003d:
            r0 = move-exception
        L_0x003e:
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            if (r2 == 0) goto L_0x0046
            r4.A05(r2)
        L_0x0046:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26048CrF.A08(java.lang.Object, java.util.Map, boolean):boolean");
    }
}
