package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.0Zu  reason: invalid class name and case insensitive filesystem */
public final class C06820Zu<T> implements AnonymousClass0t4, List<T>, RandomAccess, AnonymousClass1JB {
    public C03460Ig A00 = new C013708f(AnonymousClass0EO.A00());

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C25916Coa.A01(this, objArr);
    }

    public static C013708f A00(Object obj) {
        return (C013708f) C05200Qx.A0G((C013708f) obj);
    }

    private final boolean A01(C22821Di r9) {
        int i;
        C17800vF A02;
        Object invoke;
        Snapshot A01;
        boolean z;
        do {
            Object obj = C04110Lw.A00;
            synchronized (obj) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C013708f A002 = A00(r0);
                i = A002.A00;
                A02 = A002.A02();
            }
            C18070vi.A0b(A02);
            C07360ao BDf = A02.BDf();
            invoke = r9.invoke(BDf);
            C17800vF A0V = BDf.A0V();
            if (C18070vi.A18(A0V, A02)) {
                break;
            }
            C03460Ig r02 = this.A00;
            C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                C013708f r2 = (C013708f) C05200Qx.A09(A01, this, r02);
                synchronized (obj) {
                    int i2 = r2.A00;
                    if (i2 == i) {
                        r2.A03(A0V);
                        z = true;
                        r2.A00 = i2 + 1;
                        r2.A01++;
                    } else {
                        z = false;
                    }
                }
            }
            C05200Qx.A0V(A01, this);
        } while (!z);
        return AnonymousClass000.A1Y(invoke);
    }

    public final int A02() {
        C03460Ig r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C013708f) C05200Qx.A0G(r1)).A01;
    }

    public final C013708f A04() {
        C03460Ig r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C013708f) C05200Qx.A0F(this, r1);
    }

    public final void A06(int i, int i2) {
        int i3;
        C17800vF A02;
        Snapshot A01;
        boolean z;
        do {
            Object obj = C04110Lw.A00;
            synchronized (obj) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C013708f A002 = A00(r0);
                i3 = A002.A00;
                A02 = A002.A02();
            }
            C18070vi.A0b(A02);
            C07360ao BDf = A02.BDf();
            BDf.subList(i, i2).clear();
            C17800vF A0V = BDf.A0V();
            if (!C18070vi.A18(A0V, A02)) {
                C03460Ig r02 = this.A00;
                C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C05200Qx.A08) {
                    A01 = C05200Qx.A01();
                    C013708f r2 = (C013708f) C05200Qx.A09(A01, this, r02);
                    synchronized (obj) {
                        int i4 = r2.A00;
                        if (i4 == i3) {
                            r2.A03(A0V);
                            z = true;
                            r2.A00 = i4 + 1;
                            r2.A01++;
                        } else {
                            z = false;
                        }
                    }
                }
                C05200Qx.A0V(A01, this);
            } else {
                return;
            }
        } while (!z);
    }

    public void CCU(C03460Ig r2) {
        r2.A01 = this.A00;
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.A00 = r2;
    }

    public void add(int i, Object obj) {
        int i2;
        C17800vF A02;
        Snapshot A01;
        boolean z;
        do {
            Object obj2 = C04110Lw.A00;
            synchronized (obj2) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C013708f A002 = A00(r0);
                i2 = A002.A00;
                A02 = A002.A02();
            }
            C18070vi.A0b(A02);
            C17800vF BAp = A02.BAp(obj, i);
            if (!C18070vi.A18(BAp, A02)) {
                C03460Ig r02 = this.A00;
                C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C05200Qx.A08) {
                    A01 = C05200Qx.A01();
                    C013708f r3 = (C013708f) C05200Qx.A09(A01, this, r02);
                    synchronized (obj2) {
                        int i3 = r3.A00;
                        if (i3 == i2) {
                            r3.A03(BAp);
                            z = true;
                            r3.A01++;
                            r3.A00 = i3 + 1;
                        } else {
                            z = false;
                        }
                    }
                }
                C05200Qx.A0V(A01, this);
            } else {
                return;
            }
        } while (!z);
    }

    public boolean addAll(int i, Collection collection) {
        return A01(new C10340iB(collection, i));
    }

    public void clear() {
        Snapshot A01;
        C03460Ig r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (C05200Qx.A08) {
            A01 = C05200Qx.A01();
            C013708f r2 = (C013708f) C05200Qx.A09(A01, this, r1);
            synchronized (C04110Lw.A00) {
                r2.A03(AnonymousClass0EO.A00());
                r2.A00++;
                r2.A01++;
            }
        }
        C05200Qx.A0V(A01, this);
    }

    public ListIterator listIterator(int i) {
        return new C06920a4(this, i);
    }

    public boolean remove(Object obj) {
        int i;
        C17800vF A02;
        boolean z;
        Snapshot A01;
        do {
            Object obj2 = C04110Lw.A00;
            synchronized (obj2) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C013708f A002 = A00(r0);
                i = A002.A00;
                A02 = A002.A02();
            }
            C18070vi.A0b(A02);
            C17800vF CEV = A02.CEV(obj);
            z = false;
            if (C18070vi.A18(CEV, A02)) {
                return false;
            }
            C03460Ig r02 = this.A00;
            C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                C013708f r2 = (C013708f) C05200Qx.A09(A01, this, r02);
                synchronized (obj2) {
                    int i2 = r2.A00;
                    if (i2 == i) {
                        r2.A03(CEV);
                        r2.A01++;
                        r2.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            C05200Qx.A0V(A01, this);
        } while (!z);
        return true;
    }

    public boolean removeAll(Collection collection) {
        int i;
        C17800vF A02;
        boolean z;
        Snapshot A01;
        do {
            Object obj = C04110Lw.A00;
            synchronized (obj) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C013708f A002 = A00(r0);
                i = A002.A00;
                A02 = A002.A02();
            }
            C18070vi.A0b(A02);
            C17800vF CEY = A02.CEY(collection);
            z = false;
            if (C18070vi.A18(CEY, A02)) {
                return false;
            }
            C03460Ig r02 = this.A00;
            C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                C013708f r2 = (C013708f) C05200Qx.A09(A01, this, r02);
                synchronized (obj) {
                    int i2 = r2.A00;
                    if (i2 == i) {
                        r2.A03(CEY);
                        r2.A01++;
                        r2.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            C05200Qx.A0V(A01, this);
        } while (!z);
        return true;
    }

    public boolean retainAll(Collection collection) {
        return A01(new C09890hS(collection));
    }

    public List subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= size()) {
            return new C06880a0(this, i, i2);
        }
        throw AnonymousClass000.A0k("fromIndex or toIndex are out of bounds");
    }

    public final int A03(Collection collection, int i, int i2) {
        int i3;
        C17800vF A02;
        Snapshot A01;
        boolean z;
        int size = size();
        do {
            Object obj = C04110Lw.A00;
            synchronized (obj) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C013708f A002 = A00(r0);
                i3 = A002.A00;
                A02 = A002.A02();
            }
            C18070vi.A0b(A02);
            C07360ao BDf = A02.BDf();
            BDf.subList(i, i2).retainAll(collection);
            C17800vF A0V = BDf.A0V();
            if (C18070vi.A18(A0V, A02)) {
                break;
            }
            C03460Ig r02 = this.A00;
            C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                C013708f r2 = (C013708f) C05200Qx.A09(A01, this, r02);
                synchronized (obj) {
                    int i4 = r2.A00;
                    if (i4 == i3) {
                        r2.A03(A0V);
                        z = true;
                        r2.A00 = i4 + 1;
                        r2.A01++;
                    } else {
                        z = false;
                    }
                }
            }
            C05200Qx.A0V(A01, this);
        } while (!z);
        return size - size();
    }

    public Object A05(int i) {
        int i2;
        C17800vF A02;
        Snapshot A01;
        boolean z;
        Object obj = get(i);
        do {
            Object obj2 = C04110Lw.A00;
            synchronized (obj2) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C013708f A002 = A00(r0);
                i2 = A002.A00;
                A02 = A002.A02();
            }
            C18070vi.A0b(A02);
            C17800vF CEb = A02.CEb(i);
            if (C18070vi.A18(CEb, A02)) {
                return obj;
            }
            C03460Ig r02 = this.A00;
            C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                C013708f r3 = (C013708f) C05200Qx.A09(A01, this, r02);
                synchronized (obj2) {
                    int i3 = r3.A00;
                    if (i3 == i2) {
                        r3.A03(CEb);
                        z = true;
                        r3.A01++;
                        r3.A00 = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            C05200Qx.A0V(A01, this);
        } while (!z);
        return obj;
    }

    public C03460Ig BRn() {
        return this.A00;
    }

    public boolean contains(Object obj) {
        return A04().A02().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return A04().A02().containsAll(collection);
    }

    public Object get(int i) {
        return A04().A02().get(i);
    }

    public int indexOf(Object obj) {
        return A04().A02().indexOf(obj);
    }

    public boolean isEmpty() {
        return A04().A02().isEmpty();
    }

    public Iterator iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        return A04().A02().lastIndexOf(obj);
    }

    public Object set(int i, Object obj) {
        int i2;
        C17800vF A02;
        Snapshot A01;
        boolean z;
        Object obj2 = get(i);
        do {
            Object obj3 = C04110Lw.A00;
            synchronized (obj3) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C013708f A002 = A00(r0);
                i2 = A002.A00;
                A02 = A002.A02();
            }
            C18070vi.A0b(A02);
            C17800vF CHk = A02.CHk(obj, i);
            if (C18070vi.A18(CHk, A02)) {
                return obj2;
            }
            C03460Ig r02 = this.A00;
            C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                C013708f r2 = (C013708f) C05200Qx.A09(A01, this, r02);
                synchronized (obj3) {
                    int i3 = r2.A00;
                    if (i3 == i2) {
                        r2.A03(CHk);
                        z = true;
                        r2.A00 = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            C05200Qx.A0V(A01, this);
        } while (!z);
        return obj2;
    }

    public final /* bridge */ int size() {
        return A04().A02().size();
    }

    public /* synthetic */ C03460Ig Bjn(C03460Ig r2, C03460Ig r3, C03460Ig r4) {
        return null;
    }

    public boolean add(Object obj) {
        int i;
        C17800vF A02;
        boolean z;
        Snapshot A01;
        do {
            Object obj2 = C04110Lw.A00;
            synchronized (obj2) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C013708f A002 = A00(r0);
                i = A002.A00;
                A02 = A002.A02();
            }
            C18070vi.A0b(A02);
            C17800vF BAl = A02.BAl(obj);
            z = false;
            if (C18070vi.A18(BAl, A02)) {
                return false;
            }
            C03460Ig r02 = this.A00;
            C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                C013708f r2 = (C013708f) C05200Qx.A09(A01, this, r02);
                synchronized (obj2) {
                    int i2 = r2.A00;
                    if (i2 == i) {
                        r2.A03(BAl);
                        r2.A01++;
                        r2.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            C05200Qx.A0V(A01, this);
        } while (!z);
        return true;
    }

    public boolean addAll(Collection collection) {
        int i;
        C17800vF A02;
        boolean z;
        Snapshot A01;
        do {
            Object obj = C04110Lw.A00;
            synchronized (obj) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C013708f A002 = A00(r0);
                i = A002.A00;
                A02 = A002.A02();
            }
            C18070vi.A0b(A02);
            C17800vF BAx = A02.BAx(collection);
            z = false;
            if (C18070vi.A18(BAx, A02)) {
                return false;
            }
            C03460Ig r02 = this.A00;
            C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                C013708f r2 = (C013708f) C05200Qx.A09(A01, this, r02);
                synchronized (obj) {
                    int i2 = r2.A00;
                    if (i2 == i) {
                        r2.A03(BAx);
                        r2.A01++;
                        r2.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            C05200Qx.A0V(A01, this);
        } while (!z);
        return true;
    }

    public ListIterator listIterator() {
        return new C06920a4(this, 0);
    }

    public final /* bridge */ Object remove(int i) {
        return A05(i);
    }
}
