package X;

import java.util.AbstractCollection;
import java.util.Arrays;

/* renamed from: X.737  reason: invalid class name */
public final class AnonymousClass737 {
    public final int[] A00;

    public AnonymousClass737(String str) {
        C18070vi.A0d(str, 1);
        int codePointCount = str.codePointCount(0, str.length());
        this.A00 = new int[codePointCount];
        int i = 0;
        for (int i2 = 0; i2 < codePointCount; i2++) {
            this.A00[i2] = str.codePointAt(i);
            i += Character.charCount(this.A00[i2]);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C18070vi.A14(this, obj)) {
                int[] iArr = this.A00;
                int[] iArr2 = ((AnonymousClass737) obj).A00;
                if (!Arrays.equals(iArr, iArr2)) {
                    int length = iArr.length;
                    if (length == iArr2.length) {
                        int i = 0;
                        while (i < length) {
                            if (iArr[i] == iArr2[i]) {
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass737 A00(int[] iArr, int i, int i2) {
        iArr[i2] = i;
        return new AnonymousClass737(iArr);
    }

    public static void A01(AbstractCollection abstractCollection, int[][] iArr, int i) {
        abstractCollection.add(new AnonymousClass737(iArr[i]));
    }

    public int hashCode() {
        int i = 1;
        for (int i2 : this.A00) {
            i = (31 * i) + i2;
        }
        return i;
    }

    public String toString() {
        return C137176v2.A01(this.A00);
    }

    public AnonymousClass737(int[] iArr) {
        C18070vi.A0d(iArr, 1);
        this.A00 = iArr;
    }
}
