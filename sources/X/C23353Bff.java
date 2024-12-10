package X;

/* renamed from: X.Bff  reason: case insensitive filesystem */
public final class C23353Bff extends C27102DUg {
    public static final Object A01 = C17880vN.A0p();
    public Object A00;

    public final boolean hasNext() {
        return AnonymousClass3Ma.A1Z(this.A00, A01);
    }

    public final Object next() {
        Object obj = this.A00;
        Object obj2 = A01;
        if (obj != obj2) {
            this.A00 = obj2;
            return obj;
        }
        throw BE6.A14();
    }
}
