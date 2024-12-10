package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: X.CXv  reason: case insensitive filesystem */
public class C25102CXv {
    public final HashMap A00 = C17880vN.A11();

    public void A00(String str, int i) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            if (!hashMap.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, i);
                Looper A0G = BE7.A0G(handlerThread);
                if (A0G != null) {
                    hashMap.put(str, C108945cZ.A0N(handlerThread, new Handler(A0G)));
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Looper is null: ");
                    throw AnonymousClass001.A12(str, A10);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|20|17|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0007, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finalize() {
        /*
            r5 = this;
            java.util.HashMap r4 = r5.A00
            monitor-enter(r4)
            java.util.Iterator r3 = X.C17890vO.A0j(r4)     // Catch:{ all -> 0x0029 }
        L_0x0007:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0029 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0029 }
            java.lang.Object r2 = r0.first     // Catch:{ all -> 0x0029 }
            android.os.HandlerThread r2 = (android.os.HandlerThread) r2     // Catch:{ all -> 0x0029 }
            r2.quitSafely()     // Catch:{ all -> 0x0029 }
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.join(r0)     // Catch:{ InterruptedException -> 0x0020 }
            goto L_0x0007
        L_0x0020:
            X.AnonymousClass8BS.A0x()     // Catch:{ all -> 0x0029 }
            goto L_0x0007
        L_0x0024:
            r4.clear()     // Catch:{ all -> 0x0029 }
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25102CXv.finalize():void");
    }

    public C25102CXv() {
        A00("Lite-Controller-Thread", 0);
        A00("Lite-SurfacePipe-Thread", 0);
        A00("Lite-CPU-Frames-Thread", 0);
        A00("Lite-GPU-Monitor-Thread", 0);
    }
}
