package X;

/* renamed from: X.5z5  reason: invalid class name and case insensitive filesystem */
public final class C117025z5 extends C43271zX {
    public int A00;
    public final int[] A01;

    public C117025z5(int[] iArr) {
        C18070vi.A0d(iArr, 1);
        this.A01 = iArr;
    }

    public int A00() {
        int i = this.A00;
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            return 0;
        }
        int i2 = iArr[i];
        this.A00 = i + 1;
        return i2;
    }

    public int[] A01() {
        return this.A01;
    }
}
