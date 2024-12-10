package X;

import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.2so  reason: invalid class name and case insensitive filesystem */
public class C63282so {
    public boolean A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass1Cd A02;
    public final List A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final long A07;
    public final C33621j7 A08;
    public final AnonymousClass11P A09;
    public final C18030ve A0A;
    public final AnonymousClass10I A0B;
    public final Runnable A0C;
    public final Runnable A0D;

    public void A01() {
        synchronized (this) {
            if (!this.A03.isEmpty() || !this.A04.isEmpty()) {
                this.A00 = false;
                Iterator A15 = AnonymousClass000.A15(this.A04);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    Handler handler = (Handler) A16.getKey();
                    this.A05.put(handler, AnonymousClass000.A0i());
                    handler.postAtFrontOfQueue((Runnable) A16.getValue());
                }
                this.A0B.CGv(this.A0D, this.A07);
            }
        }
    }

    public void A02(Handler handler) {
        synchronized (this) {
            this.A04.put(handler, new AnonymousClass7RD(handler, this, 40));
        }
    }

    public void A03(String str, ThreadPoolExecutor threadPoolExecutor) {
        synchronized (this) {
            this.A03.add(new C129346he(str, threadPoolExecutor));
        }
    }

    public static void A00(C63282so r12, String str) {
        String str2;
        Runnable runnable;
        C33621j7 r2 = r12.A08;
        boolean z = false;
        if (r2 != null) {
            boolean equals = Boolean.TRUE.equals(C33621j7.A00(r2).A09.A03.A06());
            long j = r12.A07;
            if (System.currentTimeMillis() - C33621j7.A00(r2).A09.A0G() < j * 2) {
                z = true;
            }
            if (equals || z) {
                r12.A0B.CGv(r12.A0D, j);
                return;
            }
        }
        int A002 = C18020vd.A00(C18040vf.A01, r12.A0A, 757) * 1000;
        if (A002 > 0 && (runnable = r12.A0C) != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Map map = r12.A06;
            Number number = (Number) map.get(str);
            if (number == null) {
                map.put(str, Long.valueOf(uptimeMillis));
                r12.A0B.CGv(r12.A0D, (long) A002);
            } else if (uptimeMillis - number.longValue() >= ((long) A002)) {
                runnable.run();
            }
        }
        if (!r12.A00) {
            try {
                Log.i("ThreadUtils/logAllStackTracesAndFindBlocked");
                Iterator A15 = AnonymousClass000.A15(Thread.getAllStackTraces());
                str2 = null;
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    Thread thread = (Thread) A16.getKey();
                    StringBuilder sb = new StringBuilder("\n");
                    if (str2 == null && Thread.State.BLOCKED == thread.getState()) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append(thread.getId());
                        A10.append(":");
                        str2 = AnonymousClass000.A0y(thread.getName(), A10);
                    }
                    C22781De.A02(sb, thread, (StackTraceElement[]) A16.getValue());
                    Log.log(3, sb.toString());
                }
            } catch (Throwable th) {
                Log.e("ThreadUtils/logAllStackTracesAndFindBlocked exception", th);
                str2 = null;
            }
            if (r12.A02 != null) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("StuckDbHandlerThreadDetector/reportStuckThreadOrThreadPool, stuckThreadName:");
                A102.append(str);
                A102.append(" stateBlockedThread:");
                A102.append(str2);
                C17900vP.A0g(" msgStoreReadLock:", (String) null, A102);
            }
            r12.A01.A0H("db-thread-stuck", str, false, str2);
            r12.A00 = true;
        }
    }

    public C63282so(AnonymousClass190 r3, C33621j7 r4, AnonymousClass11P r5, AnonymousClass1Cd r6, C18030ve r7, AnonymousClass10I r8, Runnable runnable, long j) {
        this.A0D = new AnonymousClass7RJ(this, 8);
        this.A00 = false;
        this.A04 = C17880vN.A11();
        this.A05 = C17880vN.A11();
        this.A03 = AnonymousClass000.A13();
        this.A06 = C17880vN.A11();
        this.A09 = r5;
        this.A0A = r7;
        this.A01 = r3;
        this.A0B = r8;
        this.A08 = r4;
        this.A02 = r6;
        this.A0C = runnable;
        this.A07 = j;
    }

    public C63282so(AnonymousClass190 r11, C33621j7 r12, AnonymousClass11P r13, AnonymousClass1Cd r14, C18030ve r15, AnonymousClass10I r16) {
        this(r11, r12, r13, r14, r15, r16, new C21423Ajq(26), 120000);
    }
}
