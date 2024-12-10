package X;

/* renamed from: X.1IY  reason: invalid class name */
public class AnonymousClass1IY<E> extends AnonymousClass1IX<E> {
    public static final AnonymousClass1IX EMPTY = new AnonymousClass1IY(new Object[0], 0);
    public final transient Object[] array;
    public final transient int size;

    public int internalArrayStart() {
        return 0;
    }

    public boolean isPartialView() {
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.array, 0, objArr, i, this.size);
        return i + this.size;
    }

    public Object get(int i) {
        C199610h.A01(i, this.size);
        Object obj = this.array[i];
        obj.getClass();
        return obj;
    }

    public AnonymousClass1IY(Object[] objArr, int i) {
        this.array = objArr;
        this.size = i;
    }

    public Object[] internalArray() {
        return this.array;
    }

    public int internalArrayEnd() {
        return this.size;
    }

    public int size() {
        return this.size;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
