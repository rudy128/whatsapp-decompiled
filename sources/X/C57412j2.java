package X;

/* renamed from: X.2j2  reason: invalid class name and case insensitive filesystem */
public final class C57412j2 {
    public final Object key;
    public final Object value1;
    public final Object value2;

    public C57412j2(Object obj, Object obj2, Object obj3) {
        this.key = obj;
        this.value1 = obj2;
        this.value2 = obj3;
    }

    public IllegalArgumentException exception() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Multiple entries with same key: ");
        A10.append(this.key);
        A10.append("=");
        A10.append(this.value1);
        A10.append(" and ");
        A10.append(this.key);
        A10.append("=");
        return AnonymousClass000.A0k(C17890vO.A0V(this.value2, A10));
    }
}
