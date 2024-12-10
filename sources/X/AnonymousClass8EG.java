package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.8EG  reason: invalid class name */
public class AnonymousClass8EG extends C29281bx {
    public static Class A00;
    public static Constructor A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[SYNTHETIC, Splitter:B:13:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b A[SYNTHETIC, Splitter:B:21:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r6, X.C187099fG[] r7, int r8) {
        /*
            r5 = this;
            r3 = 0
            int r1 = r7.length
            r0 = 1
            r4 = 0
            if (r1 < r0) goto L_0x0098
            X.9fG r0 = r5.A06(r7, r8)
            android.content.ContentResolver r2 = r6.getContentResolver()
            android.net.Uri r1 = r0.A03     // Catch:{ IOException -> 0x0097 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r2.openFileDescriptor(r1, r0, r3)     // Catch:{ IOException -> 0x0097 }
            if (r3 == 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ ErrnoException -> 0x003e }
            java.lang.String r0 = "/proc/self/fd/"
            r1.append(r0)     // Catch:{ ErrnoException -> 0x003e }
            int r0 = r3.getFd()     // Catch:{ ErrnoException -> 0x003e }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ ErrnoException -> 0x003e }
            java.lang.String r1 = android.system.Os.readlink(r0)     // Catch:{ ErrnoException -> 0x003e }
            android.system.StructStat r0 = android.system.Os.stat(r1)     // Catch:{ ErrnoException -> 0x003e }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x003e }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x003e }
            if (r0 == 0) goto L_0x003e
            java.io.File r1 = X.C108945cZ.A17(r1)     // Catch:{ ErrnoException -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r1 = r4
        L_0x003f:
            if (r1 == 0) goto L_0x004c
            boolean r0 = r1.canRead()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x004c
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r1)     // Catch:{ all -> 0x008d }
            goto L_0x007f
        L_0x004c:
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x008d }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x008d }
            r2.<init>(r0)     // Catch:{ all -> 0x008d }
            java.io.File r1 = X.C20054A5b.A00(r6)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x007b
            boolean r0 = X.C20054A5b.A03(r1, r2)     // Catch:{ RuntimeException -> 0x0076, all -> 0x0071 }
            if (r0 != 0) goto L_0x0065
            r1.delete()     // Catch:{ all -> 0x0083 }
            goto L_0x007b
        L_0x0065:
            java.lang.String r0 = r1.getPath()     // Catch:{ RuntimeException -> 0x0076, all -> 0x0071 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ RuntimeException -> 0x0076, all -> 0x0071 }
            r1.delete()     // Catch:{ all -> 0x0083 }
            goto L_0x007c
        L_0x0071:
            r0 = move-exception
            r1.delete()     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0076:
            r1.delete()     // Catch:{ all -> 0x0083 }
            r0 = r4
            goto L_0x007c
        L_0x007b:
            r0 = r4
        L_0x007c:
            r2.close()     // Catch:{ all -> 0x008d }
        L_0x007f:
            r3.close()     // Catch:{ IOException -> 0x0097 }
            return r0
        L_0x0083:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x008d }
        L_0x008c:
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0092 }
            goto L_0x0096
        L_0x0092:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0097 }
        L_0x0096:
            throw r1     // Catch:{ IOException -> 0x0097 }
        L_0x0097:
            return r4
        L_0x0098:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EG.A05(android.content.Context, X.9fG[], int):android.graphics.Typeface");
    }

    public static void A01() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        if (!A04) {
            A04 = true;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", C17890vO.A0U(e), e);
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
    }

    public Typeface A02(Context context, Resources resources, C51022Wr r15, int i) {
        A01();
        try {
            Object newInstance = A01.newInstance(new Object[0]);
            C55532fw[] r10 = r15.A00;
            int length = r10.length;
            int i2 = 0;
            while (i2 < length) {
                C55532fw r1 = r10[i2];
                File A002 = C20054A5b.A00(context);
                if (A002 == null) {
                    return null;
                }
                try {
                    if (C20054A5b.A02(resources, A002, r1.A00)) {
                        String path = A002.getPath();
                        int i3 = r1.A02;
                        boolean z = r1.A05;
                        A01();
                        Method method = A02;
                        Object[] A1a = AnonymousClass8BR.A1a();
                        A1a[0] = path;
                        AnonymousClass000.A1M(A1a, i3);
                        AnonymousClass8BU.A1Q(A1a, z);
                        if (AnonymousClass000.A1Y(method.invoke(newInstance, A1a))) {
                            A002.delete();
                            i2++;
                        }
                    }
                    A002.delete();
                    return null;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw AnonymousClass8BR.A0x(e);
                } catch (RuntimeException unused) {
                    A002.delete();
                    return null;
                } catch (Throwable th) {
                    A002.delete();
                    throw th;
                }
            }
            A01();
            try {
                Object newInstance2 = Array.newInstance(A00, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) A03.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw AnonymousClass8BR.A0x(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw AnonymousClass8BR.A0x(e3);
        }
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
