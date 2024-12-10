package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.08M  reason: invalid class name */
public class AnonymousClass08M extends Snapshot {
    public static final int[] A09 = new int[0];
    public boolean A00;
    public int[] A01 = A09;
    public int A02 = 1;
    public int A03;
    public C06990aB A04;
    public C06400Ye A05 = AnonymousClass0EV.A00();
    public List A06;
    public final C22821Di A07;
    public final C22821Di A08;

    public boolean A0K() {
        return false;
    }

    public AnonymousClass08M A0M(C22821Di r11, C22821Di r12) {
        AnonymousClass08G r4;
        if (!(!this.A03)) {
            throw AnonymousClass000.A0k("Cannot use a disposed snapshot");
        } else if (!this.A00 || this.A01 >= 0) {
            A0R(A04());
            Object obj = C05200Qx.A08;
            synchronized (obj) {
                int i = C05200Qx.A00;
                C05200Qx.A00 = i + 1;
                C05200Qx.A04 = C05200Qx.A04.A09(i);
                C06400Ye A052 = A05();
                A07(A052.A09(i));
                r4 = new AnonymousClass08G(this, C05200Qx.A08(A052, A04() + 1, i), C05200Qx.A0P(r11, A0A(), true), C05200Qx.A0M(r12, A0B()), i);
            }
            if (!this.A00 && !this.A03) {
                int A042 = A04();
                synchronized (obj) {
                    int i2 = C05200Qx.A00;
                    C05200Qx.A00 = i2 + 1;
                    A06(i2);
                    C05200Qx.A04 = C05200Qx.A04.A09(A04());
                }
                A07(C05200Qx.A08(A05(), A042 + 1, A04()));
            }
            return r4;
        } else {
            throw AnonymousClass000.A0n("Unsupported operation on a disposed or applied snapshot");
        }
    }

    public final void A0V(int[] iArr) {
        if (iArr.length != 0) {
            int[] iArr2 = this.A01;
            if (iArr2.length != 0) {
                iArr = C200310o.A0C(iArr2, iArr);
            }
            this.A01 = iArr;
        }
    }

    public Snapshot A09(C22821Di r7) {
        AnonymousClass08K r4;
        if (!(!this.A03)) {
            throw AnonymousClass000.A0k("Cannot use a disposed snapshot");
        } else if (!this.A00 || this.A01 >= 0) {
            int A042 = A04();
            A0R(A04());
            Object obj = C05200Qx.A08;
            synchronized (obj) {
                int i = C05200Qx.A00;
                C05200Qx.A00 = i + 1;
                C05200Qx.A04 = C05200Qx.A04.A09(i);
                r4 = new AnonymousClass08K(this, C05200Qx.A08(A05(), A042 + 1, i), r7, i);
            }
            if (!this.A00 && !this.A03) {
                int A043 = A04();
                synchronized (obj) {
                    int i2 = C05200Qx.A00;
                    C05200Qx.A00 = i2 + 1;
                    A06(i2);
                    C05200Qx.A04 = C05200Qx.A04.A09(A04());
                }
                A07(C05200Qx.A08(A05(), A043 + 1, A04()));
            }
            return r4;
        } else {
            throw AnonymousClass000.A0n("Unsupported operation on a disposed or applied snapshot");
        }
    }

    public void A0D() {
        if (!this.A03) {
            super.A0D();
            A0G();
        }
    }

    public void A0E() {
        for (int A0T : this.A01) {
            C05200Qx.A0T(A0T);
        }
        super.A0E();
    }

    public void A0F() {
        this.A02++;
    }

    public void A0G() {
        int i = this.A02;
        if (i > 0) {
            int i2 = i - 1;
            this.A02 = i2;
            if (i2 == 0 && !this.A00) {
                A01();
                return;
            }
            return;
        }
        throw AnonymousClass000.A0k("no pending nested snapshots");
    }

    public void A0H() {
        if (!this.A00 && !this.A03) {
            A0Q();
        }
    }

    public final void A0R(int i) {
        synchronized (C05200Qx.A08) {
            this.A05 = this.A05.A09(i);
        }
    }

    public final void A0S(int i) {
        if (i >= 0) {
            this.A01 = C200310o.A0B(this.A01, i);
        }
    }

    public final void A0U(C06400Ye r3) {
        synchronized (C05200Qx.A08) {
            this.A05 = this.A05.A0B(r3);
        }
    }

    public AnonymousClass08M(C06400Ye r2, C22821Di r3, C22821Di r4, int i) {
        super(r2, i);
        this.A07 = r3;
        this.A08 = r4;
    }

    private final void A01() {
        C06990aB A0L = A0L();
        if (A0L != null) {
            if (!this.A00) {
                A0T((C06990aB) null);
                int A042 = A04();
                Object[] A043 = A0L.A04();
                int size = A0L.size();
                for (int i = 0; i < size; i++) {
                    Object obj = A043[i];
                    C18070vi.A0z(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    for (C03460Ig BRn = ((AnonymousClass0t4) obj).BRn(); BRn != null; BRn = BRn.A01) {
                        if (BRn.A00 == A042 || C29431cG.A18(this.A05, Integer.valueOf(BRn.A00))) {
                            BRn.A00 = 0;
                        }
                    }
                }
            } else {
                throw AnonymousClass000.A0n("Unsupported operation on a snapshot that has been applied");
            }
        }
        A03();
    }

    public int A08() {
        return this.A03;
    }

    public C22821Di A0A() {
        return this.A07;
    }

    public C22821Di A0B() {
        return this.A08;
    }

    public void A0C() {
        C05200Qx.A04 = C05200Qx.A04.A08(A04()).A0A(this.A05);
    }

    public void A0J(AnonymousClass0t4 r2) {
        C06990aB A0L = A0L();
        if (A0L == null) {
            A0L = new C06990aB();
            A0T(A0L);
        }
        A0L.add(r2);
    }

    public C06990aB A0L() {
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r10.A00 = true;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
        if (r8 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (r8.isEmpty() != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        X.C18070vi.A0b(r8);
        r2 = r3.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (r1 >= r2) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        ((X.AnonymousClass1OS) r3.get(r1)).invoke(r8, r10);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        if (r7 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        if (r7.isEmpty() != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        r2 = r3.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c7, code lost:
        if (r1 >= r2) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c9, code lost:
        ((X.AnonymousClass1OS) r3.get(r1)).invoke(r7, r10);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        A0E();
        X.C05200Qx.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if (r8 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        r4 = r8.A04();
        r3 = r8.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e7, code lost:
        if (r2 >= r3) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e9, code lost:
        r1 = r4[r2];
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        r1 = (X.AnonymousClass0t4) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f6, code lost:
        if (X.C05200Qx.A0Z(r1) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        X.C05200Qx.A07.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fd, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        if (r7 == null) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0102, code lost:
        r4 = r7.A04();
        r3 = r7.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010b, code lost:
        if (r2 >= r3) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010d, code lost:
        r1 = r4[r2];
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        r1 = (X.AnonymousClass0t4) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011a, code lost:
        if (X.C05200Qx.A0Z(r1) == false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        X.C05200Qx.A07.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0121, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0124, code lost:
        r3 = r10.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0126, code lost:
        if (r3 == null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0128, code lost:
        r2 = r3.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012c, code lost:
        if (r5 >= r2) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012e, code lost:
        r1 = (X.AnonymousClass0t4) r3.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0138, code lost:
        if (X.C05200Qx.A0Z(r1) == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013a, code lost:
        X.C05200Qx.A07.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0142, code lost:
        r10.A06 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0144, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0147, code lost:
        return X.AnonymousClass08O.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C01980Ce A0N() {
        /*
            r10 = this;
            X.0aB r7 = r10.A0L()
            r6 = 0
            if (r7 == 0) goto L_0x002d
            java.util.concurrent.atomic.AtomicReference r0 = X.C05200Qx.A09
            java.lang.Object r2 = r0.get()
            X.08M r2 = (X.AnonymousClass08M) r2
            X.0Ye r1 = X.C05200Qx.A04
            java.lang.Object r0 = r0.get()
            androidx.compose.runtime.snapshots.Snapshot r0 = (androidx.compose.runtime.snapshots.Snapshot) r0
            int r0 = r0.A04()
            X.0Ye r0 = r1.A08(r0)
            java.util.HashMap r4 = X.C05200Qx.A0J(r2, r10, r0)
        L_0x0025:
            X.0wS r3 = X.AnonymousClass1ZU.A09()
            java.lang.Object r9 = X.C05200Qx.A08
            monitor-enter(r9)
            goto L_0x002f
        L_0x002d:
            r4 = r6
            goto L_0x0025
        L_0x002f:
            X.C05200Qx.A0U(r10)     // Catch:{ all -> 0x0148 }
            if (r7 == 0) goto L_0x0075
            int r0 = r7.size()     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0075
            java.util.concurrent.atomic.AtomicReference r0 = X.C05200Qx.A09     // Catch:{ all -> 0x0148 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0148 }
            X.08H r3 = (X.AnonymousClass08H) r3     // Catch:{ all -> 0x0148 }
            int r2 = X.C05200Qx.A00     // Catch:{ all -> 0x0148 }
            X.0Ye r1 = X.C05200Qx.A04     // Catch:{ all -> 0x0148 }
            int r0 = r3.A04()     // Catch:{ all -> 0x0148 }
            X.0Ye r0 = r1.A08(r0)     // Catch:{ all -> 0x0148 }
            X.0Ce r1 = r10.A0O(r0, r4, r2)     // Catch:{ all -> 0x0148 }
            X.08O r0 = X.AnonymousClass08O.A00     // Catch:{ all -> 0x0148 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x005e
            monitor-exit(r9)
            return r1
        L_0x005e:
            r10.A0C()     // Catch:{ all -> 0x0148 }
            X.1Di r0 = X.C05200Qx.A0B     // Catch:{ all -> 0x0148 }
            X.C05200Qx.A0H(r3, r0)     // Catch:{ all -> 0x0148 }
            X.0aB r8 = r3.A0L()     // Catch:{ all -> 0x0148 }
            r10.A0T(r6)     // Catch:{ all -> 0x0148 }
            r3.A0T(r6)     // Catch:{ all -> 0x0148 }
            java.util.List r3 = X.C05200Qx.A01     // Catch:{ all -> 0x0148 }
            goto L_0x0097
        L_0x0075:
            r10.A0C()     // Catch:{ all -> 0x0148 }
            java.util.concurrent.atomic.AtomicReference r0 = X.C05200Qx.A09     // Catch:{ all -> 0x0148 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0148 }
            X.08H r1 = (X.AnonymousClass08H) r1     // Catch:{ all -> 0x0148 }
            X.1Di r0 = X.C05200Qx.A0B     // Catch:{ all -> 0x0148 }
            X.C05200Qx.A0H(r1, r0)     // Catch:{ all -> 0x0148 }
            X.0aB r8 = r1.A0L()     // Catch:{ all -> 0x0148 }
            if (r8 == 0) goto L_0x0096
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x0096
            java.util.List r3 = X.C05200Qx.A01     // Catch:{ all -> 0x0148 }
            goto L_0x0097
        L_0x0096:
            r8 = r6
        L_0x0097:
            monitor-exit(r9)
            r0 = 1
            r10.A00 = r0
            r5 = 0
            if (r8 == 0) goto L_0x00ba
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00ba
            X.C18070vi.A0b(r8)
            int r2 = r3.size()
            r1 = 0
        L_0x00ac:
            if (r1 >= r2) goto L_0x00ba
            java.lang.Object r0 = r3.get(r1)
            X.1OS r0 = (X.AnonymousClass1OS) r0
            r0.invoke(r8, r10)
            int r1 = r1 + 1
            goto L_0x00ac
        L_0x00ba:
            if (r7 == 0) goto L_0x00d5
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00d5
            int r2 = r3.size()
            r1 = 0
        L_0x00c7:
            if (r1 >= r2) goto L_0x00d5
            java.lang.Object r0 = r3.get(r1)
            X.1OS r0 = (X.AnonymousClass1OS) r0
            r0.invoke(r7, r10)
            int r1 = r1 + 1
            goto L_0x00c7
        L_0x00d5:
            monitor-enter(r9)
            r10.A0E()     // Catch:{ all -> 0x0148 }
            X.C05200Qx.A0S()     // Catch:{ all -> 0x0148 }
            if (r8 == 0) goto L_0x0100
            java.lang.Object[] r4 = r8.A04()     // Catch:{ all -> 0x0148 }
            int r3 = r8.size()     // Catch:{ all -> 0x0148 }
            r2 = 0
        L_0x00e7:
            if (r2 >= r3) goto L_0x0100
            r1 = r4[r2]     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x0148 }
            X.0t4 r1 = (X.AnonymousClass0t4) r1     // Catch:{ all -> 0x0148 }
            boolean r0 = X.C05200Qx.A0Z(r1)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x00fd
            X.0IK r0 = X.C05200Qx.A07     // Catch:{ all -> 0x0148 }
            r0.A00(r1)     // Catch:{ all -> 0x0148 }
        L_0x00fd:
            int r2 = r2 + 1
            goto L_0x00e7
        L_0x0100:
            if (r7 == 0) goto L_0x0124
            java.lang.Object[] r4 = r7.A04()     // Catch:{ all -> 0x0148 }
            int r3 = r7.size()     // Catch:{ all -> 0x0148 }
            r2 = 0
        L_0x010b:
            if (r2 >= r3) goto L_0x0124
            r1 = r4[r2]     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x0148 }
            X.0t4 r1 = (X.AnonymousClass0t4) r1     // Catch:{ all -> 0x0148 }
            boolean r0 = X.C05200Qx.A0Z(r1)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0121
            X.0IK r0 = X.C05200Qx.A07     // Catch:{ all -> 0x0148 }
            r0.A00(r1)     // Catch:{ all -> 0x0148 }
        L_0x0121:
            int r2 = r2 + 1
            goto L_0x010b
        L_0x0124:
            java.util.List r3 = r10.A06     // Catch:{ all -> 0x0148 }
            if (r3 == 0) goto L_0x0142
            int r2 = r3.size()     // Catch:{ all -> 0x0148 }
        L_0x012c:
            if (r5 >= r2) goto L_0x0142
            java.lang.Object r1 = r3.get(r5)     // Catch:{ all -> 0x0148 }
            X.0t4 r1 = (X.AnonymousClass0t4) r1     // Catch:{ all -> 0x0148 }
            boolean r0 = X.C05200Qx.A0Z(r1)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x013f
            X.0IK r0 = X.C05200Qx.A07     // Catch:{ all -> 0x0148 }
            r0.A00(r1)     // Catch:{ all -> 0x0148 }
        L_0x013f:
            int r5 = r5 + 1
            goto L_0x012c
        L_0x0142:
            r10.A06 = r6     // Catch:{ all -> 0x0148 }
            monitor-exit(r9)
            X.08O r0 = X.AnonymousClass08O.A00
            return r0
        L_0x0148:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08M.A0N():X.0Ce");
    }

    public final C01980Ce A0O(C06400Ye r14, Map map, int i) {
        C03460Ig A0D;
        Object obj;
        AnonymousClass1D6 A002;
        C06400Ye A0B = A05().A09(A04()).A0B(this.A05);
        C06990aB A0L = A0L();
        C18070vi.A0b(A0L);
        Object[] A042 = A0L.A04();
        int size = A0L.size();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = A042[i2];
            C18070vi.A0z(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            AnonymousClass0t4 r4 = (AnonymousClass0t4) obj2;
            C03460Ig BRn = r4.BRn();
            C03460Ig A0D2 = C05200Qx.A0C(r14, BRn, i);
            if (!(A0D2 == null || (A0D = C05200Qx.A0C(A0B, BRn, A04())) == null || A0D2.equals(A0D))) {
                C03460Ig A0D3 = C05200Qx.A0C(A05(), BRn, A04());
                if (A0D3 == null) {
                    throw AnonymousClass000.A0n("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                } else if ((map == null || (obj = map.get(A0D2)) == null) && (obj = r4.Bjn(A0D, A0D2, A0D3)) == null) {
                    return new AnonymousClass08N(this);
                } else {
                    if (!obj.equals(A0D3)) {
                        if (obj.equals(A0D2)) {
                            if (arrayList == null) {
                                arrayList = AnonymousClass000.A13();
                            }
                            arrayList.add(AnonymousClass6YK.A00(r4, A0D2.A00()));
                            if (arrayList2 == null) {
                                arrayList2 = AnonymousClass000.A13();
                            }
                            arrayList2.add(r4);
                        } else {
                            if (arrayList == null) {
                                arrayList = AnonymousClass000.A13();
                            }
                            if (!obj.equals(A0D)) {
                                A002 = AnonymousClass6YK.A00(r4, obj);
                            } else {
                                A002 = AnonymousClass6YK.A00(r4, A0D.A00());
                            }
                            arrayList.add(A002);
                        }
                    }
                }
            }
        }
        if (arrayList != null) {
            A0Q();
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnonymousClass1D6 r0 = (AnonymousClass1D6) arrayList.get(i3);
                AnonymousClass0t4 r3 = (AnonymousClass0t4) r0.A04();
                C03460Ig r2 = (C03460Ig) r0.A05();
                r2.A00 = A04();
                synchronized (C05200Qx.A08) {
                    r2.A01 = r3.BRn();
                    r3.CCU(r2);
                }
            }
        }
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                A0L.remove(arrayList2.get(i4));
            }
            List list = this.A06;
            if (list != null) {
                arrayList2 = C29431cG.A0k(arrayList2, list);
            }
            this.A06 = arrayList2;
        }
        return AnonymousClass08O.A00;
    }

    public final C06400Ye A0P() {
        return this.A05;
    }

    public final void A0Q() {
        A0R(A04());
        if (!this.A00 && !this.A03) {
            int A042 = A04();
            synchronized (C05200Qx.A08) {
                int i = C05200Qx.A00;
                C05200Qx.A00 = i + 1;
                A06(i);
                C05200Qx.A04 = C05200Qx.A04.A09(A04());
            }
            A07(C05200Qx.A08(A05(), A042 + 1, A04()));
        }
    }

    public void A0I(int i) {
        this.A03 = i;
    }

    public void A0T(C06990aB r1) {
        this.A04 = r1;
    }
}
