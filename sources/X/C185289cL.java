package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.9cL  reason: invalid class name and case insensitive filesystem */
public class C185289cL {
    public static C185289cL A02;
    public final PowerManager.WakeLock A00;
    public final ExecutorService A01 = Executors.newSingleThreadExecutor();

    public C185289cL(Context context) {
        this.A00 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "FBNSPreloadWakefulExecutor");
    }
}
