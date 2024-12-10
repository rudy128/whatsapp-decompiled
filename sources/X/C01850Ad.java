package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0Ad  reason: invalid class name and case insensitive filesystem */
public abstract class C01850Ad extends AnonymousClass0AM implements C16910tQ, C17500ul, C16490sL {
    public static final AnonymousClass0WP A0J = new AnonymousClass0WP();
    public static final AnonymousClass0IY A0K = new AnonymousClass0IY();
    public static final C16720su A0L = new AnonymousClass0XX(0);
    public static final C16720su A0M = new AnonymousClass0XX(1);
    public static final C22821Di A0N = C12220lP.A00;
    public static final C22821Di A0O = C12230lQ.A00;
    public static final float[] A0P = C05040Qd.A08();
    public long A00 = C79.A00();
    public C02100Cs A01;
    public C16950tU A02;
    public boolean A03;
    public float A04 = 0.8f;
    public float A05;
    public C16820tH A06;
    public AnonymousClass0IY A07;
    public C01850Ad A08;
    public C01850Ad A09;
    public C28644ECa A0A;
    public C24246By4 A0B;
    public Map A0C;
    public C22821Di A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass0XV A0G;
    public final C18090vk A0H = new C08260eo(this);
    public final C22821Di A0I = new C10870j2(this);

    /* access modifiers changed from: private */
    public final void A0C(AnonymousClass0XW r11, C06850Zx r12, C16720su r13, float f, long j, boolean z, boolean z2) {
        AnonymousClass0XW r1 = r11;
        C06850Zx r2 = r12;
        C16720su r3 = r13;
        long j2 = j;
        boolean z3 = z;
        boolean z4 = z2;
        if (r11 == null) {
            A1E(r12, r13, j, z3, z4);
        } else {
            r12.A0B(r11, new C08420f4(r1, r2, r3, this, f, j2, z3, z4), f, z4);
        }
    }

    /* access modifiers changed from: private */
    public final void A0E(AnonymousClass0XW r10, C06850Zx r11, C16720su r12, long j, boolean z, boolean z2) {
        AnonymousClass0XW r1 = r10;
        C06850Zx r2 = r11;
        C16720su r3 = r12;
        long j2 = j;
        boolean z3 = z;
        boolean z4 = z2;
        if (r10 == null) {
            A1E(r11, r12, j, z, z4);
        } else {
            r11.A0D(r10, new C08410f3(r1, r2, r3, this, j2, z3, z4), z4);
        }
    }

    /* access modifiers changed from: private */
    public final void A0J(C16960tV r9) {
        AnonymousClass0XW r1 = A0r().A04;
        C16960tV r4 = r9;
        if (r1 != null) {
            AnonymousClass0XW A032 = A03(false);
            while (A032 != null && (A032.A00 & 4) != 0) {
                if ((A032.A01 & 4) == 0) {
                    if (A032 == r1) {
                        break;
                    }
                    A032 = A032.A02;
                } else {
                    this.A0G.A0J().A01(A032, r4, this, C25293Ccv.A01(this.A03));
                    return;
                }
            }
        }
        A1B(r9);
    }

    private final void A0P(C01850Ad r7, float[] fArr) {
        C01850Ad r5 = this;
        while (!C18070vi.A18(r5, r7)) {
            C16950tU r0 = r5.A02;
            if (r0 != null) {
                r0.CPj(fArr);
            }
            long j = r5.A00;
            if (j != C79.A00()) {
                float[] fArr2 = A0P;
                C05040Qd.A04(fArr2);
                C05040Qd.A05(fArr2, AnonymousClass000.A02(j), (float) AnonymousClass000.A0H(j));
                C05040Qd.A06(fArr, fArr2);
            }
            r5 = r5.A09;
            C18070vi.A0b(r5);
        }
    }

    public abstract AnonymousClass0XW A0r();

    public abstract C01880Ag A0v();

    public final void A16() {
        this.A0F = true;
        this.A0H.invoke();
        if (this.A02 != null) {
            A1J((C22821Di) null, false);
        }
    }

    public abstract void A17();

    public abstract void A1B(C16960tV r1);

    public final void A1F(C06850Zx r14, C16720su r15, long j, boolean z, boolean z2) {
        int i;
        AnonymousClass0XW A032;
        float A0m;
        C16720su r7 = r15;
        boolean z3 = z2;
        if (((AnonymousClass0XX) r7).A00 != 0) {
            i = 8;
        } else {
            i = 16;
        }
        boolean A1O = AnonymousClass000.A1O(128 & i);
        AnonymousClass0XW A0r = A0r();
        if (A1O || (A0r = A0r.A04) != null) {
            A032 = A03(A1O);
            while (true) {
                if (A032 != null && (A032.A00 & i) != 0) {
                    if ((A032.A01 & i) == 0) {
                        if (A032 == A0r) {
                            break;
                        }
                        A032 = A032.A02;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        A032 = null;
        long j2 = j;
        C06850Zx r6 = r14;
        boolean z4 = z;
        if (!A1N(j2)) {
            if (z) {
                A0m = A0m(j2, A0n());
                if (!Float.isInfinite(A0m) && !Float.isNaN(A0m) && r14.A0F(A0m, false)) {
                    z3 = false;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (A032 == null) {
            A1E(r14, r15, j2, z4, z3);
            return;
        } else {
            float A012 = AnonymousClass0QY.A01(j2);
            float A022 = AnonymousClass0QY.A02(j2);
            if (A012 < 0.0f || A022 < 0.0f || A012 >= ((float) A0W()) || A022 >= ((float) A0V())) {
                if (!z) {
                    A0m = Float.POSITIVE_INFINITY;
                } else {
                    A0m = A0m(j2, A0n());
                }
                if (Float.isInfinite(A0m) || Float.isNaN(A0m) || !r14.A0F(A0m, z3)) {
                    A0D(A032, r6, r7, A0m, j2, z4, z3);
                    return;
                }
            } else {
                A0E(A032, r14, r15, j2, z4, z3);
                return;
            }
        }
        A0C(A032, r6, r7, A0m, j2, z4, z3);
    }

    public final boolean A1M() {
        AnonymousClass0XW A032 = A03(false);
        if (A032 != null && A032.A07) {
            AnonymousClass0XW r6 = A032.A03;
            if (!r6.A07) {
                throw AnonymousClass000.A0n("visitLocalDescendants called on an unattached node");
            } else if ((r6.A00 & 16) != 0) {
                while (true) {
                    r6 = r6.A02;
                    if (r6 == null) {
                        break;
                    } else if ((r6.A01 & 16) != 0) {
                        C06970a9 r5 = null;
                        AnonymousClass0XW r4 = r6;
                        do {
                            if (r4 instanceof C17690v4) {
                                if (((C17690v4) r4).CLc()) {
                                    return true;
                                }
                            } else if ((r4.A01 & 16) != 0 && (r4 instanceof C014308l)) {
                                int i = 0;
                                for (AnonymousClass0XW r2 = ((C014308l) r4).A00; r2 != null; r2 = r2.A02) {
                                    if ((r2.A01 & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            r4 = r2;
                                        } else {
                                            r5 = AnonymousClass001.A10(r5);
                                            r4 = AnonymousClass000.A0d(r5, r4);
                                            r5.A0F(r2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                    continue;
                                }
                            }
                            r4 = AnonymousClass0QV.A00(r5);
                            continue;
                        } while (r4 != null);
                    }
                }
            }
        }
        return false;
    }

    private final long A01(C01850Ad r3, long j) {
        if (r3 == this) {
            return j;
        }
        C01850Ad r1 = this.A09;
        if (r1 == null || C18070vi.A18(r3, r1)) {
            return A0o(j);
        }
        return A0o(r1.A01(r3, j));
    }

    /* access modifiers changed from: private */
    public final AnonymousClass0XW A03(boolean z) {
        AnonymousClass0XW A0r;
        AnonymousClass0XV r1 = this.A0G;
        if (r1.A0K() == this) {
            return r1.A0S.A01;
        }
        C01850Ad r0 = this.A09;
        if (z) {
            if (r0 == null || (A0r = r0.A0r()) == null) {
                return null;
            }
            return A0r.A02;
        } else if (r0 != null) {
            return r0.A0r();
        } else {
            return null;
        }
    }

    public static final C01850Ad A09(C16910tQ r1) {
        C05980Wm r0;
        C01850Ad A022;
        if ((r1 instanceof C05980Wm) && (r0 = (C05980Wm) r1) != null && (A022 = r0.A02()) != null) {
            return A022;
        }
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (C01850Ad) r1;
    }

    /* access modifiers changed from: private */
    public final void A0D(AnonymousClass0XW r17, C06850Zx r18, C16720su r19, float f, long j, boolean z, boolean z2) {
        int i;
        AnonymousClass0XW r7 = r17;
        C06850Zx r8 = r18;
        C16720su r9 = r19;
        long j2 = j;
        boolean z3 = z;
        boolean z4 = z2;
        if (r17 == null) {
            A1E(r8, r9, j2, z3, z4);
            return;
        }
        AnonymousClass0XW r6 = r7;
        int i2 = ((AnonymousClass0XX) r9).A00;
        float f2 = f;
        if (i2 == 0) {
            C06970a9 r4 = null;
            do {
                if (r6 instanceof C17690v4) {
                    if (((C17690v4) r6).Bdj()) {
                        r8.A0C(r7, new C08430f5(r7, r8, r9, this, f2, j2, z3, z4), f2, z4);
                        return;
                    }
                } else if ((r6.A01 & 16) != 0 && (r6 instanceof C014308l)) {
                    int i3 = 0;
                    for (AnonymousClass0XW r2 = ((C014308l) r6).A00; r2 != null; r2 = r2.A02) {
                        if ((r2.A01 & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                r6 = r2;
                            } else {
                                r4 = AnonymousClass001.A10(r4);
                                r6 = AnonymousClass000.A0d(r4, r6);
                                r4.A0F(r2);
                            }
                        }
                    }
                    if (i3 == 1) {
                        continue;
                    }
                }
                r6 = AnonymousClass0QV.A00(r4);
                continue;
            } while (r6 != null);
        }
        if (i2 != 0) {
            i = 8;
        } else {
            i = 16;
        }
        A0D(AnonymousClass0F6.A00(r7, i), r8, r9, f2, j2, z3, z4);
    }

    private final void A0I(C02100Cs r8, C01850Ad r9, boolean z) {
        if (r9 != this) {
            C01850Ad r0 = this.A09;
            if (r0 != null) {
                r0.A0I(r8, r9, z);
            }
            long j = this.A00;
            float A0G2 = (float) AnonymousClass000.A0G(j);
            r8.A01 -= A0G2;
            r8.A02 -= A0G2;
            float f = (float) ((int) (j & 4294967295L));
            r8.A03 -= f;
            r8.A00 -= f;
            C16950tU r1 = this.A02;
            if (r1 != null) {
                r1.Bij(r8, true);
                if (this.A03 && z) {
                    long j2 = this.A03;
                    r8.A00(0.0f, 0.0f, AnonymousClass000.A02(j2), (float) ((int) (j2 & 4294967295L)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void A0R(boolean z) {
        C17140to r0;
        C16950tU r6 = this.A02;
        if (r6 != null) {
            C22821Di r5 = this.A0D;
            if (r5 != null) {
                AnonymousClass0WP r4 = A0J;
                r4.A06();
                AnonymousClass0XV r3 = this.A0G;
                r4.A07(r3.A0M());
                long j = AnonymousClass0QG.A02;
                AnonymousClass0O0.A00(r3).getSnapshotObserver().A08(this, new C08570fJ(r5), A0O);
                AnonymousClass0IY r02 = this.A07;
                if (r02 == null) {
                    r02 = new AnonymousClass0IY();
                    this.A07 = r02;
                }
                r02.A00(r4);
                r6.CQp(r4, r3.A0M(), r3.A0N());
                this.A03 = r4.A08();
                this.A04 = r4.A00();
                if (z && (r0 = r3.A08) != null) {
                    r0.BwZ(r3);
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0n("updateLayerParameters requires a non-null layerBlock");
        } else if (this.A0D != null) {
            throw AnonymousClass000.A0n("null layer with a non-null layerBlock");
        }
    }

    public C16820tH A0c() {
        C16820tH r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0n("Asking for measurement result of unmeasured layout modifier");
    }

    public void A0f() {
        long j = this.A00;
        A0Z(this.A0D, this.A05, j);
    }

    public boolean A0k() {
        return AnonymousClass000.A1W(this.A06);
    }

    public final long A0n() {
        return this.A0A.CPT(this.A0G.A09.BV0());
    }

    public long A0o(long j) {
        long j2 = this.A00;
        long A0p = AnonymousClass001.A0p(AnonymousClass0QY.A01(j) - AnonymousClass000.A02(j2), AnonymousClass0QY.A02(j) - ((float) AnonymousClass000.A0H(j2)));
        C16950tU r1 = this.A02;
        if (r1 != null) {
            return r1.Bik(A0p, true);
        }
        return A0p;
    }

    public long A0p(long j) {
        C16950tU r1 = this.A02;
        if (r1 != null) {
            j = r1.Bik(j, false);
        }
        long j2 = this.A00;
        return AnonymousClass001.A0p(AnonymousClass0QY.A01(j) + AnonymousClass000.A02(j2), AnonymousClass0QY.A02(j) + ((float) AnonymousClass000.A0H(j2)));
    }

    public AnonymousClass0AK A0u() {
        return this.A0G.A0Q.A0G;
    }

    public final C01850Ad A0y(C01850Ad r7) {
        AnonymousClass0XV r5 = r7.A0G;
        AnonymousClass0XV r4 = r5;
        AnonymousClass0XV r3 = this.A0G;
        AnonymousClass0XV r2 = r3;
        if (r5 == r3) {
            AnonymousClass0XW A0r = r7.A0r();
            AnonymousClass0XW r1 = A0r().A03;
            if (!r1.A07) {
                throw AnonymousClass000.A0n("visitLocalAncestors called on an unattached node");
            }
            while (true) {
                r1 = r1.A04;
                if (r1 != null) {
                    if ((r1.A01 & 2) != 0 && r1 == A0r) {
                        break;
                    }
                } else {
                    return this;
                }
            }
        } else {
            while (r5.A00 > r3.A00) {
                r5 = r5.A0I();
                C18070vi.A0b(r5);
            }
            while (r3.A00 > r5.A00) {
                r3 = r3.A0I();
                C18070vi.A0b(r3);
            }
            while (r5 != r3) {
                r5 = r5.A0I();
                r3 = r3.A0I();
                if (r5 != null) {
                    if (r3 == null) {
                    }
                }
                throw AnonymousClass000.A0k("layouts are not part of the same hierarchy");
            }
            if (r3 == r2) {
                return this;
            }
            if (r5 != r4) {
                return r5.A0H();
            }
        }
        return r7;
    }

    public void A10() {
        C16950tU r0 = this.A02;
        if (r0 != null) {
            r0.invalidate();
            return;
        }
        C01850Ad r02 = this.A09;
        if (r02 != null) {
            r02.A10();
        }
    }

    public void A11() {
        C16950tU r0 = this.A02;
        if (r0 != null) {
            r0.invalidate();
        }
    }

    public final void A12() {
        C04700Ok r3 = this.A0G.A0Q;
        Integer num = r3.A0F.A0Q.A05;
        if (num == AnonymousClass00R.A0C || num == AnonymousClass00R.A0N) {
            if (r3.A0G.A0A) {
                r3.A08(true);
            } else {
                r3.A07(true);
            }
        }
        if (num == AnonymousClass00R.A0N) {
            AnonymousClass0AL r0 = r3.A04;
            if (r0 == null || !r0.A06) {
                r3.A07(true);
            } else {
                r3.A08(true);
            }
        }
    }

    public final void A13() {
        A1J(this.A0D, true);
        C16950tU r0 = this.A02;
        if (r0 != null) {
            r0.invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        if (r2 == 1) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A14() {
        /*
            r12 = this;
            r11 = 128(0x80, float:1.794E-43)
            r0 = 1
            X.0XW r0 = r12.A03(r0)
            if (r0 == 0) goto L_0x008a
            X.0XW r0 = r0.A03
            int r0 = r0.A00
            r0 = r0 & r11
            if (r0 == 0) goto L_0x008a
            androidx.compose.runtime.snapshots.Snapshot r10 = X.C04790Ov.A00()
            androidx.compose.runtime.snapshots.Snapshot r9 = r10.A02()     // Catch:{ all -> 0x0082 }
            X.0XW r8 = r12.A0r()     // Catch:{ all -> 0x007d }
            r0 = 1
            X.0XW r7 = r12.A03(r0)     // Catch:{ all -> 0x007d }
        L_0x0021:
            if (r7 == 0) goto L_0x0079
            int r0 = r7.A00     // Catch:{ all -> 0x007d }
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0079
            int r0 = r7.A01     // Catch:{ all -> 0x007d }
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0074
            r6 = 0
            r5 = r7
            r4 = r6
        L_0x0030:
            boolean r0 = r5 instanceof X.C17650v0     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0040
            X.0v0 r5 = (X.C17650v0) r5     // Catch:{ all -> 0x007d }
            long r0 = r12.A03     // Catch:{ all -> 0x007d }
            r5.C2y(r0)     // Catch:{ all -> 0x007d }
        L_0x003b:
            X.0XW r5 = X.AnonymousClass0QV.A00(r4)     // Catch:{ all -> 0x007d }
            goto L_0x0071
        L_0x0040:
            int r0 = r5.A01     // Catch:{ all -> 0x007d }
            r0 = r0 & r11
            if (r0 == 0) goto L_0x003b
            boolean r0 = r5 instanceof X.C014308l     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x003b
            r0 = r5
            X.08l r0 = (X.C014308l) r0     // Catch:{ all -> 0x007d }
            X.0XW r3 = r0.A00     // Catch:{ all -> 0x007d }
            r2 = 0
        L_0x004f:
            r1 = 1
            if (r3 == 0) goto L_0x006f
            int r0 = r3.A01     // Catch:{ all -> 0x007d }
            r0 = r0 & r11
            if (r0 == 0) goto L_0x006c
            int r2 = r2 + 1
            if (r2 != r1) goto L_0x005d
            r5 = r3
            goto L_0x006c
        L_0x005d:
            if (r4 != 0) goto L_0x0063
            X.0a9 r4 = X.C06970a9.A01()     // Catch:{ all -> 0x007d }
        L_0x0063:
            if (r5 == 0) goto L_0x0069
            r4.A0F(r5)     // Catch:{ all -> 0x007d }
            r5 = r6
        L_0x0069:
            r4.A0F(r3)     // Catch:{ all -> 0x007d }
        L_0x006c:
            X.0XW r3 = r3.A02     // Catch:{ all -> 0x007d }
            goto L_0x004f
        L_0x006f:
            if (r2 != r1) goto L_0x003b
        L_0x0071:
            if (r5 == 0) goto L_0x0074
            goto L_0x0030
        L_0x0074:
            if (r7 == r8) goto L_0x0079
            X.0XW r7 = r7.A02     // Catch:{ all -> 0x007d }
            goto L_0x0021
        L_0x0079:
            X.AnonymousClass0N4.A00(r9)     // Catch:{ all -> 0x0082 }
            goto L_0x0087
        L_0x007d:
            r0 = move-exception
            X.AnonymousClass0N4.A00(r9)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            r10.A0D()
            throw r0
        L_0x0087:
            r10.A0D()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01850Ad.A14():void");
    }

    public final void A15() {
        AnonymousClass0XW A0r = A0r();
        AnonymousClass0XW A032 = A03(true);
        while (A032 != null && (A032.A00 & 128) != 0) {
            if ((A032.A01 & 128) != 0) {
                C06970a9 r5 = null;
                AnonymousClass0XW r4 = A032;
                do {
                    if (r4 instanceof C17650v0) {
                        ((C17650v0) r4).C0g(this);
                    } else if ((r4.A01 & 128) != 0 && (r4 instanceof C014308l)) {
                        int i = 0;
                        for (AnonymousClass0XW r3 = ((C014308l) r4).A00; r3 != null; r3 = r3.A02) {
                            if ((r3.A01 & 128) != 0) {
                                i++;
                                if (i == 1) {
                                    r4 = r3;
                                } else {
                                    r5 = AnonymousClass001.A0z(r5);
                                    r4 = AnonymousClass000.A0d(r5, r4);
                                    r5.A0F(r3);
                                }
                            }
                        }
                        if (i == 1) {
                            continue;
                        }
                    }
                    r4 = AnonymousClass0QV.A00(r5);
                    continue;
                } while (r4 != null);
            }
            if (A032 != A0r) {
                A032 = A032.A02;
            } else {
                return;
            }
        }
    }

    public void A18(int i, int i2) {
        C16950tU r2 = this.A02;
        if (r2 != null) {
            r2.CFr(C25293Ccv.A00(i, i2));
        } else {
            C01850Ad r0 = this.A09;
            if (r0 != null) {
                r0.A10();
            }
        }
        A0Y(C25293Ccv.A00(i, i2));
        A0R(false);
        AnonymousClass0XW r7 = A0r().A04;
        if (r7 != null) {
            AnonymousClass0XW A032 = A03(false);
            while (A032 != null && (A032.A00 & 4) != 0) {
                if ((A032.A01 & 4) != 0) {
                    C06970a9 r5 = null;
                    AnonymousClass0XW r4 = A032;
                    do {
                        if (r4 instanceof C17640uz) {
                            ((C17640uz) r4).Bxi();
                        } else if ((r4.A01 & 4) != 0 && (r4 instanceof C014308l)) {
                            int i3 = 0;
                            for (AnonymousClass0XW r3 = ((C014308l) r4).A00; r3 != null; r3 = r3.A02) {
                                if ((r3.A01 & 4) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        r4 = r3;
                                    } else {
                                        r5 = AnonymousClass001.A0z(r5);
                                        r4 = AnonymousClass000.A0d(r5, r4);
                                        r5.A0F(r3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                                continue;
                            }
                        }
                        r4 = AnonymousClass0QV.A00(r5);
                        continue;
                    } while (r4 != null);
                }
                if (A032 == r7) {
                    break;
                }
                A032 = A032.A02;
            }
        }
        AnonymousClass0XV r1 = this.A0G;
        C17140to r02 = r1.A08;
        if (r02 != null) {
            r02.BwZ(r1);
        }
    }

    public final void A19(C02100Cs r10, boolean z, boolean z2) {
        C16950tU r3 = this.A02;
        if (r3 != null) {
            if (this.A03) {
                if (z2) {
                    long A0n = A0n();
                    float A022 = AnonymousClass0QG.A02(A0n) / 2.0f;
                    float A002 = AnonymousClass0QG.A00(A0n) / 2.0f;
                    long j = this.A03;
                    r10.A00(-A022, -A002, AnonymousClass000.A02(j) + A022, ((float) AnonymousClass000.A0H(j)) + A002);
                } else if (z) {
                    long j2 = this.A03;
                    r10.A00(0.0f, 0.0f, AnonymousClass000.A02(j2), (float) AnonymousClass000.A0H(j2));
                }
                if (r10.A01 >= r10.A02 || r10.A03 >= r10.A00) {
                    return;
                }
            }
            r3.Bij(r10, false);
        }
        long j3 = this.A00;
        float A0G2 = (float) AnonymousClass000.A0G(j3);
        r10.A01 += A0G2;
        r10.A02 += A0G2;
        float A0H2 = (float) AnonymousClass000.A0H(j3);
        r10.A03 += A0H2;
        r10.A00 += A0H2;
    }

    public final void A1A(C16960tV r5) {
        C16950tU r0 = this.A02;
        if (r0 != null) {
            r0.BJa(r5);
            return;
        }
        long j = this.A00;
        float A022 = AnonymousClass000.A02(j);
        float A0H2 = (float) AnonymousClass000.A0H(j);
        r5.CPp(A022, A0H2);
        A0J(r5);
        r5.CPp(-A022, -A0H2);
    }

    public final void A1C(C16960tV r8, C16790tE r9) {
        long j = this.A03;
        AnonymousClass0NU r0 = new AnonymousClass0NU(0.5f, 0.5f, AnonymousClass000.A02(j) - 0.5f, ((float) AnonymousClass000.A0H(j)) - 0.5f);
        r8.BJg(r9, 0.5f, 0.5f, r0.A02, r0.A00);
    }

    public void A1D(C16820tH r4) {
        C16820tH r2 = this.A06;
        if (r4 != r2) {
            this.A06 = r4;
            if (!(r2 != null && r4.getWidth() == r2.getWidth() && r4.getHeight() == r2.getHeight())) {
                A18(r4.getWidth(), r4.getHeight());
            }
            Map map = this.A0C;
            if ((map != null && !map.isEmpty()) || (!r4.BMp().isEmpty())) {
                Map BMp = r4.BMp();
                if (!C18070vi.A18(BMp, this.A0C)) {
                    this.A0G.A0Q.A0G.A0L.A05();
                    Map map2 = this.A0C;
                    if (map2 == null) {
                        map2 = new LinkedHashMap();
                        this.A0C = map2;
                    }
                    map2.clear();
                    map2.putAll(BMp);
                }
            }
        }
    }

    public void A1E(C06850Zx r8, C16720su r9, long j, boolean z, boolean z2) {
        C01850Ad r0 = this.A08;
        if (r0 != null) {
            r0.A1F(r8, r9, r0.A0o(j), z, z2);
        }
    }

    public final void A1I(C22821Di r4, float f, long j) {
        long j2 = this.A02;
        A0Q(r4, f, C7A.A00(AnonymousClass001.A0M(j, j2), AnonymousClass001.A0L(j, j2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r5.A0B != r3.A0N()) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1J(X.C22821Di r6, boolean r7) {
        /*
            r5 = this;
            X.0XV r3 = r5.A0G
            r2 = 0
            if (r7 != 0) goto L_0x001e
            X.1Di r0 = r5.A0D
            if (r0 != r6) goto L_0x001e
            X.ECa r1 = r5.A0A
            X.ECa r0 = r3.A0M()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x001e
            X.By4 r1 = r5.A0B
            X.By4 r0 = r3.A0N()
            r4 = 0
            if (r1 == r0) goto L_0x001f
        L_0x001e:
            r4 = 1
        L_0x001f:
            r5.A0D = r6
            X.ECa r0 = r3.A0M()
            r5.A0A = r0
            X.By4 r0 = r3.A0N()
            r5.A0B = r0
            X.0to r0 = r3.A08
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0065
            if (r6 == 0) goto L_0x0065
            X.0tU r0 = r5.A02
            if (r0 != 0) goto L_0x005e
            X.0to r1 = X.AnonymousClass0O0.A00(r3)
            X.1Di r0 = r5.A0I
            X.0vk r4 = r5.A0H
            X.0tU r2 = r1.BHU(r4, r0)
            long r0 = r5.A03
            r2.CFr(r0)
            long r0 = r5.A00
            r2.Bk4(r0)
            r5.A02 = r2
            r0 = 1
            r5.A0R(r0)
            r3.A0D = r0
            r4.invoke()
        L_0x005d:
            return
        L_0x005e:
            if (r4 == 0) goto L_0x005d
            r0 = 1
            r5.A0R(r0)
            return
        L_0x0065:
            X.0tU r0 = r5.A02
            if (r0 == 0) goto L_0x0083
            r0.destroy()
            r0 = 1
            r3.A0D = r0
            X.0vk r0 = r5.A0H
            r0.invoke()
            X.0XW r0 = r5.A0r()
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0083
            X.0to r0 = r3.A08
            if (r0 == 0) goto L_0x0083
            r0.BwZ(r3)
        L_0x0083:
            r5.A02 = r1
            r5.A0E = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01850Ad.A1J(X.1Di, boolean):void");
    }

    public final boolean A1L() {
        if (this.A02 != null && this.A04 <= 0.0f) {
            return true;
        }
        C01850Ad r0 = this.A09;
        if (r0 != null) {
            return r0.A1L();
        }
        return false;
    }

    public float BQU() {
        return this.A0G.A0M().BQU();
    }

    public float BRu() {
        return this.A0G.A0M().BRu();
    }

    public Object BWC() {
        AnonymousClass0QR r2 = this.A0G.A0S;
        if (!AnonymousClass000.A1O(64 & r2.A01.A00)) {
            return null;
        }
        C98494rF r6 = new C98494rF();
        for (AnonymousClass0XW r5 = r2.A05; r5 != null; r5 = r5.A04) {
            if ((r5.A01 & 64) != 0) {
                C06970a9 r4 = null;
                AnonymousClass0XW r7 = r5;
                do {
                    if (r7 instanceof C17620ux) {
                        r6.element = ((C17620ux) r7).Bk2(r6.element);
                    } else if ((r7.A01 & 64) != 0 && (r7 instanceof C014308l)) {
                        int i = 0;
                        for (AnonymousClass0XW r3 = ((C014308l) r7).A00; r3 != null; r3 = r3.A02) {
                            if ((r3.A01 & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    r7 = r3;
                                } else {
                                    r4 = AnonymousClass001.A0z(r4);
                                    r7 = AnonymousClass000.A0d(r4, r7);
                                    r4.A0F(r3);
                                }
                            }
                        }
                        if (i == 1) {
                            continue;
                        }
                    }
                    r7 = AnonymousClass0QV.A00(r4);
                    continue;
                } while (r7 != null);
            }
        }
        return r6.element;
    }

    public boolean Bgy() {
        if (this.A02 == null || this.A0F || this.A0G.A08 == null) {
            return false;
        }
        return true;
    }

    public long Bht(C16910tQ r5, long j) {
        if (r5 instanceof C05980Wm) {
            long Bht = r5.Bht(this, AnonymousClass001.A0p(-AnonymousClass0QY.A01(j), -AnonymousClass0QY.A02(j)));
            return AnonymousClass001.A0p(-AnonymousClass0QY.A01(Bht), -AnonymousClass0QY.A02(Bht));
        }
        C01850Ad A092 = A09(r5);
        A092.A12();
        C01850Ad A0y = A0y(A092);
        while (A092 != A0y) {
            j = A092.A0p(j);
            A092 = A092.A09;
            C18070vi.A0b(A092);
        }
        return A01(A0y, j);
    }

    public C24246By4 getLayoutDirection() {
        return this.A0G.A0N();
    }

    public C01850Ad(AnonymousClass0XV r3) {
        this.A0G = r3;
        this.A0A = r3.A0M();
        this.A0B = r3.A0N();
    }

    private final void A0O(C01850Ad r6, float[] fArr) {
        if (!C18070vi.A18(r6, this)) {
            C01850Ad r0 = this.A09;
            C18070vi.A0b(r0);
            r0.A0O(r6, fArr);
            long j = this.A00;
            if (j != C79.A00()) {
                float[] fArr2 = A0P;
                C05040Qd.A04(fArr2);
                C05040Qd.A05(fArr2, -AnonymousClass000.A02(j), -((float) AnonymousClass000.A0H(j)));
                C05040Qd.A06(fArr, fArr2);
            }
            C16950tU r02 = this.A02;
            if (r02 != null) {
                r02.Bdn(fArr);
            }
        }
    }

    private final void A0Q(C22821Di r4, float f, long j) {
        A1J(r4, false);
        if (this.A00 != j) {
            this.A00 = j;
            AnonymousClass0XV r1 = this.A0G;
            r1.A0Q.A0G.A0d();
            C16950tU r0 = this.A02;
            if (r0 != null) {
                r0.Bk4(j);
            } else {
                C01850Ad r02 = this.A09;
                if (r02 != null) {
                    r02.A10();
                }
            }
            AnonymousClass0AM.A00(this);
            C17140to r03 = r1.A08;
            if (r03 != null) {
                r03.BwZ(r1);
            }
        }
        this.A05 = f;
    }

    public long A0b() {
        return this.A00;
    }

    public AnonymousClass0AM A0e() {
        return this.A08;
    }

    public final float A0l() {
        return this.A05;
    }

    public final float A0m(long j, long j2) {
        float A0W;
        float A0V;
        if (((float) A0W()) < AnonymousClass0QG.A02(j2) || ((float) A0V()) < AnonymousClass0QG.A00(j2)) {
            long A0q = A0q(j2);
            float A022 = AnonymousClass0QG.A02(A0q);
            float A002 = AnonymousClass0QG.A00(A0q);
            float A012 = AnonymousClass0QY.A01(j);
            if (A012 < 0.0f) {
                A0W = -A012;
            } else {
                A0W = A012 - ((float) A0W());
            }
            float max = Math.max(0.0f, A0W);
            float A023 = AnonymousClass0QY.A02(j);
            if (A023 < 0.0f) {
                A0V = -A023;
            } else {
                A0V = A023 - ((float) A0V());
            }
            long A0p = AnonymousClass001.A0p(max, Math.max(0.0f, A0V));
            if ((A022 > 0.0f || A002 > 0.0f) && AnonymousClass0QY.A01(A0p) <= A022 && AnonymousClass0QY.A02(A0p) <= A002) {
                return (AnonymousClass0QY.A01(A0p) * AnonymousClass0QY.A01(A0p)) + (AnonymousClass0QY.A02(A0p) * AnonymousClass0QY.A02(A0p));
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final long A0q(long j) {
        return AnonymousClass001.A0p(Math.max(0.0f, (AnonymousClass0QG.A02(j) - ((float) A0W())) / 2.0f), Math.max(0.0f, (AnonymousClass0QG.A00(j) - ((float) A0V())) / 2.0f));
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [X.0Cs, java.lang.Object] */
    public final AnonymousClass0NU A0s() {
        if (A0r().A07) {
            C16910tQ A012 = AnonymousClass0LN.A01(this);
            C02100Cs r4 = this.A01;
            C02100Cs r42 = r4;
            if (r4 == null) {
                ? obj = new Object();
                obj.A01 = 0.0f;
                obj.A03 = 0.0f;
                obj.A02 = 0.0f;
                obj.A00 = 0.0f;
                this.A01 = obj;
                r42 = obj;
            }
            long A0q = A0q(A0n());
            r42.A01 = -AnonymousClass0QG.A02(A0q);
            r42.A03 = -AnonymousClass0QG.A00(A0q);
            r42.A02 = ((float) A0W()) + AnonymousClass0QG.A02(A0q);
            r42.A00 = ((float) A0V()) + AnonymousClass0QG.A00(A0q);
            C01850Ad r2 = this;
            while (r2 != A012) {
                r2.A19(r42, false, true);
                if (r42.A01 < r42.A02 && r42.A03 < r42.A00) {
                    r2 = r2.A09;
                    C18070vi.A0b(r2);
                }
            }
            return new AnonymousClass0NU(r42.A01, r42.A03, r42.A02, r42.A00);
        }
        return AnonymousClass0NU.A04;
    }

    public AnonymousClass0XV A0t() {
        return this.A0G;
    }

    public final C01850Ad A0w() {
        return this.A08;
    }

    public final C01850Ad A0x() {
        return this.A09;
    }

    public final C16950tU A0z() {
        return this.A02;
    }

    public final boolean A1K() {
        return this.A0E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (java.lang.Float.isNaN(r1) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1N(long r4) {
        /*
            r3 = this;
            float r1 = X.AnonymousClass0QY.A01(r4)
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L_0x0021
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0021
            float r1 = X.AnonymousClass0QY.A02(r4)
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L_0x0021
            boolean r1 = java.lang.Float.isNaN(r1)
            r0 = 1
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r2 = 0
            if (r0 == 0) goto L_0x0034
            X.0tU r1 = r3.A02
            if (r1 == 0) goto L_0x0033
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0033
            boolean r0 = r1.Bez(r4)
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01850Ad.A1N(long):boolean");
    }

    public final C16910tQ BWE() {
        if (A0r().A07) {
            A12();
            return this.A0G.A0K().A09;
        }
        throw AnonymousClass000.A0n("LayoutCoordinate operations are only valid when isAttached is true");
    }

    public final long BZM() {
        return this.A03;
    }

    public boolean Be8() {
        return A0r().A07;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [X.0Cs, java.lang.Object] */
    public AnonymousClass0NU Bhs(C16910tQ r8, boolean z) {
        if (!A0r().A07) {
            throw AnonymousClass000.A0n("LayoutCoordinate operations are only valid when isAttached is true");
        } else if (r8.Be8()) {
            C01850Ad A092 = A09(r8);
            A092.A12();
            C01850Ad A0y = A0y(A092);
            C02100Cs r4 = this.A01;
            C02100Cs r42 = r4;
            if (r4 == null) {
                ? obj = new Object();
                obj.A01 = 0.0f;
                obj.A03 = 0.0f;
                obj.A02 = 0.0f;
                obj.A00 = 0.0f;
                this.A01 = obj;
                r42 = obj;
            }
            r42.A01 = 0.0f;
            r42.A03 = 0.0f;
            long BZM = r8.BZM();
            r42.A02 = AnonymousClass000.A02(BZM);
            r42.A00 = (float) AnonymousClass000.A0H(BZM);
            while (A092 != A0y) {
                A092.A19(r42, z, false);
                if (r42.A01 >= r42.A02 || r42.A03 >= r42.A00) {
                    return AnonymousClass0NU.A04;
                }
                A092 = A092.A09;
                C18070vi.A0b(A092);
            }
            A0I(r42, A0y, z);
            return new AnonymousClass0NU(r42.A01, r42.A03, r42.A02, r42.A00);
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("LayoutCoordinates ");
            A10.append(r8);
            throw AnonymousClass000.A0o(" is not attached!", A10);
        }
    }

    public long Bhu(long j) {
        if (A0r().A07) {
            A12();
            C01850Ad r0 = this;
            do {
                j = r0.A0p(j);
                r0 = r0.A09;
            } while (r0 != null);
            return j;
        }
        throw AnonymousClass000.A0n("LayoutCoordinate operations are only valid when isAttached is true");
    }

    public long Bhw(long j) {
        return AnonymousClass0O0.A00(this.A0G).BDv(Bhu(j));
    }

    public void CPm(C16910tQ r3, float[] fArr) {
        C01850Ad A092 = A09(r3);
        A092.A12();
        C01850Ad A0y = A0y(A092);
        C05040Qd.A04(fArr);
        A092.A0P(A0y, fArr);
        A0O(A0y, fArr);
    }

    public long CSD(long j) {
        if (A0r().A07) {
            C16910tQ A012 = AnonymousClass0LN.A01(this);
            return Bht(A012, AnonymousClass0QY.A04(AnonymousClass0O0.A00(this.A0G).BDq(j), A012.Bhu(AnonymousClass0QY.A03)));
        }
        throw AnonymousClass000.A0n("LayoutCoordinate operations are only valid when isAttached is true");
    }

    public final void A1G(C01850Ad r1) {
        this.A08 = r1;
    }

    public final void A1H(C01850Ad r1) {
        this.A09 = r1;
    }

    public void A0Z(C22821Di r1, float f, long j) {
        A0Q(r1, f, j);
    }
}
