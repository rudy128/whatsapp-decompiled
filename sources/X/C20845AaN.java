package X;

/* renamed from: X.AaN  reason: case insensitive filesystem */
public class C20845AaN implements BBV {
    public static final int[] A00 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    public /* bridge */ /* synthetic */ boolean Bgx(Object obj) {
        int i;
        int[] iArr;
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence != null) {
            String str = C108985cd.A0o(charSequence, "[^\\d]").toString();
            int length = str.length();
            boolean z = this instanceof AnonymousClass93l;
            if (z) {
                i = 14;
            } else {
                i = 11;
            }
            if (length == i) {
                if (z) {
                    iArr = AnonymousClass93l.A00;
                } else {
                    iArr = A00;
                }
                int i2 = length - 2;
                int i3 = 0;
                int i4 = 0;
                while (i3 < i2) {
                    int i5 = i3 + 1;
                    i4 += iArr[i5] * AnonymousClass8BU.A04(str, i3);
                    i3 = i5;
                }
                int i6 = 11 - (i4 % 11);
                if (i6 > 9) {
                    i6 = 0;
                }
                if (AnonymousClass8BU.A04(str, i2) == i6) {
                    int i7 = length - 1;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        i8 += iArr[i9] * AnonymousClass8BU.A04(str, i9);
                    }
                    int i10 = 11 - (i8 % 11);
                    if (i10 > 9) {
                        i10 = 0;
                    }
                    if (AnonymousClass8BU.A04(str, length - 1) == i10) {
                        int i11 = 1;
                        while (str.charAt(i11 - 1) == str.charAt(i11)) {
                            i11++;
                            if (i11 >= length) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ CharSequence CGb(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        C18070vi.A0d(charSequence, 0);
        return C108985cd.A0o(charSequence, "[^\\d]");
    }
}
