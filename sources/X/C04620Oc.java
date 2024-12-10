package X;

/* renamed from: X.0Oc  reason: invalid class name and case insensitive filesystem */
public final class C04620Oc {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C26227CvJ A03;

    private final C24245By3 A00() {
        return C04760Or.A01(this.A03, this.A00);
    }

    private final C24245By3 A01() {
        return C04760Or.A01(this.A03, this.A02);
    }

    public final AnonymousClass0OV A02(int i) {
        return new AnonymousClass0OV(C04760Or.A01(this.A03, i), i, 1);
    }

    public final String A04() {
        return this.A03.A0N().A03().A02();
    }

    public C04620Oc(C26227CvJ cvJ, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = cvJ;
    }

    public final C26227CvJ A03() {
        return this.A03;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectionInfo(id=");
        A10.append(1);
        A10.append(", range=(");
        A10.append(this.A02);
        A10.append('-');
        A10.append(A01());
        A10.append(',');
        A10.append(this.A00);
        A10.append('-');
        A10.append(A00());
        A10.append("), prevOffset=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
