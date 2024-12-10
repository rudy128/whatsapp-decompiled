package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager;
import com.whatsapp.util.Log;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1dB  reason: invalid class name and case insensitive filesystem */
public final class C29971dB implements C29951d9, C218917u, C29961dA {
    public long A00 = -1;
    public long A01;
    public long A02;
    public long A03 = -1;
    public long A04 = -1;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public final C24411Kf A09 = new C30021dG(this);
    public final AnonymousClass11P A0A;
    public final C19830z4 A0B;
    public final C18030ve A0C;
    public final XmppConnectionMetricsWorkManager A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final Set A0G = new LinkedHashSet();
    public final AtomicBoolean A0H = new AtomicBoolean();
    public final AtomicInteger A0I = new AtomicInteger();
    public final AtomicInteger A0J = new AtomicInteger();
    public final AtomicInteger A0K = new AtomicInteger();
    public final C18100vl A0L = new C18110vm(new C29981dC(this));
    public final C18100vl A0M = new C18110vm(new C30011dF(this));
    public final C18100vl A0N = new C18110vm(new C30001dE(this));
    public final C18100vl A0O = new C18110vm(new C29991dD(this));
    public final AnonymousClass18K A0P;
    public final AtomicInteger A0Q = new AtomicInteger();

    public C29971dB(AnonymousClass11P r3, C19830z4 r4, C18030ve r5, AnonymousClass18K r6, XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(xmppConnectionMetricsWorkManager, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r4, 6);
        C18070vi.A0d(r9, 7);
        this.A0A = r3;
        this.A0P = r6;
        this.A0D = xmppConnectionMetricsWorkManager;
        this.A0C = r5;
        this.A0F = r8;
        this.A0B = r4;
        this.A0E = r9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r0 <= 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BsQ(X.C63622tQ r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.Integer r0 = r5.A08
            if (r0 == 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0Q
            int r0 = r1.decrementAndGet()
            if (r0 >= 0) goto L_0x0010
            r1.set(r3)
        L_0x0010:
            java.util.concurrent.atomic.AtomicInteger r2 = r4.A0I
            int r0 = r2.decrementAndGet()
            if (r0 >= 0) goto L_0x004b
            r2.set(r3)
        L_0x001b:
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.A01 = r0
            A02(r4)
        L_0x0024:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "XmppConnectionMetrics/onDuplicateStanzaRemoved incoming stanza duplicate incoming:"
            r1.append(r0)
            int r0 = r2.get()
            r1.append(r0)
            java.lang.String r0 = " unacked_offline:"
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A0Q
            int r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x004b:
            if (r0 > 0) goto L_0x0024
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29971dB.BsQ(X.2tQ):void");
    }

    public /* synthetic */ void BzP() {
    }

    public /* synthetic */ void BzQ(Integer num, Integer num2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r0 <= 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C67(X.C63622tQ r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.Integer r0 = r5.A08
            if (r0 == 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0Q
            int r0 = r1.decrementAndGet()
            if (r0 >= 0) goto L_0x0010
            r1.set(r3)
        L_0x0010:
            java.util.concurrent.atomic.AtomicInteger r2 = r4.A0I
            int r0 = r2.decrementAndGet()
            if (r0 >= 0) goto L_0x004b
            r2.set(r3)
        L_0x001b:
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.A01 = r0
            A02(r4)
        L_0x0024:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "XmppConnectionMetrics/onStanzaAcked incoming stanza processing finished incoming=:"
            r1.append(r0)
            int r0 = r2.get()
            r1.append(r0)
            java.lang.String r0 = " unacked_offline=:"
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A0Q
            int r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x004b:
            if (r0 > 0) goto L_0x0024
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29971dB.C67(X.2tQ):void");
    }

    public /* synthetic */ void C68(C63622tQ r1) {
    }

    private final long A00(String str, long j) {
        if (j == -1) {
            return 0;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - j);
        AnonymousClass18K r3 = this.A0P;
        C22681Cu r2 = new C22681Cu();
        r2.A02 = str;
        r2.A00 = Long.valueOf(seconds);
        r3.CC0(r2, (C18180vt) null, false);
        return seconds;
    }

    public static final void A01(C29971dB r3) {
        if (C18020vd.A05(C18040vf.A02, r3.A0C, 3206)) {
            r3.A0D.A02();
        }
    }

    public static final void A02(C29971dB r4) {
        C18100vl r3 = r4.A0L;
        C18100vl r1 = r4.A0N;
        ((Handler) r3.getValue()).removeCallbacks((Runnable) r1.getValue());
        if (!r4.A0B()) {
            ((Handler) r3.getValue()).postDelayed((Runnable) r1.getValue(), 1000);
        }
    }

    public static final boolean A03(C29971dB r8, String str) {
        if (r8.A00 == -1) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass18K r6 = r8.A0P;
        C22681Cu r5 = new C22681Cu();
        r5.A02 = str;
        r5.A00 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime - r8.A00));
        r6.CC0(r5, (C18180vt) null, false);
        return true;
    }

    public final String A04() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("incoming count: ");
        sb.append(this.A0I.get());
        sb.append("; outgoing count: ");
        sb.append(this.A0J.get());
        sb.append("; pushes count: ");
        sb.append(this.A0K.get());
        sb.append("; offlineResume: {");
        sb.append(this.A0H.get());
        sb.append("}; ");
        Integer num = this.A05;
        if (num != null) {
            int intValue = num.intValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed with reason: ");
            sb2.append(intValue);
            str = sb2.toString();
        } else {
            str = null;
        }
        sb.append(str);
        return sb.toString();
    }

    public final void A05() {
        long A002 = A00("xmpp-lifecycle-time", this.A03);
        this.A04 = -1;
        C19830z4 r6 = this.A0B;
        C19830z4.A00(r6).putLong("xmpp:lifecycle_worker_runtime_seconds", A002 + ((SharedPreferences) r6.A00.get()).getLong("xmpp:lifecycle_worker_runtime_seconds", 0)).apply();
    }

    public final void A06() {
        long A002 = A00("xmpp-logout-time", this.A04);
        this.A04 = -1;
        C19830z4 r6 = this.A0B;
        C19830z4.A00(r6).putLong("xmpp:logout_worker_runtime_seconds", A002 + ((SharedPreferences) r6.A00.get()).getLong("xmpp:logout_worker_runtime_seconds", 0)).apply();
    }

    public final void A08(Integer num) {
        C18030ve r6 = this.A0C;
        C18040vf r5 = C18040vf.A02;
        if (C18020vd.A05(r5, r6, 3206) && Build.VERSION.SDK_INT >= 29) {
            if ((num != null && num.intValue() == 1) || !C18020vd.A05(r5, r6, 4966)) {
                AtomicInteger atomicInteger = this.A0K;
                if (atomicInteger.incrementAndGet() == 1 || this.A05 != null) {
                    A01(this);
                }
                C18100vl r3 = this.A0L;
                C18100vl r1 = this.A0O;
                ((Handler) r3.getValue()).removeCallbacks((Runnable) r1.getValue());
                ((Handler) r3.getValue()).postDelayed((Runnable) r1.getValue(), C21348Aid.A03(C196999vz.A00(C179589Io.SECONDS, C18020vd.A00(r5, r6, 4965))));
                StringBuilder sb = new StringBuilder();
                sb.append("XmppConnectionMetrics push processing started counter:");
                sb.append(atomicInteger.get());
                Log.i(sb.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r0 <= 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(boolean r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0011
            X.0vl r0 = r3.A0M
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r2 = r3.A0J
            int r0 = r2.decrementAndGet()
            if (r0 >= 0) goto L_0x003f
            r0 = 0
            r2.set(r0)
        L_0x001d:
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.A02 = r0
            A02(r3)
        L_0x0026:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "XmppConnectionMetrics outgoing stanza processing finished counter:"
            r1.append(r0)
            int r0 = r2.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x003f:
            if (r0 > 0) goto L_0x0026
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29971dB.A09(boolean):void");
    }

    public final void A0A(boolean z) {
        if (z || !((Boolean) this.A0M.getValue()).booleanValue()) {
            AtomicInteger atomicInteger = this.A0J;
            if (atomicInteger.incrementAndGet() == 1 || this.A05 != null) {
                A01(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("XmppConnectionMetrics outgoing stanza processing started counter:");
            sb.append(atomicInteger.get());
            Log.i(sb.toString());
        }
    }

    public final boolean A0B() {
        if (this.A0I.get() > 0 || this.A0J.get() > 0 || this.A0K.get() > 0 || this.A0H.get()) {
            return true;
        }
        return false;
    }

    public void Brl() {
        StringBuilder sb = new StringBuilder();
        sb.append("XmppConnectionMetrics/onDisconnect all incoming stanza processing finished incoming:");
        AtomicInteger atomicInteger = this.A0I;
        sb.append(atomicInteger.get());
        sb.append(" unacked_offline:");
        AtomicInteger atomicInteger2 = this.A0Q;
        sb.append(atomicInteger2.get());
        sb.append(" offlineResume: {");
        AtomicBoolean atomicBoolean = this.A0H;
        sb.append(atomicBoolean.get());
        sb.append("}; ");
        Log.i(sb.toString());
        atomicInteger.set(0);
        atomicInteger2.set(0);
        atomicBoolean.set(false);
        ((Handler) this.A0L.getValue()).removeCallbacks((Runnable) this.A0N.getValue());
    }

    public void ByI() {
        if (((Boolean) this.A0M.getValue()).booleanValue()) {
            A0A(true);
        }
    }

    public void ByP(AnonymousClass206 r2) {
        if (((Boolean) this.A0M.getValue()).booleanValue()) {
            A09(true);
        }
    }

    public void BzR() {
        this.A0H.set(false);
        A02(this);
        Log.i("XmppConnectionMetrics/onOfflineResumeCompleted");
    }

    public void C69(C63622tQ r4) {
        if (r4.A08 != null) {
            this.A0Q.incrementAndGet();
        }
        AtomicInteger atomicInteger = this.A0I;
        if (atomicInteger.incrementAndGet() == 1 || this.A05 != null) {
            A01(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("XmppConnectionMetrics/onStanzaReceived incoming stanza processing started incoming=:");
        sb.append(atomicInteger.get());
        sb.append(" unacked_offline=:");
        sb.append(this.A0Q.get());
        Log.i(sb.toString());
    }

    public final void A07(int i) {
        this.A05 = Integer.valueOf(i);
        if (i == 3) {
            this.A0J.set(0);
            this.A0I.set(0);
            A02(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("XmppConnectionMetrics/reportLastWorkerFailed with reason: ");
        sb.append(i);
        Log.i(sb.toString());
    }
}
