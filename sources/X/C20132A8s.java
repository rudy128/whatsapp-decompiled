package X;

import android.os.SystemClock;
import com.facebook.quicklog.EventBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.A8s  reason: case insensitive filesystem */
public final class C20132A8s {
    public long A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final C695137m A04;
    public final String A05;
    public final ConcurrentHashMap A06 = AnonymousClass8BR.A17();
    public final ConcurrentHashMap A07 = AnonymousClass8BR.A17();
    public final ConcurrentLinkedQueue A08 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A09 = new ConcurrentLinkedQueue();
    public final AtomicInteger A0A = new AtomicInteger(0);
    public final AtomicLong A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass9Z7 A0D;
    public final AtomicBoolean A0E;
    public volatile String A0F;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20132A8s(X.AnonymousClass11P r14, X.C695137m r15, X.AnonymousClass9Z7 r16, java.lang.String r17, int r18, int r19, long r20, long r22) {
        /*
            r13 = this;
            r2 = 0
            r0 = r16
            boolean r8 = X.C108975cc.A1K(r0)
            r13.<init>()
            r13.A04 = r15
            r13.A0C = r14
            r13.A0D = r0
            r0 = r18
            r13.A02 = r0
            r0 = r19
            r13.A01 = r0
            r0 = r20
            r13.A03 = r0
            r4 = r17
            r13.A05 = r4
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass8BR.A17()
            r13.A07 = r0
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass8BR.A17()
            r13.A06 = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r13.A08 = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r13.A09 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r2)
            r13.A0A = r0
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>(r2)
            r13.A0E = r3
            r0 = 0
            java.util.concurrent.atomic.AtomicLong r5 = new java.util.concurrent.atomic.AtomicLong
            r5.<init>(r0)
            r13.A0B = r5
            r10 = r22
            r13.A00 = r10
            int r7 = r13.A02
            int r9 = r13.A01
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.NANOSECONDS
            if (r17 == 0) goto L_0x00b5
            X.A7i r6 = r15.A06
            X.C20104A7i.A02(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r6.A03
            if (r0 == 0) goto L_0x006e
            java.lang.Object r5 = r0.get(r4)
            X.9s7 r5 = (X.C194679s7) r5
            if (r5 != 0) goto L_0x007e
        L_0x006e:
            r1 = 812974081(0x30750001, float:8.9130486E-10)
            r0 = -1
            X.9s7 r5 = new X.9s7
            r5.<init>(r4, r0, r1)
            java.util.concurrent.ConcurrentHashMap r0 = r6.A03
            if (r0 == 0) goto L_0x007e
            r0.put(r4, r5)
        L_0x007e:
            int r1 = r5.A00
        L_0x0080:
            if (r1 == r8) goto L_0x00b2
            r0 = 2
            if (r1 != r0) goto L_0x008a
            X.19T r6 = r15.A02
        L_0x0087:
            r6.markerStartWithCancelPolicy(r7, r8, r9, r10, r12)
        L_0x008a:
            if (r17 == 0) goto L_0x0095
            int r5 = r13.A02
            int r1 = r13.A01
            java.lang.String r0 = "app_id"
            r15.markerAnnotate((int) r5, (int) r1, (java.lang.String) r0, (java.lang.String) r4)
        L_0x0095:
            int r5 = r13.A02
            int r0 = r13.A01
            X.19A r4 = r15.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.2A6 r1 = new X.2A6
            r1.<init>(r4, r15, r0, r5)
            java.lang.String r0 = "ttrc_tracking_version"
            r1.annotate((java.lang.String) r0, (int) r8)
            java.lang.String r0 = "ttrc_back_start_on_touch_up"
            r1.annotate((java.lang.String) r0, (boolean) r2)
            r3.set(r2)
            return
        L_0x00b2:
            X.19T r6 = r15.A03
            goto L_0x0087
        L_0x00b5:
            X.A7i r0 = r15.A06
            X.9fy r0 = X.C20104A7i.A00(r0, r7)
            int r1 = r0.A00
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20132A8s.<init>(X.11P, X.37m, X.9Z7, java.lang.String, int, int, long, long):void");
    }

    public static final void A04(C20132A8s a8s, String str) {
        a8s.A05(3, str);
        if (a8s.A07()) {
            a8s.A08(AnonymousClass9IJ.MARKER_FAILED);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("marker_id:");
        int i = a8s.A02;
        A10.append(i);
        String A1H = AnonymousClass001.A1H(",error:", str, A10);
        StringBuilder A0n = AnonymousClass8BW.A0n(i, "marker_id:");
        A0n.append(",instance_key:");
        A0n.append(a8s.A01);
        String A1H2 = AnonymousClass001.A1H(",error:", str, A0n);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("TTRCTrace|");
        String A0y = AnonymousClass000.A0y(a8s.A05, A102);
        C695137m r2 = a8s.A04;
        StringBuilder A11 = AnonymousClass000.A11(A0y);
        A11.append(" : ");
        C17890vO.A10(A1H, " : ", A1H2, A11);
        String obj = A11.toString();
        C18070vi.A0d(obj, 0);
        r2.A00.CFO(obj);
    }

    public void A0A(long j, String str) {
        String str2 = str;
        if (str != null) {
            this.A04.markerPoint(this.A02, this.A01, str2, (String) null, TimeUnit.MILLISECONDS.toNanos(j), TimeUnit.NANOSECONDS);
        }
    }

    public void A0I(String str, long j) {
        String str2 = str;
        if (str != null && !"surface_core_created_at".equals(str)) {
            this.A04.markerPoint(this.A02, this.A01, str2, (String) null, TimeUnit.MILLISECONDS.toNanos(j), TimeUnit.NANOSECONDS);
        }
    }

    private final void A01() {
        Iterator A0j = C17890vO.A0j(this.A07);
        while (A0j.hasNext()) {
            A2D a2d = (A2D) A0j.next();
            if (a2d.A00() != AnonymousClass9IC.QUERY_SUCCESSFULLY_COMPLETED && a2d.A00() != AnonymousClass9IC.QUERY_NOT_NEEDED) {
                return;
            }
        }
        if (A06()) {
            A00();
            A02();
        }
    }

    private final void A02() {
        String str = this.A0F;
        if (str == null) {
            this.A04.markerEnd(this.A02, this.A01, 2);
        } else {
            C695137m r0 = this.A04;
            r0.A03.Biv(this.A02, this.A01, 2, str);
        }
        A08(AnonymousClass9IJ.SUCCESSFULLY_FINISHED);
    }

    private final void A03(long j) {
        AtomicBoolean atomicBoolean = this.A0E;
        if (!atomicBoolean.get() && A06()) {
            Object obj = AnonymousClass9IJ.A00.get(this.A0A.get());
            int i = 0;
            AnonymousClass9IJ[] r4 = {AnonymousClass9IJ.ZERO_QUERIES_AND_ZERO_STEPS, AnonymousClass9IJ.PROCESSING_QUERIES_AND_STEPS};
            while (obj != r4[i]) {
                i++;
                if (i >= 2) {
                    return;
                }
            }
            if (!atomicBoolean.getAndSet(true)) {
                Iterator A0j = C17890vO.A0j(this.A07);
                while (A0j.hasNext()) {
                    AnonymousClass9IC A002 = ((A2D) A0j.next()).A00();
                    if (A002 != AnonymousClass9IC.QUERY_SUCCESSFULLY_COMPLETED && A002 != AnonymousClass9IC.QUERY_NOT_NEEDED && A002 != AnonymousClass9IC.CACHE_DONE_NETWORK_PENDING) {
                        return;
                    }
                }
                A0A(TimeUnit.NANOSECONDS.toMillis(j), "time_to_initial_content");
            }
        }
    }

    private final void A05(short s, String str) {
        if (!(str == null || str.length() == 0)) {
            C695137m r4 = this.A04;
            AnonymousClass2A6 r1 = new AnonymousClass2A6(r4.A00, r4, Integer.valueOf(this.A01), this.A02);
            r1.annotate("end_reason", str);
            r1.markerEditingCompleted();
        }
        this.A04.markerEnd(this.A02, this.A01, s);
    }

    private final boolean A06() {
        Iterator A0j = C17890vO.A0j(this.A06);
        while (A0j.hasNext()) {
            AtomicInteger atomicInteger = ((C185229cF) A0j.next()).A00;
            int i = atomicInteger.get();
            C19810z2 r2 = C179369Hr.A00;
            if (r2.get(i) != C179369Hr.DONE && r2.get(atomicInteger.get()) != C179369Hr.REVOKED) {
                return false;
            }
        }
        return true;
    }

    private final boolean A07() {
        Object obj = AnonymousClass9IJ.A00.get(this.A0A.get());
        AnonymousClass9IJ[] r3 = {AnonymousClass9IJ.ZERO_QUERIES_AND_ZERO_STEPS, AnonymousClass9IJ.REGISTERING_QUERIES_AND_STEPS, AnonymousClass9IJ.PROCESSING_QUERIES_AND_STEPS};
        int i = 0;
        while (obj != r3[i]) {
            i++;
            if (i >= 3) {
                return false;
            }
        }
        return true;
    }

    private final boolean A09(AnonymousClass9IJ r5) {
        if (AnonymousClass9IJ.A00.get(this.A0A.get()) == new AnonymousClass9IJ[]{r5}[0] || A08(r5)) {
            return true;
        }
        return false;
    }

    public void A0B(long j, String str, boolean z, long j2) {
        AnonymousClass9IC r2;
        if (A09(AnonymousClass9IJ.PROCESSING_QUERIES_AND_STEPS)) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
            A2D a2d = (A2D) this.A07.get(str);
            if (a2d != null) {
                if (z) {
                    r2 = AnonymousClass9IC.QUERY_SUCCESSFULLY_COMPLETED;
                } else {
                    r2 = AnonymousClass9IC.CACHE_DONE_NETWORK_PENDING;
                }
                boolean z2 = false;
                if (a2d.A02(r2)) {
                    a2d.A02 = true;
                    long j3 = j;
                    if (j > a2d.A03) {
                        z2 = true;
                    }
                    a2d.A00 = z2;
                    C20132A8s a8s = a2d.A06;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("cache_was_recent_for_");
                    String str2 = a2d.A04;
                    a8s.A0L(AnonymousClass000.A0y(str2, A10), !z2);
                    String A1H = AnonymousClass001.A1H("cache_age_ms_for_", str2, AnonymousClass000.A10());
                    if (A1H != null) {
                        a8s.A04.markerAnnotate(a8s.A02, a8s.A01, A1H, j3);
                    }
                    a8s.A0F = AnonymousClass001.A1H("ttcc_for_", str2, AnonymousClass000.A10());
                    a8s.A0B.set(nanos);
                    a8s.A0A(TimeUnit.NANOSECONDS.toMillis(nanos), a8s.A0F);
                    A03(nanos);
                    if (z) {
                        a2d.A01();
                        A01();
                    }
                }
            }
        }
    }

    public void A0C(String str) {
        if (A09(AnonymousClass9IJ.REGISTERING_QUERIES_AND_STEPS)) {
            if (this.A06.putIfAbsent(str, new C185229cF(this)) != null) {
                A04(this, AnonymousClass001.A1H("Attempted to Add Additional Step Twice for: ", str, AnonymousClass000.A10()));
            }
        }
    }

    public void A0F(String str) {
        if (str != null) {
            C695137m r0 = this.A04;
            r0.A03.markerPoint(this.A02, this.A01, str);
        }
    }

    public void A0J(String str, String str2) {
        if (str != null && str2 != null) {
            this.A04.markerAnnotate(this.A02, this.A01, str, str2);
        }
    }

    public void A0K(String str, TimeUnit timeUnit, long j) {
        A2D a2d;
        if (A09(AnonymousClass9IJ.REGISTERING_QUERIES_AND_STEPS)) {
            if (j == -1) {
                a2d = new A2D(this, str);
            } else {
                a2d = new A2D(this, str, timeUnit.toMillis(j));
            }
            if (this.A07.putIfAbsent(str, a2d) != null) {
                A04(this, AnonymousClass001.A1H("Attempted to Add Query Twice for: ", str, AnonymousClass000.A10()));
            }
        }
    }

    public void A0L(String str, boolean z) {
        if (str != null) {
            this.A04.markerAnnotate(this.A02, this.A01, str, z);
        }
    }

    public void A0M(String str, String[] strArr) {
        if (strArr != null) {
            this.A04.markerAnnotate(this.A02, this.A01, str, strArr);
        }
    }

    private final void A00() {
        String obj;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        ConcurrentHashMap concurrentHashMap = this.A07;
        Iterator A0j = C17890vO.A0j(concurrentHashMap);
        while (A0j.hasNext()) {
            A2D a2d = (A2D) A0j.next();
            if (a2d.A00() == AnonymousClass9IC.QUERY_NOT_NEEDED) {
                A13.add(a2d.A04);
            }
        }
        Iterator A0i = C17890vO.A0i(this.A06);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            Object key = A16.getKey();
            C18070vi.A0X(key);
            Object value = A16.getValue();
            C18070vi.A0X(value);
            if (C179369Hr.A00.get(((C185229cF) value).A00.get()) == C179369Hr.REVOKED) {
                A132.add(key);
            }
        }
        if (C17880vN.A1X(A13)) {
            A0M("revoked_queries", C17890vO.A1b(A13, 0));
        }
        if (C17880vN.A1X(A132)) {
            A0M("revoked_steps", C17890vO.A1b(A132, 0));
        }
        ArrayList A133 = AnonymousClass000.A13();
        ArrayList A134 = AnonymousClass000.A13();
        Iterator A0j2 = C17890vO.A0j(concurrentHashMap);
        while (A0j2.hasNext()) {
            A2D a2d2 = (A2D) A0j2.next();
            if (a2d2.A00() == AnonymousClass9IC.QUERY_SUCCESSFULLY_COMPLETED) {
                if (!a2d2.A02 || a2d2.A01) {
                    A134.add(a2d2.A04);
                } else {
                    A133.add(a2d2.A04);
                }
            }
        }
        if (C17880vN.A1X(A133) || C17880vN.A1X(A134)) {
            if (A134.isEmpty()) {
                obj = "CACHE";
            } else if (A133.isEmpty()) {
                obj = "NETWORK";
            } else {
                C29391cC.A0G(A133);
                C29391cC.A0G(A134);
                StringBuilder A10 = AnonymousClass000.A10();
                Iterator it = A133.iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    if (A10.length() > 0) {
                        A10.append(", ");
                    }
                    A10.append(A0v);
                    A10.append("_C");
                }
                Iterator it2 = A134.iterator();
                while (it2.hasNext()) {
                    String A0v2 = C17880vN.A0v(it2);
                    A10.append(", ");
                    A10.append(A0v2);
                    A10.append("_N");
                }
                obj = A10.toString();
            }
            A0J("ttrc_source", obj);
        }
        ArrayList A135 = AnonymousClass000.A13();
        Iterator A0j3 = C17890vO.A0j(concurrentHashMap);
        while (A0j3.hasNext()) {
            A2D a2d3 = (A2D) A0j3.next();
            if (a2d3.A02) {
                A135.add(a2d3.A04);
            }
        }
        if (C17880vN.A1X(A135)) {
            C29391cC.A0G(A135);
            StringBuilder A102 = AnonymousClass000.A10();
            Iterator it3 = A135.iterator();
            while (it3.hasNext()) {
                String A0v3 = C17880vN.A0v(it3);
                if (A102.length() > 0) {
                    A102.append(", ");
                }
                A102.append(A0v3);
            }
            A0J("ttrc_cache_rendered", A102.toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        if (r2 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r2 != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        A0M("cache_and_network_queries", X.C17890vO.A1b(r8.A08, 0));
        A0M("network_only_queries", X.C17890vO.A1b(r8.A09, 0));
        r1 = r8.A06.keySet();
        X.C18070vi.A0X(r1);
        A0M("steps", (java.lang.String[]) r1.toArray(new java.lang.String[0]));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A08(X.AnonymousClass9IJ r9) {
        /*
            r8 = this;
            int r7 = r9.ordinal()
            r2 = 1
            java.lang.String r4 = "steps"
            java.lang.String r6 = "network_only_queries"
            java.lang.String r5 = "cache_and_network_queries"
            r3 = 0
            switch(r7) {
                case 1: goto L_0x007c;
                case 2: goto L_0x0085;
                case 3: goto L_0x008e;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.util.concurrent.atomic.AtomicInteger r1 = r8.A0A
            boolean r0 = r1.compareAndSet(r3, r7)
            if (r0 != 0) goto L_0x004a
            boolean r0 = r1.compareAndSet(r2, r7)
            if (r0 != 0) goto L_0x004a
            r0 = 2
            boolean r0 = r1.compareAndSet(r0, r7)
            if (r0 == 0) goto L_0x009e
        L_0x0024:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r8.A08
            java.lang.String[] r0 = X.C17890vO.A1b(r0, r3)
            r8.A0M(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r8.A09
            java.lang.String[] r0 = X.C17890vO.A1b(r0, r3)
            r8.A0M(r6, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r8.A06
            java.util.Set r1 = r0.keySet()
            X.C18070vi.A0X(r1)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r8.A0M(r4, r0)
        L_0x004a:
            X.9Z7 r3 = r8.A0D
            long r0 = r8.A03
            java.util.concurrent.ConcurrentHashMap r4 = r3.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r4.get(r3)
            X.A8s r0 = (X.C20132A8s) r0
            if (r0 == 0) goto L_0x007b
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0A
            int r1 = r0.get()
            X.0z2 r0 = X.AnonymousClass9IJ.A00
            java.lang.Object r1 = r0.get(r1)
            X.9IJ r0 = X.AnonymousClass9IJ.MARKER_CANCELLED
            if (r1 == r0) goto L_0x0078
            X.9IJ r0 = X.AnonymousClass9IJ.MARKER_DROPPED
            if (r1 == r0) goto L_0x0078
            X.9IJ r0 = X.AnonymousClass9IJ.MARKER_FAILED
            if (r1 == r0) goto L_0x0078
            X.9IJ r0 = X.AnonymousClass9IJ.SUCCESSFULLY_FINISHED
            if (r1 != r0) goto L_0x007b
        L_0x0078:
            r4.remove(r3)
        L_0x007b:
            return r2
        L_0x007c:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0A
            boolean r2 = r0.compareAndSet(r3, r7)
            if (r2 == 0) goto L_0x007b
            goto L_0x004a
        L_0x0085:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0A
            boolean r2 = r0.compareAndSet(r2, r7)
            if (r2 == 0) goto L_0x007b
            goto L_0x0024
        L_0x008e:
            java.util.concurrent.atomic.AtomicInteger r1 = r8.A0A
            boolean r0 = r1.compareAndSet(r3, r7)
            if (r0 != 0) goto L_0x004a
            r0 = 2
            boolean r0 = r1.compareAndSet(r0, r7)
            if (r0 == 0) goto L_0x009e
            goto L_0x004a
        L_0x009e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20132A8s.A08(X.9IJ):boolean");
    }

    public void A0D(String str) {
        EventBuilder eventBuilder;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A07()) {
            A08(AnonymousClass9IJ.MARKER_FAILED);
            A00();
            A05(3, str);
            long millis = elapsedRealtime - TimeUnit.NANOSECONDS.toMillis(this.A00);
            C695137m r6 = this.A04;
            String str2 = this.A05;
            if (r6.A01.A01(78315522)) {
                eventBuilder = new C65302wB(r6.A00, r6, (Integer) null, str2, 78315522);
            } else {
                eventBuilder = C20378AIo.A00;
                C18070vi.A0b(eventBuilder);
            }
            EventBuilder level = eventBuilder.annotate("duration", millis).setLevel(3);
            if (str != null) {
                level.annotate("message", str);
            }
            level.report();
        }
    }

    public void A0E(String str) {
        EventBuilder eventBuilder;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A07()) {
            A00();
            ConcurrentHashMap concurrentHashMap = this.A07;
            if (!concurrentHashMap.isEmpty() || !this.A06.isEmpty()) {
                Iterator A0j = C17890vO.A0j(concurrentHashMap);
                while (true) {
                    if (A0j.hasNext()) {
                        A2D a2d = (A2D) A0j.next();
                        AnonymousClass9IC A002 = a2d.A00();
                        if ((A002 != AnonymousClass9IC.CACHE_DONE_NETWORK_PENDING || a2d.A00) && A002 != AnonymousClass9IC.QUERY_SUCCESSFULLY_COMPLETED && A002 != AnonymousClass9IC.QUERY_NOT_NEEDED) {
                            break;
                        }
                    } else if (A06()) {
                        Iterator A0j2 = C17890vO.A0j(concurrentHashMap);
                        while (A0j2.hasNext()) {
                            A2D a2d2 = (A2D) A0j2.next();
                            if (a2d2.A00() == AnonymousClass9IC.CACHE_DONE_NETWORK_PENDING) {
                                a2d2.A01();
                            }
                        }
                        A02();
                        return;
                    }
                }
            }
            A08(AnonymousClass9IJ.MARKER_CANCELLED);
            A05(4, str);
            long millis = elapsedRealtime - TimeUnit.NANOSECONDS.toMillis(this.A00);
            if (millis > 5000) {
                String str2 = this.A05;
                if (str2 == null) {
                    str2 = String.valueOf(this.A02);
                }
                C695137m r5 = this.A04;
                if (r5.A01.A01(78315521)) {
                    eventBuilder = new C65302wB(r5.A00, r5, (Integer) null, str2, 78315521);
                } else {
                    eventBuilder = C20378AIo.A00;
                    C18070vi.A0b(eventBuilder);
                }
                eventBuilder.annotate("duration", millis).setLevel(5).report();
            }
        }
    }

    public void A0G(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A09(AnonymousClass9IJ.PROCESSING_QUERIES_AND_STEPS)) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(elapsedRealtime);
            A2D a2d = (A2D) this.A07.get(str);
            if (a2d != null && a2d.A02(AnonymousClass9IC.QUERY_SUCCESSFULLY_COMPLETED)) {
                a2d.A01 = true;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("ttnc_for_");
                String A0y = AnonymousClass000.A0y(a2d.A04, A10);
                C20132A8s a8s = a2d.A06;
                a8s.A0F = A0y;
                a8s.A0B.set(nanos);
                a8s.A0A(TimeUnit.NANOSECONDS.toMillis(nanos), A0y);
                a2d.A01();
                A03(nanos);
                A01();
            }
        }
    }

    public void A0H(String str) {
        C185229cF r0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A09(AnonymousClass9IJ.PROCESSING_QUERIES_AND_STEPS) && (r0 = (C185229cF) this.A06.get(str)) != null) {
            AtomicInteger atomicInteger = r0.A00;
            if (C179369Hr.A00.get(atomicInteger.get()) == C179369Hr.PENDING && atomicInteger.compareAndSet(0, 1)) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(elapsedRealtime);
                String A1H = AnonymousClass001.A1H("step_completed_", str, AnonymousClass000.A10());
                AtomicLong atomicLong = this.A0B;
                if (atomicLong.get() <= nanos) {
                    this.A0F = A1H;
                    atomicLong.set(nanos);
                }
                A0A(elapsedRealtime, A1H);
                A03(atomicLong.get());
                A01();
            }
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A02);
        A10.append('_');
        return C17880vN.A0t(A10, this.A01);
    }
}
