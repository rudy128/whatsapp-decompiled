package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0xo  reason: invalid class name and case insensitive filesystem */
public class C19190xo implements C19180xn {
    public final C19170xm A00;
    public final C19200xp A01;
    public final Map A02 = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C22411B6q BM0(java.lang.String r15) {
        /*
            r14 = this;
            monitor-enter(r14)
            java.util.Map r7 = r14.A02     // Catch:{ all -> 0x0128 }
            boolean r0 = r7.containsKey(r15)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0011
            java.lang.Object r3 = r7.get(r15)     // Catch:{ all -> 0x0128 }
            X.B6q r3 = (X.C22411B6q) r3     // Catch:{ all -> 0x0128 }
            goto L_0x00de
        L_0x0011:
            X.0xp r10 = r14.A01     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "Could not instantiate %s"
            java.lang.String r8 = "Could not instantiate %s."
            java.lang.String r3 = "BackendRegistry"
            java.util.Map r12 = r10.A00     // Catch:{ all -> 0x0128 }
            if (r12 != 0) goto L_0x00a2
            android.content.Context r5 = r10.A01     // Catch:{ all -> 0x0128 }
            android.content.pm.PackageManager r4 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0092 }
            if (r4 != 0) goto L_0x002b
            java.lang.String r0 = "Context has no PackageManager."
            android.util.Log.w(r3, r0)     // Catch:{ NameNotFoundException -> 0x0092 }
            goto L_0x0097
        L_0x002b:
            java.lang.Class<X.25v> r0 = X.C450625v.class
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0092 }
            r1.<init>(r5, r0)     // Catch:{ NameNotFoundException -> 0x0092 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r4.getServiceInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0092 }
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "TransportBackendDiscovery has no service info."
            android.util.Log.w(r3, r0)     // Catch:{ NameNotFoundException -> 0x0092 }
            goto L_0x0097
        L_0x0040:
            android.os.Bundle r11 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0092 }
            if (r11 == 0) goto L_0x0097
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x0128 }
            r12.<init>()     // Catch:{ all -> 0x0128 }
            java.util.Set r0 = r11.keySet()     // Catch:{ all -> 0x0128 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0128 }
        L_0x0051:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r9 = r13.next()     // Catch:{ all -> 0x0128 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0128 }
            java.lang.Object r4 = r11.get(r9)     // Catch:{ all -> 0x0128 }
            boolean r0 = r4 instanceof java.lang.String     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "backend:"
            boolean r0 = r9.startsWith(r0)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0128 }
            java.lang.String r1 = ","
            r0 = -1
            java.lang.String[] r6 = r4.split(r1, r0)     // Catch:{ all -> 0x0128 }
            int r5 = r6.length     // Catch:{ all -> 0x0128 }
            r4 = 0
        L_0x0078:
            if (r4 >= r5) goto L_0x0051
            r0 = r6[r4]     // Catch:{ all -> 0x0128 }
            java.lang.String r1 = r0.trim()     // Catch:{ all -> 0x0128 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0128 }
            if (r0 != 0) goto L_0x008f
            r0 = 8
            java.lang.String r0 = r9.substring(r0)     // Catch:{ all -> 0x0128 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0128 }
        L_0x008f:
            int r4 = r4 + 1
            goto L_0x0078
        L_0x0092:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x0128 }
        L_0x0097:
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of transport backends."
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x0128 }
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0128 }
        L_0x00a0:
            r10.A00 = r12     // Catch:{ all -> 0x0128 }
        L_0x00a2:
            java.lang.Object r6 = r12.get(r15)     // Catch:{ all -> 0x0128 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0128 }
            if (r6 == 0) goto L_0x0125
            r5 = 1
            r4 = 0
            java.lang.Class r1 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0117, IllegalAccessException | InstantiationException -> 0x010d, NoSuchMethodException | InvocationTargetException -> 0x0100 }
            java.lang.Class<X.E1Y> r0 = X.E1Y.class
            java.lang.Class r1 = r1.asSubclass(r0)     // Catch:{ ClassNotFoundException -> 0x0117, IllegalAccessException | InstantiationException -> 0x010d, NoSuchMethodException | InvocationTargetException -> 0x0100 }
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0117, IllegalAccessException | InstantiationException -> 0x010d, NoSuchMethodException | InvocationTargetException -> 0x0100 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0117, IllegalAccessException | InstantiationException -> 0x010d, NoSuchMethodException | InvocationTargetException -> 0x0100 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0117, IllegalAccessException | InstantiationException -> 0x010d, NoSuchMethodException | InvocationTargetException -> 0x0100 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0117, IllegalAccessException | InstantiationException -> 0x010d, NoSuchMethodException | InvocationTargetException -> 0x0100 }
            X.E1Y r0 = (X.E1Y) r0     // Catch:{ ClassNotFoundException -> 0x0117, IllegalAccessException | InstantiationException -> 0x010d, NoSuchMethodException | InvocationTargetException -> 0x0100 }
            if (r0 == 0) goto L_0x0125
            X.0xm r0 = r14.A00     // Catch:{ all -> 0x0128 }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x0128 }
            X.0xi r1 = r0.A02     // Catch:{ all -> 0x0128 }
            X.0xi r0 = r0.A01     // Catch:{ all -> 0x0128 }
            if (r2 == 0) goto L_0x00f0
            if (r1 == 0) goto L_0x00e8
            if (r0 == 0) goto L_0x00e0
            if (r15 == 0) goto L_0x00f8
            X.AJ3 r3 = new X.AJ3     // Catch:{ all -> 0x0128 }
            r3.<init>(r2, r1, r0)     // Catch:{ all -> 0x0128 }
            r7.put(r15, r3)     // Catch:{ all -> 0x0128 }
        L_0x00de:
            monitor-exit(r14)
            return r3
        L_0x00e0:
            java.lang.String r0 = "Null monotonicClock"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0128 }
            r1.<init>(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x00ff
        L_0x00e8:
            java.lang.String r0 = "Null wallClock"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0128 }
            r1.<init>(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x00ff
        L_0x00f0:
            java.lang.String r0 = "Null applicationContext"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0128 }
            r1.<init>(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x00ff
        L_0x00f8:
            java.lang.String r0 = "Null backendName"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0128 }
            r1.<init>(r0)     // Catch:{ all -> 0x0128 }
        L_0x00ff:
            throw r1     // Catch:{ all -> 0x0128 }
        L_0x0100:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0128 }
            r0[r4] = r6     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ all -> 0x0128 }
            android.util.Log.w(r3, r0, r1)     // Catch:{ all -> 0x0128 }
            goto L_0x0125
        L_0x010d:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0128 }
            r0[r4] = r6     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = java.lang.String.format(r8, r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0122
        L_0x0117:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0128 }
            r1[r4] = r6     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "Class %s is not found."
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0128 }
        L_0x0122:
            android.util.Log.w(r3, r0, r2)     // Catch:{ all -> 0x0128 }
        L_0x0125:
            monitor-exit(r14)
            r3 = 0
            return r3
        L_0x0128:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19190xo.BM0(java.lang.String):X.B6q");
    }

    public C19190xo(Context context, C19170xm r4) {
        C19200xp r1 = new C19200xp(context);
        this.A01 = r1;
        this.A00 = r4;
    }
}
