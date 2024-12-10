package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: X.8EF  reason: invalid class name */
public class AnonymousClass8EF extends AnonymousClass8EG {
    public final Constructor A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;
    public final Class A05;
    public final Method A06;

    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r15.A01.invoke(r2, new java.lang.Object[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r16, X.C187099fG[] r17, int r18) {
        /*
            r15 = this;
            r2 = 0
            r11 = r17
            int r10 = r11.length
            r14 = 0
            r0 = 1
            if (r10 < r0) goto L_0x00e3
            java.lang.reflect.Method r3 = r15.A02
            if (r3 != 0) goto L_0x0013
            java.lang.String r1 = "TypefaceCompatApi26Impl"
            java.lang.String r0 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r1, r0)
        L_0x0013:
            boolean r0 = X.AnonymousClass000.A1W(r3)
            r5 = r18
            r6 = r16
            if (r0 != 0) goto L_0x0057
            X.9fG r4 = r15.A06(r11, r5)
            android.content.ContentResolver r3 = r6.getContentResolver()
            android.net.Uri r1 = r4.A03     // Catch:{ IOException -> 0x0056 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r1, r0, r2)     // Catch:{ IOException -> 0x0056 }
            if (r3 == 0) goto L_0x00e3
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x004c }
            android.graphics.Typeface$Builder r1 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x004c }
            r1.<init>(r0)     // Catch:{ all -> 0x004c }
            int r0 = r4.A02     // Catch:{ all -> 0x004c }
            android.graphics.Typeface$Builder r1 = r1.setWeight(r0)     // Catch:{ all -> 0x004c }
            boolean r0 = r4.A04     // Catch:{ all -> 0x004c }
            android.graphics.Typeface$Builder r0 = r1.setItalic(r0)     // Catch:{ all -> 0x004c }
            android.graphics.Typeface r0 = r0.build()     // Catch:{ all -> 0x004c }
            r3.close()     // Catch:{ IOException -> 0x0056 }
            return r0
        L_0x004c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0056 }
        L_0x0055:
            throw r1     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            return r2
        L_0x0057:
            java.util.HashMap r4 = X.C17880vN.A11()
            r3 = 0
        L_0x005c:
            if (r3 >= r10) goto L_0x0076
            r1 = r17[r3]
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0073
            android.net.Uri r1 = r1.A03
            boolean r0 = r4.containsKey(r1)
            if (r0 != 0) goto L_0x0073
            java.nio.MappedByteBuffer r0 = X.C20054A5b.A01(r6, r1)
            r4.put(r1, r0)
        L_0x0073:
            int r3 = r3 + 1
            goto L_0x005c
        L_0x0076:
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r4)
            java.lang.reflect.Constructor r1 = r15.A00     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0083 }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0083 }
            java.lang.Object r2 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0083 }
        L_0x0083:
            if (r2 == 0) goto L_0x00e3
            r3 = 0
            r8 = 0
        L_0x0087:
            if (r8 >= r10) goto L_0x00bd
            r1 = r17[r8]
            android.net.Uri r0 = r1.A03
            java.lang.Object r13 = r9.get(r0)
            if (r13 == 0) goto L_0x00ba
            int r12 = r1.A01
            int r7 = r1.A02
            boolean r6 = r1.A04
            r4 = 0
            java.lang.reflect.Method r3 = r15.A03     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            r1[r4] = r13     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            X.AnonymousClass000.A1M(r1, r12)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            r0 = 2
            r1[r0] = r14     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            X.C17890vO.A1G(r1, r7)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            X.AnonymousClass3Ma.A1T(r1, r6)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            java.lang.Object r0 = r3.invoke(r2, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            if (r0 == 0) goto L_0x00db
            r3 = 1
        L_0x00ba:
            int r8 = r8 + 1
            goto L_0x0087
        L_0x00bd:
            if (r3 == 0) goto L_0x00db
            r0 = 0
            java.lang.reflect.Method r1 = r15.A04     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00cd }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00cd }
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00cd }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00cd }
            goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            if (r0 == 0) goto L_0x00e3
            android.graphics.Typeface r0 = r15.A07(r2)
            if (r0 == 0) goto L_0x00e3
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r5)
            return r0
        L_0x00db:
            java.lang.reflect.Method r1 = r15.A01     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00e3 }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00e3 }
            r1.invoke(r2, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00e3 }
        L_0x00e3:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EF.A05(android.content.Context, X.9fG[], int):android.graphics.Typeface");
    }

    public Typeface A07(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A05, 1);
            Array.set(newInstance, 0, obj);
            Method method = this.A06;
            Object[] A1a = AnonymousClass8BR.A1a();
            A1a[0] = newInstance;
            A1a[1] = -1;
            A1a[2] = -1;
            return (Typeface) method.invoke((Object) null, A1a);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A08(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Typeface A02(Context context, Resources resources, C51022Wr r17, int i) {
        Object obj;
        boolean z;
        boolean z2;
        Method method = this.A02;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        C51022Wr r3 = r17;
        if (!AnonymousClass000.A1W(method)) {
            return super.A02(context, resources, r3, i);
        }
        try {
            obj = this.A00.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C55532fw[] r7 = r3.A00;
            int length = r7.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    C55532fw r0 = r7[i2];
                    String str = r0.A03;
                    int i3 = r0.A01;
                    int i4 = r0.A02;
                    boolean z3 = r0.A05;
                    Object fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(r0.A04);
                    try {
                        Object[] objArr = new Object[8];
                        AnonymousClass8BS.A1B(context.getAssets(), str, objArr);
                        AnonymousClass3Ma.A1S(objArr, 0);
                        objArr[3] = false;
                        AnonymousClass3Ma.A1T(objArr, i3);
                        AnonymousClass3Ma.A1U(objArr, i4);
                        C17890vO.A1H(objArr, z3 ? 1 : 0);
                        objArr[7] = fromFontVariationSettings;
                        z2 = AnonymousClass000.A1Y(method.invoke(obj, objArr));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z2 = false;
                    }
                    if (!z2) {
                        try {
                            this.A01.invoke(obj, new Object[0]);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                        }
                    } else {
                        i2++;
                    }
                } else {
                    try {
                        z = AnonymousClass000.A1Y(this.A04.invoke(obj, new Object[0]));
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                        z = false;
                    }
                    if (z) {
                        return A07(obj);
                    }
                }
            }
        }
        return null;
    }

    public Typeface A03(Context context, Resources resources, String str, int i, int i2) {
        Object obj;
        boolean z;
        boolean z2;
        Method method = this.A02;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (!AnonymousClass000.A1W(method)) {
            return super.A03(context, resources, str, i, i2);
        }
        try {
            obj = this.A00.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        try {
            Object[] objArr = new Object[8];
            AnonymousClass8BS.A1B(context.getAssets(), str, objArr);
            AnonymousClass3Ma.A1S(objArr, 0);
            objArr[3] = false;
            AnonymousClass3Ma.A1T(objArr, 0);
            AnonymousClass3Ma.A1U(objArr, -1);
            C17890vO.A1H(objArr, -1);
            objArr[7] = null;
            z = AnonymousClass000.A1Y(method.invoke(obj, objArr));
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            z = false;
        }
        if (!z) {
            try {
                this.A01.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused3) {
            }
            return null;
        }
        try {
            z2 = AnonymousClass000.A1Y(this.A04.invoke(obj, new Object[0]));
        } catch (IllegalAccessException | InvocationTargetException unused4) {
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        return A07(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r3 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0 = X.AnonymousClass8BR.A0x(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r0 = X.AnonymousClass8BR.A0x(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A04(android.content.Context r9, android.graphics.Typeface r10, int r11, boolean r12) {
        /*
            r8 = this;
            java.lang.reflect.Field r1 = X.AnonymousClass9UD.A03     // Catch:{ RuntimeException -> 0x006f }
            boolean r0 = X.AnonymousClass000.A1W(r1)
            if (r0 != 0) goto L_0x000a
            r3 = 0
            goto L_0x0070
        L_0x000a:
            int r6 = r11 << 1
            r6 = r6 | r12
            java.lang.Object r7 = X.AnonymousClass9UD.A01     // Catch:{ RuntimeException -> 0x006f }
            monitor-enter(r7)     // Catch:{ RuntimeException -> 0x006f }
            long r0 = r1.getLong(r10)     // Catch:{ IllegalAccessException -> 0x0060 }
            X.00p r3 = X.AnonymousClass9UD.A00     // Catch:{ all -> 0x006c }
            java.lang.Object r5 = r3.A05(r0)     // Catch:{ all -> 0x006c }
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch:{ all -> 0x006c }
            if (r5 != 0) goto L_0x0028
            r2 = 4
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch:{ all -> 0x006c }
            r5.<init>(r2)     // Catch:{ all -> 0x006c }
            r3.A0A(r0, r5)     // Catch:{ all -> 0x006c }
            goto L_0x0032
        L_0x0028:
            java.lang.Object r3 = r5.get(r6)     // Catch:{ all -> 0x006c }
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x0032
        L_0x0030:
            monitor-exit(r7)     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x0032:
            java.lang.reflect.Method r4 = X.AnonymousClass9UD.A04     // Catch:{ IllegalAccessException -> 0x005a, InvocationTargetException -> 0x0066 }
            java.lang.Object[] r3 = X.AnonymousClass8BR.A1a()     // Catch:{ IllegalAccessException -> 0x005a, InvocationTargetException -> 0x0066 }
            X.C17890vO.A1L(r3, r0)     // Catch:{ IllegalAccessException -> 0x005a, InvocationTargetException -> 0x0066 }
            X.AnonymousClass000.A1M(r3, r11)     // Catch:{ IllegalAccessException -> 0x005a, InvocationTargetException -> 0x0066 }
            X.AnonymousClass8BU.A1Q(r3, r12)     // Catch:{ IllegalAccessException -> 0x005a, InvocationTargetException -> 0x0066 }
            r2 = 0
            java.lang.Object r0 = r4.invoke(r2, r3)     // Catch:{ IllegalAccessException -> 0x005a, InvocationTargetException -> 0x0066 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IllegalAccessException -> 0x005a, InvocationTargetException -> 0x0066 }
            java.lang.reflect.Constructor r1 = X.AnonymousClass9UD.A02     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0055 }
            java.lang.Object[] r0 = X.AnonymousClass8BV.A1b(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0055 }
            java.lang.Object r3 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0055 }
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            r5.put(r6, r3)     // Catch:{ all -> 0x006c }
            goto L_0x0030
        L_0x005a:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)     // Catch:{ all -> 0x006c }
            goto L_0x006b
        L_0x0060:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)     // Catch:{ all -> 0x006c }
            goto L_0x006b
        L_0x0066:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)     // Catch:{ all -> 0x006c }
        L_0x006b:
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ RuntimeException -> 0x006f }
        L_0x006f:
            r3 = 0
        L_0x0070:
            if (r3 != 0) goto L_0x0076
            android.graphics.Typeface r3 = super.A04(r9, r10, r11, r12)
        L_0x0076:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EF.A04(android.content.Context, android.graphics.Typeface, int, boolean):android.graphics.Typeface");
    }

    public AnonymousClass8EF() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            Class<FontVariationAxis[]> cls3 = FontVariationAxis[].class;
            method = cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, cls3});
            Class[] clsArr = new Class[5];
            AnonymousClass8BS.A1B(ByteBuffer.class, cls2, clsArr);
            AnonymousClass001.A1R(cls3, cls2, clsArr);
            clsArr[4] = cls2;
            method2 = cls.getMethod("addFontFromBuffer", clsArr);
            method3 = cls.getMethod("freeze", new Class[0]);
            method4 = cls.getMethod("abortCreation", new Class[0]);
            method5 = A08(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unable to collect necessary methods for class ");
            AnonymousClass8BW.A1M(e, A10);
            Log.e("TypefaceCompatApi26Impl", A10.toString(), e);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.A05 = cls;
        this.A00 = constructor;
        this.A02 = method;
        this.A03 = method2;
        this.A04 = method3;
        this.A01 = method4;
        this.A06 = method5;
    }
}
