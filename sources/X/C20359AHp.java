package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AHp  reason: case insensitive filesystem */
public class C20359AHp implements B4Q {
    public static final String A0B = A5Z.A01("Processor");
    public Context A00;
    public PowerManager.WakeLock A01 = null;
    public WorkDatabase A02;
    public C71973Kb A03;
    public Map A04 = C17880vN.A11();
    public Map A05 = C17880vN.A11();
    public Map A06 = C17880vN.A11();
    public Set A07 = C17880vN.A12();
    public AnonymousClass00I A08;
    public final Object A09 = C17880vN.A0p();
    public final List A0A = AnonymousClass000.A13();

    public static C21469Aka A00(C20359AHp aHp, String str) {
        Map map = aHp.A05;
        C21469Aka aka = (C21469Aka) map.remove(str);
        boolean z = true;
        if (aka == null) {
            z = false;
            aka = (C21469Aka) aHp.A04.remove(str);
        }
        aHp.A06.remove(str);
        if (!z) {
            return aka;
        }
        synchronized (aHp.A09) {
            if (!AnonymousClass8BR.A1Y(map)) {
                Context context = aHp.A00;
                Intent A072 = AnonymousClass8BR.A07(context, SystemForegroundService.class);
                A072.setAction("ACTION_STOP_FOREGROUND");
                try {
                    context.startService(A072);
                } catch (Throwable th) {
                    A5Z.A00().A08(A0B, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = aHp.A01;
                if (wakeLock != null) {
                    wakeLock.release();
                    aHp.A01 = null;
                }
            }
        }
        return aka;
    }

    public static boolean A01(C21469Aka aka, String str, int i) {
        if (aka != null) {
            aka.A0H = i;
            C21469Aka.A02(aka);
            C113975oM r1 = aka.A0F;
            r1.cancel(true);
            if (aka.A03 == null || !r1.isCancelled()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("WorkSpec ");
                A10.append(aka.A08);
                A5Z.A00().A03(C21469Aka.A0I, AnonymousClass000.A0y(" is already done. Not interrupting.", A10));
            } else {
                C20001A2q a2q = aka.A03;
                a2q.A03 = i;
                a2q.A09();
            }
            A5Z A002 = A5Z.A00();
            String str2 = A0B;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("WorkerWrapper interrupted for ");
            AnonymousClass8BW.A16(A002, str, str2, A102);
            return true;
        }
        A5Z A003 = A5Z.A00();
        String str3 = A0B;
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("WorkerWrapper could not be found for ");
        AnonymousClass8BW.A16(A003, str, str3, A103);
        return false;
    }

    public void A02(C22398B6b b6b) {
        synchronized (this.A09) {
            this.A0A.add(b6b);
        }
    }

    public void A03(C22398B6b b6b) {
        synchronized (this.A09) {
            this.A0A.remove(b6b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C185329cP r14, X.AnonymousClass9UL r15) {
        /*
            r13 = this;
            X.9pp r4 = r15.A00
            java.lang.String r3 = r4.A01
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            r9 = r13
            androidx.work.impl.WorkDatabase r8 = r13.A02
            r5 = 0
            X.Al3 r0 = new X.Al3
            r0.<init>(r13, r12, r3, r5)
            java.lang.Object r10 = r8.A04(r0)
            X.A2t r10 = (X.A2t) r10
            if (r10 != 0) goto L_0x003b
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = A0B
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Didn't find WorkSpec for id "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)
            r3.A06(r2, r0)
            X.3Kb r0 = r13.A03
            X.AHx r0 = (X.C20367AHx) r0
            java.util.concurrent.Executor r1 = r0.A02
            X.Akc r0 = new X.Akc
            r0.<init>(r13, r4)
            r1.execute(r0)
            return r5
        L_0x003b:
            java.lang.Object r2 = r13.A09
            monitor-enter(r2)
            boolean r0 = r13.A05(r3)     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x007a
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x00e0 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x00e0 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x00e0 }
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x00e0 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x00e0 }
            X.9UL r0 = (X.AnonymousClass9UL) r0     // Catch:{ all -> 0x00e0 }
            X.9pp r0 = r0.A00     // Catch:{ all -> 0x00e0 }
            int r1 = r0.A00     // Catch:{ all -> 0x00e0 }
            int r0 = r4.A00     // Catch:{ all -> 0x00e0 }
            if (r1 != r0) goto L_0x008c
            r3.add(r15)     // Catch:{ all -> 0x00e0 }
            X.A5Z r6 = X.A5Z.A00()     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = A0B     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "Work "
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            r1.append(r4)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = " is already enqueued for processing"
            X.AnonymousClass8BW.A16(r6, r0, r3, r1)     // Catch:{ all -> 0x00e0 }
        L_0x0078:
            monitor-exit(r2)     // Catch:{ all -> 0x00e0 }
            goto L_0x009b
        L_0x007a:
            int r1 = r10.A0K     // Catch:{ all -> 0x00e0 }
            int r0 = r4.A00     // Catch:{ all -> 0x00e0 }
            if (r1 != r0) goto L_0x008c
            android.content.Context r6 = r13.A00     // Catch:{ all -> 0x00e0 }
            X.00I r7 = r13.A08     // Catch:{ all -> 0x00e0 }
            X.3Kb r11 = r13.A03     // Catch:{ all -> 0x00e0 }
            X.9h0 r5 = new X.9h0     // Catch:{ all -> 0x00e0 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e0 }
            goto L_0x009c
        L_0x008c:
            X.3Kb r0 = r13.A03     // Catch:{ all -> 0x00e0 }
            X.AHx r0 = (X.C20367AHx) r0     // Catch:{ all -> 0x00e0 }
            java.util.concurrent.Executor r1 = r0.A02     // Catch:{ all -> 0x00e0 }
            X.Akc r0 = new X.Akc     // Catch:{ all -> 0x00e0 }
            r0.<init>(r13, r4)     // Catch:{ all -> 0x00e0 }
            r1.execute(r0)     // Catch:{ all -> 0x00e0 }
            goto L_0x0078
        L_0x009b:
            return r5
        L_0x009c:
            if (r14 == 0) goto L_0x00a0
            r5.A02 = r14     // Catch:{ all -> 0x00e0 }
        L_0x00a0:
            X.Aka r6 = new X.Aka     // Catch:{ all -> 0x00e0 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e0 }
            X.5oM r5 = r6.A0A     // Catch:{ all -> 0x00e0 }
            r0 = 9
            X.DTg r1 = new X.DTg     // Catch:{ all -> 0x00e0 }
            r1.<init>(r6, r13, r5, r0)     // Catch:{ all -> 0x00e0 }
            X.AHx r11 = (X.C20367AHx) r11     // Catch:{ all -> 0x00e0 }
            java.util.concurrent.Executor r0 = r11.A02     // Catch:{ all -> 0x00e0 }
            r5.BBG(r1, r0)     // Catch:{ all -> 0x00e0 }
            java.util.Map r0 = r13.A04     // Catch:{ all -> 0x00e0 }
            r0.put(r3, r6)     // Catch:{ all -> 0x00e0 }
            java.util.HashSet r1 = X.C17880vN.A12()     // Catch:{ all -> 0x00e0 }
            r1.add(r15)     // Catch:{ all -> 0x00e0 }
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x00e0 }
            r0.put(r3, r1)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e0 }
            X.AlD r0 = r11.A01
            r0.execute(r6)
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = A0B
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.C17900vP.A0a(r13, r1)
            java.lang.String r0 = ": processing "
            X.AnonymousClass8BX.A12(r3, r4, r0, r2, r1)
            r0 = 1
            return r0
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20359AHp.A04(X.9cP, X.9UL):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (((X.C21469Aka) r3.A04.get(r4)) != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A09
            monitor-enter(r2)
            java.util.Map r0 = r3.A05     // Catch:{ all -> 0x001b }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x001b }
            X.Aka r0 = (X.C21469Aka) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0018
            java.util.Map r0 = r3.A04     // Catch:{ all -> 0x001b }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x001b }
            X.Aka r1 = (X.C21469Aka) r1     // Catch:{ all -> 0x001b }
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return r0
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20359AHp.A05(java.lang.String):boolean");
    }

    public C20359AHp(Context context, AnonymousClass00I r3, WorkDatabase workDatabase, C71973Kb r5) {
        this.A00 = context;
        this.A08 = r3;
        this.A03 = r5;
        this.A02 = workDatabase;
    }
}
