package X;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.8EH  reason: invalid class name */
public class AnonymousClass8EH extends C29281bx {
    public static final Class A00;
    public static final Constructor A01;
    public static final Method A02;
    public static final Method A03;

    public Typeface A05(Context context, C187099fG[] r15, int i) {
        Object obj;
        Typeface typeface;
        boolean z;
        try {
            obj = A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            AnonymousClass00O r8 = new AnonymousClass00O(0);
            int length = r15.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    C187099fG r1 = r15[i2];
                    Uri uri = r1.A03;
                    Object obj2 = (ByteBuffer) r8.get(uri);
                    if (obj2 == null) {
                        obj2 = C20054A5b.A01(context, uri);
                        r8.put(uri, obj2);
                        if (obj2 == null) {
                            break;
                        }
                    }
                    int i3 = r1.A01;
                    int i4 = r1.A02;
                    boolean z2 = r1.A04;
                    try {
                        Method method = A02;
                        Object[] objArr = new Object[5];
                        objArr[0] = obj2;
                        AnonymousClass000.A1M(objArr, i3);
                        objArr[2] = null;
                        C17890vO.A1G(objArr, i4);
                        objArr[4] = Boolean.valueOf(z2);
                        z = AnonymousClass000.A1Y(method.invoke(obj, objArr));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        break;
                    }
                    i2++;
                } else {
                    try {
                        Object newInstance = Array.newInstance(A00, 1);
                        Array.set(newInstance, 0, obj);
                        typeface = (Typeface) A03.invoke((Object) null, new Object[]{newInstance});
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return Typeface.create(typeface, i);
                    }
                }
            }
        }
        return null;
    }

    static {
        Constructor<?> constructor;
        Class<?> cls;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class[] clsArr = new Class[5];
            clsArr[0] = ByteBuffer.class;
            Class cls2 = Integer.TYPE;
            clsArr[1] = cls2;
            AnonymousClass001.A1R(List.class, cls2, clsArr);
            clsArr[4] = Boolean.TYPE;
            method = cls.getMethod("addFontWeightStyle", clsArr);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", C17890vO.A0U(e), e);
            cls = null;
            method2 = null;
            constructor = null;
            method = null;
        }
        A01 = constructor;
        A00 = cls;
        A02 = method;
        A03 = method2;
    }

    public static boolean A01() {
        if (A02 != null) {
            return true;
        }
        Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A02(android.content.Context r16, android.content.res.Resources r17, X.C51022Wr r18, int r19) {
        /*
            r15 = this;
            java.lang.reflect.Constructor r1 = A01     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            java.lang.Object r5 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r5 = 0
        L_0x000b:
            r4 = 0
            if (r5 == 0) goto L_0x00a1
            r0 = r18
            X.2fw[] r8 = r0.A00
            int r7 = r8.length
            r6 = 0
        L_0x0014:
            if (r6 >= r7) goto L_0x0088
            r3 = r8[r6]
            int r0 = r3.A00
            java.io.File r2 = X.C20054A5b.A00(r16)
            if (r2 == 0) goto L_0x004e
            r1 = r17
            boolean r0 = X.C20054A5b.A02(r1, r2, r0)     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0029
            goto L_0x004b
        L_0x0029:
            java.io.FileInputStream r0 = X.C108945cZ.A18(r2)     // Catch:{ IOException -> 0x0050 }
            java.nio.channels.FileChannel r9 = r0.getChannel()     // Catch:{ all -> 0x0041 }
            long r13 = r9.size()     // Catch:{ all -> 0x0041 }
            java.nio.channels.FileChannel$MapMode r10 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0041 }
            r11 = 0
            java.nio.MappedByteBuffer r12 = r9.map(r10, r11, r13)     // Catch:{ all -> 0x0041 }
            r0.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0051
        L_0x0041:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0050 }
        L_0x004a:
            throw r1     // Catch:{ IOException -> 0x0050 }
        L_0x004b:
            r2.delete()
        L_0x004e:
            r12 = r4
            goto L_0x0054
        L_0x0050:
            r12 = 0
        L_0x0051:
            r2.delete()
        L_0x0054:
            if (r12 == 0) goto L_0x00a1
            int r11 = r3.A01
            int r10 = r3.A02
            boolean r9 = r3.A05
            r1 = 0
            java.lang.reflect.Method r3 = A02     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007d }
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007d }
            r2[r1] = r12     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007d }
            X.AnonymousClass000.A1M(r2, r11)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007d }
            r0 = 2
            r2[r0] = r4     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007d }
            X.C17890vO.A1G(r2, r10)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007d }
            r0 = 4
            r2[r0] = r1     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007d }
            java.lang.Object r0 = r3.invoke(r5, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007d }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007d }
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            if (r0 == 0) goto L_0x00a1
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0083:
            r0 = move-exception
            r2.delete()
            throw r0
        L_0x0088:
            java.lang.Class r1 = A00     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00a0 }
            r0 = 1
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00a0 }
            r2 = 0
            java.lang.reflect.Array.set(r3, r2, r5)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00a0 }
            java.lang.reflect.Method r1 = A03     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00a0 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00a0 }
            r0[r2] = r3     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00a0 }
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00a0 }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00a0 }
            return r0
        L_0x00a0:
            return r4
        L_0x00a1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EH.A02(android.content.Context, android.content.res.Resources, X.2Wr, int):android.graphics.Typeface");
    }

    public Typeface A04(Context context, Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = C197549ws.A00(typeface, i, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 == null) {
            return super.A04(context, typeface, i, z);
        }
        return typeface2;
    }
}
