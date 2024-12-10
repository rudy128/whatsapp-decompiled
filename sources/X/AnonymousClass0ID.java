package X;

import java.util.ArrayList;

/* renamed from: X.0ID  reason: invalid class name */
public final class AnonymousClass0ID {
    public float[] A00 = new float[64];
    public final ArrayList A01 = AnonymousClass000.A13();

    public final void A00(String str) {
        int i;
        ArrayList arrayList = this.A01;
        arrayList.clear();
        String str2 = str;
        int length = str2.length();
        int i2 = 0;
        while (i2 < length && C18070vi.A00(str2.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && C18070vi.A00(str2.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                char charAt = str2.charAt(i2);
                char c = charAt | ' ';
                if ((c - 'a') * (c - 'z') > 0 || c == 'e') {
                    i2 = i;
                    if (i >= length) {
                        break;
                    }
                } else if (charAt == 0) {
                    continue;
                } else {
                    if ((charAt | ' ') != 'z') {
                        i3 = 0;
                        while (true) {
                            if (i >= length || C18070vi.A00(str2.charAt(i), 32) > 0) {
                                long A002 = AnonymousClass0MJ.A00(str2, i, length);
                                i = (int) (A002 >>> 32);
                                float A012 = AnonymousClass001.A01(A002);
                                boolean isNaN = Float.isNaN(A012);
                                if (!isNaN) {
                                    float[] fArr = this.A00;
                                    int i4 = i3 + 1;
                                    fArr[i3] = A012;
                                    if (i4 >= fArr.length) {
                                        float[] fArr2 = new float[(i4 * 2)];
                                        this.A00 = fArr2;
                                        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                    }
                                    i3 = i4;
                                }
                                while (i < length && str2.charAt(i) == ',') {
                                    i++;
                                }
                                if (i >= length || isNaN) {
                                    break;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                    float[] fArr3 = this.A00;
                    if (charAt == 'z' || charAt == 'Z') {
                        arrayList.add(AnonymousClass0A7.A00);
                    } else {
                        int i5 = 0;
                        if (charAt == 'm') {
                            int i6 = i3 - 2;
                            while (i5 <= i6) {
                                Object r10 = new C017909x(fArr3[i5], fArr3[i5 + 1]);
                                if (i5 > 0) {
                                    r10 = new C017809w(fArr3[i5], fArr3[i5 + 1]);
                                }
                                arrayList.add(r10);
                                i5 += 2;
                            }
                        } else if (charAt == 'M') {
                            int i7 = i3 - 2;
                            while (i5 <= i7) {
                                Object r102 = new C017609u(fArr3[i5], fArr3[i5 + 1]);
                                if (i5 > 0) {
                                    r102 = new C017509t(fArr3[i5], fArr3[i5 + 1]);
                                }
                                arrayList.add(r102);
                                i5 += 2;
                            }
                        } else if (charAt == 'l') {
                            int i8 = i3 - 2;
                            while (i5 <= i8) {
                                arrayList.add(new C017809w(fArr3[i5], fArr3[i5 + 1]));
                                i5 += 2;
                            }
                        } else if (charAt == 'L') {
                            int i9 = i3 - 2;
                            while (i5 <= i9) {
                                arrayList.add(new C017509t(fArr3[i5], fArr3[i5 + 1]));
                                i5 += 2;
                            }
                        } else if (charAt == 'h') {
                            int i10 = i3 - 1;
                            while (i5 <= i10) {
                                arrayList.add(new C017209q(fArr3[i5]));
                                i5++;
                            }
                        } else if (charAt == 'H') {
                            int i11 = i3 - 1;
                            while (i5 <= i11) {
                                arrayList.add(new C017109p(fArr3[i5]));
                                i5++;
                            }
                        } else if (charAt == 'v') {
                            int i12 = i3 - 1;
                            while (i5 <= i12) {
                                arrayList.add(new C017309r(fArr3[i5]));
                                i5++;
                            }
                        } else if (charAt == 'V') {
                            int i13 = i3 - 1;
                            while (i5 <= i13) {
                                arrayList.add(new C017409s(fArr3[i5]));
                                i5++;
                            }
                        } else {
                            int i14 = i3 - 6;
                            if (charAt == 'c') {
                                while (i5 <= i14) {
                                    arrayList.add(new AnonymousClass0A4(fArr3[i5], fArr3[i5 + 1], fArr3[i5 + 2], fArr3[i5 + 3], fArr3[i5 + 4], fArr3[i5 + 5]));
                                    i5 += 6;
                                }
                            } else if (charAt == 'C') {
                                while (i5 <= i14) {
                                    arrayList.add(new AnonymousClass0A3(fArr3[i5], fArr3[i5 + 1], fArr3[i5 + 2], fArr3[i5 + 3], fArr3[i5 + 4], fArr3[i5 + 5]));
                                    i5 += 6;
                                }
                            } else if (charAt == 's') {
                                int i15 = i3 - 4;
                                while (i5 <= i15) {
                                    arrayList.add(new AnonymousClass0A2(fArr3[i5], fArr3[i5 + 1], fArr3[i5 + 2], fArr3[i5 + 3]));
                                    i5 += 4;
                                }
                            } else if (charAt == 'S') {
                                int i16 = i3 - 4;
                                while (i5 <= i16) {
                                    arrayList.add(new AnonymousClass0A0(fArr3[i5], fArr3[i5 + 1], fArr3[i5 + 2], fArr3[i5 + 3]));
                                    i5 += 4;
                                }
                            } else if (charAt == 'q') {
                                int i17 = i3 - 4;
                                while (i5 <= i17) {
                                    arrayList.add(new AnonymousClass0A1(fArr3[i5], fArr3[i5 + 1], fArr3[i5 + 2], fArr3[i5 + 3]));
                                    i5 += 4;
                                }
                            } else if (charAt == 'Q') {
                                int i18 = i3 - 4;
                                while (i5 <= i18) {
                                    arrayList.add(new C018109z(fArr3[i5], fArr3[i5 + 1], fArr3[i5 + 2], fArr3[i5 + 3]));
                                    i5 += 4;
                                }
                            } else if (charAt == 't') {
                                int i19 = i3 - 2;
                                while (i5 <= i19) {
                                    arrayList.add(new C018009y(fArr3[i5], fArr3[i5 + 1]));
                                    i5 += 2;
                                }
                            } else if (charAt == 'T') {
                                int i20 = i3 - 2;
                                while (i5 <= i20) {
                                    arrayList.add(new C017709v(fArr3[i5], fArr3[i5 + 1]));
                                    i5 += 2;
                                }
                            } else if (charAt == 'a') {
                                int i21 = i3 - 7;
                                for (int i22 = 0; i22 <= i21; i22 += 7) {
                                    arrayList.add(new AnonymousClass0A6(fArr3[i22], fArr3[i22 + 1], fArr3[i22 + 2], fArr3[i22 + 5], fArr3[i22 + 6], AnonymousClass000.A1O(Float.compare(fArr3[i22 + 3], 0.0f)), AnonymousClass000.A1O(Float.compare(fArr3[i22 + 4], 0.0f))));
                                }
                            } else if (charAt == 'A') {
                                int i23 = i3 - 7;
                                for (int i24 = 0; i24 <= i23; i24 += 7) {
                                    arrayList.add(new AnonymousClass0A5(fArr3[i24], fArr3[i24 + 1], fArr3[i24 + 2], fArr3[i24 + 5], fArr3[i24 + 6], AnonymousClass000.A1O(Float.compare(fArr3[i24 + 3], 0.0f)), AnonymousClass000.A1O(Float.compare(fArr3[i24 + 4], 0.0f))));
                                }
                            } else {
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("Unknown command for: ");
                                A10.append(charAt);
                                throw AnonymousClass000.A0j(A10);
                            }
                        }
                    }
                }
            }
            i2 = i;
        }
    }
}
