package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08W  reason: invalid class name */
public final class AnonymousClass08W extends AnonymousClass0W5 implements C17320uT {
    public C013808g A00 = new C013808g();
    public final C16290s1 A01;
    public final C18090vk A02;

    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, X.0I0] */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.lang.Object, X.0I0] */
    private final C013808g A00(C013808g r20, Snapshot snapshot, C18090vk r22, boolean z) {
        C16290s1 r1;
        Snapshot snapshot2 = snapshot;
        C013808g r2 = r20;
        int i = 0;
        if (!r2.A03(snapshot2)) {
            AnonymousClass06z A022 = AnonymousClass06z.A02();
            AnonymousClass0N4 r4 = AnonymousClass0PF.A00;
            AnonymousClass0I0 r12 = (AnonymousClass0I0) r4.A01();
            AnonymousClass0I0 r122 = r12;
            if (r12 == null) {
                ? obj = new Object();
                obj.A00 = 0;
                r4.A02(obj);
                r122 = obj;
            }
            int i2 = r122.A00;
            C06970a9 A023 = AnonymousClass0PF.A02();
            int i3 = A023.A00;
            if (i3 > 0) {
                Object[] objArr = A023.A01;
                int i4 = 0;
                do {
                    ((C16650sm) objArr[i4]).CNf();
                    i4++;
                } while (i4 < i3);
            }
            try {
                r122.A00 = i2 + 1;
                Object A024 = C04790Ov.A02(r22, new C10490iQ(A022, this, r122, i2));
                r122.A00 = i2;
                int i5 = A023.A00;
                if (i5 > 0) {
                    Object[] objArr2 = A023.A01;
                    do {
                        ((C16650sm) objArr2[i]).BJD();
                        i++;
                    } while (i < i5);
                }
                synchronized (C05200Qx.A08) {
                    Snapshot A012 = C05200Qx.A01();
                    Object obj2 = r2.A04;
                    if (obj2 == C013808g.A05 || (r1 = this.A01) == null || !r1.BKT(A024, obj2)) {
                        C013808g r13 = this.A00;
                        C03460Ig A0E = C05200Qx.A0E(this, r13);
                        A0E.A01(r13);
                        A0E.A00 = A012.A04();
                        r2 = (C013808g) A0E;
                        r2.A03 = A022;
                        r2.A00 = r2.A02(A012);
                        r2.A01 = snapshot2.A04();
                        r2.A02 = snapshot2.A08();
                        r2.A04 = A024;
                    } else {
                        r2.A03 = A022;
                        r2.A00 = r2.A02(A012);
                        r2.A01 = snapshot2.A04();
                        r2.A02 = snapshot2.A08();
                    }
                }
                AnonymousClass0I0 r0 = (AnonymousClass0I0) r4.A01();
                if (r0 != null && r0.A00 == 0) {
                    C05200Qx.A01().A0H();
                    return r2;
                }
            } catch (Throwable th) {
                th = th;
                int i6 = A023.A00;
                if (i6 > 0) {
                    Object[] objArr3 = A023.A01;
                    do {
                        ((C16650sm) objArr3[i]).BJD();
                        i++;
                    } while (i < i6);
                }
                throw th;
            }
        } else if (z) {
            C06970a9 A025 = AnonymousClass0PF.A02();
            int i7 = A025.A00;
            if (i7 > 0) {
                Object[] objArr4 = A025.A01;
                int i8 = 0;
                do {
                    ((C16650sm) objArr4[i8]).CNf();
                    i8++;
                } while (i8 < i7);
            }
            try {
                AnonymousClass0KU r14 = r2.A03;
                AnonymousClass0N4 r02 = AnonymousClass0PF.A00;
                AnonymousClass0I0 r10 = (AnonymousClass0I0) r02.A01();
                AnonymousClass0I0 r102 = r10;
                if (r10 == null) {
                    ? obj3 = new Object();
                    obj3.A00 = 0;
                    r02.A02(obj3);
                    r102 = obj3;
                }
                int i9 = r102.A00;
                Object[] objArr5 = r14.A04;
                int[] iArr = r14.A02;
                long[] jArr = r14.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int A0F = AnonymousClass000.A0F(i10, length);
                            for (int i11 = 0; i11 < A0F; i11++) {
                                if ((j & 255) < 128) {
                                    int i12 = (i10 << 3) + i11;
                                    AnonymousClass0t4 r132 = (AnonymousClass0t4) objArr5[i12];
                                    r102.A00 = iArr[i12] + i9;
                                    C22821Di A0A = snapshot2.A0A();
                                    if (A0A != null) {
                                        A0A.invoke(r132);
                                    }
                                }
                                j >>= 8;
                            }
                            if (A0F != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                r102.A00 = i9;
                int i13 = A025.A00;
                if (i13 > 0) {
                    Object[] objArr6 = A025.A01;
                    int i14 = 0;
                    do {
                        ((C16650sm) objArr6[i14]).BJD();
                        i14++;
                    } while (i14 < i13);
                }
            } catch (Throwable th2) {
                th = th2;
                int i15 = A025.A00;
                if (i15 > 0) {
                    Object[] objArr7 = A025.A01;
                    int i16 = 0;
                    do {
                        ((C16650sm) objArr7[i16]).BJD();
                        i16++;
                    } while (i16 < i15);
                }
                throw th;
            }
        }
        return r2;
    }

    public final C013808g A03(Snapshot snapshot) {
        return A00((C013808g) C05200Qx.A0B(snapshot, this.A00), snapshot, this.A02, false);
    }

    public C013808g BQ0() {
        return A00((C013808g) C05200Qx.A0G(this.A00), C05200Qx.A01(), this.A02, false);
    }

    public void CCU(C03460Ig r2) {
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.A00 = (C013808g) r2;
    }

    public String toString() {
        String str;
        C05200Qx.A0G(this.A00);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DerivedState(value=");
        C013808g r1 = (C013808g) C05200Qx.A0G(this.A00);
        if (r1.A03(C05200Qx.A01())) {
            str = String.valueOf(r1.A04);
        } else {
            str = "<Not calculated>";
        }
        A10.append(str);
        return AnonymousClass0W5.A01(this, A10);
    }

    public AnonymousClass08W(C16290s1 r2, C18090vk r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public C03460Ig BRn() {
        return this.A00;
    }

    public Object getValue() {
        C22821Di A0A = C05200Qx.A01().A0A();
        if (A0A != null) {
            A0A.invoke(this);
        }
        return A00((C013808g) C05200Qx.A0G(this.A00), C05200Qx.A01(), this.A02, true).A04;
    }
}
