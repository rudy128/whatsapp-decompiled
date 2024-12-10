package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class CYk {
    public Rect A00;
    public final Bitmap A01;
    public final List A02;
    public final List A03;

    public C25587CiR A00() {
        E0K[] e0kArr;
        float f;
        float f2;
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Bitmap bitmap2 = bitmap;
            int width = bitmap.getWidth() * bitmap.getHeight();
            if (width > 12544) {
                double sqrt = Math.sqrt(12544.0d / ((double) width));
                if (sqrt > 0.0d) {
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * sqrt), (int) Math.ceil(((double) bitmap.getHeight()) * sqrt), false);
                }
            }
            Rect rect = this.A00;
            if (!(bitmap2 == bitmap || rect == null)) {
                double width2 = ((double) bitmap2.getWidth()) / ((double) bitmap.getWidth());
                rect.left = (int) Math.floor(((double) rect.left) * width2);
                rect.top = (int) Math.floor(((double) rect.top) * width2);
                rect.right = Math.min((int) Math.ceil(((double) rect.right) * width2), bitmap2.getWidth());
                rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width2), bitmap2.getHeight());
            }
            int width3 = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int[] iArr = new int[(width3 * height)];
            bitmap2.getPixels(iArr, 0, width3, 0, 0, width3, height);
            Rect rect2 = this.A00;
            if (rect2 != null) {
                int width4 = rect2.width();
                int height2 = this.A00.height();
                int[] iArr2 = new int[(width4 * height2)];
                for (int i = 0; i < height2; i++) {
                    Rect rect3 = this.A00;
                    System.arraycopy(iArr, ((rect3.top + i) * width3) + rect3.left, iArr2, i * width4, width4);
                }
                iArr = iArr2;
            }
            List list = this.A02;
            if (list.isEmpty()) {
                e0kArr = null;
            } else {
                e0kArr = (E0K[]) list.toArray(new E0K[list.size()]);
            }
            C26183Cu7 cu7 = new C26183Cu7(iArr, e0kArr);
            if (bitmap2 != bitmap) {
                bitmap2.recycle();
            }
            C25587CiR ciR = new C25587CiR(cu7.A00, this.A03);
            List list2 = ciR.A03;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C25568Ci7 ci7 = (C25568Ci7) list2.get(i2);
                float[] fArr = ci7.A02;
                int i3 = 0;
                int i4 = 0;
                float f3 = 0.0f;
                do {
                    float f4 = fArr[i4];
                    if (f4 > 0.0f) {
                        f3 += f4;
                    }
                    i4++;
                } while (i4 < 3);
                if (f3 != 0.0f) {
                    do {
                        float f5 = fArr[i3];
                        if (f5 > 0.0f) {
                            fArr[i3] = f5 / f3;
                        }
                        i3++;
                    } while (i3 < 3);
                }
                Map map = ciR.A04;
                List list3 = ciR.A02;
                int size2 = list3.size();
                float f6 = 0.0f;
                C25834Cmn cmn = null;
                for (int i5 = 0; i5 < size2; i5++) {
                    C25834Cmn cmn2 = (C25834Cmn) list3.get(i5);
                    float[] A012 = cmn2.A01();
                    int i6 = 1;
                    float f7 = A012[1];
                    float[] fArr2 = ci7.A01;
                    if (f7 >= fArr2[0] && f7 <= fArr2[2]) {
                        float f8 = A012[2];
                        float[] fArr3 = ci7.A00;
                        if (f8 >= fArr3[0] && f8 <= fArr3[2] && !ciR.A00.get(cmn2.A05)) {
                            float[] A013 = cmn2.A01();
                            C25834Cmn cmn3 = ciR.A01;
                            if (cmn3 != null) {
                                i6 = cmn3.A04;
                            }
                            float[] fArr4 = ci7.A02;
                            float f9 = fArr4[0];
                            float f10 = 0.0f;
                            if (f9 > 0.0f) {
                                f = f9 * (1.0f - C108945cZ.A00(A013[1], fArr2[1]));
                            } else {
                                f = 0.0f;
                            }
                            float f11 = fArr4[1];
                            if (f11 > 0.0f) {
                                f2 = f11 * (1.0f - C108945cZ.A00(A013[2], fArr3[1]));
                            } else {
                                f2 = 0.0f;
                            }
                            float f12 = fArr4[2];
                            if (f12 > 0.0f) {
                                f10 = f12 * (((float) cmn2.A04) / ((float) i6));
                            }
                            float f13 = f + f2 + f10;
                            if (cmn == null || f13 > f6) {
                                cmn = cmn2;
                                f6 = f13;
                            }
                        }
                    }
                }
                if (cmn != null) {
                    ciR.A00.append(cmn.A05, true);
                }
                map.put(ci7, cmn);
            }
            ciR.A00.clear();
            return ciR;
        }
        throw new AssertionError();
    }

    public void A01(int i, int i2, int i3, int i4) {
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Rect rect = this.A00;
            if (rect == null) {
                rect = AnonymousClass3MW.A07();
                this.A00 = rect;
            }
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            if (!this.A00.intersect(i, i2, i3, i4)) {
                throw AnonymousClass000.A0k("The given region must intersect with the Bitmap's dimensions.");
            }
        }
    }

    public CYk(Bitmap bitmap) {
        ArrayList A13 = AnonymousClass000.A13();
        this.A03 = A13;
        ArrayList A132 = AnonymousClass000.A13();
        this.A02 = A132;
        if (!bitmap.isRecycled()) {
            A132.add(C25587CiR.A05);
            this.A01 = bitmap;
            A13.add(C25568Ci7.A06);
            A13.add(C25568Ci7.A08);
            A13.add(C25568Ci7.A04);
            A13.add(C25568Ci7.A05);
            A13.add(C25568Ci7.A07);
            A13.add(C25568Ci7.A03);
            return;
        }
        throw AnonymousClass000.A0k("Bitmap is not valid");
    }
}
