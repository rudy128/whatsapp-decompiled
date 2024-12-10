package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.08R  reason: invalid class name */
public final class AnonymousClass08R<K, V> extends C07000aC<K, V, Map.Entry<K, V>> {
    public boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean retainAll(Collection collection) {
        C17820vH A02;
        int i;
        boolean z;
        Snapshot A01;
        int A03 = C200610r.A03(C29351c6.A0C(collection, 10));
        if (A03 < 16) {
            A03 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A03);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            AnonymousClass1D6 A00 = AnonymousClass6YK.A00(A16.getKey(), A16.getValue());
            linkedHashMap.put(A00.A06(), A00.A07());
        }
        C06960a8 A002 = A00();
        boolean z2 = false;
        do {
            Object obj = C04120Lx.A00;
            synchronized (obj) {
                C03460Ig BRn = A002.BRn();
                C18070vi.A0z(BRn, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C013608e r0 = (C013608e) C05200Qx.A0G((C013608e) BRn);
                A02 = r0.A02();
                i = r0.A00;
            }
            C18070vi.A0b(A02);
            C17830vI BDe = A02.BDe();
            Iterator it2 = A002.entrySet().iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry A162 = AnonymousClass000.A16(it2);
                if (!linkedHashMap.containsKey(A162.getKey()) || !C18070vi.A18(linkedHashMap.get(A162.getKey()), A162.getValue())) {
                    BDe.remove(A162.getKey());
                    z2 = true;
                }
            }
            C17820vH BDO = BDe.BDO();
            if (C18070vi.A18(BDO, A02)) {
                break;
            }
            C03460Ig BRn2 = A002.BRn();
            C18070vi.A0z(BRn2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                C013608e r1 = (C013608e) C05200Qx.A09(A01, A002, BRn2);
                synchronized (obj) {
                    int i2 = r1.A00;
                    if (i2 == i) {
                        r1.A03(BDO);
                        r1.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            C05200Qx.A0V(A01, A002);
        } while (!z);
        return z2;
    }

    public boolean A01(Map.Entry entry) {
        return C18070vi.A18(A00().get(entry.getKey()), entry.getValue());
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        C04120Lx.A00();
        throw null;
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        C04120Lx.A00();
        throw null;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!C41681wt.A07(obj)) {
            return false;
        }
        return A01((Map.Entry) obj);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0vH, java.util.Map] */
    public Iterator iterator() {
        C06960a8 A00 = A00();
        return new AnonymousClass08S(A00, AnonymousClass000.A15(A00.A01().A02()));
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!C41681wt.A07(obj) || A00().remove(((Map.Entry) obj).getKey()) == null) {
            return false;
        }
        return true;
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (A00().remove(AnonymousClass000.A16(it).getKey()) != null || z) {
                    z = true;
                }
            }
        }
    }

    public AnonymousClass08R(C06960a8 r1) {
        super(r1);
    }
}
