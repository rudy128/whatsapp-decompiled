package X;

import android.text.StaticLayout;
import java.lang.reflect.Constructor;

/* renamed from: X.D5m  reason: case insensitive filesystem */
public final class C26598D5m implements E77 {
    public static Constructor A00;
    public static boolean A01;

    public boolean Bej(StaticLayout staticLayout) {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.reflect.Constructor} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.StaticLayout BG8(X.CUH r13) {
        /*
            r12 = this;
            java.lang.String r4 = "unable to call constructor"
            java.lang.String r3 = "StaticLayoutFactory"
            boolean r0 = A01
            if (r0 != 0) goto L_0x0054
            r7 = 1
            A01 = r7
            java.lang.Class<android.text.StaticLayout> r6 = android.text.StaticLayout.class
            r0 = 13
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x004c }
            java.lang.Class<java.lang.CharSequence> r1 = java.lang.CharSequence.class
            r0 = 0
            r5[r0] = r1     // Catch:{ NoSuchMethodException -> 0x004c }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x004c }
            r5[r7] = r2     // Catch:{ NoSuchMethodException -> 0x004c }
            r0 = 2
            r5[r0] = r2     // Catch:{ NoSuchMethodException -> 0x004c }
            java.lang.Class<android.text.TextPaint> r1 = android.text.TextPaint.class
            r0 = 3
            r5[r0] = r1     // Catch:{ NoSuchMethodException -> 0x004c }
            r0 = 4
            r5[r0] = r2     // Catch:{ NoSuchMethodException -> 0x004c }
            java.lang.Class<android.text.Layout$Alignment> r1 = android.text.Layout.Alignment.class
            r0 = 5
            r5[r0] = r1     // Catch:{ NoSuchMethodException -> 0x004c }
            java.lang.Class<android.text.TextDirectionHeuristic> r1 = android.text.TextDirectionHeuristic.class
            r0 = 6
            r5[r0] = r1     // Catch:{ NoSuchMethodException -> 0x004c }
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x004c }
            r0 = 7
            r5[r0] = r1     // Catch:{ NoSuchMethodException -> 0x004c }
            r0 = 8
            r5[r0] = r1     // Catch:{ NoSuchMethodException -> 0x004c }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x004c }
            r0 = 9
            r5[r0] = r1     // Catch:{ NoSuchMethodException -> 0x004c }
            java.lang.Class<android.text.TextUtils$TruncateAt> r0 = android.text.TextUtils.TruncateAt.class
            X.BE9.A1B(r0, r2, r5)     // Catch:{ NoSuchMethodException -> 0x004c }
            r0 = 12
            java.lang.reflect.Constructor r0 = X.BE6.A0w(r6, r2, r5, r0)     // Catch:{ NoSuchMethodException -> 0x004c }
            A00 = r0     // Catch:{ NoSuchMethodException -> 0x004c }
            goto L_0x0054
        L_0x004c:
            r0 = 0
            A00 = r0
            java.lang.String r0 = "unable to collect necessary constructor."
            android.util.Log.e(r3, r0)
        L_0x0054:
            java.lang.reflect.Constructor r5 = A00
            r6 = 0
            if (r5 == 0) goto L_0x00bb
            r0 = 13
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            java.lang.CharSequence r1 = r13.A0D     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r0 = 0
            r2[r0] = r1     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            X.AnonymousClass000.A1M(r2, r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            int r0 = r13.A02     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            X.AnonymousClass3Ma.A1S(r2, r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            android.text.TextPaint r1 = r13.A0B     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r0 = 3
            r2[r0] = r1     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            int r0 = r13.A08     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            X.AnonymousClass3Ma.A1T(r2, r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            android.text.Layout$Alignment r1 = r13.A09     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r0 = 5
            r2[r0] = r1     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            android.text.TextDirectionHeuristic r1 = r13.A0A     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r0 = 6
            r2[r0] = r1     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r0 = 7
            r2[r0] = r1     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            java.lang.Float r1 = X.BE7.A0W()     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r0 = 8
            r2[r0] = r1     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            boolean r0 = r13.A0E     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r0 = 9
            r2[r0] = r1     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            android.text.TextUtils$TruncateAt r1 = r13.A0C     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r0 = 10
            r2[r0] = r1     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            int r0 = r13.A01     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r0 = 11
            r2[r0] = r1     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            int r0 = r13.A07     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            X.BE8.A1L(r2, r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            java.lang.Object r0 = r5.newInstance(r2)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            android.text.StaticLayout r0 = (android.text.StaticLayout) r0     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b6 }
            r6 = r0
            goto L_0x00bb
        L_0x00b6:
            A00 = r6
            android.util.Log.e(r3, r4)
        L_0x00bb:
            if (r6 == 0) goto L_0x00be
            return r6
        L_0x00be:
            java.lang.CharSequence r1 = r13.A0D
            r2 = 0
            int r3 = r13.A02
            android.text.TextPaint r4 = r13.A0B
            int r5 = r13.A08
            android.text.Layout$Alignment r6 = r13.A09
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            boolean r9 = r13.A0E
            android.text.TextUtils$TruncateAt r10 = r13.A0C
            int r11 = r13.A01
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26598D5m.BG8(X.CUH):android.text.StaticLayout");
    }
}
