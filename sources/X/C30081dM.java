package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1dM  reason: invalid class name and case insensitive filesystem */
public abstract class C30081dM implements C30071dL {
    public static final AtomicInteger A01 = new AtomicInteger(1);
    public final AnonymousClass19T A00;

    public void BLQ(C58442kh r6, long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        String str = r6.A00;
        if (str != null) {
            this.A00.markerAnnotate(i, i2, UserFlowLoggerImpl.SOURCE_OF_RESTART_ANNOTATION, str);
        }
        AnonymousClass19T r1 = this.A00;
        r1.markerEnd(i, i2, 111);
        r1.Bj1(i, i2, r6.A01);
        if (str != null) {
            r1.markerAnnotate(i, i2, UserFlowLoggerImpl.SOURCE_ANNOTATION, str);
        }
    }

    public void flowAnnotate(long j, String str, long j2) {
        this.A00.markerAnnotate((int) j, (int) (j >>> 32), str, j2);
    }

    public void flowEndCancel(long j, String str) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        AnonymousClass19T r1 = this.A00;
        r1.markerAnnotate(i, i2, UserFlowLoggerImpl.CANCEL_REASON_ANNOTATION, str);
        r1.markerEnd(i, i2, 4);
    }

    public void flowEndFail(long j, String str, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (str == null) {
            str = "<NULL>";
        }
        AnonymousClass19T r1 = this.A00;
        r1.markerAnnotate(i, i2, UserFlowLoggerImpl.HAS_ERROR_ANNOTATION, true);
        if (str2 != null) {
            r1.markerPoint(i, i2, str, str2);
        } else {
            r1.markerPoint(i, i2, str);
        }
        r1.markerEnd(i, i2, 3);
    }

    public void flowEndSuccess(long j) {
        this.A00.markerEnd((int) j, (int) (j >>> 32), 2);
    }

    public void flowMarkError(long j, String str, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        AnonymousClass19T r1 = this.A00;
        r1.markerAnnotate(i, i2, UserFlowLoggerImpl.HAS_ERROR_ANNOTATION, true);
        if (str2 != null) {
            r1.markerPoint(i, i2, str, str2);
        } else {
            r1.markerPoint(i, i2, str);
        }
    }

    public void flowMarkPoint(long j, String str) {
        this.A00.markerPoint((int) j, (int) (j >>> 32), str);
    }

    public C30081dM(AnonymousClass19T r1) {
        this.A00 = r1;
    }

    public void BLP(long j, String str) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        AnonymousClass19T r1 = this.A00;
        r1.markerAnnotate(i, i2, UserFlowLoggerImpl.CANCEL_REASON_ANNOTATION, CancelReason.USER_CANCELLED);
        r1.Biv(i, i2, 4, str);
    }

    public void flowAnnotate(long j, String str, int i) {
        this.A00.markerAnnotate((int) j, (int) (j >>> 32), str, i);
    }

    public void flowAnnotate(long j, String str, String str2) {
        this.A00.markerAnnotate((int) j, (int) (j >>> 32), str, str2);
    }

    public void flowAnnotate(long j, String str, boolean z) {
        this.A00.markerAnnotate((int) j, (int) (j >>> 32), str, z);
    }
}
