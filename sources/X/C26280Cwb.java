package X;

/* renamed from: X.Cwb  reason: case insensitive filesystem */
public final class C26280Cwb {
    public int A00;
    public int A01 = 1;
    public int A02;
    public int A03;
    public int A04;
    public String A05;
    public C26151CtI A06;
    public C26151CtI A07 = new C26151CtI();
    public C26184Cu8[] A08 = new C26184Cu8[256];
    public C26184Cu8[] A09;
    public C24939CQp[] A0A;
    public C24939CQp[] A0B;
    public int A0C;
    public final C25753ClN A0D;

    public static C26184Cu8 A01(String str, String str2, String str3, C26280Cwb cwb, int i) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i2 = i;
        int hashCode = (i + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
        for (C26184Cu8 A042 = A04(cwb, hashCode); A042 != null; A042 = A042.A01) {
            if (A042.A03 == i && A042.A04 == hashCode && A042.A07.equals(str4) && A042.A06.equals(str2) && A042.A08.equals(str3)) {
                return A042;
            }
        }
        cwb.A07.A08(i, A03(str4, cwb, 7).A02, cwb.A0D(str2, str3));
        int i3 = cwb.A01;
        cwb.A01 = i3 + 1;
        C26184Cu8 cu8 = new C26184Cu8(str4, str5, str6, i3, i2, hashCode, 0);
        A09(cu8, cwb);
        return cu8;
    }

    public static C26184Cu8 A02(String str, String str2, C26280Cwb cwb, int i, int i2) {
        String str3 = str;
        String str4 = str2;
        int i3 = i2;
        int i4 = i;
        int hashCode = (i + (str.hashCode() * str2.hashCode() * (i2 + 1))) & Integer.MAX_VALUE;
        for (C26184Cu8 A042 = A04(cwb, hashCode); A042 != null; A042 = A042.A01) {
            if (A042.A03 == i && A042.A04 == hashCode && A042.A05 == ((long) i3) && A042.A06.equals(str) && A042.A08.equals(str2)) {
                return A042;
            }
        }
        cwb.A07.A08(i, i3, cwb.A0D(str, str2));
        int i5 = cwb.A01;
        cwb.A01 = i5 + 1;
        C26184Cu8 cu8 = new C26184Cu8((String) null, str3, str4, i5, i4, hashCode, (long) i3);
        A09(cu8, cwb);
        return cu8;
    }

    public static C26184Cu8 A06(C26280Cwb cwb, int i, long j) {
        long j2 = j;
        int i2 = (int) j;
        int i3 = i;
        int A022 = AnonymousClass8BR.A02(j);
        int i4 = (i + i2 + A022) & Integer.MAX_VALUE;
        for (C26184Cu8 A042 = A04(cwb, i4); A042 != null; A042 = A042.A01) {
            if (A042.A03 == i && A042.A04 == i4 && A042.A05 == j) {
                return A042;
            }
        }
        int i5 = cwb.A01;
        C26151CtI ctI = cwb.A07;
        ctI.A03(i);
        int i6 = ctI.A00;
        if (i6 + 8 > ctI.A01.length) {
            C26151CtI.A00(ctI, 8);
        }
        byte[] bArr = ctI.A01;
        int i7 = i6 + 1;
        int A0A2 = BE6.A0A(A022 >>> 24, bArr, i6, i7);
        int A0A3 = BE6.A0A(A022 >>> 16, bArr, i7, A0A2);
        int A0A4 = BE6.A0A(A022 >>> 8, bArr, A0A2, A0A3);
        int A0A5 = BE6.A0A(A022, bArr, A0A3, A0A4);
        int A0A6 = BE6.A0A(i2 >>> 24, bArr, A0A4, A0A5);
        bArr[A0A5] = (byte) (i2 >>> 16);
        C26151CtI.A02(ctI, bArr, A0A6, i2);
        cwb.A01 += 2;
        C26184Cu8 cu8 = new C26184Cu8(i5, i3, j2, i4);
        A09(cu8, cwb);
        return cu8;
    }

    public int A0A(String str) {
        int hashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C26184Cu8 A042 = A04(this, hashCode); A042 != null; A042 = A042.A01) {
            if (A042.A03 == 1 && A042.A04 == hashCode && A042.A08.equals(str)) {
                return A042.A02;
            }
        }
        C26151CtI ctI = this.A07;
        ctI.A03(1);
        int length = str.length();
        if (length <= 65535) {
            int i = ctI.A00;
            if (i + 2 + length > ctI.A01.length) {
                C26151CtI.A00(ctI, length + 2);
            }
            byte[] bArr = ctI.A01;
            int i2 = i + 1;
            int A0A2 = BE6.A0A(length >>> 8, bArr, i, i2);
            bArr[i2] = (byte) length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    ctI.A00 = A0A2;
                    break;
                }
                char charAt = str.charAt(i3);
                if (charAt < 1 || charAt > 127) {
                    ctI.A00 = A0A2;
                    ctI.A09(str, i3, 65535);
                } else {
                    i3 = BE6.A0A(charAt, bArr, A0A2, i3);
                    A0A2++;
                }
            }
            ctI.A00 = A0A2;
            ctI.A09(str, i3, 65535);
            int i4 = this.A01;
            this.A01 = i4 + 1;
            C26184Cu8 cu8 = new C26184Cu8(i4, 1, str, hashCode);
            A09(cu8, this);
            return cu8.A02;
        }
        throw AnonymousClass000.A0k("UTF8 string too large");
    }

    public static int A00(C26184Cu8 cu8, C26280Cwb cwb) {
        C26184Cu8[] cu8Arr = cwb.A09;
        if (cu8Arr == null) {
            cu8Arr = new C26184Cu8[16];
            cwb.A09 = cu8Arr;
        }
        int i = cwb.A04;
        int length = cu8Arr.length;
        if (i == length) {
            C26184Cu8[] cu8Arr2 = new C26184Cu8[(length * 2)];
            System.arraycopy(cu8Arr, 0, cu8Arr2, 0, length);
            cwb.A09 = cu8Arr2;
            cu8Arr = cu8Arr2;
        }
        int i2 = cwb.A04;
        cwb.A04 = i2 + 1;
        cu8Arr[i2] = cu8;
        A09(cu8, cwb);
        return cu8.A02;
    }

    public static C26184Cu8 A04(C26280Cwb cwb, int i) {
        C26184Cu8[] cu8Arr = cwb.A08;
        return cu8Arr[i % cu8Arr.length];
    }

    public static void A09(C26184Cu8 cu8, C26280Cwb cwb) {
        int i = cwb.A0C;
        C26184Cu8[] cu8Arr = cwb.A08;
        int length = cu8Arr.length;
        if (i > (length * 3) / 4) {
            int i2 = (length * 2) + 1;
            C26184Cu8[] cu8Arr2 = new C26184Cu8[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C26184Cu8 cu82 = cu8Arr[i3];
                while (cu82 != null) {
                    int i4 = cu82.A04 % i2;
                    C26184Cu8 cu83 = cu82.A01;
                    cu82.A01 = cu8Arr2[i4];
                    cu8Arr2[i4] = cu82;
                    cu82 = cu83;
                }
            }
            cwb.A08 = cu8Arr2;
            cu8Arr = cu8Arr2;
        }
        cwb.A0C = i + 1;
        int length2 = cu8.A04 % cu8Arr.length;
        cu8.A01 = cu8Arr[length2];
        cu8Arr[length2] = cu8;
    }

    public int A0B(String str) {
        int A092 = C108945cZ.A09(str, 128) & Integer.MAX_VALUE;
        for (C26184Cu8 A042 = A04(this, A092); A042 != null; A042 = A042.A01) {
            if (A042.A03 == 128 && A042.A04 == A092 && A042.A08.equals(str)) {
                return A042.A02;
            }
        }
        return A00(new C26184Cu8(this.A04, 128, str, A092), this);
    }

    public int A0C(String str, int i) {
        String str2 = str;
        int A092 = (C108945cZ.A09(str, 129) + i) & Integer.MAX_VALUE;
        for (C26184Cu8 A042 = A04(this, A092); A042 != null; A042 = A042.A01) {
            if (A042.A03 == 129 && A042.A04 == A092 && A042.A05 == ((long) i) && A042.A08.equals(str)) {
                return A042.A02;
            }
        }
        return A00(new C26184Cu8(str2, this.A04, 129, A092, (long) i), this);
    }

    public int A0D(String str, String str2) {
        int hashCode = ((str.hashCode() * str2.hashCode()) + 12) & Integer.MAX_VALUE;
        C26184Cu8 A042 = A04(this, hashCode);
        while (true) {
            if (A042 != null) {
                if (A042.A03 == 12 && A042.A04 == hashCode && A042.A06.equals(str) && A042.A08.equals(str2)) {
                    break;
                }
                A042 = A042.A01;
            } else {
                this.A07.A08(12, A0A(str), A0A(str2));
                int i = this.A01;
                this.A01 = i + 1;
                A042 = new C26184Cu8(i, hashCode, str, str2);
                A09(A042, this);
                break;
            }
        }
        return A042.A02;
    }

    public C26184Cu8 A0E(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) && !(obj instanceof Byte)) {
            if (obj instanceof Character) {
                intValue = ((Character) obj).charValue();
            } else if (!(obj instanceof Short)) {
                if (obj instanceof Boolean) {
                    intValue = AnonymousClass000.A1Y(obj);
                } else if (obj instanceof Float) {
                    return A05(this, 4, Float.floatToRawIntBits(AnonymousClass000.A04(obj)));
                } else {
                    if (obj instanceof Long) {
                        return A06(this, 5, C17880vN.A05(obj));
                    }
                    if (obj instanceof Double) {
                        return A06(this, 6, Double.doubleToRawLongBits(AnonymousClass8BR.A00(obj)));
                    }
                    if (obj instanceof String) {
                        return A03((String) obj, this, 8);
                    }
                    if (obj instanceof C26263Cw8) {
                        C26263Cw8 cw8 = (C26263Cw8) obj;
                        int i = cw8.A00;
                        if (i == 12 || i == 10) {
                            return A03(cw8.A03.substring(cw8.A01, cw8.A02), this, 7);
                        }
                        String A062 = cw8.A06();
                        if (i == 11) {
                            return A03(A062, this, 16);
                        }
                        return A03(A062, this, 7);
                    } else if (obj instanceof C25221CbH) {
                        C25221CbH cbH = (C25221CbH) obj;
                        return A0F(cbH.A03, cbH.A02, cbH.A01, cbH.A00, cbH.A04);
                    } else if (obj instanceof C25212Cb8) {
                        C25212Cb8 cb8 = (C25212Cb8) obj;
                        return A02(cb8.A01, cb8.A00, this, 17, A0G(cb8.A02, cb8.A03).A02);
                    } else {
                        throw AnonymousClass8BX.A0V(obj, "value ", AnonymousClass000.A10());
                    }
                }
            }
            return A05(this, 3, intValue);
        }
        intValue = ((Number) obj).intValue();
        return A05(this, 3, intValue);
    }

    public C26184Cu8 A0F(String str, String str2, String str3, int i, boolean z) {
        int i2;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = i;
        int hashCode = ((str4.hashCode() * str5.hashCode() * str6.hashCode() * i) + 15) & Integer.MAX_VALUE;
        for (C26184Cu8 A042 = A04(this, hashCode); A042 != null; A042 = A042.A01) {
            if (A042.A03 == 15 && A042.A04 == hashCode && A042.A05 == ((long) i3) && A042.A07.equals(str4) && A042.A06.equals(str5) && A042.A08.equals(str6)) {
                return A042;
            }
        }
        C26151CtI ctI = this.A07;
        if (i3 <= 4) {
            i2 = 9;
        } else {
            i2 = 10;
            if (z) {
                i2 = 11;
            }
        }
        int i4 = A01(str4, str5, str6, this, i2).A02;
        int i5 = ctI.A00;
        if (i5 + 4 > ctI.A01.length) {
            C26151CtI.A00(ctI, 4);
        }
        byte[] bArr = ctI.A01;
        int i6 = i5 + 1;
        bArr[i5] = 15;
        bArr[i6] = (byte) i3;
        C26151CtI.A02(ctI, bArr, i6 + 1, i4);
        int i7 = this.A01;
        this.A01 = i7 + 1;
        C26184Cu8 cu8 = new C26184Cu8(str4, str5, str6, i7, 15, hashCode, (long) i3);
        A09(cu8, this);
        return cu8;
    }

    public C26184Cu8 A0G(C25221CbH cbH, Object... objArr) {
        C26151CtI ctI = this.A06;
        if (ctI == null) {
            ctI = new C26151CtI();
            this.A06 = ctI;
        }
        int[] iArr = new int[r4];
        for (int i = 0; i < r4; i++) {
            iArr[i] = A0E(objArr[i]).A02;
        }
        int i2 = ctI.A00;
        C25221CbH cbH2 = cbH;
        ctI.A05(A0F(cbH2.A03, cbH2.A02, cbH2.A01, cbH2.A00, cbH2.A04).A02);
        ctI.A05(r4);
        for (int i3 = 0; i3 < r4; i3++) {
            ctI.A05(iArr[i3]);
        }
        int i4 = ctI.A00 - i2;
        int hashCode = cbH2.hashCode();
        for (Object hashCode2 : objArr) {
            hashCode ^= hashCode2.hashCode();
        }
        int i5 = hashCode & Integer.MAX_VALUE;
        C26151CtI ctI2 = this.A06;
        byte[] bArr = ctI2.A01;
        for (C26184Cu8 A042 = A04(this, i5); A042 != null; A042 = A042.A01) {
            if (A042.A03 == 64 && A042.A04 == i5) {
                int i6 = (int) A042.A05;
                int i7 = 0;
                while (i7 < i4) {
                    if (bArr[i2 + i7] == bArr[i6 + i7]) {
                        i7++;
                    }
                }
                ctI2.A00 = i2;
                return A042;
            }
        }
        int i8 = this.A00;
        this.A00 = i8 + 1;
        C26184Cu8 cu8 = new C26184Cu8(i8, 64, (long) i2, i5);
        A09(cu8, this);
        return cu8;
    }

    public C26280Cwb(C25753ClN clN) {
        this.A0D = clN;
    }

    public static C26184Cu8 A03(String str, C26280Cwb cwb, int i) {
        int A092 = C108945cZ.A09(str, i) & Integer.MAX_VALUE;
        for (C26184Cu8 A042 = A04(cwb, A092); A042 != null; A042 = A042.A01) {
            if (A042.A03 == i && A042.A04 == A092 && A042.A08.equals(str)) {
                return A042;
            }
        }
        cwb.A07.A07(i, cwb.A0A(str));
        int i2 = cwb.A01;
        cwb.A01 = i2 + 1;
        C26184Cu8 cu8 = new C26184Cu8(i2, i, str, A092);
        A09(cu8, cwb);
        return cu8;
    }

    public static C26184Cu8 A05(C26280Cwb cwb, int i, int i2) {
        int i3 = i;
        int i4 = (i + i2) & Integer.MAX_VALUE;
        for (C26184Cu8 A042 = A04(cwb, i4); A042 != null; A042 = A042.A01) {
            if (A042.A03 == i && A042.A04 == i4 && A042.A05 == ((long) i2)) {
                return A042;
            }
        }
        C26151CtI ctI = cwb.A07;
        ctI.A03(i);
        ctI.A04(i2);
        int i5 = cwb.A01;
        cwb.A01 = i5 + 1;
        C26184Cu8 cu8 = new C26184Cu8(i5, i3, (long) i2, i4);
        A09(cu8, cwb);
        return cu8;
    }

    public static void A07(String str, C26151CtI ctI, C26280Cwb cwb) {
        ctI.A05(cwb.A0A(str));
    }

    public static void A08(String str, C26151CtI ctI, C26280Cwb cwb, int i) {
        ctI.A05(A03(str, cwb, i).A02);
    }
}
