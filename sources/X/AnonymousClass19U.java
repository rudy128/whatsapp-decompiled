package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.19U  reason: invalid class name */
public class AnonymousClass19U implements AnonymousClass19T {
    public final AnonymousClass11P A00;
    public final AnonymousClass19I A01;
    public final AnonymousClass19A A02;
    public final AnonymousClass19R A03;
    public final AnonymousClass199 A04;
    public final AnonymousClass19O A05;
    public final AnonymousClass19N A06;
    public final AnonymousClass10I A07;
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue A09 = new ConcurrentLinkedQueue();
    public final ConcurrentNavigableMap A0A = new ConcurrentSkipListMap();
    public final CopyOnWriteArrayList A0B = new CopyOnWriteArrayList();
    public final AtomicInteger A0C = new AtomicInteger(0);
    public final AnonymousClass19H A0D;
    public final AnonymousClass19R A0E;
    public final C200710s A0F;
    public final AnonymousClass00H A0G;

    public static final boolean A02(AnonymousClass19A r1, String str, double d, int i) {
        C18070vi.A0d(r1, 0);
        C18070vi.A0d(str, 2);
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return true;
        }
        r1.Bd2(i, str, d);
        return false;
    }

    public static final boolean A03(AnonymousClass19A r6, String str, double[] dArr, int i) {
        C18070vi.A0d(r6, 0);
        C18070vi.A0d(str, 2);
        C18070vi.A0d(dArr, 3);
        for (double A022 : dArr) {
            if (true ^ A02(r6, str, A022, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C223419n A06(java.lang.Integer r25, int r26, long r27, boolean r29) {
        /*
            r24 = this;
            r5 = 0
            r3 = r24
            X.19I r0 = r3.A01
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0026
            X.19O r2 = r3.A05
            r4 = r26
            boolean r0 = r2.A01(r4)
            if (r0 == 0) goto L_0x0026
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0C
            r23 = r0
            int r1 = r23.get()
            r0 = 50
            if (r1 < r0) goto L_0x0027
            X.19A r0 = r3.A02
            r0.BjG(r4)
        L_0x0026:
            return r5
        L_0x0027:
            X.19I r2 = r2.A01
            X.19J r0 = X.AnonymousClass19I.A00(r2, r4)
            boolean r0 = r0.A03
            r22 = r0
            X.19J r0 = X.AnonymousClass19I.A00(r2, r4)
            long r0 = r0.A01
            r20 = r0
            X.19J r0 = X.AnonymousClass19I.A00(r2, r4)
            boolean r6 = r0.A02
            X.19R r5 = r3.A03
            X.19I r1 = r5.A00
            X.AnonymousClass19I.A01(r1)
            java.lang.Boolean r0 = r1.A03
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0124
            r0 = 916783105(0x36a50001, float:4.9173836E-6)
            if (r4 == r0) goto L_0x0124
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            X.19J r0 = X.AnonymousClass19I.A00(r1, r4)
            long r1 = r0.A00
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0124
            int[] r19 = X.AnonymousClass2W1.A00
            r13 = 2
            r12 = 0
        L_0x0072:
            r11 = r19[r12]
            r0 = 1
            int r0 = r11 - r0
            r9 = 1
            long r9 = r9 << r0
            long r15 = r1 & r9
            r9 = 0
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00f3
            X.19O r9 = r5.A01
            X.19I r0 = r9.A01
            X.AnonymousClass19I.A01(r0)
            java.lang.Long r0 = r0.A04
            long r17 = r0.longValue()
            r15 = 1
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00f3
            java.util.Random r0 = r9.A02
            long r9 = r0.nextLong()
            long r9 = r9 % r17
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x00f3
        L_0x00a7:
            X.19Q r15 = r5.A02
            java.util.concurrent.ConcurrentHashMap r10 = r15.A04
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r10.get(r9)
            if (r0 != 0) goto L_0x00f0
            monitor-enter(r10)
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x0115 }
            X.19d r0 = (X.C222419d) r0     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x00c0
            monitor-exit(r10)     // Catch:{ all -> 0x0115 }
            goto L_0x00f0
        L_0x00c0:
            r0 = 5
            if (r11 == r0) goto L_0x00cd
            r0 = 9
            if (r11 == r0) goto L_0x00dd
            X.37k r0 = new X.37k     // Catch:{ all -> 0x0115 }
            r0.<init>()     // Catch:{ all -> 0x0115 }
            goto L_0x00ec
        L_0x00cd:
            X.11C r11 = r15.A00     // Catch:{ all -> 0x0115 }
            X.00H r0 = r15.A03     // Catch:{ all -> 0x0115 }
            java.lang.Object r15 = r0.get()     // Catch:{ all -> 0x0115 }
            X.19e r15 = (X.C222519e) r15     // Catch:{ all -> 0x0115 }
            X.19f r0 = new X.19f     // Catch:{ all -> 0x0115 }
            r0.<init>(r11, r15)     // Catch:{ all -> 0x0115 }
            goto L_0x00ec
        L_0x00dd:
            X.11P r11 = r15.A01     // Catch:{ all -> 0x0115 }
            X.00H r0 = r15.A02     // Catch:{ all -> 0x0115 }
            java.lang.Object r15 = r0.get()     // Catch:{ all -> 0x0115 }
            X.19g r15 = (X.C222719g) r15     // Catch:{ all -> 0x0115 }
            X.19h r0 = new X.19h     // Catch:{ all -> 0x0115 }
            r0.<init>(r11, r15)     // Catch:{ all -> 0x0115 }
        L_0x00ec:
            r10.put(r9, r0)     // Catch:{ all -> 0x0115 }
            monitor-exit(r10)     // Catch:{ all -> 0x0115 }
        L_0x00f0:
            r14.add(r0)
        L_0x00f3:
            int r12 = r12 + 1
            if (r12 < r13) goto L_0x0072
            java.util.Iterator r2 = r14.iterator()
        L_0x00fb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.Object r1 = r2.next()
            X.19d r1 = (X.C222419d) r1
            boolean r0 = r1.BgH()
            if (r0 == 0) goto L_0x0111
            r7.add(r1)
            goto L_0x00fb
        L_0x0111:
            r8.add(r1)
            goto L_0x00fb
        L_0x0115:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0115 }
            throw r0
        L_0x0118:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x018c
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x018c
        L_0x0124:
            X.19m r2 = X.C223319m.A02
        L_0x0126:
            X.19A r0 = r3.A02
            X.19n r8 = new X.19n
            r12 = r25
            r16 = r27
            r19 = r29
            r9 = r0
            r10 = r2
            r11 = r5
            r13 = r4
            r14 = r20
            r18 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r18, r19)
            r23.incrementAndGet()
            r2 = 1
            X.AnonymousClass19R.A01(r5, r8, r2)
            if (r6 == 0) goto L_0x014d
            java.lang.String r1 = "is_overwritten_sampling_rate_by_experiment"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r8.A00(r2, r1, r0)
        L_0x014d:
            if (r25 != 0) goto L_0x0171
            java.util.concurrent.ConcurrentHashMap r1 = r3.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r1.put(r0, r8)
        L_0x0159:
            X.19n r4 = (X.C223419n) r4
            if (r4 == 0) goto L_0x0170
            r2 = 4
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            r4.A02(r0, r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.A09
            r0.add(r4)
            r23.decrementAndGet()
            r3.CSP()
        L_0x0170:
            return r8
        L_0x0171:
            java.util.concurrent.ConcurrentNavigableMap r2 = r3.A0A
            int r1 = r12.intValue()
            long r6 = (long) r4
            r0 = 32
            long r6 = r6 << r0
            long r4 = (long) r1
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            long r4 = r4 | r6
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r2.put(r0, r8)
            goto L_0x0159
        L_0x018c:
            X.19c[] r0 = X.C223319m.A03
            java.lang.Object[] r1 = r8.toArray(r0)
            X.19c[] r1 = (X.C222319c[]) r1
            java.lang.Object[] r0 = r7.toArray(r0)
            X.19c[] r0 = (X.C222319c[]) r0
            X.19m r2 = new X.19m
            r2.<init>(r1, r0)
            goto L_0x0126
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19U.A06(java.lang.Integer, int, long, boolean):X.19n");
    }

    public boolean BfT(int i) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 == null) {
            return false;
        }
        if (A042.A0A.get() == -1 || A042.A0B.get() == -1) {
            return true;
        }
        return false;
    }

    public void Bit(AnonymousClass1Bh r6, int i) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            AnonymousClass19R r3 = this.A0E;
            AnonymousClass19R.A00(r3, A042.A01);
            r3.A03.CGF(new C449525k(r3, r6, A042, 2));
        }
    }

    public void Bj2(int i, boolean z) {
        A06((Integer) null, i, SystemClock.elapsedRealtimeNanos(), z);
    }

    public void CKx(int i, String str) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A07.put("subType", str);
        }
    }

    public void endAllMarkers(short s, boolean z) {
        if (this.A01.A03()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            short s2 = s;
            boolean z2 = z;
            A01(this.A0A, elapsedRealtimeNanos, s2, z2);
            A01(this.A08, elapsedRealtimeNanos, s2, z2);
        }
    }

    public void markerDrop(int i) {
        A07(i, (Integer) null);
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        A08(A05((Integer) null, i, timeUnit.toNanos(j), s));
    }

    public void markerStart(int i) {
        A06((Integer) null, i, SystemClock.elapsedRealtimeNanos(), true);
    }

    private void A00(ConcurrentMap concurrentMap, long j) {
        C223419n r1;
        if (!concurrentMap.isEmpty()) {
            for (Map.Entry entry : concurrentMap.entrySet()) {
                C223419n r6 = (C223419n) entry.getValue();
                if (r6 != null) {
                    if (r6.A03 + TimeUnit.MILLISECONDS.toNanos(300000) < j && (r1 = (C223419n) concurrentMap.remove(entry.getKey())) != null) {
                        r1.A02(j, 113);
                        this.A09.add(r1);
                        this.A0C.decrementAndGet();
                    }
                }
            }
            CSP();
        }
    }

    public C223419n A04(Integer num, int i) {
        Object obj;
        if (num == null) {
            obj = this.A08.get(Integer.valueOf(i));
        } else {
            obj = this.A0A.get(Long.valueOf((((long) num.intValue()) & 4294967295L) | (((long) i) << 32)));
        }
        return (C223419n) obj;
    }

    public C223419n A05(Integer num, int i, long j, short s) {
        Object remove;
        if (num == null) {
            remove = this.A08.remove(Integer.valueOf(i));
        } else {
            remove = this.A0A.remove(Long.valueOf((((long) num.intValue()) & 4294967295L) | (((long) i) << 32)));
        }
        C223419n r1 = (C223419n) remove;
        if (r1 != null) {
            r1.A02(j, s);
            this.A0C.decrementAndGet();
        }
        return r1;
    }

    public void A07(int i, Integer num) {
        Object remove;
        if (num == null) {
            remove = this.A08.remove(Integer.valueOf(i));
        } else {
            remove = this.A0A.remove(Long.valueOf((((long) num.intValue()) & 4294967295L) | (((long) i) << 32)));
        }
        C223419n r2 = (C223419n) remove;
        this.A0C.decrementAndGet();
        if (r2 != null) {
            this.A03.A05.remove(Integer.valueOf(r2.A01));
        }
    }

    public void A08(C223419n r2) {
        if (r2 != null) {
            this.A09.add(r2);
            CSP();
        }
    }

    public void BK8() {
        if (this.A01.A03()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            A00(this.A08, elapsedRealtimeNanos);
            A00(this.A0A, elapsedRealtimeNanos);
        }
    }

    public Collection BMt() {
        HashSet hashSet = new HashSet(this.A08.keySet());
        for (Number longValue : this.A0A.keySet()) {
            hashSet.add(Integer.valueOf((int) (longValue.longValue() >> 32)));
        }
        return hashSet;
    }

    public boolean Bcc() {
        return !this.A09.isEmpty();
    }

    public boolean Biy() {
        AnonymousClass19O r3 = this.A05;
        AnonymousClass19I r1 = r3.A01;
        if (!r1.A03()) {
            return false;
        }
        if (AnonymousClass19I.A00(r1, 689639794).A03) {
            return AnonymousClass19O.A00(r3, 689639794);
        }
        return true;
    }

    public void Bj3(C30371dp r7) {
        HashMap hashMap;
        int i = r7.A03;
        C223419n A062 = A06(r7.A00, i, SystemClock.elapsedRealtimeNanos(), r7.A02);
        if (A062 != null && (hashMap = r7.A01) != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (str != null) {
                    A062.A00(1, str, value);
                }
            }
        }
    }

    public Long CBL() {
        C223419n r0 = (C223419n) this.A09.peek();
        if (r0 == null) {
            return null;
        }
        long j = r0.A0B.get();
        if (j != -1) {
            return Long.valueOf(j);
        }
        return null;
    }

    public Integer CBM() {
        C223419n r0 = (C223419n) this.A09.peek();
        if (r0 != null) {
            return Integer.valueOf(r0.A01);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0318, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0319, code lost:
        r6.A01.BhE(r5.A00, r0.getMessage());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String CBo() {
        /*
            r16 = this;
            r0 = r16
            X.19H r6 = r0.A0D
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.A09
            java.lang.Object r5 = r0.poll()
            X.19n r5 = (X.C223419n) r5
            r4 = 0
            if (r5 == 0) goto L_0x0324
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0318 }
            r7.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r0 = "marker_id"
            int r8 = r5.A00     // Catch:{ JSONException -> 0x0318 }
            r7.put(r0, r8)     // Catch:{ JSONException -> 0x0318 }
            java.util.concurrent.ConcurrentHashMap r3 = r5.A07     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r2 = "subType"
            java.lang.Object r0 = r3.get(r2)     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = "da_type"
            java.lang.Object r0 = r3.get(r2)     // Catch:{ JSONException -> 0x0318 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0318 }
        L_0x002f:
            java.lang.Integer r1 = r5.A05     // Catch:{ JSONException -> 0x0318 }
            if (r1 == 0) goto L_0x0038
            java.lang.String r0 = "instance_id"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x0318 }
        L_0x0038:
            java.lang.String r1 = "action_id"
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0A     // Catch:{ JSONException -> 0x0318 }
            int r0 = r0.get()     // Catch:{ JSONException -> 0x0318 }
            short r0 = (short) r0     // Catch:{ JSONException -> 0x0318 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r1 = "method"
            boolean r0 = r5.A0D     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "per_user"
        L_0x004c:
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r2 = "sample_rate"
            long r0 = r5.A02     // Catch:{ JSONException -> 0x0318 }
            r7.put(r2, r0)     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r9 = "duration_ns"
            java.util.concurrent.atomic.AtomicLong r0 = r5.A0B     // Catch:{ JSONException -> 0x0318 }
            long r0 = r0.get()     // Catch:{ JSONException -> 0x0318 }
            long r2 = r5.A03     // Catch:{ JSONException -> 0x0318 }
            long r0 = r0 - r2
            r7.put(r9, r0)     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r10 = "wa_ab_key2"
            X.19G r0 = r6.A00     // Catch:{ JSONException -> 0x0318 }
            X.19F r9 = r0.A03     // Catch:{ JSONException -> 0x0318 }
            monitor-enter(r9)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x0070
        L_0x006d:
            java.lang.String r0 = "random_sampling"
            goto L_0x004c
        L_0x0070:
            android.content.SharedPreferences r1 = r9.A00     // Catch:{ all -> 0x0315 }
            java.lang.String r0 = "ab_props:sys:config_key"
            java.lang.String r0 = r1.getString(r0, r4)     // Catch:{ all -> 0x0315 }
            monitor-exit(r9)     // Catch:{ JSONException -> 0x0318 }
            r7.put(r10, r0)     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r1 = "wa_ab_expo_key"
            java.lang.String r0 = r9.A03()     // Catch:{ JSONException -> 0x0318 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0318 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0318 }
            r9.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.util.concurrent.ConcurrentHashMap r0 = r5.A09     // Catch:{ JSONException -> 0x0318 }
            java.util.Collection r0 = r0.values()     // Catch:{ JSONException -> 0x0318 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x0318 }
        L_0x0095:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x0095
            r9.add(r0)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x0095
        L_0x00a5:
            java.util.Collections.sort(r9)     // Catch:{ JSONException -> 0x0318 }
            boolean r0 = r9.isEmpty()     // Catch:{ JSONException -> 0x0318 }
            if (r0 != 0) goto L_0x00ea
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0318 }
            r10.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.util.Iterator r13 = r9.iterator()     // Catch:{ JSONException -> 0x0318 }
        L_0x00b7:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r12 = r13.next()     // Catch:{ JSONException -> 0x0318 }
            X.19q r12 = (X.C223719q) r12     // Catch:{ JSONException -> 0x0318 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0318 }
            r11.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r1 = "name"
            java.lang.String r0 = r12.A02     // Catch:{ JSONException -> 0x0318 }
            r11.put(r1, r0)     // Catch:{ JSONException -> 0x0318 }
            long r0 = r12.A00     // Catch:{ JSONException -> 0x0318 }
            long r0 = r0 - r2
            java.lang.String r9 = "time_since_start_ns"
            r11.put(r9, r0)     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r1 = r12.A01     // Catch:{ JSONException -> 0x0318 }
            if (r1 == 0) goto L_0x00e1
            java.lang.String r0 = "data"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0318 }
        L_0x00e1:
            r10.put(r11)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x00b7
        L_0x00e5:
            java.lang.String r0 = "points"
            r7.put(r0, r10)     // Catch:{ JSONException -> 0x0318 }
        L_0x00ea:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ JSONException -> 0x0318 }
            r10.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.util.concurrent.ConcurrentHashMap r3 = r5.A06     // Catch:{ JSONException -> 0x0318 }
            java.util.Set r0 = r3.keySet()     // Catch:{ JSONException -> 0x0318 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ JSONException -> 0x0318 }
        L_0x00f9:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x010d
            java.lang.Object r1 = r2.next()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r3.get(r1)     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x00f9
            r10.put(r1, r0)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x00f9
        L_0x010d:
            boolean r0 = r10.isEmpty()     // Catch:{ JSONException -> 0x0318 }
            if (r0 != 0) goto L_0x0219
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ JSONException -> 0x0318 }
            r9.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.util.Set r0 = r10.entrySet()     // Catch:{ JSONException -> 0x0318 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ JSONException -> 0x0318 }
        L_0x0120:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x0148
            java.lang.Object r2 = r3.next()     // Catch:{ JSONException -> 0x0318 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Class r1 = r0.getClass()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ JSONException -> 0x0318 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ JSONException -> 0x0318 }
            if (r0 != 0) goto L_0x0144
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0318 }
            r0.<init>()     // Catch:{ JSONException -> 0x0318 }
            r9.put(r1, r0)     // Catch:{ JSONException -> 0x0318 }
        L_0x0144:
            r0.add(r2)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x0120
        L_0x0148:
            java.util.Set r0 = r9.entrySet()     // Catch:{ JSONException -> 0x0318 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ JSONException -> 0x0318 }
        L_0x0150:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x0219
            java.lang.Object r1 = r12.next()     // Catch:{ JSONException -> 0x0318 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 != r0) goto L_0x01c9
            java.lang.String r10 = "annotations"
        L_0x0166:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0318 }
            r9.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ JSONException -> 0x0318 }
            boolean r2 = r0.isArray()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ JSONException -> 0x0318 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ JSONException -> 0x0318 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ JSONException -> 0x0318 }
            if (r2 == 0) goto L_0x01a5
        L_0x0181:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r3 = r11.next()     // Catch:{ JSONException -> 0x0318 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ JSONException -> 0x0318 }
            org.json.JSONArray r2 = X.AnonymousClass19H.A00(r2, r0)     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0318 }
            r9.put(r0, r2)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x0181
        L_0x01a5:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r0 = r11.next()     // Catch:{ JSONException -> 0x0318 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r3 = r0.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ JSONException -> 0x0318 }
            X.AnonymousClass19H.A01(r0, r2, r3, r9)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x01a5
        L_0x01c5:
            r7.put(r10, r9)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x0150
        L_0x01c9:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r2 != r0) goto L_0x01d0
            java.lang.String r10 = "annotations_double"
            goto L_0x0166
        L_0x01d0:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r2 != r0) goto L_0x01d7
            java.lang.String r10 = "annotations_bool"
            goto L_0x0166
        L_0x01d7:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r2 == r0) goto L_0x01fe
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r2 == r0) goto L_0x01fe
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            if (r2 != r0) goto L_0x01e6
            java.lang.String r10 = "annotations_string_array"
            goto L_0x0166
        L_0x01e6:
            java.lang.Class<double[]> r0 = double[].class
            if (r2 != r0) goto L_0x01ee
            java.lang.String r10 = "annotations_double_array"
            goto L_0x0166
        L_0x01ee:
            java.lang.Class<boolean[]> r0 = boolean[].class
            if (r2 != r0) goto L_0x01f6
            java.lang.String r10 = "annotations_bool_array"
            goto L_0x0166
        L_0x01f6:
            java.lang.Class<long[]> r0 = long[].class
            if (r2 != r0) goto L_0x0202
            java.lang.String r10 = "annotations_int_array"
            goto L_0x0166
        L_0x01fe:
            java.lang.String r10 = "annotations_int"
            goto L_0x0166
        L_0x0202:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0318 }
            r1.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r0 = "Unknown class: "
            r1.append(r0)     // Catch:{ JSONException -> 0x0318 }
            r1.append(r2)     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0318 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0318 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0318 }
            throw r0     // Catch:{ JSONException -> 0x0318 }
        L_0x0219:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ JSONException -> 0x0318 }
            r10.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.util.concurrent.ConcurrentHashMap r11 = r5.A08     // Catch:{ JSONException -> 0x0318 }
            java.util.Set r0 = r11.keySet()     // Catch:{ JSONException -> 0x0318 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ JSONException -> 0x0318 }
        L_0x0228:
            boolean r0 = r9.hasNext()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x0252
            java.lang.Object r0 = r9.next()     // Catch:{ JSONException -> 0x0318 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r3 = r11.get(r0)     // Catch:{ JSONException -> 0x0318 }
            if (r3 == 0) goto L_0x0228
            java.lang.Object r2 = r0.first     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r1 = r0.second     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r10.get(r2)     // Catch:{ JSONException -> 0x0318 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ JSONException -> 0x0318 }
            if (r0 != 0) goto L_0x024e
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ JSONException -> 0x0318 }
            r0.<init>()     // Catch:{ JSONException -> 0x0318 }
            r10.put(r2, r0)     // Catch:{ JSONException -> 0x0318 }
        L_0x024e:
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x0228
        L_0x0252:
            boolean r0 = r10.isEmpty()     // Catch:{ JSONException -> 0x0318 }
            if (r0 != 0) goto L_0x0310
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0318 }
            r2.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.util.Set r0 = r10.entrySet()     // Catch:{ JSONException -> 0x0318 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ JSONException -> 0x0318 }
        L_0x0265:
            boolean r0 = r15.hasNext()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x030b
            java.lang.Object r9 = r15.next()     // Catch:{ JSONException -> 0x0318 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r9.getValue()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x0265
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0318 }
            r3.<init>()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r9.getValue()     // Catch:{ JSONException -> 0x0318 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ JSONException -> 0x0318 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ JSONException -> 0x0318 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ JSONException -> 0x0318 }
        L_0x028a:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x0300
            java.lang.Object r11 = r14.next()     // Catch:{ JSONException -> 0x0318 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r11.getValue()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x028a
            java.lang.Object r0 = r11.getValue()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Class r10 = r0.getClass()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r10 != r0) goto L_0x02c1
            X.19A r13 = r6.A01     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r11.getValue()     // Catch:{ JSONException -> 0x0318 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ JSONException -> 0x0318 }
            double r0 = r0.doubleValue()     // Catch:{ JSONException -> 0x0318 }
            boolean r0 = A02(r13, r12, r0, r8)     // Catch:{ JSONException -> 0x0318 }
            if (r0 != 0) goto L_0x02c1
            goto L_0x028a
        L_0x02c1:
            java.lang.Class<double[]> r0 = double[].class
            if (r10 != r0) goto L_0x02da
            X.19A r12 = r6.A01     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r1 = r11.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r11.getValue()     // Catch:{ JSONException -> 0x0318 }
            double[] r0 = (double[]) r0     // Catch:{ JSONException -> 0x0318 }
            boolean r0 = A03(r12, r1, r0, r8)     // Catch:{ JSONException -> 0x0318 }
            if (r0 != 0) goto L_0x02da
            goto L_0x028a
        L_0x02da:
            boolean r0 = r10.isArray()     // Catch:{ JSONException -> 0x0318 }
            if (r0 == 0) goto L_0x02f2
            java.lang.Object r0 = r11.getValue()     // Catch:{ JSONException -> 0x0318 }
            org.json.JSONArray r1 = X.AnonymousClass19H.A00(r10, r0)     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r11.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0318 }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x028a
        L_0x02f2:
            java.lang.Object r1 = r11.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0318 }
            java.lang.Object r0 = r11.getValue()     // Catch:{ JSONException -> 0x0318 }
            X.AnonymousClass19H.A01(r10, r0, r1, r3)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x028a
        L_0x0300:
            java.lang.Object r0 = r9.getKey()     // Catch:{ JSONException -> 0x0318 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0318 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x0265
        L_0x030b:
            java.lang.String r0 = "metadata"
            r7.put(r0, r2)     // Catch:{ JSONException -> 0x0318 }
        L_0x0310:
            java.lang.String r4 = r7.toString()     // Catch:{ JSONException -> 0x0318 }
            return r4
        L_0x0315:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ JSONException -> 0x0318 }
            throw r0     // Catch:{ JSONException -> 0x0318 }
        L_0x0318:
            r0 = move-exception
            X.19A r2 = r6.A01
            int r1 = r5.A00
            java.lang.String r0 = r0.getMessage()
            r2.BhE(r1, r0)
        L_0x0324:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19U.CBo():java.lang.String");
    }

    public void CGw() {
        this.A07.CGF(new AnonymousClass7RB((Object) this, 45));
    }

    public void CSP() {
        C200710s r1 = this.A0F;
        r1.A03();
        r1.execute((Runnable) this.A0G.get());
    }

    public void endAllInstancesOfMarker(int i, short s) {
        C223419n r3;
        if (this.A01.A03()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            ConcurrentHashMap concurrentHashMap = this.A08;
            Integer valueOf = Integer.valueOf(i);
            if (!(concurrentHashMap.get(valueOf) == null || (r3 = (C223419n) concurrentHashMap.remove(valueOf)) == null)) {
                r3.A02(elapsedRealtimeNanos, s);
                this.A09.add(r3);
                this.A0C.decrementAndGet();
            }
            ArrayList arrayList = new ArrayList();
            long j = 0 | (((long) i) << 32);
            ConcurrentNavigableMap concurrentNavigableMap = this.A0A;
            for (Map.Entry entry : concurrentNavigableMap.subMap(Long.valueOf(j), Long.valueOf(j + (0 | (1 << 32)))).entrySet()) {
                if (entry.getValue() != null) {
                    arrayList.add(entry.getKey());
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C223419n r32 = (C223419n) concurrentNavigableMap.remove(arrayList.get(i2));
                if (r32 != null) {
                    r32.A02(elapsedRealtimeNanos, s);
                    this.A09.add(r32);
                    this.A0C.decrementAndGet();
                }
            }
            CSP();
        }
    }

    public AnonymousClass19U(AnonymousClass11P r3, AnonymousClass19I r4, AnonymousClass19A r5, AnonymousClass19H r6, AnonymousClass19R r7, AnonymousClass199 r8, AnonymousClass19O r9, AnonymousClass19N r10, AnonymousClass10I r11, AnonymousClass00H r12) {
        this.A00 = r3;
        this.A07 = r11;
        this.A04 = r8;
        this.A02 = r5;
        this.A01 = r4;
        this.A06 = r10;
        this.A05 = r9;
        this.A03 = r7;
        this.A0G = r12;
        this.A0D = r6;
        this.A0E = r7;
        this.A0F = new C200710s(r11, false);
    }

    private void A01(ConcurrentMap concurrentMap, long j, short s, boolean z) {
        C223419n r1;
        if (!concurrentMap.isEmpty()) {
            Iterator it = new HashSet(concurrentMap.keySet()).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C223419n r0 = (C223419n) concurrentMap.get(next);
                if (r0 != null && ((!z || r0.A0C) && (r1 = (C223419n) concurrentMap.remove(next)) != null)) {
                    r1.A02(j, s);
                    this.A09.add(r1);
                    this.A0C.decrementAndGet();
                }
            }
            CSP();
        }
    }

    public void Biv(int i, int i2, short s, String str) {
        C223419n A052 = A05(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), s);
        if (A052 != null) {
            if (!A052.A05(str)) {
                this.A02.CBn(i, str);
            }
            A08(A052);
        }
    }

    public void Biw(String str, short s) {
        C223419n A052 = A05((Integer) null, 1029386189, SystemClock.elapsedRealtimeNanos(), s);
        if (A052 != null) {
            if (!A052.A05(str)) {
                this.A02.CBn(1029386189, str);
            }
            A08(A052);
        }
    }

    public void Bj1(int i, int i2, boolean z) {
        A06(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), z);
    }

    public void Bj4(String str, String str2, int i, int i2, boolean z) {
        C223419n A062 = A06(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), z);
        if (A062 != null) {
            A062.A00(str2.length(), str, str2);
        }
    }

    public void CKw(int i, int i2, String str) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A07.put("subType", str);
        }
    }

    public long currentMonotonicTimestampNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public boolean isMarkerOn(int i, int i2) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 == null) {
            return false;
        }
        if (A042.A0A.get() == -1 || A042.A0B.get() == -1) {
            return true;
        }
        return false;
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A01(SystemClock.elapsedRealtimeNanos(), str, str2);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        A06(Integer.valueOf(i2), i, timeUnit.toNanos(j), z);
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        C223419n A042;
        if (A02(this.A02, str, d, i) && (A042 = A04(Integer.valueOf(i2), i)) != null) {
            A042.A00(1, str, Double.valueOf(d));
        }
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(1, str, Long.valueOf((long) i3));
        }
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(1, str, Long.valueOf(j));
        }
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(str2.length(), str, str2);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(1, str, Boolean.valueOf(z));
        }
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        C223419n A042;
        if (A03(this.A02, str, dArr, i) && (A042 = A04(Integer.valueOf(i2), i)) != null) {
            A042.A00(dArr.length, str, dArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            int length = iArr.length;
            long[] jArr = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                jArr[i3] = (long) iArr[i3];
            }
            A042.A00(length, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(jArr.length, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            int i3 = 0;
            for (String str2 : strArr) {
                if (str2 == null) {
                    i3++;
                } else {
                    i3 += str2.length();
                }
            }
            A042.A00(i3, str, strArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A00(zArr.length, str, zArr);
        }
    }

    public void markerAnnotate(int i, String str, double d) {
        C223419n A042;
        if (A02(this.A02, str, d, i) && (A042 = A04((Integer) null, i)) != null) {
            A042.A00(1, str, Double.valueOf(d));
        }
    }

    public void markerAnnotate(int i, String str, int i2) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(1, str, Long.valueOf((long) i2));
        }
    }

    public void markerAnnotate(int i, String str, long j) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(1, str, Long.valueOf(j));
        }
    }

    public void markerAnnotate(int i, String str, String str2) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(str2.length(), str, str2);
        }
    }

    public void markerAnnotate(int i, String str, boolean z) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(1, str, Boolean.valueOf(z));
        }
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        C223419n A042;
        if (A03(this.A02, str, dArr, i) && (A042 = A04((Integer) null, i)) != null) {
            A042.A00(dArr.length, str, dArr);
        }
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            int length = iArr.length;
            long[] jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            A042.A00(length, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(jArr.length, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            int i2 = 0;
            for (String str2 : strArr) {
                if (str2 == null) {
                    i2++;
                } else {
                    i2 += str2.length();
                }
            }
            A042.A00(i2, str, strArr);
        }
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A00(zArr.length, str, zArr);
        }
    }

    public void markerDrop(int i, int i2) {
        A07(i, Integer.valueOf(i2));
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        A08(A05(Integer.valueOf(i2), i, timeUnit.toNanos(j), s));
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A01(timeUnit.toNanos(j), str, (String) null);
        }
    }

    public void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        C223419n A062 = A06((Integer) null, i, timeUnit.toNanos(j), true);
        if (A062 != null) {
            A062.A00(str2.length(), str, str2);
        }
    }

    public void markerEnd(int i, int i2, short s) {
        A08(A05(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), s));
    }

    public void markerPoint(int i, int i2, String str) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A01(SystemClock.elapsedRealtimeNanos(), str, (String) null);
        }
    }

    public void markerStart(int i, String str, String str2) {
        C223419n A062 = A06((Integer) null, i, SystemClock.elapsedRealtimeNanos(), true);
        if (A062 != null) {
            A062.A00(str2.length(), str, str2);
        }
    }

    public void markerEnd(int i, short s) {
        A08(A05((Integer) null, i, SystemClock.elapsedRealtimeNanos(), s));
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A01(timeUnit.toNanos(j), str, (String) null);
        }
    }

    public void markerStart(int i, int i2, String str, String str2) {
        C223419n A062 = A06(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), true);
        if (A062 != null) {
            A062.A00(str2.length(), str, str2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        C223419n A042 = A04(Integer.valueOf(i2), i);
        if (A042 != null) {
            A042.A01(timeUnit.toNanos(j), str, str2);
        }
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        C223419n A062 = A06(Integer.valueOf(i2), i, timeUnit.toNanos(j), true);
        if (A062 != null) {
            A062.A00(str2.length(), str, str2);
        }
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A01(timeUnit.toNanos(j), str, str2);
        }
    }

    public void markerStart(int i, int i2) {
        A06(Integer.valueOf(i2), i, SystemClock.elapsedRealtimeNanos(), true);
    }

    public void markerPoint(int i, String str, String str2) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A01(SystemClock.elapsedRealtimeNanos(), str, str2);
        }
    }

    public void markerPoint(int i, String str) {
        C223419n A042 = A04((Integer) null, i);
        if (A042 != null) {
            A042.A01(SystemClock.elapsedRealtimeNanos(), str, (String) null);
        }
    }
}
