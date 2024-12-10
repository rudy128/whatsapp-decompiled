package X;

/* renamed from: X.C6d  reason: case insensitive filesystem */
public final class C24486C6d {
    public int A00;
    public int A01;
    public C64 A02;
    public String A03;

    public final int A00() {
        C64 c64 = this.A02;
        String str = this.A03;
        if (c64 == null) {
            return str.length();
        }
        return (str.length() - (this.A00 - this.A01)) + (c64.A00 - (c64.A01 - c64.A02));
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.C64, java.lang.Object] */
    public final void A01(int i, int i2, String str) {
        if (i > i2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("start index must be less than or equal to end index: ");
            A10.append(i);
            throw AnonymousClass001.A13(" > ", A10, i2);
        } else if (i >= 0) {
            C64 c64 = this.A02;
            if (c64 == null) {
                int length = str.length();
                int max = Math.max(255, length + 128);
                char[] cArr = new char[max];
                int min = Math.min(i, 64);
                String str2 = this.A03;
                int min2 = Math.min(str2.length() - i2, 64);
                int i3 = i - min;
                str2.getChars(i3, i, cArr, 0);
                String str3 = this.A03;
                int i4 = max - min2;
                int i5 = min2 + i2;
                C18070vi.A0z(str3, "null cannot be cast to non-null type java.lang.String");
                str3.getChars(i2, i5, cArr, i4);
                str.getChars(0, length, cArr, min);
                ? obj = new Object();
                obj.A00 = max;
                obj.A03 = cArr;
                obj.A02 = length + min;
                obj.A01 = i4;
                this.A02 = obj;
                this.A01 = i3;
                this.A00 = i5;
                return;
            }
            int i6 = this.A01;
            int i7 = i - i6;
            int i8 = i2 - i6;
            if (i7 >= 0) {
                int i9 = c64.A00;
                int i10 = c64.A01;
                int i11 = c64.A02;
                int i12 = i10 - i11;
                if (i8 <= i9 - i12) {
                    int length2 = str.length();
                    int i13 = length2 - (i8 - i7);
                    if (i13 > i12) {
                        int i14 = i9;
                        do {
                            i14 *= 2;
                        } while (i14 - i9 < i13 - i12);
                        char[] cArr2 = new char[i14];
                        char[] cArr3 = c64.A03;
                        C18070vi.A0d(cArr3, 0);
                        System.arraycopy(cArr3, 0, cArr2, 0, i11);
                        int i15 = c64.A00;
                        int i16 = c64.A01;
                        int i17 = i15 - i16;
                        i10 = i14 - i17;
                        char[] cArr4 = c64.A03;
                        C18070vi.A0d(cArr4, 0);
                        System.arraycopy(cArr4, i16, cArr2, i10, (i17 + i16) - i16);
                        c64.A03 = cArr2;
                        c64.A00 = i14;
                        c64.A01 = i10;
                    }
                    int i18 = c64.A02;
                    if (i7 < i18 && i8 <= i18) {
                        int i19 = i18 - i8;
                        char[] cArr5 = c64.A03;
                        C18070vi.A0d(cArr5, 0);
                        System.arraycopy(cArr5, i8, cArr5, i10 - i19, i18 - i8);
                        c64.A02 = i7;
                        c64.A01 -= i19;
                    } else if (i7 >= i18 || i8 < i18) {
                        int i20 = i10 - i18;
                        int i21 = i7 + i20;
                        char[] cArr6 = c64.A03;
                        C18070vi.A0d(cArr6, 0);
                        System.arraycopy(cArr6, i10, cArr6, i18, i21 - i10);
                        i7 = c64.A02 + (i21 - i10);
                        c64.A02 = i7;
                        c64.A01 = i8 + i20;
                    } else {
                        c64.A01 = i8 + (i10 - i18);
                        c64.A02 = i7;
                    }
                    str.getChars(0, length2, c64.A03, i7);
                    c64.A02 += length2;
                    return;
                }
            }
            this.A03 = toString();
            this.A02 = null;
            this.A01 = -1;
            this.A00 = -1;
            A01(i, i2, str);
        } else {
            throw AnonymousClass001.A13("start must be non-negative, but was ", AnonymousClass000.A10(), i);
        }
    }

    public String toString() {
        C64 c64 = this.A02;
        if (c64 == null) {
            return this.A03;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A03, 0, this.A01);
        A10.append(c64.A03, 0, c64.A02);
        char[] cArr = c64.A03;
        int i = c64.A01;
        A10.append(cArr, i, c64.A00 - i);
        String str = this.A03;
        A10.append(str, this.A00, str.length());
        return A10.toString();
    }
}
