package X;

import android.graphics.Rect;

/* renamed from: X.C7p  reason: case insensitive filesystem */
public abstract class C24521C7p {
    public static final Rect[] A00(int i, int i2, int i3, boolean z) {
        Rect[] rectArr = new Rect[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            rectArr[i4] = AnonymousClass3MW.A07();
        }
        if (i2 != 0) {
            double d = ((double) i2) / ((double) i3);
            for (int i5 = 0; i5 < i3; i5++) {
                int A00 = C22339B3q.A00(((double) i5) * d);
                int A002 = i2 - C22339B3q.A00(((double) (i5 + 1)) * d);
                Rect rect = rectArr[i5];
                if (i != 1) {
                    rect.top = A00;
                    rect.bottom = A002;
                } else if (!z) {
                    rect.left = A00;
                    rect.right = A002;
                } else {
                    rect.left = A002;
                    rect.right = A00;
                }
            }
        }
        return rectArr;
    }
}
