package X;

/* renamed from: X.1aa  reason: invalid class name and case insensitive filesystem */
public final class C28591aa extends AnonymousClass1IX<Object> {
    public final transient Object[] alternatingKeysAndValues;
    public final transient int offset;
    public final transient int size;

    public boolean isPartialView() {
        return true;
    }

    public Object get(int i) {
        C199610h.A01(i, this.size);
        Object obj = this.alternatingKeysAndValues[(i * 2) + this.offset];
        obj.getClass();
        return obj;
    }

    public C28591aa(Object[] objArr, int i, int i2) {
        this.alternatingKeysAndValues = objArr;
        this.offset = i;
        this.size = i2;
    }

    public int size() {
        return this.size;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
