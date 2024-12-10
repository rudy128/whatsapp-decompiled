package X;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1mL  reason: invalid class name and case insensitive filesystem */
public class C35501mL implements Runnable, Future {
    public final AnonymousClass118 A00;
    public final /* synthetic */ C35461mH A01;

    public boolean cancel(boolean z) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public C35501mL(AnonymousClass118 r1, C35461mH r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        C35461mH r1 = this.A01;
        if (r1.A02.await(j, timeUnit)) {
            return r1.A03.get();
        }
        throw new TimeoutException();
    }

    public boolean isDone() {
        if (this.A01.A02.getCount() == 0) {
            return true;
        }
        return false;
    }

    public void run() {
        Set set;
        Context context = this.A00.A00;
        HashSet A002 = C35461mH.A00(context, "primary-task-killer", C35461mH.A04);
        HashSet A003 = C35461mH.A00(context, "secondary-task-killer", C35461mH.A05);
        C35461mH r4 = this.A01;
        AtomicReference atomicReference = r4.A03;
        Set set2 = null;
        if (A002 != null) {
            set = Collections.unmodifiableSet(A002);
        } else {
            set = null;
        }
        if (A003 != null) {
            set2 = Collections.unmodifiableSet(A003);
        }
        atomicReference.set(new C35491mK(set, set2));
        r4.A02.countDown();
    }

    public /* bridge */ /* synthetic */ Object get() {
        return null;
    }
}
