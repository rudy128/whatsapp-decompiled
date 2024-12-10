package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* renamed from: X.CwP  reason: case insensitive filesystem */
public final class C26274CwP {
    public static int A01 = -1;
    public static C23325BfD A02;
    public static C23326BfE A03;
    public static Boolean A04;
    public static Boolean A05;
    public static String A06;
    public static boolean A07;
    public static final E5J A08 = new Object();
    public static final E5J A09 = new Object();
    public static final ThreadLocal A0A = new ThreadLocal();
    public static final C28568E7y A0B = new Object();
    public static final ThreadLocal A0C = new ThreadLocal();
    public final Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bb, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bc, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d5, code lost:
        throw new X.C2E(X.AnonymousClass001.A1H("V2 version check failed: ", r3.getMessage(), X.AnonymousClass000.A10()), r3);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c2 A[Catch:{ all -> 0x00d6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            r8 = 0
            android.content.ContentResolver r6 = r9.getContentResolver()     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            java.lang.ThreadLocal r0 = A0C     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            long r4 = r0.longValue()     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            java.lang.String r3 = "api_force_staging"
            java.lang.String r0 = "api"
            r1 = 1
            if (r1 == r11) goto L_0x0019
            r3 = r0
        L_0x0019:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            r2.<init>()     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            java.lang.String r0 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r0)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            java.lang.String r0 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r2.authority(r0)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            android.net.Uri$Builder r0 = r0.path(r3)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            android.net.Uri$Builder r3 = r0.appendPath(r10)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            java.lang.String r2 = "requestStartTime"
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            android.net.Uri$Builder r0 = r3.appendQueryParameter(r2, r0)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            android.net.Uri r7 = r0.build()     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            r10 = r8
            r11 = r8
            r9 = r8
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            if (r4 == 0) goto L_0x00a8
            boolean r0 = r4.moveToFirst()     // Catch:{ Exception -> 0x00b7 }
            if (r0 == 0) goto L_0x00a8
            r3 = 0
            int r5 = r4.getInt(r3)     // Catch:{ Exception -> 0x00b7 }
            if (r5 <= 0) goto L_0x0096
            java.lang.Class<X.CwP> r2 = X.C26274CwP.class
            monitor-enter(r2)     // Catch:{ Exception -> 0x00b7 }
            r0 = 2
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0092 }
            A06 = r0     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "loaderVersion"
            int r0 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            if (r0 < 0) goto L_0x006e
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0092 }
            A01 = r0     // Catch:{ all -> 0x0092 }
        L_0x006e:
            java.lang.String r0 = "disableStandaloneDynamiteLoader2"
            int r0 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            if (r0 < 0) goto L_0x0080
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x007d
            r1 = 0
        L_0x007d:
            A07 = r1     // Catch:{ all -> 0x0092 }
            r3 = r1
        L_0x0080:
            monitor-exit(r2)     // Catch:{ all -> 0x0092 }
            java.lang.ThreadLocal r0 = A0A     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x00b7 }
            X.CLG r1 = (X.CLG) r1     // Catch:{ Exception -> 0x00b7 }
            if (r1 == 0) goto L_0x0096
            android.database.Cursor r0 = r1.A00     // Catch:{ Exception -> 0x00b7 }
            if (r0 != 0) goto L_0x0096
            r1.A00 = r4     // Catch:{ Exception -> 0x00b7 }
            goto L_0x0095
        L_0x0092:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0092 }
            goto L_0x00b6
        L_0x0095:
            r4 = r8
        L_0x0096:
            if (r12 == 0) goto L_0x00a2
            if (r3 == 0) goto L_0x00a2
            java.lang.String r0 = "forcing fallback to container DynamiteLoader impl"
            X.C2E r1 = new X.C2E     // Catch:{ Exception -> 0x00b7 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00b6
        L_0x00a2:
            if (r4 == 0) goto L_0x00a7
            r4.close()
        L_0x00a7:
            return r5
        L_0x00a8:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r0 = "Failed to connect to dynamite module ContentResolver."
            X.C2E r1 = new X.C2E     // Catch:{ Exception -> 0x00b7 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00b7 }
        L_0x00b6:
            throw r1     // Catch:{ Exception -> 0x00b7 }
        L_0x00b7:
            r3 = move-exception
            goto L_0x00bd
        L_0x00b9:
            r0 = move-exception
            throw r0
        L_0x00bb:
            r3 = move-exception
            r4 = r8
        L_0x00bd:
            boolean r0 = r3 instanceof X.C2E     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x00c2
            throw r3     // Catch:{ all -> 0x00d6 }
        L_0x00c2:
            java.lang.String r2 = r3.getMessage()     // Catch:{ all -> 0x00d6 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "V2 version check failed: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x00d6 }
            X.C2E r0 = new X.C2E     // Catch:{ all -> 0x00d6 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x00d6 }
            throw r0     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r0 = move-exception
            if (r4 == 0) goto L_0x00dc
            r4.close()
        L_0x00dc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26274CwP.A02(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.Cyt] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(java.lang.ClassLoader r3) {
        /*
            r1 = 0
            java.lang.String r0 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r0 = r3.loadClass(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0025 }
            java.lang.Object r3 = X.BEA.A0d(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0025 }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0025 }
            if (r3 == 0) goto L_0x001b
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0025 }
            boolean r0 = r1 instanceof X.C23326BfE     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0025 }
            if (r0 == 0) goto L_0x001e
            X.BfE r1 = (X.C23326BfE) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0025 }
        L_0x001b:
            A03 = r1     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0025 }
            goto L_0x0024
        L_0x001e:
            X.BfE r1 = new X.BfE     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0025 }
            r1.<init>(r3, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0025 }
            goto L_0x001b
        L_0x0024:
            return
        L_0x0025:
            r2 = move-exception
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            X.C2E r0 = new X.C2E
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26274CwP.A06(java.lang.ClassLoader):void");
    }

    public Context A08() {
        return this.A00;
    }

    public static int A00(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("com.google.android.gms.dynamite.descriptors.");
            A10.append(str);
            Class<?> loadClass = classLoader.loadClass(AnonymousClass000.A0y(".ModuleDescriptor", A10));
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C25332Cdd.A01(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Module descriptor id '");
            A102.append(valueOf);
            A102.append("' didn't match expected id '");
            A102.append(str);
            Log.e("DynamiteModule", AnonymousClass000.A0y("'", A102));
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("Local module descriptor class for ");
            A103.append(str);
            BE9.A1H(" not found.", "DynamiteModule", A103);
            return 0;
        } catch (Exception e) {
            BE7.A1K("Failed to load module descriptor class: ", String.valueOf(e.getMessage()), "DynamiteModule");
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static int A01(android.content.Context r19, java.lang.String r20, boolean r21) {
        /*
            r5 = r19
            java.lang.Class<X.CwP> r19 = X.C26274CwP.class
            monitor-enter(r19)     // Catch:{ all -> 0x029e }
            java.lang.Boolean r0 = A04     // Catch:{ all -> 0x0297 }
            r6 = 0
            r4 = 0
            r8 = r20
            r7 = r21
            if (r0 != 0) goto L_0x017f
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x016b, IllegalAccessException -> 0x0169, NoSuchFieldException -> 0x0167 }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x016b, IllegalAccessException -> 0x0169, NoSuchFieldException -> 0x0167 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r0 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x016b, IllegalAccessException -> 0x0169, NoSuchFieldException -> 0x0167 }
            java.lang.Class r1 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x016b, IllegalAccessException -> 0x0169, NoSuchFieldException -> 0x0167 }
            java.lang.String r0 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ ClassNotFoundException -> 0x016b, IllegalAccessException -> 0x0169, NoSuchFieldException -> 0x0167 }
            java.lang.Class r18 = r2.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x016b, IllegalAccessException -> 0x0169, NoSuchFieldException -> 0x0167 }
            monitor-enter(r18)     // Catch:{ ClassNotFoundException -> 0x016b, IllegalAccessException -> 0x0169, NoSuchFieldException -> 0x0167 }
            java.lang.Object r1 = r2.get(r6)     // Catch:{ all -> 0x0164 }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ all -> 0x0164 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0164 }
            if (r1 != r0) goto L_0x003d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0164 }
        L_0x003a:
            monitor-exit(r18)     // Catch:{ all -> 0x0164 }
            goto L_0x017d
        L_0x003d:
            if (r1 == 0) goto L_0x0045
            A06(r1)     // Catch:{ C2E -> 0x0042 }
        L_0x0042:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0164 }
            goto L_0x003a
        L_0x0045:
            boolean r0 = A07(r5)     // Catch:{ all -> 0x0164 }
            if (r0 != 0) goto L_0x004e
            monitor-exit(r18)     // Catch:{ all -> 0x0164 }
            goto L_0x015d
        L_0x004e:
            boolean r0 = A07     // Catch:{ all -> 0x0164 }
            if (r0 != 0) goto L_0x0152
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0164 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0164 }
            if (r0 != 0) goto L_0x0152
            r0 = 1
            int r17 = A02(r5, r8, r7, r0)     // Catch:{ C2E -> 0x0147 }
            java.lang.String r0 = A06     // Catch:{ C2E -> 0x0147 }
            if (r0 == 0) goto L_0x0161
            boolean r0 = r0.isEmpty()     // Catch:{ C2E -> 0x0147 }
            if (r0 != 0) goto L_0x0161
            java.lang.Class<X.C4w> r16 = X.C24456C4w.class
            monitor-enter(r16)     // Catch:{ C2E -> 0x0147 }
            java.lang.ClassLoader r10 = X.C24456C4w.A00     // Catch:{ all -> 0x0144 }
            if (r10 != 0) goto L_0x0113
            java.lang.Thread r13 = X.C24456C4w.A01     // Catch:{ all -> 0x0144 }
            r10 = 0
            if (r13 != 0) goto L_0x00f4
            java.lang.Thread r0 = X.BE8.A0k()     // Catch:{ all -> 0x0144 }
            java.lang.ThreadGroup r13 = r0.getThreadGroup()     // Catch:{ all -> 0x0144 }
            if (r13 != 0) goto L_0x0081
            r13 = r6
            goto L_0x00ec
        L_0x0081:
            java.lang.Class<java.lang.Void> r15 = java.lang.Void.class
            monitor-enter(r15)     // Catch:{ all -> 0x0144 }
            int r14 = r13.activeGroupCount()     // Catch:{ SecurityException -> 0x00da }
            java.lang.ThreadGroup[] r9 = new java.lang.ThreadGroup[r14]     // Catch:{ SecurityException -> 0x00da }
            r13.enumerate(r9)     // Catch:{ SecurityException -> 0x00da }
            r12 = 0
            r3 = 0
        L_0x008f:
            if (r3 >= r14) goto L_0x00a2
            r11 = r9[r3]     // Catch:{ SecurityException -> 0x00da }
            java.lang.String r1 = "dynamiteLoader"
            java.lang.String r0 = r11.getName()     // Catch:{ SecurityException -> 0x00da }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00da }
            if (r0 != 0) goto L_0x00a9
            int r3 = r3 + 1
            goto L_0x008f
        L_0x00a2:
            java.lang.String r0 = "dynamiteLoader"
            java.lang.ThreadGroup r11 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x00da }
            r11.<init>(r13, r0)     // Catch:{ SecurityException -> 0x00da }
        L_0x00a9:
            int r9 = r11.activeCount()     // Catch:{ SecurityException -> 0x00da }
            java.lang.Thread[] r3 = new java.lang.Thread[r9]     // Catch:{ SecurityException -> 0x00da }
            r11.enumerate(r3)     // Catch:{ SecurityException -> 0x00da }
        L_0x00b2:
            if (r12 >= r9) goto L_0x00c5
            r13 = r3[r12]     // Catch:{ SecurityException -> 0x00da }
            java.lang.String r1 = "GmsDynamite"
            java.lang.String r0 = r13.getName()     // Catch:{ SecurityException -> 0x00da }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00da }
            if (r0 != 0) goto L_0x00eb
            int r12 = r12 + 1
            goto L_0x00b2
        L_0x00c5:
            r13 = r6
            java.lang.String r0 = "GmsDynamite"
            X.DaD r1 = new X.DaD     // Catch:{ SecurityException -> 0x00d8 }
            r1.<init>(r11, r0)     // Catch:{ SecurityException -> 0x00d8 }
            r1.setContextClassLoader(r6)     // Catch:{ SecurityException -> 0x00d5 }
            r1.start()     // Catch:{ SecurityException -> 0x00d5 }
            r13 = r1
            goto L_0x00eb
        L_0x00d5:
            r0 = move-exception
            r13 = r1
            goto L_0x00dc
        L_0x00d8:
            r0 = move-exception
            goto L_0x00dc
        L_0x00da:
            r0 = move-exception
            r13 = r6
        L_0x00dc:
            java.lang.String r9 = "DynamiteLoaderV2CL"
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Failed to enumerate thread/threadgroup "
            X.BEA.A1N(r0, r3, r9, r1)     // Catch:{ all -> 0x00f1 }
        L_0x00eb:
            monitor-exit(r15)     // Catch:{ all -> 0x00f1 }
        L_0x00ec:
            X.C24456C4w.A01 = r13     // Catch:{ all -> 0x0144 }
            if (r13 != 0) goto L_0x00f4
            goto L_0x010d
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00f1 }
            goto L_0x0112
        L_0x00f4:
            monitor-enter(r13)     // Catch:{ all -> 0x0144 }
            java.lang.Thread r0 = X.C24456C4w.A01     // Catch:{ SecurityException -> 0x00fc }
            java.lang.ClassLoader r10 = r0.getContextClassLoader()     // Catch:{ SecurityException -> 0x00fc }
            goto L_0x010c
        L_0x00fc:
            r0 = move-exception
            java.lang.String r9 = "DynamiteLoaderV2CL"
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "Failed to get thread context classloader "
            X.BEA.A1N(r0, r3, r9, r1)     // Catch:{ all -> 0x0110 }
        L_0x010c:
            monitor-exit(r13)     // Catch:{ all -> 0x0110 }
        L_0x010d:
            X.C24456C4w.A00 = r10     // Catch:{ all -> 0x0144 }
            goto L_0x0113
        L_0x0110:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0110 }
        L_0x0112:
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0113:
            monitor-exit(r16)     // Catch:{ C2E -> 0x0147 }
            if (r10 != 0) goto L_0x012a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ C2E -> 0x0147 }
            r0 = 29
            if (r1 < r0) goto L_0x0135
            java.lang.String r1 = A06     // Catch:{ C2E -> 0x0147 }
            X.C18210vx.A00(r1)     // Catch:{ C2E -> 0x0147 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ C2E -> 0x0147 }
            dalvik.system.DelegateLastClassLoader r10 = new dalvik.system.DelegateLastClassLoader     // Catch:{ C2E -> 0x0147 }
            r10.<init>(r1, r0)     // Catch:{ C2E -> 0x0147 }
        L_0x012a:
            A06(r10)     // Catch:{ C2E -> 0x0147 }
            r2.set(r6, r10)     // Catch:{ C2E -> 0x0147 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ C2E -> 0x0147 }
            A04 = r0     // Catch:{ C2E -> 0x0147 }
            goto L_0x015f
        L_0x0135:
            java.lang.String r1 = A06     // Catch:{ C2E -> 0x0147 }
            X.C18210vx.A00(r1)     // Catch:{ C2E -> 0x0147 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ C2E -> 0x0147 }
            X.Bwb r10 = new X.Bwb     // Catch:{ C2E -> 0x0147 }
            r10.<init>(r1, r0)     // Catch:{ C2E -> 0x0147 }
            goto L_0x012a
        L_0x0144:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ C2E -> 0x0147 }
            throw r0     // Catch:{ C2E -> 0x0147 }
        L_0x0147:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0164 }
            r2.set(r6, r0)     // Catch:{ all -> 0x0164 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0164 }
            goto L_0x003a
        L_0x0152:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0164 }
            r2.set(r6, r0)     // Catch:{ all -> 0x0164 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0164 }
            goto L_0x003a
        L_0x015d:
            monitor-exit(r19)     // Catch:{ all -> 0x0297 }
            return r4
        L_0x015f:
            monitor-exit(r18)     // Catch:{ all -> 0x0164 }
            goto L_0x0162
        L_0x0161:
            monitor-exit(r18)     // Catch:{ all -> 0x0164 }
        L_0x0162:
            monitor-exit(r19)     // Catch:{ all -> 0x0297 }
            return r17
        L_0x0164:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0164 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x016b, IllegalAccessException -> 0x0169, NoSuchFieldException -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            goto L_0x016c
        L_0x0169:
            r0 = move-exception
            goto L_0x016c
        L_0x016b:
            r0 = move-exception
        L_0x016c:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0297 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0297 }
            java.lang.String r0 = "Failed to load module via V2: "
            X.BEA.A1N(r0, r2, r3, r1)     // Catch:{ all -> 0x0297 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0297 }
        L_0x017d:
            A04 = r0     // Catch:{ all -> 0x0297 }
        L_0x017f:
            monitor-exit(r19)     // Catch:{ all -> 0x0297 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x019c
            int r0 = A02(r5, r8, r7, r4)     // Catch:{ C2E -> 0x018b }
            return r0
        L_0x018b:
            r0 = move-exception
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x029e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x029e }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            X.BEA.A1N(r0, r2, r3, r1)     // Catch:{ all -> 0x029e }
            return r4
        L_0x019c:
            X.BfD r3 = A05(r5)     // Catch:{ all -> 0x029e }
            if (r3 == 0) goto L_0x0296
            r1 = 6
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0279 }
            java.lang.String r2 = r3.A00     // Catch:{ RemoteException -> 0x0279 }
            r0.writeInterfaceToken(r2)     // Catch:{ RemoteException -> 0x0279 }
            android.os.Parcel r0 = r3.A00(r1, r0)     // Catch:{ RemoteException -> 0x0279 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0279 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0279 }
            r0 = 3
            if (r1 < r0) goto L_0x022a
            java.lang.ThreadLocal r11 = A0A     // Catch:{ RemoteException -> 0x0279 }
            java.lang.Object r0 = r11.get()     // Catch:{ RemoteException -> 0x0279 }
            X.CLG r0 = (X.CLG) r0     // Catch:{ RemoteException -> 0x0279 }
            if (r0 == 0) goto L_0x01cd
            android.database.Cursor r0 = r0.A00     // Catch:{ RemoteException -> 0x0279 }
            if (r0 == 0) goto L_0x01cd
            int r4 = r0.getInt(r4)     // Catch:{ RemoteException -> 0x0279 }
            return r4
        L_0x01cd:
            X.Bde r10 = new X.Bde     // Catch:{ RemoteException -> 0x0279 }
            r10.<init>(r5)     // Catch:{ RemoteException -> 0x0279 }
            java.lang.ThreadLocal r0 = A0C     // Catch:{ RemoteException -> 0x0279 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0279 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0279 }
            long r0 = r0.longValue()     // Catch:{ RemoteException -> 0x0279 }
            android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0279 }
            X.BE9.A15(r10, r9, r2)     // Catch:{ RemoteException -> 0x0279 }
            r9.writeString(r8)     // Catch:{ RemoteException -> 0x0279 }
            r9.writeInt(r7)     // Catch:{ RemoteException -> 0x0279 }
            r9.writeLong(r0)     // Catch:{ RemoteException -> 0x0279 }
            r0 = 7
            com.google.android.gms.dynamic.IObjectWrapper r0 = A03(r9, r3, r0)     // Catch:{ RemoteException -> 0x0279 }
            java.lang.Object r3 = X.C23228Bde.A00(r0)     // Catch:{ RemoteException -> 0x0279 }
            android.database.Cursor r3 = (android.database.Cursor) r3     // Catch:{ RemoteException -> 0x0279 }
            if (r3 == 0) goto L_0x021a
            boolean r0 = r3.moveToFirst()     // Catch:{ RemoteException -> 0x0227, all -> 0x0291 }
            if (r0 == 0) goto L_0x021a
            int r2 = r3.getInt(r4)     // Catch:{ RemoteException -> 0x0227, all -> 0x0291 }
            if (r2 <= 0) goto L_0x0216
            java.lang.Object r1 = r11.get()     // Catch:{ RemoteException -> 0x0227, all -> 0x0291 }
            X.CLG r1 = (X.CLG) r1     // Catch:{ RemoteException -> 0x0227, all -> 0x0291 }
            if (r1 == 0) goto L_0x0216
            android.database.Cursor r0 = r1.A00     // Catch:{ RemoteException -> 0x0227, all -> 0x0291 }
            if (r0 != 0) goto L_0x0216
            r1.A00 = r3     // Catch:{ RemoteException -> 0x0227, all -> 0x0291 }
            return r2
        L_0x0216:
            r3.close()     // Catch:{ all -> 0x029e }
            return r2
        L_0x021a:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0227, all -> 0x0291 }
            if (r3 == 0) goto L_0x0296
            r3.close()     // Catch:{ all -> 0x029e }
            return r4
        L_0x0227:
            r0 = move-exception
            r6 = r3
            goto L_0x027a
        L_0x022a:
            r0 = 2
            if (r1 != r0) goto L_0x0253
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0279 }
            X.Bde r0 = new X.Bde     // Catch:{ RemoteException -> 0x0279 }
            r0.<init>(r5)     // Catch:{ RemoteException -> 0x0279 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0279 }
            X.BE9.A15(r0, r1, r2)     // Catch:{ RemoteException -> 0x0279 }
            r1.writeString(r8)     // Catch:{ RemoteException -> 0x0279 }
            r1.writeInt(r7)     // Catch:{ RemoteException -> 0x0279 }
            r0 = 5
            android.os.Parcel r0 = r3.A00(r0, r1)     // Catch:{ RemoteException -> 0x0279 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0279 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0279 }
            return r1
        L_0x0253:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0279 }
            X.Bde r0 = new X.Bde     // Catch:{ RemoteException -> 0x0279 }
            r0.<init>(r5)     // Catch:{ RemoteException -> 0x0279 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0279 }
            X.BE9.A15(r0, r1, r2)     // Catch:{ RemoteException -> 0x0279 }
            r1.writeString(r8)     // Catch:{ RemoteException -> 0x0279 }
            r1.writeInt(r7)     // Catch:{ RemoteException -> 0x0279 }
            r0 = 3
            android.os.Parcel r0 = r3.A00(r0, r1)     // Catch:{ RemoteException -> 0x0279 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0279 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0279 }
            return r1
        L_0x0279:
            r0 = move-exception
        L_0x027a:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x028f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x028f }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            X.BEA.A1N(r0, r2, r3, r1)     // Catch:{ all -> 0x028f }
            if (r6 == 0) goto L_0x0296
            r6.close()     // Catch:{ all -> 0x029e }
            return r4
        L_0x028f:
            r0 = move-exception
            goto L_0x0293
        L_0x0291:
            r0 = move-exception
            r6 = r3
        L_0x0293:
            if (r6 == 0) goto L_0x029d
            goto L_0x029a
        L_0x0296:
            return r4
        L_0x0297:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0297 }
            goto L_0x029d
        L_0x029a:
            r6.close()     // Catch:{ all -> 0x029e }
        L_0x029d:
            throw r0     // Catch:{ all -> 0x029e }
        L_0x029e:
            r3 = move-exception
            X.C18210vx.A00(r5)     // Catch:{ Exception -> 0x02a3 }
            throw r3
        L_0x02a3:
            r2 = move-exception
            java.lang.String r1 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r1, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26274CwP.A01(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.CLG, java.lang.Object] */
    public static C26274CwP A04(Context context, E5J e5j, String str) {
        C2E c2e;
        C26274CwP cwP;
        int i;
        C2E c2e2;
        Boolean bool;
        IObjectWrapper iObjectWrapper;
        C23326BfE bfE;
        boolean A1C;
        IObjectWrapper iObjectWrapper2;
        Context context2 = context;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = A0A;
            Object obj = threadLocal.get();
            ? obj2 = new Object();
            threadLocal.set(obj2);
            ThreadLocal threadLocal2 = A0C;
            Number number = (Number) threadLocal2.get();
            long longValue = number.longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                String str2 = str;
                CQ4 CHE = e5j.CHE(context2, A0B, str2);
                int i2 = CHE.A00;
                int i3 = CHE.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Considering local module ");
                A10.append(str2);
                A10.append(":");
                A10.append(i2);
                C17890vO.A10(" and remote module ", str2, ":", A10);
                Log.i("DynamiteModule", C17880vN.A0t(A10, i3));
                int i4 = CHE.A02;
                if (i4 != 0) {
                    if (i4 != -1) {
                        int i5 = CHE.A01;
                        if (i5 != 0) {
                            Class<C26274CwP> cls = C26274CwP.class;
                            try {
                                synchronized (cls) {
                                    try {
                                        if (A07(context2)) {
                                            bool = A04;
                                        } else {
                                            throw new C2E("Remote loading disabled");
                                        }
                                    } catch (Throwable th) {
                                        while (true) {
                                            th = th;
                                            break;
                                        }
                                    }
                                }
                                if (bool == null) {
                                    th = new C2E("Failed to determine which loading route to use.");
                                } else if (bool.booleanValue()) {
                                    StringBuilder A102 = AnonymousClass000.A10();
                                    A102.append("Selected remote version of ");
                                    A102.append(str2);
                                    Log.i("DynamiteModule", AnonymousClass001.A1I(", version >= ", A102, i5));
                                    synchronized (cls) {
                                        try {
                                            bfE = A03;
                                        } catch (Throwable th2) {
                                            while (true) {
                                                th = th2;
                                                break;
                                            }
                                        }
                                    }
                                    if (bfE != null) {
                                        CLG clg = (CLG) threadLocal.get();
                                        if (clg == null || clg.A00 == null) {
                                            th = new C2E("No result cursor");
                                        } else {
                                            Context applicationContext2 = context2.getApplicationContext();
                                            Cursor cursor = clg.A00;
                                            new C23228Bde((Object) null);
                                            synchronized (cls) {
                                                try {
                                                    A1C = C108975cc.A1C(A01, 2);
                                                } catch (Throwable th3) {
                                                    while (true) {
                                                        th = th3;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (A1C) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                C23228Bde bde = new C23228Bde(applicationContext2);
                                                C23228Bde bde2 = new C23228Bde(cursor);
                                                Parcel obtain = Parcel.obtain();
                                                BE9.A15(bde, obtain, bfE.A00);
                                                obtain.writeString(str2);
                                                obtain.writeInt(i5);
                                                obtain.writeStrongBinder(bde2.asBinder());
                                                iObjectWrapper2 = A03(obtain, bfE, 3);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                C23228Bde bde3 = new C23228Bde(applicationContext2);
                                                C23228Bde bde4 = new C23228Bde(cursor);
                                                Parcel obtain2 = Parcel.obtain();
                                                BE9.A15(bde3, obtain2, bfE.A00);
                                                obtain2.writeString(str2);
                                                obtain2.writeInt(i5);
                                                obtain2.writeStrongBinder(bde4.asBinder());
                                                iObjectWrapper2 = A03(obtain2, bfE, 2);
                                            }
                                            Context context3 = (Context) C23228Bde.A00(iObjectWrapper2);
                                            if (context3 != null) {
                                                cwP = new C26274CwP(context3);
                                            } else {
                                                th = new C2E("Failed to get module context");
                                            }
                                        }
                                    } else {
                                        th = new C2E("DynamiteLoaderV2 was not cached.");
                                    }
                                } else {
                                    StringBuilder A103 = AnonymousClass000.A10();
                                    A103.append("Selected remote version of ");
                                    A103.append(str2);
                                    Log.i("DynamiteModule", AnonymousClass001.A1I(", version >= ", A103, i5));
                                    C23325BfD A052 = A05(context2);
                                    if (A052 != null) {
                                        Parcel obtain3 = Parcel.obtain();
                                        String str3 = A052.A00;
                                        obtain3.writeInterfaceToken(str3);
                                        Parcel A002 = A052.A00(6, obtain3);
                                        int readInt = A002.readInt();
                                        A002.recycle();
                                        if (readInt >= 3) {
                                            CLG clg2 = (CLG) threadLocal.get();
                                            if (clg2 != null) {
                                                C23228Bde bde5 = new C23228Bde(context2);
                                                C23228Bde bde6 = new C23228Bde(clg2.A00);
                                                Parcel obtain4 = Parcel.obtain();
                                                BE9.A15(bde5, obtain4, str3);
                                                obtain4.writeString(str2);
                                                obtain4.writeInt(i5);
                                                obtain4.writeStrongBinder(bde6.asBinder());
                                                iObjectWrapper = A03(obtain4, A052, 8);
                                            } else {
                                                th = new C2E("No cached result cursor holder");
                                            }
                                        } else if (readInt == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            C23228Bde bde7 = new C23228Bde(context2);
                                            Parcel obtain5 = Parcel.obtain();
                                            BE9.A15(bde7, obtain5, str3);
                                            obtain5.writeString(str2);
                                            obtain5.writeInt(i5);
                                            iObjectWrapper = A03(obtain5, A052, 4);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            C23228Bde bde8 = new C23228Bde(context2);
                                            Parcel obtain6 = Parcel.obtain();
                                            BE9.A15(bde8, obtain6, str3);
                                            obtain6.writeString(str2);
                                            obtain6.writeInt(i5);
                                            iObjectWrapper = A03(obtain6, A052, 2);
                                        }
                                        Object A003 = C23228Bde.A00(iObjectWrapper);
                                        if (A003 != null) {
                                            cwP = new C26274CwP((Context) A003);
                                        } else {
                                            th = new C2E("Failed to load remote module.");
                                        }
                                    } else {
                                        th = new C2E("Failed to create IDynamiteLoader.");
                                    }
                                }
                                throw th;
                            } catch (RemoteException e) {
                                c2e2 = new C2E("Failed to load remote module.", e);
                            } catch (C2E e2) {
                                throw e2;
                            } catch (C2E e3) {
                                BEA.A1N("Failed to load remote module: ", e3.getMessage(), "DynamiteModule", AnonymousClass000.A10());
                                int i6 = CHE.A00;
                                if (i6 != 0) {
                                    if (e5j.CHE(context2, new DJ9(i6), str2).A02 == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str2)));
                                        cwP = new C26274CwP(applicationContext);
                                    }
                                }
                                c2e = new C2E("Remote load failed. No local fallback found.", e3);
                            } catch (Throwable th4) {
                                c2e2 = new C2E("Failed to load remote module.", th4);
                            }
                        }
                    } else if (CHE.A00 != 0) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str2)));
                        cwP = new C26274CwP(applicationContext);
                    }
                    if (i != 0) {
                        threadLocal2.set(number);
                    }
                    return cwP;
                }
                int i7 = CHE.A00;
                int i8 = CHE.A01;
                StringBuilder A104 = AnonymousClass000.A10();
                A104.append("No acceptable module ");
                A104.append(str2);
                A104.append(" found. Local version is ");
                A104.append(i7);
                A104.append(" and remote version is ");
                A104.append(i8);
                c2e = new C2E(AnonymousClass000.A0y(".", A104));
                throw c2e;
            } finally {
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(number);
                }
                Cursor cursor2 = obj2.A00;
                if (cursor2 != null) {
                    cursor2.close();
                }
                threadLocal.set(obj);
            }
        } else {
            throw new C2E("null application Context");
        }
        throw c2e2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.Cyt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.BfD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.BfD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.BfD} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C23325BfD A05(android.content.Context r6) {
        /*
            java.lang.Class<X.CwP> r5 = X.C26274CwP.class
            monitor-enter(r5)
            X.BfD r4 = A02     // Catch:{ all -> 0x0050 }
            if (r4 != 0) goto L_0x004e
            r4 = 0
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = r6.createPackageContext(r1, r0)     // Catch:{ Exception -> 0x003a }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch:{ Exception -> 0x003a }
            java.lang.Object r3 = r0.newInstance()     // Catch:{ Exception -> 0x003a }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x004e
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r3.queryLocalInterface(r2)     // Catch:{ Exception -> 0x003a }
            boolean r0 = r1 instanceof X.C23325BfD     // Catch:{ Exception -> 0x003a }
            if (r0 == 0) goto L_0x0032
            X.BfD r1 = (X.C23325BfD) r1     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x004e
        L_0x002f:
            A02 = r1     // Catch:{ Exception -> 0x003a }
            goto L_0x0038
        L_0x0032:
            X.BfD r1 = new X.BfD     // Catch:{ Exception -> 0x003a }
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x003a }
            goto L_0x002f
        L_0x0038:
            monitor-exit(r5)     // Catch:{ all -> 0x0050 }
            return r1
        L_0x003a:
            r0 = move-exception
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x0050 }
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r5)     // Catch:{ all -> 0x0050 }
            return r4
        L_0x0050:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0050 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26274CwP.A05(android.content.Context):X.BfD");
    }

    public static boolean A07(Context context) {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals((Object) null)) {
            Boolean bool2 = A05;
            if (!bool.equals(bool2)) {
                boolean z = false;
                if (bool2 == null) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
                    if (GoogleApiAvailabilityLight.A00.A02(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = true;
                    }
                    A05 = Boolean.valueOf(z);
                    if (z) {
                        ApplicationInfo applicationInfo = resolveContentProvider.applicationInfo;
                        if (applicationInfo != null && (applicationInfo.flags & 129) == 0) {
                            Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                            A07 = true;
                        }
                        return z;
                    }
                }
                Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
                return z;
            }
        }
        return true;
    }

    public IBinder A09(String str) {
        try {
            return (IBinder) this.A00.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C2E("Failed to instantiate module class: ".concat(String.valueOf(str)), e);
        }
    }

    public C26274CwP(Context context) {
        C18210vx.A00(context);
        this.A00 = context;
    }

    public static IObjectWrapper A03(Parcel parcel, C26393Cyt cyt, int i) {
        Parcel A002 = cyt.A00(i, parcel);
        IObjectWrapper A012 = C23331BfJ.A01(A002.readStrongBinder());
        A002.recycle();
        return A012;
    }
}
