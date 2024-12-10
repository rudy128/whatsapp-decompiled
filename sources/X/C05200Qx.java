package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Qx  reason: invalid class name and case insensitive filesystem */
public abstract class C05200Qx {
    public static int A00;
    public static List A01;
    public static List A02;
    public static C07300ai A03 = new AtomicInteger(0);
    public static C06400Ye A04;
    public static final AnonymousClass0N4 A05 = new AnonymousClass0N4();
    public static final AnonymousClass0PM A06 = new AnonymousClass0PM();
    public static final AnonymousClass0IK A07 = new AnonymousClass0IK();
    public static final Object A08 = new Object();
    public static final AtomicReference A09;
    public static final Snapshot A0A;
    public static final C22821Di A0B = C12060l9.A00;

    public static final Snapshot A04(Snapshot snapshot, C22821Di r4, boolean z) {
        AnonymousClass08M r1;
        Snapshot snapshot2 = snapshot;
        C22821Di r2 = r4;
        if (snapshot instanceof AnonymousClass08M) {
            r1 = (AnonymousClass08M) snapshot2;
        } else if (snapshot != null) {
            return new AnonymousClass08L(snapshot, r4, z);
        } else {
            r1 = null;
        }
        return new AnonymousClass08I(r1, r2, (C22821Di) null, false, z);
    }

    public static final C03460Ig A0C(C06400Ye r4, C03460Ig r5, int i) {
        C03460Ig r2 = null;
        while (r5 != null) {
            int i2 = r5.A00;
            if (i2 != 0 && i2 <= i && !r4.A0C(i2) && (r2 == null || r2.A00 < r5.A00)) {
                r2 = r5;
            }
            r5 = r5.A01;
        }
        if (r2 != null) {
            return r2;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.util.concurrent.atomic.AtomicInteger, X.0ai] */
    static {
        C06400Ye A002 = AnonymousClass0EV.A00();
        A04 = A002;
        A00 = 1;
        C18460wS A092 = AnonymousClass1ZU.A09();
        A01 = A092;
        A02 = A092;
        A00 = 2;
        AnonymousClass08H r2 = new AnonymousClass08H(A002, 1);
        A04 = A04.A09(r2.A04());
        AtomicReference atomicReference = new AtomicReference(r2);
        A09 = atomicReference;
        A0A = (Snapshot) atomicReference.get();
    }

    public static final Snapshot A01() {
        Snapshot snapshot = (Snapshot) A05.A01();
        if (snapshot == null) {
            return (Snapshot) A09.get();
        }
        return snapshot;
    }

    public static final Snapshot A05(C22821Di r1) {
        return (Snapshot) A0I(new C10790iu(r1));
    }

    public static final C06400Ye A08(C06400Ye r0, int i, int i2) {
        while (i < i2) {
            r0 = r0.A09(i);
            i++;
        }
        return r0;
    }

    public static final Object A0H(Snapshot snapshot, C22821Di r7) {
        Object invoke = r7.invoke(A04.A08(snapshot.A04()));
        synchronized (A08) {
            int i = A00;
            A00 = i + 1;
            C06400Ye A082 = A04.A08(snapshot.A04());
            A04 = A082;
            A09.set(new AnonymousClass08H(A082, i));
            snapshot.A0D();
            A04 = A04.A09(i);
        }
        return invoke;
    }

    public static final Object A0I(C22821Di r9) {
        Object obj;
        C06990aB A0L;
        Object A0H;
        C18070vi.A0z(A0A, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        Object obj2 = A08;
        synchronized (obj2) {
            obj = A09.get();
            A0L = ((AnonymousClass08H) obj).A0L();
            if (A0L != null) {
                A03.addAndGet(1);
            }
            A0H = A0H((Snapshot) obj, r9);
        }
        if (A0L != null) {
            try {
                List list = A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((AnonymousClass1OS) list.get(i)).invoke(A0L, obj);
                }
            } finally {
                A03.addAndGet(-1);
            }
        }
        synchronized (obj2) {
            A0S();
            if (A0L != null) {
                Object[] A042 = A0L.A04();
                int size2 = A0L.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj3 = A042[i2];
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    AnonymousClass0t4 r1 = (AnonymousClass0t4) obj3;
                    if (A0Z(r1)) {
                        A07.A00(r1);
                    }
                }
            }
        }
        return A0H;
    }

    public static final C22821Di A0M(C22821Di r1, C22821Di r2) {
        if (r1 == null) {
            return r2;
        }
        if (r2 == null || r1.equals(r2)) {
            return r1;
        }
        return new C11060jQ(r1, r2);
    }

    public static final C22821Di A0P(C22821Di r1, C22821Di r2, boolean z) {
        if (!z) {
            r2 = null;
        }
        if (r1 == null) {
            return r2;
        }
        if (r2 == null || r1.equals(r2)) {
            return r1;
        }
        return new C11050jP(r1, r2);
    }

    public static final void A0R() {
        A0I(C12050l8.A00);
    }

    public static final void A0S() {
        Object obj;
        AnonymousClass0IK r6 = A07;
        int i = r6.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AnonymousClass0aY r1 = r6.A02[i3];
            if (!(r1 == null || (obj = r1.get()) == null || (!A0Z((AnonymousClass0t4) obj)))) {
                if (i2 != i3) {
                    r6.A02[i2] = r1;
                    int[] iArr = r6.A01;
                    iArr[i2] = iArr[i3];
                }
                i2++;
            }
        }
        for (int i4 = i2; i4 < i; i4++) {
            r6.A02[i4] = null;
            r6.A01[i4] = 0;
        }
        if (i2 != i) {
            r6.A00 = i2;
        }
    }

    public static final void A0T(int i) {
        int i2;
        AnonymousClass0PM r8 = A06;
        int[] iArr = r8.A02;
        int i3 = iArr[i];
        int i4 = r8.A01 - 1;
        AnonymousClass0PM.A02(r8, i3, i4);
        r8.A01 = i4;
        int i5 = i3;
        int[] iArr2 = r8.A04;
        int i6 = iArr2[i3];
        while (i5 > 0) {
            int i7 = ((i5 + 1) >> 1) - 1;
            if (iArr2[i7] <= i6) {
                break;
            }
            AnonymousClass0PM.A02(r8, i7, i5);
            i5 = i7;
        }
        int i8 = i4 >> 1;
        while (i3 < i8) {
            int i9 = (i3 + 1) << 1;
            int i10 = i9 - 1;
            if (i9 < i4 && (i2 = iArr2[i9]) < iArr2[i10]) {
                if (i2 >= iArr2[i3]) {
                    break;
                }
                AnonymousClass0PM.A02(r8, i9, i3);
                i3 = i9;
            } else if (iArr2[i10] >= iArr2[i3]) {
                break;
            } else {
                AnonymousClass0PM.A02(r8, i10, i3);
                i3 = i10;
            }
        }
        iArr[i] = r8.A00;
        r8.A00 = i;
    }

    public static final void A0U(Snapshot snapshot) {
        Object obj;
        int i;
        AnonymousClass08M r5;
        if (!A04.A0C(snapshot.A04())) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Snapshot is not open: id=");
            A10.append(snapshot.A04());
            A10.append(", disposed=");
            A10.append(snapshot.A03);
            A10.append(", applied=");
            if (!(snapshot instanceof AnonymousClass08M) || (r5 = (AnonymousClass08M) snapshot) == null) {
                obj = "read-only";
            } else {
                obj = Boolean.valueOf(r5.A00);
            }
            A10.append(obj);
            A10.append(", lowestPin=");
            synchronized (A08) {
                AnonymousClass0PM r2 = A06;
                i = -1;
                if (r2.A01 > 0) {
                    i = r2.A04[0];
                }
            }
            A10.append(i);
            throw AnonymousClass000.A0m(A10);
        }
    }

    public static final int A00(C06400Ye r6, int i) {
        int A002;
        int A072 = r6.A07(i);
        synchronized (A08) {
            AnonymousClass0PM r62 = A06;
            AnonymousClass0PM.A01(r62, r62.A01 + 1);
            int i2 = r62.A01;
            r62.A01 = i2 + 1;
            A002 = AnonymousClass0PM.A00(r62);
            int[] iArr = r62.A04;
            iArr[i2] = A072;
            r62.A03[i2] = A002;
            r62.A02[A002] = i2;
            int i3 = iArr[i2];
            while (i2 > 0) {
                int i4 = ((i2 + 1) >> 1) - 1;
                if (iArr[i4] <= i3) {
                    break;
                }
                AnonymousClass0PM.A02(r62, i4, i2);
                i2 = i4;
            }
        }
        return A002;
    }

    public static final C03460Ig A09(Snapshot snapshot, AnonymousClass0t4 r5, C03460Ig r6) {
        C03460Ig A0E;
        if (snapshot.A0K()) {
            snapshot.A0J(r5);
        }
        C03460Ig A0C = A0C(snapshot.A05(), r6, snapshot.A04());
        if (A0C == null) {
            throw AnonymousClass000.A0n("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
        } else if (A0C.A00 == snapshot.A04()) {
            return A0C;
        } else {
            synchronized (A08) {
                A0E = A0E(r5, A0C);
                A0E.A01(A0C);
                A0E.A00 = snapshot.A04();
            }
            C03460Ig r3 = A0E;
            snapshot.A0J(r5);
            return r3;
        }
    }

    public static final C03460Ig A0A(Snapshot snapshot, AnonymousClass0t4 r4, C03460Ig r5, C03460Ig r6) {
        C03460Ig A0E;
        if (snapshot.A0K()) {
            snapshot.A0J(r4);
        }
        int A042 = snapshot.A04();
        if (r6.A00 == A042) {
            return r6;
        }
        synchronized (A08) {
            A0E = A0E(r4, r5);
        }
        A0E.A00 = A042;
        snapshot.A0J(r4);
        return A0E;
    }

    public static final C03460Ig A0B(Snapshot snapshot, C03460Ig r3) {
        C03460Ig A0C = A0C(snapshot.A05(), r3, snapshot.A04());
        if (A0C != null) {
            return A0C;
        }
        throw AnonymousClass000.A0n("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final C03460Ig A0E(AnonymousClass0t4 r5, C03460Ig r6) {
        C03460Ig BRn = r5.BRn();
        AnonymousClass0PM r2 = A06;
        int i = A00;
        if (r2.A01 > 0) {
            i = r2.A04[0];
        }
        int i2 = i - 1;
        C06400Ye A002 = AnonymousClass0EV.A00();
        C03460Ig r22 = null;
        while (BRn != null) {
            if (BRn.A00 != 0) {
                int i3 = BRn.A00;
                if (i3 != 0 && i3 <= i2 && !A002.A0C(i3)) {
                    if (r22 == null) {
                        r22 = BRn;
                    } else if (BRn.A00 >= r22.A00) {
                        BRn = r22;
                    }
                }
                BRn = BRn.A01;
            }
            BRn.A00 = Integer.MAX_VALUE;
            return BRn;
        }
        C03460Ig A003 = r6.A00();
        A003.A00 = Integer.MAX_VALUE;
        A003.A01 = r5.BRn();
        C18070vi.A0z(A003, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        r5.CCU(A003);
        C18070vi.A0z(A003, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return A003;
    }

    public static final C03460Ig A0F(AnonymousClass0t4 r5, C03460Ig r6) {
        Snapshot A012 = A01();
        C22821Di A0A2 = A012.A0A();
        if (A0A2 != null) {
            A0A2.invoke(r5);
        }
        C03460Ig A0C = A0C(A012.A05(), r6, A012.A04());
        if (A0C == null) {
            synchronized (A08) {
                Snapshot A013 = A01();
                C03460Ig BRn = r5.BRn();
                C18070vi.A0z(BRn, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                A0C = A0C(A013.A05(), BRn, A013.A04());
                if (A0C == null) {
                    throw AnonymousClass000.A0n("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }
            }
        }
        return A0C;
    }

    public static final C03460Ig A0G(C03460Ig r3) {
        Snapshot A012 = A01();
        C03460Ig A0C = A0C(A012.A05(), r3, A012.A04());
        if (A0C == null) {
            synchronized (A08) {
                Snapshot A013 = A01();
                A0C = A0C(A013.A05(), r3, A013.A04());
            }
            if (A0C == null) {
                throw AnonymousClass000.A0n("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return A0C;
    }

    public static final HashMap A0J(AnonymousClass08M r12, AnonymousClass08M r13, C06400Ye r14) {
        C03460Ig A0C;
        C06990aB A0L = r13.A0L();
        int A042 = r12.A04();
        if (A0L == null) {
            return null;
        }
        C06400Ye A0B2 = r13.A05().A09(r13.A04()).A0B(r13.A0P());
        Object[] A043 = A0L.A04();
        int size = A0L.size();
        HashMap hashMap = null;
        for (int i = 0; i < size; i++) {
            Object obj = A043[i];
            C18070vi.A0z(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            AnonymousClass0t4 r5 = (AnonymousClass0t4) obj;
            C03460Ig BRn = r5.BRn();
            C03460Ig A0C2 = A0C(r14, BRn, A042);
            if (!(A0C2 == null || (A0C = A0C(A0B2, BRn, A042)) == null || A0C2.equals(A0C))) {
                C03460Ig A0C3 = A0C(r13.A05(), BRn, r13.A04());
                if (A0C3 != null) {
                    C03460Ig Bjn = r5.Bjn(A0C, A0C2, A0C3);
                    if (Bjn == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(A0C2, Bjn);
                } else {
                    throw AnonymousClass000.A0n("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }
            }
        }
        return hashMap;
    }

    public static final void A0V(Snapshot snapshot, AnonymousClass0t4 r2) {
        snapshot.A0I(snapshot.A08() + 1);
        C22821Di A0B2 = snapshot.A0B();
        if (A0B2 != null) {
            A0B2.invoke(r2);
        }
    }

    public static final boolean A0Z(AnonymousClass0t4 r10) {
        AnonymousClass0PM r1 = A06;
        int i = A00;
        if (r1.A01 > 0) {
            i = r1.A04[0];
        }
        C03460Ig r6 = null;
        C03460Ig r4 = null;
        int i2 = 0;
        for (C03460Ig BRn = r10.BRn(); BRn != null; BRn = BRn.A01) {
            int i3 = BRn.A00;
            if (i3 != 0) {
                if (i3 >= i) {
                    i2++;
                } else if (r6 == null) {
                    i2++;
                    r6 = BRn;
                } else {
                    C03460Ig r9 = BRn;
                    if (BRn.A00 < r6.A00) {
                        r9 = r6;
                        r6 = BRn;
                    }
                    if (r4 == null) {
                        r4 = r10.BRn();
                        C03460Ig r2 = r4;
                        while (true) {
                            if (r4 != null) {
                                if (r4.A00 >= i) {
                                    break;
                                }
                                if (r2.A00 < r4.A00) {
                                    r2 = r4;
                                }
                                r4 = r4.A01;
                            } else {
                                r4 = r2;
                                break;
                            }
                        }
                    }
                    r6.A00 = 0;
                    r6.A01(r4);
                    r6 = r9;
                }
            }
        }
        if (i2 > 1) {
            return true;
        }
        return false;
    }
}
