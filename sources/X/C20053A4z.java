package X;

/* renamed from: X.A4z  reason: case insensitive filesystem */
public final class C20053A4z {
    public int A00;
    public final String A01;

    public final void A04() {
        int i = this.A00;
        int i2 = i + 1;
        int length = this.A01.length();
        if (i2 <= length) {
            this.A00 = i2;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("remaining data length is ");
        A10.append(length - i);
        throw new IndexOutOfBoundsException(AnonymousClass001.A1I(", which is shorter than requested ", A10, 1));
    }

    public static int A00(C20053A4z a4z) {
        return a4z.A01.length() - a4z.A00;
    }

    public final char A03(int i) {
        int i2 = this.A00;
        int i3 = i2 + i;
        String str = this.A01;
        int length = str.length();
        if (i3 < length) {
            return str.charAt(i3);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("remaining data length is ");
        A10.append(length - i2);
        throw new IndexOutOfBoundsException(AnonymousClass001.A1I(", which is shorter than requested ", A10, i));
    }

    public C20053A4z(String str) {
        this.A01 = str;
    }

    public static void A01(C20053A4z a4z, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(a4z.A00);
        sb.append(" in ");
        sb.append(str2);
    }

    public final char A02() {
        while (!AnonymousClass000.A1P(A00(this))) {
            if (A03(0) != ' ') {
                return A03(0);
            }
            A04();
        }
        return 0;
    }
}
