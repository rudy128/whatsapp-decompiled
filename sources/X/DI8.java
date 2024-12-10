package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

public final class DI8 implements E59 {
    public final /* synthetic */ C24475C5q A00;
    public final /* synthetic */ E5G A01;
    public final /* synthetic */ C28447E1n A02;
    public final /* synthetic */ TaskCompletionSource A03;

    public DI8(C24475C5q c5q, E5G e5g, C28447E1n e1n, TaskCompletionSource taskCompletionSource) {
        this.A00 = c5q;
        this.A03 = taskCompletionSource;
        this.A01 = e5g;
        this.A02 = e1n;
    }

    public final void BpI(Status status) {
        if (status.A00 <= 0) {
            C24475C5q c5q = this.A00;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) c5q;
            C18210vx.A08(!basePendingResult.A0B, "Result has already been consumed.");
            try {
                if (!basePendingResult.A08.await(0, timeUnit)) {
                    basePendingResult.A07(Status.A0A);
                }
            } catch (InterruptedException unused) {
                basePendingResult.A07(Status.A07);
            }
            C18210vx.A08(AnonymousClass000.A1P((basePendingResult.A08.getCount() > 0 ? 1 : (basePendingResult.A08.getCount() == 0 ? 0 : -1))), "Result is not ready.");
            this.A03.setResult(this.A01.BFr(BasePendingResult.A00(basePendingResult)));
            return;
        }
        this.A03.setException(C24602CAy.A00(status));
    }
}
