package X;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.1vO  reason: invalid class name and case insensitive filesystem */
public class C40851vO implements C40301uU {
    public int A00;

    public /* bridge */ /* synthetic */ Object CB7(C39941tt r20, float f) {
        int i;
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        float f5;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        boolean z = false;
        if (r20.A0B() == AnonymousClass00R.A00) {
            z = true;
            r20.A0F();
        }
        while (r20.A0M()) {
            arrayList.add(Float.valueOf((float) r20.A07()));
        }
        if (arrayList.size() == 4 && ((Number) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.A00 = 2;
        }
        if (z) {
            r20.A0H();
        }
        int i5 = this.A00;
        if (i5 == -1) {
            i5 = arrayList.size() / 4;
            this.A00 = i5;
        }
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.A00 * 4;
            if (i4 >= i) {
                break;
            }
            int i8 = i4 / 4;
            double floatValue = (double) ((Number) arrayList.get(i4)).floatValue();
            int i9 = i4 % 4;
            if (i9 == 0) {
                if (i8 <= 0 || fArr[i8 - 1] < ((float) floatValue)) {
                    f5 = (float) floatValue;
                } else {
                    f5 = ((float) floatValue) + 0.01f;
                }
                fArr[i8] = f5;
            } else if (i9 == 1) {
                i6 = (int) (floatValue * 255.0d);
            } else if (i9 == 2) {
                i7 = (int) (floatValue * 255.0d);
            } else if (i9 == 3) {
                iArr[i8] = Color.argb(255, i6, i7, (int) (floatValue * 255.0d));
            }
            i4++;
        }
        C40871vQ r1 = new C40871vQ(fArr, iArr);
        if (arrayList.size() <= i) {
            return r1;
        }
        float[] fArr2 = r1.A00;
        int[] iArr2 = r1.A01;
        int size = (arrayList.size() - i) / 2;
        float[] fArr3 = new float[size];
        float[] fArr4 = new float[size];
        int i10 = 0;
        int i11 = 0;
        while (i < arrayList.size()) {
            int i12 = i % 2;
            float floatValue2 = ((Number) arrayList.get(i)).floatValue();
            if (i12 == 0) {
                fArr3[i11] = floatValue2;
            } else {
                fArr4[i11] = floatValue2;
                i11++;
            }
            i++;
        }
        float[] fArr5 = fArr2;
        int length = fArr2.length;
        if (length == 0) {
            fArr5 = fArr3;
        } else if (size != 0) {
            int i13 = length + size;
            fArr5 = new float[i13];
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                float f6 = Float.NaN;
                if (i15 < length) {
                    f2 = fArr2[i15];
                } else {
                    f2 = Float.NaN;
                }
                if (i16 < size) {
                    f6 = fArr3[i16];
                }
                if (Float.isNaN(f6) || f2 < f6) {
                    fArr5[i17] = f2;
                    i15++;
                } else if (Float.isNaN(f2) || f6 < f2) {
                    fArr5[i17] = f6;
                    i16++;
                } else {
                    fArr5[i17] = f2;
                    i15++;
                    i16++;
                    i14++;
                }
            }
            if (i14 != 0) {
                fArr5 = Arrays.copyOf(fArr5, i13 - i14);
            }
        }
        int length2 = fArr5.length;
        int[] iArr3 = new int[length2];
        while (i10 < length2) {
            float f7 = fArr5[i10];
            int binarySearch = Arrays.binarySearch(fArr2, f7);
            int binarySearch2 = Arrays.binarySearch(fArr3, f7);
            if (binarySearch >= 0) {
                if (binarySearch2 <= 0) {
                    int i18 = iArr2[binarySearch];
                    if (size < 2 || f7 <= fArr3[0]) {
                        i3 = (int) (fArr4[0] * 255.0f);
                    } else {
                        int i19 = 1;
                        while (true) {
                            f3 = fArr3[i19];
                            if (f3 < f7 && i19 != size - 1) {
                                i19++;
                                if (i19 >= size) {
                                    throw new IllegalArgumentException("Unreachable code.");
                                }
                            }
                        }
                        if (f3 <= f7) {
                            f4 = fArr4[i19];
                        } else {
                            int i20 = i19 - 1;
                            float f8 = fArr3[i20];
                            float f9 = f7 - f8;
                            float f10 = fArr4[i20];
                            float f11 = fArr4[i19];
                            PointF pointF = C40761vE.A00;
                            f4 = f10 + ((f9 / (f3 - f8)) * (f11 - f10));
                        }
                        i3 = (int) (f4 * 255.0f);
                    }
                    i2 = Color.argb(i3, Color.red(i18), Color.green(i18), Color.blue(i18));
                    iArr3[i10] = i2;
                    i10++;
                }
            } else if (binarySearch2 < 0) {
                binarySearch2 = -(binarySearch2 + 1);
            }
            float f12 = fArr4[binarySearch2];
            if (iArr2.length < 2 || f7 == fArr2[0]) {
                i2 = iArr2[0];
                iArr3[i10] = i2;
                i10++;
            } else {
                int i21 = 1;
                while (i21 < length) {
                    float f13 = fArr2[i21];
                    if (f13 < f7 && i21 != length - 1) {
                        i21++;
                    } else if (i21 != length - 1 || f7 < f13) {
                        float f14 = fArr2[i21 - 1];
                        float f15 = (f7 - f14) / (f13 - f14);
                        int i22 = iArr2[i21];
                        int i23 = iArr2[i21 - 1];
                        i2 = Color.argb((int) (f12 * 255.0f), C40881vR.A02(f15, Color.red(i23), Color.red(i22)), C40881vR.A02(f15, Color.green(i23), Color.green(i22)), C40881vR.A02(f15, Color.blue(i23), Color.blue(i22)));
                        iArr3[i10] = i2;
                        i10++;
                    } else {
                        i2 = Color.argb((int) (f12 * 255.0f), Color.red(iArr2[i21]), Color.green(iArr2[i21]), Color.blue(iArr2[i21]));
                        iArr3[i10] = i2;
                        i10++;
                    }
                }
                throw new IllegalArgumentException("Unreachable code.");
            }
        }
        return new C40871vQ(fArr5, iArr3);
    }
}
