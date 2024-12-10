package X;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BEe  reason: case insensitive filesystem */
public abstract class C22580BEe extends Service {
    public int A00;
    public int A01 = 0;
    public Binder A02;
    public final ExecutorService A03;
    public final Object A04 = C17880vN.A0p();

    public abstract void A01(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        Binder binder;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        binder = this.A02;
        if (binder == null) {
            binder = new BFV(new CLU(this));
            this.A02 = binder;
        }
        return binder;
    }

    public static void A00(Intent intent, C22580BEe bEe) {
        if (intent != null) {
            C25928Cos.A01(intent);
        }
        synchronized (bEe.A04) {
            int i = bEe.A01 - 1;
            bEe.A01 = i;
            if (i == 0) {
                bEe.stopSelfResult(bEe.A00);
            }
        }
    }

    public void onDestroy() {
        this.A03.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.A04) {
            this.A00 = i2;
            this.A01++;
        }
        Object poll = C19860z8.A00().A03.poll();
        if (poll != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.A03.execute(new C27081DTg(taskCompletionSource, this, poll, 37));
            zzw zzw = taskCompletionSource.zza;
            if (!zzw.isComplete()) {
                zzw.addOnCompleteListener((Executor) new C27134DVv(0), (OnCompleteListener) new AJC(intent, this, 0));
                return 3;
            }
        }
        A00(intent, this);
        return 2;
    }

    public C22580BEe() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C19550yO("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A03 = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
