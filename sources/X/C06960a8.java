package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0a8  reason: invalid class name and case insensitive filesystem */
public final class C06960a8<K, V> implements AnonymousClass0t4, Map<K, V>, C41611wl {
    public C03460Ig A00 = new C013608e(AnonymousClass0EP.A00());
    public final Collection A01 = new AnonymousClass08Q(this);
    public final Set A02 = new AnonymousClass08R(this);
    public final Set A03 = new AnonymousClass08P(this);

    public final C013608e A01() {
        C03460Ig r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C013608e) C05200Qx.A0F(this, r1);
    }

    public void CCU(C03460Ig r2) {
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.A00 = r2;
    }

    public void clear() {
        Snapshot A012;
        C03460Ig r0 = this.A00;
        C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C07340am A002 = AnonymousClass0EP.A00();
        if (A002 != ((C013608e) C05200Qx.A0G(r0)).A02()) {
            C03460Ig r02 = this.A00;
            C18070vi.A0z(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C05200Qx.A08) {
                A012 = C05200Qx.A01();
                C013608e r2 = (C013608e) C05200Qx.A09(A012, this, r02);
                synchronized (C04120Lx.A00) {
                    r2.A03(A002);
                    r2.A00++;
                }
            }
            C05200Qx.A0V(A012, this);
        }
    }

    public Object put(Object obj, Object obj2) {
        C17820vH A022;
        int i;
        Object put;
        Snapshot A012;
        boolean z;
        do {
            Object obj3 = C04120Lx.A00;
            synchronized (obj3) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C013608e r02 = (C013608e) C05200Qx.A0G((C013608e) r0);
                A022 = r02.A02();
                i = r02.A00;
            }
            C18070vi.A0b(A022);
            C17830vI BDe = A022.BDe();
            put = BDe.put(obj, obj2);
            C17820vH BDO = BDe.BDO();
            if (C18070vi.A18(BDO, A022)) {
                break;
            }
            C03460Ig r03 = this.A00;
            C18070vi.A0z(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C05200Qx.A08) {
                A012 = C05200Qx.A01();
                C013608e r2 = (C013608e) C05200Qx.A09(A012, this, r03);
                synchronized (obj3) {
                    int i2 = r2.A00;
                    if (i2 == i) {
                        r2.A03(BDO);
                        z = true;
                        r2.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            C05200Qx.A0V(A012, this);
        } while (!z);
        return put;
    }

    public void putAll(Map map) {
        C17820vH A022;
        int i;
        Snapshot A012;
        boolean z;
        do {
            Object obj = C04120Lx.A00;
            synchronized (obj) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C013608e r02 = (C013608e) C05200Qx.A0G((C013608e) r0);
                A022 = r02.A02();
                i = r02.A00;
            }
            C18070vi.A0b(A022);
            C17830vI BDe = A022.BDe();
            BDe.putAll(map);
            C17820vH BDO = BDe.BDO();
            if (!C18070vi.A18(BDO, A022)) {
                C03460Ig r03 = this.A00;
                C18070vi.A0z(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (C05200Qx.A08) {
                    A012 = C05200Qx.A01();
                    C013608e r2 = (C013608e) C05200Qx.A09(A012, this, r03);
                    synchronized (obj) {
                        int i2 = r2.A00;
                        if (i2 == i) {
                            r2.A03(BDO);
                            z = true;
                            r2.A00 = i2 + 1;
                        } else {
                            z = false;
                        }
                    }
                }
                C05200Qx.A0V(A012, this);
            } else {
                return;
            }
        } while (!z);
    }

    public Object remove(Object obj) {
        C17820vH A022;
        int i;
        Object remove;
        Snapshot A012;
        boolean z;
        do {
            Object obj2 = C04120Lx.A00;
            synchronized (obj2) {
                C03460Ig r0 = this.A00;
                C18070vi.A0z(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C013608e r02 = (C013608e) C05200Qx.A0G((C013608e) r0);
                A022 = r02.A02();
                i = r02.A00;
            }
            C18070vi.A0b(A022);
            C17830vI BDe = A022.BDe();
            remove = BDe.remove(obj);
            C17820vH BDO = BDe.BDO();
            if (C18070vi.A18(BDO, A022)) {
                break;
            }
            C03460Ig r03 = this.A00;
            C18070vi.A0z(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C05200Qx.A08) {
                A012 = C05200Qx.A01();
                C013608e r2 = (C013608e) C05200Qx.A09(A012, this, r03);
                synchronized (obj2) {
                    int i2 = r2.A00;
                    if (i2 == i) {
                        r2.A03(BDO);
                        z = true;
                        r2.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            C05200Qx.A0V(A012, this);
        } while (!z);
        return remove;
    }

    public final int A00() {
        return A01().A00;
    }

    public final boolean A02(Object obj) {
        Object obj2;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C18070vi.A18(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    public C03460Ig BRn() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0vH, java.util.Map] */
    public boolean containsKey(Object obj) {
        return A01().A02().containsKey(obj);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0vH, java.util.Map] */
    public boolean containsValue(Object obj) {
        return A01().A02().containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0vH, java.util.Map] */
    public Object get(Object obj) {
        return A01().A02().get(obj);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0vH, java.util.Map] */
    public boolean isEmpty() {
        return A01().A02().isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0vH, java.util.Map] */
    public final /* bridge */ int size() {
        return A01().A02().size();
    }

    public final /* bridge */ Collection values() {
        return this.A01;
    }

    public /* synthetic */ C03460Ig Bjn(C03460Ig r2, C03460Ig r3, C03460Ig r4) {
        return null;
    }
}
