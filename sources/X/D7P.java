package X;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public final class D7P implements E7E {
    public final WindowLayoutComponent A00;
    public final Map A01 = C17880vN.A13();
    public final Map A02 = C17880vN.A13();
    public final ReentrantLock A03 = new ReentrantLock();

    public void CDy(Context context, AnonymousClass1GV r6, Executor executor) {
        C18070vi.A0d(context, 0);
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Map map = this.A01;
            D6K d6k = (D6K) map.get(context);
            if (d6k != null) {
                d6k.A00(r6);
                this.A02.put(r6, context);
            } else {
                D6K d6k2 = new D6K(context);
                map.put(context, d6k2);
                this.A02.put(r6, context);
                d6k2.A00(r6);
                this.A00.addWindowLayoutInfoListener(context, d6k2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQC(X.AnonymousClass1GV r8) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.util.concurrent.locks.ReentrantLock r6 = r7.A03
            r6.lock()
            java.util.Map r5 = r7.A02     // Catch:{ all -> 0x0045 }
            java.lang.Object r4 = r5.get(r8)     // Catch:{ all -> 0x0045 }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0041
            java.util.Map r3 = r7.A01     // Catch:{ all -> 0x0045 }
            java.lang.Object r2 = r3.get(r4)     // Catch:{ all -> 0x0045 }
            X.D6K r2 = (X.D6K) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0041
            java.util.concurrent.locks.ReentrantLock r1 = r2.A02     // Catch:{ all -> 0x0045 }
            r1.lock()     // Catch:{ all -> 0x0045 }
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x003c }
            r0.remove(r8)     // Catch:{ all -> 0x003c }
            r1.unlock()     // Catch:{ all -> 0x0045 }
            r5.remove(r8)     // Catch:{ all -> 0x0045 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0041
            r3.remove(r4)     // Catch:{ all -> 0x0045 }
            androidx.window.extensions.layout.WindowLayoutComponent r0 = r7.A00     // Catch:{ all -> 0x0045 }
            r0.removeWindowLayoutInfoListener(r2)     // Catch:{ all -> 0x0045 }
            goto L_0x0041
        L_0x003c:
            r0 = move-exception
            r1.unlock()     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0041:
            r6.unlock()
            return
        L_0x0045:
            r0 = move-exception
            r6.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D7P.CQC(X.1GV):void");
    }

    public D7P(WindowLayoutComponent windowLayoutComponent) {
        this.A00 = windowLayoutComponent;
    }
}
