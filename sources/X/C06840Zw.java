package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.0Zw  reason: invalid class name and case insensitive filesystem */
public final class C06840Zw implements List<AnonymousClass0XW>, C18450wR {
    public final int A00;
    public final int A01;
    public final /* synthetic */ C06850Zx A02;

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C25916Coa.A01(this, objArr);
    }

    public C06840Zw(C06850Zx r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public int A00(AnonymousClass0XW r5) {
        int i = this.A01;
        int i2 = i;
        int i3 = this.A00;
        if (i > i3) {
            return -1;
        }
        while (!C18070vi.A18(this.A02.A03[i], r5)) {
            if (i == i3) {
                return -1;
            }
            i++;
        }
        return i - i2;
    }

    public int A01(AnonymousClass0XW r4) {
        int i = this.A00;
        int i2 = this.A01;
        if (i2 > i) {
            return -1;
        }
        while (!C18070vi.A18(this.A02.A03[i], r4)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    /* renamed from: A02 */
    public AnonymousClass0XW get(int i) {
        Object obj = this.A02.A03[i + this.A01];
        C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AnonymousClass0XW) obj;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof AnonymousClass0XW)) {
            return false;
        }
        return AnonymousClass000.A1S(indexOf(obj), -1);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof AnonymousClass0XW)) {
            return -1;
        }
        return A00((AnonymousClass0XW) obj);
    }

    public Iterator iterator() {
        C06850Zx r3 = this.A02;
        int i = this.A01;
        return new C06930a5(r3, i, i, this.A00);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof AnonymousClass0XW)) {
            return -1;
        }
        return A01((AnonymousClass0XW) obj);
    }

    public ListIterator listIterator(int i) {
        C06850Zx r3 = this.A02;
        int i2 = this.A01;
        return new C06930a5(r3, i + i2, i2, this.A00);
    }

    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    public List subList(int i, int i2) {
        C06850Zx r2 = this.A02;
        int i3 = this.A01;
        return new C06840Zw(r2, i + i3, i3 + i2);
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw AnonymousClass000.A12();
    }

    public boolean addAll(int i, Collection collection) {
        throw AnonymousClass000.A12();
    }

    public void clear() {
        throw AnonymousClass000.A12();
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw AnonymousClass000.A12();
    }

    public boolean removeAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw AnonymousClass000.A12();
    }

    public boolean retainAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw AnonymousClass000.A12();
    }

    public void sort(Comparator comparator) {
        throw AnonymousClass000.A12();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass000.A12();
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public ListIterator listIterator() {
        C06850Zx r3 = this.A02;
        int i = this.A01;
        return new C06930a5(r3, i, i, this.A00);
    }

    public boolean remove(Object obj) {
        throw AnonymousClass000.A12();
    }
}
