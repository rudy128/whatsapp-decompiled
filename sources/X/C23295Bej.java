package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Bej  reason: case insensitive filesystem */
public final class C23295Bej<E> extends C27292DbL<E> {
    public static final C23295Bej A01;
    public final List A00;

    public C23295Bej(List list) {
        this.A00 = list;
    }

    public final void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final Object get(int i) {
        return this.A00.get(i);
    }

    public final Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return remove;
    }

    public final Object set(int i, Object obj) {
        A01();
        Object obj2 = this.A00.set(i, obj);
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.A00.size();
    }

    static {
        C23295Bej bej = new C23295Bej();
        A01 = bej;
        bej.A00 = false;
    }

    public C23295Bej() {
        this(C17880vN.A0z(10));
    }

    public final /* synthetic */ EE7 CTh(int i) {
        if (i >= size()) {
            ArrayList A0z = C17880vN.A0z(i);
            A0z.addAll(this.A00);
            return new C23295Bej(A0z);
        }
        throw BE6.A0j();
    }
}
