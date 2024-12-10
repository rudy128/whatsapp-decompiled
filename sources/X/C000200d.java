package X;

/* renamed from: X.00d  reason: invalid class name and case insensitive filesystem */
public final class C000200d implements AnonymousClass00H, AnonymousClass00S {
    public static final Object A02 = new Object();
    public volatile AnonymousClass00S A00;
    public volatile Object A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.00d, java.lang.Object, X.00H] */
    public static AnonymousClass00H A00(AnonymousClass00S r2) {
        if (r2 instanceof AnonymousClass00H) {
            return (AnonymousClass00H) r2;
        }
        AnonymousClass00W.A01(r2);
        ? obj = new Object();
        obj.A01 = A02;
        obj.A00 = r2;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.00S, X.00d, java.lang.Object] */
    public static AnonymousClass00S A01(AnonymousClass00S r2) {
        if (r2 instanceof C000200d) {
            return r2;
        }
        ? obj = new Object();
        obj.A01 = A02;
        obj.A00 = r2;
        return obj;
    }

    public Object get() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.get();
                Object obj4 = this.A01;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A01 = obj;
                    this.A00 = null;
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
