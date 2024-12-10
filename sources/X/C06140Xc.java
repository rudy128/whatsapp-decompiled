package X;

/* renamed from: X.0Xc  reason: invalid class name and case insensitive filesystem */
public abstract class C06140Xc implements C16730sv {
    public String A00;
    public final int[] A01 = new int[2];

    public final String A02() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        C18070vi.A11("text");
        throw null;
    }

    public final int[] A04(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.A01;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public static int A01(C06140Xc r0) {
        return r0.A02().length();
    }

    public void A03(String str) {
        this.A00 = str;
    }
}
