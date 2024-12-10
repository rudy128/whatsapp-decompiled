package X;

/* renamed from: X.0xL  reason: invalid class name and case insensitive filesystem */
public final class C18900xL implements C18140vp {
    public static final Object A02 = new Object();
    public volatile Object A00;
    public volatile C18140vp A01;

    public Object get() {
        Object obj;
        Object obj2 = this.A00;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A00;
            if (obj == obj3) {
                obj = this.A01.get();
                Object obj4 = this.A00;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A00 = obj;
                    this.A01 = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Scoped provider was invoked recursively returning different results: ");
                    sb.append(obj4);
                    sb.append(" & ");
                    sb.append(obj);
                    sb.append(". This is likely due to a circular dependency.");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        return obj;
    }
}
