package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class DVP implements Set<AnonymousClass1BI>, C23171Ey {
    public final AnonymousClass00H A00;
    public final Set A01 = C17880vN.A14();

    public DVP(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* renamed from: A00 */
    public boolean add(AnonymousClass1BI r5) {
        C18070vi.A0d(r5, 0);
        int size = size();
        int A002 = C18020vd.A00(C18040vf.A02, AnonymousClass3MX.A0y(this.A00).A01, 12233);
        Integer valueOf = Integer.valueOf(A002);
        if (A002 < 0 || valueOf == null) {
            A002 = Integer.MAX_VALUE;
        }
        if (size >= A002) {
            return false;
        }
        return this.A01.add(r5);
    }

    public boolean addAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        return this.A01.addAll(collection);
    }

    public void clear() {
        this.A01.clear();
    }

    public boolean containsAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        return this.A01.containsAll(collection);
    }

    public boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public Iterator iterator() {
        return this.A01.iterator();
    }

    public boolean removeAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        return this.A01.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        return this.A01.retainAll(collection);
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        return C25916Coa.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof AnonymousClass1BI)) {
            return false;
        }
        C18070vi.A0d(obj, 0);
        return this.A01.contains(obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof AnonymousClass1BI)) {
            return false;
        }
        C18070vi.A0d(obj, 0);
        return this.A01.remove(obj);
    }

    public final /* bridge */ int size() {
        return this.A01.size();
    }
}
