package X;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

public class DBC implements E4K {
    public static final long A01 = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager A00;

    public /* bridge */ /* synthetic */ Object get() {
        int i;
        int min = Math.min(this.A00.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            i = 4194304;
        } else if (min < 67108864) {
            i = 6291456;
        } else {
            i = min / 4;
        }
        return new CSO(i, 256, Integer.MAX_VALUE, A01, Integer.MAX_VALUE);
    }

    public DBC(ActivityManager activityManager) {
        this.A00 = activityManager;
    }
}
