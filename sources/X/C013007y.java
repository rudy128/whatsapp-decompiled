package X;

/* renamed from: X.07y  reason: invalid class name and case insensitive filesystem */
public final class C013007y extends C06910a3 {
    public final C013107z A00;
    public final Object[] A01;

    public C013007y(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2);
        this.A01 = objArr2;
        int i4 = (i2 - 1) & -32;
        this.A00 = new C013107z(objArr, i > i4 ? i4 : i, i4, i3);
    }

    public Object next() {
        A04();
        C013107z r3 = this.A00;
        if (r3.hasNext()) {
            A06(A02() + 1);
            return r3.next();
        }
        Object[] objArr = this.A01;
        int A02 = A02();
        A06(A02 + 1);
        return objArr[A02 - r3.A03()];
    }

    public Object previous() {
        A05();
        int A02 = A02();
        C013107z r1 = this.A00;
        int A03 = r1.A03();
        if (A02 > A03) {
            Object[] objArr = this.A01;
            A06(A02 - 1);
            return objArr[A02() - A03];
        }
        A06(A02 - 1);
        return r1.previous();
    }
}
