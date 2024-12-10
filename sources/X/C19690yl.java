package X;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.0yl  reason: invalid class name and case insensitive filesystem */
public class C19690yl {
    public static final long A08 = TimeUnit.HOURS.toSeconds(8);
    public boolean A00 = false;
    public final FirebaseMessaging A01;
    public final C19490yI A02;
    public final C19610yc A03;
    public final Map A04 = new AnonymousClass00O(0);
    public final ScheduledExecutorService A05;
    public final Context A06;
    public final C19480yH A07;

    public synchronized void A03(boolean z) {
        this.A00 = z;
    }

    public static void A00(Task task) {
        Throwable th;
        try {
            Tasks.await(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            th = e.getCause();
            if (!(th instanceof IOException) && !(th instanceof RuntimeException)) {
                throw new IOException(e);
            }
            throw th;
        } catch (InterruptedException | TimeoutException e2) {
            th = new IOException("SERVICE_NOT_AVAILABLE", e2);
            throw th;
        }
    }

    public static boolean A01() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public void A02(long j) {
        long min = Math.min(Math.max(30, 2 * j), A08);
        this.A05.schedule(new C70853Ct(this.A06, this.A07, this, min), j, TimeUnit.SECONDS);
        A03(true);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.00O, java.util.Map] */
    public C19690yl(Context context, FirebaseMessaging firebaseMessaging, C19490yI r5, C19480yH r6, C19610yc r7, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = firebaseMessaging;
        this.A07 = r6;
        this.A03 = r7;
        this.A02 = r5;
        this.A06 = context;
        this.A05 = scheduledExecutorService;
    }
}
