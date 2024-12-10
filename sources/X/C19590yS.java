package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.0yS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C19590yS implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FirebaseMessaging A01;
    public final /* synthetic */ C19490yI A02;
    public final /* synthetic */ C19480yH A03;
    public final /* synthetic */ ScheduledExecutorService A04;

    public final Object call() {
        C19610yc r12;
        Context context = this.A00;
        ScheduledExecutorService scheduledExecutorService = this.A04;
        FirebaseMessaging firebaseMessaging = this.A01;
        C19480yH r11 = this.A03;
        C19490yI r10 = this.A02;
        synchronized (C19610yc.class) {
            WeakReference weakReference = C19610yc.A03;
            if (weakReference == null || (r12 = (C19610yc) weakReference.get()) == null) {
                r12 = new C19610yc(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledExecutorService);
                synchronized (r12) {
                    C19670yi r6 = new C19670yi(r12.A01, r12.A02);
                    ArrayDeque arrayDeque = r6.A01;
                    synchronized (arrayDeque) {
                        arrayDeque.clear();
                        String string = r6.A00.getString("topic_operation_queue", "");
                        if (!TextUtils.isEmpty(string) && string.contains(",")) {
                            String[] split = string.split(",", -1);
                            int length = split.length;
                            if (length != 0) {
                                int i = 0;
                                while (true) {
                                    String str = split[i];
                                    if (!TextUtils.isEmpty(str)) {
                                        arrayDeque.add(str);
                                    }
                                    i++;
                                    if (i >= length) {
                                        break;
                                    }
                                }
                            } else {
                                Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                            }
                        }
                    }
                    r12.A00 = r6;
                }
                C19610yc.A03 = new WeakReference(r12);
            }
        }
        return new C19690yl(context, firebaseMessaging, r10, r11, r12, scheduledExecutorService);
    }

    public /* synthetic */ C19590yS(Context context, FirebaseMessaging firebaseMessaging, C19490yI r3, C19480yH r4, ScheduledExecutorService scheduledExecutorService) {
        this.A00 = context;
        this.A04 = scheduledExecutorService;
        this.A01 = firebaseMessaging;
        this.A03 = r4;
        this.A02 = r3;
    }
}
