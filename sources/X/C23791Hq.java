package X;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Hq  reason: invalid class name and case insensitive filesystem */
public final class C23791Hq extends C23771Ho implements C23781Hp {
    public final Executor A00;

    public AnonymousClass1OI Bdz(Runnable runnable, C18560wh r5, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    return new AnonymousClass3E5(schedule);
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C30551e8.A03(cancellationException, r5);
            }
        }
        return AnonymousClass1IM.A00.Bdz(runnable, r5, j);
    }

    public void CGy(C31761g5 r5, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            C21357Aim aim = new C21357Aim(this, r5, 6);
            C18560wh context = r5.getContext();
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(aim, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    C60682oR.A01(new C71143Dy(schedule), r5);
                    return;
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C30551e8.A03(cancellationException, context);
            }
        }
        AnonymousClass1IM.A00.CGy(r5, j);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C23791Hq) || ((C23791Hq) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.A00);
    }

    public String toString() {
        return this.A00.toString();
    }

    public C23791Hq(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.A00 = executor;
        try {
            if ((executor instanceof ScheduledThreadPoolExecutor) && (scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor) != null && (method = AnonymousClass2WC.A00) != null) {
                method.invoke(scheduledThreadPoolExecutor, new Object[]{true});
            }
        } catch (Throwable unused) {
        }
    }
}
