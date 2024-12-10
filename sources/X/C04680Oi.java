package X;

import java.util.HashMap;
import java.util.Set;

/* renamed from: X.0Oi  reason: invalid class name and case insensitive filesystem */
public final class C04680Oi {
    public int A00 = -1;
    public int A01;
    public AnonymousClass06z A02;
    public Object A03;
    public final AnonymousClass070 A04;
    public final AnonymousClass0JH A05;
    public final AnonymousClass0JH A06 = new AnonymousClass0JH();
    public final HashMap A07;
    public final AnonymousClass071 A08;
    public final C16650sm A09;
    public final C06970a9 A0A;
    public final C22821Di A0B;

    private final void A00(AnonymousClass06z r20, Object obj, Object obj2, int i) {
        if (this.A01 <= 0) {
            int i2 = -1;
            AnonymousClass06z r2 = r20;
            Object obj3 = obj;
            int A012 = AnonymousClass06z.A01(r2, obj3);
            if (A012 < 0) {
                A012 ^= -1;
            } else {
                i2 = r2.A02[A012];
            }
            r2.A04[A012] = obj;
            int[] iArr = r2.A02;
            int i3 = i;
            iArr[A012] = i;
            if ((obj3 instanceof C17320uT) && i2 != i3) {
                C013808g BQ0 = ((C17320uT) obj3).BQ0();
                this.A07.put(obj3, BQ0.A04);
                AnonymousClass0KU r0 = BQ0.A03;
                AnonymousClass0JH r11 = this.A05;
                r11.A00(obj3);
                Object[] objArr = r0.A04;
                long[] jArr = r0.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int A0F = AnonymousClass000.A0F(i4, length);
                            for (int i5 = 0; i5 < A0F; i5++) {
                                if ((j & 255) < 128) {
                                    AnonymousClass0t4 r1 = (AnonymousClass0t4) AnonymousClass000.A0x(objArr, i4, i5);
                                    if (r1 instanceof AnonymousClass0W5) {
                                        ((AnonymousClass0W5) r1).A02(2);
                                    }
                                    r11.A01(r1, obj3);
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
                    }
                }
            }
            if (i2 == -1) {
                if (obj3 instanceof AnonymousClass0W5) {
                    ((AnonymousClass0W5) obj3).A02(2);
                }
                this.A06.A01(obj3, obj2);
            }
        }
    }

    public static void A01(AnonymousClass071 r1, Object[] objArr, int i, int i2) {
        r1.A08(objArr[(i << 3) + i2]);
    }

    public final void A03() {
        AnonymousClass071 r13 = this.A08;
        C22821Di r12 = this.A0B;
        Object[] objArr = r13.A03;
        long[] jArr = r13.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int A0D = 8 - AnonymousClass000.A0D(i, length);
                    for (int i2 = 0; i2 < A0D; i2++) {
                        if ((255 & j) < 128) {
                            r12.invoke(AnonymousClass000.A0x(objArr, i, i2));
                        }
                        j >>= 8;
                    }
                    if (A0D != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        r13.A06();
    }

    public final void A04(Object obj) {
        Object obj2 = this.A03;
        C18070vi.A0b(obj2);
        int i = this.A00;
        AnonymousClass06z r1 = this.A02;
        if (r1 == null) {
            r1 = AnonymousClass06z.A02();
            this.A02 = r1;
            this.A04.A08(obj2, r1);
        }
        A00(r1, obj, obj2, i);
    }

    /* JADX INFO: finally extract failed */
    public final void A05(Object obj, C18090vk r22, C22821Di r23) {
        Object obj2 = this.A03;
        AnonymousClass06z r13 = this.A02;
        int i = this.A00;
        Object obj3 = obj;
        this.A03 = obj3;
        this.A02 = (AnonymousClass06z) this.A04.A02(obj3);
        if (this.A00 == -1) {
            this.A00 = C05200Qx.A01().A04();
        }
        C16650sm r0 = this.A09;
        C06970a9 A022 = AnonymousClass0PF.A02();
        try {
            A022.A0F(r0);
            C04790Ov.A02(r22, r23);
            A022.A06(A022.A00 - 1);
            Object obj4 = this.A03;
            C18070vi.A0b(obj4);
            int i2 = this.A00;
            AnonymousClass06z r9 = this.A02;
            if (r9 != null) {
                long[] jArr = r9.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int A0D = 8 - AnonymousClass000.A0D(i3, length);
                            for (int i4 = 0; i4 < A0D; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i3 << 3) + i4;
                                    Object obj5 = r9.A04[i5];
                                    if (r9.A02[i5] != i2) {
                                        AnonymousClass0JH r15 = this.A06;
                                        r15.A02(obj5, obj4);
                                        if ((obj5 instanceof C17320uT) && !r15.A00.A03(obj5)) {
                                            this.A05.A00(obj5);
                                            this.A07.remove(obj5);
                                        }
                                        r9.A05(i5);
                                    }
                                }
                                j >>= 8;
                            }
                            if (A0D != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            this.A03 = obj2;
            this.A02 = r13;
            this.A00 = i;
        } catch (Throwable th) {
            A022.A06(A022.A00 - 1);
            throw th;
        }
    }

    public final void A06(C22821Di r28) {
        AnonymousClass070 r6 = this.A04;
        long[] jArr = r6.A02;
        long[] jArr2 = jArr;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((AnonymousClass001.A0s(j) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int A0F = AnonymousClass000.A0F(i, length);
                    for (int i2 = 0; i2 < A0F; i2++) {
                        if ((j & 255) < 128) {
                            int i3 = (i << 3) + i2;
                            Object obj = r6.A03[i3];
                            AnonymousClass0KU r1 = (AnonymousClass0KU) r6.A04[i3];
                            if (AnonymousClass000.A1Y(r28.invoke(obj))) {
                                Object[] objArr = r1.A04;
                                long[] jArr3 = r1.A03;
                                int length2 = jArr3.length - 2;
                                if (length2 >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j2 = jArr3[i4];
                                        if ((j2 & AnonymousClass001.A0s(j2) & -9187201950435737472L) != -9187201950435737472L) {
                                            int A0F2 = AnonymousClass000.A0F(i4, length2);
                                            for (int i5 = 0; i5 < A0F2; i5++) {
                                                if ((j2 & 255) < 128) {
                                                    Object A0x = AnonymousClass000.A0x(objArr, i4, i5);
                                                    AnonymousClass0JH r15 = this.A06;
                                                    r15.A02(A0x, obj);
                                                    if ((A0x instanceof C17320uT) && !r15.A00.A03(A0x)) {
                                                        this.A05.A00(A0x);
                                                        this.A07.remove(A0x);
                                                    }
                                                }
                                                j2 >>= 8;
                                            }
                                            if (A0F2 != 8) {
                                                break;
                                            }
                                        }
                                        if (i4 == length2) {
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                                r6.A06(i3);
                            }
                        }
                        j >>= 8;
                    }
                    if (A0F != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean A07(Set set) {
        boolean z;
        Object A022;
        Object A023;
        Set set2 = set;
        AnonymousClass0JH r38 = this.A05;
        HashMap hashMap = this.A07;
        AnonymousClass0JH r2 = this.A06;
        AnonymousClass071 r1 = this.A08;
        long j = -1;
        int i = 2;
        int i2 = 0;
        if (set2 instanceof C06990aB) {
            C06990aB r5 = (C06990aB) set2;
            Object[] A042 = r5.A04();
            int size = r5.size();
            int i3 = 0;
            z = false;
            while (i3 < size) {
                Object obj = A042[i3];
                C18070vi.A0z(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(obj instanceof AnonymousClass0W5) || (((AnonymousClass0W5) obj).A00.get() & 2) != 0) {
                    AnonymousClass070 r52 = r38.A00;
                    if (r52.A03(obj) && (A023 = r52.A02(obj)) != null) {
                        if (A023 instanceof AnonymousClass071) {
                            AnonymousClass0NQ r8 = (AnonymousClass0NQ) A023;
                            Object[] objArr = r8.A03;
                            long[] jArr = r8.A02;
                            long[] jArr2 = jArr;
                            int length = jArr.length - i;
                            if (length >= 0) {
                                int i4 = 0;
                                while (true) {
                                    long j2 = jArr2[i4];
                                    if ((j2 & ((j2 ^ j) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                        int A0F = AnonymousClass000.A0F(i4, length);
                                        for (int i5 = 0; i5 < A0F; i5++) {
                                            if ((j2 & 255) < 128) {
                                                C17320uT r53 = (C17320uT) AnonymousClass000.A0x(objArr, i4, i5);
                                                C18070vi.A0z(r53, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                Object obj2 = hashMap.get(r53);
                                                C16290s1 r12 = ((AnonymousClass08W) r53).A01;
                                                if (r12 == null) {
                                                    r12 = AnonymousClass0Q9.A06();
                                                }
                                                if (!r12.BKT(r53.BQ0().A04, obj2)) {
                                                    Object A024 = r2.A00.A02(r53);
                                                    if (A024 != null) {
                                                        if (A024 instanceof AnonymousClass071) {
                                                            AnonymousClass0NQ r54 = (AnonymousClass0NQ) A024;
                                                            Object[] objArr2 = r54.A03;
                                                            long[] jArr3 = r54.A02;
                                                            int length2 = jArr3.length - 2;
                                                            if (length2 >= 0) {
                                                                int i6 = 0;
                                                                while (true) {
                                                                    long j3 = jArr3[i6];
                                                                    if ((j3 & ((j3 ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                                                        int A0F2 = AnonymousClass000.A0F(i6, length2);
                                                                        for (int i7 = 0; i7 < A0F2; i7++) {
                                                                            if ((j3 & 255) < 128) {
                                                                                A01(r1, objArr2, i6, i7);
                                                                                z = true;
                                                                            }
                                                                            j3 >>= 8;
                                                                        }
                                                                        if (A0F2 != 8) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i6 == length2) {
                                                                        break;
                                                                    }
                                                                    i6++;
                                                                }
                                                            }
                                                        } else {
                                                            r1.A08(A024);
                                                            z = true;
                                                        }
                                                    }
                                                } else {
                                                    this.A0A.A0F(r53);
                                                }
                                            }
                                            j2 >>= 8;
                                        }
                                        if (A0F != 8) {
                                            break;
                                        }
                                    }
                                    if (i4 == length) {
                                        break;
                                    }
                                    i4++;
                                    j = -1;
                                }
                            }
                        } else {
                            C17320uT r82 = (C17320uT) A023;
                            Object obj3 = hashMap.get(r82);
                            C16290s1 r55 = ((AnonymousClass08W) r82).A01;
                            if (r55 == null) {
                                r55 = AnonymousClass0Q9.A06();
                            }
                            if (!r55.BKT(r82.BQ0().A04, obj3)) {
                                Object A025 = r2.A00.A02(r82);
                                if (A025 != null) {
                                    if (A025 instanceof AnonymousClass071) {
                                        AnonymousClass0NQ r56 = (AnonymousClass0NQ) A025;
                                        Object[] objArr3 = r56.A03;
                                        long[] jArr4 = r56.A02;
                                        int length3 = jArr4.length - i;
                                        if (length3 >= 0) {
                                            int i8 = 0;
                                            while (true) {
                                                long j4 = jArr4[i8];
                                                if ((AnonymousClass001.A0s(j4) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                                    int A0F3 = AnonymousClass000.A0F(i8, length3);
                                                    for (int i9 = 0; i9 < A0F3; i9++) {
                                                        if ((j4 & 255) < 128) {
                                                            A01(r1, objArr3, i8, i9);
                                                            z = true;
                                                        }
                                                        j4 >>= 8;
                                                    }
                                                    if (A0F3 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i8 == length3) {
                                                    break;
                                                }
                                                i8++;
                                            }
                                        }
                                    } else {
                                        r1.A08(A025);
                                        z = true;
                                    }
                                }
                            } else {
                                this.A0A.A0F(r82);
                            }
                        }
                    }
                    Object A026 = r2.A00.A02(obj);
                    if (A026 != null) {
                        if (A026 instanceof AnonymousClass071) {
                            AnonymousClass0NQ r57 = (AnonymousClass0NQ) A026;
                            Object[] objArr4 = r57.A03;
                            long[] jArr5 = r57.A02;
                            int length4 = jArr5.length - 2;
                            if (length4 >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j5 = jArr5[i10];
                                    if ((AnonymousClass001.A0s(j5) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                                        int A0F4 = AnonymousClass000.A0F(i10, length4);
                                        for (int i11 = 0; i11 < A0F4; i11++) {
                                            if ((j5 & 255) < 128) {
                                                A01(r1, objArr4, i10, i11);
                                                z = true;
                                            }
                                            j5 >>= 8;
                                        }
                                        if (A0F4 != 8) {
                                            break;
                                        }
                                    }
                                    if (i10 == length4) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            r1.A08(A026);
                            z = true;
                        }
                    }
                }
                i3++;
                j = -1;
                i = 2;
            }
        } else {
            z = false;
            for (Object next : set2) {
                if (!(next instanceof AnonymousClass0W5) || (2 & ((AnonymousClass0W5) next).A00.get()) != 0) {
                    AnonymousClass070 r58 = r38.A00;
                    if (r58.A03(next) && (A022 = r58.A02(next)) != null) {
                        if (A022 instanceof AnonymousClass071) {
                            AnonymousClass0NQ r6 = (AnonymousClass0NQ) A022;
                            Object[] objArr5 = r6.A03;
                            long[] jArr6 = r6.A02;
                            int length5 = jArr6.length - 2;
                            if (length5 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j6 = jArr6[i12];
                                    if ((AnonymousClass001.A0s(j6) & j6 & -9187201950435737472L) != -9187201950435737472L) {
                                        int A0F5 = AnonymousClass000.A0F(i12, length5);
                                        for (int i13 = 0; i13 < A0F5; i13++) {
                                            if ((j6 & 255) < 128) {
                                                C17320uT r59 = (C17320uT) AnonymousClass000.A0x(objArr5, i12, i13);
                                                C18070vi.A0z(r59, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                Object obj4 = hashMap.get(r59);
                                                C16290s1 r62 = ((AnonymousClass08W) r59).A01;
                                                if (r62 == null) {
                                                    r62 = AnonymousClass0Q9.A06();
                                                }
                                                if (!r62.BKT(r59.BQ0().A04, obj4)) {
                                                    Object A027 = r2.A00.A02(r59);
                                                    if (A027 != null) {
                                                        if (A027 instanceof AnonymousClass071) {
                                                            AnonymousClass0NQ r510 = (AnonymousClass0NQ) A027;
                                                            Object[] objArr6 = r510.A03;
                                                            long[] jArr7 = r510.A02;
                                                            int length6 = jArr7.length - 2;
                                                            if (length6 >= 0) {
                                                                int i14 = 0;
                                                                while (true) {
                                                                    long j7 = jArr7[i14];
                                                                    if ((j7 & AnonymousClass001.A0s(j7) & -9187201950435737472L) != -9187201950435737472L) {
                                                                        int A0F6 = AnonymousClass000.A0F(i14, length6);
                                                                        for (int i15 = 0; i15 < A0F6; i15++) {
                                                                            if ((j7 & 255) < 128) {
                                                                                A01(r1, objArr6, i14, i15);
                                                                                z = true;
                                                                            }
                                                                            j7 >>= 8;
                                                                        }
                                                                        if (A0F6 != 8) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i14 == length6) {
                                                                        break;
                                                                    }
                                                                    i14++;
                                                                }
                                                            }
                                                        } else {
                                                            r1.A08(A027);
                                                            z = true;
                                                        }
                                                    }
                                                } else {
                                                    this.A0A.A0F(r59);
                                                }
                                            }
                                            j6 >>= 8;
                                        }
                                        if (A0F5 != 8) {
                                            break;
                                        }
                                    }
                                    if (i12 == length5) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        } else {
                            C17320uT r63 = (C17320uT) A022;
                            Object obj5 = hashMap.get(r63);
                            C16290s1 r511 = ((AnonymousClass08W) r63).A01;
                            if (r511 == null) {
                                r511 = AnonymousClass0Q9.A06();
                            }
                            if (!r511.BKT(r63.BQ0().A04, obj5)) {
                                Object A028 = r2.A00.A02(r63);
                                if (A028 != null) {
                                    if (A028 instanceof AnonymousClass071) {
                                        AnonymousClass0NQ r512 = (AnonymousClass0NQ) A028;
                                        Object[] objArr7 = r512.A03;
                                        long[] jArr8 = r512.A02;
                                        int length7 = jArr8.length - 2;
                                        if (length7 >= 0) {
                                            int i16 = 0;
                                            while (true) {
                                                long j8 = jArr8[i16];
                                                if ((AnonymousClass001.A0s(j8) & j8 & -9187201950435737472L) != -9187201950435737472L) {
                                                    int A0F7 = AnonymousClass000.A0F(i16, length7);
                                                    for (int i17 = 0; i17 < A0F7; i17++) {
                                                        if ((j8 & 255) < 128) {
                                                            A01(r1, objArr7, i16, i17);
                                                            z = true;
                                                        }
                                                        j8 >>= 8;
                                                    }
                                                    if (A0F7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i16 == length7) {
                                                    break;
                                                }
                                                i16++;
                                            }
                                        }
                                    } else {
                                        r1.A08(A028);
                                        z = true;
                                    }
                                }
                            } else {
                                this.A0A.A0F(r63);
                            }
                        }
                    }
                    Object A029 = r2.A00.A02(next);
                    if (A029 != null) {
                        if (A029 instanceof AnonymousClass071) {
                            AnonymousClass0NQ r513 = (AnonymousClass0NQ) A029;
                            Object[] objArr8 = r513.A03;
                            long[] jArr9 = r513.A02;
                            int length8 = jArr9.length - 2;
                            if (length8 >= 0) {
                                int i18 = 0;
                                while (true) {
                                    long j9 = jArr9[i18];
                                    if ((AnonymousClass001.A0s(j9) & j9 & -9187201950435737472L) != -9187201950435737472L) {
                                        int A0F8 = AnonymousClass000.A0F(i18, length8);
                                        for (int i19 = 0; i19 < A0F8; i19++) {
                                            if ((j9 & 255) < 128) {
                                                A01(r1, objArr8, i18, i19);
                                                z = true;
                                            }
                                            j9 >>= 8;
                                        }
                                        if (A0F8 != 8) {
                                            break;
                                        }
                                    }
                                    if (i18 == length8) {
                                        break;
                                    }
                                    i18++;
                                }
                            }
                        } else {
                            r1.A08(A029);
                            z = true;
                        }
                    }
                }
            }
        }
        C06970a9 r11 = this.A0A;
        int i20 = r11.A00;
        if (i20 != 0) {
            if (i20 > 0) {
                Object[] objArr9 = r11.A01;
                do {
                    Object obj6 = objArr9[i2];
                    AnonymousClass070 r83 = this.A04;
                    int A043 = C05200Qx.A01().A04();
                    Object A0210 = r2.A00.A02(obj6);
                    if (A0210 != null) {
                        if (A0210 instanceof AnonymousClass071) {
                            AnonymousClass0NQ r13 = (AnonymousClass0NQ) A0210;
                            Object[] objArr10 = r13.A03;
                            long[] jArr10 = r13.A02;
                            int length9 = jArr10.length - 2;
                            if (length9 >= 0) {
                                int i21 = 0;
                                while (true) {
                                    long j10 = jArr10[i21];
                                    if ((AnonymousClass001.A0q(j10) & -9187201950435737472L) != -9187201950435737472L) {
                                        int A0F9 = AnonymousClass000.A0F(i21, length9);
                                        for (int i22 = 0; i22 < A0F9; i22++) {
                                            if ((j10 & 255) < 128) {
                                                Object A0x = AnonymousClass000.A0x(objArr10, i21, i22);
                                                AnonymousClass06z r0 = (AnonymousClass06z) r83.A02(A0x);
                                                if (r0 == null) {
                                                    r0 = AnonymousClass06z.A02();
                                                    r83.A08(A0x, r0);
                                                }
                                                A00(r0, obj6, A0x, A043);
                                            }
                                            j10 >>= 8;
                                        }
                                        if (A0F9 != 8) {
                                            break;
                                        }
                                    }
                                    if (i21 == length9) {
                                        break;
                                    }
                                    i21++;
                                }
                            }
                        } else {
                            AnonymousClass06z r02 = (AnonymousClass06z) r83.A02(A0210);
                            if (r02 == null) {
                                r02 = AnonymousClass06z.A02();
                                r83.A08(A0210, r02);
                            }
                            A00(r02, obj6, A0210, A043);
                        }
                    }
                    i2++;
                } while (i2 < i20);
            }
            r11.A08();
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0Ka, X.070] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.0NQ, X.071] */
    public C04680Oi(C22821Di r4) {
        this.A0B = r4;
        ? r2 = new AnonymousClass0Ka();
        AnonymousClass070 r0 = AnonymousClass0GO.A01;
        AnonymousClass070.A01(r2, 6);
        this.A04 = r2;
        ? r02 = new AnonymousClass0NQ();
        AnonymousClass071.A02(r02, 6);
        this.A08 = r02;
        this.A0A = C06970a9.A02(new C17320uT[16]);
        this.A09 = new AnonymousClass0VU(this, 1);
        this.A05 = new AnonymousClass0JH();
        this.A07 = new HashMap();
    }

    public final C22821Di A02() {
        return this.A0B;
    }
}
