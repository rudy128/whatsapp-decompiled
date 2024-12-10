package X;

import android.os.Trace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0VT  reason: invalid class name */
public final class AnonymousClass0VT implements C17250uM, C16660sn, C17240uL {
    public AnonymousClass0OL A00;
    public boolean A01;
    public boolean A02;
    public AnonymousClass1OS A03;
    public final AnonymousClass0VR A04;
    public final AnonymousClass0D1 A05;
    public final AnonymousClass0EH A06;
    public final AnonymousClass0JH A07;
    public final AnonymousClass0JH A08;
    public final Object A09 = new Object();
    public final HashSet A0A;
    public final HashSet A0B;
    public final C16270rz A0C;
    public final C06390Yd A0D;
    public final AnonymousClass0Kg A0E;
    public final AnonymousClass0Kg A0F;
    public final AnonymousClass0JH A0G;
    public final AtomicReference A0H = new AtomicReference((Object) null);

    /* JADX WARNING: type inference failed for: r0v6, types: [X.0EH, java.lang.Object] */
    public AnonymousClass0VT(C16270rz r10, AnonymousClass0D1 r11) {
        this.A05 = r11;
        C16270rz r2 = r10;
        this.A0C = r10;
        HashSet hashSet = new HashSet();
        this.A0A = hashSet;
        C06390Yd r5 = new C06390Yd();
        this.A0D = r5;
        this.A08 = new AnonymousClass0JH();
        this.A0B = new HashSet();
        this.A07 = new AnonymousClass0JH();
        AnonymousClass0Kg r6 = new AnonymousClass0Kg();
        this.A0E = r6;
        AnonymousClass0Kg r7 = new AnonymousClass0Kg();
        this.A0F = r7;
        this.A0G = new AnonymousClass0JH();
        AnonymousClass0OL.A01(this);
        this.A06 = new Object();
        AnonymousClass0VR r1 = new AnonymousClass0VR(r2, r11, this, r5, r6, r7, hashSet);
        r11.A0V(r1);
        this.A04 = r1;
        this.A03 = AnonymousClass0O4.A00();
    }

    private final HashSet A00(Object obj, HashSet hashSet, boolean z) {
        Integer num;
        Integer num2;
        HashSet hashSet2 = hashSet;
        Object obj2 = obj;
        Object A022 = this.A08.A00.A02(obj2);
        if (A022 != null) {
            if (A022 instanceof AnonymousClass071) {
                AnonymousClass0NQ r2 = (AnonymousClass0NQ) A022;
                Object[] objArr = r2.A03;
                long[] jArr = r2.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int A0D2 = 8 - AnonymousClass000.A0D(i, length);
                            for (int i2 = 0; i2 < A0D2; i2++) {
                                if ((255 & j) < 128) {
                                    C05660Vf r22 = (C05660Vf) AnonymousClass000.A0x(objArr, i, i2);
                                    if (!this.A0G.A02(obj2, r22)) {
                                        C16660sn r0 = r22.A05;
                                        if (r0 != null) {
                                            num2 = r0.Bdk(r22, obj2);
                                        } else {
                                            num2 = AnonymousClass00R.A00;
                                        }
                                        if (num2 != AnonymousClass00R.A00) {
                                            if (r22.A03 == null || z) {
                                                if (hashSet2 == null) {
                                                    hashSet2 = new HashSet();
                                                }
                                                hashSet2.add(r22);
                                            } else {
                                                this.A0B.add(r22);
                                            }
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (A0D2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                C05660Vf r23 = (C05660Vf) A022;
                if (!this.A0G.A02(obj2, r23)) {
                    C16660sn r02 = r23.A05;
                    if (r02 != null) {
                        num = r02.Bdk(r23, obj2);
                    } else {
                        num = AnonymousClass00R.A00;
                    }
                    if (num != AnonymousClass00R.A00) {
                        if (r23.A03 == null || z) {
                            if (hashSet == null) {
                                hashSet2 = new HashSet();
                            }
                            hashSet2.add(r23);
                            return hashSet2;
                        }
                        this.A0B.add(r23);
                    }
                }
            }
        }
        return hashSet2;
    }

    private final void A01() {
        int i;
        AnonymousClass070 r11 = this.A07.A00;
        long[] jArr = r11.A02;
        long[] jArr2 = jArr;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                long j2 = -1;
                if ((((j ^ -1) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int A0F2 = AnonymousClass000.A0F(i2, length);
                    int i3 = 0;
                    while (i3 < A0F2) {
                        if ((j & 255) < 128) {
                            int i4 = (i2 << 3) + i3;
                            Object obj = r11.A04[i4];
                            if (obj instanceof AnonymousClass071) {
                                C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                AnonymousClass071 r7 = (AnonymousClass071) obj;
                                Object[] objArr = r7.A03;
                                long[] jArr3 = r7.A02;
                                int length2 = jArr3.length - 2;
                                if (length2 >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j3 = jArr3[i5];
                                        if ((j3 & ((j3 ^ j2) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                            int A0F3 = AnonymousClass000.A0F(i5, length2);
                                            for (int i6 = 0; i6 < A0F3; i6++) {
                                                if ((j3 & 255) < 128) {
                                                    int i7 = (i5 << 3) + i6;
                                                    if (!this.A08.A00.A03(objArr[i7])) {
                                                        r7.A07(i7);
                                                    }
                                                }
                                                j3 >>= 8;
                                            }
                                            if (A0F3 != 8) {
                                                break;
                                            }
                                        }
                                        if (i5 == length2) {
                                            break;
                                        }
                                        i5++;
                                        j2 = -1;
                                    }
                                }
                                i = r7.A01;
                            } else {
                                C18070vi.A0z(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                i = this.A08.A00.A03(obj);
                            }
                            if (i == 0) {
                                r11.A06(i4);
                            }
                        }
                        j >>= 8;
                        i3++;
                        j2 = -1;
                    }
                    if (A0F2 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        HashSet hashSet = this.A0B;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((C05660Vf) it.next()).A03 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void A02(AnonymousClass0VT r1) {
        HashSet hashSet = r1.A0A;
        if (!hashSet.isEmpty()) {
            new C05670Vg(hashSet).A00();
        }
    }

    public static final void A03(AnonymousClass0VT r2) {
        r2.A0H.set((Object) null);
        r2.A0E.A00.A04();
        r2.A0F.A00.A04();
        r2.A0A.clear();
    }

    public static final void A04(AnonymousClass0VT r5) {
        String str;
        AtomicReference atomicReference = r5.A0H;
        Object obj = C04080Lt.A00;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                str = "pending composition has not been applied";
            } else if (andSet instanceof Set) {
                r5.A08((Set) andSet, true);
                return;
            } else if (andSet instanceof Object[]) {
                for (Set A082 : (Set[]) andSet) {
                    r5.A08(A082, true);
                }
                return;
            } else {
                str = AnonymousClass001.A1E(atomicReference, "corrupt pendingModifications drain: ", AnonymousClass000.A10());
            }
            C05020Qb.A06(str);
            throw null;
        }
    }

    public static final void A05(AnonymousClass0VT r5) {
        String A1E;
        AtomicReference atomicReference = r5.A0H;
        Object andSet = atomicReference.getAndSet((Object) null);
        if (C18070vi.A18(andSet, C04080Lt.A00)) {
            return;
        }
        if (andSet instanceof Set) {
            r5.A08((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set A082 : (Set[]) andSet) {
                r5.A08(A082, false);
            }
        } else {
            if (andSet == null) {
                A1E = "calling recordModificationsOf and applyChanges concurrently is not supported";
            } else {
                A1E = AnonymousClass001.A1E(atomicReference, "corrupt pendingModifications drain: ", AnonymousClass000.A10());
            }
            C05020Qb.A06(A1E);
            throw null;
        }
    }

    private final void A06(AnonymousClass0Kg r29) {
        AnonymousClass0Qu A052;
        C02090Cr r0;
        C02090Cr r02;
        C05670Vg r03 = new C05670Vg(this.A0A);
        try {
            C04910Pm r3 = r29.A00;
            if (r3.A02 != 0) {
                Trace.beginSection("Compose:applyChanges");
                try {
                    C16270rz r2 = this.A0C;
                    A052 = this.A0D.A05();
                    r3.A05(r2, r03, A052);
                    A052.A0R();
                    C17140to r04 = ((AnonymousClass0XV) ((AnonymousClass0VP) r2).A01).A08;
                    if (r04 != null) {
                        r04.Bsd();
                    }
                    Trace.endSection();
                    r03.A01();
                    r03.A02();
                    if (this.A02) {
                        Trace.beginSection("Compose:unobserve");
                        int i = 0;
                        this.A02 = false;
                        AnonymousClass070 r10 = this.A08.A00;
                        long[] jArr = r10.A02;
                        long[] jArr2 = jArr;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr2[i2];
                                if ((AnonymousClass001.A0s(j) & j & -9187201950435737472L) != -9187201950435737472L) {
                                    int A0F2 = AnonymousClass000.A0F(i2, length);
                                    while (i < A0F2) {
                                        if ((j & 255) < 128) {
                                            int i3 = (i2 << 3) + i;
                                            Object obj = r10.A04[i3];
                                            if (obj instanceof AnonymousClass071) {
                                                C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                                AnonymousClass071 r7 = (AnonymousClass071) obj;
                                                Object[] objArr = r7.A03;
                                                long[] jArr3 = r7.A02;
                                                int length2 = jArr3.length - 2;
                                                if (length2 >= 0) {
                                                    int i4 = 0;
                                                    while (true) {
                                                        long j2 = jArr3[i4];
                                                        if ((j2 & AnonymousClass001.A0s(j2) & -9187201950435737472L) != -9187201950435737472L) {
                                                            int A0F3 = AnonymousClass000.A0F(i4, length2);
                                                            for (int i5 = 0; i5 < A0F3; i5++) {
                                                                if ((j2 & 255) < 128) {
                                                                    int i6 = (i4 << 3) + i5;
                                                                    C05660Vf r15 = (C05660Vf) objArr[i6];
                                                                    if (r15.A05 == null || (r02 = r15.A04) == null || r02.A00 == Integer.MIN_VALUE) {
                                                                        r7.A07(i6);
                                                                    }
                                                                }
                                                                j2 >>= 8;
                                                            }
                                                            if (A0F3 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i4 == length2) {
                                                            break;
                                                        }
                                                        i4++;
                                                    }
                                                }
                                                if (r7.A01 != 0) {
                                                }
                                            } else {
                                                C18070vi.A0z(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                                C05660Vf r72 = (C05660Vf) obj;
                                                if (!(r72.A05 == null || (r0 = r72.A04) == null || r0.A00 == Integer.MIN_VALUE)) {
                                                }
                                            }
                                            r10.A06(i3);
                                        }
                                        j >>= 8;
                                        i++;
                                    }
                                    if (A0F2 != 8) {
                                        break;
                                    }
                                }
                                if (i2 == length) {
                                    break;
                                }
                                i2++;
                                i = 0;
                            }
                        }
                        A01();
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        } finally {
            if (this.A0F.A00.A02 == 0) {
                r03.A00();
            }
        }
    }

    private final void A07(Object obj) {
        Integer num;
        Integer num2;
        Object A022 = this.A08.A00.A02(obj);
        if (A022 == null) {
            return;
        }
        if (A022 instanceof AnonymousClass071) {
            AnonymousClass0NQ r2 = (AnonymousClass0NQ) A022;
            Object[] objArr = r2.A03;
            long[] jArr = r2.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                        int A0D2 = 8 - AnonymousClass000.A0D(i, length);
                        for (int i2 = 0; i2 < A0D2; i2++) {
                            if ((255 & j) < 128) {
                                C05660Vf r22 = (C05660Vf) AnonymousClass000.A0x(objArr, i, i2);
                                C16660sn r0 = r22.A05;
                                if (r0 != null) {
                                    num2 = r0.Bdk(r22, obj);
                                } else {
                                    num2 = AnonymousClass00R.A00;
                                }
                                if (num2 == AnonymousClass00R.A0N) {
                                    this.A0G.A01(obj, r22);
                                }
                            }
                            j >>= 8;
                        }
                        if (A0D2 != 8) {
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
        } else {
            C05660Vf r23 = (C05660Vf) A022;
            C16660sn r02 = r23.A05;
            if (r02 != null) {
                num = r02.Bdk(r23, obj);
            } else {
                num = AnonymousClass00R.A00;
            }
            if (num == AnonymousClass00R.A0N) {
                this.A0G.A01(obj, r23);
            }
        }
    }

    private final void A08(Set set, boolean z) {
        HashSet hashSet;
        int i;
        Set set2 = set;
        long j = -1;
        long j2 = -9187201950435737472L;
        Object obj = null;
        boolean z2 = z;
        if (set2 instanceof C06990aB) {
            C06990aB r1 = (C06990aB) set2;
            Object[] A042 = r1.A04();
            int size = r1.size();
            hashSet = null;
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = A042[i2];
                C18070vi.A0z(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (obj2 instanceof C05660Vf) {
                    C05660Vf r3 = (C05660Vf) obj2;
                    C16660sn r0 = r3.A05;
                    if (r0 != null) {
                        r0.Bdk(r3, obj);
                    }
                } else {
                    hashSet = A00(obj2, hashSet, z2);
                    Object A022 = this.A07.A00.A02(obj2);
                    if (A022 != null) {
                        if (A022 instanceof AnonymousClass071) {
                            AnonymousClass0NQ r32 = (AnonymousClass0NQ) A022;
                            Object[] objArr = r32.A03;
                            long[] jArr = r32.A02;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j3 = jArr[i3];
                                    if ((j3 & ((j3 ^ -1) << 7) & j2) != j2) {
                                        int A0F2 = AnonymousClass000.A0F(i3, length);
                                        for (int i4 = 0; i4 < A0F2; i4++) {
                                            if ((j3 & 255) < 128) {
                                                hashSet = A00(AnonymousClass000.A0x(objArr, i3, i4), hashSet, z2);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (A0F2 != 8) {
                                            break;
                                        }
                                    }
                                    if (i3 == length) {
                                        break;
                                    }
                                    i3++;
                                    j2 = -9187201950435737472L;
                                }
                            }
                        } else {
                            hashSet = A00(A022, hashSet, z2);
                        }
                    }
                }
                i2++;
                j2 = -9187201950435737472L;
                obj = null;
            }
        } else {
            hashSet = null;
            for (Object next : set2) {
                if (next instanceof C05660Vf) {
                    C05660Vf r4 = (C05660Vf) next;
                    C16660sn r02 = r4.A05;
                    if (r02 != null) {
                        r02.Bdk(r4, (Object) null);
                    }
                } else {
                    hashSet = A00(next, hashSet, z2);
                    Object A023 = this.A07.A00.A02(next);
                    if (A023 != null) {
                        if (A023 instanceof AnonymousClass071) {
                            AnonymousClass0NQ r33 = (AnonymousClass0NQ) A023;
                            Object[] objArr2 = r33.A03;
                            long[] jArr2 = r33.A02;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j4 = jArr2[i5];
                                    if ((j4 & ((j4 ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                        int A0F3 = AnonymousClass000.A0F(i5, length2);
                                        for (int i6 = 0; i6 < A0F3; i6++) {
                                            if ((j4 & 255) < 128) {
                                                hashSet = A00(AnonymousClass000.A0x(objArr2, i5, i6), hashSet, z2);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (A0F3 != 8) {
                                            break;
                                        }
                                    }
                                    if (i5 == length2) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        } else {
                            hashSet = A00(A023, hashSet, z2);
                        }
                    }
                }
            }
        }
        if (z) {
            HashSet hashSet2 = this.A0B;
            if (!hashSet2.isEmpty()) {
                AnonymousClass070 r42 = this.A08.A00;
                long[] jArr3 = r42.A02;
                long[] jArr4 = jArr3;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j5 = jArr4[i7];
                        if ((j5 & ((j5 ^ j) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                            int A0F4 = AnonymousClass000.A0F(i7, length3);
                            int i8 = 0;
                            while (true) {
                                i = A0F4;
                                if (i8 >= i) {
                                    break;
                                }
                                if ((j5 & 255) < 128) {
                                    int i9 = (i7 << 3) + i8;
                                    Object obj3 = r42.A04[i9];
                                    if (obj3 instanceof AnonymousClass071) {
                                        C18070vi.A0z(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                        AnonymousClass071 r7 = (AnonymousClass071) obj3;
                                        Object[] objArr3 = r7.A03;
                                        long[] jArr5 = r7.A02;
                                        int length4 = jArr5.length - 2;
                                        if (length4 >= 0) {
                                            int i10 = 0;
                                            while (true) {
                                                long j6 = jArr5[i10];
                                                if ((j6 & AnonymousClass001.A0s(j6) & -9187201950435737472L) != -9187201950435737472L) {
                                                    int A0F5 = AnonymousClass000.A0F(i10, length4);
                                                    for (int i11 = 0; i11 < A0F5; i11++) {
                                                        if ((j6 & 255) < 128) {
                                                            int i12 = (i10 << 3) + i11;
                                                            Object obj4 = objArr3[i12];
                                                            if (hashSet2.contains(obj4) || (hashSet != null && hashSet.contains(obj4))) {
                                                                r7.A07(i12);
                                                            }
                                                        }
                                                        j6 >>= 8;
                                                    }
                                                    if (A0F5 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i10 == length4) {
                                                    break;
                                                }
                                                i10++;
                                            }
                                        }
                                        if (r7.A01 != 0) {
                                        }
                                    } else {
                                        C18070vi.A0z(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                        if (!hashSet2.contains(obj3)) {
                                            if (hashSet != null) {
                                                if (!hashSet.contains(obj3)) {
                                                }
                                            }
                                        }
                                    }
                                    r42.A06(i9);
                                }
                                j5 >>= 8;
                                i8++;
                            }
                            if (i != 8) {
                                break;
                            }
                        }
                        if (i7 == length3) {
                            break;
                        }
                        i7++;
                        j = -1;
                    }
                }
                hashSet2.clear();
                A01();
            }
        }
        if (hashSet != null) {
            AnonymousClass070 r43 = this.A08.A00;
            long[] jArr6 = r43.A02;
            long[] jArr7 = jArr6;
            int length5 = jArr6.length - 2;
            if (length5 >= 0) {
                int i13 = 0;
                while (true) {
                    long j7 = jArr7[i13];
                    if ((AnonymousClass001.A0s(j7) & j7 & -9187201950435737472L) != -9187201950435737472L) {
                        int A0F6 = AnonymousClass000.A0F(i13, length5);
                        for (int i14 = 0; i14 < A0F6; i14++) {
                            if ((j7 & 255) < 128) {
                                int i15 = (i13 << 3) + i14;
                                Object obj5 = r43.A04[i15];
                                if (obj5 instanceof AnonymousClass071) {
                                    C18070vi.A0z(obj5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                    AnonymousClass071 r10 = (AnonymousClass071) obj5;
                                    Object[] objArr4 = r10.A03;
                                    long[] jArr8 = r10.A02;
                                    int length6 = jArr8.length - 2;
                                    if (length6 >= 0) {
                                        int i16 = 0;
                                        while (true) {
                                            long j8 = jArr8[i16];
                                            if ((j8 & AnonymousClass001.A0s(j8) & -9187201950435737472L) != -9187201950435737472L) {
                                                int A0F7 = AnonymousClass000.A0F(i16, length6);
                                                for (int i17 = 0; i17 < A0F7; i17++) {
                                                    if ((j8 & 255) < 128) {
                                                        int i18 = (i16 << 3) + i17;
                                                        if (hashSet.contains(objArr4[i18])) {
                                                            r10.A07(i18);
                                                        }
                                                    }
                                                    j8 >>= 8;
                                                }
                                                if (A0F7 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i16 == length6) {
                                                break;
                                            }
                                            i16++;
                                        }
                                    }
                                    if (r10.A01 != 0) {
                                    }
                                } else {
                                    C18070vi.A0z(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                    if (!hashSet.contains(obj5)) {
                                    }
                                }
                                r43.A06(i15);
                            }
                            j7 >>= 8;
                        }
                        if (A0F6 != 8) {
                            break;
                        }
                    }
                    if (i13 == length5) {
                        break;
                    }
                    i13++;
                }
            }
            A01();
        }
    }

    private final void A09(AnonymousClass1OS r2) {
        if (!this.A01) {
            this.A03 = r2;
            this.A05.A0c(this, r2);
            return;
        }
        throw AnonymousClass000.A0n("The composition is disposed");
    }

    public void BCP() {
        synchronized (this.A09) {
            try {
                A06(this.A0E);
                A05(this);
            } catch (Exception e) {
                A03(this);
                throw e;
            } catch (Throwable th) {
                A02(this);
                throw th;
            }
        }
    }

    public void BCS() {
        synchronized (this.A09) {
            try {
                AnonymousClass0Kg r1 = this.A0F;
                if (r1.A00.A02 != 0) {
                    A06(r1);
                }
            } catch (Exception e) {
                A03(this);
                throw e;
            } catch (Throwable th) {
                A02(this);
                throw th;
            }
        }
    }

    public void BFQ(AnonymousClass1OS r4) {
        try {
            synchronized (this.A09) {
                A04(this);
                AnonymousClass0OL r1 = this.A00;
                AnonymousClass0OL.A01(this);
                try {
                    this.A04.A0b(r1, r4);
                } catch (Exception e) {
                    this.A00 = r1;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                A02(this);
                throw th;
            } catch (Exception e2) {
                A03(this);
                throw e2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r2.A0e(r6, r7) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
        r5.A05.A0Z(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005e, code lost:
        if (r2.A0L == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        return X.AnonymousClass00R.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0065, code lost:
        return X.AnonymousClass00R.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer Bdk(X.C05660Vf r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r1 = r6.A01
            r0 = r1 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x000e
            r0 = r1 | 4
            r6.A01 = r0
        L_0x000e:
            X.0Cr r2 = r6.A04
            if (r2 == 0) goto L_0x0028
            int r1 = r2.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == 0) goto L_0x0028
            X.0Yd r0 = r5.A0D
            boolean r0 = r0.A0F(r2)
            if (r0 != 0) goto L_0x002b
            java.lang.Object r0 = r5.A09
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x0028:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            return r0
        L_0x002b:
            boolean r0 = r6.A04()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r4 = r5.A09
            monitor-enter(r4)
            r3 = 0
            X.0VR r2 = r5.A04     // Catch:{ all -> 0x0066 }
            boolean r0 = r2.A0L     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0042
            boolean r1 = r2.A0e(r6, r7)     // Catch:{ all -> 0x0066 }
            r0 = 1
            if (r1 != 0) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x0049
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)
            return r0
        L_0x0049:
            if (r7 != 0) goto L_0x0051
            X.0OL r0 = r5.A00     // Catch:{ all -> 0x0066 }
            r0.A02(r6, r3)     // Catch:{ all -> 0x0066 }
            goto L_0x0056
        L_0x0051:
            X.0OL r0 = r5.A00     // Catch:{ all -> 0x0066 }
            X.C04080Lt.A00(r0, r6, r7)     // Catch:{ all -> 0x0066 }
        L_0x0056:
            monitor-exit(r4)
            X.0D1 r0 = r5.A05
            r0.A0Z(r5)
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            return r0
        L_0x0063:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            return r0
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VT.Bdk(X.0Vf, java.lang.Object):java.lang.Integer");
    }

    public void Bdl() {
        C05660Vf r2;
        C16660sn r1;
        synchronized (this.A09) {
            for (Object obj : this.A0D.A0H()) {
                if (!(!(obj instanceof C05660Vf) || (r2 = (C05660Vf) obj) == null || (r1 = r2.A05) == null)) {
                    r1.Bdk(r2, (Object) null);
                }
            }
        }
    }

    public boolean Bkb(Set set) {
        if (set instanceof C06990aB) {
            C06990aB r8 = (C06990aB) set;
            Object[] A042 = r8.A04();
            int size = r8.size();
            int i = 0;
            while (i < size) {
                Object obj = A042[i];
                C18070vi.A0z(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!this.A08.A00.A03(obj) && !this.A07.A00.A03(obj)) {
                    i++;
                }
            }
            return false;
        }
        for (Object next : set) {
            if (!this.A08.A00.A03(next)) {
                if (this.A07.A00.A03(next)) {
                }
            }
        }
        return false;
        return true;
    }

    public void CCM(C18090vk r2) {
        this.A04.A0d(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.util.Set} */
    /* JADX WARNING: type inference failed for: r0v16, types: [java.util.Set[], java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CDg(java.util.Set r4) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r2 = r3.A0H
            java.lang.Object r1 = r2.get()
            if (r1 == 0) goto L_0x0037
            java.lang.Object r0 = X.C04080Lt.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0037
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L_0x0026
            r0 = 2
            java.util.Set[] r0 = new java.util.Set[r0]
            X.AnonymousClass001.A1Q(r1, r4, r0)
        L_0x001a:
            boolean r0 = X.AnonymousClass00N.A00(r1, r0, r2)
            if (r0 == 0) goto L_0x0000
            if (r1 != 0) goto L_0x0041
            java.lang.Object r1 = r3.A09
            monitor-enter(r1)
            goto L_0x0039
        L_0x0026:
            boolean r0 = r1 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            X.C18070vi.A0z(r1, r0)
            r0 = r1
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = X.C200310o.A0D(r4, r0)
            goto L_0x001a
        L_0x0037:
            r0 = r4
            goto L_0x001a
        L_0x0039:
            A05(r3)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0040:
            monitor-exit(r1)
        L_0x0041:
            return
        L_0x0042:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "corrupt pendingModifications: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VT.CDg(java.util.Set):void");
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [X.0Ka, X.070] */
    public void CDi(Object obj) {
        C05660Vf A0Z;
        AnonymousClass0VR r1 = this.A04;
        if (r1.A00 <= 0 && (A0Z = r1.A0Z()) != null) {
            int i = A0Z.A01 | 1;
            A0Z.A01 = i;
            Object obj2 = obj;
            if ((i & 32) == 0) {
                AnonymousClass06z r8 = A0Z.A02;
                if (r8 == null) {
                    r8 = AnonymousClass06z.A02();
                    A0Z.A02 = r8;
                }
                int i2 = A0Z.A00;
                int i3 = -1;
                int A012 = AnonymousClass06z.A01(r8, obj2);
                if (A012 < 0) {
                    A012 ^= -1;
                } else {
                    i3 = r8.A02[A012];
                }
                r8.A04[A012] = obj;
                r8.A02[A012] = i2;
                if (i3 == A0Z.A00) {
                    return;
                }
                if (obj2 instanceof C17320uT) {
                    AnonymousClass070 r12 = A0Z.A03;
                    AnonymousClass070 r13 = r12;
                    if (r12 == null) {
                        ? r14 = new AnonymousClass0Ka();
                        AnonymousClass070 r0 = AnonymousClass0GO.A01;
                        AnonymousClass070.A01(r14, 6);
                        A0Z.A03 = r14;
                        r13 = r14;
                    }
                    r13.A08(obj2, ((C17320uT) obj2).BQ0().A04);
                }
            }
            if (obj2 instanceof AnonymousClass0W5) {
                ((AnonymousClass0W5) obj2).A02(1);
            }
            this.A08.A01(obj2, A0Z);
            if (obj2 instanceof C17320uT) {
                AnonymousClass0JH r132 = this.A07;
                r132.A00(obj2);
                AnonymousClass0KU r02 = ((C17320uT) obj2).BQ0().A03;
                Object[] objArr = r02.A04;
                long[] jArr = r02.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int A0D2 = 8 - AnonymousClass000.A0D(i4, length);
                            for (int i5 = 0; i5 < A0D2; i5++) {
                                if ((255 & j) < 128) {
                                    AnonymousClass0t4 r15 = (AnonymousClass0t4) AnonymousClass000.A0x(objArr, i4, i5);
                                    if (r15 instanceof AnonymousClass0W5) {
                                        ((AnonymousClass0W5) r15).A02(1);
                                    }
                                    r132.A01(r15, obj2);
                                }
                                j >>= 8;
                            }
                            if (A0D2 != 8) {
                                return;
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public void CDl(Object obj) {
        synchronized (this.A09) {
            Object obj2 = obj;
            A07(obj2);
            Object A022 = this.A07.A00.A02(obj2);
            if (A022 != null) {
                if (A022 instanceof AnonymousClass071) {
                    AnonymousClass071 r1 = (AnonymousClass071) A022;
                    Object[] objArr = r1.A03;
                    long[] jArr = r1.A02;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                                int A0D2 = 8 - AnonymousClass000.A0D(i, length);
                                for (int i2 = 0; i2 < A0D2; i2++) {
                                    if ((255 & j) < 128) {
                                        A07((C17320uT) AnonymousClass000.A0x(objArr, i, i2));
                                    }
                                    j >>= 8;
                                }
                                if (A0D2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    A07((C17320uT) A022);
                }
            }
        }
    }

    public void CIX(AnonymousClass1OS r4) {
        AnonymousClass0VR r2 = this.A04;
        r2.A04 = 100;
        r2.A0O = true;
        A09(r4);
        if (r2.A0L || r2.A04 != 100) {
            throw AnonymousClass000.A0k("Cannot disable reuse from root if it was caused by other groups");
        }
        r2.A04 = -1;
        r2.A0O = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if ((true ^ r5.A0A.isEmpty()) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deactivate() {
        /*
            r5 = this;
            X.0Yd r3 = r5.A0D
            int r0 = r3.A00()
            r2 = 1
            r1 = 1
            if (r0 > 0) goto L_0x0014
            r1 = 0
            java.util.HashSet r0 = r5.A0A
            boolean r0 = r0.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0050
        L_0x0014:
            java.lang.String r0 = "Compose:deactivate"
            android.os.Trace.beginSection(r0)
            java.util.HashSet r0 = r5.A0A     // Catch:{ all -> 0x0048 }
            X.0Vg r2 = new X.0Vg     // Catch:{ all -> 0x0048 }
            r2.<init>(r0)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0044
            X.0rz r0 = r5.A0C     // Catch:{ all -> 0x0048 }
            X.0Qu r1 = r3.A05()     // Catch:{ all -> 0x0048 }
            X.C05020Qb.A04(r2, r1)     // Catch:{ all -> 0x002c }
            goto L_0x0031
        L_0x002c:
            r0 = move-exception
            r1.A0R()     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0031:
            r1.A0R()     // Catch:{ all -> 0x0048 }
            X.0VP r0 = (X.AnonymousClass0VP) r0     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x0048 }
            X.0XV r0 = (X.AnonymousClass0XV) r0     // Catch:{ all -> 0x0048 }
            X.0to r0 = r0.A08     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0041
            r0.Bsd()     // Catch:{ all -> 0x0048 }
        L_0x0041:
            r2.A01()     // Catch:{ all -> 0x0048 }
        L_0x0044:
            r2.A00()     // Catch:{ all -> 0x0048 }
            goto L_0x004d
        L_0x0048:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x004d:
            android.os.Trace.endSection()
        L_0x0050:
            X.0JH r0 = r5.A08
            X.070 r0 = r0.A00
            r0.A05()
            X.0JH r0 = r5.A07
            X.070 r0 = r0.A00
            r0.A05()
            X.0OL r4 = r5.A00
            r3 = 0
            r4.A00 = r3
            java.lang.Object[] r1 = r4.A01
            r2 = 0
            int r0 = r1.length
            java.util.Arrays.fill(r1, r3, r0, r2)
            java.lang.Object[] r1 = r4.A02
            int r0 = r1.length
            java.util.Arrays.fill(r1, r3, r0, r2)
            X.0Kg r0 = r5.A0E
            X.0Pm r0 = r0.A00
            r0.A04()
            X.0VR r1 = r5.A04
            X.0H8 r0 = r1.A0Z
            java.util.ArrayList r0 = r0.A00
            r0.clear()
            java.util.List r0 = r1.A0c
            r0.clear()
            X.0Kg r0 = r1.A0E
            X.0Pm r0 = r0.A00
            r0.A04()
            r1.A0I = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VT.deactivate():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if ((true ^ r7.A0A.isEmpty()) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r7 = this;
            java.lang.Object r2 = r7.A09
            monitor-enter(r2)
            X.0VR r4 = r7.A04     // Catch:{ all -> 0x00b2 }
            boolean r0 = r4.A0L     // Catch:{ all -> 0x00b2 }
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r7.A01     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x009f
            r7.A01 = r3     // Catch:{ all -> 0x00b2 }
            X.1OS r0 = X.AnonymousClass0O4.A01()     // Catch:{ all -> 0x00b2 }
            r7.A03 = r0     // Catch:{ all -> 0x00b2 }
            X.0Kg r0 = r4.A0F     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x001f
            r7.A06(r0)     // Catch:{ all -> 0x00b2 }
        L_0x001f:
            X.0Yd r6 = r7.A0D     // Catch:{ all -> 0x00b2 }
            int r0 = r6.A00()     // Catch:{ all -> 0x00b2 }
            r1 = 1
            if (r0 > 0) goto L_0x0032
            r1 = 0
            java.util.HashSet r0 = r7.A0A     // Catch:{ all -> 0x00b2 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00b2 }
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x006a
        L_0x0032:
            java.util.HashSet r0 = r7.A0A     // Catch:{ all -> 0x00b2 }
            X.0Vg r5 = new X.0Vg     // Catch:{ all -> 0x00b2 }
            r5.<init>(r0)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x0067
            X.0rz r3 = r7.A0C     // Catch:{ all -> 0x00b2 }
            X.0Qu r1 = r6.A05()     // Catch:{ all -> 0x00b2 }
            X.C05020Qb.A05(r5, r1)     // Catch:{ all -> 0x0045 }
            goto L_0x004a
        L_0x0045:
            r0 = move-exception
            r1.A0R()     // Catch:{ all -> 0x00b2 }
            goto L_0x00b1
        L_0x004a:
            r1.A0R()     // Catch:{ all -> 0x00b2 }
            X.0VP r3 = (X.AnonymousClass0VP) r3     // Catch:{ all -> 0x00b2 }
            java.util.List r0 = r3.A02     // Catch:{ all -> 0x00b2 }
            r0.clear()     // Catch:{ all -> 0x00b2 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x00b2 }
            r3.A00 = r0     // Catch:{ all -> 0x00b2 }
            X.0XV r0 = (X.AnonymousClass0XV) r0     // Catch:{ all -> 0x00b2 }
            r0.A0a()     // Catch:{ all -> 0x00b2 }
            X.0to r0 = r0.A08     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0064
            r0.Bsd()     // Catch:{ all -> 0x00b2 }
        L_0x0064:
            r5.A01()     // Catch:{ all -> 0x00b2 }
        L_0x0067:
            r5.A00()     // Catch:{ all -> 0x00b2 }
        L_0x006a:
            java.lang.String r0 = "Compose:Composer.dispose"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00b2 }
            X.0D1 r0 = r4.A0V     // Catch:{ all -> 0x00ad }
            r0.A0W(r4)     // Catch:{ all -> 0x00ad }
            X.0H8 r0 = r4.A0Z     // Catch:{ all -> 0x00ad }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x00ad }
            r0.clear()     // Catch:{ all -> 0x00ad }
            java.util.List r0 = r4.A0c     // Catch:{ all -> 0x00ad }
            r0.clear()     // Catch:{ all -> 0x00ad }
            X.0Kg r0 = r4.A0E     // Catch:{ all -> 0x00ad }
            X.0Pm r0 = r0.A00     // Catch:{ all -> 0x00ad }
            r0.A04()     // Catch:{ all -> 0x00ad }
            r0 = 0
            r4.A0I = r0     // Catch:{ all -> 0x00ad }
            X.0rz r1 = r4.A0U     // Catch:{ all -> 0x00ad }
            X.0VP r1 = (X.AnonymousClass0VP) r1     // Catch:{ all -> 0x00ad }
            java.util.List r0 = r1.A02     // Catch:{ all -> 0x00ad }
            r0.clear()     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00ad }
            r1.A00 = r0     // Catch:{ all -> 0x00ad }
            X.0XV r0 = (X.AnonymousClass0XV) r0     // Catch:{ all -> 0x00ad }
            r0.A0a()     // Catch:{ all -> 0x00ad }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00b2 }
        L_0x009f:
            monitor-exit(r2)
            X.0D1 r0 = r7.A05
            r0.A0b(r7)
            return
        L_0x00a6:
            java.lang.String r0 = "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b1
        L_0x00ad:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x00b2 }
        L_0x00b1:
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VT.dispose():void");
    }

    public void CIT(AnonymousClass1OS r1) {
        A09(r1);
    }
}
