package X;

public final class C60 {
    public int A00;
    public long[] A01;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("<LongStack vector:[");
        long[] jArr = this.A01;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                BE6.A1J(A10);
            }
            int i2 = this.A00;
            if (i == i2) {
                A10.append(">>");
            }
            A10.append(jArr[i]);
            if (i == i2) {
                A10.append("<<");
            }
        }
        String A0y = AnonymousClass000.A0y("]>", A10);
        C18070vi.A0X(A0y);
        return A0y;
    }
}
