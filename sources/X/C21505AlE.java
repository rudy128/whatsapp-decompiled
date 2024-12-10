package X;

import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.AlE  reason: case insensitive filesystem */
public class C21505AlE implements RejectedExecutionHandler {
    public final int A00;

    public C21505AlE(int i) {
        this.A00 = i;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        switch (this.A00) {
            case 0:
                try {
                    threadPoolExecutor.getQueue().put(runnable);
                    return;
                } catch (InterruptedException e) {
                    Log.e((Throwable) e);
                    return;
                }
            case 1:
                threadPoolExecutor.getQueue().put(runnable);
                return;
            case 2:
                C18070vi.A0h(runnable, threadPoolExecutor);
                try {
                    threadPoolExecutor.getQueue().put(runnable);
                    return;
                } catch (InterruptedException e2) {
                    C17900vP.A0X(e2, "ParallelMediaDownloadPriorityQueue/rejectedExecution/InterruptedException ", AnonymousClass000.A10());
                    AnonymousClass8BS.A0x();
                    return;
                }
            default:
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("The task ");
                A10.append(runnable);
                android.util.Log.d("JobConsumer", AnonymousClass000.A0y(" has been rejected as it is executed after shutdown", A10));
                return;
        }
    }
}
