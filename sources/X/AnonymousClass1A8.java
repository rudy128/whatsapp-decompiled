package X;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1A8  reason: invalid class name */
public class AnonymousClass1A8 {
    public static boolean A00 = true;
    public static int A01;
    public static int A02;
    public static AnonymousClass1AD A03;
    public static C224119u A04;
    public static AnonymousClass1AE[] A05;
    public static final HashSet A06 = new HashSet();
    public static final AtomicInteger A07 = new AtomicInteger(0);
    public static final ReentrantReadWriteLock A08 = new ReentrantReadWriteLock();
    public static final String[] A09 = {System.mapLibraryName("breakpad")};
    public static final Map A0A = new HashMap();
    public static final Set A0B = Collections.newSetFromMap(new ConcurrentHashMap());
    public static volatile AnonymousClass1AB[] A0C;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009c A[LOOP:0: B:1:0x0001->B:21:0x009c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(android.os.StrictMode.ThreadPolicy r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r3 = 0
        L_0x0001:
            r0 = r16
            boolean r3 = A05(r12, r13, r14, r15, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0008 }
            return r3
        L_0x0008:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicInteger r10 = A07
            int r2 = r10.get()
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = A08
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.writeLock()
            r0.lock()
            X.1AD r7 = A03     // Catch:{ IOException -> 0x00a7 }
            if (r7 == 0) goto L_0x008c
            X.1AC r0 = r7.A02     // Catch:{ IOException -> 0x00a7 }
            java.io.File r4 = r0.A00     // Catch:{ IOException -> 0x00a7 }
            android.content.Context r1 = r7.A01     // Catch:{ NameNotFoundException -> 0x009f }
            java.lang.String r0 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x009f }
            android.content.Context r6 = r1.createPackageContext(r0, r3)     // Catch:{ NameNotFoundException -> 0x009f }
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ IOException -> 0x00a7 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x00a7 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x00a7 }
            boolean r0 = r4.equals(r8)     // Catch:{ IOException -> 0x00a7 }
            if (r0 != 0) goto L_0x008c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a7 }
            r1.<init>()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = "Native library directory updated from "
            r1.append(r0)     // Catch:{ IOException -> 0x00a7 }
            r1.append(r4)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ IOException -> 0x00a7 }
            r1.append(r8)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r5 = "SoLoader"
            android.util.Log.d(r5, r0)     // Catch:{ IOException -> 0x00a7 }
            int r0 = r7.A00     // Catch:{ IOException -> 0x00a7 }
            r4 = r0 | 1
            r7.A00 = r4     // Catch:{ IOException -> 0x00a7 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ IOException -> 0x00a7 }
            X.1AC r1 = new X.1AC     // Catch:{ IOException -> 0x00a7 }
            r1.<init>(r8, r0, r4)     // Catch:{ IOException -> 0x00a7 }
            r7.A02 = r1     // Catch:{ IOException -> 0x00a7 }
            int r0 = r7.A00     // Catch:{ IOException -> 0x00a7 }
            r1.A03(r0)     // Catch:{ IOException -> 0x00a7 }
            r7.A01 = r6     // Catch:{ IOException -> 0x00a7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a7 }
            r1.<init>()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = "sApplicationSoSource updated during load: "
            r1.append(r0)     // Catch:{ IOException -> 0x00a7 }
            r1.append(r13)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = ", attempting load again."
            r1.append(r0)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00a7 }
            android.util.Log.w(r5, r0)     // Catch:{ IOException -> 0x00a7 }
            r10.getAndIncrement()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x008e
        L_0x008c:
            r1 = 0
            goto L_0x008f
        L_0x008e:
            r1 = 1
        L_0x008f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.writeLock()
            r0.unlock()
            int r0 = r10.get()
            if (r0 == r2) goto L_0x00a6
            if (r1 != 0) goto L_0x0001
            return r3
        L_0x009f:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x00a7 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00a7 }
            throw r0     // Catch:{ IOException -> 0x00a7 }
        L_0x00a6:
            throw r11
        L_0x00a7:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ae }
            r0.<init>(r1)     // Catch:{ all -> 0x00ae }
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.writeLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A8.A04(android.os.StrictMode$ThreadPolicy, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public static int A00() {
        ReentrantReadWriteLock reentrantReadWriteLock = A08;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i = A02;
            int i2 = 0;
            if ((i & 2) != 0) {
                i2 = 1;
            }
            if ((i & 256) != 0) {
                i2 |= 4;
            }
            return i2;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.1AI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.1AI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.1AI} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c8 A[Catch:{ Exception -> 0x0141, all -> 0x0431 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03a2 A[Catch:{ Exception -> 0x0141, all -> 0x0431 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03e4 A[Catch:{ Exception -> 0x0141, all -> 0x0431 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03d7 A[EDGE_INSN: B:243:0x03d7->B:175:0x03d7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0193 A[Catch:{ Exception -> 0x0141, all -> 0x0431 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r19, X.C224119u r20, java.lang.String[] r21) {
        /*
            r15 = r20
            r6 = 0
            boolean r0 = A03()
            if (r0 != 0) goto L_0x047a
            android.os.StrictMode$ThreadPolicy r14 = android.os.StrictMode.allowThreadDiskWrites()
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0475 }
            r0 = 23
            r3 = 1
            r4 = r19
            if (r1 < r0) goto L_0x004f
            r5 = 0
            java.lang.String r5 = r4.getPackageName()     // Catch:{ Exception -> 0x0033 }
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ Exception -> 0x0033 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r5, r0)     // Catch:{ Exception -> 0x0033 }
            android.os.Bundle r1 = r0.metaData     // Catch:{ Exception -> 0x0033 }
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "com.facebook.soloader.enabled"
            boolean r0 = r1.getBoolean(r0, r3)     // Catch:{ all -> 0x0475 }
            if (r0 != 0) goto L_0x004f
            r3 = 0
            goto L_0x004f
        L_0x0033:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0475 }
            r1.<init>()     // Catch:{ all -> 0x0475 }
            java.lang.String r0 = "Unexpected issue with package manager ("
            r1.append(r0)     // Catch:{ all -> 0x0475 }
            r1.append(r5)     // Catch:{ all -> 0x0475 }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x0475 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0475 }
            java.lang.String r0 = "SoLoader"
            android.util.Log.w(r0, r1, r2)     // Catch:{ all -> 0x0475 }
        L_0x004f:
            A00 = r3     // Catch:{ all -> 0x0475 }
            java.lang.String r1 = "SoLoader"
            if (r3 == 0) goto L_0x0412
            int r7 = A01     // Catch:{ all -> 0x0475 }
            if (r7 != 0) goto L_0x0091
            r7 = 1
            if (r19 == 0) goto L_0x0091
            android.content.pm.ApplicationInfo r5 = r4.getApplicationInfo()     // Catch:{ all -> 0x0475 }
            int r3 = r5.flags     // Catch:{ all -> 0x0475 }
            r0 = r3 & 1
            r2 = 3
            if (r0 == 0) goto L_0x006d
            r0 = r3 & 128(0x80, float:1.794E-43)
            r7 = 2
            if (r0 == 0) goto L_0x006d
            r7 = 3
        L_0x006d:
            boolean r0 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0475 }
            if (r0 == 0) goto L_0x0091
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0475 }
            r2.<init>()     // Catch:{ all -> 0x0475 }
            java.lang.String r0 = "ApplicationInfo.flags is: "
            r2.append(r0)     // Catch:{ all -> 0x0475 }
            int r0 = r5.flags     // Catch:{ all -> 0x0475 }
            r2.append(r0)     // Catch:{ all -> 0x0475 }
            java.lang.String r0 = " appType is: "
            r2.append(r0)     // Catch:{ all -> 0x0475 }
            r2.append(r7)     // Catch:{ all -> 0x0475 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0475 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0475 }
        L_0x0091:
            A01 = r7     // Catch:{ all -> 0x0475 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0475 }
            r2 = 23
            if (r3 < r2) goto L_0x00a1
            boolean r0 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.A02(r4, r7)     // Catch:{ all -> 0x0475 }
            if (r0 == 0) goto L_0x00a1
            r6 = 72
        L_0x00a1:
            java.lang.Class<X.1A8> r11 = X.AnonymousClass1A8.class
            monitor-enter(r11)     // Catch:{ all -> 0x0475 }
            if (r20 != 0) goto L_0x0111
            X.19u r0 = A04     // Catch:{ all -> 0x0472 }
            if (r0 != 0) goto L_0x0113
            java.lang.Runtime r16 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0472 }
            r19 = 0
            if (r3 < r2) goto L_0x0100
            r0 = 27
            if (r3 > r0) goto L_0x0100
            java.lang.Class<java.lang.Runtime> r8 = java.lang.Runtime.class
            java.lang.String r7 = "nativeLoad"
            r0 = 3
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException | SecurityException -> 0x00fa }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0 = 0
            r5[r0] = r3     // Catch:{ NoSuchMethodException | SecurityException -> 0x00fa }
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            r2 = 1
            r5[r2] = r0     // Catch:{ NoSuchMethodException | SecurityException -> 0x00fa }
            r0 = 2
            r5[r0] = r3     // Catch:{ NoSuchMethodException | SecurityException -> 0x00fa }
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r7, r5)     // Catch:{ NoSuchMethodException | SecurityException -> 0x00fa }
            r0.setAccessible(r2)     // Catch:{ NoSuchMethodException | SecurityException -> 0x00fa }
            r19 = r0
            r20 = 1
            java.lang.String r9 = com.facebook.soloader.SysUtil$Api14Utils.A00()     // Catch:{ all -> 0x0472 }
            if (r9 == 0) goto L_0x0103
            java.lang.String r10 = ":"
            java.lang.String[] r8 = r9.split(r10)     // Catch:{ all -> 0x0472 }
            int r7 = r8.length     // Catch:{ all -> 0x0472 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0472 }
            r5.<init>(r7)     // Catch:{ all -> 0x0472 }
            r3 = 0
        L_0x00e8:
            if (r3 >= r7) goto L_0x0106
            r2 = r8[r3]     // Catch:{ all -> 0x0472 }
            java.lang.String r0 = "!"
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0472 }
            if (r0 != 0) goto L_0x00f7
            r5.add(r2)     // Catch:{ all -> 0x0472 }
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x00e8
        L_0x00fa:
            r2 = move-exception
            java.lang.String r0 = "Cannot get nativeLoad method"
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x0472 }
        L_0x0100:
            r20 = 0
            r9 = 0
        L_0x0103:
            r18 = 0
            goto L_0x010a
        L_0x0106:
            java.lang.String r18 = android.text.TextUtils.join(r10, r5)     // Catch:{ all -> 0x0472 }
        L_0x010a:
            X.1AA r15 = new X.1AA     // Catch:{ all -> 0x0472 }
            r17 = r9
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0472 }
        L_0x0111:
            A04 = r15     // Catch:{ all -> 0x0472 }
        L_0x0113:
            monitor-exit(r11)     // Catch:{ all -> 0x0475 }
            X.1AB[] r0 = A0C     // Catch:{ all -> 0x0475 }
            if (r0 != 0) goto L_0x0407
            java.util.concurrent.locks.ReentrantReadWriteLock r13 = A08     // Catch:{ all -> 0x0475 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r13.writeLock()     // Catch:{ all -> 0x0475 }
            r0.lock()     // Catch:{ all -> 0x0475 }
            X.1AB[] r0 = A0C     // Catch:{ all -> 0x0431 }
            if (r0 != 0) goto L_0x0400
            A02 = r6     // Catch:{ all -> 0x0431 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0431 }
            r3.<init>()     // Catch:{ all -> 0x0431 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0431 }
            r0 = 23
            if (r2 < r0) goto L_0x0137
            boolean r0 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.is64Bit()     // Catch:{ all -> 0x0431 }
            goto L_0x013c
        L_0x0137:
            r7 = 0
            boolean r0 = com.facebook.soloader.SysUtil$LollipopSysdeps.is64Bit()     // Catch:{ Exception -> 0x0141 }
        L_0x013c:
            if (r0 == 0) goto L_0x0156
            java.lang.String r7 = "/system/lib64:/vendor/lib64"
            goto L_0x0158
        L_0x0141:
            r5 = move-exception
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x0431 }
            r2[r7] = r0     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "Could not read /proc/self/exe. Err msg: %s"
            java.lang.String r2 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "SysUtil"
            android.util.Log.e(r0, r2)     // Catch:{ all -> 0x0431 }
        L_0x0156:
            java.lang.String r7 = "/system/lib:/vendor/lib"
        L_0x0158:
            java.lang.String r0 = "LD_LIBRARY_PATH"
            java.lang.String r5 = java.lang.System.getenv(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r2 = ":"
            if (r5 == 0) goto L_0x017c
            java.lang.String r0 = ""
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0431 }
            if (r0 != 0) goto L_0x017c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r0.<init>()     // Catch:{ all -> 0x0431 }
            r0.append(r7)     // Catch:{ all -> 0x0431 }
            r0.append(r2)     // Catch:{ all -> 0x0431 }
            r0.append(r5)     // Catch:{ all -> 0x0431 }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x0431 }
        L_0x017c:
            java.lang.String[] r0 = r7.split(r2)     // Catch:{ all -> 0x0431 }
            java.util.List r2 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0431 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0431 }
            r0.<init>(r2)     // Catch:{ all -> 0x0431 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0431 }
        L_0x018d:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x0431 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0431 }
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x01b4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r2.<init>()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "adding system library source: "
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            r2.append(r7)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0431 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0431 }
        L_0x01b4:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0431 }
            r5.<init>(r7)     // Catch:{ all -> 0x0431 }
            r2 = 2
            X.1AC r0 = new X.1AC     // Catch:{ all -> 0x0431 }
            r7 = r21
            r0.<init>(r5, r7, r2)     // Catch:{ all -> 0x0431 }
            r3.add(r0)     // Catch:{ all -> 0x0431 }
            goto L_0x018d
        L_0x01c5:
            r5 = 3
            if (r4 == 0) goto L_0x038d
            r0 = r6 & 1
            if (r0 == 0) goto L_0x01f8
            int r6 = A01     // Catch:{ all -> 0x0431 }
            r2 = 1
            r0 = 0
            if (r6 == r2) goto L_0x01da
            r0 = 2
            if (r6 == r0) goto L_0x01d9
            if (r6 == r5) goto L_0x01d9
            goto L_0x028e
        L_0x01d9:
            r0 = 1
        L_0x01da:
            A02(r4, r3, r0)     // Catch:{ all -> 0x0431 }
            r0 = 0
            A05 = r0     // Catch:{ all -> 0x0431 }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x01eb
            java.lang.String r0 = "adding exo package source: lib-main"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0431 }
        L_0x01eb:
            java.lang.String r0 = "lib-main"
            X.8Qt r2 = new X.8Qt     // Catch:{ all -> 0x0431 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x0431 }
            r0 = 0
            r3.add(r0, r2)     // Catch:{ all -> 0x0431 }
            goto L_0x038d
        L_0x01f8:
            r0 = r6 & 64
            if (r0 == 0) goto L_0x027b
            r7 = 0
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0431 }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x024a
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0431 }
            java.lang.String[] r10 = r0.splitSourceDirs     // Catch:{ all -> 0x0431 }
            int r9 = r10.length     // Catch:{ all -> 0x0431 }
            r8 = 0
        L_0x020d:
            if (r8 >= r9) goto L_0x024a
            r2 = r10[r8]     // Catch:{ all -> 0x0431 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0431 }
            r0.<init>(r2)     // Catch:{ all -> 0x0431 }
            X.2A7 r6 = new X.2A7     // Catch:{ all -> 0x0431 }
            r6.<init>((java.io.File) r0)     // Catch:{ all -> 0x0431 }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x023a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r2.<init>()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "validating/adding directApk source from splitApk: "
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0431 }
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0431 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0431 }
        L_0x023a:
            java.util.Set r0 = r6.A02     // Catch:{ all -> 0x0431 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0431 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0247
            r3.add(r7, r6)     // Catch:{ all -> 0x0431 }
        L_0x0247:
            int r8 = r8 + 1
            goto L_0x020d
        L_0x024a:
            X.2A7 r6 = new X.2A7     // Catch:{ all -> 0x0431 }
            r6.<init>((android.content.Context) r4)     // Catch:{ all -> 0x0431 }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x026e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r2.<init>()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "validating/adding directApk source: "
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0431 }
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0431 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0431 }
        L_0x026e:
            java.util.Set r0 = r6.A02     // Catch:{ all -> 0x0431 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0431 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x027b
            r3.add(r7, r6)     // Catch:{ all -> 0x0431 }
        L_0x027b:
            int r6 = A01     // Catch:{ all -> 0x0431 }
            r2 = 1
            r0 = 0
            if (r6 == r2) goto L_0x0297
            r0 = 2
            if (r6 == r0) goto L_0x0296
            if (r6 == r5) goto L_0x0296
            java.lang.String r0 = "Unsupported app type, we should not reach here"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0431 }
            r1.<init>(r0)     // Catch:{ all -> 0x0431 }
            goto L_0x0295
        L_0x028e:
            java.lang.String r0 = "Unsupported app type, we should not reach here"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0431 }
            r1.<init>(r0)     // Catch:{ all -> 0x0431 }
        L_0x0295:
            throw r1     // Catch:{ all -> 0x0431 }
        L_0x0296:
            r0 = 1
        L_0x0297:
            A02(r4, r3, r0)     // Catch:{ all -> 0x0431 }
            int r0 = A02     // Catch:{ all -> 0x0431 }
            r0 = r0 & 8
            java.lang.String r8 = "lib-main"
            if (r0 == 0) goto L_0x02c9
            r0 = 0
            A05 = r0     // Catch:{ all -> 0x0431 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r2.<init>()     // Catch:{ all -> 0x0431 }
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r0.dataDir     // Catch:{ all -> 0x0431 }
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "/"
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            r2.append(r8)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0431 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0431 }
            r6.<init>(r0)     // Catch:{ all -> 0x0431 }
            X.C62732rs.A00(r6)     // Catch:{ IOException -> 0x0374 }
            goto L_0x038d
        L_0x02c9:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0431 }
            java.lang.String r2 = r0.sourceDir     // Catch:{ all -> 0x0431 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0431 }
            r0.<init>(r2)     // Catch:{ all -> 0x0431 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0431 }
            r7.<init>()     // Catch:{ all -> 0x0431 }
            X.1AF r6 = new X.1AF     // Catch:{ all -> 0x0431 }
            r6.<init>(r4, r0, r8)     // Catch:{ all -> 0x0431 }
            r7.add(r6)     // Catch:{ all -> 0x0431 }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x02ff
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r2.<init>()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "adding backup source from : "
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0431 }
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0431 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0431 }
        L_0x02ff:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0431 }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x0361
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x0312
            java.lang.String r0 = "adding backup sources from split apks"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0431 }
        L_0x0312:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0431 }
            java.lang.String[] r11 = r0.splitSourceDirs     // Catch:{ all -> 0x0431 }
            int r10 = r11.length     // Catch:{ all -> 0x0431 }
            r9 = 0
            r6 = 0
        L_0x031b:
            if (r9 >= r10) goto L_0x0361
            r0 = r11[r9]     // Catch:{ all -> 0x0431 }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x0431 }
            r12.<init>(r0)     // Catch:{ all -> 0x0431 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r2.<init>()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "lib-"
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            int r8 = r6 + 1
            r2.append(r6)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0431 }
            X.1AF r6 = new X.1AF     // Catch:{ all -> 0x0431 }
            r6.<init>(r4, r12, r0)     // Catch:{ all -> 0x0431 }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x035a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r2.<init>()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "adding backup source: "
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0431 }
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0431 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0431 }
        L_0x035a:
            r7.add(r6)     // Catch:{ all -> 0x0431 }
            int r9 = r9 + 1
            r6 = r8
            goto L_0x031b
        L_0x0361:
            int r0 = r7.size()     // Catch:{ all -> 0x0431 }
            X.1AE[] r0 = new X.AnonymousClass1AE[r0]     // Catch:{ all -> 0x0431 }
            java.lang.Object[] r0 = r7.toArray(r0)     // Catch:{ all -> 0x0431 }
            X.1AE[] r0 = (X.AnonymousClass1AE[]) r0     // Catch:{ all -> 0x0431 }
            A05 = r0     // Catch:{ all -> 0x0431 }
            r0 = 0
            r3.addAll(r0, r7)     // Catch:{ all -> 0x0431 }
            goto L_0x038d
        L_0x0374:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r2.<init>()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "Failed to delete "
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ all -> 0x0431 }
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0431 }
            android.util.Log.w(r1, r0, r4)     // Catch:{ all -> 0x0431 }
        L_0x038d:
            int r0 = r3.size()     // Catch:{ all -> 0x0431 }
            X.1AB[] r0 = new X.AnonymousClass1AB[r0]     // Catch:{ all -> 0x0431 }
            java.lang.Object[] r6 = r3.toArray(r0)     // Catch:{ all -> 0x0431 }
            X.1AB[] r6 = (X.AnonymousClass1AB[]) r6     // Catch:{ all -> 0x0431 }
            int r4 = A00()     // Catch:{ all -> 0x0431 }
            int r0 = r6.length     // Catch:{ all -> 0x0431 }
        L_0x039e:
            int r3 = r0 + -1
            if (r0 <= 0) goto L_0x03d7
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x03be
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r2.<init>()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "Preparing SO source: "
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            r0 = r6[r3]     // Catch:{ all -> 0x0431 }
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0431 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0431 }
        L_0x03be:
            java.lang.String r2 = "_"
            r0 = r6[r3]     // Catch:{ all -> 0x0431 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x0431 }
            com.facebook.soloader.Api18TraceUtils.A01(r1, r2, r0)     // Catch:{ all -> 0x0431 }
            r0 = r6[r3]     // Catch:{ all -> 0x0431 }
            r0.A03(r4)     // Catch:{ all -> 0x0431 }
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0431 }
            r0 = r3
            goto L_0x039e
        L_0x03d7:
            A0C = r6     // Catch:{ all -> 0x0431 }
            java.util.concurrent.atomic.AtomicInteger r0 = A07     // Catch:{ all -> 0x0431 }
            r0.getAndIncrement()     // Catch:{ all -> 0x0431 }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x0400
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0431 }
            r2.<init>()     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = "init finish: "
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            X.1AB[] r0 = A0C     // Catch:{ all -> 0x0431 }
            int r0 = r0.length     // Catch:{ all -> 0x0431 }
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = " SO sources prepared"
            r2.append(r0)     // Catch:{ all -> 0x0431 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0431 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0431 }
        L_0x0400:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r13.writeLock()     // Catch:{ all -> 0x0475 }
            r0.unlock()     // Catch:{ all -> 0x0475 }
        L_0x0407:
            java.lang.String r0 = "Init SoLoader delegate"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0475 }
            X.1AJ r3 = new X.1AJ     // Catch:{ all -> 0x0475 }
            r3.<init>()     // Catch:{ all -> 0x0475 }
            goto L_0x044b
        L_0x0412:
            X.1AB[] r0 = A0C     // Catch:{ all -> 0x0475 }
            if (r0 != 0) goto L_0x0441
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = A08     // Catch:{ all -> 0x0475 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()     // Catch:{ all -> 0x0475 }
            r0.lock()     // Catch:{ all -> 0x0475 }
            X.1AB[] r0 = A0C     // Catch:{ all -> 0x0428 }
            if (r0 != 0) goto L_0x043a
            X.1AB[] r0 = new X.AnonymousClass1AB[r6]     // Catch:{ all -> 0x0428 }
            A0C = r0     // Catch:{ all -> 0x0428 }
            goto L_0x043a
        L_0x0428:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()     // Catch:{ all -> 0x0475 }
            r0.unlock()     // Catch:{ all -> 0x0475 }
            goto L_0x0439
        L_0x0431:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r13.writeLock()     // Catch:{ all -> 0x0475 }
            r0.unlock()     // Catch:{ all -> 0x0475 }
        L_0x0439:
            throw r1     // Catch:{ all -> 0x0475 }
        L_0x043a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()     // Catch:{ all -> 0x0475 }
            r0.unlock()     // Catch:{ all -> 0x0475 }
        L_0x0441:
            java.lang.String r0 = "Init System Loader delegate"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0475 }
            X.2wF r3 = new X.2wF     // Catch:{ all -> 0x0475 }
            r3.<init>()     // Catch:{ all -> 0x0475 }
        L_0x044b:
            java.lang.Class<X.1AK> r2 = X.AnonymousClass1AK.class
            monitor-enter(r2)     // Catch:{ all -> 0x0475 }
            X.1AI r1 = X.AnonymousClass1AK.A00     // Catch:{ all -> 0x046f }
            r0 = 0
            if (r1 == 0) goto L_0x0454
            r0 = 1
        L_0x0454:
            monitor-exit(r2)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x046b
            monitor-enter(r2)     // Catch:{ all -> 0x0475 }
            X.1AI r0 = X.AnonymousClass1AK.A00     // Catch:{ all -> 0x0468 }
            if (r0 != 0) goto L_0x0460
            X.AnonymousClass1AK.A00 = r3     // Catch:{ all -> 0x0468 }
            monitor-exit(r2)     // Catch:{ all -> 0x0468 }
            goto L_0x046b
        L_0x0460:
            java.lang.String r1 = "Cannot re-initialize NativeLoader."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0468 }
            r0.<init>(r1)     // Catch:{ all -> 0x0468 }
            throw r0     // Catch:{ all -> 0x0468 }
        L_0x0468:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0468 }
            goto L_0x0474
        L_0x046b:
            android.os.StrictMode.setThreadPolicy(r14)
            return
        L_0x046f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x046f }
            goto L_0x0474
        L_0x0472:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0475 }
        L_0x0474:
            throw r0     // Catch:{ all -> 0x0475 }
        L_0x0475:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r14)
            throw r0
        L_0x047a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A8.A01(android.content.Context, X.19u, java.lang.String[]):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1AD, java.lang.Object] */
    public static void A02(Context context, ArrayList arrayList, int i) {
        ? obj = new Object();
        Context applicationContext = context.getApplicationContext();
        obj.A01 = applicationContext;
        if (applicationContext == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: ");
            sb.append(context.getApplicationInfo().nativeLibraryDir);
            Log.w("SoLoader", sb.toString());
            obj.A01 = context;
            applicationContext = context;
        }
        obj.A00 = i;
        obj.A02 = new AnonymousClass1AC(new File(applicationContext.getApplicationInfo().nativeLibraryDir), new String[0], i);
        A03 = obj;
        if (Log.isLoggable("SoLoader", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("adding application source: ");
            sb2.append(A03.toString());
            Log.d("SoLoader", sb2.toString());
        }
        arrayList.add(0, A03);
    }

    public static boolean A03() {
        boolean z = true;
        if (A0C != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = A08;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (A0C == null) {
                z = false;
            }
            return z;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0126, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r17.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0136, code lost:
        if (r16 == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0138, code lost:
        android.os.StrictMode.setThreadPolicy(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x013b, code lost:
        if (r4 == 0) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x013d, code lost:
        if (r4 != 3) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x013f, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("couldn't find DSO to load: ");
        r2.append(r13);
        r17.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0154, code lost:
        if (r5 >= A0C.length) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0156, code lost:
        r2.append("\n\tSoSource ");
        r2.append(r5);
        r2.append(": ");
        r2.append(A0C[r5].toString());
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0171, code lost:
        r0 = A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0173, code lost:
        if (r0 == null) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r1 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0181, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0187, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0188, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0189, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x018b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x018c, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r17.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0194, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0195, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0199, code lost:
        if (r16 != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x019b, code lost:
        android.os.StrictMode.setThreadPolicy(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x019e, code lost:
        if (r5 != 0) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01a0, code lost:
        if (r5 == 3) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01a7, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) != false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01a9, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Loaded: ");
        r1.append(r13);
        android.util.Log.d("SoLoader", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01bd, code lost:
        monitor-enter(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r10.add(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x01c4, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("couldn't find DSO to load: ");
        r3.append(r13);
        r2 = r1.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x01d7, code lost:
        if (r2 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x01d9, code lost:
        r2 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x01dd, code lost:
        r3.append(" caused by: ");
        r3.append(r2);
        r1.printStackTrace();
        r3.append(" result: ");
        r3.append(r5);
        r0 = r3.toString();
        android.util.Log.e("SoLoader", r0);
        r2 = new java.lang.UnsatisfiedLinkError(r0);
        r2.initCause(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Could not load: ");
        r1.append(r13);
        r1.append(" because no SO source exists");
        android.util.Log.e("SoLoader", r1.toString());
        r0 = new java.lang.StringBuilder();
        r0.append("couldn't find DSO to load: ");
        r0.append(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x022d, code lost:
        throw new java.lang.UnsatisfiedLinkError(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x022e, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r17.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0237, code lost:
        r1 = new java.io.File(r1.createPackageContext(r1.getPackageName(), 0).getApplicationInfo().nativeLibraryDir);
        r2.append("\n\tNative lib dir: ");
        r2.append(r1.getAbsolutePath());
        r2.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0253, code lost:
        r17.readLock().unlock();
        r2.append(" result: ");
        r2.append(r4);
        r0 = r2.toString();
        android.util.Log.e("SoLoader", r0);
        r2 = new java.lang.UnsatisfiedLinkError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x026e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x026f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r2 = r3.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x028c, code lost:
        throw new X.AnonymousClass3Eg(r2.substring(r2.lastIndexOf("unexpected e_machine:")), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x028d, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0293, code lost:
        if ((r24 & 16) == 0) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02a3, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02a8, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("MergedSoMapping.invokeJniOnload[", r12, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02b5, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) != false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02b7, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("About to merge: ");
        r1.append(r12);
        r1.append(" / ");
        r1.append(r13);
        android.util.Log.d("SoLoader", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02d7, code lost:
        switch(r12.hashCode()) {
            case -2132109298: goto L_0x02f1;
            case -2112908723: goto L_0x0300;
            case -2084134425: goto L_0x030f;
            case -1924924588: goto L_0x031d;
            case -1916805629: goto L_0x032b;
            case -1864755345: goto L_0x0339;
            case -1861793634: goto L_0x0347;
            case -1776425186: goto L_0x0356;
            case -1721640191: goto L_0x0364;
            case -1606294708: goto L_0x0372;
            case -1587752839: goto L_0x0380;
            case -1484045932: goto L_0x038e;
            case -1389936073: goto L_0x039c;
            case -1347925350: goto L_0x03aa;
            case -1293854543: goto L_0x03b8;
            case -1290530873: goto L_0x03c6;
            case -1148924054: goto L_0x03d4;
            case -1117731165: goto L_0x03e2;
            case -1098209777: goto L_0x03f0;
            case -1059361352: goto L_0x03ff;
            case -1053039321: goto L_0x040d;
            case -902468257: goto L_0x041b;
            case -747990041: goto L_0x042a;
            case -459685918: goto L_0x0438;
            case -449618447: goto L_0x0446;
            case -439414708: goto L_0x0454;
            case -391222211: goto L_0x0462;
            case -381653348: goto L_0x0471;
            case -340911628: goto L_0x047f;
            case -327000206: goto L_0x048d;
            case -281296301: goto L_0x049b;
            case -253106228: goto L_0x04a9;
            case -194623424: goto L_0x04b7;
            case -120202075: goto L_0x04c5;
            case -61423793: goto L_0x04d4;
            case 96666: goto L_0x04e2;
            case 98347: goto L_0x04f0;
            case 101517: goto L_0x04fe;
            case 3539948: goto L_0x050c;
            case 64916380: goto L_0x051b;
            case 92309290: goto L_0x0529;
            case 287912233: goto L_0x0537;
            case 322449263: goto L_0x0545;
            case 395167905: goto L_0x0553;
            case 451661819: goto L_0x0561;
            case 469371245: goto L_0x056f;
            case 627805909: goto L_0x057e;
            case 656562322: goto L_0x058c;
            case 681123117: goto L_0x059a;
            case 747648432: goto L_0x05a9;
            case 777959537: goto L_0x05b7;
            case 1006617720: goto L_0x05c6;
            case 1045461864: goto L_0x05d4;
            case 1047472087: goto L_0x05e2;
            case 1078126824: goto L_0x05f0;
            case 1250385981: goto L_0x05ff;
            case 1270408060: goto L_0x060c;
            case 1317576386: goto L_0x061a;
            case 1540136281: goto L_0x0627;
            case 1584936478: goto L_0x0635;
            case 1737184630: goto L_0x0642;
            case 1780520651: goto L_0x064f;
            case 1825980878: goto L_0x065c;
            case 1995804693: goto L_0x0669;
            case 2045224032: goto L_0x0677;
            default: goto L_0x02da;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02da, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Unknown library: ");
        r1.append(r12);
        r1 = new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02f0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x02f8, code lost:
        if (r12.equals("spark-qpluserflow-native") != false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x02fa, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libspark_qpluserflow_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0307, code lost:
        if (r12.equals("stash-jni") != false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0309, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libstash_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0315, code lost:
        if (r12.equals("ardcache-jni") != false) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0317, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0323, code lost:
        if (r12.equals("fbsystrace") != false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0325, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbsystrace_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0331, code lost:
        if (r12.equals("roi-align-ops-xplat") != false) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0333, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libroi_align_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r17 = A08;
        r17.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x033f, code lost:
        if (r12.equals("airshield_light_mbed_jni") != false) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0341, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libairshield_light_mbed_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x034e, code lost:
        if (r12.equals("versioned-model-cache-native-android") != false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0350, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libversioned_model_cache_native_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x035c, code lost:
        if (r12.equals("jniperflogger") != false) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x035e, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniperflogger_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x036a, code lost:
        if (r12.equals("arfx-engine-plugin-avatars") != false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x036c, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_avatars_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0378, code lost:
        if (r12.equals("dynamic_pytorch_impl") != false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x037a, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdynamic_pytorch_impl_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0386, code lost:
        if (r12.equals("mediapipeline-iglufilter-whatsapp") != false) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0388, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmediapipeline_iglufilter_whatsapp_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0394, code lost:
        if (r12.equals("ard-android-network-consent-manager-interf") != false) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0396, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_interf_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03a2, code lost:
        if (r12.equals("ardcache-stash") != false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x03a4, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_stash_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03b0, code lost:
        if (r12.equals("flatbuffers") != false) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x03b2, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libflatbuffers_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x03be, code lost:
        if (r12.equals("native_bridge") != false) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03c0, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libnative_bridge_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        r21 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x03cc, code lost:
        if (r12.equals("opus_mlow") != false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x03ce, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libopus_mlow_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x03da, code lost:
        if (r12.equals("hybridlogsinkjni") != false) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x03dc, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libhybridlogsinkjni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x03e8, code lost:
        if (r12.equals("arfx-engine-plugin-touch_gestures") != false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x03ea, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_touch_gestures_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x03f7, code lost:
        if (r12.equals("yogacore") != false) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r19 != false) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x03f9, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libyogacore_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0405, code lost:
        if (r12.equals("featureconfig") != false) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0407, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfeatureconfig_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0413, code lost:
        if (r12.equals("arpersistenceservice") != false) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0415, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarpersistenceservice_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0422, code lost:
        if (r12.equals("sigmux") != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0424, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsigmux_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0430, code lost:
        if (r12.equals("arclass") != false) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0432, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarclass_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x043e, code lost:
        if (r12.equals("onecamera-iglufilter-graph") != false) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0440, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libonecamera_iglufilter_graph_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x044c, code lost:
        if (r12.equals("gputimer-jni") != false) goto L_0x044e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x044e, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgputimer_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        monitor-enter(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x045a, code lost:
        if (r12.equals("audiograph-native") != false) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x045c, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libaudiograph_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0469, code lost:
        if (r12.equals("segmentationdataprovider") != false) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x046b, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsegmentationdataprovider_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0477, code lost:
        if (r12.equals("fbacore-jni") != false) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0479, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbacore_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0485, code lost:
        if (r12.equals("datax_jni") != false) goto L_0x0487;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0487, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdatax_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0493, code lost:
        if (r12.equals("graphicsengine-whatsapp-native") != false) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0495, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgraphicsengine_whatsapp_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x04a1, code lost:
        if (r12.equals("mediapipeline-iglufilter-holder") != false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x04a3, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmediapipeline_iglufilter_holder_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x04af, code lost:
        if (r12.equals("profiloextapi") != false) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x04b1, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libprofiloextapi_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x04bd, code lost:
        if (r12.equals("arengineservicesutils") != false) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x04bf, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarengineservicesutils_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x04cc, code lost:
        if (r12.equals("xplat_hermes_lib_Platform_Unicode_UnicodeAndroid") != false) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x04ce, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_hermes_lib_Platform_Unicode_UnicodeAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x04da, code lost:
        if (r12.equals("asyncexecutor") != false) goto L_0x04dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x04dc, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libasyncexecutor_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        if (r10.contains(r13) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x04e8, code lost:
        if (r12.equals("ale") != false) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x04ea, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libale_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x04f6, code lost:
        if (r12.equals("cdl") != false) goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x04f8, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcdl_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0504, code lost:
        if (r12.equals("fmt") != false) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0506, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfmt_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0513, code lost:
        if (r12.equals("sslx") != false) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r23 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0515, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsslx_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0521, code lost:
        if (r12.equals("maskrcnn-ops-xplat") != false) goto L_0x0523;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0523, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmaskrcnn_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x052f, code lost:
        if (r12.equals("ard-android-network-consent-manager-impl") != false) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0531, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_impl_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x053d, code lost:
        if (r12.equals("mediapipeline-igl-context") != false) goto L_0x053f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x053f, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmediapipeline_igl_context_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        monitor-exit(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x054b, code lost:
        if (r12.equals("camera-xplat-spars-jni") != false) goto L_0x054d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x054d, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcamera_xplat_spars_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0559, code lost:
        if (r12.equals("ard-android-async-asset-fetcher") != false) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x055b, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0567, code lost:
        if (r12.equals("jniexecutors") != false) goto L_0x0569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0569, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniexecutors_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0576, code lost:
        if (r12.equals("xplat_arfx_services_interfaces_interfacesAndroid") != false) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0578, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_interfaces_interfacesAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0584, code lost:
        if (r12.equals("avatarsdataprovider") != false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0586, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libavatarsdataprovider_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0592, code lost:
        if (r12.equals("double-conversion") != false) goto L_0x0594;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0594, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdouble_conversion_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x05a1, code lost:
        if (r12.equals("single-model-cache-native-android") != false) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x05a3, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsingle_model_cache_native_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x05af, code lost:
        if (r12.equals("flatbuffersflatc") != false) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x05b1, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libflatbuffersflatc_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x05be, code lost:
        if (r12.equals("unet-106-ops-xplat") != false) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x05c0, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libunet_106_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x05cc, code lost:
        if (r12.equals("dynamic_executorch") != false) goto L_0x05ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x05ce, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdynamic_executorch_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x05da, code lost:
        if (r12.equals("mediapipeline-iglufilter-impl-basic") != false) goto L_0x05dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x05dc, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmediapipeline_iglufilter_impl_basic_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x05e8, code lost:
        if (r12.equals("cryptox") != false) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x05ea, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcryptox_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x05f7, code lost:
        if (r12.equals("xplat_ecos_ecosAndroid") != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x05f9, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_ecos_ecosAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0062, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0605, code lost:
        if (r12.equals("gltfholdernew") != false) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0607, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgltfholdernew_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0613, code lost:
        if (r12.equals("xplat_arfx_services_impl_avatars_avatarsAndroid") != false) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0615, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_impl_avatars_avatarsAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0620, code lost:
        if (r12.equals("mediapipeline-iglufilter-insights") != false) goto L_0x0622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0622, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmediapipeline_iglufilter_insights_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x062e, code lost:
        if (r12.equals("xanalyticsadapter-jni") != false) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0630, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxanalyticsadapter_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x063b, code lost:
        if (r12.equals("jniuserflow") != false) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x063d, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniuserflow_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0648, code lost:
        if (r12.equals("batch-box-cox-ops-xplat") != false) goto L_0x064a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x064a, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libbatch_box_cox_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0655, code lost:
        if (r12.equals("filters-native-android") != false) goto L_0x0657;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0657, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfilters_native_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0662, code lost:
        if (r12.equals("musiceffect-native") != false) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0664, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmusiceffect_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0670, code lost:
        if (r12.equals("tar-brotli-archive-native") != false) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0672, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libtar_brotli_archive_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x067d, code lost:
        if (r12.equals("ard-android-async-asset-fetcher-listener") != false) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x067f, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_listener_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0683, code lost:
        if (r0 != 0) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        monitor-exit(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0686, code lost:
        r1 = new java.lang.UnsatisfiedLinkError("Failed to invoke native library JNI_OnLoad");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x068f, code lost:
        A0B.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0695, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Failed to call JNI_OnLoad from '");
        r1.append(r12);
        r1.append("', which has been merged into '");
        r1.append(r13);
        r1.append("'.  See comment for details.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x06b9, code lost:
        throw new java.lang.RuntimeException(r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x06ba, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0066, code lost:
        if (r19 != false) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x06be, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x06bf, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x06c2, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x06c3, code lost:
        r17.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x06cc, code lost:
        return !r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x06d0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x06d1, code lost:
        r17.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x06d8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0070, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("About to load: ");
        r1.append(r13);
        android.util.Log.d("SoLoader", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0084, code lost:
        r17.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0091, code lost:
        if (A0C == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r17.readLock().unlock();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009b, code lost:
        if (r14 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009e, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a1, code lost:
        r14 = android.os.StrictMode.allowThreadDiskReads();
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a7, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("SoLoader.loadLibrary[", r13, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r17.readLock().lock();
        r4 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ba, code lost:
        if (r2 >= A0C.length) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bc, code lost:
        r4 = A0C[r2].A02(r14, r13, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c6, code lost:
        if (r4 != 3) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ca, code lost:
        if (A05 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00d0, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d2, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Trying backup SoSource for ");
        r1.append(r13);
        android.util.Log.d("SoLoader", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e6, code lost:
        r15 = A05;
        r22 = r15.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ed, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ef, code lost:
        if (r4 != 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f4, code lost:
        if (r3 >= r22) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f6, code lost:
        r2 = r15[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f8, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r1 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fb, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r0 = r1.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0100, code lost:
        if (r0 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0102, code lost:
        r0 = new java.lang.Object();
        r1.put(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x010a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r2.A00 = r13;
        r2.A03(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0112, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x011b, code lost:
        if (r2.A02(r14, r13, r21) != 1) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x011e, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0121, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0123, code lost:
        r3 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:125:0x0175, B:139:0x0196] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019b A[Catch:{ NameNotFoundException -> 0x0181, UnsatisfiedLinkError -> 0x026f }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a0 A[Catch:{ NameNotFoundException -> 0x0181, UnsatisfiedLinkError -> 0x026f }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d9 A[Catch:{ NameNotFoundException -> 0x0181, UnsatisfiedLinkError -> 0x026f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(android.os.StrictMode.ThreadPolicy r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24) {
        /*
            r12 = r22
            r14 = r20
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r11 = 0
            if (r0 != 0) goto L_0x0014
            java.util.Set r0 = A0B
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x0014
            return r11
        L_0x0014:
            java.lang.Class<X.1A8> r20 = X.AnonymousClass1A8.class
            monitor-enter(r20)
            java.util.HashSet r10 = A06     // Catch:{ all -> 0x06d9 }
            r13 = r21
            boolean r0 = r10.contains(r13)     // Catch:{ all -> 0x06d9 }
            if (r0 == 0) goto L_0x0028
            if (r23 != 0) goto L_0x0025
            monitor-exit(r20)     // Catch:{ all -> 0x06d9 }
            return r11
        L_0x0025:
            r19 = 1
            goto L_0x002a
        L_0x0028:
            r19 = 0
        L_0x002a:
            java.util.Map r1 = A0A     // Catch:{ all -> 0x06d9 }
            boolean r0 = r1.containsKey(r13)     // Catch:{ all -> 0x06d9 }
            if (r0 == 0) goto L_0x0038
            java.lang.Object r9 = r1.get(r13)     // Catch:{ all -> 0x06d9 }
        L_0x0036:
            monitor-exit(r20)     // Catch:{ all -> 0x06d9 }
            goto L_0x0041
        L_0x0038:
            java.lang.Object r9 = new java.lang.Object     // Catch:{ all -> 0x06d9 }
            r9.<init>()     // Catch:{ all -> 0x06d9 }
            r1.put(r13, r9)     // Catch:{ all -> 0x06d9 }
            goto L_0x0036
        L_0x0041:
            java.util.concurrent.locks.ReentrantReadWriteLock r17 = A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()
            r0.lock()
            monitor-enter(r9)     // Catch:{ all -> 0x06d0 }
            r8 = 3
            r21 = r24
            if (r19 != 0) goto L_0x0291
            monitor-enter(r20)     // Catch:{ all -> 0x06cd }
            boolean r0 = r10.contains(r13)     // Catch:{ all -> 0x028d }
            if (r0 == 0) goto L_0x0065
            if (r23 != 0) goto L_0x0063
            monitor-exit(r20)     // Catch:{ all -> 0x028d }
            monitor-exit(r9)     // Catch:{ all -> 0x06cd }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()
            r0.unlock()
            return r11
        L_0x0063:
            r19 = 1
        L_0x0065:
            monitor-exit(r20)     // Catch:{ all -> 0x028d }
            if (r19 != 0) goto L_0x0291
            java.lang.String r7 = "SoLoader"
            boolean r0 = android.util.Log.isLoggable(r7, r8)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r0 == 0) goto L_0x0084
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = "About to load: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r1.append(r13)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            android.util.Log.d(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x0084:
            java.lang.String r18 = " result: "
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.lock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            X.1AB[] r0 = A0C     // Catch:{ all -> 0x022e }
            java.lang.String r6 = "couldn't find DSO to load: "
            if (r0 == 0) goto L_0x0200
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.unlock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r5 = 0
            if (r14 != 0) goto L_0x009e
            goto L_0x00a1
        L_0x009e:
            r16 = 0
            goto L_0x00a7
        L_0x00a1:
            android.os.StrictMode$ThreadPolicy r14 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r16 = 1
        L_0x00a7:
            java.lang.String r1 = "SoLoader.loadLibrary["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r13, r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()     // Catch:{ all -> 0x0195 }
            r0.lock()     // Catch:{ all -> 0x0195 }
            r4 = 0
            r2 = 0
        L_0x00b7:
            X.1AB[] r0 = A0C     // Catch:{ all -> 0x018b }
            int r0 = r0.length     // Catch:{ all -> 0x018b }
            if (r2 >= r0) goto L_0x012c
            X.1AB[] r0 = A0C     // Catch:{ all -> 0x018b }
            r1 = r0[r2]     // Catch:{ all -> 0x018b }
            r0 = r21
            int r4 = r1.A02(r14, r13, r0)     // Catch:{ all -> 0x018b }
            if (r4 != r8) goto L_0x00ed
            X.1AE[] r0 = A05     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x012c
            boolean r0 = android.util.Log.isLoggable(r7, r8)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x00e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018b }
            r1.<init>()     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "Trying backup SoSource for "
            r1.append(r0)     // Catch:{ all -> 0x018b }
            r1.append(r13)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018b }
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x018b }
        L_0x00e6:
            X.1AE[] r15 = A05     // Catch:{ all -> 0x018b }
            int r0 = r15.length     // Catch:{ all -> 0x018b }
            r22 = r0
            r3 = 0
            goto L_0x00f2
        L_0x00ed:
            int r2 = r2 + 1
            if (r4 != 0) goto L_0x012c
            goto L_0x00b7
        L_0x00f2:
            r0 = r22
            if (r3 >= r0) goto L_0x012c
            r2 = r15[r3]     // Catch:{ all -> 0x018b }
            monitor-enter(r2)     // Catch:{ all -> 0x018b }
            java.util.Map r1 = r2.A04     // Catch:{ all -> 0x0129 }
            monitor-enter(r1)     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = r1.get(r13)     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x010a
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x0126 }
            r0.<init>()     // Catch:{ all -> 0x0126 }
            r1.put(r13, r0)     // Catch:{ all -> 0x0126 }
        L_0x010a:
            monitor-exit(r1)     // Catch:{ all -> 0x0126 }
            monitor-enter(r0)     // Catch:{ all -> 0x0129 }
            r2.A00 = r13     // Catch:{ all -> 0x0123 }
            r1 = 2
            r2.A03(r1)     // Catch:{ all -> 0x0123 }
            monitor-exit(r0)     // Catch:{ all -> 0x0123 }
            monitor-exit(r2)     // Catch:{ all -> 0x018b }
            r0 = r21
            int r1 = r2.A02(r14, r13, r0)     // Catch:{ all -> 0x018b }
            r0 = 1
            if (r1 != r0) goto L_0x011e
            goto L_0x0121
        L_0x011e:
            int r3 = r3 + 1
            goto L_0x00f2
        L_0x0121:
            r4 = 1
            goto L_0x012c
        L_0x0123:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0123 }
            goto L_0x0128
        L_0x0126:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0126 }
        L_0x0128:
            throw r3     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018b }
            throw r0     // Catch:{ all -> 0x018b }
        L_0x012c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()     // Catch:{ all -> 0x0188 }
            r0.unlock()     // Catch:{ all -> 0x0188 }
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r16 == 0) goto L_0x013b
            android.os.StrictMode.setThreadPolicy(r14)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x013b:
            if (r4 == 0) goto L_0x013f
            if (r4 != r8) goto L_0x01a3
        L_0x013f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r6)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r13)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.lock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x0151:
            X.1AB[] r0 = A0C     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            int r0 = r0.length     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r5 >= r0) goto L_0x0171
            java.lang.String r0 = "\n\tSoSource "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r5)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = ": "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            X.1AB[] r0 = A0C     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0 = r0[r5]     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            int r5 = r5 + 1
            goto L_0x0151
        L_0x0171:
            X.1AD r0 = A03     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r0 == 0) goto L_0x0253
            android.content.Context r1 = r0.A01     // Catch:{ NameNotFoundException -> 0x0181 }
            java.lang.String r0 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0181 }
            android.content.Context r0 = r1.createPackageContext(r0, r11)     // Catch:{ NameNotFoundException -> 0x0181 }
            goto L_0x0237
        L_0x0181:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x0188:
            r1 = move-exception
            r5 = r4
            goto L_0x0196
        L_0x018b:
            r1 = move-exception
            r5 = r4
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()     // Catch:{ all -> 0x0195 }
            r0.unlock()     // Catch:{ all -> 0x0195 }
            throw r1     // Catch:{ all -> 0x0195 }
        L_0x0195:
            r1 = move-exception
        L_0x0196:
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r16 == 0) goto L_0x019e
            android.os.StrictMode.setThreadPolicy(r14)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x019e:
            if (r5 == 0) goto L_0x01c8
            if (r5 != r8) goto L_0x01a3
            goto L_0x01c8
        L_0x01a3:
            boolean r0 = android.util.Log.isLoggable(r7, r8)     // Catch:{ all -> 0x06cd }
            if (r0 == 0) goto L_0x01bd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06cd }
            r1.<init>()     // Catch:{ all -> 0x06cd }
            java.lang.String r0 = "Loaded: "
            r1.append(r0)     // Catch:{ all -> 0x06cd }
            r1.append(r13)     // Catch:{ all -> 0x06cd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06cd }
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x06cd }
        L_0x01bd:
            monitor-enter(r20)     // Catch:{ all -> 0x06cd }
            r10.add(r13)     // Catch:{ all -> 0x01c4 }
            monitor-exit(r20)     // Catch:{ all -> 0x01c4 }
            goto L_0x0291
        L_0x01c4:
            r3 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x01c4 }
            goto L_0x06be
        L_0x01c8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r3.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r3.append(r6)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r3.append(r13)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r2 = r1.getMessage()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r2 != 0) goto L_0x01dd
            java.lang.String r2 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x01dd:
            java.lang.String r0 = " caused by: "
            r3.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r3.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r1.printStackTrace()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0 = r18
            r3.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r3.append(r5)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            android.util.Log.e(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.UnsatisfiedLinkError r2 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.initCause(r1)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            goto L_0x026e
        L_0x0200:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x022e }
            r1.<init>()     // Catch:{ all -> 0x022e }
            java.lang.String r0 = "Could not load: "
            r1.append(r0)     // Catch:{ all -> 0x022e }
            r1.append(r13)     // Catch:{ all -> 0x022e }
            java.lang.String r0 = " because no SO source exists"
            r1.append(r0)     // Catch:{ all -> 0x022e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x022e }
            android.util.Log.e(r7, r0)     // Catch:{ all -> 0x022e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x022e }
            r0.<init>()     // Catch:{ all -> 0x022e }
            r0.append(r6)     // Catch:{ all -> 0x022e }
            r0.append(r13)     // Catch:{ all -> 0x022e }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x022e }
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x022e }
            r0.<init>(r1)     // Catch:{ all -> 0x022e }
            throw r0     // Catch:{ all -> 0x022e }
        L_0x022e:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.unlock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            goto L_0x026e
        L_0x0237:
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.io.File r1 = new java.io.File     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = "\n\tNative lib dir: "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x0253:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.unlock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0 = r18
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r4)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            android.util.Log.e(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.UnsatisfiedLinkError r2 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x026e:
            throw r2     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x026f:
            r3 = move-exception
            java.lang.String r2 = r3.getMessage()     // Catch:{ all -> 0x06cd }
            if (r2 == 0) goto L_0x06be
            java.lang.String r1 = "unexpected e_machine:"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x06cd }
            if (r0 == 0) goto L_0x06be
            int r0 = r2.lastIndexOf(r1)     // Catch:{ all -> 0x06cd }
            java.lang.String r1 = r2.substring(r0)     // Catch:{ all -> 0x06cd }
            X.3Eg r0 = new X.3Eg     // Catch:{ all -> 0x06cd }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x06cd }
            throw r0     // Catch:{ all -> 0x06cd }
        L_0x028d:
            r3 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x028d }
            goto L_0x06be
        L_0x0291:
            r0 = r24 & 16
            if (r0 != 0) goto L_0x06c2
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x06cd }
            if (r0 != 0) goto L_0x02a4
            java.util.Set r0 = A0B     // Catch:{ all -> 0x06cd }
            boolean r0 = r0.contains(r12)     // Catch:{ all -> 0x06cd }
            if (r0 == 0) goto L_0x02a4
            r11 = 1
        L_0x02a4:
            if (r23 == 0) goto L_0x06c2
            if (r11 != 0) goto L_0x06c2
            java.lang.String r1 = "MergedSoMapping.invokeJniOnload["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r12, r0)     // Catch:{ all -> 0x06cd }
            java.lang.String r2 = "SoLoader"
            boolean r0 = android.util.Log.isLoggable(r2, r8)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02d3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            java.lang.String r0 = "About to merge: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            r1.append(r12)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            java.lang.String r0 = " / "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            r1.append(r13)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            android.util.Log.d(r2, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
        L_0x02d3:
            int r0 = r12.hashCode()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            switch(r0) {
                case -2132109298: goto L_0x02f1;
                case -2112908723: goto L_0x0300;
                case -2084134425: goto L_0x030f;
                case -1924924588: goto L_0x031d;
                case -1916805629: goto L_0x032b;
                case -1864755345: goto L_0x0339;
                case -1861793634: goto L_0x0347;
                case -1776425186: goto L_0x0356;
                case -1721640191: goto L_0x0364;
                case -1606294708: goto L_0x0372;
                case -1587752839: goto L_0x0380;
                case -1484045932: goto L_0x038e;
                case -1389936073: goto L_0x039c;
                case -1347925350: goto L_0x03aa;
                case -1293854543: goto L_0x03b8;
                case -1290530873: goto L_0x03c6;
                case -1148924054: goto L_0x03d4;
                case -1117731165: goto L_0x03e2;
                case -1098209777: goto L_0x03f0;
                case -1059361352: goto L_0x03ff;
                case -1053039321: goto L_0x040d;
                case -902468257: goto L_0x041b;
                case -747990041: goto L_0x042a;
                case -459685918: goto L_0x0438;
                case -449618447: goto L_0x0446;
                case -439414708: goto L_0x0454;
                case -391222211: goto L_0x0462;
                case -381653348: goto L_0x0471;
                case -340911628: goto L_0x047f;
                case -327000206: goto L_0x048d;
                case -281296301: goto L_0x049b;
                case -253106228: goto L_0x04a9;
                case -194623424: goto L_0x04b7;
                case -120202075: goto L_0x04c5;
                case -61423793: goto L_0x04d4;
                case 96666: goto L_0x04e2;
                case 98347: goto L_0x04f0;
                case 101517: goto L_0x04fe;
                case 3539948: goto L_0x050c;
                case 64916380: goto L_0x051b;
                case 92309290: goto L_0x0529;
                case 287912233: goto L_0x0537;
                case 322449263: goto L_0x0545;
                case 395167905: goto L_0x0553;
                case 451661819: goto L_0x0561;
                case 469371245: goto L_0x056f;
                case 627805909: goto L_0x057e;
                case 656562322: goto L_0x058c;
                case 681123117: goto L_0x059a;
                case 747648432: goto L_0x05a9;
                case 777959537: goto L_0x05b7;
                case 1006617720: goto L_0x05c6;
                case 1045461864: goto L_0x05d4;
                case 1047472087: goto L_0x05e2;
                case 1078126824: goto L_0x05f0;
                case 1250385981: goto L_0x05ff;
                case 1270408060: goto L_0x060c;
                case 1317576386: goto L_0x061a;
                case 1540136281: goto L_0x0627;
                case 1584936478: goto L_0x0635;
                case 1737184630: goto L_0x0642;
                case 1780520651: goto L_0x064f;
                case 1825980878: goto L_0x065c;
                case 1995804693: goto L_0x0669;
                case 2045224032: goto L_0x0677;
                default: goto L_0x02da;
            }     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
        L_0x02da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            java.lang.String r0 = "Unknown library: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            r1.append(r12)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
        L_0x02f0:
            throw r1     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
        L_0x02f1:
            java.lang.String r0 = "spark-qpluserflow-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libspark_qpluserflow_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0300:
            java.lang.String r0 = "stash-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libstash_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x030f:
            java.lang.String r0 = "ardcache-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x031d:
            java.lang.String r0 = "fbsystrace"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbsystrace_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x032b:
            java.lang.String r0 = "roi-align-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libroi_align_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0339:
            java.lang.String r0 = "airshield_light_mbed_jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libairshield_light_mbed_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0347:
            java.lang.String r0 = "versioned-model-cache-native-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libversioned_model_cache_native_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0356:
            java.lang.String r0 = "jniperflogger"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniperflogger_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0364:
            java.lang.String r0 = "arfx-engine-plugin-avatars"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_avatars_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0372:
            java.lang.String r0 = "dynamic_pytorch_impl"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdynamic_pytorch_impl_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0380:
            java.lang.String r0 = "mediapipeline-iglufilter-whatsapp"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmediapipeline_iglufilter_whatsapp_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x038e:
            java.lang.String r0 = "ard-android-network-consent-manager-interf"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_interf_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x039c:
            java.lang.String r0 = "ardcache-stash"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_stash_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x03aa:
            java.lang.String r0 = "flatbuffers"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libflatbuffers_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x03b8:
            java.lang.String r0 = "native_bridge"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libnative_bridge_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x03c6:
            java.lang.String r0 = "opus_mlow"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libopus_mlow_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x03d4:
            java.lang.String r0 = "hybridlogsinkjni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libhybridlogsinkjni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x03e2:
            java.lang.String r0 = "arfx-engine-plugin-touch_gestures"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_touch_gestures_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x03f0:
            java.lang.String r0 = "yogacore"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libyogacore_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x03ff:
            java.lang.String r0 = "featureconfig"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfeatureconfig_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x040d:
            java.lang.String r0 = "arpersistenceservice"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarpersistenceservice_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x041b:
            java.lang.String r0 = "sigmux"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsigmux_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x042a:
            java.lang.String r0 = "arclass"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarclass_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0438:
            java.lang.String r0 = "onecamera-iglufilter-graph"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libonecamera_iglufilter_graph_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0446:
            java.lang.String r0 = "gputimer-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgputimer_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0454:
            java.lang.String r0 = "audiograph-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libaudiograph_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0462:
            java.lang.String r0 = "segmentationdataprovider"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsegmentationdataprovider_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0471:
            java.lang.String r0 = "fbacore-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbacore_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x047f:
            java.lang.String r0 = "datax_jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdatax_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x048d:
            java.lang.String r0 = "graphicsengine-whatsapp-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgraphicsengine_whatsapp_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x049b:
            java.lang.String r0 = "mediapipeline-iglufilter-holder"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmediapipeline_iglufilter_holder_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x04a9:
            java.lang.String r0 = "profiloextapi"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libprofiloextapi_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x04b7:
            java.lang.String r0 = "arengineservicesutils"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarengineservicesutils_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x04c5:
            java.lang.String r0 = "xplat_hermes_lib_Platform_Unicode_UnicodeAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_hermes_lib_Platform_Unicode_UnicodeAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x04d4:
            java.lang.String r0 = "asyncexecutor"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libasyncexecutor_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x04e2:
            java.lang.String r0 = "ale"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libale_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x04f0:
            java.lang.String r0 = "cdl"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcdl_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x04fe:
            java.lang.String r0 = "fmt"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfmt_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x050c:
            java.lang.String r0 = "sslx"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsslx_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x051b:
            java.lang.String r0 = "maskrcnn-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmaskrcnn_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0529:
            java.lang.String r0 = "ard-android-network-consent-manager-impl"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_impl_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0537:
            java.lang.String r0 = "mediapipeline-igl-context"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmediapipeline_igl_context_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0545:
            java.lang.String r0 = "camera-xplat-spars-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcamera_xplat_spars_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0553:
            java.lang.String r0 = "ard-android-async-asset-fetcher"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0561:
            java.lang.String r0 = "jniexecutors"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniexecutors_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x056f:
            java.lang.String r0 = "xplat_arfx_services_interfaces_interfacesAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_interfaces_interfacesAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x057e:
            java.lang.String r0 = "avatarsdataprovider"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libavatarsdataprovider_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x058c:
            java.lang.String r0 = "double-conversion"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdouble_conversion_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x059a:
            java.lang.String r0 = "single-model-cache-native-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsingle_model_cache_native_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x05a9:
            java.lang.String r0 = "flatbuffersflatc"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libflatbuffersflatc_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x05b7:
            java.lang.String r0 = "unet-106-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libunet_106_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x05c6:
            java.lang.String r0 = "dynamic_executorch"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdynamic_executorch_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x05d4:
            java.lang.String r0 = "mediapipeline-iglufilter-impl-basic"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmediapipeline_iglufilter_impl_basic_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x05e2:
            java.lang.String r0 = "cryptox"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcryptox_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x05f0:
            java.lang.String r0 = "xplat_ecos_ecosAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_ecos_ecosAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x05ff:
            java.lang.String r0 = "gltfholdernew"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgltfholdernew_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x060c:
            java.lang.String r0 = "xplat_arfx_services_impl_avatars_avatarsAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_impl_avatars_avatarsAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x061a:
            java.lang.String r0 = "mediapipeline-iglufilter-insights"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmediapipeline_iglufilter_insights_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0627:
            java.lang.String r0 = "xanalyticsadapter-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxanalyticsadapter_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0635:
            java.lang.String r0 = "jniuserflow"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniuserflow_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0642:
            java.lang.String r0 = "batch-box-cox-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libbatch_box_cox_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x064f:
            java.lang.String r0 = "filters-native-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfilters_native_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x065c:
            java.lang.String r0 = "musiceffect-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmusiceffect_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0669:
            java.lang.String r0 = "tar-brotli-archive-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libtar_brotli_archive_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x0683
        L_0x0677:
            java.lang.String r0 = "ard-android-async-asset-fetcher-listener"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            if (r0 == 0) goto L_0x02da
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_listener_so()     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
        L_0x0683:
            if (r0 != 0) goto L_0x0686
            goto L_0x068f
        L_0x0686:
            java.lang.String r0 = "Failed to invoke native library JNI_OnLoad"
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x02f0
        L_0x068f:
            java.util.Set r0 = A0B     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            r0.add(r12)     // Catch:{ UnsatisfiedLinkError -> 0x0695 }
            goto L_0x06bf
        L_0x0695:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06ba }
            r1.<init>()     // Catch:{ all -> 0x06ba }
            java.lang.String r0 = "Failed to call JNI_OnLoad from '"
            r1.append(r0)     // Catch:{ all -> 0x06ba }
            r1.append(r12)     // Catch:{ all -> 0x06ba }
            java.lang.String r0 = "', which has been merged into '"
            r1.append(r0)     // Catch:{ all -> 0x06ba }
            r1.append(r13)     // Catch:{ all -> 0x06ba }
            java.lang.String r0 = "'.  See comment for details."
            r1.append(r0)     // Catch:{ all -> 0x06ba }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06ba }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x06ba }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x06ba }
            throw r0     // Catch:{ all -> 0x06ba }
        L_0x06ba:
            r3 = move-exception
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x06cd }
        L_0x06be:
            throw r3     // Catch:{ all -> 0x06cd }
        L_0x06bf:
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x06cd }
        L_0x06c2:
            monitor-exit(r9)     // Catch:{ all -> 0x06cd }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()
            r0.unlock()
            r0 = r19 ^ 1
            return r0
        L_0x06cd:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x06cd }
            throw r0     // Catch:{ all -> 0x06d0 }
        L_0x06d0:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r17.readLock()
            r0.unlock()
            throw r1
        L_0x06d9:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x06d9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A8.A05(android.os.StrictMode$ThreadPolicy, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public static boolean A06(String str) {
        if (A00) {
            return A07(str, 0);
        }
        return AnonymousClass1AK.A01(str);
    }

    public static boolean A07(String str, int i) {
        boolean z;
        Boolean valueOf;
        if (A0C == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = A08;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (A0C == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (AnonymousClass1A8.class) {
                            try {
                                z = !A06.contains(str);
                                if (z) {
                                    System.loadLibrary(str);
                                }
                                valueOf = Boolean.valueOf(z);
                            } catch (Throwable th) {
                                while (true) {
                                    th = th;
                                    break;
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        if (valueOf != null) {
                            return z;
                        }
                    } else if (!A03()) {
                        th = new IllegalStateException("SoLoader.init() not yet called");
                    }
                    throw th;
                }
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
        if (!A00) {
            return AnonymousClass1AK.A01(str);
        }
        String A002 = AnonymousClass1AM.A00(str);
        String str2 = str;
        if (A002 != null) {
            str2 = A002;
        }
        return A04((StrictMode.ThreadPolicy) null, System.mapLibraryName(str2), str, A002, i);
    }
}
