package X;

import android.content.Context;
import java.util.concurrent.Callable;

public final class DVR implements Callable {
    public final /* synthetic */ Context A00;

    public DVR(Context context) {
        this.A00 = context;
    }

    public final /* synthetic */ Object call() {
        return this.A00.getSharedPreferences("google_sdk_flags", 0);
    }
}
