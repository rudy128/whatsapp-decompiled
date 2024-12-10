package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.AlF  reason: case insensitive filesystem */
public final /* synthetic */ class C21506AlF implements RejectedExecutionHandler {
    public final /* synthetic */ C21591Amf A00;
    public final /* synthetic */ A1G A01;

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C21591Amf amf = this.A00;
        A1G a1g = this.A01;
        if (runnable instanceof C21357Aim) {
            C21357Aim aim = (C21357Aim) runnable;
            if (aim.A01 == 15) {
                Job job = (Job) aim.A00;
                a1g.A02(job);
                String str = job.parameters.groupId;
                if (str != null) {
                    synchronized (a1g) {
                        a1g.A03.remove(str);
                        a1g.A05.A00.open();
                    }
                }
            }
        }
        try {
            amf.A01.getQueue().put(new C21423Ajq(27));
        } catch (InterruptedException unused) {
            AnonymousClass8BS.A0x();
        }
    }

    public /* synthetic */ C21506AlF(C21591Amf amf, A1G a1g) {
        this.A00 = amf;
        this.A01 = a1g;
    }
}
