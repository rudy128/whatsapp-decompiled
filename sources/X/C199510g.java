package X;

/* renamed from: X.10g  reason: invalid class name and case insensitive filesystem */
public final class C199510g<E> extends C199410f<E> {
    public final transient Object element;

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return 1;
    }

    public AnonymousClass1IX asList() {
        return AnonymousClass1IX.of(this.element);
    }

    public boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    public int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.element;
        return i + 1;
    }

    public final int hashCode() {
        return this.element.hashCode();
    }

    public AnonymousClass1IZ iterator() {
        return C23921Id.singletonIterator(this.element);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.element.toString());
        sb.append(']');
        return sb.toString();
    }

    public C199510g(Object obj) {
        C199610h.A04(obj);
        this.element = obj;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
