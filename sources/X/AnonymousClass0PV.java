package X;

/* renamed from: X.0PV  reason: invalid class name */
public abstract class AnonymousClass0PV {
    public final int A00;
    public final int A01;

    public abstract void A06(C16270rz r1, C15750r8 r2, AnonymousClass0Qu r3, AnonymousClass0r9 r4);

    public static int A00(AnonymousClass0PV r1) {
        int i = r1.A01;
        if (i == 0) {
            return 0;
        }
        return -1 >>> (32 - i);
    }

    public AnonymousClass0PV(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public static int A01(AnonymousClass0PV r0, StringBuilder sb, int i, int i2) {
        sb.append(r0.A04(i));
        return i2 + 1;
    }

    public static void A02(AnonymousClass0PV r0, StringBuilder sb, int i) {
        sb.append(r0.A05(i));
    }

    public final String A03() {
        String BZJ = C61042p1.A00(getClass()).BZJ();
        if (BZJ == null) {
            return "";
        }
        return BZJ;
    }

    public String A04(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IntParameter(");
        return AnonymousClass001.A1L(A10, i);
    }

    public String A05(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ObjectParameter(");
        return AnonymousClass001.A1L(A10, i);
    }

    public String toString() {
        return A03();
    }
}
