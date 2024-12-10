package X;

/* renamed from: X.2AL  reason: invalid class name */
public final class AnonymousClass2AL<K> extends C199410f<K> {
    public final transient AnonymousClass1IX list;
    public final transient C201110w map;

    public boolean isPartialView() {
        return true;
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1W(this.map.get(obj));
    }

    public int size() {
        return this.map.size();
    }

    public AnonymousClass2AL(C201110w r1, AnonymousClass1IX r2) {
        this.map = r1;
        this.list = r2;
    }

    public AnonymousClass1IX asList() {
        return this.list;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    public AnonymousClass1IZ iterator() {
        return asList().iterator();
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
