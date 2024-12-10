package X;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import org.whispersystems.jobqueue.Job;

public class A1G {
    public final AnonymousClass9WO A00;
    public final LinkedList A01 = AnonymousClass8BR.A14();
    public final Map A02;
    public final Set A03 = C17880vN.A12();
    public final SynchronousQueue A04 = new SynchronousQueue();
    public final C21590Ame A05;
    public final boolean A06;

    public A1G(AnonymousClass9WO r4) {
        C21590Ame ame = new C21590Ame(this);
        this.A05 = ame;
        this.A02 = C17880vN.A11();
        this.A06 = true;
        this.A00 = r4;
        ame.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int A01(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0016
            java.util.Map r0 = r1.A02     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0013 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0016
            int r0 = r0.intValue()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0016:
            monitor-exit(r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1G.A01(java.lang.String):int");
    }

    public synchronized void A02(Job job) {
        this.A01.addFirst(job);
        A00(job, this);
        this.A05.A00.open();
    }

    public static void A00(Job job, A1G a1g) {
        String str = job.parameters.groupId;
        if (str != null) {
            C17880vN.A1P(str, a1g.A02, a1g.A01(str) + 1);
        }
    }
}
