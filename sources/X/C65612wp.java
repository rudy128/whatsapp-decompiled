package X;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.2wp  reason: invalid class name and case insensitive filesystem */
public class C65612wp implements C18290w6 {
    public final int A00;

    public C65612wp(int i) {
        this.A00 = i;
    }

    public final Object get() {
        switch (this.A00) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.A00();
            case 3:
                return new C18770x8(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new C18760x7(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build(), "Firebase Lite", 0)), (ScheduledExecutorService) ExecutorsRegistrar.A03.get());
            case 4:
                return new C18770x8(Executors.newCachedThreadPool(new C18760x7((StrictMode.ThreadPolicy) null, "Firebase Blocking", 11)), (ScheduledExecutorService) ExecutorsRegistrar.A03.get());
            default:
                return Executors.newSingleThreadScheduledExecutor(new C18760x7((StrictMode.ThreadPolicy) null, "Firebase Scheduler", 0));
        }
    }
}
