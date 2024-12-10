package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CqV  reason: case insensitive filesystem */
public class C26014CqV {
    public static final long A0F = TimeUnit.DAYS.toMillis(366);
    public static final Object A0G = C17880vN.A0p();
    public static volatile ScheduledExecutorService A0H;
    public int A00 = 0;
    public DRE A01;
    public AtomicInteger A02 = new AtomicInteger(0);
    public int A03;
    public long A04;
    public WorkSource A05;
    public C28450E1q A06 = DJ3.A00;
    public Future A07;
    public final Object A08 = C17880vN.A0p();
    public final String A09;
    public final Map A0A = C17880vN.A11();
    public final Set A0B = C17880vN.A12();
    public final Context A0C;
    public final PowerManager.WakeLock A0D;
    public final ScheduledExecutorService A0E;

    public C26014CqV(Context context) {
        boolean z;
        Object[] objArr;
        String packageName = context.getPackageName();
        C18210vx.A05("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        this.A0C = context.getApplicationContext();
        this.A01 = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf("wake:com.google.firebase.iid.WakeLockHolder");
            this.A09 = BE9.A0o("*gcore*:", valueOf, valueOf.length());
        } else {
            this.A09 = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder A0t = BE6.A0t(29);
            A0t.append("expected a non-null reference", 0, 29);
            throw new C27225Da4(A0t.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        this.A0D = newWakeLock;
        synchronized (C25468CgN.class) {
            Boolean bool = C25468CgN.A00;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = C19740yt.A01(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                C25468CgN.A00 = Boolean.valueOf(z);
            }
        }
        if (z) {
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            WorkSource workSource = null;
            if (!(context.getPackageManager() == null || packageName == null)) {
                try {
                    ApplicationInfo applicationInfo = C41401wK.A00(context).A00.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        BE7.A1K("Could not get applicationInfo from package: ", packageName, "WorkSourceUtil");
                    } else {
                        int i = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method = C25468CgN.A02;
                        if (method != null) {
                            try {
                                objArr = new Object[2];
                                C17880vN.A1T(objArr, i, 0);
                                objArr[1] = packageName;
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            method = C25468CgN.A01;
                            if (method != null) {
                                objArr = new Object[1];
                                C17880vN.A1T(objArr, i, 0);
                            }
                        }
                        method.invoke(workSource, objArr);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    BE7.A1K("Could not find package: ", packageName, "WorkSourceUtil");
                }
            }
            this.A05 = workSource;
            if (workSource != null) {
                try {
                    newWakeLock.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                    Log.wtf("WakeLock", e2.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = A0H;
        if (scheduledExecutorService == null) {
            synchronized (A0G) {
                scheduledExecutorService = A0H;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    A0H = scheduledExecutorService;
                }
            }
        }
        this.A0E = scheduledExecutorService;
    }

    public static final void A00(C26014CqV cqV) {
        synchronized (cqV.A08) {
            if (cqV.A02()) {
                int i = cqV.A00 - 1;
                cqV.A00 = i;
                if (i <= 0) {
                    Set set = cqV.A0B;
                    if (!set.isEmpty()) {
                        ArrayList A10 = C17880vN.A10(set);
                        set.clear();
                        if (A10.size() > 0) {
                            A10.get(0);
                            throw null;
                        }
                    }
                    Map map = cqV.A0A;
                    Iterator A0l = C17890vO.A0l(map);
                    while (A0l.hasNext()) {
                        ((CLN) A0l.next()).A00 = 0;
                    }
                    map.clear();
                    Future future = cqV.A07;
                    if (future != null) {
                        future.cancel(false);
                        cqV.A07 = null;
                        cqV.A04 = 0;
                    }
                    cqV.A03 = 0;
                    PowerManager.WakeLock wakeLock = cqV.A0D;
                    if (wakeLock.isHeld()) {
                        try {
                            wakeLock.release();
                            if (cqV.A01 != null) {
                                cqV.A01 = null;
                            }
                        } catch (RuntimeException e) {
                            if (e.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(cqV.A09).concat(" failed to release!"), e);
                                if (cqV.A01 != null) {
                                    cqV.A01 = null;
                                }
                            } else {
                                throw e;
                            }
                        } catch (Throwable th) {
                            if (cqV.A01 != null) {
                                cqV.A01 = null;
                            }
                            throw th;
                        }
                    } else {
                        BE7.A1K(String.valueOf(cqV.A09), " should be held!", "WakeLock");
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.CLN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.CLN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.CLN} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(long r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A02
            r0.incrementAndGet()
            long r0 = A0F
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = java.lang.Math.min(r4, r0)
            r0 = 1
            long r2 = java.lang.Math.max(r2, r0)
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            long r2 = java.lang.Math.min(r12, r2)
        L_0x0020:
            java.lang.Object r8 = r11.A08
            monitor-enter(r8)
            boolean r0 = r11.A02()     // Catch:{ all -> 0x008c }
            r1 = 0
            r7 = 0
            if (r0 != 0) goto L_0x0037
            X.DRE r0 = X.DRE.A00     // Catch:{ all -> 0x008c }
            r11.A01 = r0     // Catch:{ all -> 0x008c }
            android.os.PowerManager$WakeLock r0 = r11.A0D     // Catch:{ all -> 0x008c }
            r0.acquire()     // Catch:{ all -> 0x008c }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008c }
        L_0x0037:
            int r0 = r11.A00     // Catch:{ all -> 0x008c }
            int r0 = r0 + 1
            r11.A00 = r0     // Catch:{ all -> 0x008c }
            int r0 = r11.A03     // Catch:{ all -> 0x008c }
            int r0 = r0 + 1
            r11.A03 = r0     // Catch:{ all -> 0x008c }
            android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x008c }
            java.util.Map r0 = r11.A0A     // Catch:{ all -> 0x008c }
            java.lang.Object r6 = r0.get(r7)     // Catch:{ all -> 0x008c }
            X.CLN r6 = (X.CLN) r6     // Catch:{ all -> 0x008c }
            if (r6 != 0) goto L_0x0058
            X.CLN r6 = new X.CLN     // Catch:{ all -> 0x008c }
            r6.<init>()     // Catch:{ all -> 0x008c }
            r0.put(r7, r6)     // Catch:{ all -> 0x008c }
        L_0x0058:
            int r0 = r6.A00     // Catch:{ all -> 0x008c }
            int r0 = r0 + 1
            r6.A00 = r0     // Catch:{ all -> 0x008c }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008c }
            long r6 = r4 - r9
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            long r4 = r9 + r2
        L_0x006a:
            long r6 = r11.A04     // Catch:{ all -> 0x008c }
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x008a
            r11.A04 = r4     // Catch:{ all -> 0x008c }
            java.util.concurrent.Future r0 = r11.A07     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0079
            r0.cancel(r1)     // Catch:{ all -> 0x008c }
        L_0x0079:
            java.util.concurrent.ScheduledExecutorService r4 = r11.A0E     // Catch:{ all -> 0x008c }
            r0 = 15
            X.DTf r1 = new X.DTf     // Catch:{ all -> 0x008c }
            r1.<init>((java.lang.Object) r11, (int) r0)     // Catch:{ all -> 0x008c }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x008c }
            java.util.concurrent.ScheduledFuture r0 = r4.schedule(r1, r2, r0)     // Catch:{ all -> 0x008c }
            r11.A07 = r0     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r8)     // Catch:{ all -> 0x008c }
            return
        L_0x008c:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x008c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26014CqV.A01(long):void");
    }

    public boolean A02() {
        boolean A1R;
        synchronized (this.A08) {
            A1R = AnonymousClass000.A1R(this.A00);
        }
        return A1R;
    }
}
