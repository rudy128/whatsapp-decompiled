package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1dJ  reason: invalid class name and case insensitive filesystem */
public class C30051dJ {
    public long A00;
    public C162358Kk A01;
    public C55162fJ A02;
    public AnonymousClass1Be A03 = AnonymousClass1Be.A01;
    public C47072Gz A04;
    public C46792Fx A05;
    public C46802Fy A06;
    public AtomicInteger A07 = new AtomicInteger();
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = true;
    public final AnonymousClass190 A0B;
    public final AnonymousClass18O A0C;
    public final C19830z4 A0D;
    public final C24681Lg A0E;
    public final C18030ve A0F;
    public final AnonymousClass18K A0G;
    public final AnonymousClass180 A0H;
    public final C200710s A0I;
    public final AnonymousClass10I A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass11P A0N;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (((java.lang.System.currentTimeMillis() - r15.A00) / 1000) < ((long) X.C18020vd.A00(X.C18040vf.A02, r15.A0F, 2640))) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C30051dJ r15, java.lang.String r16, java.lang.String r17) {
        /*
            java.lang.String r0 = "background"
            r8 = r16
            boolean r0 = r8.equals(r0)
            r16 = r0 ^ 1
            r5 = r15
            boolean r0 = r15.A09
            if (r0 == 0) goto L_0x0033
            X.1Be r7 = r15.A03
            X.2fJ r0 = r15.A02
            X.C17960vV.A07(r0)
            boolean r0 = r15.A0A
            if (r0 == 0) goto L_0x006b
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r15.A00
            long r3 = r3 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            X.0ve r2 = r15.A0F
            r1 = 2640(0xa50, float:3.7E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
        L_0x0033:
            boolean r0 = r15.A08
            if (r0 == 0) goto L_0x036a
            X.0z4 r9 = r15.A0D
            X.00H r0 = r9.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r8 = "network_statistics_last_report_time"
            r0 = -1
            long r10 = r2.getLong(r8, r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r14 = r1 - r10
            r3 = 157680000000(0x24b675dc00, double:7.79042710362E-313)
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x005d
            long r14 = android.os.SystemClock.uptimeMillis()
            long r14 = r14 - r10
        L_0x005d:
            X.180 r4 = r5.A0H
            X.1ER r0 = r4.A00
            if (r0 == 0) goto L_0x026f
            X.AnonymousClass180.A00(r4)
            X.1ER r3 = r4.A00
            monitor-enter(r3)
            goto L_0x025d
        L_0x006b:
            X.2fJ r3 = r15.A02
            boolean r2 = r3.A02
            X.19j r1 = r3.A04
            X.19z r0 = r3.A00
            boolean r0 = r1.A02(r0)
            r2 = r2 & r0
            r3.A02 = r2
            if (r2 != 0) goto L_0x0131
            r9 = 0
        L_0x007d:
            X.8Ki r9 = (X.C162338Ki) r9
            if (r9 == 0) goto L_0x0033
            java.lang.Class<X.8Kf> r0 = X.C162308Kf.class
            X.19z r6 = r9.A03(r0)
            X.8Kf r6 = (X.C162308Kf) r6
            java.lang.Class<X.8Kh> r0 = X.C162328Kh.class
            X.19z r4 = r9.A03(r0)
            X.8Kh r4 = (X.C162328Kh) r4
            java.lang.Integer r0 = r7.A00
            r14 = 0
            if (r0 == 0) goto L_0x011d
            r14 = 1
            r3 = r7
        L_0x0098:
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x0100
            X.2Gz r2 = new X.2Gz
            r2.<init>()
            r2.A09 = r8
            long r0 = r6.realtimeMs
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08 = r0
            long r0 = r6.uptimeMs
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
            double r0 = r4.systemTimeS
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A00 = r0
            double r0 = r4.userTimeS
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A01 = r0
            java.lang.Class<X.8Kg> r0 = X.C162318Kg.class
            X.19z r8 = r9.A03(r0)
            X.8Kg r8 = (X.C162318Kg) r8
            long r0 = r8.mobileBytesRx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02 = r0
            long r0 = r8.mobileBytesTx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A03 = r0
            long r0 = r8.wifiBytesRx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            long r0 = r8.wifiBytesTx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            r0 = r17
            r2.A0A = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r15.A07
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            X.18K r0 = r15.A0G
            r0.CC8(r2, r3)
        L_0x0100:
            double r1 = r4.systemTimeS
            double r3 = r4.userTimeS
            double r1 = r1 + r3
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 * r3
            long r8 = r6.realtimeMs
            double r3 = (double) r8
            double r1 = r1 / r3
            r3 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r1 = r1 * r3
            X.18O r0 = r15.A0C
            X.18T r3 = X.AnonymousClass18O.A0l
            java.lang.Class<X.18O> r8 = X.AnonymousClass18O.class
            monitor-enter(r8)
            goto L_0x0144
        L_0x011d:
            X.2Gz r2 = r15.A04
            if (r2 != 0) goto L_0x0128
            X.2Gz r2 = new X.2Gz
            r2.<init>()
            r15.A04 = r2
        L_0x0128:
            X.18K r1 = r15.A0G
            r0 = 0
            X.1Be r3 = r1.BDn(r2, r0)
            goto L_0x0098
        L_0x0131:
            X.19z r1 = r3.A00
            X.19z r0 = r3.A01
            X.19z r9 = r3.A03
            r1.A02(r0, r9)
            X.19z r1 = r3.A01
            X.19z r0 = r3.A00
            r3.A01 = r0
            r3.A00 = r1
            goto L_0x007d
        L_0x0144:
            android.content.SharedPreferences r4 = r0.A00     // Catch:{ all -> 0x036e }
            java.lang.Boolean r0 = X.C17970vW.A03     // Catch:{ all -> 0x036e }
            java.lang.String r3 = r3.A00     // Catch:{ all -> 0x036e }
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r0 = r4.getFloat(r3, r0)     // Catch:{ all -> 0x036e }
            monitor-exit(r8)     // Catch:{ all -> 0x036e }
            double r3 = (double) r0     // Catch:{ all -> 0x036e }
            r8 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0163
            X.190 r4 = r15.A0B
            java.lang.String r3 = "CriticalBatteryUsageEvent"
            java.lang.String r0 = java.lang.Double.toString(r1)
            r4.A0G(r3, r0, r8)
        L_0x0163:
            java.util.concurrent.atomic.AtomicInteger r0 = r15.A07
            r0.set(r8)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r6.realtimeMs
            long r12 = r2.toSeconds(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            X.10I r0 = r15.A0J
            boolean r0 = r0 instanceof X.AnonymousClass10J
            if (r0 == 0) goto L_0x01cc
            if (r14 == 0) goto L_0x024f
            r4 = r7
        L_0x017d:
            X.10M r0 = X.AnonymousClass10J.A06
            X.10N r10 = r0.A00
            java.util.concurrent.atomic.AtomicLong r2 = r10.A03
            r0 = 0
            long r8 = r2.getAndSet(r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.util.concurrent.atomic.AtomicLong r2 = r10.A04
            long r0 = r2.getAndSet(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r6 = android.util.Pair.create(r6, r0)
            X.1Lg r0 = r15.A0E
            X.1Li r1 = r0.getAndResetObserverCounts()
            java.lang.Integer r0 = r4.A00
            if (r0 == 0) goto L_0x01cc
            X.2Fx r2 = new X.2Fx
            r2.<init>()
            r2.A00 = r3
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r2.A04 = r0
            java.lang.Object r0 = r6.first
            java.lang.Long r0 = (java.lang.Long) r0
            r2.A02 = r0
            java.lang.Object r0 = r6.second
            java.lang.Long r0 = (java.lang.Long) r0
            r2.A03 = r0
            int r0 = r1.A01
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
            X.18K r0 = r15.A0G
            r0.CC8(r2, r4)
        L_0x01cc:
            X.00H r0 = r15.A0M
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r11 = r0.iterator()
        L_0x01d8:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r8 = r11.next()
            X.1Mg r8 = (X.C24941Mg) r8
            if (r14 == 0) goto L_0x0245
            r6 = r7
        L_0x01e7:
            X.0ve r2 = r8.A01
            r1 = 9149(0x23bd, float:1.282E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01d8
            X.1Mh r4 = new X.1Mh
            r4.<init>()
            X.1Mi r8 = r8.A02
            monitor-enter(r8)
            java.util.concurrent.atomic.AtomicLong r2 = r8.A03     // Catch:{ all -> 0x036b }
            r0 = 0
            long r9 = r2.getAndSet(r0)     // Catch:{ all -> 0x036b }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x036b }
            java.util.concurrent.atomic.AtomicLong r2 = r8.A04     // Catch:{ all -> 0x036b }
            long r0 = r2.getAndSet(r0)     // Catch:{ all -> 0x036b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x036b }
            X.1D6 r1 = new X.1D6     // Catch:{ all -> 0x036b }
            r1.<init>(r9, r0)     // Catch:{ all -> 0x036b }
            monitor-exit(r8)
            java.lang.Object r0 = r1.first
            java.lang.Long r0 = (java.lang.Long) r0
            r4.A03 = r0
            java.lang.Object r0 = r1.second
            java.lang.Long r0 = (java.lang.Long) r0
            r4.A02 = r0
            monitor-enter(r8)
            java.util.concurrent.atomic.AtomicLong r2 = r8.A02     // Catch:{ all -> 0x036b }
            r0 = 0
            long r0 = r2.getAndSet(r0)     // Catch:{ all -> 0x036b }
            monitor-exit(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A01 = r0
            r4.A00 = r3
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r4.A04 = r0
            java.lang.Integer r0 = r6.A00
            if (r0 == 0) goto L_0x01d8
            X.18K r0 = r15.A0G
            r0.CC8(r4, r6)
            goto L_0x01d8
        L_0x0245:
            X.18K r2 = r15.A0G
            X.1Mh r1 = X.C24941Mg.A09
            r0 = 0
            X.1Be r6 = r2.BDn(r1, r0)
            goto L_0x01e7
        L_0x024f:
            X.2Fx r2 = r15.A05
            X.C17960vV.A07(r2)
            X.18K r1 = r15.A0G
            r0 = 0
            X.1Be r4 = r1.BDn(r2, r0)
            goto L_0x017d
        L_0x025d:
            X.AnonymousClass1ER.A00(r3)     // Catch:{ all -> 0x0290 }
            java.util.HashMap r0 = X.C61112p9.A00     // Catch:{ all -> 0x0290 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0290 }
            r7.<init>(r0)     // Catch:{ all -> 0x0290 }
            r0.clear()     // Catch:{ all -> 0x0290 }
            monitor-exit(r3)
            X.AnonymousClass180.A01(r4)
            goto L_0x0274
        L_0x026f:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
        L_0x0274:
            X.1ER r0 = r4.A00
            if (r0 == 0) goto L_0x0293
            X.AnonymousClass180.A00(r4)
            X.1ER r3 = r4.A00
            monitor-enter(r3)
            X.AnonymousClass1ER.A00(r3)     // Catch:{ all -> 0x0290 }
            java.util.HashMap r0 = X.C61112p9.A01     // Catch:{ all -> 0x0290 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0290 }
            r6.<init>(r0)     // Catch:{ all -> 0x0290 }
            r0.clear()     // Catch:{ all -> 0x0290 }
            monitor-exit(r3)
            X.AnonymousClass180.A01(r4)
            goto L_0x0298
        L_0x0290:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0293:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
        L_0x0298:
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r9)
            android.content.SharedPreferences$Editor r0 = r0.putLong(r8, r1)
            r0.apply()
            r1 = -1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x036a
            r1 = 0
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x036a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x02bb
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x036a
        L_0x02bb:
            X.2Fy r1 = r5.A06
            if (r1 != 0) goto L_0x02c6
            X.2Fy r1 = new X.2Fy
            r1.<init>()
            r5.A06 = r1
        L_0x02c6:
            X.18K r8 = r5.A0G
            r0 = 0
            X.1Be r5 = r8.BDn(r1, r0)
            java.lang.Integer r0 = r5.A00
            if (r0 == 0) goto L_0x036a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Set r0 = r7.keySet()
            r1.addAll(r0)
            java.util.Set r0 = r6.keySet()
            r1.addAll(r0)
            java.util.Iterator r13 = r1.iterator()
        L_0x02e8:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x036a
            java.lang.Object r4 = r13.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            boolean r0 = r7.containsKey(r4)
            r11 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r10 = 0
            if (r0 == 0) goto L_0x0368
            java.lang.Object r0 = r7.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0368
            long r2 = r0.longValue()
            double r0 = (double) r2
            double r0 = r0 / r11
            double r2 = java.lang.Math.ceil(r0)
            long r0 = (long) r2
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L_0x0317:
            boolean r0 = r6.containsKey(r4)
            if (r0 == 0) goto L_0x0334
            java.lang.Object r0 = r6.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0334
            long r2 = r0.longValue()
            double r0 = (double) r2
            double r0 = r0 / r11
            double r2 = java.lang.Math.ceil(r0)
            long r0 = (long) r2
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L_0x0334:
            if (r9 == 0) goto L_0x035b
            long r11 = r9.longValue()
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x035b
        L_0x0340:
            X.2Fy r1 = new X.2Fy
            r1.<init>()
            r1.A00 = r4
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r1.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A01 = r0
            r1.A02 = r9
            r1.A03 = r10
            r8.CC8(r1, r5)
            goto L_0x02e8
        L_0x035b:
            if (r10 == 0) goto L_0x02e8
            long r11 = r10.longValue()
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e8
            goto L_0x0340
        L_0x0368:
            r9 = r10
            goto L_0x0317
        L_0x036a:
            return
        L_0x036b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x036e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x036e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30051dJ.A00(X.1dJ, java.lang.String, java.lang.String):void");
    }

    public void A01(Context context) {
        this.A0I.execute(new C21453AkK(this, context, 41));
    }

    public C30051dJ(AnonymousClass190 r3, AnonymousClass18O r4, AnonymousClass11P r5, C19830z4 r6, C24681Lg r7, C18030ve r8, AnonymousClass18K r9, AnonymousClass180 r10, AnonymousClass10I r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14) {
        this.A0N = r5;
        this.A0F = r8;
        this.A0B = r3;
        this.A0J = r11;
        this.A0G = r9;
        this.A0C = r4;
        this.A0E = r7;
        this.A0H = r10;
        this.A0D = r6;
        this.A0L = r12;
        this.A0I = new C200710s(r11, false);
        this.A0K = r13;
        this.A0M = r14;
    }
}
