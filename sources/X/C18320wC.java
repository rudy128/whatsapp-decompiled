package X;

/* renamed from: X.0wC  reason: invalid class name and case insensitive filesystem */
public class C18320wC implements C18290w6 {
    public static final Object A02 = new Object();
    public volatile C18290w6 A00;
    public volatile Object A01 = A02;

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
                this.A01 = obj;
                this.A00 = null;
            }
        }
        return obj;
    }

    public C18320wC(C18290w6 r2) {
        this.A00 = r2;
    }
}
