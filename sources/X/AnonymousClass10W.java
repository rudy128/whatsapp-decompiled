package X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.10W  reason: invalid class name */
public final class AnonymousClass10W implements Iterable, C18450wR {
    public final AnonymousClass00H A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue A02 = new ConcurrentLinkedQueue();

    public AnonymousClass10W(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(C27581Wq r4, AnonymousClass1F9 r5, Object obj) {
        if (((C23391Fw) r5.getLifecycle()).A02 == C23401Fx.DESTROYED) {
            return false;
        }
        AnonymousClass2LU r1 = new AnonymousClass2LU(r4, r5, obj, new C147977gh(this, 29));
        if (this.A01.putIfAbsent(obj, r1) != null) {
            return false;
        }
        this.A02.add(obj);
        r1.A00();
        return true;
    }

    public final boolean A01(Object obj) {
        AnonymousClass11L r1 = (AnonymousClass11L) this.A01.remove(obj);
        if (r1 != null && (r1 instanceof AnonymousClass2LU)) {
            AnonymousClass2LU r12 = (AnonymousClass2LU) r1;
            C17960vV.A02();
            r12.A00.getLifecycle().A06(r12);
        }
        return this.A02.remove(obj);
    }

    public Iterator iterator() {
        return C23921Id.unmodifiableIterator(C23921Id.concat(((Set) this.A00.get()).iterator(), this.A02.iterator()));
    }
}
