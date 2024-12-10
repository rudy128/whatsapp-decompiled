package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Csh  reason: case insensitive filesystem */
public class C26119Csh {
    public static final C26119Csh A04 = new C26119Csh();
    public int A00 = 0;
    public final C25945CpD A01 = new C25945CpD(this);
    public volatile long A02 = -1;
    public volatile Map A03 = C17880vN.A11();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r5.A02) <= 5000) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C26119Csh r5, X.C25626Cj6 r6, boolean r7) {
        /*
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x001a
            long r3 = r5.A02
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.A02
            long r3 = r3 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L_0x0021
        L_0x001a:
            r1 = 0
            if (r7 == 0) goto L_0x0022
            boolean r0 = r6.A0L
            if (r0 != 0) goto L_0x0026
        L_0x0021:
            return r1
        L_0x0022:
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x0021
        L_0x0026:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26119Csh.A00(X.Csh, X.Cj6, boolean):boolean");
    }

    public static boolean A01(C25626Cj6 cj6, String str) {
        if (str.equals("meta.dav1d.av1.decoder") && cj6.A08) {
            return false;
        }
        String str2 = cj6.A07;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        return str2.equals(str);
    }

    public C28610EAe A02(C28492E3x e3x, C25626Cj6 cj6, String str, boolean z) {
        Set set;
        if (cj6.A0I) {
            C26119Csh csh = this.A01.A02;
            if (A00(csh, cj6, z) && A01(cj6, str)) {
                synchronized (csh.A03) {
                    set = (Set) csh.A03.get(str);
                }
                if (set != null) {
                    synchronized (set) {
                        if (!set.isEmpty()) {
                            csh.A00--;
                            Iterator it = set.iterator();
                            C28610EAe eAe = (C28610EAe) it.next();
                            it.remove();
                            return eAe;
                        }
                    }
                }
            }
            try {
                if (cj6.A09) {
                    return e3x.BH9(str, z);
                }
                return C25945CpD.A00(str, z);
            } catch (Exception e) {
                throw new C24393C1o(str, e);
            }
        } else {
            if (A00(this, cj6, z) && A01(cj6, str)) {
                synchronized (this) {
                    Set set2 = (Set) this.A03.get(str);
                    if (set2 != null && !set2.isEmpty()) {
                        this.A00--;
                        Iterator it2 = set2.iterator();
                        C28610EAe eAe2 = (C28610EAe) it2.next();
                        it2.remove();
                        return eAe2;
                    }
                }
            }
            try {
                if (cj6.A09) {
                    return e3x.BH9(str, z);
                }
                return C25945CpD.A00(str, z);
            } catch (Exception e2) {
                throw new C24393C1o(str, e2);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:110|(1:112)|113|(1:(2:122|(1:124)))|125|126|127|128|129|(1:133)|134|135) */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x016d, code lost:
        r5.A02 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0170, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0171, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r5.A02 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0174, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0180, code lost:
        if (r8.A0O != false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r8.A0K != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r4.size() < r8.A02) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c0, code lost:
        if (r1 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x0154 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00bb */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x017c A[Catch:{ all -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bb A[SYNTHETIC, Splitter:B:65:0x00bb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C28610EAe r20, X.C25626Cj6 r21, java.lang.Integer r22, java.lang.String r23, boolean r24) {
        /*
            r19 = this;
            r8 = r21
            boolean r0 = r8.A0I
            r5 = r19
            r6 = r20
            r9 = r23
            r10 = r24
            if (r0 == 0) goto L_0x00ff
            X.CpD r0 = r5.A01
            X.Csh r7 = r0.A02
            boolean r1 = A00(r7, r8, r10)
            if (r1 == 0) goto L_0x00d5
            boolean r1 = A01(r8, r9)
            if (r1 == 0) goto L_0x00d5
            boolean r1 = r8.A0J
            r11 = 1
            if (r1 == 0) goto L_0x0048
            boolean r2 = r0.A00
            if (r2 != 0) goto L_0x0048
            r0.A00 = r11
            java.util.concurrent.ScheduledExecutorService r12 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r2 = 40
            X.Akc r13 = new X.Akc
            r3 = r22
            r13.<init>((java.lang.Object) r0, (java.lang.Object) r3, (int) r2)
            r3 = 1000(0x3e8, float:1.401E-42)
            int r2 = r8.A04
            int r2 = java.lang.Math.max(r3, r2)
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r18 = java.util.concurrent.TimeUnit.MILLISECONDS
            r14 = 5
            r16 = r2
            r12.scheduleAtFixedRate(r13, r14, r16, r18)
        L_0x0048:
            int r3 = r7.A00
            int r2 = r8.A03
            r5 = 0
            if (r3 >= r2) goto L_0x00d5
            java.util.Map r3 = r7.A03
            monitor-enter(r3)
            java.util.Map r2 = r7.A03     // Catch:{ all -> 0x00cc }
            java.lang.Object r4 = r2.get(r9)     // Catch:{ all -> 0x00cc }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x00cc }
            if (r4 != 0) goto L_0x0065
            java.util.HashSet r4 = X.C17880vN.A12()     // Catch:{ all -> 0x00cc }
            java.util.Map r2 = r7.A03     // Catch:{ all -> 0x00cc }
            r2.put(r9, r4)     // Catch:{ all -> 0x00cc }
        L_0x0065:
            monitor-exit(r3)     // Catch:{ all -> 0x00cc }
            monitor-enter(r4)
            boolean r2 = r4.contains(r6)     // Catch:{ all -> 0x00c9 }
            if (r2 == 0) goto L_0x006f
            r11 = 0
            goto L_0x0082
        L_0x006f:
            if (r24 == 0) goto L_0x0076
            boolean r2 = r8.A0L     // Catch:{ all -> 0x00c9 }
            if (r2 != 0) goto L_0x007a
            goto L_0x0084
        L_0x0076:
            boolean r2 = r8.A0K     // Catch:{ all -> 0x00c9 }
            if (r2 == 0) goto L_0x0084
        L_0x007a:
            int r3 = r4.size()     // Catch:{ all -> 0x00c9 }
            int r2 = r8.A02     // Catch:{ all -> 0x00c9 }
            if (r3 >= r2) goto L_0x0084
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x00c9 }
            goto L_0x0087
        L_0x0084:
            r11 = 0
            r5 = 1
            goto L_0x0082
        L_0x0087:
            if (r5 != 0) goto L_0x00d5
            if (r1 != 0) goto L_0x00aa
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x00bb, all -> 0x00c3 }
            r7.A02 = r2     // Catch:{ IllegalStateException -> 0x00bb, all -> 0x00c3 }
            r6.reset()     // Catch:{ IllegalStateException -> 0x00bb, all -> 0x00c3 }
            if (r11 == 0) goto L_0x00a5
            monitor-enter(r4)     // Catch:{ IllegalStateException -> 0x00bb, all -> 0x00c3 }
            r4.add(r6)     // Catch:{ all -> 0x00a2 }
            int r2 = r7.A00     // Catch:{ all -> 0x00a2 }
            int r2 = r2 + 1
            r7.A00 = r2     // Catch:{ all -> 0x00a2 }
            monitor-exit(r4)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a5
        L_0x00a2:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a2 }
            throw r2     // Catch:{ IllegalStateException -> 0x00bb, all -> 0x00c3 }
        L_0x00a5:
            r0 = -1
            r7.A02 = r0
            return
        L_0x00aa:
            r12 = 1
            X.9gT r5 = new X.9gT     // Catch:{ IllegalStateException -> 0x00bb }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IllegalStateException -> 0x00bb }
            java.util.concurrent.ConcurrentLinkedQueue r3 = r0.A01     // Catch:{ IllegalStateException -> 0x00bb }
            monitor-enter(r3)     // Catch:{ IllegalStateException -> 0x00bb }
            r3.add(r5)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b8 }
            return
        L_0x00b8:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b8 }
            throw r2     // Catch:{ IllegalStateException -> 0x00bb }
        L_0x00bb:
            X.C25945CpD.A01(r6, r0, r9)     // Catch:{ all -> 0x00bf }
            goto L_0x00cf
        L_0x00bf:
            r2 = move-exception
            if (r1 != 0) goto L_0x00c8
            goto L_0x00c4
        L_0x00c3:
            r2 = move-exception
        L_0x00c4:
            r0 = -1
            r7.A02 = r0
        L_0x00c8:
            throw r2
        L_0x00c9:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c9 }
            throw r2
        L_0x00cc:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00cc }
            throw r2
        L_0x00cf:
            if (r1 != 0) goto L_0x00d5
            r1 = -1
            r7.A02 = r1
        L_0x00d5:
            boolean r1 = r8.A0J
            if (r1 != 0) goto L_0x00ed
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            boolean r0 = r8.A0P     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0182
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x0185
            boolean r0 = r8.A0O     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x0185
            goto L_0x0182
        L_0x00ed:
            r11 = 0
            X.9gT r5 = new X.9gT
            r12 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.A01
            monitor-enter(r0)
            r0.add(r5)     // Catch:{ all -> 0x00fc }
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            return
        L_0x00fc:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            throw r2
        L_0x00ff:
            boolean r0 = A00(r5, r8, r10)
            if (r0 == 0) goto L_0x0178
            boolean r0 = A01(r8, r9)
            if (r0 == 0) goto L_0x0178
            monitor-enter(r5)
            int r1 = r5.A00     // Catch:{ all -> 0x0175 }
            int r0 = r8.A03     // Catch:{ all -> 0x0175 }
            if (r1 >= r0) goto L_0x0131
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0175 }
            java.lang.Object r2 = r0.get(r9)     // Catch:{ all -> 0x0175 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0175 }
            if (r2 != 0) goto L_0x0125
            java.util.HashSet r2 = X.C17880vN.A12()     // Catch:{ all -> 0x0175 }
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0175 }
            r0.put(r9, r2)     // Catch:{ all -> 0x0175 }
        L_0x0125:
            boolean r0 = r2.contains(r6)     // Catch:{ all -> 0x0175 }
            if (r0 != 0) goto L_0x0148
            if (r24 == 0) goto L_0x0133
            boolean r0 = r8.A0L     // Catch:{ all -> 0x0175 }
            if (r0 != 0) goto L_0x0137
        L_0x0131:
            monitor-exit(r5)     // Catch:{ all -> 0x0175 }
            goto L_0x0178
        L_0x0133:
            boolean r0 = r8.A0K     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0131
        L_0x0137:
            int r1 = r2.size()     // Catch:{ all -> 0x0175 }
            int r0 = r8.A02     // Catch:{ all -> 0x0175 }
            if (r1 >= r0) goto L_0x0131
            r2.add(r6)     // Catch:{ all -> 0x0175 }
            int r0 = r5.A00     // Catch:{ all -> 0x0175 }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x0175 }
        L_0x0148:
            r1 = -1
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0154 }
            r5.A02 = r3     // Catch:{ IllegalStateException -> 0x0154 }
            r6.reset()     // Catch:{ IllegalStateException -> 0x0154 }
            goto L_0x016d
        L_0x0154:
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0171 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0171 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x016a
            boolean r0 = r0.remove(r6)     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x016a
            int r0 = r5.A00     // Catch:{ all -> 0x0171 }
            int r0 = r0 + -1
            r5.A00 = r0     // Catch:{ all -> 0x0171 }
        L_0x016a:
            r5.A02 = r1     // Catch:{ all -> 0x0175 }
            goto L_0x0131
        L_0x016d:
            r5.A02 = r1     // Catch:{ all -> 0x0175 }
            monitor-exit(r5)     // Catch:{ all -> 0x0175 }
            return
        L_0x0171:
            r0 = move-exception
            r5.A02 = r1     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0175 }
            throw r0
        L_0x0178:
            boolean r0 = r8.A0P     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0182
            if (r24 != 0) goto L_0x0185
            boolean r0 = r8.A0O     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x0185
        L_0x0182:
            r6.stop()     // Catch:{ all -> 0x0189 }
        L_0x0185:
            r6.release()
            return
        L_0x0189:
            r0 = move-exception
            r6.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26119Csh.A03(X.EAe, X.Cj6, java.lang.Integer, java.lang.String, boolean):void");
    }
}
