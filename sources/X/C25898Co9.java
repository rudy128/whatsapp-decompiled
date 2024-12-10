package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* renamed from: X.Co9  reason: case insensitive filesystem */
public abstract class C25898Co9 {
    public static final ThreadLocal A00 = new ThreadLocal();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.graphics.Paint r3, java.lang.Integer r4) {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 0
            if (r2 < r0) goto L_0x0011
            if (r4 == 0) goto L_0x000d
            java.lang.Object r1 = X.C7I.A00(r4)
        L_0x000d:
            X.C7L.A00(r3, r1)
            return
        L_0x0011:
            if (r4 == 0) goto L_0x001e
            android.graphics.PorterDuff$Mode r0 = X.C7J.A00(r4)
            if (r0 == 0) goto L_0x001e
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            r1.<init>(r0)
        L_0x001e:
            r3.setXfermode(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25898Co9.A00(android.graphics.Paint, java.lang.Integer):void");
    }

    public static boolean A01(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C7K.A00(paint, str);
        }
        int length = str.length();
        if (length != 1 || !Character.isWhitespace(str.charAt(0))) {
            float measureText = paint.measureText("󟿽");
            float measureText2 = paint.measureText("m");
            float measureText3 = paint.measureText(str);
            float f = 0.0f;
            if (measureText3 != 0.0f) {
                if (str.codePointCount(0, length) > 1) {
                    if (measureText3 <= measureText2 * 2.0f) {
                        int i = 0;
                        while (i < length) {
                            int charCount = i + Character.charCount(str.codePointAt(i));
                            f += paint.measureText(str, i, charCount);
                            i = charCount;
                        }
                        if (measureText3 >= f) {
                            return false;
                        }
                    }
                }
                if (measureText3 == measureText) {
                    ThreadLocal threadLocal = A00;
                    C19760yx r3 = (C19760yx) threadLocal.get();
                    if (r3 == null) {
                        r3 = new C19760yx(AnonymousClass3MW.A07(), AnonymousClass3MW.A07());
                        threadLocal.set(r3);
                    } else {
                        ((Rect) r3.A00).setEmpty();
                        ((Rect) r3.A01).setEmpty();
                    }
                    Rect rect = (Rect) r3.A00;
                    paint.getTextBounds("󟿽", 0, 2, rect);
                    Object obj = r3.A01;
                    paint.getTextBounds(str, 0, length, (Rect) obj);
                    return !rect.equals(obj);
                }
            }
            return false;
        }
        return true;
    }
}
