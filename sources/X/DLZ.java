package X;

public final class DLZ implements C28666EDd {
    public static final Object A02 = C17880vN.A0p();
    public volatile C28666EDd A00;
    public volatile Object A01 = A02;

    public DLZ(C28666EDd eDd) {
        this.A00 = eDd;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.a();
                Object obj4 = this.A01;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A01 = obj;
                    this.A00 = null;
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Scoped provider was invoked recursively returning different results: ");
                    A10.append(obj4);
                    A10.append(" & ");
                    A10.append(obj);
                    throw AnonymousClass000.A0o(". This is likely due to a circular dependency.", A10);
                }
            }
        }
        return obj;
    }
}
