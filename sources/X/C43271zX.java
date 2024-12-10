package X;

/* renamed from: X.1zX  reason: invalid class name and case insensitive filesystem */
public abstract class C43271zX {
    public static final String A00 = String.valueOf(9633);

    public int A00() {
        C43281zY r3 = (C43281zY) this;
        int i = r3.A00;
        if (i >= r3.A01) {
            return 0;
        }
        int codePointAt = Character.codePointAt(r3.A02, i);
        r3.A00 += Character.charCount(codePointAt);
        return codePointAt;
    }

    public int[] A01() {
        C43281zY r4 = (C43281zY) this;
        int i = r4.A01;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = Character.codePointAt(r4.A02, i2);
        }
        return iArr;
    }
}
