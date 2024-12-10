package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.08P  reason: invalid class name */
public final class AnonymousClass08P<K, V> extends C07000aC<K, V, K> {
    public boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object containsKey : collection) {
                if (!A00().containsKey(containsKey)) {
                    return false;
                }
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        C04120Lx.A00();
        throw null;
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        C04120Lx.A00();
        throw null;
    }

    public boolean contains(Object obj) {
        return A00().containsKey(obj);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0vH, java.util.Map] */
    public /* bridge */ /* synthetic */ Iterator iterator() {
        C06960a8 A00 = A00();
        return new AnonymousClass08T(A00, AnonymousClass000.A15(A00.A01().A02()));
    }

    public boolean remove(Object obj) {
        return AnonymousClass000.A1W(A00().remove(obj));
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (A00().remove(it.next()) != null || z) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection collection) {
        C17820vH A02;
        int i;
        boolean z;
        Snapshot A01;
        Set A12 = C29431cG.A12(collection);
        C06960a8 A00 = A00();
        boolean z2 = false;
        do {
            Object obj = C04120Lx.A00;
            synchronized (obj) {
                C03460Ig BRn = A00.BRn();
                C18070vi.A0z(BRn, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C013608e r0 = (C013608e) C05200Qx.A0G((C013608e) BRn);
                A02 = r0.A02();
                i = r0.A00;
            }
            C18070vi.A0b(A02);
            C17830vI BDe = A02.BDe();
            Iterator it = A00.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry A16 = AnonymousClass000.A16(it);
                if (!A12.contains(A16.getKey())) {
                    BDe.remove(A16.getKey());
                    z2 = true;
                }
            }
            C17820vH BDO = BDe.BDO();
            if (C18070vi.A18(BDO, A02)) {
                break;
            }
            C03460Ig BRn2 = A00.BRn();
            C18070vi.A0z(BRn2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C05200Qx.A08) {
                A01 = C05200Qx.A01();
                C013608e r1 = (C013608e) C05200Qx.A09(A01, A00, BRn2);
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
            C05200Qx.A0V(A01, A00);
        } while (!z);
        return z2;
    }

    public AnonymousClass08P(C06960a8 r1) {
        super(r1);
    }
}
