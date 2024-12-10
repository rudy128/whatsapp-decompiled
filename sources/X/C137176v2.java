package X;

/* renamed from: X.6v2  reason: invalid class name and case insensitive filesystem */
public abstract class C137176v2 {
    public static final AnonymousClass737 A00(String str) {
        C18070vi.A0d(str, 0);
        int length = str.length();
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(str, i);
            i += Character.charCount(codePointAt);
            iArr[i2] = codePointAt;
            i2++;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        return new AnonymousClass737(iArr2);
    }

    public static final String A01(int[] iArr) {
        StringBuilder A0K = C18070vi.A0K(iArr);
        for (int appendCodePoint : iArr) {
            A0K.appendCodePoint(appendCodePoint);
        }
        return C18070vi.A0H(A0K);
    }
}
