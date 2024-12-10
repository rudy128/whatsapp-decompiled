package X;

import android.os.Handler;
import android.os.StrictMode;
import android.os.Trace;
import com.facebook.common.dextricks.StringTreeSet;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CuB  reason: case insensitive filesystem */
public final class C26187CuB {
    public static final Object A0B = C17880vN.A0p();
    public static final Handler A0C = C17890vO.A0D();
    public Throwable A00;
    public final C25656Cjm A01;
    public final Object A02 = C17880vN.A0p();
    public final Thread A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final CountDownLatch A07;
    public final Executor A08;
    public final AtomicBoolean A09 = BE6.A16(false);
    public volatile boolean A0A = false;

    public static String A00() {
        boolean z;
        StringBuilder A0t = BE6.A0t("linkedapp_app_identity".length());
        char[] charArray = "linkedapp_app_identity".toCharArray();
        int length = charArray.length;
        int i = 0;
        boolean z2 = false;
        while (i < length) {
            char c = charArray[i];
            if (c > '9' || c < '0') {
                z = false;
                A0t.append(c);
            } else {
                z = true;
                if (!z2) {
                    A0t.append('#');
                }
            }
            i++;
            z2 = z;
        }
        return A0t.toString();
    }

    public static void A01(C26187CuB cuB) {
        if (!cuB.A0A) {
            CountDownLatch countDownLatch = cuB.A07;
            if (countDownLatch.getCount() == 1) {
                StrictMode.noteSlowCall("Blocked on LightSharedPreferences Init");
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("LightSharedPreferences.waitIfNotLoaded: ");
            String A0y = AnonymousClass000.A0y(A00(), A10);
            String A0o = AnonymousClass8BS.A0o(A0y, Math.min(A0y.length(), StringTreeSet.OFFSET_BASE_ENCODING));
            Method method = AnonymousClass1CH.A03;
            Trace.beginSection(A0o);
            while (!cuB.A0A) {
                Thread thread = cuB.A03;
                if (!(thread == null || thread.getState() == Thread.State.TERMINATED)) {
                    int priority = Thread.currentThread().getPriority();
                    synchronized (cuB) {
                        if (priority > thread.getPriority()) {
                            A02(thread, priority);
                        }
                    }
                }
                try {
                    continue;
                    countDownLatch.await();
                    break;
                } catch (InterruptedException unused) {
                }
            }
            Trace.endSection();
        }
    }

    public C26187CuB(Executor executor, C18140vp r6) {
        this.A01 = new C25656Cjm(r6);
        this.A05 = C17880vN.A11();
        this.A06 = C17880vN.A11();
        this.A04 = C17880vN.A11();
        if (executor != null) {
            this.A08 = executor;
            this.A07 = new CountDownLatch(1);
            C27082DTh A002 = C27082DTh.A00(this, 7);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("LSP-");
            Thread thread = new Thread(A002, AnonymousClass000.A0y(A00(), A10));
            this.A03 = thread;
            A02(thread, Math.max(Thread.currentThread().getPriority() - 1, 1));
            thread.start();
            return;
        }
        throw BE6.A0m();
    }

    public static void A02(Thread thread, int i) {
        try {
            thread.setPriority(i);
        } catch (IllegalArgumentException e) {
            if (thread.getState() != Thread.State.TERMINATED) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Failed to set thread priority - thread state:");
                A10.append(thread.getState().name());
                throw new IllegalArgumentException(AnonymousClass001.A1I(" priority:", A10, i), e);
            }
        }
    }
}
