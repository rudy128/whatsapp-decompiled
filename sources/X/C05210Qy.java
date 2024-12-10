package X;

import android.animation.TimeInterpolator;

/* renamed from: X.0Qy  reason: invalid class name and case insensitive filesystem */
public class C05210Qy implements TimeInterpolator {
    public int A00;
    public int A01;
    public int[] A02;

    public float getInterpolation(float f) {
        float f2 = (float) this.A01;
        int i = (int) ((f * f2) + 0.5f);
        int i2 = this.A00;
        int[] iArr = this.A02;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        float f3 = 0.0f;
        if (i3 < i2) {
            f3 = ((float) i) / f2;
        }
        return (((float) i3) / ((float) i2)) + f3;
    }
}
