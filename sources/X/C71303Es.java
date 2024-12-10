package X;

import java.util.LinkedHashSet;

/* renamed from: X.3Es  reason: invalid class name and case insensitive filesystem */
public final class C71303Es<T> extends LinkedHashSet<T> {
    public final int maxSize = 30;

    public boolean add(Object obj) {
        boolean add = super.add(obj);
        if (add && size() >= this.maxSize) {
            remove(C29431cG.A0X(this));
        }
        return add;
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
