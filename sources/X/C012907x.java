package X;

/* renamed from: X.07x  reason: invalid class name and case insensitive filesystem */
public final class C012907x extends C06910a3 {
    public final Object A00;

    public C012907x(Object obj, int i) {
        super(i, 1);
        this.A00 = obj;
    }

    public Object next() {
        A04();
        A06(A02() + 1);
        return this.A00;
    }

    public Object previous() {
        A05();
        A06(A02() - 1);
        return this.A00;
    }
}
