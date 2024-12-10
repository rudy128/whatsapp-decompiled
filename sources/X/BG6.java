package X;

import android.os.Handler;
import android.os.Looper;

public class BG6 extends Handler {
    public final Looper A00 = Looper.getMainLooper();

    public BG6(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public BG6(Looper looper) {
        super(looper);
    }

    public BG6() {
    }
}
