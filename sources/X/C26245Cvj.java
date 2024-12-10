package X;

/* renamed from: X.Cvj  reason: case insensitive filesystem */
public final class C26245Cvj {
    public int A00;
    public C26245Cvj A01;
    public final C26151CtI A02;
    public final C26280Cwb A03;
    public final boolean A04;
    public final int A05;
    public final C26245Cvj A06;

    public static int A00(C26245Cvj cvj, C26245Cvj cvj2, C26245Cvj cvj3, C26245Cvj cvj4) {
        int i = 0;
        if (cvj != null) {
            i = 0 + cvj.A06("RuntimeVisibleAnnotations");
        }
        if (cvj2 != null) {
            i += cvj2.A06("RuntimeInvisibleAnnotations");
        }
        if (cvj3 != null) {
            i += cvj3.A06("RuntimeVisibleTypeAnnotations");
        }
        if (cvj4 != null) {
            return i + cvj4.A06("RuntimeInvisibleTypeAnnotations");
        }
        return i;
    }

    public static void A04(C26151CtI ctI, C26280Cwb cwb, int i, int i2) {
        ctI.A07(i2, C26280Cwb.A05(cwb, 3, i).A02);
    }

    public void A0A(C26151CtI ctI, int i) {
        int i2 = 2;
        C26245Cvj cvj = null;
        int i3 = 0;
        for (C26245Cvj cvj2 = this; cvj2 != null; cvj2 = cvj2.A06) {
            cvj2.A08();
            i2 += cvj2.A02.A00;
            i3++;
            cvj = cvj2;
        }
        ctI.A05(i);
        ctI.A04(i2);
        ctI.A05(i3);
        while (cvj != null) {
            C26151CtI.A01(cvj.A02, ctI);
            cvj = cvj.A01;
        }
    }

    public static C26245Cvj A01(String str, C26245Cvj cvj, C26280Cwb cwb) {
        C26151CtI ctI = new C26151CtI();
        C26280Cwb.A07(str, ctI, cwb);
        ctI.A05(0);
        return new C26245Cvj(cvj, ctI, cwb, true);
    }

    public static C26245Cvj A02(String str, C26245Cvj cvj, C26280Cwb cwb, CW2 cw2, int i) {
        C26151CtI ctI = new C26151CtI();
        int i2 = i >>> 24;
        if (!(i2 == 0 || i2 == 1)) {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    ctI.A07(i2, (i & 16776960) >> 8);
                    break;
                case 19:
                case 20:
                case 21:
                    ctI.A03(i2);
                    break;
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 66:
                        case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                        case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                        case 69:
                        case 70:
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                        case C166418cr.EVENT_MESSAGE_FIELD_NUMBER:
                            ctI.A04(i);
                            break;
                        default:
                            throw BE6.A0j();
                    }
                    ctI.A07(i2, (i & 16776960) >> 8);
                    break;
            }
        }
        ctI.A05(i >>> 16);
        if (cw2 == null) {
            ctI.A03(0);
        } else {
            byte[] bArr = cw2.A01;
            int i3 = cw2.A00;
            ctI.A0A(bArr, i3, (bArr[i3] * 2) + 1);
        }
        C26280Cwb.A07(str, ctI, cwb);
        ctI.A05(0);
        return new C26245Cvj(cvj, ctI, cwb, true);
    }

    public static void A03(C26245Cvj cvj, C26245Cvj cvj2, C26245Cvj cvj3, C26245Cvj cvj4, C26151CtI ctI, C26280Cwb cwb) {
        if (cvj != null) {
            cvj.A0A(ctI, cwb.A0A("RuntimeVisibleAnnotations"));
        }
        if (cvj2 != null) {
            cvj2.A0A(ctI, cwb.A0A("RuntimeInvisibleAnnotations"));
        }
        if (cvj3 != null) {
            cvj3.A0A(ctI, cwb.A0A("RuntimeVisibleTypeAnnotations"));
        }
        if (cvj4 != null) {
            cvj4.A0A(ctI, cwb.A0A("RuntimeInvisibleTypeAnnotations"));
        }
    }

    public static void A05(C26151CtI ctI, C26245Cvj[] cvjArr, int i, int i2) {
        int A062;
        int i3 = (i2 * 2) + 1;
        for (int i4 = 0; i4 < i2; i4++) {
            C26245Cvj cvj = cvjArr[i4];
            if (cvj == null) {
                A062 = 0;
            } else {
                A062 = cvj.A06((String) null) - 8;
            }
            i3 += A062;
        }
        ctI.A05(i);
        ctI.A04(i3);
        ctI.A03(i2);
        for (int i5 = 0; i5 < i2; i5++) {
            C26245Cvj cvj2 = null;
            int i6 = 0;
            for (C26245Cvj cvj3 = cvjArr[i5]; cvj3 != null; cvj3 = cvj3.A06) {
                cvj3.A08();
                i6++;
                cvj2 = cvj3;
            }
            ctI.A05(i6);
            while (cvj2 != null) {
                C26151CtI.A01(cvj2.A02, ctI);
                cvj2 = cvj2.A01;
            }
        }
    }

    public int A06(String str) {
        if (str != null) {
            this.A03.A0A(str);
        }
        int i = 8;
        for (C26245Cvj cvj = this; cvj != null; cvj = cvj.A06) {
            i += cvj.A02.A00;
        }
        return i;
    }

    public C26245Cvj A07(String str) {
        this.A00++;
        if (this.A04) {
            C26280Cwb.A07(str, this.A02, this.A03);
        }
        C26151CtI ctI = this.A02;
        ctI.A07(91, 0);
        return new C26245Cvj((C26245Cvj) null, ctI, this.A03, false);
    }

    public void A08() {
        int i = this.A05;
        if (i != -1) {
            byte[] bArr = this.A02.A01;
            int i2 = this.A00;
            BE7.A12(i2 >>> 8, bArr, i, i2);
        }
    }

    public void A09(String str, Object obj) {
        int i;
        C26151CtI ctI;
        int A0A;
        this.A00++;
        if (this.A04) {
            C26280Cwb.A07(str, this.A02, this.A03);
        }
        if (obj instanceof String) {
            ctI = this.A02;
            A0A = this.A03.A0A((String) obj);
            i = 115;
        } else {
            i = 66;
            if (obj instanceof Byte) {
                ctI = this.A02;
                A0A = C26280Cwb.A05(this.A03, 3, ((Number) obj).byteValue()).A02;
            } else if (obj instanceof Boolean) {
                A04(this.A02, this.A03, AnonymousClass000.A1Y(obj) ? 1 : 0, 90);
                return;
            } else if (obj instanceof Character) {
                A04(this.A02, this.A03, ((Character) obj).charValue(), 67);
                return;
            } else if (obj instanceof Short) {
                A04(this.A02, this.A03, ((Number) obj).shortValue(), 83);
                return;
            } else if (obj instanceof C26263Cw8) {
                ctI = this.A02;
                A0A = this.A03.A0A(((C26263Cw8) obj).A06());
                i = 99;
            } else {
                int i2 = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    C26151CtI ctI2 = this.A02;
                    int length = bArr.length;
                    ctI2.A07(91, length);
                    while (i2 < length) {
                        A04(ctI2, this.A03, bArr[i2], 66);
                        i2++;
                    }
                    return;
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    C26151CtI ctI3 = this.A02;
                    int length2 = zArr.length;
                    ctI3.A07(91, length2);
                    while (i2 < length2) {
                        A04(ctI3, this.A03, zArr[i2] ? 1 : 0, 90);
                        i2++;
                    }
                    return;
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    C26151CtI ctI4 = this.A02;
                    int length3 = sArr.length;
                    ctI4.A07(91, length3);
                    while (i2 < length3) {
                        A04(ctI4, this.A03, sArr[i2], 83);
                        i2++;
                    }
                    return;
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    C26151CtI ctI5 = this.A02;
                    int length4 = cArr.length;
                    ctI5.A07(91, length4);
                    while (i2 < length4) {
                        A04(ctI5, this.A03, cArr[i2], 67);
                        i2++;
                    }
                    return;
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    C26151CtI ctI6 = this.A02;
                    int length5 = iArr.length;
                    ctI6.A07(91, length5);
                    while (i2 < length5) {
                        ctI6.A07(73, C26280Cwb.A05(this.A03, 3, iArr[i2]).A02);
                        i2++;
                    }
                    return;
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    C26151CtI ctI7 = this.A02;
                    int length6 = jArr.length;
                    ctI7.A07(91, length6);
                    while (i2 < length6) {
                        ctI7.A07(74, C26280Cwb.A06(this.A03, 5, jArr[i2]).A02);
                        i2++;
                    }
                    return;
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    C26151CtI ctI8 = this.A02;
                    int length7 = fArr.length;
                    ctI8.A07(91, length7);
                    while (i2 < length7) {
                        ctI8.A07(70, C26280Cwb.A05(this.A03, 4, Float.floatToRawIntBits(fArr[i2])).A02);
                        i2++;
                    }
                    return;
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    C26151CtI ctI9 = this.A02;
                    int length8 = dArr.length;
                    ctI9.A07(91, length8);
                    while (i2 < length8) {
                        ctI9.A07(68, C26280Cwb.A06(this.A03, 6, Double.doubleToRawLongBits(dArr[i2])).A02);
                        i2++;
                    }
                    return;
                } else {
                    C26184Cu8 A0E = this.A03.A0E(obj);
                    this.A02.A07(".s.IFJDCS".charAt(A0E.A03), A0E.A02);
                    return;
                }
            }
        }
        ctI.A07(i, A0A);
    }

    public C26245Cvj(C26245Cvj cvj, C26151CtI ctI, C26280Cwb cwb, boolean z) {
        this.A03 = cwb;
        this.A04 = z;
        this.A02 = ctI;
        int i = ctI.A00;
        this.A05 = i == 0 ? -1 : i - 2;
        this.A06 = cvj;
        if (cvj != null) {
            cvj.A01 = this;
        }
    }
}
