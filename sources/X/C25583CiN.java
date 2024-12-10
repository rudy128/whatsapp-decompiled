package X;

import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CiN  reason: case insensitive filesystem */
public final class C25583CiN {
    public final AnonymousClass00O A00 = new AnonymousClass00O(0);
    public final AnonymousClass00O A01 = new AnonymousClass00O(0);
    public final AnonymousClass00O A02 = new AnonymousClass00O(0);
    public final ExecutorService A03;
    public volatile boolean A04 = false;

    public C25583CiN() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(6, 6, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A03 = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static /* bridge */ /* synthetic */ void A00(OutputStream outputStream, long j, boolean z) {
        try {
            outputStream.write(z ? 1 : 0);
        } catch (IOException e) {
            Object[] A1a = AnonymousClass3MW.A1a();
            C17890vO.A1L(A1a, j);
            Log.w("NearbyConnections", String.format("Unable to deliver status for Payload %d", A1a), e);
            if (outputStream == null) {
                return;
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
        try {
            outputStream.close();
        } catch (IOException unused2) {
        }
    }
}
