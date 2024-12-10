package X;

/* renamed from: X.1HX  reason: invalid class name */
public final class AnonymousClass1HX<E> extends C199410f<E> {
    public static final AnonymousClass1HX EMPTY;
    public static final Object[] EMPTY_ARRAY;
    public final transient Object[] elements;
    public final transient int hashCode;
    public final transient int mask;
    public final transient int size;
    public final transient Object[] table;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY = new AnonymousClass1HX(objArr, 0, objArr, 0, 0);
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.table;
        if (obj != null && objArr.length != 0) {
            int smearedHash = AnonymousClass111.smearedHash(obj);
            while (true) {
                int i = smearedHash & this.mask;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    smearedHash = i + 1;
                }
            }
        }
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.elements, 0, objArr, i, this.size);
        return i + this.size;
    }

    public AnonymousClass1IX createAsList() {
        return AnonymousClass1IX.asImmutableList(this.elements, this.size);
    }

    public AnonymousClass1HX(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.hashCode = i;
        this.table = objArr2;
        this.mask = i2;
        this.size = i3;
    }

    public int hashCode() {
        return this.hashCode;
    }

    public Object[] internalArray() {
        return this.elements;
    }

    public int internalArrayEnd() {
        return this.size;
    }

    public AnonymousClass1IZ iterator() {
        return asList().iterator();
    }

    public int size() {
        return this.size;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
