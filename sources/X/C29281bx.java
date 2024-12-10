package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1bx  reason: invalid class name and case insensitive filesystem */
public abstract class C29281bx {
    public ConcurrentHashMap A00 = new ConcurrentHashMap();

    public abstract Typeface A02(Context context, Resources resources, C51022Wr r3, int i);

    public abstract Typeface A05(Context context, C187099fG[] r2, int i);

    public static long A00(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd A[Catch:{ IllegalAccessException -> 0x00d3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A04(android.content.Context r25, android.graphics.Typeface r26, int r27, boolean r28) {
        /*
            r24 = this;
            r7 = r26
            java.lang.reflect.Field r1 = X.AnonymousClass2WY.A02     // Catch:{ RuntimeException -> 0x00dd }
            r0 = 0
            if (r1 == 0) goto L_0x0008
            r0 = 1
        L_0x0008:
            if (r0 != 0) goto L_0x000d
            r0 = 0
            goto L_0x00de
        L_0x000d:
            r10 = r27
            int r8 = r27 << 1
            r9 = r28
            r8 = r8 | r28
            java.lang.Object r17 = X.AnonymousClass2WY.A01     // Catch:{ RuntimeException -> 0x00dd }
            monitor-enter(r17)     // Catch:{ RuntimeException -> 0x00dd }
            java.lang.Object r0 = r1.get(r7)     // Catch:{ IllegalAccessException -> 0x00d3 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalAccessException -> 0x00d3 }
            long r0 = r0.longValue()     // Catch:{ IllegalAccessException -> 0x00d3 }
            X.00p r3 = X.AnonymousClass2WY.A00     // Catch:{ all -> 0x00da }
            java.lang.Object r6 = r3.A05(r0)     // Catch:{ all -> 0x00da }
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch:{ all -> 0x00da }
            if (r6 != 0) goto L_0x005e
            r2 = 4
            android.util.SparseArray r6 = new android.util.SparseArray     // Catch:{ all -> 0x00da }
            r6.<init>(r2)     // Catch:{ all -> 0x00da }
            r3.A0A(r0, r6)     // Catch:{ all -> 0x00da }
        L_0x0035:
            long r3 = A00(r7)     // Catch:{ all -> 0x00da }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ba
            r0 = r24
            java.util.concurrent.ConcurrentHashMap r12 = r0.A00     // Catch:{ all -> 0x00da }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00da }
            java.lang.Object r11 = r12.get(r0)     // Catch:{ all -> 0x00da }
            X.2Wr r11 = (X.C51022Wr) r11     // Catch:{ all -> 0x00da }
            if (r11 == 0) goto L_0x00ba
            r19 = r25
            android.content.res.Resources r4 = r19.getResources()     // Catch:{ all -> 0x00da }
            X.2fw[] r15 = r11.A00     // Catch:{ all -> 0x00da }
            int r14 = r15.length     // Catch:{ all -> 0x00da }
            r13 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            goto L_0x0067
        L_0x005e:
            java.lang.Object r0 = r6.get(r8)     // Catch:{ all -> 0x00da }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0035
            goto L_0x00d1
        L_0x0067:
            if (r3 >= r14) goto L_0x0088
            r2 = r15[r3]     // Catch:{ all -> 0x00da }
            int r0 = r2.A02     // Catch:{ all -> 0x00da }
            int r0 = r0 - r27
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x00da }
            int r1 = r0 * 2
            boolean r0 = r2.A05     // Catch:{ all -> 0x00da }
            r16 = 1
            if (r0 != r9) goto L_0x007d
            r16 = 0
        L_0x007d:
            int r1 = r1 + r16
            if (r13 == 0) goto L_0x0083
            if (r5 <= r1) goto L_0x0085
        L_0x0083:
            r13 = r2
            r5 = r1
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x0067
        L_0x0088:
            if (r13 == 0) goto L_0x00ba
            int r3 = r13.A00     // Catch:{ all -> 0x00da }
            java.lang.String r2 = r13.A03     // Catch:{ all -> 0x00da }
            r1 = 0
            X.1bx r18 = X.C29271bw.A01     // Catch:{ all -> 0x00da }
            r20 = r4
            r21 = r2
            r22 = r3
            r23 = r1
            android.graphics.Typeface r0 = r18.A03(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00a8
            java.lang.String r2 = X.C29271bw.A00(r4, r2, r3, r1, r1)     // Catch:{ all -> 0x00da }
            X.00z r1 = X.C29271bw.A00     // Catch:{ all -> 0x00da }
            r1.A08(r2, r0)     // Catch:{ all -> 0x00da }
        L_0x00a8:
            long r4 = A00(r0)     // Catch:{ all -> 0x00da }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00bb
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00da }
            r12.put(r1, r11)     // Catch:{ all -> 0x00da }
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            if (r0 != 0) goto L_0x00ce
            r1 = 600(0x258, float:8.41E-43)
            r0 = 1
            if (r10 < r1) goto L_0x00c6
            if (r28 == 0) goto L_0x00ca
            r0 = 3
            goto L_0x00ca
        L_0x00c6:
            r0 = 2
            if (r28 != 0) goto L_0x00ca
            r0 = 0
        L_0x00ca:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r7, r0)     // Catch:{ all -> 0x00da }
        L_0x00ce:
            r6.put(r8, r0)     // Catch:{ all -> 0x00da }
        L_0x00d1:
            monitor-exit(r17)     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00d3:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00da }
            r0.<init>(r1)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ RuntimeException -> 0x00dd }
        L_0x00dd:
            r0 = 0
        L_0x00de:
            if (r0 == 0) goto L_0x00e1
            return r0
        L_0x00e1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29281bx.A04(android.content.Context, android.graphics.Typeface, int, boolean):android.graphics.Typeface");
    }

    public C187099fG A06(C187099fG[] r11, int i) {
        int i2 = 700;
        if ((i & 1) == 0) {
            i2 = 400;
        }
        boolean z = false;
        if ((i & 2) != 0) {
            z = true;
        }
        C187099fG r6 = null;
        int i3 = Integer.MAX_VALUE;
        for (C187099fG r3 : r11) {
            int abs = Math.abs(r3.A02 - i2) * 2;
            int i4 = 1;
            if (r3.A04 == z) {
                i4 = 0;
            }
            int i5 = abs + i4;
            if (r6 == null || i3 > i5) {
                r6 = r3;
                i3 = i5;
            }
        }
        return r6;
    }

    public Typeface A03(Context context, Resources resources, String str, int i, int i2) {
        File A002 = C20054A5b.A00(context);
        if (A002 == null) {
            return null;
        }
        try {
            if (!C20054A5b.A02(resources, A002, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(A002.getPath());
            A002.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A002.delete();
        }
    }
}
