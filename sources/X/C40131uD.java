package X;

import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: X.1uD  reason: invalid class name and case insensitive filesystem */
public final class C40131uD extends AbstractList<C40081u8> implements RandomAccess {
    public static final C40141uE A02 = new Object();
    public final int[] A00;
    public final C40081u8[] A01;

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C40081u8)) {
            return super.contains(obj);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return this.A01[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof C40081u8)) {
            return super.indexOf(obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof C40081u8)) {
            return super.lastIndexOf(obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof C40081u8)) {
            return super.remove(obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return this.A01.length;
    }

    public C40131uD(int[] iArr, C40081u8[] r2) {
        this.A01 = r2;
        this.A00 = iArr;
    }
}
