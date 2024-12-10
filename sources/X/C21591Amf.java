package X;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Amf  reason: case insensitive filesystem */
public class C21591Amf extends Thread {
    public final AnonymousClass9WO A00;
    public final ThreadPoolExecutor A01;
    public final AtomicInteger A02;
    public final A1G A03;
    public final A0C A04;

    public C21591Amf(AnonymousClass9WO r10, AtomicInteger atomicInteger, A1G a1g, A0C a0c, int i, int i2) {
        super("JobConsumer");
        this.A03 = a1g;
        this.A00 = r10;
        this.A04 = a0c;
        this.A02 = atomicInteger;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, 60, TimeUnit.SECONDS, new SynchronousQueue(), new C21508AlH());
        this.A01 = threadPoolExecutor;
        threadPoolExecutor.setRejectedExecutionHandler(new C21506AlF(this, a1g));
    }

    public void run() {
        while (true) {
            ThreadPoolExecutor threadPoolExecutor = this.A01;
            A1G a1g = this.A03;
            Object obj = null;
            do {
                try {
                    obj = a1g.A04.take();
                    continue;
                } catch (InterruptedException unused) {
                }
            } while (obj == null);
            threadPoolExecutor.execute(new C21357Aim(this, obj, 15));
        }
    }
}
