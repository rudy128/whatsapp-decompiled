package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08g  reason: invalid class name and case insensitive filesystem */
public final class C013808g extends C03460Ig {
    public static final Object A05 = new Object();
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass0KU A03 = AnonymousClass0LV.A00();
    public Object A04 = A05;

    public C03460Ig A00() {
        return new C013808g();
    }

    public void A01(C03460Ig r2) {
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        C013808g r22 = (C013808g) r2;
        this.A03 = r22.A03;
        this.A04 = r22.A04;
        this.A00 = r22.A00;
    }

    public final int A02(Snapshot snapshot) {
        AnonymousClass0KU r4;
        C03460Ig A0B;
        synchronized (C05200Qx.A08) {
            r4 = this.A03;
        }
        int i = 7;
        if (AnonymousClass000.A1O(r4.A01)) {
            C06970a9 A022 = AnonymousClass0PF.A02();
            int i2 = A022.A00;
            if (i2 > 0) {
                Object[] objArr = A022.A01;
                int i3 = 0;
                do {
                    ((C16650sm) objArr[i3]).CNf();
                    i3++;
                } while (i3 < i2);
            }
            try {
                Object[] objArr2 = r4.A04;
                int[] iArr = r4.A02;
                long[] jArr = r4.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    int i5 = 7;
                    while (true) {
                        long j = jArr[i4];
                        if ((((-1 ^ j) << i) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int A0F = AnonymousClass000.A0F(i4, length);
                            for (int i6 = 0; i6 < A0F; i6++) {
                                if ((j & 255) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    AnonymousClass0t4 r2 = (AnonymousClass0t4) objArr2[i7];
                                    if (iArr[i7] == 1) {
                                        Snapshot snapshot2 = snapshot;
                                        if (r2 instanceof AnonymousClass08W) {
                                            A0B = ((AnonymousClass08W) r2).A03(snapshot2);
                                        } else {
                                            A0B = C05200Qx.A0B(snapshot2, r2.BRn());
                                        }
                                        i5 = (((i5 * 31) + System.identityHashCode(A0B)) * 31) + A0B.A00;
                                    }
                                }
                                j >>= 8;
                            }
                            if (A0F != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        i = 7;
                    }
                    i = i5;
                }
                int i8 = A022.A00;
                if (i8 > 0) {
                    Object[] objArr3 = A022.A01;
                    int i9 = 0;
                    do {
                        ((C16650sm) objArr3[i9]).BJD();
                        i9++;
                    } while (i9 < i8);
                }
            } catch (Throwable th) {
                int i10 = A022.A00;
                if (i10 > 0) {
                    Object[] objArr4 = A022.A01;
                    int i11 = 0;
                    do {
                        ((C16650sm) objArr4[i11]).BJD();
                        i11++;
                    } while (i11 < i10);
                }
                throw th;
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r5.A02 != r6.A08()) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(androidx.compose.runtime.snapshots.Snapshot r6) {
        /*
            r5 = this;
            java.lang.Object r4 = X.C05200Qx.A08
            monitor-enter(r4)
            int r1 = r5.A01     // Catch:{ all -> 0x0039 }
            int r0 = r6.A04()     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 != r0) goto L_0x0015
            int r1 = r5.A02     // Catch:{ all -> 0x0039 }
            int r0 = r6.A08()     // Catch:{ all -> 0x0039 }
            r2 = 0
            if (r1 == r0) goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            monitor-exit(r4)
            java.lang.Object r1 = r5.A04
            java.lang.Object r0 = A05
            if (r1 == r0) goto L_0x0038
            if (r2 == 0) goto L_0x0027
            int r1 = r5.A00
            int r0 = r5.A02(r6)
            if (r1 != r0) goto L_0x0038
        L_0x0027:
            r3 = 1
            if (r2 == 0) goto L_0x0038
            monitor-enter(r4)
            int r0 = r6.A04()     // Catch:{ all -> 0x0039 }
            r5.A01 = r0     // Catch:{ all -> 0x0039 }
            int r0 = r6.A08()     // Catch:{ all -> 0x0039 }
            r5.A02 = r0     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)
        L_0x0038:
            return r3
        L_0x0039:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013808g.A03(androidx.compose.runtime.snapshots.Snapshot):boolean");
    }
}
